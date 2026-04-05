package io.ktor.util.cio;

import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ByteBufferPoolKt {
    public static final int DEFAULT_KTOR_POOL_SIZE = 2048;
    public static final int DEFAULT_BUFFER_SIZE = 4098;
    private static final ObjectPool<ByteBuffer> KtorDefaultPool = new io.ktor.utils.io.pool.ByteBufferPool(2048, DEFAULT_BUFFER_SIZE);

    public static final ObjectPool<ByteBuffer> getKtorDefaultPool() {
        return KtorDefaultPool;
    }
}
