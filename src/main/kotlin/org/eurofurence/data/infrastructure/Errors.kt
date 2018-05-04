@file:Suppress("unused")

package org.eurofurence.data.infrastructure

import java.lang.RuntimeException

class ClientException(val statusCode: Int, message: String) : RuntimeException("$statusCode: $message") {
    companion object {
        private const val serialVersionUID: Long = 123L
    }
}

class ServerException(val statusCode: Int, message: String) : RuntimeException("$statusCode: $message") {
    companion object {
        private const val serialVersionUID: Long = 456L
    }
}

/**
 * Catches 4XX errors. Returns null if successful.
 */
inline fun catchClient(block: () -> Unit): Int? {
    return try {
        block()
        null
    } catch (e: ClientException) {
        e.statusCode
    }
}

/**
 * Catches 4XX errors. Returns null if successful.
 */
inline fun catchServer(block: () -> Unit): Int? {
    return try {
        block()
        null
    } catch (e: ServerException) {
        e.statusCode
    }
}

/**
 * Catches 5XX errors. Returns null if successful.
 */
inline fun catchStatus(block: () -> Unit): Int? {
    return try {
        block()
        null
    } catch (e: ClientException) {
        e.statusCode
    } catch (e: ServerException) {
        e.statusCode
    }
}
