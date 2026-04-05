package xr;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class cb extends InputStream implements wr.w2, wr.s1, wr.d1 {

    /* renamed from: b, reason: collision with root package name */
    public ab f92336b;

    public cb(ab abVar) {
        this.f92336b = (ab) mh.p1.checkNotNull(abVar, "buffer");
    }

    @Override // java.io.InputStream, wr.w2
    public int available() throws IOException {
        return this.f92336b.readableBytes();
    }

    @Override // wr.s1
    public boolean byteBufferSupported() {
        return this.f92336b.byteBufferSupported();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f92336b.close();
    }

    @Override // wr.d1
    public InputStream detach() {
        ab abVar = this.f92336b;
        this.f92336b = abVar.readBytes(0);
        return new cb(abVar);
    }

    @Override // wr.s1
    public ByteBuffer getByteBuffer() {
        return this.f92336b.getByteBuffer();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f92336b.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f92336b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f92336b.readableBytes() == 0) {
            return -1;
        }
        return this.f92336b.readUnsignedByte();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f92336b.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        int iMin = (int) Math.min(this.f92336b.readableBytes(), j10);
        this.f92336b.skipBytes(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f92336b.readableBytes() == 0) {
            return -1;
        }
        int iMin = Math.min(this.f92336b.readableBytes(), i11);
        this.f92336b.readBytes(bArr, i10, iMin);
        return iMin;
    }
}
