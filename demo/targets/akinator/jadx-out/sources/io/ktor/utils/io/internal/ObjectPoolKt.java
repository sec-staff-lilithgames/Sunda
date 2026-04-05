package io.ktor.utils.io.internal;

import io.ktor.utils.io.internal.ReadWriteBufferState;
import io.ktor.utils.io.pool.DefaultPool;
import io.ktor.utils.io.pool.DirectByteBufferPool;
import io.ktor.utils.io.pool.NoPoolImpl;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ObjectPoolKt {
    private static final int BUFFER_OBJECT_POOL_SIZE;
    private static final int BUFFER_POOL_SIZE;
    private static final int BUFFER_SIZE;
    private static final ObjectPool<ReadWriteBufferState.Initial> BufferObjectNoPool;
    private static final ObjectPool<ReadWriteBufferState.Initial> BufferObjectPool;
    private static final ObjectPool<ByteBuffer> BufferPool;

    static {
        int iOIntProperty = UtilsKt.getIOIntProperty("BufferSize", 4096);
        BUFFER_SIZE = iOIntProperty;
        int iOIntProperty2 = UtilsKt.getIOIntProperty("BufferPoolSize", 2048);
        BUFFER_POOL_SIZE = iOIntProperty2;
        final int iOIntProperty3 = UtilsKt.getIOIntProperty("BufferObjectPoolSize", 1024);
        BUFFER_OBJECT_POOL_SIZE = iOIntProperty3;
        BufferPool = new DirectByteBufferPool(iOIntProperty2, iOIntProperty);
        BufferObjectPool = new DefaultPool<ReadWriteBufferState.Initial>(iOIntProperty3) { // from class: io.ktor.utils.io.internal.ObjectPoolKt$BufferObjectPool$1
            @Override // io.ktor.utils.io.pool.DefaultPool
            public void disposeInstance(ReadWriteBufferState.Initial instance) {
                e0.checkNotNullParameter(instance, "instance");
                ObjectPoolKt.getBufferPool().recycle(instance.backingBuffer);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.ktor.utils.io.pool.DefaultPool
            public ReadWriteBufferState.Initial produceInstance() {
                return new ReadWriteBufferState.Initial(ObjectPoolKt.getBufferPool().borrow(), 0, 2, null);
            }
        };
        BufferObjectNoPool = new NoPoolImpl<ReadWriteBufferState.Initial>() { // from class: io.ktor.utils.io.internal.ObjectPoolKt$BufferObjectNoPool$1
            @Override // io.ktor.utils.io.pool.ObjectPool
            public ReadWriteBufferState.Initial borrow() {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(ObjectPoolKt.getBUFFER_SIZE());
                e0.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
                return new ReadWriteBufferState.Initial(byteBufferAllocateDirect, 0, 2, null);
            }
        };
    }

    public static final int getBUFFER_SIZE() {
        return BUFFER_SIZE;
    }

    public static final ObjectPool<ReadWriteBufferState.Initial> getBufferObjectNoPool() {
        return BufferObjectNoPool;
    }

    public static final ObjectPool<ReadWriteBufferState.Initial> getBufferObjectPool() {
        return BufferObjectPool;
    }

    public static final ObjectPool<ByteBuffer> getBufferPool() {
        return BufferPool;
    }
}
