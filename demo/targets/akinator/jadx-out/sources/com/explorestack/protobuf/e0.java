package com.explorestack.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 extends a0 {

    /* renamed from: i, reason: collision with root package name */
    public final OutputStream f22066i;

    public e0(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f22066i = outputStream;
    }

    @Override // com.explorestack.protobuf.h0
    public final void c(int i10, MessageLite messageLite, ua uaVar) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) messageLite).getSerializedSize(uaVar));
        uaVar.writeTo(messageLite, this.f22186a);
    }

    @Override // com.explorestack.protobuf.h0
    public void flush() throws IOException {
        if (this.f21839g > 0) {
            i();
        }
    }

    public final void i() throws IOException {
        this.f22066i.write(this.f21837e, 0, this.f21839g);
        this.f21839g = 0;
    }

    public final void j(int i10) throws IOException {
        if (this.f21838f - this.f21839g < i10) {
            i();
        }
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void write(byte b10) throws IOException {
        if (this.f21839g == this.f21838f) {
            i();
        }
        int i10 = this.f21839g;
        this.f21839g = i10 + 1;
        this.f21837e[i10] = b10;
        this.f21840h++;
    }

    @Override // com.explorestack.protobuf.h0
    public void writeBool(int i10, boolean z10) throws IOException {
        j(11);
        f(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f21839g;
        this.f21839g = i11 + 1;
        this.f21837e[i11] = b10;
        this.f21840h++;
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
        j(14);
        f(i10, 5);
        d(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed32NoTag(int i10) throws IOException {
        j(4);
        d(i10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed64(int i10, long j10) throws IOException {
        j(18);
        f(i10, 1);
        e(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed64NoTag(long j10) throws IOException {
        j(8);
        e(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeInt32(int i10, int i11) throws IOException {
        j(20);
        f(i10, 0);
        if (i11 >= 0) {
            g(i11);
        } else {
            h(i11);
        }
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
        int iE;
        try {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = h0.computeUInt32SizeNoTag(length);
            int i10 = iComputeUInt32SizeNoTag + length;
            int i11 = this.f21838f;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iF = vc.f22784a.f(str, bArr, 0, length);
                writeUInt32NoTag(iF);
                writeLazy(bArr, 0, iF);
                return;
            }
            if (i10 > i11 - this.f21839g) {
                i();
            }
            int iComputeUInt32SizeNoTag2 = h0.computeUInt32SizeNoTag(str.length());
            int i12 = this.f21839g;
            byte[] bArr2 = this.f21837e;
            try {
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i13 = i12 + iComputeUInt32SizeNoTag2;
                        this.f21839g = i13;
                        int iF2 = vc.f22784a.f(str, bArr2, i13, i11 - i13);
                        this.f21839g = i12;
                        iE = (iF2 - i12) - iComputeUInt32SizeNoTag2;
                        g(iE);
                        this.f21839g = iF2;
                    } else {
                        iE = vc.e(str);
                        g(iE);
                        this.f21839g = vc.f22784a.f(str, bArr2, this.f21839g, iE);
                    }
                    this.f21840h += iE;
                } catch (uc e10) {
                    this.f21840h -= this.f21839g - i12;
                    this.f21839g = i12;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new d0(e11);
            }
        } catch (uc e12) {
            b(str, e12);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public void writeTag(int i10, int i11) throws IOException {
        writeUInt32NoTag((i10 << 3) | i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt32(int i10, int i11) throws IOException {
        j(20);
        f(i10, 0);
        g(i11);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt32NoTag(int i10) throws IOException {
        j(5);
        g(i10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt64(int i10, long j10) throws IOException {
        j(20);
        f(i10, 0);
        h(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt64NoTag(long j10) throws IOException {
        j(10);
        h(j10);
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
        int i12 = this.f21839g;
        int i13 = this.f21838f;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f21837e;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f21839g += i11;
            this.f21840h += i11;
            return;
        }
        int i15 = i13 - i12;
        System.arraycopy(bArr, i10, bArr2, i12, i15);
        int i16 = i10 + i15;
        int i17 = i11 - i15;
        this.f21839g = i13;
        this.f21840h += i15;
        i();
        if (i17 <= i13) {
            System.arraycopy(bArr, i16, bArr2, 0, i17);
            this.f21839g = i17;
        } else {
            this.f22066i.write(bArr, i16, i17);
        }
        this.f21840h += i17;
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void write(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i10 = this.f21839g;
        int i11 = this.f21838f;
        int i12 = i11 - i10;
        byte[] bArr = this.f21837e;
        if (i12 >= iRemaining) {
            byteBuffer.get(bArr, i10, iRemaining);
            this.f21839g += iRemaining;
            this.f21840h += iRemaining;
            return;
        }
        int i13 = i11 - i10;
        byteBuffer.get(bArr, i10, i13);
        int i14 = iRemaining - i13;
        this.f21839g = i11;
        this.f21840h += i13;
        i();
        while (i14 > i11) {
            byteBuffer.get(bArr, 0, i11);
            this.f22066i.write(bArr, 0, i11);
            i14 -= i11;
            this.f21840h += i11;
        }
        byteBuffer.get(bArr, 0, i14);
        this.f21839g = i14;
        this.f21840h += i14;
    }
}
