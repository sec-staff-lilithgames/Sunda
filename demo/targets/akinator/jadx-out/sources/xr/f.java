package xr;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f implements ab {
    public final void a(int i10) {
        if (readableBytes() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // xr.ab
    public byte[] array() {
        throw new UnsupportedOperationException();
    }

    @Override // xr.ab
    public int arrayOffset() {
        throw new UnsupportedOperationException();
    }

    @Override // xr.ab
    public boolean byteBufferSupported() {
        return false;
    }

    @Override // xr.ab
    public ByteBuffer getByteBuffer() {
        throw new UnsupportedOperationException();
    }

    @Override // xr.ab
    public boolean hasArray() {
        return false;
    }

    @Override // xr.ab
    public boolean markSupported() {
        return false;
    }

    @Override // xr.ab
    public abstract /* synthetic */ ab readBytes(int i10);

    @Override // xr.ab
    public abstract /* synthetic */ void readBytes(OutputStream outputStream, int i10) throws IOException;

    @Override // xr.ab
    public abstract /* synthetic */ void readBytes(ByteBuffer byteBuffer);

    @Override // xr.ab
    public abstract /* synthetic */ void readBytes(byte[] bArr, int i10, int i11);

    @Override // xr.ab
    public final int readInt() {
        a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // xr.ab
    public abstract /* synthetic */ int readUnsignedByte();

    @Override // xr.ab
    public abstract /* synthetic */ int readableBytes();

    @Override // xr.ab
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // xr.ab
    public abstract /* synthetic */ void skipBytes(int i10);

    @Override // xr.ab
    public /* bridge */ /* synthetic */ void touch() {
        super.touch();
    }

    @Override // xr.ab, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // xr.ab
    public void mark() {
    }
}
