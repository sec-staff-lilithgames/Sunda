package ln;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import io.bidmachine.media3.common.util.a1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends ln.b {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f73528e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f73529f;

    /* renamed from: g, reason: collision with root package name */
    public long f73530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73531h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public g0 f73532a;

        public a setListener(g0 g0Var) {
            this.f73532a = g0Var;
            return this;
        }

        @Override // ln.h
        public s createDataSource() {
            s sVar = new s();
            g0 g0Var = this.f73532a;
            if (g0Var != null) {
                sVar.addTransferListener(g0Var);
            }
            return sVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends j {
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

    public s() {
        super(false);
    }

    @Override // ln.b, ln.i
    public void close() throws b {
        this.f73529f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f73528e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f73528e = null;
            if (this.f73531h) {
                this.f73531h = false;
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
        return this.f73529f;
    }

    @Override // ln.b, ln.i
    public long open(m mVar) throws IOException {
        Uri uri = mVar.f73467a;
        long j10 = mVar.f73472f;
        this.f73529f = uri;
        c(mVar);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile((String) io.bidmachine.media3.common.util.a.checkNotNull(uri.getPath()), "r");
            this.f73528e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = mVar.f73473g;
                if (length == -1) {
                    length = this.f73528e.length() - j10;
                }
                this.f73530g = length;
                if (length < 0) {
                    throw new b(null, null, 2008);
                }
                this.f73531h = true;
                d(mVar);
                return this.f73530g;
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
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

    @Override // ln.b, ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f73530g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) a1.castNonNull(this.f73528e)).read(bArr, i10, (int) Math.min(this.f73530g, i11));
            if (i12 > 0) {
                this.f73530g -= i12;
                a(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
