package org.eurofurence.moshi

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.util.*

class UUIDJsonAdapter : JsonAdapter<UUID>() {
    override fun fromJson(reader: JsonReader): UUID? {
        return UUID.fromString(reader.nextString())
    }

    override fun toJson(writer: JsonWriter, value: UUID?) {
        writer.value(value!!.toString())
    }
}