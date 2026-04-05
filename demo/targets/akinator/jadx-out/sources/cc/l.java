package cc;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final h f12092b;

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f12093c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f12094e;

    /* renamed from: f, reason: collision with root package name */
    public int f12095f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12096g;

    public l(h hVar, InputStream inputStream, byte[] bArr, int i10, int i11) {
        this.f12092b = hVar;
        this.f12093c = inputStream;
        this.f12094e = bArr;
        this.f12095f = i10;
        this.f12096g = i11;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f12094e != null ? this.f12096g - this.f12095f : this.f12093c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d();
        this.f12093c.close();
    }

    public final void d() {
        byte[] bArr = this.f12094e;
        if (bArr != null) {
            this.f12094e = null;
            h hVar = this.f12092b;
            if (hVar != null) {
                hVar.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        if (this.f12094e == null) {
            this.f12093c.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f12094e == null && this.f12093c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f12094e;
        if (bArr == null) {
            return this.f12093c.read();
        }
        int i10 = this.f12095f;
        int i11 = i10 + 1;
        this.f12095f = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 >= this.f12096g) {
            d();
        }
        return i12;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f12094e == null) {
            this.f12093c.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11;
        if (this.f12094e != null) {
            int i10 = this.f12095f;
            j11 = this.f12096g - i10;
            if (j11 > j10) {
                this.f12095f = i10 + ((int) j10);
                return j10;
            }
            d();
            j10 -= j11;
        } else {
            j11 = 0;
        }
        return j10 > 0 ? this.f12093c.skip(j10) + j11 : j11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = this.f12094e;
        if (bArr2 != null) {
            int i12 = this.f12095f;
            int i13 = this.f12096g;
            int i14 = i13 - i12;
            if (i11 > i14) {
                i11 = i14;
            }
            System.arraycopy(bArr2, i12, bArr, i10, i11);
            int i15 = this.f12095f + i11;
            this.f12095f = i15;
            if (i15 >= i13) {
                d();
            }
            return i11;
        }
        return this.f12093c.read(bArr, i10, i11);
    }
}
