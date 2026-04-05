package xv;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class w0 implements Closeable {
    public static final b Companion;
    public static final w0 EMPTY;
    private Reader reader;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends Reader {

        /* renamed from: b, reason: collision with root package name */
        public final pw.k f93894b;

        /* renamed from: c, reason: collision with root package name */
        public final Charset f93895c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f93896e;

        /* renamed from: f, reason: collision with root package name */
        public InputStreamReader f93897f;

        public a(pw.k source, Charset charset) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
            this.f93894b = source;
            this.f93895c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f93896e = true;
            InputStreamReader inputStreamReader = this.f93897f;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f93894b.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(cbuf, "cbuf");
            if (this.f93896e) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f93897f;
            if (inputStreamReader == null) {
                pw.k kVar = this.f93894b;
                inputStreamReader = new InputStreamReader(kVar.inputStream(), yv.i.readBomAsCharset(kVar, this.f93895c));
                this.f93897f = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ w0 create$default(b bVar, String str, j0 j0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            return bVar.create(str, j0Var);
        }

        public final w0 create(String str, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            tu.v vVarChooseCharset = yv.a.chooseCharset(j0Var);
            Charset charset = (Charset) vVarChooseCharset.component1();
            j0 j0Var2 = (j0) vVarChooseCharset.component2();
            pw.g gVarWriteString = new pw.g().writeString(str, charset);
            return create(gVarWriteString, j0Var2, gVarWriteString.size());
        }

        public static /* synthetic */ w0 create$default(b bVar, byte[] bArr, j0 j0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            return bVar.create(bArr, j0Var);
        }

        public static /* synthetic */ w0 create$default(b bVar, pw.l lVar, j0 j0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            return bVar.create(lVar, j0Var);
        }

        public static /* synthetic */ w0 create$default(b bVar, pw.k kVar, j0 j0Var, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return bVar.create(kVar, j0Var, j10);
        }

        public final w0 create(byte[] bArr, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
            return create(new pw.g().write(bArr), j0Var, bArr.length);
        }

        public final w0 create(pw.l lVar, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<this>");
            return create(new pw.g().write(lVar), j0Var, lVar.size());
        }

        public final w0 create(pw.k kVar, j0 j0Var, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(kVar, "<this>");
            return new x0(j0Var, j10, kVar);
        }

        @tu.f
        public final w0 create(j0 j0Var, String content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create(content, j0Var);
        }

        @tu.f
        public final w0 create(j0 j0Var, byte[] content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create(content, j0Var);
        }

        @tu.f
        public final w0 create(j0 j0Var, pw.l content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create(content, j0Var);
        }

        @tu.f
        public final w0 create(j0 j0Var, long j10, pw.k content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create(content, j0Var, j10);
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = b.create$default(bVar, pw.l.f81912g, (j0) null, 1, (Object) null);
    }

    public static final w0 create(String str, j0 j0Var) {
        return Companion.create(str, j0Var);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final pw.l byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(o2.m(jContentLength, "Cannot buffer entire body for content length: "));
        }
        pw.k kVarSource = source();
        pw.l th2 = null;
        try {
            pw.l byteString = kVarSource.readByteString();
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = byteString;
        } catch (Throwable th4) {
            th = th4;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th5) {
                    tu.h.addSuppressed(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int size = th2.size();
        if (jContentLength == -1 || jContentLength == size) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(o2.m(jContentLength, "Cannot buffer entire body for content length: "));
        }
        pw.k kVarSource = source();
        byte[] th2 = null;
        try {
            byte[] byteArray = kVarSource.readByteArray();
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = byteArray;
        } catch (Throwable th4) {
            th = th4;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th5) {
                    tu.h.addSuppressed(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th2.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), yv.a.charsetOrUtf8(contentType()));
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        yv.h.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract j0 contentType();

    public abstract pw.k source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final String string() throws IOException {
        pw.k kVarSource = source();
        String th2 = null;
        try {
            String string = kVarSource.readString(yv.i.readBomAsCharset(kVarSource, yv.a.charsetOrUtf8(contentType())));
            try {
                kVarSource.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = string;
        } catch (Throwable th4) {
            th = th4;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th5) {
                    tu.h.addSuppressed(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }

    public static final w0 create(pw.k kVar, j0 j0Var, long j10) {
        return Companion.create(kVar, j0Var, j10);
    }

    public static final w0 create(pw.l lVar, j0 j0Var) {
        return Companion.create(lVar, j0Var);
    }

    @tu.f
    public static final w0 create(j0 j0Var, long j10, pw.k kVar) {
        return Companion.create(j0Var, j10, kVar);
    }

    @tu.f
    public static final w0 create(j0 j0Var, String str) {
        return Companion.create(j0Var, str);
    }

    @tu.f
    public static final w0 create(j0 j0Var, pw.l lVar) {
        return Companion.create(j0Var, lVar);
    }

    @tu.f
    public static final w0 create(j0 j0Var, byte[] bArr) {
        return Companion.create(j0Var, bArr);
    }

    public static final w0 create(byte[] bArr, j0 j0Var) {
        return Companion.create(bArr, j0Var);
    }
}
