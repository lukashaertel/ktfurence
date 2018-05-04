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
import java.util.*

/**
 *
 * @param Name
 * @param IsBanned
 * @param CollectionCount
 * @param ScoreboardRank
 * @param RecentlyCollected
 */
@Serializable
data class PlayerParticipationInfo(
        val Name: kotlin.String? = null,
        val IsBanned: kotlin.Boolean? = null,
        val CollectionCount: kotlin.Int? = null,
        val ScoreboardRank: kotlin.Int? = null,
        val RecentlyCollected: kotlin.Array<BadgeInfo>? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PlayerParticipationInfo

        if (Name != other.Name) return false
        if (IsBanned != other.IsBanned) return false
        if (CollectionCount != other.CollectionCount) return false
        if (ScoreboardRank != other.ScoreboardRank) return false
        if (!Arrays.equals(RecentlyCollected, other.RecentlyCollected)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = Name?.hashCode() ?: 0
        result = 31 * result + (IsBanned?.hashCode() ?: 0)
        result = 31 * result + (CollectionCount ?: 0)
        result = 31 * result + (ScoreboardRank ?: 0)
        result = 31 * result + (RecentlyCollected?.let { Arrays.hashCode(it) } ?: 0)
        return result
    }

}

