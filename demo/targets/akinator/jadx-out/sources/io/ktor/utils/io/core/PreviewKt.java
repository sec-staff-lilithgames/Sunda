package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PreviewKt {
    public static final <R> R preview(BytePacketBuilder bytePacketBuilder, l block) {
        e0.checkNotNullParameter(bytePacketBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        ByteReadPacket byteReadPacketPreview = preview(bytePacketBuilder);
        try {
            return (R) block.invoke(byteReadPacketPreview);
        } finally {
            b0.finallyStart(1);
            byteReadPacketPreview.release();
            b0.finallyEnd(1);
        }
    }

    public static final ByteReadPacket preview(BytePacketBuilder bytePacketBuilder) {
        e0.checkNotNullParameter(bytePacketBuilder, "<this>");
        ChunkBuffer head$ktor_io = bytePacketBuilder.getHead$ktor_io();
        return head$ktor_io == ChunkBuffer.Companion.getEmpty() ? ByteReadPacket.Companion.getEmpty() : new ByteReadPacket(BuffersKt.copyAll(head$ktor_io), bytePacketBuilder.get_pool());
    }
}
