package org.eurofurence.serial

import kotlinx.serialization.*
import kotlinx.serialization.internal.ArrayClassDesc
import kotlinx.serialization.internal.ReferenceArraySerializer
import java.util.*


@Serializer(forClass = Array<UUID>::class)
object UUIDsSerializer : KSerializer<Array<UUID>> {
    /**
     * The actual implementation, as top level values may not be annotated with serializer annotations.
     */
    private val by by lazy { ReferenceArraySerializer(UUID::class, UUIDSerializer) }

    override val serialClassDesc: KSerialClassDesc
        get() = by.serialClassDesc

    override fun load(input: KInput) =
            by.load(input)

    override fun save(output: KOutput, obj: Array<UUID>) {
        by.save(output, obj)
    }
}