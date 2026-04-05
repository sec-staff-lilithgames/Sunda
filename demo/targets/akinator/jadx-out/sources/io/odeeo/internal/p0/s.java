package io.odeeo.internal.p0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import io.odeeo.internal.q0.g0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends e {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f65721e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f65722f;

    /* renamed from: g, reason: collision with root package name */
    public long f65723g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f65724h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
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

    public static RandomAccessFile a(Uri uri) throws b {
        try {
            return new RandomAccessFile((String) io.odeeo.internal.q0.a.checkNotNull(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e10, (g0.f65861a < 21 || !a.b(e10.getCause())) ? 2005 : 2006);
            }
            String path = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbB = b3.h.b("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path, ",query=", query, ",fragment=");
            sbB.append(fragment);
            throw new b(sbB.toString(), e10, 1004);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public void close() throws b {
        this.f65722f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f65721e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f65721e = null;
            if (this.f65724h) {
                this.f65724h = false;
                a();
            }
        }
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Uri getUri() {
        return this.f65722f;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        Uri uri = mVar.f65626a;
        this.f65722f = uri;
        a(mVar);
        RandomAccessFile randomAccessFileA = a(uri);
        this.f65721e = randomAccessFileA;
        try {
            randomAccessFileA.seek(mVar.f65632g);
            long length = mVar.f65633h;
            if (length == -1) {
                length = this.f65721e.length() - mVar.f65632g;
            }
            this.f65723g = length;
            if (length < 0) {
                throw new b(null, null, 2008);
            }
            this.f65724h = true;
            b(mVar);
            return this.f65723g;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f65723g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) g0.castNonNull(this.f65721e)).read(bArr, i10, (int) Math.min(this.f65723g, i11));
            if (i12 > 0) {
                this.f65723g -= i12;
                a(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
