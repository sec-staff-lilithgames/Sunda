package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f5911e;

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f5912f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5913g;

    public j0(ByteBuffer byteBuffer) {
        this.f5911e = byteBuffer;
        this.f5912f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f5913g = byteBuffer.position();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void b(int i10, r2 r2Var, m3 m3Var) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) r2Var).b(m3Var));
        m3Var.writeTo(r2Var, this.f5949a);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void flush() {
        this.f5911e.position(this.f5912f.position());
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public int getTotalBytesWritten() {
        return this.f5912f.position() - this.f5913g;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public int spaceLeft() {
        return this.f5912f.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void write(byte b10) throws IOException {
        try {
            this.f5912f.put(b10);
        } catch (BufferOverflowException e10) {
            throw new h0(e10);
        }
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
        try {
            this.f5912f.putInt(i10);
        } catch (BufferOverflowException e10) {
            throw new h0(e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeFixed64NoTag(long j10) throws IOException {
        try {
            this.f5912f.putLong(j10);
        } catch (BufferOverflowException e10) {
            throw new h0(e10);
        }
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
        ByteBuffer byteBuffer = this.f5912f;
        int iPosition = byteBuffer.position();
        try {
            int iComputeUInt32SizeNoTag = l0.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = l0.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(m4.e(str));
                try {
                    m4.d(str, byteBuffer);
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw new h0(e10);
                }
            }
            int iPosition2 = byteBuffer.position() + iComputeUInt32SizeNoTag2;
            byteBuffer.position(iPosition2);
            try {
                m4.d(str, byteBuffer);
                int iPosition3 = byteBuffer.position();
                byteBuffer.position(iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                byteBuffer.position(iPosition3);
            } catch (IndexOutOfBoundsException e11) {
                throw new h0(e11);
            }
        } catch (l4 e12) {
            byteBuffer.position(iPosition);
            a(str, e12);
        } catch (IllegalArgumentException e13) {
            throw new h0(e13);
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
        while (true) {
            int i11 = i10 & (-128);
            ByteBuffer byteBuffer = this.f5912f;
            if (i11 == 0) {
                byteBuffer.put((byte) i10);
                return;
            }
            try {
                byteBuffer.put((byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new h0(e10);
            }
            throw new h0(e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void writeUInt64NoTag(long j10) throws IOException {
        while (true) {
            long j11 = (-128) & j10;
            ByteBuffer byteBuffer = this.f5912f;
            if (j11 == 0) {
                byteBuffer.put((byte) j10);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new h0(e10);
            }
            throw new h0(e10);
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
        try {
            this.f5912f.put(bArr, i10, i11);
        } catch (IndexOutOfBoundsException e10) {
            throw new h0(e10);
        } catch (BufferOverflowException e11) {
            throw new h0(e11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.i
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            this.f5912f.put(byteBuffer);
        } catch (BufferOverflowException e10) {
            throw new h0(e10);
        }
    }
}
