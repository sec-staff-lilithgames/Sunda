package io.ktor.websocket.internals;

import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.StringsKt;
import java.util.Arrays;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BytePacketUtilsKt {
    public static final boolean endsWith(ByteReadPacket byteReadPacket, byte[] data) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        e0.checkNotNullParameter(data, "data");
        ByteReadPacket byteReadPacketCopy = byteReadPacket.copy();
        byteReadPacketCopy.discard(byteReadPacketCopy.getRemaining() - data.length);
        return Arrays.equals(StringsKt.readBytes$default(byteReadPacketCopy, 0, 1, null), data);
    }
}
