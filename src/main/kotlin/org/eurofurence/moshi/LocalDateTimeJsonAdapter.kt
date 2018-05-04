package org.eurofurence.moshi

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

class LocalDateTimeJsonAdapter : JsonAdapter<LocalDateTime>() {

    override fun fromJson(reader: JsonReader): LocalDateTime? {
        val string = reader.nextString()
        return try {
            ZonedDateTime.parse(string).toLocalDateTime()
        } catch (_: DateTimeParseException) {
            ZonedDateTime.parse(string + "Z").toLocalDateTime()
        }
    }

    override fun toJson(writer: JsonWriter, value: LocalDateTime?) {
        writer.value(value!!.atZone(ZoneOffset.UTC).toString())
    }
}