package io.ktor.util;

import a.b;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.internal.jvm.ErrorsKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.e0;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BufferViewJvmKt {
    public static final int read(ReadableByteChannel readableByteChannel, ChunkBuffer buffer) throws IOException {
        e0.checkNotNullParameter(readableByteChannel, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        if (buffer.getLimit() - buffer.getWritePosition() == 0) {
            return 0;
        }
        int limit = buffer.getLimit() - buffer.getWritePosition();
        if (1 > limit) {
            throw new IllegalArgumentException(b.e(limit, "size 1 is greater than buffer's remaining capacity ").toString());
        }
        ByteBuffer byteBufferDuplicate = buffer.m4458getMemorySK3TCg8().duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        int writePosition = buffer.getWritePosition();
        byteBufferDuplicate.limit(buffer.getLimit());
        byteBufferDuplicate.position(writePosition);
        int i10 = readableByteChannel.read(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - writePosition;
        if (iPosition < 0 || iPosition > limit) {
            ErrorsKt.wrongBufferPositionChangeError(iPosition, 1);
            throw new k();
        }
        buffer.commitWritten(iPosition);
        return i10;
    }

    @InternalAPI
    public static final int write(WritableByteChannel writableByteChannel, ChunkBuffer buffer) throws IOException {
        e0.checkNotNullParameter(writableByteChannel, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer byteBufferDuplicate = buffer.m4458getMemorySK3TCg8().duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.limit(writePosition);
        byteBufferDuplicate.position(readPosition);
        int iWrite = writableByteChannel.write(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - readPosition;
        if (iPosition < 0) {
            ErrorsKt.negativeShiftError(iPosition);
            throw new k();
        }
        if (byteBufferDuplicate.limit() == writePosition) {
            buffer.discardExact(iPosition);
            return iWrite;
        }
        ErrorsKt.limitChangeError();
        throw new k();
    }
}
