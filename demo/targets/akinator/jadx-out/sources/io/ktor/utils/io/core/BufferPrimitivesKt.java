package io.ktor.utils.io.core;

import a.b;
import b0.e2;
import be.nVUQ.UupKET;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.bits.PrimitiveArraysJvmKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import p0.o2;
import tu.g0;
import tu.i0;
import tu.k0;
import tu.m0;
import tu.o0;
import tu.q0;
import tu.t0;
import tu.v0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BufferPrimitivesKt {
    public static final void forEach(Buffer buffer, l block) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        for (int i10 = readPosition; i10 < writePosition; i10++) {
            block.invoke(Byte.valueOf(byteBufferM4458getMemorySK3TCg8.get(i10)));
        }
        buffer.discardExact(writePosition - readPosition);
    }

    public static final int readAvailable(Buffer buffer, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "offset shouldn't be negative: ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(b.e(i11, "length shouldn't be negative: ").toString());
        }
        if (i10 + i11 > destination.length) {
            StringBuilder sbF = i.f(i10, i11, "offset + length should be less than the destination size: ", " + ", " > ");
            sbF.append(destination.length);
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        if (buffer.getWritePosition() <= buffer.getReadPosition()) {
            return -1;
        }
        int iMin = Math.min(i11, buffer.getWritePosition() - buffer.getReadPosition());
        readFully(buffer, destination, i10, iMin);
        return iMin;
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        return readAvailable(buffer, bArr, i10, i11);
    }

    /* renamed from: readAvailable-Wt3Bwxc, reason: not valid java name */
    public static final int m4460readAvailableWt3Bwxc(Buffer readAvailable, short[] destination, int i10, int i11) {
        e0.checkNotNullParameter(readAvailable, "$this$readAvailable");
        e0.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i10, i11);
    }

    /* renamed from: readAvailable-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ int m4461readAvailableWt3Bwxc$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        return m4460readAvailableWt3Bwxc(buffer, sArr, i10, i11);
    }

    /* renamed from: readAvailable-o1GoV1E, reason: not valid java name */
    public static final int m4462readAvailableo1GoV1E(Buffer readAvailable, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(readAvailable, "$this$readAvailable");
        e0.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i10, i11);
    }

    /* renamed from: readAvailable-o1GoV1E$default, reason: not valid java name */
    public static /* synthetic */ int m4463readAvailableo1GoV1E$default(Buffer buffer, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = i0.m7046getSizeimpl(bArr) - i10;
        }
        return m4462readAvailableo1GoV1E(buffer, bArr, i10, i11);
    }

    /* renamed from: readAvailable-o2ZM2JE, reason: not valid java name */
    public static final int m4464readAvailableo2ZM2JE(Buffer readAvailable, int[] destination, int i10, int i11) {
        e0.checkNotNullParameter(readAvailable, "$this$readAvailable");
        e0.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i10, i11);
    }

    /* renamed from: readAvailable-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ int m4465readAvailableo2ZM2JE$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        return m4464readAvailableo2ZM2JE(buffer, iArr, i10, i11);
    }

    /* renamed from: readAvailable-pqYNikA, reason: not valid java name */
    public static final int m4466readAvailablepqYNikA(Buffer readAvailable, long[] destination, int i10, int i11) {
        e0.checkNotNullParameter(readAvailable, "$this$readAvailable");
        e0.checkNotNullParameter(destination, "destination");
        return readAvailable(readAvailable, destination, i10, i11);
    }

    /* renamed from: readAvailable-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ int m4467readAvailablepqYNikA$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        return m4466readAvailablepqYNikA(buffer, jArr, i10, i11);
    }

    public static final double readDouble(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readDouble((Buffer) chunkBuffer);
    }

    public static final <R> R readExact(Buffer buffer, int i10, String name, p block) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i10) {
            R r10 = (R) block.invoke(Memory.m4313boximpl(byteBufferM4458getMemorySK3TCg8), Integer.valueOf(readPosition));
            buffer.discardExact(i10);
            return r10;
        }
        throw new EOFException("Not enough bytes to read a " + name + " of size " + i10 + '.');
    }

    public static final float readFloat(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readFloat((Buffer) chunkBuffer);
    }

    public static final void readFully(ChunkBuffer chunkBuffer, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        readFully((Buffer) chunkBuffer, destination, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        readFully(buffer, bArr, i10, i11);
    }

    /* renamed from: readFully-Wt3Bwxc, reason: not valid java name */
    public static final void m4468readFullyWt3Bwxc(Buffer readFully, short[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i10, i11);
    }

    /* renamed from: readFully-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4469readFullyWt3Bwxc$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        m4468readFullyWt3Bwxc(buffer, sArr, i10, i11);
    }

    /* renamed from: readFully-o1GoV1E, reason: not valid java name */
    public static final void m4470readFullyo1GoV1E(Buffer readFully, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i10, i11);
    }

    /* renamed from: readFully-o1GoV1E$default, reason: not valid java name */
    public static /* synthetic */ void m4471readFullyo1GoV1E$default(Buffer buffer, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = i0.m7046getSizeimpl(bArr) - i10;
        }
        m4470readFullyo1GoV1E(buffer, bArr, i10, i11);
    }

    /* renamed from: readFully-o2ZM2JE, reason: not valid java name */
    public static final void m4472readFullyo2ZM2JE(Buffer readFully, int[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i10, i11);
    }

    /* renamed from: readFully-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4473readFullyo2ZM2JE$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        m4472readFullyo2ZM2JE(buffer, iArr, i10, i11);
    }

    /* renamed from: readFully-pqYNikA, reason: not valid java name */
    public static final void m4474readFullypqYNikA(Buffer readFully, long[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(readFully, "$this$readFully");
        e0.checkNotNullParameter(destination, "destination");
        readFully(readFully, destination, i10, i11);
    }

    /* renamed from: readFully-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4475readFullypqYNikA$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        m4474readFullypqYNikA(buffer, jArr, i10, i11);
    }

    public static final int readInt(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readInt((Buffer) chunkBuffer);
    }

    public static final long readLong(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readLong((Buffer) chunkBuffer);
    }

    public static final short readShort(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readShort((Buffer) chunkBuffer);
    }

    public static final byte readUByte(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return g0.m7031constructorimpl(buffer.readByte());
    }

    public static final int readUInt(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readUInt((Buffer) chunkBuffer);
    }

    public static final long readULong(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readULong((Buffer) chunkBuffer);
    }

    public static final short readUShort(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readUShort((Buffer) chunkBuffer);
    }

    public static final void writeDouble(ChunkBuffer chunkBuffer, double d10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        writeDouble((Buffer) chunkBuffer, d10);
    }

    public static final void writeExact(Buffer buffer, int i10, String name, p block) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(block, "block");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < i10) {
            throw new InsufficientSpaceException(name, i10, limit);
        }
        block.invoke(Memory.m4313boximpl(byteBufferM4458getMemorySK3TCg8), Integer.valueOf(writePosition));
        buffer.commitWritten(i10);
    }

    public static final void writeFloat(ChunkBuffer chunkBuffer, float f10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        writeFloat((Buffer) chunkBuffer, f10);
    }

    public static final void writeFully(ChunkBuffer chunkBuffer, byte[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        writeFully((Buffer) chunkBuffer, source, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, byte[] bArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        writeFully(buffer, bArr, i10, i11);
    }

    /* renamed from: writeFully-Wt3Bwxc, reason: not valid java name */
    public static final void m4476writeFullyWt3Bwxc(Buffer writeFully, short[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i10, i11);
    }

    /* renamed from: writeFully-Wt3Bwxc$default, reason: not valid java name */
    public static /* synthetic */ void m4477writeFullyWt3Bwxc$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = v0.m7121getSizeimpl(sArr) - i10;
        }
        m4476writeFullyWt3Bwxc(buffer, sArr, i10, i11);
    }

    /* renamed from: writeFully-o1GoV1E, reason: not valid java name */
    public static final void m4478writeFullyo1GoV1E(Buffer writeFully, byte[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i10, i11);
    }

    /* renamed from: writeFully-o1GoV1E$default, reason: not valid java name */
    public static /* synthetic */ void m4479writeFullyo1GoV1E$default(Buffer buffer, byte[] bArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = i0.m7046getSizeimpl(bArr) - i10;
        }
        m4478writeFullyo1GoV1E(buffer, bArr, i10, i11);
    }

    /* renamed from: writeFully-o2ZM2JE, reason: not valid java name */
    public static final void m4480writeFullyo2ZM2JE(Buffer writeFully, int[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i10, i11);
    }

    /* renamed from: writeFully-o2ZM2JE$default, reason: not valid java name */
    public static /* synthetic */ void m4481writeFullyo2ZM2JE$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = m0.m7071getSizeimpl(iArr) - i10;
        }
        m4480writeFullyo2ZM2JE(buffer, iArr, i10, i11);
    }

    /* renamed from: writeFully-pqYNikA, reason: not valid java name */
    public static final void m4482writeFullypqYNikA(Buffer writeFully, long[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeFully, "$this$writeFully");
        e0.checkNotNullParameter(source, "source");
        writeFully(writeFully, source, i10, i11);
    }

    /* renamed from: writeFully-pqYNikA$default, reason: not valid java name */
    public static /* synthetic */ void m4483writeFullypqYNikA$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q0.m7096getSizeimpl(jArr) - i10;
        }
        m4482writeFullypqYNikA(buffer, jArr, i10, i11);
    }

    public static final void writeInt(ChunkBuffer chunkBuffer, int i10) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        writeInt((Buffer) chunkBuffer, i10);
    }

    public static final void writeLong(ChunkBuffer chunkBuffer, long j10) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        writeLong((Buffer) chunkBuffer, j10);
    }

    public static final void writeShort(ChunkBuffer chunkBuffer, short s10) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        writeShort((Buffer) chunkBuffer, s10);
    }

    /* renamed from: writeUByte-EK-6454, reason: not valid java name */
    public static final void m4484writeUByteEK6454(Buffer writeUByte, byte b10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeUByte, "$this$writeUByte");
        writeUByte.writeByte(b10);
    }

    /* renamed from: writeUInt-Qn1smSk, reason: not valid java name */
    public static final void m4487writeUIntQn1smSk(ChunkBuffer writeUInt, int i10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeUInt, "$this$writeUInt");
        m4486writeUIntQn1smSk((Buffer) writeUInt, i10);
    }

    /* renamed from: writeULong-2TYgG_w, reason: not valid java name */
    public static final void m4489writeULong2TYgG_w(ChunkBuffer writeULong, long j10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeULong, "$this$writeULong");
        m4488writeULong2TYgG_w((Buffer) writeULong, j10);
    }

    /* renamed from: writeUShort-i8woANY, reason: not valid java name */
    public static final void m4491writeUShorti8woANY(ChunkBuffer writeUShort, short s10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeUShort, "$this$writeUShort");
        m4490writeUShorti8woANY((Buffer) writeUShort, s10);
    }

    public static /* synthetic */ int readAvailable$default(ChunkBuffer chunkBuffer, byte[] destination, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = destination.length - i10;
        }
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        return readAvailable((Buffer) chunkBuffer, destination, i10, i11);
    }

    public static final double readDouble(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 8) {
            throw new EOFException("Not enough bytes to read a long floating point number of size 8.");
        }
        Double dValueOf = Double.valueOf(byteBufferM4458getMemorySK3TCg8.getDouble(readPosition));
        buffer.discardExact(8);
        return dValueOf.doubleValue();
    }

    public static final float readFloat(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 4) {
            throw new EOFException("Not enough bytes to read a floating point number of size 4.");
        }
        Float fValueOf = Float.valueOf(byteBufferM4458getMemorySK3TCg8.getFloat(readPosition));
        buffer.discardExact(4);
        return fValueOf.floatValue();
    }

    public static final int readFully(Buffer buffer, Buffer dst, int i10) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 > dst.getLimit() - dst.getWritePosition()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < i10) {
            throw new EOFException(e2.h('.', "Not enough bytes to read a buffer content of size ", i10));
        }
        Memory.m4315copyToJT6ljtQ(byteBufferM4458getMemorySK3TCg8, dst.m4458getMemorySK3TCg8(), readPosition, i10, dst.getWritePosition());
        dst.commitWritten(i10);
        buffer.discardExact(i10);
        return i10;
    }

    public static /* synthetic */ void readFully$default(ChunkBuffer chunkBuffer, byte[] destination, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = destination.length - i10;
        }
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        readFully((Buffer) chunkBuffer, destination, i10, i11);
    }

    public static final int readInt(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 4) {
            throw new EOFException("Not enough bytes to read a regular integer of size 4.");
        }
        Integer numValueOf = Integer.valueOf(byteBufferM4458getMemorySK3TCg8.getInt(readPosition));
        buffer.discardExact(4);
        return numValueOf.intValue();
    }

    public static final long readLong(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 8) {
            throw new EOFException("Not enough bytes to read a long integer of size 8.");
        }
        Long lValueOf = Long.valueOf(byteBufferM4458getMemorySK3TCg8.getLong(readPosition));
        buffer.discardExact(8);
        return lValueOf.longValue();
    }

    public static final short readShort(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 2) {
            throw new EOFException("Not enough bytes to read a short integer of size 2.");
        }
        Short shValueOf = Short.valueOf(byteBufferM4458getMemorySK3TCg8.getShort(readPosition));
        buffer.discardExact(2);
        return shValueOf.shortValue();
    }

    public static final byte readUByte(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return readUByte((Buffer) chunkBuffer);
    }

    public static final int readUInt(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 4) {
            throw new EOFException("Not enough bytes to read a regular unsigned integer of size 4.");
        }
        k0 k0VarM7055boximpl = k0.m7055boximpl(k0.m7056constructorimpl(byteBufferM4458getMemorySK3TCg8.getInt(readPosition)));
        buffer.discardExact(4);
        return k0VarM7055boximpl.m7061unboximpl();
    }

    public static final long readULong(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 8) {
            throw new EOFException("Not enough bytes to read a long unsigned integer of size 8.");
        }
        o0 o0VarM7080boximpl = o0.m7080boximpl(o0.m7081constructorimpl(byteBufferM4458getMemorySK3TCg8.getLong(readPosition)));
        buffer.discardExact(8);
        return o0VarM7080boximpl.m7086unboximpl();
    }

    public static final short readUShort(Buffer buffer) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < 2) {
            throw new EOFException("Not enough bytes to read a short unsigned integer of size 2.");
        }
        t0 t0VarM7105boximpl = t0.m7105boximpl(t0.m7106constructorimpl(byteBufferM4458getMemorySK3TCg8.getShort(readPosition)));
        buffer.discardExact(2);
        return t0VarM7105boximpl.m7111unboximpl();
    }

    public static final void writeDouble(Buffer buffer, double d10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 8) {
            throw new InsufficientSpaceException("long floating point number", 8, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putDouble(writePosition, d10);
        buffer.commitWritten(8);
    }

    public static final void writeFloat(Buffer buffer, float f10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 4) {
            throw new InsufficientSpaceException("floating point number", 4, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putFloat(writePosition, f10);
        buffer.commitWritten(4);
    }

    public static final void writeFully(Buffer buffer, byte[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < i11) {
            throw new InsufficientSpaceException("byte array", i11, limit);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i10, i11).slice().order(java.nio.ByteOrder.BIG_ENDIAN);
        e0.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m4315copyToJT6ljtQ(Memory.m4314constructorimpl(byteBufferOrder), byteBufferM4458getMemorySK3TCg8, 0, i11, writePosition);
        buffer.commitWritten(i11);
    }

    public static /* synthetic */ void writeFully$default(ChunkBuffer chunkBuffer, byte[] source, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = source.length - i10;
        }
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        writeFully((Buffer) chunkBuffer, source, i10, i11);
    }

    public static final void writeInt(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 4) {
            throw new InsufficientSpaceException("regular integer", 4, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putInt(writePosition, i10);
        buffer.commitWritten(4);
    }

    public static final void writeLong(Buffer buffer, long j10) {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 8) {
            throw new InsufficientSpaceException("long integer", 8, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putLong(writePosition, j10);
        buffer.commitWritten(8);
    }

    public static final void writeShort(Buffer buffer, short s10) {
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 2) {
            throw new InsufficientSpaceException("short integer", 2, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putShort(writePosition, s10);
        buffer.commitWritten(2);
    }

    /* renamed from: writeUByte-EK-6454, reason: not valid java name */
    public static final void m4485writeUByteEK6454(ChunkBuffer writeUByte, byte b10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeUByte, "$this$writeUByte");
        m4484writeUByteEK6454((Buffer) writeUByte, b10);
    }

    /* renamed from: writeUInt-Qn1smSk, reason: not valid java name */
    public static final void m4486writeUIntQn1smSk(Buffer writeUInt, int i10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeUInt, "$this$writeUInt");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = writeUInt.m4458getMemorySK3TCg8();
        int writePosition = writeUInt.getWritePosition();
        int limit = writeUInt.getLimit() - writePosition;
        if (limit < 4) {
            throw new InsufficientSpaceException("regular unsigned integer", 4, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putInt(writePosition, i10);
        writeUInt.commitWritten(4);
    }

    /* renamed from: writeULong-2TYgG_w, reason: not valid java name */
    public static final void m4488writeULong2TYgG_w(Buffer buffer, long j10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, UupKET.hSJJFgND);
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit < 8) {
            throw new InsufficientSpaceException("long unsigned integer", 8, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putLong(writePosition, j10);
        buffer.commitWritten(8);
    }

    /* renamed from: writeUShort-i8woANY, reason: not valid java name */
    public static final void m4490writeUShorti8woANY(Buffer writeUShort, short s10) throws InsufficientSpaceException {
        e0.checkNotNullParameter(writeUShort, "$this$writeUShort");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = writeUShort.m4458getMemorySK3TCg8();
        int writePosition = writeUShort.getWritePosition();
        int limit = writeUShort.getLimit() - writePosition;
        if (limit < 2) {
            throw new InsufficientSpaceException("short unsigned integer", 2, limit);
        }
        byteBufferM4458getMemorySK3TCg8.putShort(writePosition, s10);
        writeUShort.commitWritten(2);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        writeFully(buffer, sArr, i10, i11);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        return readAvailable(buffer, sArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, short[] sArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length - i10;
        }
        readFully(buffer, sArr, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        writeFully(buffer, iArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        readFully(buffer, iArr, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        writeFully(buffer, jArr, i10, i11);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = iArr.length - i10;
        }
        return readAvailable(buffer, iArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        readFully(buffer, jArr, i10, i11);
    }

    public static final void writeFully(Buffer buffer, short[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 * 2;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i12) {
            PrimitiveArraysJvmKt.m4454storeShortArray9zorpBc(byteBufferM4458getMemorySK3TCg8, writePosition, source, i10, i11);
            buffer.commitWritten(i12);
            return;
        }
        throw new InsufficientSpaceException("short integers array", i12, limit);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, float[] fArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        writeFully(buffer, fArr, i10, i11);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length - i10;
        }
        return readAvailable(buffer, jArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, float[] fArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        readFully(buffer, fArr, i10, i11);
    }

    public static /* synthetic */ void writeFully$default(Buffer buffer, double[] dArr, int i10, int i11, int i12, Object obj) throws InsufficientSpaceException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        writeFully(buffer, dArr, i10, i11);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length - i10;
        }
        return readAvailable(buffer, fArr, i10, i11);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, double[] dArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        readFully(buffer, dArr, i10, i11);
    }

    public static /* synthetic */ int readFully$default(Buffer buffer, Buffer buffer2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = buffer2.getLimit() - buffer2.getWritePosition();
        }
        return readFully(buffer, buffer2, i10);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length - i10;
        }
        return readAvailable(buffer, dArr, i10, i11);
    }

    public static final void writeFully(Buffer buffer, int[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 * 4;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i12) {
            PrimitiveArraysJvmKt.m4446storeIntArray9zorpBc(byteBufferM4458getMemorySK3TCg8, writePosition, source, i10, i11);
            buffer.commitWritten(i12);
            return;
        }
        throw new InsufficientSpaceException("integers array", i12, limit);
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, Buffer buffer2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = buffer2.getLimit() - buffer2.getWritePosition();
        }
        return readAvailable(buffer, buffer2, i10);
    }

    public static final void writeFully(Buffer buffer, long[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 * 8;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i12) {
            PrimitiveArraysJvmKt.m4450storeLongArray9zorpBc(byteBufferM4458getMemorySK3TCg8, writePosition, source, i10, i11);
            buffer.commitWritten(i12);
            return;
        }
        throw new InsufficientSpaceException("long integers array", i12, limit);
    }

    public static final void readFully(Buffer buffer, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i11) {
            MemoryJvmKt.m4333copyTo9zorpBc(byteBufferM4458getMemorySK3TCg8, destination, readPosition, i11, i10);
            buffer.discardExact(i11);
            return;
        }
        throw new EOFException(e2.h('.', "Not enough bytes to read a byte array of size ", i11));
    }

    public static final void writeFully(Buffer buffer, float[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 * 4;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i12) {
            PrimitiveArraysJvmKt.m4442storeFloatArray9zorpBc(byteBufferM4458getMemorySK3TCg8, writePosition, source, i10, i11);
            buffer.commitWritten(i12);
            return;
        }
        throw new InsufficientSpaceException("floating point numbers array", i12, limit);
    }

    public static final void writeFully(Buffer buffer, double[] source, int i10, int i11) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(source, "source");
        int i12 = i11 * 8;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        if (limit >= i12) {
            PrimitiveArraysJvmKt.m4438storeDoubleArray9zorpBc(byteBufferM4458getMemorySK3TCg8, writePosition, source, i10, i11);
            buffer.commitWritten(i12);
            return;
        }
        throw new InsufficientSpaceException("floating point numbers array", i12, limit);
    }

    public static final void writeFully(Buffer buffer, Buffer src) throws InsufficientSpaceException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(src, "src");
        int writePosition = src.getWritePosition() - src.getReadPosition();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition2 = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition2;
        if (limit >= writePosition) {
            Memory.m4315copyToJT6ljtQ(src.m4458getMemorySK3TCg8(), byteBufferM4458getMemorySK3TCg8, src.getReadPosition(), writePosition, writePosition2);
            src.discardExact(writePosition);
            buffer.commitWritten(writePosition);
            return;
        }
        throw new InsufficientSpaceException("buffer readable content", writePosition, limit);
    }

    public static final void readFully(Buffer buffer, short[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        int i12 = i11 * 2;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i12) {
            PrimitiveArraysJvmKt.m4434loadShortArray9zorpBc(byteBufferM4458getMemorySK3TCg8, readPosition, destination, i10, i11);
            buffer.discardExact(i12);
            return;
        }
        throw new EOFException(e2.h('.', "Not enough bytes to read a short integers array of size ", i12));
    }

    public static final int readAvailable(ChunkBuffer chunkBuffer, byte[] destination, int i10, int i11) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        return readAvailable((Buffer) chunkBuffer, destination, i10, i11);
    }

    public static final int readAvailable(Buffer buffer, short[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "offset shouldn't be negative: ").toString());
        }
        if (i11 >= 0) {
            if (i10 + i11 <= destination.length) {
                if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                    return -1;
                }
                int iMin = Math.min(i11 / 2, buffer.getWritePosition() - buffer.getReadPosition());
                readFully(buffer, destination, i10, iMin);
                return iMin;
            }
            StringBuilder sbF = i.f(i10, i11, "offset + length should be less than the destination size: ", " + ", " > ");
            sbF.append(destination.length);
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        throw new IllegalArgumentException(b.e(i11, "length shouldn't be negative: ").toString());
    }

    public static final void writeFully(Buffer buffer, Buffer src, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(src, "src");
        if (i10 >= 0) {
            if (i10 <= src.getWritePosition() - src.getReadPosition()) {
                if (i10 <= buffer.getLimit() - buffer.getWritePosition()) {
                    ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
                    int writePosition = buffer.getWritePosition();
                    int limit = buffer.getLimit() - writePosition;
                    if (limit >= i10) {
                        Memory.m4315copyToJT6ljtQ(src.m4458getMemorySK3TCg8(), byteBufferM4458getMemorySK3TCg8, src.getReadPosition(), i10, writePosition);
                        src.discardExact(i10);
                        buffer.commitWritten(i10);
                        return;
                    }
                    throw new InsufficientSpaceException("buffer readable content", i10, limit);
                }
                StringBuilder sbT = o2.t(i10, "length shouldn't be greater than the destination write remaining space: ", " > ");
                sbT.append(buffer.getLimit() - buffer.getWritePosition());
                throw new IllegalArgumentException(sbT.toString().toString());
            }
            StringBuilder sbT2 = o2.t(i10, "length shouldn't be greater than the source read remaining: ", " > ");
            sbT2.append(src.getWritePosition() - src.getReadPosition());
            throw new IllegalArgumentException(sbT2.toString().toString());
        }
        throw new IllegalArgumentException(b.e(i10, "length shouldn't be negative: ").toString());
    }

    public static final void readFully(Buffer buffer, int[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        int i12 = i11 * 4;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i12) {
            PrimitiveArraysJvmKt.m4426loadIntArray9zorpBc(byteBufferM4458getMemorySK3TCg8, readPosition, destination, i10, i11);
            buffer.discardExact(i12);
            return;
        }
        throw new EOFException(e2.h('.', "Not enough bytes to read a integers array of size ", i12));
    }

    public static final void readFully(Buffer buffer, long[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        int i12 = i11 * 8;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i12) {
            PrimitiveArraysJvmKt.m4430loadLongArray9zorpBc(byteBufferM4458getMemorySK3TCg8, readPosition, destination, i10, i11);
            buffer.discardExact(i12);
            return;
        }
        throw new EOFException(e2.h('.', "Not enough bytes to read a long integers array of size ", i12));
    }

    public static final void readFully(Buffer buffer, float[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        int i12 = i11 * 4;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i12) {
            PrimitiveArraysJvmKt.m4422loadFloatArray9zorpBc(byteBufferM4458getMemorySK3TCg8, readPosition, destination, i10, i11);
            buffer.discardExact(i12);
            return;
        }
        throw new EOFException(e2.h('.', "Not enough bytes to read a floating point numbers array of size ", i12));
    }

    public static final int readAvailable(Buffer buffer, int[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "offset shouldn't be negative: ").toString());
        }
        if (i11 >= 0) {
            if (i10 + i11 <= destination.length) {
                if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                    return -1;
                }
                int iMin = Math.min(i11 / 4, buffer.getWritePosition() - buffer.getReadPosition());
                readFully(buffer, destination, i10, iMin);
                return iMin;
            }
            StringBuilder sbF = i.f(i10, i11, "offset + length should be less than the destination size: ", " + ", " > ");
            sbF.append(destination.length);
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        throw new IllegalArgumentException(b.e(i11, "length shouldn't be negative: ").toString());
    }

    public static final void readFully(Buffer buffer, double[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        int i12 = i11 * 8;
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i12) {
            PrimitiveArraysJvmKt.m4418loadDoubleArray9zorpBc(byteBufferM4458getMemorySK3TCg8, readPosition, destination, i10, i11);
            buffer.discardExact(i12);
            return;
        }
        throw new EOFException(e2.h('.', "Not enough bytes to read a floating point numbers array of size ", i12));
    }

    public static final int readAvailable(Buffer buffer, long[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "offset shouldn't be negative: ").toString());
        }
        if (i11 >= 0) {
            if (i10 + i11 <= destination.length) {
                if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                    return -1;
                }
                int iMin = Math.min(i11 / 8, buffer.getWritePosition() - buffer.getReadPosition());
                readFully(buffer, destination, i10, iMin);
                return iMin;
            }
            StringBuilder sbF = i.f(i10, i11, "offset + length should be less than the destination size: ", " + ", " > ");
            sbF.append(destination.length);
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        throw new IllegalArgumentException(b.e(i11, "length shouldn't be negative: ").toString());
    }

    public static final int readAvailable(Buffer buffer, float[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "offset shouldn't be negative: ").toString());
        }
        if (i11 >= 0) {
            if (i10 + i11 <= destination.length) {
                if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                    return -1;
                }
                int iMin = Math.min(i11 / 4, buffer.getWritePosition() - buffer.getReadPosition());
                readFully(buffer, destination, i10, iMin);
                return iMin;
            }
            StringBuilder sbF = i.f(i10, i11, "offset + length should be less than the destination size: ", " + ", " > ");
            sbF.append(destination.length);
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        throw new IllegalArgumentException(b.e(i11, "length shouldn't be negative: ").toString());
    }

    public static final int readAvailable(Buffer buffer, double[] destination, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(destination, "destination");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "offset shouldn't be negative: ").toString());
        }
        if (i11 >= 0) {
            if (i10 + i11 <= destination.length) {
                if (buffer.getWritePosition() <= buffer.getReadPosition()) {
                    return -1;
                }
                int iMin = Math.min(i11 / 8, buffer.getWritePosition() - buffer.getReadPosition());
                readFully(buffer, destination, i10, iMin);
                return iMin;
            }
            StringBuilder sbF = i.f(i10, i11, "offset + length should be less than the destination size: ", " + ", " > ");
            sbF.append(destination.length);
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        throw new IllegalArgumentException(b.e(i11, "length shouldn't be negative: ").toString());
    }

    public static final int readAvailable(Buffer buffer, Buffer dst, int i10) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        if (buffer.getWritePosition() <= buffer.getReadPosition()) {
            return -1;
        }
        int iMin = Math.min(dst.getLimit() - dst.getWritePosition(), Math.min(buffer.getWritePosition() - buffer.getReadPosition(), i10));
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= iMin) {
            Memory.m4315copyToJT6ljtQ(byteBufferM4458getMemorySK3TCg8, dst.m4458getMemorySK3TCg8(), readPosition, iMin, dst.getWritePosition());
            dst.commitWritten(iMin);
            buffer.discardExact(iMin);
            return iMin;
        }
        throw new EOFException(e2.h('.', "Not enough bytes to read a buffer content of size ", iMin));
    }
}
