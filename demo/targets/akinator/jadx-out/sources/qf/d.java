package qf;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.util.n1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f82922e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f82923f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f82924g;

    /* renamed from: h, reason: collision with root package name */
    public long f82925h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82926i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends q {
        @Deprecated
        public a(IOException iOException) {
            super(iOException, 2000);
        }

        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public d(Context context) {
        super(false);
        this.f82922e = context.getAssets();
    }

    @Override // qf.h, qf.p
    public void close() throws a {
        this.f82923f = null;
        try {
            try {
                InputStream inputStream = this.f82924g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f82924g = null;
            if (this.f82926i) {
                this.f82926i = false;
                b();
            }
        }
    }

    @Override // qf.h, qf.p
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // qf.h, qf.p
    public Uri getUri() {
        return this.f82923f;
    }

    @Override // qf.h, qf.p
    public long open(t tVar) throws IOException {
        try {
            Uri uri = tVar.f82992a;
            long j10 = tVar.f82997f;
            this.f82923f = uri;
            String strSubstring = (String) com.google.android.exoplayer2.util.a.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            c(tVar);
            InputStream inputStreamOpen = this.f82922e.open(strSubstring, 1);
            this.f82924g = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new a(null, 2008);
            }
            long j11 = tVar.f82998g;
            if (j11 != -1) {
                this.f82925h = j11;
            } else {
                long jAvailable = this.f82924g.available();
                this.f82925h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f82925h = -1L;
                }
            }
            this.f82926i = true;
            d(tVar);
            return this.f82925h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // qf.h, qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f82925h;
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
        int i12 = ((InputStream) n1.castNonNull(this.f82924g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f82925h;
        if (j11 != -1) {
            this.f82925h = j11 - i12;
        }
        a(i12);
        return i12;
    }
}
