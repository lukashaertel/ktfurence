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
package org.eurofurence.data.apis

import org.eurofurence.data.infrastructure.*
import org.eurofurence.data.models.EventConferenceDayRecord

class EventConferenceDaysApi(basePath: kotlin.String = "https://localhost") : ApiClient(basePath) {

    /**
     * Retrieve a single event conference day in the event schedule.
     *
     * @param id id of the requested entity
     * @return EventConferenceDayRecord
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV2EventConferenceDaysByIdGet(id: java.util.UUID): EventConferenceDayRecord {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/Api/v2/EventConferenceDays/{Id}".replace("{" + "Id" + "}", "$id"),
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<EventConferenceDayRecord>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as EventConferenceDayRecord
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException(response.statusCode, (response as ClientError<*>).body as? String
                    ?: "Client error")
            ResponseType.ServerError -> throw ServerException(response.statusCode, (response as ServerError<*>).message
                    ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
     * Retrieves a list of all event conference days in the event schedule.
     *
     * @return kotlin.Array<EventConferenceDayRecord>
     */
    @Suppress("UNCHECKED_CAST")
    fun apiV2EventConferenceDaysGet(): kotlin.Array<EventConferenceDayRecord> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/Api/v2/EventConferenceDays",
                query = localVariableQuery,
                headers = localVariableHeaders
        )
        val response = request<kotlin.Array<EventConferenceDayRecord>>(
                localVariableConfig,
                localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<EventConferenceDayRecord>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException(response.statusCode, (response as ClientError<*>).body as? String
                    ?: "Client error")
            ResponseType.ServerError -> throw ServerException(response.statusCode, (response as ServerError<*>).message
                    ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
