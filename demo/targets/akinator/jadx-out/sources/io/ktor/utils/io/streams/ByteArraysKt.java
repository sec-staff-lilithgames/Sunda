package io.ktor.utils.io.streams;

import a.b;
import io.ktor.utils.io.pool.DefaultPool;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteArraysKt {
    private static final DefaultPool<byte[]> ByteArrayPool = new DefaultPool<byte[]>() { // from class: io.ktor.utils.io.streams.ByteArraysKt$ByteArrayPool$1
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final byte[] produceInstance() {
            return new byte[4096];
        }

        @Override // io.ktor.utils.io.pool.DefaultPool
        public final void validateInstance(byte[] instance) {
            e0.checkNotNullParameter(instance, "instance");
            if (instance.length == 4096) {
                super.validateInstance((ByteArraysKt$ByteArrayPool$1) instance);
            } else {
                throw new IllegalArgumentException(b.f(instance.length, " != 4096", new StringBuilder("Unable to recycle buffer of wrong size: ")).toString());
            }
        }
    };
    public static final int ByteArrayPoolBufferSize = 4096;

    public static final DefaultPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
