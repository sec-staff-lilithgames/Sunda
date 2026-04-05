package com.applovin.shadow.okio.internal;

import av.e;
import b0.e2;
import bv.d;
import bv.f;
import bv.l;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kv.p;
import rv.t;
import rv.v;
import rv.w;
import tu.a0;
import tu.x0;
import uu.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes4.dex */
public final class FileSystem {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    public static final class C08211 extends l implements p {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08211(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z10, zu.d<? super C08211> dVar) {
            super(2, dVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C08211 c08211 = new C08211(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, dVar);
            c08211.L$0 = obj;
            return c08211;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            v vVar;
            u uVar;
            Iterator<Path> it;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                v vVar2 = (v) this.L$0;
                u uVar2 = new u();
                uVar2.addLast(this.$dir);
                vVar = vVar2;
                uVar = uVar2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                u uVar3 = (u) this.L$1;
                vVar = (v) this.L$0;
                a0.throwOnFailure(obj);
                uVar = uVar3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                com.applovin.shadow.okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z10 = this.$followSymlinks;
                this.L$0 = vVar;
                this.L$1 = uVar;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(vVar, fileSystem, uVar, next, z10, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(v vVar, zu.d<? super x0> dVar) {
            return ((C08211) create(vVar, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r16.yield(r1, r4) == r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        if (r12 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5 A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #1 {all -> 0x0134, blocks: (B:48:0x00ef, B:50:0x00f5, B:47:0x00e7), top: B:72:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x012c -> B:19:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(rv.v r16, com.applovin.shadow.okio.FileSystem r17, uu.u r18, com.applovin.shadow.okio.Path r19, boolean r20, boolean r21, zu.d<? super tu.x0> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.collectRecursively(rv.v, com.applovin.shadow.okio.FileSystem, uu.u, com.applovin.shadow.okio.Path, boolean, boolean, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(com.applovin.shadow.okio.FileSystem r4, com.applovin.shadow.okio.Path r5, com.applovin.shadow.okio.Path r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            com.applovin.shadow.okio.Source r5 = r4.source(r5)
            r0 = 0
            com.applovin.shadow.okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L3a
            com.applovin.shadow.okio.BufferedSink r4 = com.applovin.shadow.okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L3a
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3e
        L2c:
            r4 = r0
            goto L3e
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L3c
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r4 = move-exception
            tu.h.addSuppressed(r6, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r4 = move-exception
            goto L54
        L3c:
            r4 = r6
            r6 = r0
        L3e:
            if (r4 != 0) goto L53
            kotlin.jvm.internal.e0.checkNotNull(r6)     // Catch: java.lang.Throwable -> L3a
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r0 = move-exception
            goto L61
        L53:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L54:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            tu.h.addSuppressed(r4, r5)
        L5e:
            r3 = r0
            r0 = r4
            r4 = r3
        L61:
            if (r0 != 0) goto L67
            kotlin.jvm.internal.e0.checkNotNull(r4)
            return
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.commonCopy(com.applovin.shadow.okio.FileSystem, com.applovin.shadow.okio.Path, com.applovin.shadow.okio.Path):void");
    }

    public static final void commonCreateDirectories(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(dir, "dir");
        u uVar = new u();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            uVar.addFirst(pathParent);
        }
        if (z10 && uVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = uVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path fileOrDirectory, boolean z10) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator<Object> it = w.sequence(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final t commonListRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(dir, "dir");
        return w.sequence(new C08211(dir, fileSystem, z10, null));
    }

    public static final FileMetadata commonMetadata(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(e2.j(path, "no such file: "));
    }

    public static final Path symlinkTarget(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        e0.checkNotNull(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
