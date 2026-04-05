package com.explorestack.protobuf;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f22141e;

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f22142f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22143g;

    /* renamed from: h, reason: collision with root package name */
    public final long f22144h;

    /* renamed from: i, reason: collision with root package name */
    public final long f22145i;

    /* renamed from: j, reason: collision with root package name */
    public final long f22146j;

    /* renamed from: k, reason: collision with root package name */
    public long f22147k;

    public g0(ByteBuffer byteBuffer) {
        this.f22141e = byteBuffer;
        this.f22142f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long jB = sc.b(byteBuffer);
        this.f22143g = jB;
        long jPosition = byteBuffer.position() + jB;
        this.f22144h = jPosition;
        long jLimit = jB + byteBuffer.limit();
        this.f22145i = jLimit;
        this.f22146j = jLimit - 10;
        this.f22147k = jPosition;
    }

    @Override // com.explorestack.protobuf.h0
    public final void c(int i10, MessageLite messageLite, ua uaVar) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) messageLite).getSerializedSize(uaVar));
        uaVar.writeTo(messageLite, this.f22186a);
    }

    @Override // com.explorestack.protobuf.h0
    public void flush() {
        this.f22141e.position((int) (this.f22147k - this.f22143g));
    }

    @Override // com.explorestack.protobuf.h0
    public int getTotalBytesWritten() {
        return (int) (this.f22147k - this.f22144h);
    }

    @Override // com.explorestack.protobuf.h0
    public int spaceLeft() {
        return (int) (this.f22145i - this.f22147k);
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void write(byte b10) throws IOException {
        long j10 = this.f22147k;
        long j11 = this.f22145i;
        if (j10 >= j11) {
            throw new d0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22147k), Long.valueOf(j11), 1));
        }
        this.f22147k = 1 + j10;
        sc.m(j10, b10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeBool(int i10, boolean z10) throws IOException {
        writeTag(i10, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeByteArray(int i10, byte[] bArr) throws IOException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeBytes(int i10, ByteString byteString) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeBytesNoTag(ByteString byteString) throws IOException {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed32NoTag(int i10) throws IOException {
        this.f22142f.putInt((int) (this.f22147k - this.f22143g), i10);
        this.f22147k += 4;
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed64NoTag(long j10) throws IOException {
        this.f22142f.putLong((int) (this.f22147k - this.f22143g), j10);
        this.f22147k += 8;
    }

    @Override // com.explorestack.protobuf.h0
    public void writeInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeMessage(int i10, MessageLite messageLite) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        write(byteBufferDuplicate);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeStringNoTag(String str) throws IOException {
        long j10 = this.f22143g;
        ByteBuffer byteBuffer = this.f22142f;
        long j11 = this.f22147k;
        try {
            int iComputeUInt32SizeNoTag = h0.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = h0.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                int iE = vc.e(str);
                writeUInt32NoTag(iE);
                byteBuffer.position((int) (this.f22147k - j10));
                vc.d(str, byteBuffer);
                this.f22147k += iE;
                return;
            }
            int i10 = ((int) (this.f22147k - j10)) + iComputeUInt32SizeNoTag2;
            byteBuffer.position(i10);
            vc.d(str, byteBuffer);
            int iPosition = byteBuffer.position() - i10;
            writeUInt32NoTag(iPosition);
            this.f22147k += iPosition;
        } catch (uc e10) {
            this.f22147k = j11;
            byteBuffer.position((int) (j11 - j10));
            b(str, e10);
        } catch (IllegalArgumentException e11) {
            throw new d0(e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new d0(e12);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag((i10 << 3) | i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt32NoTag(int i10) throws IOException {
        if (this.f22147k <= this.f22146j) {
            while ((i10 & (-128)) != 0) {
                long j10 = this.f22147k;
                this.f22147k = j10 + 1;
                sc.m(j10, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            long j11 = this.f22147k;
            this.f22147k = 1 + j11;
            sc.m(j11, (byte) i10);
            return;
        }
        while (true) {
            long j12 = this.f22147k;
            long j13 = this.f22145i;
            if (j12 >= j13) {
                throw new d0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22147k), Long.valueOf(j13), 1));
            }
            if ((i10 & (-128)) == 0) {
                this.f22147k = 1 + j12;
                sc.m(j12, (byte) i10);
                return;
            } else {
                this.f22147k = j12 + 1;
                sc.m(j12, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
        }
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt64NoTag(long j10) throws IOException {
        if (this.f22147k <= this.f22146j) {
            while ((j10 & (-128)) != 0) {
                long j11 = this.f22147k;
                this.f22147k = j11 + 1;
                sc.m(j11, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            long j12 = this.f22147k;
            this.f22147k = 1 + j12;
            sc.m(j12, (byte) j10);
            return;
        }
        while (true) {
            long j13 = this.f22147k;
            long j14 = this.f22145i;
            if (j13 >= j14) {
                throw new d0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22147k), Long.valueOf(j14), 1));
            }
            if ((j10 & (-128)) == 0) {
                this.f22147k = 1 + j13;
                sc.m(j13, (byte) j10);
                return;
            } else {
                this.f22147k = j13 + 1;
                sc.m(j13, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
        }
    }

    @Override // com.explorestack.protobuf.h0
    public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f22145i;
        if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
            long j11 = i11;
            long j12 = j10 - j11;
            long j13 = this.f22147k;
            if (j12 >= j13) {
                sc.f22643c.copyMemory(bArr, i10, j13, j11);
                this.f22147k += j11;
                return;
            }
        }
        if (bArr == null) {
            throw new NullPointerException("value");
        }
        throw new d0(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f22147k), Long.valueOf(j10), Integer.valueOf(i11)));
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void write(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.f22142f;
        try {
            int iRemaining = byteBuffer.remaining();
            byteBuffer2.position((int) (this.f22147k - this.f22143g));
            byteBuffer2.put(byteBuffer);
            this.f22147k += iRemaining;
        } catch (BufferOverflowException e10) {
            throw new d0(e10);
        }
    }
}
