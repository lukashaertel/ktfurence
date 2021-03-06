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


/**
 *
 * @param CollectionCount
 * @param Name
 * @param Rank
 */
@Serializable
data class PlayerScoreboardEntry(
        val CollectionCount: kotlin.Int? = null,
        val Name: kotlin.String? = null,
        val Rank: kotlin.Int? = null
) {

}

