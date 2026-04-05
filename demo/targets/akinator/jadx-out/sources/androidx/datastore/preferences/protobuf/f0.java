package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5873e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5874f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5875g;

    /* renamed from: h, reason: collision with root package name */
    public int f5876h;

    public f0(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i12 = i10 + i11;
        if ((i10 | i11 | (bArr.length - i12)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        this.f5873e = bArr;
        this.f5874f = i10;
        this.f5876h = i10;
        this.f5875g = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void b(int i10, r2 r2Var, m3 m3Var) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) r2Var).b(m3Var));
        m3Var.writeTo(r2Var, this.f5949a);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final int getTotalBytesWritten() {
        return this.f5876h - this.f5874f;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final int spaceLeft() {
        return this.f5875g - this.f5876h;
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public final void write(byte b10) throws IOException {
        try {
            byte[] bArr = this.f5873e;
            int i10 = this.f5876h;
            this.f5876h = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeBool(int i10, boolean z10) throws IOException {
        writeTag(i10, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeByteArray(int i10, byte[] bArr) throws IOException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeBytes(int i10, x xVar) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(xVar);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeBytesNoTag(x xVar) throws IOException {
        writeUInt32NoTag(xVar.size());
        xVar.n(this);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeFixed32NoTag(int i10) throws IOException {
        try {
            byte[] bArr = this.f5873e;
            int i11 = this.f5876h;
            int i12 = i11 + 1;
            this.f5876h = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f5876h = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f5876h = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f5876h = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeFixed64NoTag(long j10) throws IOException {
        try {
            byte[] bArr = this.f5873e;
            int i10 = this.f5876h;
            int i11 = i10 + 1;
            this.f5876h = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f5876h = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f5876h = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f5876h = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f5876h = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f5876h = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f5876h = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f5876h = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeMessage(int i10, r2 r2Var) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(r2Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeMessageNoTag(r2 r2Var) throws IOException {
        writeUInt32NoTag(r2Var.getSerializedSize());
        r2Var.writeTo(this);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeMessageSetExtension(int i10, r2 r2Var) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, r2Var);
        writeTag(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        write(byteBufferDuplicate);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeRawMessageSetExtension(int i10, x xVar) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeBytes(3, xVar);
        writeTag(1, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeStringNoTag(String str) throws IOException {
        int i10 = this.f5876h;
        try {
            int iComputeUInt32SizeNoTag = l0.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = l0.computeUInt32SizeNoTag(str.length());
            byte[] bArr = this.f5873e;
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(m4.e(str));
                this.f5876h = m4.f5958a.k(str, bArr, this.f5876h, spaceLeft());
                return;
            }
            int i11 = i10 + iComputeUInt32SizeNoTag2;
            this.f5876h = i11;
            int iK = m4.f5958a.k(str, bArr, i11, spaceLeft());
            this.f5876h = i10;
            writeUInt32NoTag((iK - i10) - iComputeUInt32SizeNoTag2);
            this.f5876h = iK;
        } catch (l4 e10) {
            this.f5876h = i10;
            a(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new h0(e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag((i10 << 3) | i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeUInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeUInt32NoTag(int i10) throws IOException {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f5873e;
            if (i11 == 0) {
                int i12 = this.f5876h;
                this.f5876h = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f5876h;
                    this.f5876h = i13 + 1;
                    bArr[i13] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), 1), e10);
                }
            }
            throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), 1), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeUInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeUInt64NoTag(long j10) throws IOException {
        boolean z10 = l0.f5948d;
        byte[] bArr = this.f5873e;
        if (z10 && spaceLeft() >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f5876h;
                this.f5876h = i10 + 1;
                j4.n(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            int i11 = this.f5876h;
            this.f5876h = i11 + 1;
            j4.n(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.f5876h;
                this.f5876h = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) | 128) & 255);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), 1), e10);
            }
        }
        int i13 = this.f5876h;
        this.f5876h = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.f5873e, this.f5876h, i11);
            this.f5876h += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), Integer.valueOf(i11)), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public final void write(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.f5873e, this.f5876h, iRemaining);
            this.f5876h += iRemaining;
        } catch (IndexOutOfBoundsException e10) {
            throw new h0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5876h), Integer.valueOf(this.f5875g), Integer.valueOf(iRemaining)), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void flush() {
    }
}
