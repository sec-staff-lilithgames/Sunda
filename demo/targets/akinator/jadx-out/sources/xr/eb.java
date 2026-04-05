package xr;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class eb extends f {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f92487b;

    public eb(ByteBuffer byteBuffer) {
        this.f92487b = (ByteBuffer) mh.p1.checkNotNull(byteBuffer, "bytes");
    }

    @Override // xr.f, xr.ab
    public byte[] array() {
        return this.f92487b.array();
    }

    @Override // xr.f, xr.ab
    public int arrayOffset() {
        ByteBuffer byteBuffer = this.f92487b;
        return byteBuffer.position() + byteBuffer.arrayOffset();
    }

    @Override // xr.f, xr.ab
    public boolean byteBufferSupported() {
        return true;
    }

    @Override // xr.f, xr.ab
    public ByteBuffer getByteBuffer() {
        return this.f92487b.slice();
    }

    @Override // xr.f, xr.ab
    public boolean hasArray() {
        return this.f92487b.hasArray();
    }

    @Override // xr.f, xr.ab
    public void mark() {
        this.f92487b.mark();
    }

    @Override // xr.f, xr.ab
    public boolean markSupported() {
        return true;
    }

    @Override // xr.f, xr.ab
    public int readUnsignedByte() {
        a(1);
        return this.f92487b.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // xr.f, xr.ab
    public int readableBytes() {
        return this.f92487b.remaining();
    }

    @Override // xr.f, xr.ab
    public void reset() {
        this.f92487b.reset();
    }

    @Override // xr.f, xr.ab
    public void skipBytes(int i10) {
        a(i10);
        ByteBuffer byteBuffer = this.f92487b;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    @Override // xr.f, xr.ab
    public /* bridge */ /* synthetic */ void touch() {
        super.touch();
    }

    @Override // xr.f, xr.ab
    public void readBytes(byte[] bArr, int i10, int i11) {
        a(i11);
        this.f92487b.get(bArr, i10, i11);
    }

    @Override // xr.f, xr.ab
    public void readBytes(ByteBuffer byteBuffer) {
        mh.p1.checkNotNull(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        ByteBuffer byteBuffer2 = this.f92487b;
        int iLimit = byteBuffer2.limit();
        byteBuffer2.limit(byteBuffer2.position() + iRemaining);
        byteBuffer.put(byteBuffer2);
        byteBuffer2.limit(iLimit);
    }

    @Override // xr.f, xr.ab
    public void readBytes(OutputStream outputStream, int i10) throws IOException {
        a(i10);
        boolean zHasArray = hasArray();
        ByteBuffer byteBuffer = this.f92487b;
        if (zHasArray) {
            outputStream.write(array(), arrayOffset(), i10);
            byteBuffer.position(byteBuffer.position() + i10);
        } else {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // xr.f, xr.ab
    public eb readBytes(int i10) {
        a(i10);
        ByteBuffer byteBuffer = this.f92487b;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i10);
        byteBuffer.position(byteBuffer.position() + i10);
        return new eb(byteBufferDuplicate);
    }
}
