package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends e0 {

    /* renamed from: i, reason: collision with root package name */
    public final OutputStream f5897i;

    public i0(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f5897i = outputStream;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void b(int i10, r2 r2Var, m3 m3Var) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) r2Var).b(m3Var));
        m3Var.writeTo(r2Var, this.f5949a);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void flush() throws IOException {
        if (this.f5858g > 0) {
            h();
        }
    }

    public final void h() throws IOException {
        this.f5897i.write(this.f5856e, 0, this.f5858g);
        this.f5858g = 0;
    }

    public final void i(int i10) throws IOException {
        if (this.f5857f - this.f5858g < i10) {
            h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void write(byte b10) throws IOException {
        if (this.f5858g == this.f5857f) {
            h();
        }
        int i10 = this.f5858g;
        this.f5858g = i10 + 1;
        this.f5856e[i10] = b10;
        this.f5859h++;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeBool(int i10, boolean z10) throws IOException {
        i(11);
        e(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f5858g;
        this.f5858g = i11 + 1;
        this.f5856e[i11] = b10;
        this.f5859h++;
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
        i(14);
        e(i10, 5);
        c(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed32NoTag(int i10) throws IOException {
        i(4);
        c(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed64(int i10, long j10) throws IOException {
        i(18);
        e(i10, 1);
        d(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed64NoTag(long j10) throws IOException {
        i(8);
        d(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeInt32(int i10, int i11) throws IOException {
        i(20);
        e(i10, 0);
        if (i11 >= 0) {
            f(i11);
        } else {
            g(i11);
        }
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
        int iE;
        try {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = l0.computeUInt32SizeNoTag(length);
            int i10 = iComputeUInt32SizeNoTag + length;
            int i11 = this.f5857f;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iK = m4.f5958a.k(str, bArr, 0, length);
                writeUInt32NoTag(iK);
                writeLazy(bArr, 0, iK);
                return;
            }
            if (i10 > i11 - this.f5858g) {
                h();
            }
            int iComputeUInt32SizeNoTag2 = l0.computeUInt32SizeNoTag(str.length());
            int i12 = this.f5858g;
            byte[] bArr2 = this.f5856e;
            try {
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i13 = i12 + iComputeUInt32SizeNoTag2;
                        this.f5858g = i13;
                        int iK2 = m4.f5958a.k(str, bArr2, i13, i11 - i13);
                        this.f5858g = i12;
                        iE = (iK2 - i12) - iComputeUInt32SizeNoTag2;
                        f(iE);
                        this.f5858g = iK2;
                    } else {
                        iE = m4.e(str);
                        f(iE);
                        this.f5858g = m4.f5958a.k(str, bArr2, this.f5858g, iE);
                    }
                    this.f5859h += iE;
                } catch (l4 e10) {
                    this.f5859h -= this.f5858g - i12;
                    this.f5858g = i12;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new h0(e11);
            }
        } catch (l4 e12) {
            a(str, e12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag((i10 << 3) | i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt32(int i10, int i11) throws IOException {
        i(20);
        e(i10, 0);
        f(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt32NoTag(int i10) throws IOException {
        i(5);
        f(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt64(int i10, long j10) throws IOException {
        i(20);
        e(i10, 0);
        g(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt64NoTag(long j10) throws IOException {
        i(10);
        g(j10);
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
        int i12 = this.f5858g;
        int i13 = this.f5857f;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f5856e;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f5858g += i11;
            this.f5859h += i11;
            return;
        }
        int i15 = i13 - i12;
        System.arraycopy(bArr, i10, bArr2, i12, i15);
        int i16 = i10 + i15;
        int i17 = i11 - i15;
        this.f5858g = i13;
        this.f5859h += i15;
        h();
        if (i17 <= i13) {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f5858g = i17;
        } else {
            this.f5897i.write(bArr, i16, i17);
        }
        this.f5859h += i17;
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void write(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i10 = this.f5858g;
        int i11 = this.f5857f;
        int i12 = i11 - i10;
        byte[] bArr = this.f5856e;
        if (i12 >= iRemaining) {
            byteBuffer.get(bArr, i10, iRemaining);
            this.f5858g += iRemaining;
            this.f5859h += iRemaining;
            return;
        }
        int i13 = i11 - i10;
        byteBuffer.get(bArr, i10, i13);
        int i14 = iRemaining - i13;
        this.f5858g = i11;
        this.f5859h += i13;
        h();
        while (i14 > i11) {
            byteBuffer.get(bArr, 0, i11);
            this.f5897i.write(bArr, 0, i11);
            i14 -= i11;
            this.f5859h += i11;
        }
        byteBuffer.get(bArr, 0, i14);
        this.f5858g = i14;
        this.f5859h += i14;
    }
}
