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
 * @param EventId
 * @param AuthorUid
 * @param Rating
 * @param ForwardToPanelist
 * @param Message
 */
@Serializable
data class EventFeedbackRecord(
        @Serializable(with = LocalDateTimeSerializer::class)
        val LastChangeDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = UUIDSerializer::class)
        val Id: java.util.UUID,
        @Serializable(with = UUIDSerializer::class)
        val EventId: java.util.UUID? = null,
        val AuthorUid: kotlin.String? = null,
        val Rating: kotlin.Int? = null,
        val ForwardToPanelist: kotlin.Boolean? = null,
        val Message: kotlin.String? = null
) {

}

