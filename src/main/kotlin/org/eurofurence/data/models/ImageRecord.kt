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
 * @param InternalReference
 * @param Width
 * @param Height
 * @param SizeInBytes
 * @param MimeType
 * @param ContentHashSha1
 */
@Serializable
data class ImageRecord(
        @Serializable(with = LocalDateTimeSerializer::class)
        val LastChangeDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = UUIDSerializer::class)
        val Id: java.util.UUID,
        val InternalReference: kotlin.String,
        val Width: kotlin.Int,
        val Height: kotlin.Int,
        val SizeInBytes: kotlin.Long,
        val MimeType: kotlin.String,
        val ContentHashSha1: kotlin.String
) {

}

