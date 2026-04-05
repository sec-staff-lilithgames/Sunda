package c7;

import c7.s;
import java.io.Closeable;
import pw.h0;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public final n0 f11850b;

    /* renamed from: c, reason: collision with root package name */
    public final pw.r f11851c;

    /* renamed from: e, reason: collision with root package name */
    public final String f11852e;

    /* renamed from: f, reason: collision with root package name */
    public final Closeable f11853f;

    /* renamed from: g, reason: collision with root package name */
    public final s.a f11854g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11855h;

    /* renamed from: i, reason: collision with root package name */
    public pw.k f11856i;

    public r(n0 n0Var, pw.r rVar, String str, Closeable closeable, s.a aVar) {
        super(null);
        this.f11850b = n0Var;
        this.f11851c = rVar;
        this.f11852e = str;
        this.f11853f = closeable;
        this.f11854g = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f11855h = true;
            pw.k kVar = this.f11856i;
            if (kVar != null) {
                q7.n.closeQuietly(kVar);
            }
            Closeable closeable = this.f11853f;
            if (closeable != null) {
                q7.n.closeQuietly(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c7.s
    public synchronized n0 file() {
        if (this.f11855h) {
            throw new IllegalStateException("closed");
        }
        return this.f11850b;
    }

    @Override // c7.s
    public n0 fileOrNull() {
        return file();
    }

    public final String getDiskCacheKey$coil_base_release() {
        return this.f11852e;
    }

    public final n0 getFile$coil_base_release() {
        return this.f11850b;
    }

    @Override // c7.s
    public pw.r getFileSystem() {
        return this.f11851c;
    }

    @Override // c7.s
    public s.a getMetadata() {
        return this.f11854g;
    }

    @Override // c7.s
    public synchronized pw.k source() {
        if (this.f11855h) {
            throw new IllegalStateException("closed");
        }
        pw.k kVar = this.f11856i;
        if (kVar != null) {
            return kVar;
        }
        pw.k kVarBuffer = h0.buffer(getFileSystem().source(this.f11850b));
        this.f11856i = kVarBuffer;
        return kVarBuffer;
    }

    @Override // c7.s
    public synchronized pw.k sourceOrNull() {
        if (this.f11855h) {
            throw new IllegalStateException("closed");
        }
        return this.f11856i;
    }
}
