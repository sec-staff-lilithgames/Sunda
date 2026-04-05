package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CopyKt {
    public static final long copyTo(Input input, Output output) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(output, "output");
        long j10 = 0;
        while (true) {
            ChunkBuffer chunkBufferStealAll$ktor_io = input.stealAll$ktor_io();
            if (chunkBufferStealAll$ktor_io != null) {
                long jRemainingAll = BuffersKt.remainingAll(chunkBufferStealAll$ktor_io) + j10;
                output.appendChain$ktor_io(chunkBufferStealAll$ktor_io);
                j10 = jRemainingAll;
            } else if (input.prepareRead(1) == null) {
                return j10;
            }
        }
    }
}
