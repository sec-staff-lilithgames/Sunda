package com.explorestack.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f21910e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21911f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21912g;

    /* renamed from: h, reason: collision with root package name */
    public int f21913h;

    public b0(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i12 = i10 + i11;
        if ((i10 | i11 | (bArr.length - i12)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        this.f21910e = bArr;
        this.f21911f = i10;
        this.f21913h = i10;
        this.f21912g = i12;
    }

    @Override // com.explorestack.protobuf.h0
    public final void c(int i10, MessageLite messageLite, ua uaVar) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) messageLite).getSerializedSize(uaVar));
        uaVar.writeTo(messageLite, this.f22186a);
    }

    @Override // com.explorestack.protobuf.h0
    public final int getTotalBytesWritten() {
        return this.f21913h - this.f21911f;
    }

    @Override // com.explorestack.protobuf.h0
    public final int spaceLeft() {
        return this.f21912g - this.f21913h;
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public final void write(byte b10) throws IOException {
        try {
            byte[] bArr = this.f21910e;
            int i10 = this.f21913h;
            this.f21913h = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new d0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21913h), Integer.valueOf(this.f21912g), 1), e10);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeBool(int i10, boolean z10) throws IOException {
        writeTag(i10, 0);
        write(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeByteArray(int i10, byte[] bArr) throws IOException {
        writeByteArray(i10, bArr, 0, bArr.length);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
        writeUInt32NoTag(i11);
        write(bArr, i10, i11);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(byteBuffer.capacity());
        writeRawBytes(byteBuffer);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeBytes(int i10, ByteString byteString) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(byteString);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeBytesNoTag(ByteString byteString) throws IOException {
        writeUInt32NoTag(byteString.size());
        byteString.writeTo(this);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeFixed32NoTag(int i10) throws IOException {
        try {
            byte[] bArr = this.f21910e;
            int i11 = this.f21913h;
            int i12 = i11 + 1;
            this.f21913h = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f21913h = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f21913h = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f21913h = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new d0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21913h), Integer.valueOf(this.f21912g), 1), e10);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeFixed64NoTag(long j10) throws IOException {
        try {
            byte[] bArr = this.f21910e;
            int i10 = this.f21913h;
            int i11 = i10 + 1;
            this.f21913h = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f21913h = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f21913h = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f21913h = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f21913h = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f21913h = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f21913h = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f21913h = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new d0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21913h), Integer.valueOf(this.f21912g), 1), e10);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeUInt32NoTag(i10);
        } else {
            writeUInt64NoTag(i10);
        }
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(messageLite);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
        writeUInt32NoTag(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        write(byteBufferDuplicate);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeStringNoTag(String str) throws IOException {
        int i10 = this.f21913h;
        try {
            int iComputeUInt32SizeNoTag = h0.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = h0.computeUInt32SizeNoTag(str.length());
            byte[] bArr = this.f21910e;
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(vc.e(str));
                this.f21913h = vc.f22784a.f(str, bArr, this.f21913h, spaceLeft());
                return;
            }
            int i11 = i10 + iComputeUInt32SizeNoTag2;
            this.f21913h = i11;
            int iF = vc.f22784a.f(str, bArr, i11, spaceLeft());
            this.f21913h = i10;
            writeUInt32NoTag((iF - i10) - iComputeUInt32SizeNoTag2);
            this.f21913h = iF;
        } catch (uc e10) {
            this.f21913h = i10;
            b(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new d0(e11);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag((i10 << 3) | i11);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeUInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeUInt32NoTag(int i10) throws IOException {
        boolean z10 = h0.f22185d;
        byte[] bArr = this.f21910e;
        if (!z10 || f.a() || spaceLeft() < 5) {
            while ((i10 & (-128)) != 0) {
                try {
                    int i11 = this.f21913h;
                    this.f21913h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21913h), Integer.valueOf(this.f21912g), 1), e10);
                }
            }
            int i12 = this.f21913h;
            this.f21913h = i12 + 1;
            bArr[i12] = (byte) i10;
            return;
        }
        if ((i10 & (-128)) == 0) {
            int i13 = this.f21913h;
            this.f21913h = i13 + 1;
            sc.n(bArr, i13, (byte) i10);
            return;
        }
        int i14 = this.f21913h;
        this.f21913h = i14 + 1;
        sc.n(bArr, i14, (byte) (i10 | 128));
        int i15 = i10 >>> 7;
        if ((i15 & (-128)) == 0) {
            int i16 = this.f21913h;
            this.f21913h = i16 + 1;
            sc.n(bArr, i16, (byte) i15);
            return;
        }
        int i17 = this.f21913h;
        this.f21913h = i17 + 1;
        sc.n(bArr, i17, (byte) (i15 | 128));
        int i18 = i10 >>> 14;
        if ((i18 & (-128)) == 0) {
            int i19 = this.f21913h;
            this.f21913h = i19 + 1;
            sc.n(bArr, i19, (byte) i18);
            return;
        }
        int i20 = this.f21913h;
        this.f21913h = i20 + 1;
        sc.n(bArr, i20, (byte) (i18 | 128));
        int i21 = i10 >>> 21;
        if ((i21 & (-128)) == 0) {
            int i22 = this.f21913h;
            this.f21913h = i22 + 1;
            sc.n(bArr, i22, (byte) i21);
        } else {
            int i23 = this.f21913h;
            this.f21913h = i23 + 1;
            sc.n(bArr, i23, (byte) (i21 | 128));
            int i24 = this.f21913h;
            this.f21913h = i24 + 1;
            sc.n(bArr, i24, (byte) (i10 >>> 28));
        }
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeUInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeUInt64NoTag(long j10) throws IOException {
        boolean z10 = h0.f22185d;
        byte[] bArr = this.f21910e;
        if (z10 && spaceLeft() >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f21913h;
                this.f21913h = i10 + 1;
                sc.n(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.f21913h;
            this.f21913h = i11 + 1;
            sc.n(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.f21913h;
                this.f21913h = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new d0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21913h), Integer.valueOf(this.f21912g), 1), e10);
            }
        }
        int i13 = this.f21913h;
        this.f21913h = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    @Override // com.explorestack.protobuf.h0
    public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
        writeTag(i10, 2);
        writeByteArrayNoTag(bArr, i11, i12);
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
        write(byteBuffer);
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.f21910e, this.f21913h, i11);
            this.f21913h += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new d0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21913h), Integer.valueOf(this.f21912g), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public final void write(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.f21910e, this.f21913h, iRemaining);
            this.f21913h += iRemaining;
        } catch (IndexOutOfBoundsException e10) {
            throw new d0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21913h), Integer.valueOf(this.f21912g), Integer.valueOf(iRemaining)), e10);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public void flush() {
    }
}
