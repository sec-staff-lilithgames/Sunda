package pw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import p0.o2;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1 extends r {

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f81905h;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f81906e;

    /* renamed from: f, reason: collision with root package name */
    public final r f81907f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f81908g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final n0 getROOT() {
            return g1.f81905h;
        }
    }

    static {
        new a(null);
        f81905h = n0.a.get$default(n0.f81931c, "/", false, 1, (Object) null);
    }

    public g1(n0 zipPath, r fileSystem, Map<n0, qw.q> entries, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zipPath, "zipPath");
        kotlin.jvm.internal.e0.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.e0.checkNotNullParameter(entries, "entries");
        this.f81906e = zipPath;
        this.f81907f = fileSystem;
        this.f81908g = entries;
    }

    public final List a(n0 n0Var, boolean z10) throws IOException {
        qw.q qVar = (qw.q) this.f81908g.get(f81905h.resolve(n0Var, true));
        if (qVar != null) {
            return uu.y0.toList(qVar.getChildren());
        }
        if (z10) {
            throw new IOException(o2.s(n0Var, "not a directory: "));
        }
        return null;
    }

    @Override // pw.r
    public z0 appendingSink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pw.r
    public void atomicMove(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pw.r
    public n0 canonicalize(n0 path) throws FileNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        n0 n0VarResolve = f81905h.resolve(path, true);
        if (this.f81908g.containsKey(n0VarResolve)) {
            return n0VarResolve;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // pw.r
    public void createDirectory(n0 dir, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pw.r
    public void createSymlink(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pw.r
    public void delete(n0 path, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // pw.r
    public List<n0> list(n0 dir) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        List<n0> listA = a(dir, true);
        kotlin.jvm.internal.e0.checkNotNull(listA);
        return listA;
    }

    @Override // pw.r
    public List<n0> listOrNull(n0 dir) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        return a(dir, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:8:0x002a, B:32:0x005f, B:22:0x004d, B:9:0x0036, B:19:0x0048), top: B:50:0x002a, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // pw.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pw.q metadataOrNull(pw.n0 r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.e0.checkNotNullParameter(r15, r0)
            pw.n0 r0 = pw.g1.f81905h
            r1 = 1
            pw.n0 r15 = r0.resolve(r15, r1)
            java.util.Map r0 = r14.f81908g
            java.lang.Object r15 = r0.get(r15)
            qw.q r15 = (qw.q) r15
            r2 = 0
            if (r15 != 0) goto L18
            return r2
        L18:
            long r3 = r15.getOffset()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L70
            pw.r r0 = r14.f81907f
            pw.n0 r3 = r14.f81906e
            pw.p r3 = r0.openReadOnly(r3)
            long r4 = r15.getOffset()     // Catch: java.lang.Throwable -> L51
            pw.b1 r0 = r3.source(r4)     // Catch: java.lang.Throwable -> L51
            pw.k r4 = pw.h0.buffer(r0)     // Catch: java.lang.Throwable -> L51
            qw.q r15 = qw.u.readLocalHeader(r4, r15)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L42
            r4.close()     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r0 = move-exception
            goto L56
        L42:
            r0 = r2
            goto L56
        L44:
            r0 = move-exception
            r15 = r0
            if (r4 == 0) goto L54
            r4.close()     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r0 = move-exception
            tu.h.addSuppressed(r15, r0)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r0 = move-exception
            r15 = r0
            goto L60
        L54:
            r0 = r15
            r15 = r2
        L56:
            if (r0 != 0) goto L5f
            r3.close()     // Catch: java.lang.Throwable -> L5d
            r0 = r2
            goto L6c
        L5d:
            r0 = move-exception
            goto L6c
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L51
        L60:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            tu.h.addSuppressed(r15, r0)
        L6a:
            r0 = r15
            r15 = r2
        L6c:
            if (r0 != 0) goto L6f
            goto L70
        L6f:
            throw r0
        L70:
            pw.q r3 = new pw.q
            boolean r0 = r15.isDirectory()
            r4 = r0 ^ 1
            boolean r5 = r15.isDirectory()
            boolean r0 = r15.isDirectory()
            if (r0 == 0) goto L84
        L82:
            r7 = r2
            goto L8d
        L84:
            long r0 = r15.getSize()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L82
        L8d:
            java.lang.Long r8 = r15.getCreatedAtMillis$okio()
            java.lang.Long r9 = r15.getLastModifiedAtMillis$okio()
            java.lang.Long r10 = r15.getLastAccessedAtMillis$okio()
            r12 = 128(0x80, float:1.8E-43)
            r13 = 0
            r6 = 0
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.g1.metadataOrNull(pw.n0):pw.q");
    }

    @Override // pw.r
    public p openReadOnly(n0 file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // pw.r
    public p openReadWrite(n0 file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // pw.r
    public z0 sink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // pw.r
    public b1 source(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        qw.q qVar = (qw.q) this.f81908g.get(f81905h.resolve(file, true));
        if (qVar == null) {
            throw new FileNotFoundException(o2.s(file, "no such file: "));
        }
        p pVarOpenReadOnly = this.f81907f.openReadOnly(this.f81906e);
        k th2 = null;
        try {
            k kVarBuffer = h0.buffer(pVarOpenReadOnly.source(qVar.getOffset()));
            try {
                pVarOpenReadOnly.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = kVarBuffer;
        } catch (Throwable th4) {
            th = th4;
            if (pVarOpenReadOnly != null) {
                try {
                    pVarOpenReadOnly.close();
                } catch (Throwable th5) {
                    tu.h.addSuppressed(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        qw.u.skipLocalHeader(th2);
        return qVar.getCompressionMethod() == 0 ? new qw.m(th2, qVar.getSize(), true) : new qw.m(new a0(new qw.m(th2, qVar.getCompressedSize(), true), new Inflater(true)), qVar.getSize(), false);
    }
}
