package org.eurofurence.util

import java.util.*

fun base64Encode(byteArray: ByteArray) =
        Base64.getEncoder().encodeToString(byteArray)

fun base64Encode(string: String) =
        base64Encode(string.toByteArray())