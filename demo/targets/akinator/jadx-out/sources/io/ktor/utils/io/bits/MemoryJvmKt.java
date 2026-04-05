package io.ktor.utils.io.bits;

import e3.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MemoryJvmKt {
    /* renamed from: copyTo-62zg_DM, reason: not valid java name */
    public static final void m4331copyTo62zg_DM(ByteBuffer copyTo, ByteBuffer destination, int i10) {
        e0.checkNotNullParameter(copyTo, "$this$copyTo");
        e0.checkNotNullParameter(destination, "destination");
        int iRemaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int iPosition = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i10, destination.array(), destination.arrayOffset() + iPosition, iRemaining);
            destination.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i10);
            byteBufferDuplicate.position(i10);
            destination.put(byteBufferDuplicate);
        }
    }

    /* renamed from: copyTo-9zorpBc, reason: not valid java name */
    public static final void m4333copyTo9zorpBc(ByteBuffer copyTo, byte[] destination, int i10, int i11, int i12) {
        e0.checkNotNullParameter(copyTo, "$this$copyTo");
        e0.checkNotNullParameter(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(destination, i12, i11);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i10, destination, i12, i11);
        }
    }

    /* renamed from: copyTo-SG11BkQ, reason: not valid java name */
    public static final void m4335copyToSG11BkQ(ByteBuffer copyTo, ByteBuffer destination, int i10) {
        e0.checkNotNullParameter(copyTo, "$this$copyTo");
        e0.checkNotNullParameter(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            sliceSafe(destination, i10, copyTo.remaining()).put(copyTo);
            return;
        }
        byte[] bArrArray = copyTo.array();
        e0.checkNotNullExpressionValue(bArrArray, "array()");
        int iPosition = copyTo.position() + copyTo.arrayOffset();
        int iRemaining = copyTo.remaining();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iPosition, iRemaining).slice().order(ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4315copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), destination, 0, iRemaining, i10);
        copyTo.position(copyTo.limit());
    }

    /* renamed from: fill-JT6ljtQ, reason: not valid java name */
    public static final void m4337fillJT6ljtQ(ByteBuffer fill, long j10, long j11, byte b10) {
        e0.checkNotNullParameter(fill, "$this$fill");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "offset");
        }
        int i10 = (int) j10;
        if (j11 >= 2147483647L) {
            throw g.r(j11, "count");
        }
        m4336fillJT6ljtQ(fill, i10, (int) j11, b10);
    }

    private static final ByteBuffer myDuplicate(ByteBuffer byteBuffer) {
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        e0.checkNotNullExpressionValue(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        return myDuplicate$lambda$1;
    }

    private static final ByteBuffer mySlice(ByteBuffer byteBuffer) {
        ByteBuffer mySlice$lambda$2 = byteBuffer.slice();
        e0.checkNotNullExpressionValue(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }

    public static final ByteBuffer sliceSafe(ByteBuffer byteBuffer, int i10, int i11) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        e0.checkNotNullExpressionValue(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i10);
        myDuplicate$lambda$1.limit(i10 + i11);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        e0.checkNotNullExpressionValue(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }

    /* renamed from: copyTo-9zorpBc, reason: not valid java name */
    public static final void m4334copyTo9zorpBc(ByteBuffer copyTo, byte[] destination, long j10, int i10, int i11) {
        e0.checkNotNullParameter(copyTo, "$this$copyTo");
        e0.checkNotNullParameter(destination, "destination");
        if (j10 < 2147483647L) {
            m4333copyTo9zorpBc(copyTo, destination, (int) j10, i10, i11);
            return;
        }
        throw g.r(j10, "offset");
    }

    /* renamed from: fill-JT6ljtQ, reason: not valid java name */
    public static final void m4336fillJT6ljtQ(ByteBuffer fill, int i10, int i11, byte b10) {
        e0.checkNotNullParameter(fill, "$this$fill");
        int i12 = i11 + i10;
        while (i10 < i12) {
            fill.put(i10, b10);
            i10++;
        }
    }

    /* renamed from: copyTo-62zg_DM, reason: not valid java name */
    public static final void m4332copyTo62zg_DM(ByteBuffer copyTo, ByteBuffer destination, long j10) {
        e0.checkNotNullParameter(copyTo, "$this$copyTo");
        e0.checkNotNullParameter(destination, "destination");
        if (j10 < 2147483647L) {
            m4331copyTo62zg_DM(copyTo, destination, (int) j10);
            return;
        }
        throw g.r(j10, "offset");
    }

    private static final ByteBuffer suppressNullCheck(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}
