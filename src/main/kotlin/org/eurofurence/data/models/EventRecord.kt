/**
 * Eurofurence API for Mobile Apps
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package org.eurofurence.data.models

import kotlinx.serialization.Serializable
import org.eurofurence.serial.LocalDateTimeSerializer
import org.eurofurence.serial.UUIDSerializer


/**
 *
 * @param LastChangeDateTimeUtc
 * @param Id
 * @param Slug
 * @param Title
 * @param SubTitle
 * @param Abstract
 * @param ConferenceDayId
 * @param ConferenceTrackId
 * @param ConferenceRoomId
 * @param Description
 * @param Duration
 * @param StartTime
 * @param EndTime
 * @param StartDateTimeUtc
 * @param EndDateTimeUtc
 * @param PanelHosts
 * @param IsDeviatingFromConBook
 * @param BannerImageId If set, refers to a banner ([3-4]:1 aspect ratio) that can be used when little  vertical space is available (e.G. event schedule, or a header section).
 * @param PosterImageId If set, refers to an image of any aspect ratio that should be used where enough  vertical space is available (e.G. event detail).
 */
@Serializable
data class EventRecord(
        @Serializable(with = LocalDateTimeSerializer::class)
        val LastChangeDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = UUIDSerializer::class)
        val Id: java.util.UUID,
        val Slug: kotlin.String? = null,
        val Title: kotlin.String? = null,
        val SubTitle: kotlin.String? = null,
        val Abstract: kotlin.String? = null,
        @Serializable(with = UUIDSerializer::class)
        val ConferenceDayId: java.util.UUID? = null,
        @Serializable(with = UUIDSerializer::class)
        val ConferenceTrackId: java.util.UUID? = null,
        @Serializable(with = UUIDSerializer::class)
        val ConferenceRoomId: java.util.UUID? = null,
        val Description: kotlin.String? = null,
        val Duration: kotlin.String? = null,
        val StartTime: kotlin.String? = null,
        val EndTime: kotlin.String? = null,
        @Serializable(with = LocalDateTimeSerializer::class)
        val StartDateTimeUtc: java.time.LocalDateTime? = null,
        @Serializable(with = LocalDateTimeSerializer::class)
        val EndDateTimeUtc: java.time.LocalDateTime? = null,
        val PanelHosts: kotlin.String? = null,
        val IsDeviatingFromConBook: kotlin.Boolean? = null,
        /* If set, refers to a banner ([3-4]:1 aspect ratio) that can be used when little  vertical space is available (e.G. event schedule, or a header section). */
        @Serializable(with = UUIDSerializer::class)
        val BannerImageId: java.util.UUID? = null,
        /* If set, refers to an image of any aspect ratio that should be used where enough  vertical space is available (e.G. event detail). */
        @Serializable(with = UUIDSerializer::class)
        val PosterImageId: java.util.UUID? = null
) {

}

