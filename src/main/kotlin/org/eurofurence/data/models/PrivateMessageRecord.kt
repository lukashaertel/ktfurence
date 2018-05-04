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
 * @param RecipientUid
 * @param CreatedDateTimeUtc
 * @param ReceivedDateTimeUtc
 * @param ReadDateTimeUtc
 * @param AuthorName
 * @param Subject
 * @param Message
 */
@Serializable
data class PrivateMessageRecord(
        @Serializable(with = LocalDateTimeSerializer::class)
        val LastChangeDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = UUIDSerializer::class)
        val Id: java.util.UUID,
        val RecipientUid: kotlin.String,
        @Serializable(with = LocalDateTimeSerializer::class)
        val CreatedDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = LocalDateTimeSerializer::class)
        val ReceivedDateTimeUtc: java.time.LocalDateTime? = null,
        @Serializable(with = LocalDateTimeSerializer::class)
        val ReadDateTimeUtc: java.time.LocalDateTime? = null,
        val AuthorName: kotlin.String? = null,
        val Subject: kotlin.String? = null,
        val Message: kotlin.String? = null
) {

}

