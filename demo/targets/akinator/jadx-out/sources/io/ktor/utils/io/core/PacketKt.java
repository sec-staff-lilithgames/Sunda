package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PacketKt {
    public static final boolean isEmpty(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return input.getEndOfInput();
    }

    public static /* synthetic */ void isEmpty$annotations(ByteReadPacket byteReadPacket) {
    }

    public static final boolean isNotEmpty(Input input) {
        ChunkBuffer chunkBufferPrepareReadFirstHead;
        e0.checkNotNullParameter(input, "<this>");
        if (input.getEndOfInput() || (chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1)) == null) {
            return false;
        }
        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
        return true;
    }

    public static /* synthetic */ void isNotEmpty$annotations(ByteReadPacket byteReadPacket) {
    }

    public static final boolean isEmpty(ByteReadPacket byteReadPacket) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        return byteReadPacket.getEndOfInput();
    }

    @f
    public static /* synthetic */ void isEmpty$annotations(Input input) {
    }

    @f
    public static /* synthetic */ void isNotEmpty$annotations(Input input) {
    }

    public static final boolean isNotEmpty(ByteReadPacket byteReadPacket) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        return !byteReadPacket.getEndOfInput();
    }
}
