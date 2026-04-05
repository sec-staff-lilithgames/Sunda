package p8;

import android.util.Log;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a1 implements k, j {

    /* renamed from: b, reason: collision with root package name */
    public final l f80726b;

    /* renamed from: c, reason: collision with root package name */
    public final r f80727c;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f80728e;

    /* renamed from: f, reason: collision with root package name */
    public volatile g f80729f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f80730g;

    /* renamed from: h, reason: collision with root package name */
    public volatile u8.k0 f80731h;

    /* renamed from: i, reason: collision with root package name */
    public volatile h f80732i;

    public a1(l lVar, r rVar) {
        this.f80726b = lVar;
        this.f80727c = rVar;
    }

    public final boolean a(Object obj) throws Throwable {
        Throwable th2;
        long logTime = j9.l.getLogTime();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.g rewinder = this.f80726b.f80805c.getRegistry().getRewinder(obj);
            Object objRewindAndGet = rewinder.rewindAndGet();
            n8.d sourceEncoder = this.f80726b.f80805c.getRegistry().getSourceEncoder(objRewindAndGet);
            i iVar = new i(sourceEncoder, objRewindAndGet, this.f80726b.f80811i);
            n8.q qVar = this.f80731h.f88089a;
            l lVar = this.f80726b;
            h hVar = new h(qVar, lVar.f80816n);
            r8.c diskCache = ((c0) lVar.f80810h).getDiskCache();
            diskCache.put(hVar, iVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + hVar + ", data: " + obj + ", encoder: " + sourceEncoder + ", duration: " + j9.l.getElapsedMillis(logTime));
            }
            if (diskCache.get(hVar) != null) {
                this.f80732i = hVar;
                this.f80729f = new g(Collections.singletonList(this.f80731h.f88089a), this.f80726b, this);
                this.f80731h.f88091c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f80732i + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f80727c.onDataFetcherReady(this.f80731h.f88089a, rewinder.rewindAndGet(), this.f80731h.f88091c, this.f80731h.f88091c.getDataSource(), this.f80731h.f88089a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f80731h.f88091c.cleanup();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // p8.k
    public void cancel() {
        u8.k0 k0Var = this.f80731h;
        if (k0Var != null) {
            k0Var.f88091c.cancel();
        }
    }

    @Override // p8.j
    public void onDataFetcherFailed(n8.q qVar, Exception exc, com.bumptech.glide.load.data.e eVar, n8.a aVar) {
        this.f80727c.onDataFetcherFailed(qVar, exc, eVar, this.f80731h.f88091c.getDataSource());
    }

    @Override // p8.j
    public void onDataFetcherReady(n8.q qVar, Object obj, com.bumptech.glide.load.data.e eVar, n8.a aVar, n8.q qVar2) {
        this.f80727c.onDataFetcherReady(qVar, obj, eVar, this.f80731h.f88091c.getDataSource(), qVar);
    }

    @Override // p8.j
    public void reschedule() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // p8.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean startNext() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f80730g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r6.f80730g
            r6.f80730g = r1
            boolean r0 = r6.a(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            p8.g r0 = r6.f80729f
            if (r0 == 0) goto L2d
            p8.g r0 = r6.f80729f
            boolean r0 = r0.startNext()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r6.f80729f = r1
            r6.f80731h = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L9a
            int r1 = r6.f80728e
            p8.l r3 = r6.f80726b
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L9a
            p8.l r1 = r6.f80726b
            java.util.ArrayList r1 = r1.b()
            int r3 = r6.f80728e
            int r4 = r3 + 1
            r6.f80728e = r4
            java.lang.Object r1 = r1.get(r3)
            u8.k0 r1 = (u8.k0) r1
            r6.f80731h = r1
            u8.k0 r1 = r6.f80731h
            if (r1 == 0) goto L32
            p8.l r1 = r6.f80726b
            p8.z r1 = r1.f80818p
            u8.k0 r3 = r6.f80731h
            com.bumptech.glide.load.data.e r3 = r3.f88091c
            n8.a r3 = r3.getDataSource()
            boolean r1 = r1.isDataCacheable(r3)
            if (r1 != 0) goto L86
            p8.l r1 = r6.f80726b
            u8.k0 r3 = r6.f80731h
            com.bumptech.glide.load.data.e r3 = r3.f88091c
            java.lang.Class r3 = r3.getDataClass()
            com.bumptech.glide.h r4 = r1.f80805c
            com.bumptech.glide.m r4 = r4.getRegistry()
            java.lang.Class r5 = r1.f80809g
            java.lang.Class r1 = r1.f80813k
            p8.s0 r1 = r4.getLoadPath(r3, r5, r1)
            if (r1 == 0) goto L32
        L86:
            u8.k0 r0 = r6.f80731h
            u8.k0 r1 = r6.f80731h
            com.bumptech.glide.load.data.e r1 = r1.f88091c
            p8.l r3 = r6.f80726b
            com.bumptech.glide.l r3 = r3.f80817o
            p8.z0 r4 = new p8.z0
            r4.<init>(r6, r0)
            r1.loadData(r3, r4)
            r0 = r2
            goto L32
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.a1.startNext():boolean");
    }
}
