package org.eurofurence.data.auth

import org.eurofurence.data.infrastructure.ApiClient
import org.eurofurence.data.infrastructure.RequestConfig


interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     */
    fun apply(requestConfig: RequestConfig): RequestConfig
}

inline fun <T : ApiClient, R> Authentication.setFor(api: T, block: T.() -> R) {
    // Store original authentication and replace with current binding
    val original = api.authentication.get()
    api.authentication.set(this)

    // Execute the given block
    api.block()

    // Restore the authentication
    api.authentication.set(original)
}
