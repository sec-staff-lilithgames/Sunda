package ln;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final i f73461b;

    /* renamed from: c, reason: collision with root package name */
    public final m f73462c;

    /* renamed from: h, reason: collision with root package name */
    public long f73466h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f73464f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f73465g = false;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f73463e = new byte[1];

    public k(i iVar, m mVar) {
        this.f73461b = iVar;
        this.f73462c = mVar;
    }

    public long bytesRead() {
        return this.f73466h;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f73465g) {
            return;
        }
        this.f73461b.close();
        this.f73465g = true;
    }

    public void open() throws IOException {
        if (this.f73464f) {
            return;
        }
        this.f73461b.open(this.f73462c);
        this.f73464f = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f73463e;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        io.bidmachine.media3.common.util.a.checkState(!this.f73465g);
        boolean z10 = this.f73464f;
        i iVar = this.f73461b;
        if (!z10) {
            iVar.open(this.f73462c);
            this.f73464f = true;
        }
        int i12 = iVar.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f73466h += i12;
        return i12;
    }
}
