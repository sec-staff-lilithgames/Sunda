package io.ktor.utils.io.core;

import b0.e2;
import io.ktor.utils.io.bits.MemoryJvmKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BufferPrimitivesJvmKt {
    public static final void readFully(Buffer buffer, ByteBuffer destination) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        int iRemaining = destination.remaining();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < iRemaining) {
            throw new EOFException(e2.h('.', "Not enough bytes to read a buffer content of size ", iRemaining));
        }
        MemoryJvmKt.m4331copyTo62zg_DM(byteBufferM4458getMemorySK3TCg8, destination, readPosition);
        buffer.discardExact(iRemaining);
    }

    public static final void writeFully(Buffer buffer, ByteBuffer source) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < iRemaining) {
            throw new InsufficientSpaceException("buffer content", iRemaining, limit);
        }
        MemoryJvmKt.m4335copyToSG11BkQ(source, byteBufferM4458getMemorySK3TCg8, writePosition);
        buffer.commitWritten(iRemaining);
    }
}
