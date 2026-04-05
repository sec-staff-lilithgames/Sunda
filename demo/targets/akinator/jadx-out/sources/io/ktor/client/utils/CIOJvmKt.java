package io.ktor.client.utils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CIOJvmKt {
    private static final io.ktor.utils.io.pool.ByteBufferPool HttpClientDefaultPool = new io.ktor.utils.io.pool.ByteBufferPool(0, 0, 3, null);

    public static final io.ktor.utils.io.pool.ByteBufferPool getHttpClientDefaultPool() {
        return HttpClientDefaultPool;
    }
}
