package io.ktor.utils.io.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import e3.g;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UTF8Kt;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import tu.f;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public abstract class Output implements Appendable, Closeable {
    private ChunkBuffer _head;
    private ChunkBuffer _tail;
    private int chainedSize;
    private final ObjectPool<ChunkBuffer> pool;
    private int tailEndExclusive;
    private int tailInitialPosition;
    private ByteBuffer tailMemory;
    private int tailPosition;

    public Output(ObjectPool<ChunkBuffer> pool) {
        e0.checkNotNullParameter(pool, "pool");
        this.pool = pool;
        this.tailMemory = Memory.Companion.m4330getEmptySK3TCg8();
    }

    private final void appendChainImpl(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2, int i10) {
        ChunkBuffer chunkBuffer3 = this._tail;
        if (chunkBuffer3 == null) {
            this._head = chunkBuffer;
            this.chainedSize = 0;
        } else {
            chunkBuffer3.setNext(chunkBuffer);
            int i11 = this.tailPosition;
            chunkBuffer3.commitWrittenUntilIndex(i11);
            this.chainedSize = (i11 - this.tailInitialPosition) + this.chainedSize;
        }
        this._tail = chunkBuffer2;
        this.chainedSize += i10;
        this.tailMemory = chunkBuffer2.m4458getMemorySK3TCg8();
        this.tailPosition = chunkBuffer2.getWritePosition();
        this.tailInitialPosition = chunkBuffer2.getReadPosition();
        this.tailEndExclusive = chunkBuffer2.getLimit();
    }

    private final void appendCharFallback(char c10) {
        int i10 = 3;
        ChunkBuffer chunkBufferPrepareWriteHead = prepareWriteHead(3);
        try {
            ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareWriteHead.m4458getMemorySK3TCg8();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            if (c10 >= 0 && c10 < 128) {
                byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) c10);
                i10 = 1;
            } else if (128 <= c10 && c10 < 2048) {
                byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) (((c10 >> 6) & 31) | PsExtractor.AUDIO_STREAM));
                byteBufferM4458getMemorySK3TCg8.put(writePosition + 1, (byte) ((c10 & '?') | 128));
                i10 = 2;
            } else if (2048 <= c10 && c10 < 0) {
                byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) (((c10 >> '\f') & 15) | 224));
                byteBufferM4458getMemorySK3TCg8.put(writePosition + 1, (byte) (((c10 >> 6) & 63) | 128));
                byteBufferM4458getMemorySK3TCg8.put(writePosition + 2, (byte) ((c10 & '?') | 128));
            } else {
                if (0 > c10 || c10 >= 0) {
                    UTF8Kt.malformedCodePoint(c10);
                    throw new k();
                }
                byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) (((c10 >> 18) & 7) | PsExtractor.VIDEO_STREAM_MASK));
                byteBufferM4458getMemorySK3TCg8.put(writePosition + 1, (byte) (((c10 >> '\f') & 63) | 128));
                byteBufferM4458getMemorySK3TCg8.put(writePosition + 2, (byte) (((c10 >> 6) & 63) | 128));
                byteBufferM4458getMemorySK3TCg8.put(writePosition + 3, (byte) ((c10 & '?') | 128));
                i10 = 4;
            }
            chunkBufferPrepareWriteHead.commitWritten(i10);
            afterHeadWrite();
        } catch (Throwable th2) {
            afterHeadWrite();
            throw th2;
        }
    }

    private final ChunkBuffer appendNewChunk() {
        ChunkBuffer chunkBufferBorrow = this.pool.borrow();
        chunkBufferBorrow.reserveEndGap(8);
        appendSingleChunk$ktor_io(chunkBufferBorrow);
        return chunkBufferBorrow;
    }

    private final void flushChain() {
        ChunkBuffer chunkBufferStealAll$ktor_io = stealAll$ktor_io();
        if (chunkBufferStealAll$ktor_io == null) {
            return;
        }
        ChunkBuffer next = chunkBufferStealAll$ktor_io;
        do {
            try {
                mo4493flush62zg_DM(next.m4458getMemorySK3TCg8(), next.getReadPosition(), next.getWritePosition() - next.getReadPosition());
                next = next.getNext();
            } finally {
                BuffersKt.releaseAll(chunkBufferStealAll$ktor_io, this.pool);
            }
        } while (next != null);
    }

    private final void writeByteFallback(byte b10) throws InsufficientSpaceException {
        appendNewChunk().writeByte(b10);
        this.tailPosition++;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void writePacketMerging(io.ktor.utils.io.core.internal.ChunkBuffer r8, io.ktor.utils.io.core.internal.ChunkBuffer r9, io.ktor.utils.io.pool.ObjectPool<io.ktor.utils.io.core.internal.ChunkBuffer> r10) {
        /*
            r7 = this;
            int r0 = r7.tailPosition
            r8.commitWrittenUntilIndex(r0)
            int r0 = r8.getWritePosition()
            int r1 = r8.getReadPosition()
            int r0 = r0 - r1
            int r1 = r9.getWritePosition()
            int r2 = r9.getReadPosition()
            int r1 = r1 - r2
            int r2 = io.ktor.utils.io.core.PacketJVMKt.getPACKET_MAX_COPY_SIZE()
            r3 = -1
            if (r1 >= r2) goto L34
            int r4 = r8.getCapacity()
            int r5 = r8.getLimit()
            int r4 = r4 - r5
            int r5 = r8.getLimit()
            int r6 = r8.getWritePosition()
            int r5 = r5 - r6
            int r5 = r5 + r4
            if (r1 > r5) goto L34
            goto L35
        L34:
            r1 = r3
        L35:
            if (r0 >= r2) goto L44
            int r2 = r9.getStartGap()
            if (r0 > r2) goto L44
            boolean r2 = io.ktor.utils.io.core.internal.ChunkBufferKt.isExclusivelyOwned(r9)
            if (r2 == 0) goto L44
            goto L45
        L44:
            r0 = r3
        L45:
            if (r1 != r3) goto L4d
            if (r0 != r3) goto L4d
            r7.appendChain$ktor_io(r9)
            return
        L4d:
            if (r0 == r3) goto L69
            if (r1 > r0) goto L52
            goto L69
        L52:
            if (r1 == r3) goto L65
            if (r0 >= r1) goto L57
            goto L65
        L57:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "prep = "
            java.lang.String r10 = ", app = "
            java.lang.String r9 = w0.i.a(r0, r1, r9, r10)
            r8.<init>(r9)
            throw r8
        L65:
            r7.writePacketSlowPrepend(r9, r8)
            return
        L69:
            int r0 = r8.getLimit()
            int r1 = r8.getWritePosition()
            int r0 = r0 - r1
            int r1 = r8.getCapacity()
            int r2 = r8.getLimit()
            int r1 = r1 - r2
            int r1 = r1 + r0
            io.ktor.utils.io.core.BufferAppendKt.writeBufferAppend(r8, r9, r1)
            r7.afterHeadWrite()
            io.ktor.utils.io.core.internal.ChunkBuffer r8 = r9.cleanNext()
            if (r8 == 0) goto L8b
            r7.appendChain$ktor_io(r8)
        L8b:
            r9.release(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.Output.writePacketMerging(io.ktor.utils.io.core.internal.ChunkBuffer, io.ktor.utils.io.core.internal.ChunkBuffer, io.ktor.utils.io.pool.ObjectPool):void");
    }

    private final void writePacketSlowPrepend(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2) {
        BufferAppendKt.writeBufferPrepend(chunkBuffer, chunkBuffer2);
        ChunkBuffer chunkBuffer3 = this._head;
        if (chunkBuffer3 == null) {
            throw new IllegalStateException("head should't be null since it is already handled in the fast-path");
        }
        if (chunkBuffer3 == chunkBuffer2) {
            this._head = chunkBuffer;
        } else {
            while (true) {
                ChunkBuffer next = chunkBuffer3.getNext();
                e0.checkNotNull(next);
                if (next == chunkBuffer2) {
                    break;
                } else {
                    chunkBuffer3 = next;
                }
            }
            chunkBuffer3.setNext(chunkBuffer);
        }
        chunkBuffer2.release(this.pool);
        this._tail = BuffersKt.findTail(chunkBuffer);
    }

    public final void afterBytesStolen$ktor_io() {
        ChunkBuffer head$ktor_io = getHead$ktor_io();
        if (head$ktor_io != ChunkBuffer.Companion.getEmpty()) {
            if (head$ktor_io.getNext() != null) {
                throw new IllegalStateException("Check failed.");
            }
            head$ktor_io.resetForWrite();
            head$ktor_io.reserveEndGap(8);
            int writePosition = head$ktor_io.getWritePosition();
            this.tailPosition = writePosition;
            this.tailInitialPosition = writePosition;
            this.tailEndExclusive = head$ktor_io.getLimit();
        }
    }

    public final void afterHeadWrite() {
        ChunkBuffer chunkBuffer = this._tail;
        if (chunkBuffer != null) {
            this.tailPosition = chunkBuffer.getWritePosition();
        }
    }

    public final void appendChain$ktor_io(ChunkBuffer head) {
        e0.checkNotNullParameter(head, "head");
        ChunkBuffer chunkBufferFindTail = BuffersKt.findTail(head);
        long jRemainingAll = BuffersKt.remainingAll(head) - (chunkBufferFindTail.getWritePosition() - chunkBufferFindTail.getReadPosition());
        if (jRemainingAll >= 2147483647L) {
            throw g.r(jRemainingAll, "total size increase");
        }
        appendChainImpl(head, chunkBufferFindTail, (int) jRemainingAll);
    }

    public final void appendSingleChunk$ktor_io(ChunkBuffer buffer) {
        e0.checkNotNullParameter(buffer, "buffer");
        if (buffer.getNext() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        appendChainImpl(buffer, buffer, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            closeDestination();
        }
    }

    public abstract void closeDestination();

    public final void flush() {
        flushChain();
    }

    /* renamed from: flush-62zg_DM */
    public abstract void mo4493flush62zg_DM(ByteBuffer byteBuffer, int i10, int i11);

    public final ChunkBuffer getHead$ktor_io() {
        ChunkBuffer chunkBuffer = this._head;
        return chunkBuffer == null ? ChunkBuffer.Companion.getEmpty() : chunkBuffer;
    }

    public final ObjectPool<ChunkBuffer> getPool() {
        return this.pool;
    }

    public final int getTailEndExclusive$ktor_io() {
        return this.tailEndExclusive;
    }

    /* renamed from: getTailMemory-SK3TCg8$ktor_io, reason: not valid java name */
    public final ByteBuffer m4528getTailMemorySK3TCg8$ktor_io() {
        return this.tailMemory;
    }

    public final int getTailPosition$ktor_io() {
        return this.tailPosition;
    }

    public final int getTailRemaining$ktor_io() {
        return getTailEndExclusive$ktor_io() - getTailPosition$ktor_io();
    }

    public final int get_size() {
        return (this.tailPosition - this.tailInitialPosition) + this.chainedSize;
    }

    public void last$ktor_io(ChunkBuffer buffer) {
        e0.checkNotNullParameter(buffer, "buffer");
        appendSingleChunk$ktor_io(buffer);
    }

    public final ChunkBuffer prepareWriteHead(int i10) {
        ChunkBuffer chunkBuffer;
        if (getTailEndExclusive$ktor_io() - getTailPosition$ktor_io() < i10 || (chunkBuffer = this._tail) == null) {
            return appendNewChunk();
        }
        chunkBuffer.commitWrittenUntilIndex(this.tailPosition);
        return chunkBuffer;
    }

    public final void release() {
        close();
    }

    public final void setTailEndExclusive$ktor_io(int i10) {
        this.tailEndExclusive = i10;
    }

    /* renamed from: setTailMemory-3GNKZMM$ktor_io, reason: not valid java name */
    public final void m4529setTailMemory3GNKZMM$ktor_io(ByteBuffer byteBuffer) {
        e0.checkNotNullParameter(byteBuffer, "<set-?>");
        this.tailMemory = byteBuffer;
    }

    public final void setTailPosition$ktor_io(int i10) {
        this.tailPosition = i10;
    }

    public final ChunkBuffer stealAll$ktor_io() {
        ChunkBuffer chunkBuffer = this._head;
        if (chunkBuffer == null) {
            return null;
        }
        ChunkBuffer chunkBuffer2 = this._tail;
        if (chunkBuffer2 != null) {
            chunkBuffer2.commitWrittenUntilIndex(this.tailPosition);
        }
        this._head = null;
        this._tail = null;
        this.tailPosition = 0;
        this.tailEndExclusive = 0;
        this.tailInitialPosition = 0;
        this.chainedSize = 0;
        this.tailMemory = Memory.Companion.m4330getEmptySK3TCg8();
        return chunkBuffer;
    }

    public final int write(int i10, l block) {
        e0.checkNotNullParameter(block, "block");
        try {
            int iIntValue = ((Number) block.invoke(prepareWriteHead(i10))).intValue();
            if (iIntValue >= 0) {
                return iIntValue;
            }
            throw new IllegalStateException("The returned value shouldn't be negative");
        } finally {
            b0.finallyStart(1);
            afterHeadWrite();
            b0.finallyEnd(1);
        }
    }

    public final void writeByte(byte b10) throws InsufficientSpaceException {
        int i10 = this.tailPosition;
        if (i10 >= this.tailEndExclusive) {
            writeByteFallback(b10);
        } else {
            this.tailPosition = i10 + 1;
            this.tailMemory.put(i10, b10);
        }
    }

    public final void writeChunkBuffer$ktor_io(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "chunkBuffer");
        ChunkBuffer chunkBuffer2 = this._tail;
        if (chunkBuffer2 == null) {
            appendChain$ktor_io(chunkBuffer);
        } else {
            writePacketMerging(chunkBuffer2, chunkBuffer, this.pool);
        }
    }

    public final void writePacket(ByteReadPacket packet) {
        e0.checkNotNullParameter(packet, "packet");
        ChunkBuffer chunkBufferStealAll$ktor_io = packet.stealAll$ktor_io();
        if (chunkBufferStealAll$ktor_io == null) {
            packet.release();
            return;
        }
        ChunkBuffer chunkBuffer = this._tail;
        if (chunkBuffer == null) {
            appendChain$ktor_io(chunkBufferStealAll$ktor_io);
        } else {
            writePacketMerging(chunkBuffer, chunkBufferStealAll$ktor_io, packet.getPool());
        }
    }

    public Output() {
        this(ChunkBuffer.Companion.getPool());
    }

    @Override // java.lang.Appendable
    public Output append(char c10) {
        int i10 = this.tailPosition;
        int i11 = 3;
        if (this.tailEndExclusive - i10 >= 3) {
            ByteBuffer byteBuffer = this.tailMemory;
            if (c10 >= 0 && c10 < 128) {
                byteBuffer.put(i10, (byte) c10);
                i11 = 1;
            } else if (128 <= c10 && c10 < 2048) {
                byteBuffer.put(i10, (byte) (((c10 >> 6) & 31) | PsExtractor.AUDIO_STREAM));
                byteBuffer.put(i10 + 1, (byte) ((c10 & '?') | 128));
                i11 = 2;
            } else if (2048 <= c10 && c10 < 0) {
                byteBuffer.put(i10, (byte) (((c10 >> '\f') & 15) | 224));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) ((c10 & '?') | 128));
            } else {
                if (0 > c10 || c10 >= 0) {
                    UTF8Kt.malformedCodePoint(c10);
                    throw new k();
                }
                byteBuffer.put(i10, (byte) (((c10 >> 18) & 7) | PsExtractor.VIDEO_STREAM_MASK));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 3, (byte) ((c10 & '?') | 128));
                i11 = 4;
            }
            this.tailPosition = i10 + i11;
            return this;
        }
        appendCharFallback(c10);
        return this;
    }

    public final void writePacket(ByteReadPacket p10, int i10) throws EOFException {
        e0.checkNotNullParameter(p10, "p");
        while (i10 > 0) {
            int headEndExclusive = p10.getHeadEndExclusive() - p10.getHeadPosition();
            if (headEndExclusive <= i10) {
                i10 -= headEndExclusive;
                ChunkBuffer chunkBufferSteal$ktor_io = p10.steal$ktor_io();
                if (chunkBufferSteal$ktor_io == null) {
                    throw new EOFException("Unexpected end of packet");
                }
                appendSingleChunk$ktor_io(chunkBufferSteal$ktor_io);
            } else {
                ChunkBuffer chunkBufferPrepareRead = p10.prepareRead(1);
                if (chunkBufferPrepareRead != null) {
                    int readPosition = chunkBufferPrepareRead.getReadPosition();
                    try {
                        OutputKt.writeFully(this, chunkBufferPrepareRead, i10);
                        int readPosition2 = chunkBufferPrepareRead.getReadPosition();
                        if (readPosition2 >= readPosition) {
                            if (readPosition2 == chunkBufferPrepareRead.getWritePosition()) {
                                p10.ensureNext(chunkBufferPrepareRead);
                                return;
                            } else {
                                p10.setHeadPosition(readPosition2);
                                return;
                            }
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    } catch (Throwable th2) {
                        int readPosition3 = chunkBufferPrepareRead.getReadPosition();
                        if (readPosition3 >= readPosition) {
                            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                                p10.ensureNext(chunkBufferPrepareRead);
                            } else {
                                p10.setHeadPosition(readPosition3);
                            }
                            throw th2;
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                }
                throw g.q(1);
            }
        }
    }

    @Override // java.lang.Appendable
    public Output append(CharSequence charSequence) {
        if (charSequence == null) {
            append(AbstractJsonLexerKt.NULL, 0, 4);
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public Output append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return append(AbstractJsonLexerKt.NULL, i10, i11);
        }
        StringsKt.writeText(this, charSequence, i10, i11, sv.g.f86134b);
        return this;
    }

    public final Appendable append(char[] csq, int i10, int i11) {
        e0.checkNotNullParameter(csq, "csq");
        StringsKt.writeText(this, csq, i10, i11, sv.g.f86134b);
        return this;
    }

    public final void writePacket(ByteReadPacket p10, long j10) throws EOFException {
        e0.checkNotNullParameter(p10, "p");
        while (j10 > 0) {
            long headEndExclusive = p10.getHeadEndExclusive() - p10.getHeadPosition();
            if (headEndExclusive <= j10) {
                j10 -= headEndExclusive;
                ChunkBuffer chunkBufferSteal$ktor_io = p10.steal$ktor_io();
                if (chunkBufferSteal$ktor_io == null) {
                    throw new EOFException("Unexpected end of packet");
                }
                appendSingleChunk$ktor_io(chunkBufferSteal$ktor_io);
            } else {
                ChunkBuffer chunkBufferPrepareRead = p10.prepareRead(1);
                if (chunkBufferPrepareRead != null) {
                    int readPosition = chunkBufferPrepareRead.getReadPosition();
                    try {
                        OutputKt.writeFully(this, chunkBufferPrepareRead, (int) j10);
                        int readPosition2 = chunkBufferPrepareRead.getReadPosition();
                        if (readPosition2 >= readPosition) {
                            if (readPosition2 == chunkBufferPrepareRead.getWritePosition()) {
                                p10.ensureNext(chunkBufferPrepareRead);
                                return;
                            } else {
                                p10.setHeadPosition(readPosition2);
                                return;
                            }
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    } catch (Throwable th2) {
                        int readPosition3 = chunkBufferPrepareRead.getReadPosition();
                        if (readPosition3 >= readPosition) {
                            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                                p10.ensureNext(chunkBufferPrepareRead);
                            } else {
                                p10.setHeadPosition(readPosition3);
                            }
                            throw th2;
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                }
                throw g.q(1);
            }
        }
    }
}
