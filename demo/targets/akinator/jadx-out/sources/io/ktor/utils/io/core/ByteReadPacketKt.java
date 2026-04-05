package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteReadPacketKt {
    public static final ByteReadPacket ByteReadPacket(byte[] array, int i10, int i11) {
        e0.checkNotNullParameter(array, "array");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
        e0.checkNotNullExpressionValue(byteBufferWrap, "wrap(array, offset, length)");
        return ByteReadPacketExtensionsKt.ByteReadPacket(byteBufferWrap, new ByteReadPacketKt$ByteReadPacket$$inlined$ByteReadPacket$1(array));
    }

    public static /* synthetic */ ByteReadPacket ByteReadPacket$default(byte[] array, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = array.length;
        }
        e0.checkNotNullParameter(array, "array");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
        e0.checkNotNullExpressionValue(byteBufferWrap, "wrap(array, offset, length)");
        return ByteReadPacketExtensionsKt.ByteReadPacket(byteBufferWrap, new ByteReadPacketKt$ByteReadPacket$$inlined$ByteReadPacket$1(array));
    }
}
