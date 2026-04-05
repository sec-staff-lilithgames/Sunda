package io.ktor.utils.io.core;

import a.b;
import com.inmobi.commons.core.configs.AdConfig;
import e3.g;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import sv.e;
import tu.f;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public class Buffer {
    public static final Companion Companion = new Companion(null);
    public static final int ReservedSize = 8;
    private final int capacity;
    private int limit;
    private final ByteBuffer memory;
    private int readPosition;
    private int startGap;
    private int writePosition;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Buffer getEmpty() {
            return ChunkBuffer.Companion.getEmpty();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Buffer(ByteBuffer byteBuffer, u uVar) {
        this(byteBuffer);
    }

    public static /* synthetic */ void discardExact$default(Buffer buffer, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: discardExact");
        }
        if ((i11 & 1) != 0) {
            i10 = buffer.getWritePosition() - buffer.getReadPosition();
        }
        buffer.discardExact(i10);
    }

    public static /* synthetic */ void rewind$default(Buffer buffer, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rewind");
        }
        if ((i11 & 1) != 0) {
            i10 = buffer.readPosition - buffer.startGap;
        }
        buffer.rewind(i10);
    }

    public final void commitWritten(int i10) {
        int i11 = this.writePosition + i10;
        if (i10 < 0 || i11 > this.limit) {
            BufferKt.commitWrittenFailed(i10, getLimit() - getWritePosition());
            throw new k();
        }
        this.writePosition = i11;
    }

    public final boolean commitWrittenUntilIndex(int i10) {
        int i11 = this.limit;
        int i12 = this.writePosition;
        if (i10 < i12) {
            BufferKt.commitWrittenFailed(i10 - i12, getLimit() - getWritePosition());
            throw new k();
        }
        if (i10 < i11) {
            this.writePosition = i10;
            return true;
        }
        if (i10 == i11) {
            this.writePosition = i10;
            return false;
        }
        BufferKt.commitWrittenFailed(i10 - i12, getLimit() - getWritePosition());
        throw new k();
    }

    public final void discardExact(int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = this.readPosition + i10;
        if (i10 < 0 || i11 > this.writePosition) {
            BufferKt.discardFailed(i10, getWritePosition() - getReadPosition());
            throw new k();
        }
        this.readPosition = i11;
    }

    public final void discardUntilIndex$ktor_io(int i10) {
        if (i10 < 0 || i10 > this.writePosition) {
            BufferKt.discardFailed(i10 - this.readPosition, getWritePosition() - getReadPosition());
            throw new k();
        }
        if (this.readPosition != i10) {
            this.readPosition = i10;
        }
    }

    public Buffer duplicate() {
        Buffer buffer = new Buffer(this.memory, null);
        buffer.duplicateTo(buffer);
        return buffer;
    }

    public void duplicateTo(Buffer copy) {
        e0.checkNotNullParameter(copy, "copy");
        copy.limit = this.limit;
        copy.startGap = this.startGap;
        copy.readPosition = this.readPosition;
        copy.writePosition = this.writePosition;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final int getEndGap() {
        return getCapacity() - getLimit();
    }

    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: getMemory-SK3TCg8, reason: not valid java name */
    public final ByteBuffer m4458getMemorySK3TCg8() {
        return this.memory;
    }

    public final int getReadPosition() {
        return this.readPosition;
    }

    public final int getReadRemaining() {
        return getWritePosition() - getReadPosition();
    }

    public final int getStartGap() {
        return this.startGap;
    }

    public final int getWritePosition() {
        return this.writePosition;
    }

    public final int getWriteRemaining() {
        return getLimit() - getWritePosition();
    }

    public final byte readByte() throws EOFException {
        int i10 = this.readPosition;
        if (i10 == this.writePosition) {
            throw new EOFException("No readable bytes available.");
        }
        this.readPosition = i10 + 1;
        return this.memory.get(i10);
    }

    public final void releaseEndGap$ktor_io() {
        this.limit = this.capacity;
    }

    public final void releaseGaps$ktor_io() {
        releaseStartGap$ktor_io(0);
        releaseEndGap$ktor_io();
    }

    public final void releaseStartGap$ktor_io(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "newReadPosition shouldn't be negative: ").toString());
        }
        if (i10 > this.readPosition) {
            StringBuilder sbT = o2.t(i10, "newReadPosition shouldn't be ahead of the read position: ", " > ");
            sbT.append(this.readPosition);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        this.readPosition = i10;
        if (this.startGap > i10) {
            this.startGap = i10;
        }
    }

    public final void reserveEndGap(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "endGap shouldn't be negative: ").toString());
        }
        int i11 = this.capacity - i10;
        if (i11 >= this.writePosition) {
            this.limit = i11;
            return;
        }
        if (i11 < 0) {
            BufferKt.endGapReservationFailedDueToCapacity(this, i10);
        }
        if (i11 < this.startGap) {
            BufferKt.endGapReservationFailedDueToStartGap(this, i10);
        }
        if (this.readPosition != this.writePosition) {
            BufferKt.endGapReservationFailedDueToContent(this, i10);
            return;
        }
        this.limit = i11;
        this.readPosition = i11;
        this.writePosition = i11;
    }

    public final void reserveStartGap(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "startGap shouldn't be negative: ").toString());
        }
        int i11 = this.readPosition;
        if (i11 >= i10) {
            this.startGap = i10;
            return;
        }
        if (i11 != this.writePosition) {
            BufferKt.startGapReservationFailed(this, i10);
            throw new k();
        }
        if (i10 > this.limit) {
            BufferKt.startGapReservationFailedDueToLimit(this, i10);
            throw new k();
        }
        this.writePosition = i10;
        this.readPosition = i10;
        this.startGap = i10;
    }

    public void reset() {
        releaseGaps$ktor_io();
        resetForWrite();
    }

    public final void resetForRead() {
        this.startGap = 0;
        this.readPosition = 0;
        this.writePosition = this.capacity;
    }

    public final void resetForWrite() {
        resetForWrite(this.capacity - this.startGap);
    }

    public final void rewind(int i10) {
        int i11 = this.readPosition;
        int i12 = i11 - i10;
        int i13 = this.startGap;
        if (i12 >= i13) {
            this.readPosition = i12;
        } else {
            BufferKt.rewindFailed(i10, i11 - i13);
            throw new k();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Buffer[0x");
        String string = Integer.toString(hashCode(), e.checkRadix(16));
        e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        sb2.append("](");
        sb2.append(getWritePosition() - getReadPosition());
        sb2.append(" used, ");
        sb2.append(getLimit() - getWritePosition());
        sb2.append(" free, ");
        sb2.append((getCapacity() - getLimit()) + this.startGap);
        sb2.append(" reserved of ");
        return g.m(sb2, this.capacity, ')');
    }

    public final int tryPeekByte() {
        int i10 = this.readPosition;
        if (i10 == this.writePosition) {
            return -1;
        }
        return this.memory.get(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int tryReadByte() {
        int i10 = this.readPosition;
        if (i10 == this.writePosition) {
            return -1;
        }
        this.readPosition = i10 + 1;
        return this.memory.get(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final void writeByte(byte b10) throws InsufficientSpaceException {
        int i10 = this.writePosition;
        if (i10 == this.limit) {
            throw new InsufficientSpaceException("No free space in the buffer to write a byte");
        }
        this.memory.put(i10, b10);
        this.writePosition = i10 + 1;
    }

    private Buffer(ByteBuffer memory) {
        e0.checkNotNullParameter(memory, "memory");
        this.memory = memory;
        this.limit = memory.limit();
        this.capacity = memory.limit();
    }

    public final void resetForWrite(int i10) {
        int i11 = this.startGap;
        this.readPosition = i11;
        this.writePosition = i11;
        this.limit = i10;
    }
}
