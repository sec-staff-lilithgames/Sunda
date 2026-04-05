package xr;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class db extends f {

    /* renamed from: b, reason: collision with root package name */
    public int f92435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92436c;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f92437e;

    /* renamed from: f, reason: collision with root package name */
    public int f92438f = -1;

    public db(byte[] bArr, int i10, int i11) {
        mh.p1.checkArgument(i10 >= 0, "offset must be >= 0");
        mh.p1.checkArgument(i11 >= 0, "length must be >= 0");
        int i12 = i11 + i10;
        mh.p1.checkArgument(i12 <= bArr.length, "offset + length exceeds array boundary");
        this.f92437e = (byte[]) mh.p1.checkNotNull(bArr, "bytes");
        this.f92435b = i10;
        this.f92436c = i12;
    }

    @Override // xr.f, xr.ab
    public byte[] array() {
        return this.f92437e;
    }

    @Override // xr.f, xr.ab
    public int arrayOffset() {
        return this.f92435b;
    }

    @Override // xr.f, xr.ab
    public boolean hasArray() {
        return true;
    }

    @Override // xr.f, xr.ab
    public void mark() {
        this.f92438f = this.f92435b;
    }

    @Override // xr.f, xr.ab
    public boolean markSupported() {
        return true;
    }

    @Override // xr.f, xr.ab
    public int readUnsignedByte() {
        a(1);
        int i10 = this.f92435b;
        this.f92435b = i10 + 1;
        return this.f92437e[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // xr.f, xr.ab
    public int readableBytes() {
        return this.f92436c - this.f92435b;
    }

    @Override // xr.f, xr.ab
    public void reset() {
        int i10 = this.f92438f;
        if (i10 == -1) {
            throw new InvalidMarkException();
        }
        this.f92435b = i10;
    }

    @Override // xr.f, xr.ab
    public void skipBytes(int i10) {
        a(i10);
        this.f92435b += i10;
    }

    @Override // xr.f, xr.ab
    public /* bridge */ /* synthetic */ void touch() {
        super.touch();
    }

    @Override // xr.f, xr.ab
    public void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f92437e, this.f92435b, bArr, i10, i11);
        this.f92435b += i11;
    }

    @Override // xr.f, xr.ab
    public void readBytes(ByteBuffer byteBuffer) {
        mh.p1.checkNotNull(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        a(iRemaining);
        byteBuffer.put(this.f92437e, this.f92435b, iRemaining);
        this.f92435b += iRemaining;
    }

    @Override // xr.f, xr.ab
    public void readBytes(OutputStream outputStream, int i10) throws IOException {
        a(i10);
        outputStream.write(this.f92437e, this.f92435b, i10);
        this.f92435b += i10;
    }

    @Override // xr.f, xr.ab
    public db readBytes(int i10) {
        a(i10);
        int i11 = this.f92435b;
        this.f92435b = i11 + i10;
        return new db(this.f92437e, i11, i10);
    }
}
