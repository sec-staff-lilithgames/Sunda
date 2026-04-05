package io.ktor.utils.io.core;

import b0.e2;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.internal.jvm.ErrorsKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.k;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BufferUtilsJvmKt {
    public static final ChunkBuffer ChunkBuffer(ByteBuffer buffer, ObjectPool<ChunkBuffer> objectPool) {
        e0.checkNotNullParameter(buffer, "buffer");
        Memory.Companion companion = Memory.Companion;
        ByteBuffer byteBufferOrder = buffer.slice().order(java.nio.ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        return new ChunkBuffer(Memory.m4314constructorimpl(byteBufferOrder), null, objectPool, null);
    }

    public static /* synthetic */ ChunkBuffer ChunkBuffer$default(ByteBuffer byteBuffer, ObjectPool objectPool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            objectPool = null;
        }
        return ChunkBuffer(byteBuffer, objectPool);
    }

    public static final int readAvailable(Buffer buffer, ByteBuffer dst, int i10) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        if (buffer.getWritePosition() <= buffer.getReadPosition()) {
            return -1;
        }
        int iMin = Math.min(buffer.getWritePosition() - buffer.getReadPosition(), i10);
        readFully(buffer, dst, iMin);
        return iMin;
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = byteBuffer.remaining();
        }
        return readAvailable(buffer, byteBuffer, i10);
    }

    public static final int readDirect(ChunkBuffer chunkBuffer, l block) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        int readPosition = chunkBuffer.getReadPosition();
        int writePosition = chunkBuffer.getWritePosition();
        ByteBuffer byteBufferDuplicate = chunkBuffer.m4458getMemorySK3TCg8().duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.limit(writePosition);
        byteBufferDuplicate.position(readPosition);
        block.invoke(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - readPosition;
        if (iPosition < 0) {
            ErrorsKt.negativeShiftError(iPosition);
            throw new k();
        }
        if (byteBufferDuplicate.limit() == writePosition) {
            chunkBuffer.discardExact(iPosition);
            return iPosition;
        }
        ErrorsKt.limitChangeError();
        throw new k();
    }

    public static final void readFully(Buffer buffer, ByteBuffer dst, int i10) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < i10) {
            throw new EOFException(e2.h('.', "Not enough bytes to read a buffer content of size ", i10));
        }
        int iLimit = dst.limit();
        try {
            dst.limit(dst.position() + i10);
            MemoryJvmKt.m4331copyTo62zg_DM(byteBufferM4458getMemorySK3TCg8, dst, readPosition);
            dst.limit(iLimit);
            buffer.discardExact(i10);
        } catch (Throwable th2) {
            dst.limit(iLimit);
            throw th2;
        }
    }

    public static final void resetFromContentToWrite(ChunkBuffer chunkBuffer, ByteBuffer child) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(child, "child");
        chunkBuffer.resetForWrite(child.limit());
        chunkBuffer.commitWrittenUntilIndex(child.position());
    }

    public static final int writeDirect(ChunkBuffer chunkBuffer, int i10, l block) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        int limit = chunkBuffer.getLimit() - chunkBuffer.getWritePosition();
        if (i10 > limit) {
            throw new IllegalArgumentException(i.a(i10, limit, "size ", " is greater than buffer's remaining capacity ").toString());
        }
        ByteBuffer byteBufferDuplicate = chunkBuffer.m4458getMemorySK3TCg8().duplicate();
        e0.checkNotNull(byteBufferDuplicate);
        int writePosition = chunkBuffer.getWritePosition();
        byteBufferDuplicate.limit(chunkBuffer.getLimit());
        byteBufferDuplicate.position(writePosition);
        block.invoke(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - writePosition;
        if (iPosition < 0 || iPosition > limit) {
            ErrorsKt.wrongBufferPositionChangeError(iPosition, i10);
            throw new k();
        }
        chunkBuffer.commitWritten(iPosition);
        return iPosition;
    }

    public static /* synthetic */ int writeDirect$default(Buffer buffer, int i10, l block, int i11, Object obj) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, writePosition, limit);
        block.invoke(byteBufferM4324slice87lwejk);
        if (byteBufferM4324slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        int iPosition = byteBufferM4324slice87lwejk.position();
        buffer.commitWritten(iPosition);
        return iPosition;
    }

    public static final int readDirect(Buffer buffer, l block) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition() - readPosition;
        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, readPosition, writePosition);
        block.invoke(byteBufferM4324slice87lwejk);
        if (byteBufferM4324slice87lwejk.limit() == writePosition) {
            int iPosition = byteBufferM4324slice87lwejk.position();
            buffer.discardExact(iPosition);
            return iPosition;
        }
        throw new IllegalStateException("Buffer's limit change is not allowed");
    }

    public static final int writeDirect(Buffer buffer, int i10, l block) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, writePosition, limit);
        block.invoke(byteBufferM4324slice87lwejk);
        if (byteBufferM4324slice87lwejk.limit() == limit) {
            int iPosition = byteBufferM4324slice87lwejk.position();
            buffer.commitWritten(iPosition);
            return iPosition;
        }
        throw new IllegalStateException("Buffer's limit change is not allowed");
    }
}
