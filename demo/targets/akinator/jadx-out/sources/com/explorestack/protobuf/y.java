package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public int f22895a;

    /* renamed from: b, reason: collision with root package name */
    public int f22896b = 100;

    /* renamed from: c, reason: collision with root package name */
    public int f22897c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public z f22898d;

    public static u a(byte[] bArr, int i10, int i11, boolean z10) {
        u uVar = new u(bArr, i10, i11, z10);
        try {
            uVar.pushLimit(i11);
            return uVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static y b(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        int i10 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        if (i10 != 2) {
            return newInstance(new y7(iterable));
        }
        v vVar = new v();
        vVar.f22735l = Integer.MAX_VALUE;
        vVar.f22733j = iRemaining;
        vVar.f22728e = iterable;
        vVar.f22729f = iterable.iterator();
        vVar.f22731h = z10;
        vVar.f22737n = 0;
        vVar.f22738o = 0;
        if (iRemaining != 0) {
            vVar.k();
            return vVar;
        }
        vVar.f22730g = x7.f22884d;
        vVar.f22739p = 0L;
        vVar.f22740q = 0L;
        vVar.f22742s = 0L;
        vVar.f22741r = 0L;
        return vVar;
    }

    public static y c(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && sc.f22644d) {
            return new x(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return a(bArr, 0, iRemaining, true);
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static y newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i10) throws InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean z10);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i10);

    public abstract int pushLimit(int i10) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i10, fa faVar, m5 m5Var) throws IOException;

    public abstract void readGroup(int i10, MessageLite.Builder builder, m5 m5Var) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(fa faVar, m5 m5Var) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, m5 m5Var) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i10) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Recursion limit cannot be negative: "));
        }
        int i11 = this.f22896b;
        this.f22896b = i10;
        return i11;
    }

    public final int setSizeLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Size limit cannot be negative: "));
        }
        int i11 = this.f22897c;
        this.f22897c = i10;
        return i11;
    }

    public abstract boolean skipField(int i10) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i10, h0 h0Var) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(h0 h0Var) throws IOException;

    public abstract void skipRawBytes(int i10) throws IOException;

    public static y newInstance(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? newInstance(x7.f22883c) : new w(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static y newInstance(Iterable<ByteBuffer> iterable) {
        if (!sc.f22644d) {
            return newInstance(new y7(iterable));
        }
        return b(iterable, false);
    }

    public static y newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static y newInstance(byte[] bArr, int i10, int i11) {
        return a(bArr, i10, i11, false);
    }

    public static y newInstance(ByteBuffer byteBuffer) {
        return c(byteBuffer, false);
    }
}
