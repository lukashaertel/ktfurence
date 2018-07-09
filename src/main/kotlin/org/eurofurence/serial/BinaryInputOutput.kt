package org.eurofurence.serial

import kotlinx.serialization.ElementValueInput
import kotlinx.serialization.ElementValueOutput
import java.io.DataInputStream
import java.io.DataOutputStream
import kotlin.reflect.KClass

class BinaryOutput(val output: DataOutputStream) : ElementValueOutput(), AutoCloseable {
    override fun writeNullValue() = output.writeByte(0)
    override fun writeNotNullMark() = output.writeByte(1)
    override fun writeBooleanValue(value: Boolean) = output.writeByte(if (value) 1 else 0)
    override fun writeByteValue(value: Byte) = output.writeByte(value.toInt())
    override fun writeShortValue(value: Short) = output.writeShort(value.toInt())
    override fun writeIntValue(value: Int) = output.writeInt(value)
    override fun writeLongValue(value: Long) = output.writeLong(value)
    override fun writeFloatValue(value: Float) = output.writeFloat(value)
    override fun writeDoubleValue(value: Double) = output.writeDouble(value)
    override fun writeCharValue(value: Char) = output.writeChar(value.toInt())
    override fun writeStringValue(value: String) = output.writeUTF(value)
    override fun <T : Enum<T>> writeEnumValue(enumClass: KClass<T>, value: T) = output.writeInt(value.ordinal)

    override fun close() {
        output.close()
    }
}

class BinaryInput(val input: DataInputStream) : ElementValueInput(), AutoCloseable {
    override fun readNotNullMark(): Boolean = input.readByte() != 0.toByte()
    override fun readBooleanValue(): Boolean = input.readByte().toInt() != 0
    override fun readByteValue(): Byte = input.readByte()
    override fun readShortValue(): Short = input.readShort()
    override fun readIntValue(): Int = input.readInt()
    override fun readLongValue(): Long = input.readLong()
    override fun readFloatValue(): Float = input.readFloat()
    override fun readDoubleValue(): Double = input.readDouble()
    override fun readCharValue(): Char = input.readChar()
    override fun readStringValue(): String = input.readUTF()
    override fun <T : Enum<T>> readEnumValue(enumClass: KClass<T>): T = enumClass.java.enumConstants[input.readInt()]

    override fun close() {
        input.close()
    }
}