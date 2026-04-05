package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class UtilsKt__UtilsJvmKt {
    public static final int getOUTGOING_CHANNEL_CAPACITY() {
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 8;
    }

    public static final void xor(ByteBuffer byteBuffer, ByteBuffer other) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(other, "other");
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = other.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i10 = 0; i10 < iRemaining2; i10++) {
            byteBufferSlice.put(i10, (byte) (byteBufferSlice.get(i10) ^ byteBufferSlice2.get(i10 % iRemaining)));
        }
    }
}
