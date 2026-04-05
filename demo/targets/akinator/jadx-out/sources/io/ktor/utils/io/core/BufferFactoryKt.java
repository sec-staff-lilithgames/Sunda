package io.ktor.utils.io.core;

import io.ktor.utils.io.bits.DefaultAllocator;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BufferFactoryKt {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final ObjectPool<ChunkBuffer> DefaultChunkedBufferPool = new DefaultBufferPool(0, 0, null, 7, null);

    public static final ObjectPool<ChunkBuffer> getDefaultChunkedBufferPool() {
        return DefaultChunkedBufferPool;
    }

    public static final <R> R withBuffer(int i10, l block) {
        e0.checkNotNullParameter(block, "block");
        return (R) block.invoke(new Buffer(DefaultAllocator.INSTANCE.mo4307allocgFvZug(i10), null));
    }

    public static final <R> R withChunkBuffer(ObjectPool<ChunkBuffer> pool, l block) {
        e0.checkNotNullParameter(pool, "pool");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferBorrow = pool.borrow();
        try {
            return (R) block.invoke(chunkBufferBorrow);
        } finally {
            b0.finallyStart(1);
            chunkBufferBorrow.release(pool);
            b0.finallyEnd(1);
        }
    }

    public static final <R> R withBuffer(ObjectPool<Buffer> pool, l block) {
        e0.checkNotNullParameter(pool, "pool");
        e0.checkNotNullParameter(block, "block");
        Buffer bufferBorrow = pool.borrow();
        try {
            return (R) block.invoke(bufferBorrow);
        } finally {
            b0.finallyStart(1);
            pool.recycle(bufferBorrow);
            b0.finallyEnd(1);
        }
    }

    public static /* synthetic */ void getDefaultChunkedBufferPool$annotations() {
    }
}
