package com.explorestack.protobuf;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f22101e;

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f22102f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22103g;

    public f0(ByteBuffer byteBuffer) {
        this.f22101e = byteBuffer;
        this.f22102f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.f22103g = byteBuffer.position();
    }

    @Override // com.explorestack.protobuf.h0
    public final void c(int i10, MessageLite messageLite, ua uaVar) throws IOException {
        writeTag(i10, 2);
        writeUInt32NoTag(((b) messageLite).getSerializedSize(uaVar));
        uaVar.writeTo(messageLite, this.f22186a);
    }

    @Override // com.explorestack.protobuf.h0
    public void flush() {
        this.f22101e.position(this.f22102f.position());
    }

    @Override // com.explorestack.protobuf.h0
    public int getTotalBytesWritten() {
        return this.f22102f.position() - this.f22103g;
    }

    @Override // com.explorestack.protobuf.h0
    public int spaceLeft() {
        return this.f22102f.remaining();
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void write(byte b10) throws IOException {
        try {
            this.f22102f.put(b10);
        } catch (BufferOverflowException e10) {
            throw new d0(e10);
        }
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
        try {
            this.f22102f.putInt(i10);
        } catch (BufferOverflowException e10) {
            throw new d0(e10);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeFixed64NoTag(long j10) throws IOException {
        try {
            this.f22102f.putLong(j10);
        } catch (BufferOverflowException e10) {
            throw new d0(e10);
        }
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
        ByteBuffer byteBuffer = this.f22102f;
        int iPosition = byteBuffer.position();
        try {
            int iComputeUInt32SizeNoTag = h0.computeUInt32SizeNoTag(str.length() * 3);
            int iComputeUInt32SizeNoTag2 = h0.computeUInt32SizeNoTag(str.length());
            if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                writeUInt32NoTag(vc.e(str));
                try {
                    vc.d(str, byteBuffer);
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d0(e10);
                }
            }
            int iPosition2 = byteBuffer.position() + iComputeUInt32SizeNoTag2;
            byteBuffer.position(iPosition2);
            try {
                vc.d(str, byteBuffer);
                int iPosition3 = byteBuffer.position();
                byteBuffer.position(iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                byteBuffer.position(iPosition3);
            } catch (IndexOutOfBoundsException e11) {
                throw new d0(e11);
            }
        } catch (uc e12) {
            byteBuffer.position(iPosition);
            b(str, e12);
        } catch (IllegalArgumentException e13) {
            throw new d0(e13);
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
        while (true) {
            int i11 = i10 & (-128);
            ByteBuffer byteBuffer = this.f22102f;
            if (i11 == 0) {
                byteBuffer.put((byte) i10);
                return;
            }
            try {
                byteBuffer.put((byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new d0(e10);
            }
            throw new d0(e10);
        }
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    @Override // com.explorestack.protobuf.h0
    public void writeUInt64NoTag(long j10) throws IOException {
        while (true) {
            long j11 = (-128) & j10;
            ByteBuffer byteBuffer = this.f22102f;
            if (j11 == 0) {
                byteBuffer.put((byte) j10);
                return;
            }
            try {
                byteBuffer.put((byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            } catch (BufferOverflowException e10) {
                throw new d0(e10);
            }
            throw new d0(e10);
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
        try {
            this.f22102f.put(bArr, i10, i11);
        } catch (IndexOutOfBoundsException e10) {
            throw new d0(e10);
        } catch (BufferOverflowException e11) {
            throw new d0(e11);
        }
    }

    @Override // com.explorestack.protobuf.h0, com.explorestack.protobuf.s
    public void write(ByteBuffer byteBuffer) throws IOException {
        try {
            this.f22102f.put(byteBuffer);
        } catch (BufferOverflowException e10) {
            throw new d0(e10);
        }
    }
}
