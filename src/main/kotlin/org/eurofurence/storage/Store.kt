package org.eurofurence.storage


import org.eurofurence.data.apis.*
import org.eurofurence.data.infrastructure.ApiClient
import org.eurofurence.data.models.*
import org.eurofurence.mapdb.findSerializer
import org.mapdb.*
import java.io.File
import java.util.*
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

inline fun <reified E : Any> DB.store(label: String? = null) =
        hashMap(label ?: E::class.simpleName ?: error("No label specified"))
                .keySerializer(Serializer.UUID)
                .valueSerializer(findSerializer<E>())

class Store(val endpoint: String, file: File) {
    val db by lazy {
        DBMaker.fileDB(file).fileMmapEnableIfSupported().make()
    }

    private inline fun <E : ApiClient, reified T : Any> bind(
            noinline connect: (String) -> E,
            noinline list: (E) -> Array<T>,
            noinline id: (T) -> UUID): Lazy<HTreeMap<UUID, T>> = lazy {
        // Initialize a data store on the type and name
        db.store<T>("${T::class.simpleName}-data").createOrOpen().also {
            // If init flag is not set, list and associate
            if (!db.atomicBoolean("${T::class.simpleName}-init").createOrOpen().getAndSet(true))
                list(connect(endpoint)).associateByTo(it, id)
        }
    }

    val announcements by bind(::AnnouncementsApi, AnnouncementsApi::apiV2AnnouncementsGet, AnnouncementRecord::Id)

    val dealers by bind(::DealersApi, DealersApi::apiV2DealersGet, DealerRecord::Id)

    val days by bind(::EventConferenceDaysApi, EventConferenceDaysApi::apiV2EventConferenceDaysGet, EventConferenceDayRecord::Id)

    val rooms by bind(::EventConferenceRoomsApi, EventConferenceRoomsApi::apiV2EventConferenceRoomsGet, EventConferenceRoomRecord::Id)

    val tracks by bind(::EventConferenceTracksApi, EventConferenceTracksApi::apiV2EventConferenceTracksGet, EventConferenceTrackRecord::Id)

    val events by bind(::EventsApi, EventsApi::apiV2EventsGet, EventRecord::Id)

    val images by bind(::ImagesApi, ImagesApi::apiV2ImagesGet, ImageRecord::Id)

    val knowledgeEntries by bind(::KnowledgeEntriesApi, KnowledgeEntriesApi::apiV2KnowledgeEntriesGet, KnowledgeEntryRecord::Id)

    val knowledgeGroups by bind(::KnowledgeGroupsApi, KnowledgeGroupsApi::apiV2KnowledgeGroupsGet, KnowledgeGroupRecord::Id)

    val maps by bind(::MapsApi, MapsApi::apiV2MapsGet, MapRecord::Id)

    val EventRecord.ConferenceDay get() = days[ConferenceDayId]
    val EventRecord.ConferenceRoom get() = rooms[ConferenceRoomId]
    val EventRecord.ConferenceTrack get() = tracks[ConferenceTrackId]
    val EventRecord.BannerImage get() = images[BannerImageId]
    val EventRecord.PosterImage get() = images[PosterImageId]
}

fun main(args: Array<String>) {
    Store("https://app.eurofurence.org:40000", File("ef.db")).apply {
        events.forEachValue {
            println(it.Title)
            println(it.ConferenceDay?.Name)
            println(it.ConferenceRoom?.Name)
            println(it.ConferenceTrack?.Name)
            println()
        }

        db.close()
    }
}