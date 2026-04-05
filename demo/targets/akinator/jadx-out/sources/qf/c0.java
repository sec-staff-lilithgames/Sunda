package qf;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.n1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 extends h {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f82917e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f82918f;

    /* renamed from: g, reason: collision with root package name */
    public long f82919g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f82920h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public c1 f82921a;

        public a setListener(c1 c1Var) {
            this.f82921a = c1Var;
            return this;
        }

        @Override // qf.o
        public c0 createDataSource() {
            c0 c0Var = new c0();
            c1 c1Var = this.f82921a;
            if (c1Var != null) {
                c0Var.addTransferListener(c1Var);
            }
            return c0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends q {
        @Deprecated
        public b(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public b(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public b(Throwable th2, int i10) {
            super(th2, i10);
        }

        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public c0() {
        super(false);
    }

    @Override // qf.h, qf.p
    public void close() throws b {
        this.f82918f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f82917e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f82917e = null;
            if (this.f82920h) {
                this.f82920h = false;
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
        return this.f82918f;
    }

    @Override // qf.h, qf.p
    public long open(t tVar) throws IOException {
        Uri uri = tVar.f82992a;
        long j10 = tVar.f82997f;
        this.f82918f = uri;
        c(tVar);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile((String) com.google.android.exoplayer2.util.a.checkNotNull(uri.getPath()), "r");
            this.f82917e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = tVar.f82998g;
                if (length == -1) {
                    length = this.f82917e.length() - j10;
                }
                this.f82919g = length;
                if (length < 0) {
                    throw new b(null, null, 2008);
                }
                this.f82920h = true;
                d(tVar);
                return this.f82919g;
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e11, (n1.f28506a < 21 || !b0.b(e11.getCause())) ? 2005 : 2006);
            }
            String path = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbB = b3.h.b("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path, ",query=", query, ",fragment=");
            sbB.append(fragment);
            throw new b(sbB.toString(), e11, 1004);
        } catch (SecurityException e12) {
            throw new b(e12, 2006);
        } catch (RuntimeException e13) {
            throw new b(e13, 2000);
        }
    }

    @Override // qf.h, qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f82919g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) n1.castNonNull(this.f82917e)).read(bArr, i10, (int) Math.min(this.f82919g, i11));
            if (i12 > 0) {
                this.f82919g -= i12;
                a(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
