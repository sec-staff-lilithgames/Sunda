package s4;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f85420a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f85421b;

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f85422c;

    /* renamed from: d, reason: collision with root package name */
    public long f85423d = 0;

    public k0(InputStream inputStream) {
        this.f85422c = inputStream;
        byte[] bArr = new byte[4];
        this.f85420a = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f85421b = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i10) throws IOException {
        if (this.f85422c.read(this.f85420a, 0, i10) != i10) {
            throw new IOException("read failed");
        }
        this.f85423d += i10;
    }

    @Override // s4.m0
    public long getPosition() {
        return this.f85423d;
    }

    @Override // s4.m0
    public int readTag() throws IOException {
        ByteBuffer byteBuffer = this.f85421b;
        byteBuffer.position(0);
        a(4);
        return byteBuffer.getInt();
    }

    @Override // s4.m0
    public long readUnsignedInt() throws IOException {
        this.f85421b.position(0);
        a(4);
        return r1.getInt() & 4294967295L;
    }

    @Override // s4.m0
    public int readUnsignedShort() throws IOException {
        ByteBuffer byteBuffer = this.f85421b;
        byteBuffer.position(0);
        a(2);
        return byteBuffer.getShort() & 65535;
    }

    @Override // s4.m0
    public void skip(int i10) throws IOException {
        while (i10 > 0) {
            int iSkip = (int) this.f85422c.skip(i10);
            if (iSkip < 1) {
                throw new IOException("Skip didn't move at least 1 byte forward");
            }
            i10 -= iSkip;
            this.f85423d += iSkip;
        }
    }
}
