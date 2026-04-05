package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BuffersKt {
    public static final int coerceAtMostMaxInt(long j10) {
        return (int) Math.min(j10, 2147483647L);
    }

    public static final int coerceAtMostMaxIntOrFail(long j10, String message) {
        e0.checkNotNullParameter(message, "message");
        if (j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException(message);
    }

    public static final ChunkBuffer copyAll(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        ChunkBuffer chunkBufferDuplicate = chunkBuffer.duplicate();
        ChunkBuffer next = chunkBuffer.getNext();
        return next == null ? chunkBufferDuplicate : copyAll(next, chunkBufferDuplicate, chunkBufferDuplicate);
    }

    public static final ChunkBuffer findTail(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        while (true) {
            ChunkBuffer next = chunkBuffer.getNext();
            if (next == null) {
                return chunkBuffer;
            }
            chunkBuffer = next;
        }
    }

    public static final void forEachChunk(ChunkBuffer chunkBuffer, l block) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        do {
            block.invoke(chunkBuffer);
            chunkBuffer = chunkBuffer.getNext();
        } while (chunkBuffer != null);
    }

    public static final boolean isEmpty(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        while (chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition() <= 0) {
            chunkBuffer = chunkBuffer.getNext();
            if (chunkBuffer == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: peekTo-yRinSxo, reason: not valid java name */
    public static final long m4492peekToyRinSxo(Buffer peekTo, ByteBuffer destination, long j10, long j11, long j12) {
        e0.checkNotNullParameter(peekTo, "$this$peekTo");
        e0.checkNotNullParameter(destination, "destination");
        long jMin = Math.min(destination.limit() - j10, Math.min(j12, peekTo.getWritePosition() - peekTo.getReadPosition()));
        Memory.m4316copyToJT6ljtQ(peekTo.m4458getMemorySK3TCg8(), destination, peekTo.getReadPosition() + j11, jMin, j10);
        return jMin;
    }

    public static final byte[] readBytes(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        if (i10 == 0) {
            return UnsafeKt.EmptyByteArray;
        }
        byte[] bArr = new byte[i10];
        BufferPrimitivesKt.readFully$default(buffer, bArr, 0, 0, 6, (Object) null);
        return bArr;
    }

    public static /* synthetic */ byte[] readBytes$default(Buffer buffer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = buffer.getWritePosition() - buffer.getReadPosition();
        }
        return readBytes(buffer, i10);
    }

    public static final void releaseAll(ChunkBuffer chunkBuffer, ObjectPool<ChunkBuffer> pool) {
        e0.checkNotNullParameter(pool, "pool");
        while (chunkBuffer != null) {
            ChunkBuffer chunkBufferCleanNext = chunkBuffer.cleanNext();
            chunkBuffer.release(pool);
            chunkBuffer = chunkBufferCleanNext;
        }
    }

    public static final long remainingAll(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return remainingAll(chunkBuffer, 0L);
    }

    private static final long remainingAll(ChunkBuffer chunkBuffer, long j10) {
        do {
            j10 += chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
            chunkBuffer = chunkBuffer.getNext();
        } while (chunkBuffer != null);
        return j10;
    }

    private static final ChunkBuffer copyAll(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2, ChunkBuffer chunkBuffer3) {
        while (true) {
            ChunkBuffer chunkBufferDuplicate = chunkBuffer.duplicate();
            chunkBuffer3.setNext(chunkBufferDuplicate);
            chunkBuffer = chunkBuffer.getNext();
            if (chunkBuffer == null) {
                return chunkBuffer2;
            }
            chunkBuffer3 = chunkBufferDuplicate;
        }
    }
}
