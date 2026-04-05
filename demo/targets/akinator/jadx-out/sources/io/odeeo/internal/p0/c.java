package io.odeeo.internal.p0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import io.odeeo.internal.q0.g0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends e {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f65587e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f65588f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f65589g;

    /* renamed from: h, reason: collision with root package name */
    public long f65590h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65591i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends j {
        @Deprecated
        public a(IOException iOException) {
            super(iOException, 2000);
        }

        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f65587e = context.getAssets();
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public void close() throws a {
        this.f65588f = null;
        try {
            try {
                InputStream inputStream = this.f65589g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f65589g = null;
            if (this.f65591i) {
                this.f65591i = false;
                a();
            }
        }
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Uri getUri() {
        return this.f65588f;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        try {
            Uri uri = mVar.f65626a;
            this.f65588f = uri;
            String strSubstring = (String) io.odeeo.internal.q0.a.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            a(mVar);
            InputStream inputStreamOpen = this.f65587e.open(strSubstring, 1);
            this.f65589g = inputStreamOpen;
            if (inputStreamOpen.skip(mVar.f65632g) < mVar.f65632g) {
                throw new a(null, 2008);
            }
            long j10 = mVar.f65633h;
            if (j10 != -1) {
                this.f65590h = j10;
            } else {
                long jAvailable = this.f65589g.available();
                this.f65590h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f65590h = -1L;
                }
            }
            this.f65591i = true;
            b(mVar);
            return this.f65590h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f65590h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int i12 = ((InputStream) g0.castNonNull(this.f65589g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f65590h;
        if (j11 != -1) {
            this.f65590h = j11 - i12;
        }
        a(i12);
        return i12;
    }
}
