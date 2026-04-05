package yr;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p0.o2;
import xr.ab;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 extends xr.f {

    /* renamed from: b, reason: collision with root package name */
    public final pw.g f94934b;

    public j0(pw.g gVar) {
        this.f94934b = gVar;
    }

    @Override // xr.f, xr.ab, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f94934b.clear();
    }

    @Override // xr.f, xr.ab
    public void readBytes(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int i12 = this.f94934b.read(bArr, i10, i11);
            if (i12 == -1) {
                throw new IndexOutOfBoundsException(o2.k(i11, "EOF trying to read ", " bytes"));
            }
            i11 -= i12;
            i10 += i12;
        }
    }

    @Override // xr.f, xr.ab
    public int readUnsignedByte() {
        try {
            return this.f94934b.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // xr.f, xr.ab
    public int readableBytes() {
        return (int) this.f94934b.size();
    }

    @Override // xr.f, xr.ab
    public void skipBytes(int i10) {
        try {
            this.f94934b.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // xr.f, xr.ab
    public /* bridge */ /* synthetic */ void touch() {
        super.touch();
    }

    @Override // xr.f, xr.ab
    public void readBytes(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // xr.f, xr.ab
    public void readBytes(OutputStream outputStream, int i10) throws IOException {
        this.f94934b.writeTo(outputStream, i10);
    }

    @Override // xr.f, xr.ab
    public ab readBytes(int i10) {
        pw.g gVar = new pw.g();
        gVar.write(this.f94934b, i10);
        return new j0(gVar);
    }
}
