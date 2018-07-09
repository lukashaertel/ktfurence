package org.eurofurence.serial

import kotlinx.serialization.*
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeParseException

@Serializer(forClass = LocalDateTime::class)
object LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    override val serialClassDesc: KSerialClassDesc
        get() = object : KSerialClassDesc {
            override val kind: KSerialClassKind
                get() = KSerialClassKind.CLASS
            override val name: String
                get() = "java.time.LocalDateTime"

            override fun getElementIndex(name: String): Int {
                return -1
            }

            override fun getElementName(index: Int): String {
                throw IllegalArgumentException()
            }
        }

    override fun load(input: KInput): LocalDateTime {
        val string = input.readStringValue()
        return try {
            ZonedDateTime.parse(string).toLocalDateTime()
        } catch (_: DateTimeParseException) {
            ZonedDateTime.parse(string + "Z").toLocalDateTime()
        }
    }

    override fun save(output: KOutput, obj: LocalDateTime) {
        output.writeStringValue(obj.atZone(ZoneOffset.UTC).toString())
    }
}