package org.eurofurence.util

import java.io.File

/**
 * Runs a file-to-file transformation and after completion copies the content of the target file to the source and
 * deletes the target.
 */
inline fun <R> File.transform(block: (File, File) -> R): R {
    val temp = createTempFile(directory = parentFile)
    try {
        return block(this, temp)
    } finally {
        temp.copyTo(this, true)
        temp.delete()
    }
}