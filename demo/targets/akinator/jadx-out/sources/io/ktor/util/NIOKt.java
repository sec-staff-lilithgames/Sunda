package io.ktor.util;

import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NIOKt {
    public static final ByteBuffer copy(ByteBuffer byteBuffer, int i10) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        e0.checkNotNullExpressionValue(byteBufferSlice, "this@copy.slice()");
        e0.checkNotNullExpressionValue(byteBufferAllocate, "this@apply");
        moveTo$default(byteBufferSlice, byteBufferAllocate, 0, 2, null);
        byteBufferAllocate.clear();
        e0.checkNotNullExpressionValue(byteBufferAllocate, "allocate(size).apply {\n …ly)\n        clear()\n    }");
        return byteBufferAllocate;
    }

    public static /* synthetic */ ByteBuffer copy$default(ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = byteBuffer.remaining();
        }
        return copy(byteBuffer, i10);
    }

    public static final String decodeString(ByteBuffer byteBuffer, Charset charset) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        String string = charset.decode(byteBuffer).toString();
        e0.checkNotNullExpressionValue(string, "charset.decode(this).toString()");
        return string;
    }

    public static /* synthetic */ String decodeString$default(ByteBuffer byteBuffer, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f86134b;
        }
        return decodeString(byteBuffer, charset);
    }

    public static final int moveTo(ByteBuffer byteBuffer, ByteBuffer destination, int i10) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        int iMin = Math.min(i10, Math.min(byteBuffer.remaining(), destination.remaining()));
        if (iMin == byteBuffer.remaining()) {
            destination.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        destination.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    public static /* synthetic */ int moveTo$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return moveTo(byteBuffer, byteBuffer2, i10);
    }

    public static final byte[] moveToByteArray(ByteBuffer byteBuffer) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static /* synthetic */ ByteBuffer copy$default(ByteBuffer byteBuffer, ObjectPool objectPool, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = byteBuffer.remaining();
        }
        return copy(byteBuffer, objectPool, i10);
    }

    public static final ByteBuffer copy(ByteBuffer byteBuffer, ObjectPool<ByteBuffer> pool, int i10) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(pool, "pool");
        ByteBuffer byteBufferBorrow = pool.borrow();
        byteBufferBorrow.limit(i10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        e0.checkNotNullExpressionValue(byteBufferSlice, "this@copy.slice()");
        moveTo$default(byteBufferSlice, byteBufferBorrow, 0, 2, null);
        byteBufferBorrow.flip();
        return byteBufferBorrow;
    }
}
