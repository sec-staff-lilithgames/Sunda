package ln;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import io.bidmachine.media3.common.util.a1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f73412e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f73413f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f73414g;

    /* renamed from: h, reason: collision with root package name */
    public long f73415h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73416i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ln.a$a, reason: collision with other inner class name */
    public static final class C0744a extends j {
        @Deprecated
        public C0744a(IOException iOException) {
            super(iOException, 2000);
        }

        public C0744a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public a(Context context) {
        super(false);
        this.f73412e = context.getAssets();
    }

    @Override // ln.b, ln.i
    public void close() throws C0744a {
        this.f73413f = null;
        try {
            try {
                InputStream inputStream = this.f73414g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new C0744a(e10, 2000);
            }
        } finally {
            this.f73414g = null;
            if (this.f73416i) {
                this.f73416i = false;
                b();
            }
        }
    }

    @Override // ln.b, ln.i
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // ln.b, ln.i
    public Uri getUri() {
        return this.f73413f;
    }

    @Override // ln.b, ln.i
    public long open(m mVar) throws IOException {
        try {
            Uri uri = mVar.f73467a;
            long j10 = mVar.f73472f;
            this.f73413f = uri;
            String strSubstring = (String) io.bidmachine.media3.common.util.a.checkNotNull(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            c(mVar);
            InputStream inputStreamOpen = this.f73412e.open(strSubstring, 1);
            this.f73414g = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new C0744a(null, 2008);
            }
            long j11 = mVar.f73473g;
            if (j11 != -1) {
                this.f73415h = j11;
            } else {
                long jAvailable = this.f73414g.available();
                this.f73415h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f73415h = -1L;
                }
            }
            this.f73416i = true;
            d(mVar);
            return this.f73415h;
        } catch (C0744a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C0744a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // ln.b, ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f73415h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C0744a(e10, 2000);
            }
        }
        int i12 = ((InputStream) a1.castNonNull(this.f73414g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f73415h;
        if (j11 != -1) {
            this.f73415h = j11 - i12;
        }
        a(i12);
        return i12;
    }
}
