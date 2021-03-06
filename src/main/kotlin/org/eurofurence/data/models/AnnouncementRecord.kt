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
 * @param ValidFromDateTimeUtc
 * @param ValidUntilDateTimeUtc
 * @param Area
 * @param Author
 * @param Title
 * @param Content
 */
@Serializable
data class AnnouncementRecord(
        @Serializable(with = LocalDateTimeSerializer::class)
        val LastChangeDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = UUIDSerializer::class)
        val Id: java.util.UUID,
        @Serializable(with = LocalDateTimeSerializer::class)
        val ValidFromDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = LocalDateTimeSerializer::class)
        val ValidUntilDateTimeUtc: java.time.LocalDateTime,
        val Area: kotlin.String,
        val Author: kotlin.String,
        val Title: kotlin.String,
        val Content: kotlin.String
) {

}

