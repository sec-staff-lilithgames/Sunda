package io.ktor.utils.io.core;

import e3.g;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteBuffersKt {
    public static final boolean hasArray(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        return byteBufferM4458getMemorySK3TCg8.hasArray() && !byteBufferM4458getMemorySK3TCg8.isReadOnly();
    }

    private static final int readAsMuchAsPossible(ByteReadPacket byteReadPacket, ByteBuffer byteBuffer, int i10) throws EOFException {
        ChunkBuffer chunkBufferPrepareRead;
        while (byteBuffer.hasRemaining() && (chunkBufferPrepareRead = byteReadPacket.prepareRead(1)) != null) {
            int iRemaining = byteBuffer.remaining();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition();
            if (iRemaining < writePosition) {
                BufferUtilsJvmKt.readFully(chunkBufferPrepareRead, byteBuffer, iRemaining);
                byteReadPacket.setHeadPosition(chunkBufferPrepareRead.getReadPosition());
                return i10 + iRemaining;
            }
            BufferUtilsJvmKt.readFully(chunkBufferPrepareRead, byteBuffer, writePosition);
            byteReadPacket.releaseHead$ktor_io(chunkBufferPrepareRead);
            i10 += writePosition;
        }
        return i10;
    }

    public static final int readAvailable(ByteReadPacket byteReadPacket, ByteBuffer dst) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        return readAsMuchAsPossible(byteReadPacket, dst, 0);
    }

    public static final void readDirect(ByteReadPacket byteReadPacket, int i10, l block) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareRead = byteReadPacket.prepareRead(i10);
        if (chunkBufferPrepareRead == null) {
            throw g.q(i10);
        }
        int readPosition = chunkBufferPrepareRead.getReadPosition();
        try {
            ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareRead.m4458getMemorySK3TCg8();
            int readPosition2 = chunkBufferPrepareRead.getReadPosition();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
            ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, readPosition2, writePosition);
            block.invoke(byteBufferM4324slice87lwejk);
            if (byteBufferM4324slice87lwejk.limit() != writePosition) {
                throw new IllegalStateException("Buffer's limit change is not allowed");
            }
            chunkBufferPrepareRead.discardExact(byteBufferM4324slice87lwejk.position());
            b0.finallyStart(1);
            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition3 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                byteReadPacket.ensureNext(chunkBufferPrepareRead);
            } else {
                byteReadPacket.setHeadPosition(readPosition3);
            }
            b0.finallyEnd(1);
        } catch (Throwable th2) {
            b0.finallyStart(1);
            int readPosition4 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition4 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                byteReadPacket.ensureNext(chunkBufferPrepareRead);
            } else {
                byteReadPacket.setHeadPosition(readPosition4);
            }
            b0.finallyEnd(1);
            throw th2;
        }
    }

    public static final int readFully(ByteReadPacket byteReadPacket, ByteBuffer dst) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        int asMuchAsPossible = readAsMuchAsPossible(byteReadPacket, dst, 0);
        if (!dst.hasRemaining()) {
            return asMuchAsPossible;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + dst.remaining() + " more bytes required");
    }

    public static final int writeByteBufferDirect(BytePacketBuilder bytePacketBuilder, int i10, l block) {
        e0.checkNotNullParameter(bytePacketBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = bytePacketBuilder.prepareWriteHead(i10);
        try {
            ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareWriteHead.m4458getMemorySK3TCg8();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
            ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, writePosition, limit);
            block.invoke(byteBufferM4324slice87lwejk);
            if (byteBufferM4324slice87lwejk.limit() != limit) {
                throw new IllegalStateException("Buffer's limit change is not allowed");
            }
            int iPosition = byteBufferM4324slice87lwejk.position();
            chunkBufferPrepareWriteHead.commitWritten(iPosition);
            if (iPosition < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            b0.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            b0.finallyEnd(1);
            return iPosition;
        } catch (Throwable th2) {
            b0.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            b0.finallyEnd(1);
            throw th2;
        }
    }

    public static final void writeDirect(BytePacketBuilder bytePacketBuilder, int i10, l block) {
        e0.checkNotNullParameter(bytePacketBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = bytePacketBuilder.prepareWriteHead(i10);
        try {
            ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareWriteHead.m4458getMemorySK3TCg8();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
            ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, writePosition, limit);
            block.invoke(byteBufferM4324slice87lwejk);
            if (byteBufferM4324slice87lwejk.limit() != limit) {
                throw new IllegalStateException("Buffer's limit change is not allowed");
            }
            int iPosition = byteBufferM4324slice87lwejk.position();
            chunkBufferPrepareWriteHead.commitWritten(iPosition);
            if (iPosition < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            b0.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            b0.finallyEnd(1);
        } catch (Throwable th2) {
            b0.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            b0.finallyEnd(1);
            throw th2;
        }
    }

    @f
    public static final void readDirect(Input input, int i10, l block) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareRead = input.prepareRead(i10);
        if (chunkBufferPrepareRead != null) {
            int readPosition = chunkBufferPrepareRead.getReadPosition();
            try {
                ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareRead.m4458getMemorySK3TCg8();
                int readPosition2 = chunkBufferPrepareRead.getReadPosition();
                int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
                ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, readPosition2, writePosition);
                block.invoke(byteBufferM4324slice87lwejk);
                if (byteBufferM4324slice87lwejk.limit() == writePosition) {
                    chunkBufferPrepareRead.discardExact(byteBufferM4324slice87lwejk.position());
                    b0.finallyStart(1);
                    int readPosition3 = chunkBufferPrepareRead.getReadPosition();
                    if (readPosition3 >= readPosition) {
                        if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                            input.ensureNext(chunkBufferPrepareRead);
                        } else {
                            input.setHeadPosition(readPosition3);
                        }
                        b0.finallyEnd(1);
                        return;
                    }
                    throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                }
                throw new IllegalStateException("Buffer's limit change is not allowed");
            } catch (Throwable th2) {
                b0.finallyStart(1);
                int readPosition4 = chunkBufferPrepareRead.getReadPosition();
                if (readPosition4 >= readPosition) {
                    if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                        input.ensureNext(chunkBufferPrepareRead);
                    } else {
                        input.setHeadPosition(readPosition4);
                    }
                    b0.finallyEnd(1);
                    throw th2;
                }
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
        }
        throw g.q(i10);
    }
}
