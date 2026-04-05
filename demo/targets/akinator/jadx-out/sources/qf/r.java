package qf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final p f82970b;

    /* renamed from: c, reason: collision with root package name */
    public final t f82971c;

    /* renamed from: h, reason: collision with root package name */
    public long f82975h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82973f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f82974g = false;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f82972e = new byte[1];

    public r(p pVar, t tVar) {
        this.f82970b = pVar;
        this.f82971c = tVar;
    }

    public long bytesRead() {
        return this.f82975h;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f82974g) {
            return;
        }
        this.f82970b.close();
        this.f82974g = true;
    }

    public void open() throws IOException {
        if (this.f82973f) {
            return;
        }
        this.f82970b.open(this.f82971c);
        this.f82973f = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f82972e;
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
        com.google.android.exoplayer2.util.a.checkState(!this.f82974g);
        boolean z10 = this.f82973f;
        p pVar = this.f82970b;
        if (!z10) {
            pVar.open(this.f82971c);
            this.f82973f = true;
        }
        int i12 = pVar.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f82975h += i12;
        return i12;
    }
}
