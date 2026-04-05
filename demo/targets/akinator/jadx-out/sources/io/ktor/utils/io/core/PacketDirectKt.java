package io.ktor.utils.io.core;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import e3.g;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PacketDirectKt {
    public static final void read(Input input, int i10, l block) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareRead = input.prepareRead(i10);
        if (chunkBufferPrepareRead == null) {
            throw g.q(i10);
        }
        int readPosition = chunkBufferPrepareRead.getReadPosition();
        try {
            block.invoke(chunkBufferPrepareRead);
            b0.finallyStart(1);
            int readPosition2 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition2 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition2 == chunkBufferPrepareRead.getWritePosition()) {
                input.ensureNext(chunkBufferPrepareRead);
            } else {
                input.setHeadPosition(readPosition2);
            }
            b0.finallyEnd(1);
        } catch (Throwable th2) {
            b0.finallyStart(1);
            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition3 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                input.ensureNext(chunkBufferPrepareRead);
            } else {
                input.setHeadPosition(readPosition3);
            }
            b0.finallyEnd(1);
            throw th2;
        }
    }

    public static /* synthetic */ void read$default(Input input, int i10, l block, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        e0.checkNotNullParameter(input, OcvDtWCQ.snmJ);
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareRead = input.prepareRead(i10);
        if (chunkBufferPrepareRead == null) {
            throw g.q(i10);
        }
        int readPosition = chunkBufferPrepareRead.getReadPosition();
        try {
            block.invoke(chunkBufferPrepareRead);
            b0.finallyStart(1);
            int readPosition2 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition2 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition2 == chunkBufferPrepareRead.getWritePosition()) {
                input.ensureNext(chunkBufferPrepareRead);
            } else {
                input.setHeadPosition(readPosition2);
            }
            b0.finallyEnd(1);
        } catch (Throwable th2) {
            b0.finallyStart(1);
            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition3 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                input.ensureNext(chunkBufferPrepareRead);
            } else {
                input.setHeadPosition(readPosition3);
            }
            b0.finallyEnd(1);
            throw th2;
        }
    }
}
