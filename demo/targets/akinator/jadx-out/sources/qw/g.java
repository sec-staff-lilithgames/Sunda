package qw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import p0.o2;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r16.yield(r1, r4) == r5) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r12 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:49:0x00dc, B:51:0x00e2, B:48:0x00d4), top: B:71:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0119 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(rv.v r16, pw.r r17, uu.u r18, pw.n0 r19, boolean r20, boolean r21, zu.d<? super tu.x0> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.g.collectRecursively(rv.v, pw.r, uu.u, pw.n0, boolean, boolean, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:3:0x0016, B:21:0x0042, B:27:0x004d, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:47:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:3:0x0016, B:21:0x0042, B:27:0x004d, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:47:0x0016, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(pw.r r3, pw.n0 r4, pw.n0 r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            pw.b1 r4 = r3.source(r4)
            r0 = 0
            r1 = 2
            r2 = 0
            pw.z0 r3 = pw.r.sink$default(r3, r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            pw.j r3 = pw.h0.buffer(r3)     // Catch: java.lang.Throwable -> L3c
            long r0 = r3.writeAll(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2e
            r3.close()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r3 = move-exception
            goto L40
        L2e:
            r3 = r2
            goto L40
        L30:
            r5 = move-exception
            if (r3 == 0) goto L3e
            r3.close()     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r3 = move-exception
            tu.h.addSuppressed(r5, r3)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r3 = move-exception
            goto L4e
        L3e:
            r3 = r5
            r5 = r2
        L40:
            if (r3 != 0) goto L4d
            r5.longValue()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Throwable -> L4b
            goto L59
        L4b:
            r2 = move-exception
            goto L59
        L4d:
            throw r3     // Catch: java.lang.Throwable -> L3c
        L4e:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r4 = move-exception
            tu.h.addSuppressed(r3, r4)
        L58:
            r2 = r3
        L59:
            if (r2 != 0) goto L5c
            return
        L5c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.g.commonCopy(pw.r, pw.n0, pw.n0):void");
    }

    public static final void commonCreateDirectories(pw.r rVar, n0 dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(dir, "dir");
        uu.u uVar = new uu.u();
        for (n0 n0VarParent = dir; n0VarParent != null && !rVar.exists(n0VarParent); n0VarParent = n0VarParent.parent()) {
            uVar.addFirst(n0VarParent);
        }
        if (z10 && uVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = uVar.iterator();
        while (it.hasNext()) {
            pw.r.createDirectory$default(rVar, (n0) it.next(), false, 2, null);
        }
    }

    public static final void commonDeleteRecursively(pw.r rVar, n0 fileOrDirectory, boolean z10) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator<Object> it = rv.w.sequence(new e(rVar, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            rVar.delete((n0) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(pw.r rVar, n0 path) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(path, "path");
        return rVar.metadataOrNull(path) != null;
    }

    public static final rv.t commonListRecursively(pw.r rVar, n0 dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(dir, "dir");
        return rv.w.sequence(new f(dir, rVar, z10, null));
    }

    public static final pw.q commonMetadata(pw.r rVar, n0 path) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(path, "path");
        pw.q qVarMetadataOrNull = rVar.metadataOrNull(path);
        if (qVarMetadataOrNull != null) {
            return qVarMetadataOrNull;
        }
        throw new FileNotFoundException(o2.s(path, "no such file: "));
    }

    public static final n0 symlinkTarget(pw.r rVar, n0 path) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(path, "path");
        n0 symlinkTarget = rVar.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        n0 n0VarParent = path.parent();
        e0.checkNotNull(n0VarParent);
        return n0VarParent.resolve(symlinkTarget);
    }
}
