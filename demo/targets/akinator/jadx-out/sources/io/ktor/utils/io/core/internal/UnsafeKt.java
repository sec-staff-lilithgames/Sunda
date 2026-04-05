package io.ktor.utils.io.core.internal;

import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.PacketJVMKt;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UnsafeKt {
    public static final byte[] EmptyByteArray = new byte[0];

    public static final void completeReadHead(Input input, ChunkBuffer current) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(current, "current");
        if (current == input) {
            return;
        }
        if (current.getWritePosition() <= current.getReadPosition()) {
            input.ensureNext(current);
        } else if (current.getCapacity() - current.getLimit() < 8) {
            input.fixGapAfterRead$ktor_io(current);
        } else {
            input.setHeadPosition(current.getReadPosition());
        }
    }

    public static final ChunkBuffer prepareReadFirstHead(Input input, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        return input.prepareReadHead$ktor_io(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ChunkBuffer prepareReadNextHead(Input input, ChunkBuffer current) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(current, "current");
        if (current != input) {
            return input.ensureNextHead$ktor_io(current);
        }
        if (input.canRead()) {
            return (ChunkBuffer) input;
        }
        return null;
    }

    public static final ChunkBuffer prepareWriteHead(Output output, int i10, ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(output, "<this>");
        if (chunkBuffer != null) {
            output.afterHeadWrite();
        }
        return output.prepareWriteHead(i10);
    }

    public static final int unsafeAppend(ByteReadPacket byteReadPacket, BytePacketBuilder builder) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        e0.checkNotNullParameter(builder, "builder");
        int size = builder.getSize();
        ChunkBuffer chunkBufferStealAll$ktor_io = builder.stealAll$ktor_io();
        if (chunkBufferStealAll$ktor_io == null) {
            return 0;
        }
        if (size <= PacketJVMKt.getPACKET_MAX_COPY_SIZE() && chunkBufferStealAll$ktor_io.getNext() == null && byteReadPacket.tryWriteAppend$ktor_io(chunkBufferStealAll$ktor_io)) {
            builder.afterBytesStolen$ktor_io();
            return size;
        }
        byteReadPacket.append$ktor_io(chunkBufferStealAll$ktor_io);
        return size;
    }
}
