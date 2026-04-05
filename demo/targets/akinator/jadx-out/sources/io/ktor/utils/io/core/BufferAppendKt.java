package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.Memory;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BufferAppendKt {
    public static final int writeBufferAppend(Buffer buffer, Buffer other, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(other.getWritePosition() - other.getReadPosition(), i10);
        if (buffer.getLimit() - buffer.getWritePosition() <= iMin) {
            writeBufferAppendUnreserve(buffer, iMin);
        }
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        buffer.getLimit();
        ByteBuffer byteBufferM4458getMemorySK3TCg82 = other.m4458getMemorySK3TCg8();
        int readPosition = other.getReadPosition();
        other.getWritePosition();
        Memory.m4315copyToJT6ljtQ(byteBufferM4458getMemorySK3TCg82, byteBufferM4458getMemorySK3TCg8, readPosition, iMin, writePosition);
        other.discardExact(iMin);
        buffer.commitWritten(iMin);
        return iMin;
    }

    private static final void writeBufferAppendUnreserve(Buffer buffer, int i10) {
        if ((buffer.getCapacity() - buffer.getLimit()) + (buffer.getLimit() - buffer.getWritePosition()) < i10) {
            throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
        }
        if ((buffer.getWritePosition() + i10) - buffer.getLimit() > 0) {
            buffer.releaseEndGap$ktor_io();
        }
    }

    public static final int writeBufferPrepend(Buffer buffer, Buffer other) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(other, "other");
        int writePosition = other.getWritePosition() - other.getReadPosition();
        int readPosition = buffer.getReadPosition();
        if (readPosition < writePosition) {
            throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
        }
        int i10 = readPosition - writePosition;
        Memory.m4315copyToJT6ljtQ(other.m4458getMemorySK3TCg8(), buffer.m4458getMemorySK3TCg8(), other.getReadPosition(), writePosition, i10);
        other.discardExact(writePosition);
        buffer.releaseStartGap$ktor_io(i10);
        return writePosition;
    }
}
