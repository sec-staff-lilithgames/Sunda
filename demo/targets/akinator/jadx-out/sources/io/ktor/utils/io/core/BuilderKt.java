package io.ktor.utils.io.core;

import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BuilderKt {
    public static final ByteReadPacket buildPacket(l block) {
        e0.checkNotNullParameter(block, "block");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            block.invoke(bytePacketBuilder);
            return bytePacketBuilder.build();
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final void reset(BytePacketBuilder bytePacketBuilder) {
        e0.checkNotNullParameter(bytePacketBuilder, "<this>");
        bytePacketBuilder.release();
    }
}
