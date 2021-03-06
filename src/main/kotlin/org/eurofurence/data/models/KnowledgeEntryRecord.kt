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
import org.eurofurence.serial.UUIDsSerializer
import java.util.*

/**
 *
 * @param LastChangeDateTimeUtc
 * @param Id
 * @param KnowledgeGroupId
 * @param Title
 * @param Text
 * @param Order
 * @param Links
 * @param ImageIds
 */
@Serializable
data class KnowledgeEntryRecord(
        @Serializable(with = LocalDateTimeSerializer::class)
        val LastChangeDateTimeUtc: java.time.LocalDateTime,
        @Serializable(with = UUIDSerializer::class)
        val Id: java.util.UUID,
        @Serializable(with = UUIDSerializer::class)
        val KnowledgeGroupId: java.util.UUID,
        val Title: kotlin.String,
        val Text: kotlin.String,
        val Order: kotlin.Int,
        val Links: kotlin.Array<LinkFragment>? = null,
        @Serializable(with = UUIDsSerializer::class)
        val ImageIds: kotlin.Array<java.util.UUID>? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KnowledgeEntryRecord

        if (LastChangeDateTimeUtc != other.LastChangeDateTimeUtc) return false
        if (Id != other.Id) return false
        if (KnowledgeGroupId != other.KnowledgeGroupId) return false
        if (Title != other.Title) return false
        if (Text != other.Text) return false
        if (Order != other.Order) return false
        if (!Arrays.equals(Links, other.Links)) return false
        if (!Arrays.equals(ImageIds, other.ImageIds)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = LastChangeDateTimeUtc.hashCode()
        result = 31 * result + Id.hashCode()
        result = 31 * result + KnowledgeGroupId.hashCode()
        result = 31 * result + Title.hashCode()
        result = 31 * result + Text.hashCode()
        result = 31 * result + Order
        result = 31 * result + (Links?.let { Arrays.hashCode(it) } ?: 0)
        result = 31 * result + (ImageIds?.let { Arrays.hashCode(it) } ?: 0)
        return result
    }

}

