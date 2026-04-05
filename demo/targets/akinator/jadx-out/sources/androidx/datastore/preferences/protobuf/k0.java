package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f5930e;

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f5931f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5932g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5933h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5934i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5935j;

    /* renamed from: k, reason: collision with root package name */
    public long f5936k;

    public k0(ByteBuffer byteBuffer) {
        this.f5930e = byteBuffer;
        this.f5931f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long jB = j4.b(byteBuffer);
        this.f5932g = jB;
        long jPosition = byteBuffer.position() + jB;
        this.f5933h = jPosition;
        long jLimit = jB + byteBuffer.limit();
        this.f5934i = jLimit;
        this.f5935j = jLimit - 10;
        this.f5936k = jPosition;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void b(int i10, r2 r2Var, m3 m3Var) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) r2Var).b(m3Var));
        m3Var.writeTo(r2Var, this.f5949a);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void flush() {
        this.f5930e.position((int) (this.f5936k - this.f5932g));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public int getTotalBytesWritten() {
        return (int) (this.f5936k - this.f5933h);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public int spaceLeft() {
        return (int) (this.f5934i - this.f5936k);
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void write(byte b10) throws IOException {
        long j10 = this.f5936k;
        long j11 = this.f5934i;
        if (j10 >= j11) {
            throw new h0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f5936k), Long.valueOf(j11), 1));
        }
        this.f5936k = 1 + j10;
        j4.m(j10, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeBool(int i10, boolean z10) throws IOException {
        writeTag(i10, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeByteArray(int i10, byte[] bArr) throws IOException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeBytes(int i10, x xVar) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(xVar);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeBytesNoTag(x xVar) throws IOException {
        writeUInt32NoTag(xVar.size());
        xVar.n(this);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed32NoTag(int i10) throws IOException {
        this.f5931f.putInt((int) (this.f5936k - this.f5932g), i10);
        this.f5936k += 4;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed64NoTag(long j10) throws IOException {
        this.f5931f.putLong((int) (this.f5936k - this.f5932g), j10);
        this.f5936k += 8;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeMessage(int i10, r2 r2Var) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(r2Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeMessageNoTag(r2 r2Var) throws IOException {
        writeUInt32NoTag(r2Var.getSerializedSize());
        r2Var.writeTo(this);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeMessageSetExtension(int i10, r2 r2Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, r2Var);
        writeTag(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        write(byteBufferDuplicate);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeRawMessageSetExtension(int i10, x xVar) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeBytes(3, xVar);
        writeTag(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeStringNoTag(String str) throws IOException {
        long j10 = this.f5932g;
        ByteBuffer byteBuffer = this.f5931f;
        long j11 = this.f5936k;
        try {
            int iComputeUInt32SizeNoTag = l0.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = l0.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                int iE = m4.e(str);
                writeUInt32NoTag(iE);
                byteBuffer.position((int) (this.f5936k - j10));
                m4.d(str, byteBuffer);
                this.f5936k += iE;
                return;
            }
            int i10 = ((int) (this.f5936k - j10)) + iComputeUInt32SizeNoTag2;
            byteBuffer.position(i10);
            m4.d(str, byteBuffer);
            int iPosition = byteBuffer.position() - i10;
            writeUInt32NoTag(iPosition);
            this.f5936k += iPosition;
        } catch (l4 e10) {
            this.f5936k = j11;
            byteBuffer.position((int) (j11 - j10));
            a(str, e10);
        } catch (IllegalArgumentException e11) {
            throw new h0(e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new h0(e12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag((i10 << 3) | i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt32NoTag(int i10) throws IOException {
        if (this.f5936k <= this.f5935j) {
            while ((i10 & (-128)) != 0) {
                long j10 = this.f5936k;
                this.f5936k = j10 + 1;
                j4.m(j10, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            long j11 = this.f5936k;
            this.f5936k = 1 + j11;
            j4.m(j11, (byte) i10);
            return;
        }
        while (true) {
            long j12 = this.f5936k;
            long j13 = this.f5934i;
            if (j12 >= j13) {
                throw new h0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f5936k), Long.valueOf(j13), 1));
            }
            if ((i10 & (-128)) == 0) {
                this.f5936k = 1 + j12;
                j4.m(j12, (byte) i10);
                return;
            } else {
                this.f5936k = j12 + 1;
                j4.m(j12, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt64NoTag(long j10) throws IOException {
        if (this.f5936k <= this.f5935j) {
            while ((j10 & (-128)) != 0) {
                long j11 = this.f5936k;
                this.f5936k = j11 + 1;
                j4.m(j11, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            long j12 = this.f5936k;
            this.f5936k = 1 + j12;
            j4.m(j12, (byte) j10);
            return;
        }
        while (true) {
            long j13 = this.f5936k;
            long j14 = this.f5934i;
            if (j13 >= j14) {
                throw new h0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f5936k), Long.valueOf(j14), 1));
            }
            if ((j10 & (-128)) == 0) {
                this.f5936k = 1 + j13;
                j4.m(j13, (byte) j10);
                return;
            } else {
                this.f5936k = j13 + 1;
                j4.m(j13, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f5934i;
        if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
            long j11 = i11;
            long j12 = j10 - j11;
            long j13 = this.f5936k;
            if (j12 >= j13) {
                j4.f5924c.copyMemory(bArr, i10, j13, j11);
                this.f5936k += j11;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        throw new h0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f5936k), Long.valueOf(j10), Integer.valueOf(i11)));
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void write(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.f5931f;
        try {
            int iRemaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.f5936k - this.f5932g));
            byteBuffer2.put(byteBuffer);
            this.f5936k += iRemaining;
        } catch (BufferOverflowException e10) {
            throw new h0(e10);
        }
    }
}
