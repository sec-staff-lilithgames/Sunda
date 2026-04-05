package xr;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class q4 implements ab {

    /* renamed from: b, reason: collision with root package name */
    public final ab f92920b;

    public q4(ab abVar) {
        this.f92920b = (ab) mh.p1.checkNotNull(abVar, "buf");
    }

    @Override // xr.ab
    public byte[] array() {
        return this.f92920b.array();
    }

    @Override // xr.ab
    public int arrayOffset() {
        return this.f92920b.arrayOffset();
    }

    @Override // xr.ab
    public boolean byteBufferSupported() {
        return this.f92920b.byteBufferSupported();
    }

    @Override // xr.ab, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f92920b.close();
    }

    @Override // xr.ab
    public ByteBuffer getByteBuffer() {
        return this.f92920b.getByteBuffer();
    }

    @Override // xr.ab
    public boolean hasArray() {
        return this.f92920b.hasArray();
    }

    @Override // xr.ab
    public void mark() {
        this.f92920b.mark();
    }

    @Override // xr.ab
    public boolean markSupported() {
        return this.f92920b.markSupported();
    }

    @Override // xr.ab
    public void readBytes(byte[] bArr, int i10, int i11) {
        this.f92920b.readBytes(bArr, i10, i11);
    }

    @Override // xr.ab
    public int readInt() {
        return this.f92920b.readInt();
    }

    @Override // xr.ab
    public int readUnsignedByte() {
        return this.f92920b.readUnsignedByte();
    }

    @Override // xr.ab
    public int readableBytes() {
        return this.f92920b.readableBytes();
    }

    @Override // xr.ab
    public void reset() {
        this.f92920b.reset();
    }

    @Override // xr.ab
    public void skipBytes(int i10) {
        this.f92920b.skipBytes(i10);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", this.f92920b).toString();
    }

    @Override // xr.ab
    public void touch() {
        this.f92920b.touch();
    }

    @Override // xr.ab
    public void readBytes(ByteBuffer byteBuffer) {
        this.f92920b.readBytes(byteBuffer);
    }

    @Override // xr.ab
    public void readBytes(OutputStream outputStream, int i10) throws IOException {
        this.f92920b.readBytes(outputStream, i10);
    }

    @Override // xr.ab
    public ab readBytes(int i10) {
        return this.f92920b.readBytes(i10);
    }
}
