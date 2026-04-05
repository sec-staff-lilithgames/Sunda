package io.ktor.utils.io.core;

import e3.g;
import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputArraysJvmKt {
    public static final int readAvailable(Input input, ByteBuffer dst, int i10) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return 0;
        }
        int i11 = 0;
        do {
            try {
                int iLimit = dst.limit();
                dst.limit(Math.min(iLimit, (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition()) + dst.position()));
                int iRemaining = dst.remaining();
                MemoryJvmKt.m4331copyTo62zg_DM(chunkBufferPrepareReadFirstHead.m4458getMemorySK3TCg8(), dst, chunkBufferPrepareReadFirstHead.getReadPosition());
                dst.limit(iLimit);
                i11 += iRemaining;
                if (!dst.hasRemaining() || i11 >= i10) {
                    UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    return i11;
                }
                try {
                    chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                    if (z10) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } while (chunkBufferPrepareReadFirstHead != null);
        return i11;
    }

    public static /* synthetic */ int readAvailable$default(Input input, ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = byteBuffer.remaining();
        }
        return readAvailable(input, byteBuffer, i10);
    }

    public static final void readFully(Input input, ByteBuffer dst, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        if (readAvailable(input, dst, i10) < i10) {
            throw g.q(i10);
        }
    }

    public static /* synthetic */ void readFully$default(Input input, ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = byteBuffer.remaining();
        }
        readFully(input, byteBuffer, i10);
    }
}
