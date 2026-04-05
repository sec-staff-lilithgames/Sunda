package io.ktor.utils.io.bits;

import io.ktor.utils.io.bits.Memory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MemoryFactoryJvmKt {
    public static final ByteBuffer of(Memory.Companion companion, byte[] array, int i10, int i11) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(array, "array");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(array, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(array, offset, leng…der(ByteOrder.BIG_ENDIAN)");
        return Memory.m4314constructorimpl(byteBufferOrder);
    }

    public static /* synthetic */ ByteBuffer of$default(Memory.Companion companion, byte[] array, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = array.length - i10;
        }
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(array, "array");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(array, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(array, offset, leng…der(ByteOrder.BIG_ENDIAN)");
        return Memory.m4314constructorimpl(byteBufferOrder);
    }

    public static final <R> R useMemory(byte[] bArr, int i10, int i11, l block) {
        e0.checkNotNullParameter(bArr, "<this>");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        return (R) block.invoke(Memory.m4313boximpl(Memory.m4314constructorimpl(byteBufferOrder)));
    }

    public static /* synthetic */ Object useMemory$default(byte[] bArr, int i10, int i11, l block, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        e0.checkNotNullParameter(bArr, "<this>");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, i10, i11).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        return block.invoke(Memory.m4313boximpl(Memory.m4314constructorimpl(byteBufferOrder)));
    }

    public static final ByteBuffer of(Memory.Companion companion, ByteBuffer buffer) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        ByteBuffer byteBufferOrder = buffer.slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        return Memory.m4314constructorimpl(byteBufferOrder);
    }
}
