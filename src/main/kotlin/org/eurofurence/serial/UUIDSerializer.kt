package org.eurofurence.serial

import kotlinx.serialization.*
import java.util.*


@Serializer(forClass = UUID::class)
object UUIDSerializer : KSerializer<UUID> {
    override val serialClassDesc: KSerialClassDesc
        get() = object : KSerialClassDesc {
            override val kind: KSerialClassKind
                get() = KSerialClassKind.CLASS
            override val name: String
                get() = UUID::class.simpleName ?: error("Class error")

            override fun getElementIndex(name: String): Int {
                return -1
            }

            override fun getElementName(index: Int): String {
                throw IllegalArgumentException()
            }
        }

    override fun load(input: KInput): UUID {
        val mostSignificantBits = input.readLongValue()
        val leastSignificantBits = input.readLongValue()
        return UUID(mostSignificantBits, leastSignificantBits)
    }

    override fun save(output: KOutput, obj: UUID) {
        output.writeLongValue(obj.mostSignificantBits)
        output.writeLongValue(obj.leastSignificantBits)
    }

}