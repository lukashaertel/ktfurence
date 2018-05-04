package org.eurofurence.data.auth

import org.eurofurence.data.infrastructure.RequestConfig
import org.eurofurence.util.base64Encode


class HttpBasicAuth(
        val username: String? = null,
        val password: String? = null) : Authentication {
    override fun apply(requestConfig: RequestConfig): RequestConfig {
        return requestConfig.addHeader(
                "Authorization",
                "Basic " + base64Encode((username ?: "") + ":" + (password ?: "")))
    }
}