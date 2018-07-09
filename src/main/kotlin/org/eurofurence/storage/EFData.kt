package org.eurofurence.storage


import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.internal.StringSerializer
import kotlinx.serialization.serializer
import org.eurofurence.data.apis.*
import org.eurofurence.data.infrastructure.ApiClient
import org.eurofurence.data.models.*
import org.eurofurence.serial.UUIDSerializer
import java.io.File
import java.time.LocalDateTime
import java.util.*

class EFData(val endpoint: String, val root: File) {
    companion object {
        init {
            LocalDateTime::class
            UUID::class
        }
    }

    /**
     * Creates a lazy binding to a data operation. TODO: Refresh ops.
     */
    private inline fun <E : ApiClient, reified T : Any> bind(
            noinline connect: (String) -> E,
            noinline list: (E) -> Array<T>,
            noinline id: (T) -> UUID): Lazy<Store<UUID, T>> = lazy {
        // Initialize a data store on the type and name
        FileStore(File(root.apply { mkdirs() }, T::class.simpleName + ".db"),
                UUIDSerializer, T::class.serializer()).apply {
            if (meta().set("initialized", true) != true)
                setAll(list(connect(endpoint)).associateBy(id))
        }

    }

    /**
     * Group level meta data.
     */
    val meta = FileStore(File(root, "meta.db"), StringSerializer, PolymorphicSerializer)

    /**
     * Announcements stored in the database or given by the endpoint.
     */
    val announcements by bind(::AnnouncementsApi, AnnouncementsApi::apiV2AnnouncementsGet, AnnouncementRecord::Id)

    /**
     * Dealers stored in the database or given by the endpoint.
     */
    val dealers by bind(::DealersApi, DealersApi::apiV2DealersGet, DealerRecord::Id)


    /**
     * Resolves the artist thumbnail image.
     */
    val DealerRecord.ArtistThumbnailImage get() = images[ArtistThumbnailImageId]

    /**
     * Resolves the artists image.
     */
    val DealerRecord.ArtistImage get() = images[ArtistImageId]

    /**
     * Resolves the art preview image.
     */
    val DealerRecord.ArtPreviewImage get() = images[ArtPreviewImageId]


    /**
     * Days stored in the database or given by the endpoint.
     */
    val days by bind(::EventConferenceDaysApi, EventConferenceDaysApi::apiV2EventConferenceDaysGet, EventConferenceDayRecord::Id)

    /**
     * Rooms stored in the database or given by the endpoint.
     */
    val rooms by bind(::EventConferenceRoomsApi, EventConferenceRoomsApi::apiV2EventConferenceRoomsGet, EventConferenceRoomRecord::Id)

    /**
     * Tracks stored in the database or given by the endpoint.
     */
    val tracks by bind(::EventConferenceTracksApi, EventConferenceTracksApi::apiV2EventConferenceTracksGet, EventConferenceTrackRecord::Id)

    /**
     * Events stored in the database or given by the endpoint.
     */
    val events by bind(::EventsApi, EventsApi::apiV2EventsGet, EventRecord::Id)


    /**
     * Resolves the event conference day.
     */
    val EventRecord.ConferenceDay get() = days[ConferenceDayId]

    /**
     * Resolves the event conference day.
     */
    val EventRecord.ConferenceRoom get() = rooms[ConferenceRoomId]

    /**
     * Resolves the event conference track.
     */
    val EventRecord.ConferenceTrack get() = tracks[ConferenceTrackId]

    /**
     * Resolves the banner image.
     */
    val EventRecord.BannerImage get() = images[BannerImageId]

    /**
     * Resolves the poster image.
     */
    val EventRecord.PosterImage get() = images[PosterImageId]

    /**
     * Images stored in the database or given by the endpoint.
     */
    val images by bind(::ImagesApi, ImagesApi::apiV2ImagesGet, ImageRecord::Id)

    /**
     * Knowledge stored in the database or given by the endpoint.
     */
    val knowledgeEntries by bind(::KnowledgeEntriesApi, KnowledgeEntriesApi::apiV2KnowledgeEntriesGet, KnowledgeEntryRecord::Id)

    /**
     * Resolves the knowledge group.
     */
    val KnowledgeEntryRecord.KnowledgeGroup get() = knowledgeGroups[KnowledgeGroupId]

    /**
     * Resolves the images.
     */
    val KnowledgeEntryRecord.Images get() = ImageIds?.mapNotNull { images[it] }

    /**
     * Knowledge groups stored in the database or given by the endpoint.
     */
    val knowledgeGroups by bind(::KnowledgeGroupsApi, KnowledgeGroupsApi::apiV2KnowledgeGroupsGet, KnowledgeGroupRecord::Id)

    /**
     * Maps stored in the database or given by the endpoint.
     */
    val maps by bind(::MapsApi, MapsApi::apiV2MapsGet, MapRecord::Id)

    /**
     * Resolves the map image.
     */
    val MapRecord.Image get() = images[ImageId]

    /**
     * Updates one store with the given definition.
     */
    private fun <D, E> updatePart(target: Store<UUID, E>, source: D?,
                                  removeAll: (D) -> Boolean?,
                                  deletedEntries: (D) -> Array<UUID>?,
                                  changedEntries: (D) -> Array<E>?,
                                  id: (E) -> UUID) {
        source?.let {
            // Full reset required, clear file.
            if (removeAll(it) == true)
                target.clear()

            // Compute proper sets and maps from the input.
            val del = deletedEntries(it)?.toSet() ?: emptySet()
            val mod = changedEntries(it)?.associateBy(id) ?: emptyMap()

            // If there is a change, apply it.
            if (del.isNotEmpty() || mod.isNotEmpty())
                target.updateOrDrop { k, v ->
                    if (k in del) null else mod[k] ?: v
                }
        }
    }

    /**
     * Applies an aggregated update.
     */
    fun update(delta: AggregatedDeltaResponse) {
        updatePart(announcements, delta.Announcements,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(dealers, delta.Dealers,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(days, delta.EventConferenceDays,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(rooms, delta.EventConferenceRooms,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(tracks, delta.EventConferenceTracks,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(images, delta.Images,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(knowledgeEntries, delta.KnowledgeEntries,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(knowledgeGroups, delta.KnowledgeGroups,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })
        updatePart(maps, delta.Maps,
                { it.RemoveAllBeforeInsert }, { it.DeletedEntities }, { it.ChangedEntities }, { it.Id })

        meta["CurrentDateTimeUtc"] = delta.CurrentDateTimeUtc ?: "null"
        meta["Since"] = delta.Since ?: "null"
    }

    /**
     * Gets the last Date Time UTC from the server or null.
     */
    val CurrentDateTimeUtc get() = meta["CurrentDateTimeUtc"] as? LocalDateTime

    /**
     * Gets the last Since from the server or null.
     */
    val Since get() = meta["Since"] as? LocalDateTime

    /**
     * Updates the data with the given status
     */
    fun update() {
        val delta = SyncApi(endpoint).apiV2SyncGet(CurrentDateTimeUtc ?: LocalDateTime.of(1970, 1, 1, 0, 0))
        update(delta)
    }
}

fun main(args: Array<String>) {
    EFData("https://app.eurofurence.org:40000", File("efdata")).apply {
        update()

        events.values().forEach {
            println(it.toString().replace(", ", "\n\t"))
        }

        maps.values().forEach {
            println(it.Description)
            println(it.Id)
            println(it.Image)
            println(it.IsBrowseable)
            for (e in it.Entries) {
                println("  " + e.Id)
                for (l in e.Links ?: emptyArray()) {
                    println("    " + l.FragmentType)
                    println("    " + l.Name)
                    println("    " + l.Target)
                }
                println("  " + e.TapRadius)
                println("  " + e.X)
                println("  " + e.Y)
            }
            println()
        }
    }
}