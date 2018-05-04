package org.eurofurence.data.auth

import org.eurofurence.data.infrastructure.RequestConfig

class ApiKeyAuth(
        val location: String,
        val paramName: String,
        val apiKey: String? = null,
        val apiKeyPrefix: String? = null) : Authentication {
    override fun apply(requestConfig: RequestConfig): RequestConfig {
        // No API key, do not apply anything
        if (apiKey == null)
            return requestConfig

        // Compute value, optionally prepending prefix
        val value = if (apiKeyPrefix != null)
            apiKeyPrefix + " " + apiKey
        else
            apiKey

        // Modify query or headers respectively.
        return when (location) {
            "query" -> requestConfig.addQuery(paramName, value)
            "header" -> requestConfig.addHeader(paramName, value)
            else -> throw IllegalArgumentException("$location is not a valid location.")
        }
    }
}