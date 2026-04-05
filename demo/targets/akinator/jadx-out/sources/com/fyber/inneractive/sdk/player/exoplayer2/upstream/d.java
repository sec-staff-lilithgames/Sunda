package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f25916a;

    /* renamed from: b, reason: collision with root package name */
    public final m f25917b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f25918c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f25919d;

    /* renamed from: e, reason: collision with root package name */
    public long f25920e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25921f;

    public d(Context context, m mVar) {
        this.f25916a = context.getAssets();
        this.f25917b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws IOException {
        try {
            Uri uri = kVar.f25944a;
            this.f25918c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f25916a.open(path, 1);
            this.f25919d = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f25946c) < kVar.f25946c) {
                throw new EOFException();
            }
            long j10 = kVar.f25947d;
            if (j10 != -1) {
                this.f25920e = j10;
            } else {
                long jAvailable = this.f25919d.available();
                this.f25920e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f25920e = -1L;
                }
            }
            this.f25921f = true;
            m mVar = this.f25917b;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (mVar.f25956b == 0) {
                            mVar.f25957c = SystemClock.elapsedRealtime();
                        }
                        mVar.f25956b++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f25920e;
        } catch (IOException e10) {
            throw new c(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f25918c = null;
        try {
            try {
                InputStream inputStream = this.f25919d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new c(e10);
            }
        } finally {
            this.f25919d = null;
            if (this.f25921f) {
                this.f25921f = false;
                m mVar = this.f25917b;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25920e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new c(e10);
            }
        }
        int i12 = this.f25919d.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f25920e == -1) {
                return -1;
            }
            throw new c(new EOFException());
        }
        long j11 = this.f25920e;
        if (j11 != -1) {
            this.f25920e = j11 - i12;
        }
        m mVar = this.f25917b;
        if (mVar == null) {
            return i12;
        }
        synchronized (mVar) {
            mVar.f25958d += i12;
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f25918c;
    }
}
