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


/**
 *
 * @param Uid
 * @param Username
 * @param Token
 * @param TokenValidUntil
 */
@Serializable
data class AuthenticationResponse(
        val Uid: kotlin.String? = null,
        val Username: kotlin.String? = null,
        val Token: kotlin.String? = null,
        @Serializable(with = LocalDateTimeSerializer::class)
        val TokenValidUntil: java.time.LocalDateTime? = null
) {

}

