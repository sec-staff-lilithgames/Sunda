package c7;

import c7.s;
import java.io.File;
import kotlin.jvm.internal.e0;
import pw.h0;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends s {

    /* renamed from: b, reason: collision with root package name */
    public final File f11860b;

    /* renamed from: c, reason: collision with root package name */
    public final s.a f11861c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11862e;

    /* renamed from: f, reason: collision with root package name */
    public pw.k f11863f;

    /* renamed from: g, reason: collision with root package name */
    public n0 f11864g;

    public v(pw.k kVar, File file, s.a aVar) {
        super(null);
        this.f11860b = file;
        this.f11861c = aVar;
        this.f11863f = kVar;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f11862e = true;
            pw.k kVar = this.f11863f;
            if (kVar != null) {
                q7.n.closeQuietly(kVar);
            }
            n0 n0Var = this.f11864g;
            if (n0Var != null) {
                getFileSystem().delete(n0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c7.s
    public synchronized n0 file() {
        Long lValueOf;
        try {
            if (this.f11862e) {
                throw new IllegalStateException("closed");
            }
            n0 n0Var = this.f11864g;
            if (n0Var != null) {
                return n0Var;
            }
            n0 n0Var2 = n0.a.get$default(n0.f81931c, File.createTempFile("tmp", null, this.f11860b), false, 1, (Object) null);
            pw.j jVarBuffer = h0.buffer(getFileSystem().sink(n0Var2, false));
            try {
                pw.k kVar = this.f11863f;
                e0.checkNotNull(kVar);
                lValueOf = Long.valueOf(jVarBuffer.writeAll(kVar));
                th = null;
            } catch (Throwable th2) {
                th = th2;
                lValueOf = null;
            }
            if (jVarBuffer != null) {
                try {
                    jVarBuffer.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        tu.h.addSuppressed(th, th3);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            e0.checkNotNull(lValueOf);
            this.f11863f = null;
            this.f11864g = n0Var2;
            return n0Var2;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // c7.s
    public synchronized n0 fileOrNull() {
        if (this.f11862e) {
            throw new IllegalStateException("closed");
        }
        return this.f11864g;
    }

    @Override // c7.s
    public pw.r getFileSystem() {
        return pw.r.f81966c;
    }

    @Override // c7.s
    public s.a getMetadata() {
        return this.f11861c;
    }

    @Override // c7.s
    public synchronized pw.k source() {
        if (this.f11862e) {
            throw new IllegalStateException("closed");
        }
        pw.k kVar = this.f11863f;
        if (kVar != null) {
            return kVar;
        }
        pw.r fileSystem = getFileSystem();
        n0 n0Var = this.f11864g;
        e0.checkNotNull(n0Var);
        pw.k kVarBuffer = h0.buffer(fileSystem.source(n0Var));
        this.f11863f = kVarBuffer;
        return kVarBuffer;
    }

    @Override // c7.s
    public pw.k sourceOrNull() {
        return source();
    }
}
