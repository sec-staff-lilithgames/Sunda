package io.ktor.utils.io.core;

import a.b;
import be.nVUQ.UupKET;
import com.inmobi.commons.core.configs.AdConfig;
import e3.g;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.MalformedUTF8InputException;
import io.ktor.utils.io.core.internal.UnsafeKt;
import io.ktor.utils.io.pool.ObjectPool;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import qv.v;
import tu.f;
import tu.k;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public abstract class Input implements Closeable {
    public static final Companion Companion = new Companion(null);
    private ChunkBuffer _head;
    private int headEndExclusive;
    private ByteBuffer headMemory;
    private int headPosition;
    private boolean noMoreChunksAvailable;
    private final ObjectPool<ChunkBuffer> pool;
    private long tailRemaining;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public Input() {
        this(null, 0L, null, 7, null);
    }

    private final void afterRead(ChunkBuffer chunkBuffer) {
        if (chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition() == 0) {
            releaseHead$ktor_io(chunkBuffer);
        }
    }

    private final void appendView(ChunkBuffer chunkBuffer) {
        ChunkBuffer chunkBufferFindTail = BuffersKt.findTail(this._head);
        if (chunkBufferFindTail != ChunkBuffer.Companion.getEmpty()) {
            chunkBufferFindTail.setNext(chunkBuffer);
            setTailRemaining(BuffersKt.remainingAll(chunkBuffer) + this.tailRemaining);
            return;
        }
        set_head(chunkBuffer);
        if (this.tailRemaining != 0) {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        ChunkBuffer next = chunkBuffer.getNext();
        setTailRemaining(next != null ? BuffersKt.remainingAll(next) : 0L);
    }

    private final Void atLeastMinCharactersRequire(int i10) throws EOFException {
        throw new EOFException(o2.k(i10, "at least ", " characters required but no bytes available"));
    }

    private final long discardAsMuchAsPossible(long j10, long j11) {
        ChunkBuffer chunkBufferPrepareRead;
        while (j10 != 0 && (chunkBufferPrepareRead = prepareRead(1)) != null) {
            int iMin = (int) Math.min(chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition(), j10);
            chunkBufferPrepareRead.discardExact(iMin);
            this.headPosition += iMin;
            afterRead(chunkBufferPrepareRead);
            long j12 = iMin;
            j10 -= j12;
            j11 += j12;
        }
        return j11;
    }

    private final ChunkBuffer doFill() {
        if (this.noMoreChunksAvailable) {
            return null;
        }
        ChunkBuffer chunkBufferFill = fill();
        if (chunkBufferFill == null) {
            this.noMoreChunksAvailable = true;
            return null;
        }
        appendView(chunkBufferFill);
        return chunkBufferFill;
    }

    private final boolean doPrefetch(long j10) {
        ChunkBuffer chunkBufferFindTail = BuffersKt.findTail(this._head);
        long headEndExclusive = (getHeadEndExclusive() - getHeadPosition()) + this.tailRemaining;
        do {
            ChunkBuffer chunkBufferFill = fill();
            if (chunkBufferFill == null) {
                this.noMoreChunksAvailable = true;
                return false;
            }
            int writePosition = chunkBufferFill.getWritePosition() - chunkBufferFill.getReadPosition();
            if (chunkBufferFindTail == ChunkBuffer.Companion.getEmpty()) {
                set_head(chunkBufferFill);
                chunkBufferFindTail = chunkBufferFill;
            } else {
                chunkBufferFindTail.setNext(chunkBufferFill);
                setTailRemaining(this.tailRemaining + writePosition);
            }
            headEndExclusive += writePosition;
        } while (headEndExclusive < j10);
        return true;
    }

    private final void fixGapAfterReadFallback(ChunkBuffer chunkBuffer) {
        if (this.noMoreChunksAvailable && chunkBuffer.getNext() == null) {
            this.headPosition = chunkBuffer.getReadPosition();
            this.headEndExclusive = chunkBuffer.getWritePosition();
            setTailRemaining(0L);
            return;
        }
        int writePosition = chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition();
        int iMin = Math.min(writePosition, 8 - (chunkBuffer.getCapacity() - chunkBuffer.getLimit()));
        if (writePosition > iMin) {
            fixGapAfterReadFallbackUnreserved(chunkBuffer, writePosition, iMin);
        } else {
            ChunkBuffer chunkBufferBorrow = this.pool.borrow();
            chunkBufferBorrow.reserveEndGap(8);
            chunkBufferBorrow.setNext(chunkBuffer.cleanNext());
            BufferAppendKt.writeBufferAppend(chunkBufferBorrow, chunkBuffer, writePosition);
            set_head(chunkBufferBorrow);
        }
        chunkBuffer.release(this.pool);
    }

    private final void fixGapAfterReadFallbackUnreserved(ChunkBuffer chunkBuffer, int i10, int i11) {
        ChunkBuffer chunkBufferBorrow = this.pool.borrow();
        ChunkBuffer chunkBufferBorrow2 = this.pool.borrow();
        chunkBufferBorrow.reserveEndGap(8);
        chunkBufferBorrow2.reserveEndGap(8);
        chunkBufferBorrow.setNext(chunkBufferBorrow2);
        chunkBufferBorrow2.setNext(chunkBuffer.cleanNext());
        BufferAppendKt.writeBufferAppend(chunkBufferBorrow, chunkBuffer, i10 - i11);
        BufferAppendKt.writeBufferAppend(chunkBufferBorrow2, chunkBuffer, i11);
        set_head(chunkBufferBorrow);
        setTailRemaining(BuffersKt.remainingAll(chunkBufferBorrow2));
    }

    public static /* synthetic */ void getHead$annotations() {
    }

    public static /* synthetic */ void getHeadEndExclusive$annotations() {
    }

    /* renamed from: getHeadMemory-SK3TCg8$annotations, reason: not valid java name */
    public static /* synthetic */ void m4495getHeadMemorySK3TCg8$annotations() {
    }

    public static /* synthetic */ void getHeadPosition$annotations() {
    }

    public static /* synthetic */ void getHeadRemaining$annotations() {
    }

    public static /* synthetic */ void getTailRemaining$annotations() {
    }

    private final Void minShouldBeLess(int i10, int i11) {
        throw new IllegalArgumentException(i.a(i10, i11, "min should be less or equal to max but min = ", ", max = "));
    }

    private final Void minSizeIsTooBig(int i10) {
        throw new IllegalStateException(o2.k(i10, "minSize of ", " is too big (should be less than 8)"));
    }

    private final Void notEnoughBytesAvailable(int i10) throws EOFException {
        throw new EOFException("Not enough data in packet (" + getRemaining() + ") to read " + i10 + " byte(s)");
    }

    /* renamed from: peekTo-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ long m4496peekTo9zorpBc$default(Input input, ByteBuffer byteBuffer, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if (obj == null) {
            return input.m4498peekTo9zorpBc(byteBuffer, j10, (i10 & 4) != 0 ? 0L : j11, (i10 & 8) != 0 ? 1L : j12, (i10 & 16) != 0 ? Long.MAX_VALUE : j13);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peekTo-9zorpBc");
    }

    private final Void prematureEndOfStreamChars(int i10, int i11) throws MalformedUTF8InputException {
        throw new MalformedUTF8InputException(i.a(i10, i11, "Premature end of stream: expected at least ", " chars but had only "));
    }

    private final ChunkBuffer prepareReadLoop(int i10, ChunkBuffer chunkBuffer) {
        while (true) {
            int headEndExclusive = getHeadEndExclusive() - getHeadPosition();
            if (headEndExclusive >= i10) {
                return chunkBuffer;
            }
            ChunkBuffer next = chunkBuffer.getNext();
            if (next == null && (next = doFill()) == null) {
                return null;
            }
            if (headEndExclusive == 0) {
                if (chunkBuffer != ChunkBuffer.Companion.getEmpty()) {
                    releaseHead$ktor_io(chunkBuffer);
                }
                chunkBuffer = next;
            } else {
                int iWriteBufferAppend = BufferAppendKt.writeBufferAppend(chunkBuffer, next, i10 - headEndExclusive);
                this.headEndExclusive = chunkBuffer.getWritePosition();
                setTailRemaining(this.tailRemaining - iWriteBufferAppend);
                if (next.getWritePosition() > next.getReadPosition()) {
                    next.reserveStartGap(iWriteBufferAppend);
                } else {
                    chunkBuffer.setNext(null);
                    chunkBuffer.setNext(next.cleanNext());
                    next.release(this.pool);
                }
                if (chunkBuffer.getWritePosition() - chunkBuffer.getReadPosition() >= i10) {
                    return chunkBuffer;
                }
                if (i10 > 8) {
                    minSizeIsTooBig(i10);
                    throw new k();
                }
            }
        }
    }

    private final int readASCII(Appendable appendable, int i10, int i11) throws Throwable {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (i11 == 0 && i10 == 0) {
            return 0;
        }
        if (getEndOfInput()) {
            if (i10 == 0) {
                return 0;
            }
            atLeastMinCharactersRequire(i10);
            throw new k();
        }
        if (i11 < i10) {
            minShouldBeLess(i10, i11);
            throw new k();
        }
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(this, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            i12 = 0;
        } else {
            i12 = 0;
            boolean z14 = false;
            while (true) {
                try {
                    ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareReadFirstHead.m4458getMemorySK3TCg8();
                    int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition();
                    for (int i13 = readPosition; i13 < writePosition; i13++) {
                        byte b10 = byteBufferM4458getMemorySK3TCg8.get(i13);
                        int i14 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if ((b10 & 128) != 128) {
                            char c10 = (char) i14;
                            if (i12 == i11) {
                                z12 = false;
                            } else {
                                appendable.append(c10);
                                i12++;
                                z12 = true;
                            }
                            if (z12) {
                            }
                        }
                        chunkBufferPrepareReadFirstHead.discardExact(i13 - readPosition);
                        z10 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead.discardExact(writePosition - readPosition);
                    z10 = true;
                    if (z10) {
                        z11 = true;
                    } else if (i12 == i11) {
                        z11 = false;
                    } else {
                        z11 = false;
                        z14 = true;
                    }
                    if (!z11) {
                        UnsafeKt.completeReadHead(this, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(this, chunkBufferPrepareReadFirstHead);
                        if (chunkBufferPrepareReadFirstHead == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z13) {
                            UnsafeKt.completeReadHead(this, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z13 = true;
                }
            }
            z13 = z14;
        }
        if (z13) {
            return i12 + readUtf8(appendable, i10 - i12, i11 - i12);
        }
        if (i12 >= i10) {
            return i12;
        }
        prematureEndOfStreamChars(i10, i12);
        throw new k();
    }

    private final int readAsMuchAsPossible(byte[] bArr, int i10, int i11, int i12) {
        while (i11 != 0) {
            ChunkBuffer chunkBufferPrepareRead = prepareRead(1);
            if (chunkBufferPrepareRead == null) {
                break;
            }
            int iMin = Math.min(i11, chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition());
            BufferPrimitivesKt.readFully((Buffer) chunkBufferPrepareRead, bArr, i10, iMin);
            this.headPosition = chunkBufferPrepareRead.getReadPosition();
            if (iMin == i11 && chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition() != 0) {
                return i12 + iMin;
            }
            afterRead(chunkBufferPrepareRead);
            i10 += iMin;
            i11 -= iMin;
            i12 += iMin;
        }
        return i12;
    }

    private final byte readByteSlow() throws EOFException {
        int i10 = this.headPosition;
        if (i10 < this.headEndExclusive) {
            byte b10 = this.headMemory.get(i10);
            this.headPosition = i10;
            ChunkBuffer chunkBuffer = this._head;
            chunkBuffer.discardUntilIndex$ktor_io(i10);
            ensureNext(chunkBuffer);
            return b10;
        }
        ChunkBuffer chunkBufferPrepareRead = prepareRead(1);
        if (chunkBufferPrepareRead == null) {
            throw g.q(1);
        }
        byte b11 = chunkBufferPrepareRead.readByte();
        UnsafeKt.completeReadHead(this, chunkBufferPrepareRead);
        return b11;
    }

    public static /* synthetic */ int readText$default(Input input, Appendable appendable, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(QCmNMSGd.jGWTbG);
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return input.readText(appendable, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r5.discardExact(r11 - r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int readUtf8(java.lang.Appendable r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.Input.readUtf8(java.lang.Appendable, int, int):int");
    }

    private final void set_head(ChunkBuffer chunkBuffer) {
        this._head = chunkBuffer;
        this.headMemory = chunkBuffer.m4458getMemorySK3TCg8();
        this.headPosition = chunkBuffer.getReadPosition();
        this.headEndExclusive = chunkBuffer.getWritePosition();
    }

    public final void append$ktor_io(ChunkBuffer chain) {
        e0.checkNotNullParameter(chain, "chain");
        ChunkBuffer.Companion companion = ChunkBuffer.Companion;
        if (chain == companion.getEmpty()) {
            return;
        }
        long jRemainingAll = BuffersKt.remainingAll(chain);
        if (this._head == companion.getEmpty()) {
            set_head(chain);
            setTailRemaining(jRemainingAll - (getHeadEndExclusive() - getHeadPosition()));
        } else {
            BuffersKt.findTail(this._head).setNext(chain);
            setTailRemaining(this.tailRemaining + jRemainingAll);
        }
    }

    public final boolean canRead() {
        return (this.headPosition == this.headEndExclusive && this.tailRemaining == 0) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
        if (!this.noMoreChunksAvailable) {
            this.noMoreChunksAvailable = true;
        }
        closeSource();
    }

    public abstract void closeSource();

    public final int discard(int i10) {
        if (i10 >= 0) {
            return discardAsMuchAsPossible(i10, 0);
        }
        throw new IllegalArgumentException(b.e(i10, "Negative discard is not allowed: ").toString());
    }

    public final void discardExact(int i10) {
        if (discard(i10) != i10) {
            throw new EOFException(o2.k(i10, "Unable to discard ", " bytes due to end of packet"));
        }
    }

    public final ChunkBuffer ensureNext(ChunkBuffer current) {
        e0.checkNotNullParameter(current, "current");
        return ensureNext(current, ChunkBuffer.Companion.getEmpty());
    }

    public final ChunkBuffer ensureNextHead$ktor_io(ChunkBuffer current) {
        e0.checkNotNullParameter(current, "current");
        return ensureNext(current);
    }

    public ChunkBuffer fill() {
        ChunkBuffer chunkBufferBorrow = this.pool.borrow();
        try {
            chunkBufferBorrow.reserveEndGap(8);
            int iMo4494fill62zg_DM = mo4494fill62zg_DM(chunkBufferBorrow.m4458getMemorySK3TCg8(), chunkBufferBorrow.getWritePosition(), chunkBufferBorrow.getLimit() - chunkBufferBorrow.getWritePosition());
            if (iMo4494fill62zg_DM == 0) {
                this.noMoreChunksAvailable = true;
                if (chunkBufferBorrow.getWritePosition() <= chunkBufferBorrow.getReadPosition()) {
                    chunkBufferBorrow.release(this.pool);
                    return null;
                }
            }
            chunkBufferBorrow.commitWritten(iMo4494fill62zg_DM);
            return chunkBufferBorrow;
        } catch (Throwable th2) {
            chunkBufferBorrow.release(this.pool);
            throw th2;
        }
    }

    /* renamed from: fill-62zg_DM */
    public abstract int mo4494fill62zg_DM(ByteBuffer byteBuffer, int i10, int i11);

    public final void fixGapAfterRead$ktor_io(ChunkBuffer current) {
        e0.checkNotNullParameter(current, "current");
        ChunkBuffer next = current.getNext();
        if (next == null) {
            fixGapAfterReadFallback(current);
            return;
        }
        int writePosition = current.getWritePosition() - current.getReadPosition();
        int iMin = Math.min(writePosition, 8 - (current.getCapacity() - current.getLimit()));
        if (next.getStartGap() < iMin) {
            fixGapAfterReadFallback(current);
            return;
        }
        BufferKt.restoreStartGap(next, iMin);
        if (writePosition > iMin) {
            current.releaseEndGap$ktor_io();
            this.headEndExclusive = current.getWritePosition();
            setTailRemaining(this.tailRemaining + iMin);
        } else {
            set_head(next);
            setTailRemaining(this.tailRemaining - ((next.getWritePosition() - next.getReadPosition()) - iMin));
            current.cleanNext();
            current.release(this.pool);
        }
    }

    public final boolean getEndOfInput() {
        if (getHeadEndExclusive() - getHeadPosition() == 0 && this.tailRemaining == 0) {
            return this.noMoreChunksAvailable || doFill() == null;
        }
        return false;
    }

    public final ChunkBuffer getHead() {
        ChunkBuffer chunkBuffer = this._head;
        chunkBuffer.discardUntilIndex$ktor_io(this.headPosition);
        return chunkBuffer;
    }

    public final int getHeadEndExclusive() {
        return this.headEndExclusive;
    }

    /* renamed from: getHeadMemory-SK3TCg8, reason: not valid java name */
    public final ByteBuffer m4497getHeadMemorySK3TCg8() {
        return this.headMemory;
    }

    public final int getHeadPosition() {
        return this.headPosition;
    }

    public final int getHeadRemaining() {
        return getHeadEndExclusive() - getHeadPosition();
    }

    public final ObjectPool<ChunkBuffer> getPool() {
        return this.pool;
    }

    public final long getRemaining() {
        return (getHeadEndExclusive() - getHeadPosition()) + this.tailRemaining;
    }

    public final long getTailRemaining() {
        return this.tailRemaining;
    }

    public final boolean hasBytes(int i10) {
        return ((long) (getHeadEndExclusive() - getHeadPosition())) + this.tailRemaining >= ((long) i10);
    }

    public final void markNoMoreChunksAvailable() {
        if (this.noMoreChunksAvailable) {
            return;
        }
        this.noMoreChunksAvailable = true;
    }

    public final int peekTo(ChunkBuffer buffer) {
        e0.checkNotNullParameter(buffer, "buffer");
        ChunkBuffer chunkBufferPrepareReadHead$ktor_io = prepareReadHead$ktor_io(1);
        if (chunkBufferPrepareReadHead$ktor_io == null) {
            return -1;
        }
        int iMin = Math.min(buffer.getLimit() - buffer.getWritePosition(), chunkBufferPrepareReadHead$ktor_io.getWritePosition() - chunkBufferPrepareReadHead$ktor_io.getReadPosition());
        BufferPrimitivesKt.writeFully(buffer, chunkBufferPrepareReadHead$ktor_io, iMin);
        return iMin;
    }

    /* renamed from: peekTo-9zorpBc, reason: not valid java name */
    public final long m4498peekTo9zorpBc(ByteBuffer byteBuffer, long j10, long j11, long j12, long j13) {
        ByteBuffer destination = byteBuffer;
        e0.checkNotNullParameter(destination, "destination");
        prefetch$ktor_io(j12 + j11);
        ChunkBuffer head = getHead();
        long jMin = Math.min(j13, destination.limit() - j10);
        long j14 = j10;
        ChunkBuffer next = head;
        long j15 = 0;
        long j16 = j11;
        while (j15 < j12 && j15 < jMin) {
            long writePosition = next.getWritePosition() - next.getReadPosition();
            if (writePosition > j16) {
                long jMin2 = Math.min(writePosition - j16, jMin - j15);
                Memory.m4316copyToJT6ljtQ(next.m4458getMemorySK3TCg8(), destination, next.getReadPosition() + j16, jMin2, j14);
                j15 += jMin2;
                j14 += jMin2;
                j16 = 0;
            } else {
                j16 -= writePosition;
            }
            next = next.getNext();
            if (next == null) {
                return j15;
            }
            destination = byteBuffer;
        }
        return j15;
    }

    public final boolean prefetch$ktor_io(long j10) {
        if (j10 <= 0) {
            return true;
        }
        long headEndExclusive = getHeadEndExclusive() - getHeadPosition();
        if (headEndExclusive >= j10 || headEndExclusive + this.tailRemaining >= j10) {
            return true;
        }
        return doPrefetch(j10);
    }

    public final ChunkBuffer prepareRead(int i10) {
        ChunkBuffer head = getHead();
        return this.headEndExclusive - this.headPosition >= i10 ? head : prepareReadLoop(i10, head);
    }

    public final ChunkBuffer prepareReadHead$ktor_io(int i10) {
        return prepareReadLoop(i10, getHead());
    }

    public final int readAvailableCharacters$ktor_io(final char[] destination, final int i10, int i11) {
        e0.checkNotNullParameter(destination, "destination");
        if (getEndOfInput()) {
            return -1;
        }
        return readText(new Appendable(i10, destination) { // from class: io.ktor.utils.io.core.Input$readAvailableCharacters$out$1
            final /* synthetic */ char[] $destination;
            private int idx;

            {
                this.$destination = destination;
                this.idx = i10;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c10) {
                char[] cArr = this.$destination;
                int i12 = this.idx;
                this.idx = i12 + 1;
                cArr[i12] = c10;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) {
                if (charSequence instanceof String) {
                    String str = (String) charSequence;
                    StringsJVMKt.getCharsInternal(str, this.$destination, this.idx);
                    this.idx = str.length() + this.idx;
                    return this;
                }
                if (charSequence != null) {
                    int length = charSequence.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        char[] cArr = this.$destination;
                        int i13 = this.idx;
                        this.idx = i13 + 1;
                        cArr[i13] = charSequence.charAt(i12);
                    }
                }
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i12, int i13) {
                throw new UnsupportedOperationException();
            }
        }, 0, i11);
    }

    public final byte readByte() {
        int i10 = this.headPosition;
        int i11 = i10 + 1;
        if (i11 >= this.headEndExclusive) {
            return readByteSlow();
        }
        this.headPosition = i11;
        return this.headMemory.get(i10);
    }

    public final int readText(Appendable out, int i10, int i11) throws IOException {
        e0.checkNotNullParameter(out, "out");
        if (i11 < getRemaining()) {
            return readASCII(out, i10, i11);
        }
        String textExactBytes$default = StringsKt.readTextExactBytes$default(this, (int) getRemaining(), (Charset) null, 2, (Object) null);
        out.append(textExactBytes$default);
        return textExactBytes$default.length();
    }

    public final void readTextExact(Appendable out, int i10) throws IOException {
        e0.checkNotNullParameter(out, "out");
        readText(out, i10, i10);
    }

    public final void release() {
        ChunkBuffer head = getHead();
        ChunkBuffer empty = ChunkBuffer.Companion.getEmpty();
        if (head != empty) {
            set_head(empty);
            setTailRemaining(0L);
            BuffersKt.releaseAll(head, this.pool);
        }
    }

    public final ChunkBuffer releaseHead$ktor_io(ChunkBuffer head) {
        e0.checkNotNullParameter(head, "head");
        ChunkBuffer chunkBufferCleanNext = head.cleanNext();
        if (chunkBufferCleanNext == null) {
            chunkBufferCleanNext = ChunkBuffer.Companion.getEmpty();
        }
        set_head(chunkBufferCleanNext);
        setTailRemaining(this.tailRemaining - (chunkBufferCleanNext.getWritePosition() - chunkBufferCleanNext.getReadPosition()));
        head.release(this.pool);
        return chunkBufferCleanNext;
    }

    public final void setHeadEndExclusive(int i10) {
        this.headEndExclusive = i10;
    }

    /* renamed from: setHeadMemory-3GNKZMM, reason: not valid java name */
    public final void m4499setHeadMemory3GNKZMM(ByteBuffer byteBuffer) {
        e0.checkNotNullParameter(byteBuffer, "<set-?>");
        this.headMemory = byteBuffer;
    }

    public final void setHeadPosition(int i10) {
        this.headPosition = i10;
    }

    public final void setTailRemaining(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "tailRemaining shouldn't be negative: ").toString());
        }
        this.tailRemaining = j10;
    }

    public final ChunkBuffer steal$ktor_io() {
        ChunkBuffer head = getHead();
        ChunkBuffer next = head.getNext();
        ChunkBuffer empty = ChunkBuffer.Companion.getEmpty();
        if (head == empty) {
            return null;
        }
        if (next == null) {
            set_head(empty);
            setTailRemaining(0L);
        } else {
            set_head(next);
            setTailRemaining(this.tailRemaining - (next.getWritePosition() - next.getReadPosition()));
        }
        head.setNext(null);
        return head;
    }

    public final ChunkBuffer stealAll$ktor_io() {
        ChunkBuffer head = getHead();
        ChunkBuffer empty = ChunkBuffer.Companion.getEmpty();
        if (head == empty) {
            return null;
        }
        set_head(empty);
        setTailRemaining(0L);
        return head;
    }

    public final int tryPeek() {
        ChunkBuffer chunkBufferPrepareReadLoop;
        ChunkBuffer head = getHead();
        if (getHeadEndExclusive() - getHeadPosition() > 0) {
            return head.tryPeekByte();
        }
        if ((this.tailRemaining == 0 && this.noMoreChunksAvailable) || (chunkBufferPrepareReadLoop = prepareReadLoop(1, head)) == null) {
            return -1;
        }
        return chunkBufferPrepareReadLoop.tryPeekByte();
    }

    public final boolean tryWriteAppend$ktor_io(ChunkBuffer chain) {
        e0.checkNotNullParameter(chain, "chain");
        ChunkBuffer chunkBufferFindTail = BuffersKt.findTail(getHead());
        int writePosition = chain.getWritePosition() - chain.getReadPosition();
        if (writePosition == 0 || chunkBufferFindTail.getLimit() - chunkBufferFindTail.getWritePosition() < writePosition) {
            return false;
        }
        BufferAppendKt.writeBufferAppend(chunkBufferFindTail, chain, writePosition);
        if (getHead() == chunkBufferFindTail) {
            this.headEndExclusive = chunkBufferFindTail.getWritePosition();
            return true;
        }
        setTailRemaining(this.tailRemaining + writePosition);
        return true;
    }

    public Input(ChunkBuffer head, long j10, ObjectPool<ChunkBuffer> pool) {
        e0.checkNotNullParameter(head, "head");
        e0.checkNotNullParameter(pool, "pool");
        this.pool = pool;
        this._head = head;
        this.headMemory = head.m4458getMemorySK3TCg8();
        this.headPosition = head.getReadPosition();
        this.headEndExclusive = head.getWritePosition();
        this.tailRemaining = j10 - (r3 - this.headPosition);
    }

    public static /* synthetic */ String readText$default(Input input, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return input.readText(i10, i11);
    }

    public final String readTextExact(int i10) {
        return readText(i10, i10);
    }

    private final ChunkBuffer ensureNext(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2) {
        while (chunkBuffer != chunkBuffer2) {
            ChunkBuffer chunkBufferCleanNext = chunkBuffer.cleanNext();
            chunkBuffer.release(this.pool);
            if (chunkBufferCleanNext == null) {
                set_head(chunkBuffer2);
                setTailRemaining(0L);
                chunkBuffer = chunkBuffer2;
            } else {
                if (chunkBufferCleanNext.getWritePosition() > chunkBufferCleanNext.getReadPosition()) {
                    set_head(chunkBufferCleanNext);
                    setTailRemaining(this.tailRemaining - (chunkBufferCleanNext.getWritePosition() - chunkBufferCleanNext.getReadPosition()));
                    return chunkBufferCleanNext;
                }
                chunkBuffer = chunkBufferCleanNext;
            }
        }
        return doFill();
    }

    public final ChunkBuffer prepareRead(int i10, ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, UupKET.qvooPQMXSxvZjtO);
        return this.headEndExclusive - this.headPosition >= i10 ? chunkBuffer : prepareReadLoop(i10, chunkBuffer);
    }

    public final String readText(int i10, int i11) throws Throwable {
        if (i10 == 0 && (i11 == 0 || getEndOfInput())) {
            return "";
        }
        long remaining = getRemaining();
        if (remaining > 0 && i11 >= remaining) {
            return StringsKt.readTextExactBytes$default(this, (int) remaining, (Charset) null, 2, (Object) null);
        }
        StringBuilder sb2 = new StringBuilder(v.coerceAtMost(v.coerceAtLeast(i10, 16), i11));
        readASCII(sb2, i10, i11);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    private final int discardAsMuchAsPossible(int i10, int i11) {
        while (i10 != 0) {
            ChunkBuffer chunkBufferPrepareRead = prepareRead(1);
            if (chunkBufferPrepareRead == null) {
                break;
            }
            int iMin = Math.min(chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition(), i10);
            chunkBufferPrepareRead.discardExact(iMin);
            this.headPosition += iMin;
            afterRead(chunkBufferPrepareRead);
            i10 -= iMin;
            i11 += iMin;
        }
        return i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Input(ChunkBuffer chunkBuffer, long j10, ObjectPool objectPool, int i10, u uVar) {
        chunkBuffer = (i10 & 1) != 0 ? ChunkBuffer.Companion.getEmpty() : chunkBuffer;
        this(chunkBuffer, (i10 & 2) != 0 ? BuffersKt.remainingAll(chunkBuffer) : j10, (i10 & 4) != 0 ? ChunkBuffer.Companion.getPool() : objectPool);
    }

    public final long discard(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        return discardAsMuchAsPossible(j10, 0L);
    }
}
