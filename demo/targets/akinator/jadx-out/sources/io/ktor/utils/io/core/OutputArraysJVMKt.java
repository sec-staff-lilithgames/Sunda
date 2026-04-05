package io.ktor.utils.io.core;

import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OutputArraysJVMKt {
    public static final void writeFully(Output output, ByteBuffer bb2) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(bb2, "bb");
        int iLimit = bb2.limit();
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                bb2.limit(bb2.position() + Math.min(bb2.remaining(), chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition()));
                BufferPrimitivesJvmKt.writeFully(chunkBufferPrepareWriteHead, bb2);
                bb2.limit(iLimit);
                if (!bb2.hasRemaining()) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }
}
