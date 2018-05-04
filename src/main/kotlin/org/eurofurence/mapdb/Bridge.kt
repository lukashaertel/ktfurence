package org.eurofurence.mapdb

import kotlinx.serialization.*
import org.mapdb.DataInput2
import org.mapdb.DataOutput2
import org.mapdb.Serializer as MapDBSerializer
import kotlin.reflect.KClass


class DataBinaryNullableOutput(val out: DataOutput2) : ElementValueOutput() {
    override fun writeNullValue() = out.writeByte(0)
    override fun writeNotNullMark() = out.writeByte(1)
    override fun writeBooleanValue(value: Boolean) = out.writeByte(if (value) 1 else 0)
    override fun writeByteValue(value: Byte) = out.writeByte(value.toInt())
    override fun writeShortValue(value: Short) = out.writeShort(value.toInt())
    override fun writeIntValue(value: Int) = out.writeInt(value)
    override fun writeLongValue(value: Long) = out.writeLong(value)
    override fun writeFloatValue(value: Float) = out.writeFloat(value)
    override fun writeDoubleValue(value: Double) = out.writeDouble(value)
    override fun writeCharValue(value: Char) = out.writeChar(value.toInt())
    override fun writeStringValue(value: String) = out.writeUTF(value)
    override fun <T : Enum<T>> writeEnumValue(enumClass: KClass<T>, value: T) = out.writeInt(value.ordinal)
}

class DataBinaryNullableInput(val inp: DataInput2) : ElementValueInput() {
    override fun readNotNullMark(): Boolean = inp.readByte() != 0.toByte()
    override fun readBooleanValue(): Boolean = inp.readByte().toInt() != 0
    override fun readByteValue(): Byte = inp.readByte()
    override fun readShortValue(): Short = inp.readShort()
    override fun readIntValue(): Int = inp.readInt()
    override fun readLongValue(): Long = inp.readLong()
    override fun readFloatValue(): Float = inp.readFloat()
    override fun readDoubleValue(): Double = inp.readDouble()
    override fun readCharValue(): Char = inp.readChar()
    override fun readStringValue(): String = inp.readUTF()
    override fun <T : Enum<T>> readEnumValue(enumClass: KClass<T>): T = enumClass.java.enumConstants[inp.readInt()]
}

/**
 * Use the given Kotlin serializer.
 */
fun <T : Any> useSerializer(block: () -> KSerializer<T>) = object : MapDBSerializer<T> {
    val serializer by lazy { block() }

    override fun serialize(out: DataOutput2, value: T) {
        serializer.save(DataBinaryNullableOutput(out), value)
    }

    override fun deserialize(input: DataInput2, available: Int): T {
        return serializer.load(DataBinaryNullableInput(input))
    }
}

/**
 * Obtain the Kotlin serializer from the reiifed
 */
inline fun <reified T : Any> findSerializer() =
        useSerializer { T::class.serializer() }