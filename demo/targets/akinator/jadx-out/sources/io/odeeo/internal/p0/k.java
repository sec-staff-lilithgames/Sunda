package io.odeeo.internal.p0;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final i f65620a;

    /* renamed from: b, reason: collision with root package name */
    public final m f65621b;

    /* renamed from: f, reason: collision with root package name */
    public long f65625f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65623d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65624e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f65622c = new byte[1];

    public k(i iVar, m mVar) {
        this.f65620a = iVar;
        this.f65621b = mVar;
    }

    public final void a() throws IOException {
        if (this.f65623d) {
            return;
        }
        this.f65620a.open(this.f65621b);
        this.f65623d = true;
    }

    public long bytesRead() {
        return this.f65625f;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f65624e) {
            return;
        }
        this.f65620a.close();
        this.f65624e = true;
    }

    public void open() throws IOException {
        a();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f65622c) == -1) {
            return -1;
        }
        return this.f65622c[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        io.odeeo.internal.q0.a.checkState(!this.f65624e);
        a();
        int i12 = this.f65620a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f65625f += i12;
        return i12;
    }
}
