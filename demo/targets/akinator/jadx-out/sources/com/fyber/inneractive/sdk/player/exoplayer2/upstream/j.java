package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final h f25938a;

    /* renamed from: b, reason: collision with root package name */
    public final k f25939b;

    /* renamed from: f, reason: collision with root package name */
    public long f25943f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25941d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25942e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f25940c = new byte[1];

    public j(h hVar, k kVar) {
        this.f25938a = hVar;
        this.f25939b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25942e) {
            return;
        }
        this.f25938a.close();
        this.f25942e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f25940c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f25940c[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f25942e) {
            if (!this.f25941d) {
                this.f25938a.a(this.f25939b);
                this.f25941d = true;
            }
            int i12 = this.f25938a.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f25943f += i12;
            return i12;
        }
        throw new IllegalStateException();
    }
}
