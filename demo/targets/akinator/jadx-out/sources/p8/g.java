package p8;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements k, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f80760b;

    /* renamed from: c, reason: collision with root package name */
    public final l f80761c;

    /* renamed from: e, reason: collision with root package name */
    public final j f80762e;

    /* renamed from: f, reason: collision with root package name */
    public int f80763f = -1;

    /* renamed from: g, reason: collision with root package name */
    public n8.q f80764g;

    /* renamed from: h, reason: collision with root package name */
    public List f80765h;

    /* renamed from: i, reason: collision with root package name */
    public int f80766i;

    /* renamed from: j, reason: collision with root package name */
    public volatile u8.k0 f80767j;

    /* renamed from: k, reason: collision with root package name */
    public File f80768k;

    public g(List list, l lVar, j jVar) {
        this.f80760b = list;
        this.f80761c = lVar;
        this.f80762e = jVar;
    }

    @Override // p8.k
    public void cancel() {
        u8.k0 k0Var = this.f80767j;
        if (k0Var != null) {
            k0Var.f88091c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void onDataReady(Object obj) {
        this.f80762e.onDataFetcherReady(this.f80764g, obj, this.f80767j.f88091c, n8.a.f75825e, this.f80764g);
    }

    @Override // com.bumptech.glide.load.data.d
    public void onLoadFailed(Exception exc) {
        this.f80762e.onDataFetcherFailed(this.f80764g, exc, this.f80767j.f88091c, n8.a.f75825e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        r8.f80767j = null;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r0 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r8.f80766i >= r8.f80765h.size()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r3 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        r3 = r8.f80765h;
        r4 = r8.f80766i;
        r8.f80766i = r4 + 1;
        r3 = (u8.l0) r3.get(r4);
        r4 = r8.f80768k;
        r5 = r8.f80761c;
        r8.f80767j = r3.buildLoadData(r4, r5.f80807e, r5.f80808f, r5.f80811i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r8.f80767j == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        r3 = r8.f80761c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r3.f80805c.getRegistry().getLoadPath(r8.f80767j.f88091c.getDataClass(), r3.f80809g, r3.f80813k) == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r3 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        r8.f80767j.f88091c.loadData(r8.f80761c.f80817o, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        return r0;
     */
    @Override // p8.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean startNext() {
        /*
            r8 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            k9.i.beginSection(r0)
        L5:
            java.util.List r0 = r8.f80765h     // Catch: java.lang.Throwable -> L7d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L83
            int r3 = r8.f80766i     // Catch: java.lang.Throwable -> L7d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7d
            if (r3 >= r0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 != 0) goto L1a
            goto L83
        L1a:
            r0 = 0
            r8.f80767j = r0     // Catch: java.lang.Throwable -> L7d
            r0 = r2
        L1e:
            if (r0 != 0) goto L7f
            int r3 = r8.f80766i     // Catch: java.lang.Throwable -> L7d
            java.util.List r4 = r8.f80765h     // Catch: java.lang.Throwable -> L7d
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L7d
            if (r3 >= r4) goto L2c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 == 0) goto L7f
            java.util.List r3 = r8.f80765h     // Catch: java.lang.Throwable -> L7d
            int r4 = r8.f80766i     // Catch: java.lang.Throwable -> L7d
            int r5 = r4 + 1
            r8.f80766i = r5     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L7d
            u8.l0 r3 = (u8.l0) r3     // Catch: java.lang.Throwable -> L7d
            java.io.File r4 = r8.f80768k     // Catch: java.lang.Throwable -> L7d
            p8.l r5 = r8.f80761c     // Catch: java.lang.Throwable -> L7d
            int r6 = r5.f80807e     // Catch: java.lang.Throwable -> L7d
            int r7 = r5.f80808f     // Catch: java.lang.Throwable -> L7d
            n8.v r5 = r5.f80811i     // Catch: java.lang.Throwable -> L7d
            u8.k0 r3 = r3.buildLoadData(r4, r6, r7, r5)     // Catch: java.lang.Throwable -> L7d
            r8.f80767j = r3     // Catch: java.lang.Throwable -> L7d
            u8.k0 r3 = r8.f80767j     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L1e
            p8.l r3 = r8.f80761c     // Catch: java.lang.Throwable -> L7d
            u8.k0 r4 = r8.f80767j     // Catch: java.lang.Throwable -> L7d
            com.bumptech.glide.load.data.e r4 = r4.f88091c     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r4 = r4.getDataClass()     // Catch: java.lang.Throwable -> L7d
            com.bumptech.glide.h r5 = r3.f80805c     // Catch: java.lang.Throwable -> L7d
            com.bumptech.glide.m r5 = r5.getRegistry()     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r6 = r3.f80809g     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r3 = r3.f80813k     // Catch: java.lang.Throwable -> L7d
            p8.s0 r3 = r5.getLoadPath(r4, r6, r3)     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L6d
            r3 = r1
            goto L6e
        L6d:
            r3 = r2
        L6e:
            if (r3 == 0) goto L1e
            u8.k0 r0 = r8.f80767j     // Catch: java.lang.Throwable -> L7d
            com.bumptech.glide.load.data.e r0 = r0.f88091c     // Catch: java.lang.Throwable -> L7d
            p8.l r3 = r8.f80761c     // Catch: java.lang.Throwable -> L7d
            com.bumptech.glide.l r3 = r3.f80817o     // Catch: java.lang.Throwable -> L7d
            r0.loadData(r3, r8)     // Catch: java.lang.Throwable -> L7d
            r0 = r1
            goto L1e
        L7d:
            r0 = move-exception
            goto Lcb
        L7f:
            k9.i.endSection()
            return r0
        L83:
            int r0 = r8.f80763f     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + r1
            r8.f80763f = r0     // Catch: java.lang.Throwable -> L7d
            java.util.List r1 = r8.f80760b     // Catch: java.lang.Throwable -> L7d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7d
            if (r0 < r1) goto L94
            k9.i.endSection()
            return r2
        L94:
            java.util.List r0 = r8.f80760b     // Catch: java.lang.Throwable -> L7d
            int r1 = r8.f80763f     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L7d
            n8.q r0 = (n8.q) r0     // Catch: java.lang.Throwable -> L7d
            p8.h r1 = new p8.h     // Catch: java.lang.Throwable -> L7d
            p8.l r3 = r8.f80761c     // Catch: java.lang.Throwable -> L7d
            n8.q r4 = r3.f80816n     // Catch: java.lang.Throwable -> L7d
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L7d
            p8.o r3 = r3.f80810h     // Catch: java.lang.Throwable -> L7d
            p8.c0 r3 = (p8.c0) r3     // Catch: java.lang.Throwable -> L7d
            r8.c r3 = r3.getDiskCache()     // Catch: java.lang.Throwable -> L7d
            java.io.File r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L7d
            r8.f80768k = r1     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L5
            r8.f80764g = r0     // Catch: java.lang.Throwable -> L7d
            p8.l r0 = r8.f80761c     // Catch: java.lang.Throwable -> L7d
            com.bumptech.glide.h r0 = r0.f80805c     // Catch: java.lang.Throwable -> L7d
            com.bumptech.glide.m r0 = r0.getRegistry()     // Catch: java.lang.Throwable -> L7d
            java.util.List r0 = r0.getModelLoaders(r1)     // Catch: java.lang.Throwable -> L7d
            r8.f80765h = r0     // Catch: java.lang.Throwable -> L7d
            r8.f80766i = r2     // Catch: java.lang.Throwable -> L7d
            goto L5
        Lcb:
            k9.i.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.g.startNext():boolean");
    }
}
