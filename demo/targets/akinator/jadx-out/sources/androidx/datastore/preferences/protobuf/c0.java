package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5826a;

    /* renamed from: b, reason: collision with root package name */
    public int f5827b = 100;

    /* renamed from: c, reason: collision with root package name */
    public int f5828c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public d0 f5829d;

    public static y a(byte[] bArr, int i10, int i11, boolean z10) {
        y yVar = new y(bArr, i10, i11, z10);
        try {
            yVar.pushLimit(i11);
            return yVar;
        } catch (u1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static c0 b(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        int i10 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new z(iterable, iRemaining, z10) : newInstance(new v1(iterable));
    }

    public static c0 c(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && j4.f5925d) {
            return new b0(byteBuffer, z10);
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

    public static c0 newInstance(InputStream inputStream) {
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
                throw u1.h();
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
                throw u1.h();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw u1.e();
    }

    public abstract void checkLastTagWas(int i10) throws u1;

    public void checkRecursionLimit() throws u1 {
        if (this.f5826a >= this.f5827b) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public abstract void enableAliasing(boolean z10);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i10);

    public abstract int pushLimit(int i10) throws u1;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract x readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends r2> T readGroup(int i10, a3 a3Var, s0 s0Var) throws IOException;

    public abstract void readGroup(int i10, q2 q2Var, s0 s0Var) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends r2> T readMessage(a3 a3Var, s0 s0Var) throws IOException;

    public abstract void readMessage(q2 q2Var, s0 s0Var) throws IOException;

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
    public abstract void readUnknownGroup(int i10, q2 q2Var) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Recursion limit cannot be negative: "));
        }
        int i11 = this.f5827b;
        this.f5827b = i10;
        return i11;
    }

    public abstract boolean skipField(int i10) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i10, l0 l0Var) throws IOException;

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.f5826a++;
            this.f5826a--;
        } while (skipField(tag));
    }

    public abstract void skipRawBytes(int i10) throws IOException;

    public static c0 newInstance(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? newInstance(t1.f6008c) : new a0(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public final int setSizeLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, TJzY.BBNTGmGVdfW));
        }
        int i11 = this.f5828c;
        this.f5828c = i10;
        return i11;
    }

    public static c0 newInstance(Iterable<ByteBuffer> iterable) {
        if (!j4.f5925d) {
            return newInstance(new v1(iterable));
        }
        return b(iterable, false);
    }

    public void skipMessage(l0 l0Var) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.f5826a++;
            this.f5826a--;
        } while (skipField(tag, l0Var));
    }

    public static c0 newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static c0 newInstance(byte[] bArr, int i10, int i11) {
        return a(bArr, i10, i11, false);
    }

    public static c0 newInstance(ByteBuffer byteBuffer) {
        return c(byteBuffer, false);
    }
}
