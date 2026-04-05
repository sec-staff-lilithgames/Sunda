package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReadWriteBufferStateKt {
    private static final ByteBuffer EmptyByteBuffer;
    private static final RingBufferCapacity EmptyCapacity;
    public static final int RESERVED_SIZE = 8;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        e0.checkNotNullExpressionValue(byteBufferAllocate, "allocate(0)");
        EmptyByteBuffer = byteBufferAllocate;
        EmptyCapacity = new RingBufferCapacity(0);
    }

    public static final ByteBuffer getEmptyByteBuffer() {
        return EmptyByteBuffer;
    }

    public static final RingBufferCapacity getEmptyCapacity() {
        return EmptyCapacity;
    }
}
