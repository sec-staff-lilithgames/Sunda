package io.ktor.utils.io.pool;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteArrayPoolKt {
    private static final ObjectPool<byte[]> ByteArrayPool = new DefaultPool<byte[]>() { // from class: io.ktor.utils.io.pool.ByteArrayPoolKt$ByteArrayPool$1
        @Override // io.ktor.utils.io.pool.DefaultPool
        public byte[] produceInstance() {
            return new byte[4096];
        }
    };

    public static final ObjectPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
