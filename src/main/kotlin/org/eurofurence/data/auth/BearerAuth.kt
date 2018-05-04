package org.eurofurence.data.auth

import org.eurofurence.data.infrastructure.RequestConfig

class BearerAuth(
        val token: String?) : Authentication {
    override fun apply(requestConfig: RequestConfig): RequestConfig {
        return if (token == null)
            requestConfig
        else
            requestConfig.addHeader("Authorization", "Bearer $token")
    }

}