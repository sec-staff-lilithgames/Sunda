package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l0 extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f5947c = Logger.getLogger(l0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5948d = j4.f5926e;

    /* renamed from: a, reason: collision with root package name */
    public m0 f5949a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5950b;

    public static int computeBoolSize(int i10, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i10);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        int length = bArr.length;
        return computeUInt32SizeNoTag(length) + length;
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i10);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        return computeUInt32SizeNoTag(iCapacity) + iCapacity;
    }

    public static int computeBytesSize(int i10, x xVar) {
        return computeBytesSizeNoTag(xVar) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(x xVar) {
        int size = xVar.size();
        return computeUInt32SizeNoTag(size) + size;
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j10) {
        return computeFixed64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, r2 r2Var) {
        return r2Var.getSerializedSize() + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(r2 r2Var) {
        return r2Var.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        return computeUInt64SizeNoTag(i10);
    }

    public static int computeInt64Size(int i10, long j10) {
        return computeInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, z1 z1Var) {
        return computeLazyFieldSize(3, z1Var) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i10, z1 z1Var) {
        return computeLazyFieldSizeNoTag(z1Var) + computeTagSize(i10);
    }

    public static int computeLazyFieldSizeNoTag(z1 z1Var) {
        int serializedSize = z1Var.getSerializedSize();
        return computeUInt32SizeNoTag(serializedSize) + serializedSize;
    }

    public static int computeMessageSetExtensionSize(int i10, r2 r2Var) {
        return computeMessageSize(3, r2Var) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i10, r2 r2Var) {
        return computeMessageSizeNoTag(r2Var) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(r2 r2Var) {
        int serializedSize = r2Var.getSerializedSize();
        return computeUInt32SizeNoTag(serializedSize) + serializedSize;
    }

    public static int computeRawMessageSetExtensionSize(int i10, x xVar) {
        return computeBytesSize(3, xVar) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeSFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j10) {
        return computeSFixed64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeSInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeSInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(encodeZigZag64(j10));
    }

    public static int computeStringSize(int i10, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i10);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = m4.e(str);
        } catch (l4 unused) {
            length = str.getBytes(t1.f6006a).length;
        }
        return computeUInt32SizeNoTag(length) + length;
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(i10 << 3);
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeUInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int computeUInt64Size(int i10, long j10) {
        return computeUInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static l0 newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public final void a(String str, l4 l4Var) throws IOException {
        f5947c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) l4Var);
        byte[] bytes = str.getBytes(t1.f6006a);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new h0(e10);
        }
    }

    public abstract void b(int i10, r2 r2Var, m3 m3Var);

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f5950b = true;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public abstract void write(byte b10) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.i
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.i
    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeBool(int i10, boolean z10) throws IOException;

    public final void writeBoolNoTag(boolean z10) throws IOException {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i10, int i11);

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i10, x xVar) throws IOException;

    public abstract void writeBytesNoTag(x xVar) throws IOException;

    public final void writeDouble(int i10, double d10) throws IOException {
        writeFixed64(i10, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i10, int i11) throws IOException {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) throws IOException {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11) throws IOException;

    public abstract void writeFixed32NoTag(int i10) throws IOException;

    public abstract void writeFixed64(int i10, long j10) throws IOException;

    public abstract void writeFixed64NoTag(long j10) throws IOException;

    public final void writeFloat(int i10, float f10) throws IOException {
        writeFixed32(i10, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i10, r2 r2Var) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(r2Var);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(r2 r2Var) throws IOException {
        r2Var.writeTo(this);
    }

    public abstract void writeInt32(int i10, int i11) throws IOException;

    public abstract void writeInt32NoTag(int i10) throws IOException;

    public final void writeInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, j10);
    }

    public final void writeInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.i
    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeMessage(int i10, r2 r2Var) throws IOException;

    public abstract void writeMessageNoTag(r2 r2Var) throws IOException;

    public abstract void writeMessageSetExtension(int i10, r2 r2Var) throws IOException;

    public final void writeRawByte(byte b10) throws IOException {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public abstract void writeRawMessageSetExtension(int i10, x xVar) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i10) throws IOException {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    public final void writeSFixed32(int i10, int i11) throws IOException {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j10) throws IOException {
        writeFixed64(i10, j10);
    }

    public final void writeSFixed64NoTag(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public final void writeSInt32(int i10, int i11) throws IOException {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, encodeZigZag64(j10));
    }

    public final void writeSInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j10));
    }

    public abstract void writeString(int i10, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i10, int i11) throws IOException;

    public abstract void writeUInt32(int i10, int i11) throws IOException;

    public abstract void writeUInt32NoTag(int i10) throws IOException;

    public abstract void writeUInt64(int i10, long j10) throws IOException;

    public abstract void writeUInt64NoTag(long j10) throws IOException;

    public static l0 newInstance(OutputStream outputStream, int i10) {
        return new i0(outputStream, i10);
    }

    public final void writeRawByte(int i10) throws IOException {
        write((byte) i10);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    public static l0 newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(x xVar) throws IOException {
        xVar.n(this);
    }

    public static l0 newInstance(byte[] bArr, int i10, int i11) {
        return new f0(bArr, i10, i11);
    }

    public static l0 newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new g0(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (j4.f5925d) {
                return new k0(byteBuffer);
            }
            return new j0(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static l0 newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }
}
