package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final z0 f11233b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11234c;

    public y0(z0 z0Var, int i10) {
        this.f11233b = z0Var;
        this.f11234c = i10;
    }

    public void dispose() {
        tt.d.dispose(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
    @Override // mt.i0, mt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onComplete() {
        /*
            r5 = this;
            bu.z0 r0 = r5.f11233b
            int r1 = r5.f11234c
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.f11278f     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            goto L2b
        Ld:
            r1 = r2[r1]     // Catch: java.lang.Throwable -> Lb
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 != 0) goto L1f
            int r4 = r0.f11285m     // Catch: java.lang.Throwable -> Lb
            int r4 = r4 + r3
            r0.f11285m = r4     // Catch: java.lang.Throwable -> Lb
            int r2 = r2.length     // Catch: java.lang.Throwable -> Lb
            if (r4 != r2) goto L21
        L1f:
            r0.f11282j = r3     // Catch: java.lang.Throwable -> Lb
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L27
            r0.a()
        L27:
            r0.c()
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.y0.onComplete():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001a, B:18:0x0023, B:21:0x002d, B:20:0x002b), top: B:31:0x0012 }] */
    @Override // mt.i0, mt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            bu.z0 r0 = r4.f11233b
            int r1 = r4.f11234c
            iu.d r2 = r0.f11283k
            boolean r2 = r2.addThrowable(r5)
            if (r2 == 0) goto L3b
            boolean r5 = r0.f11280h
            r2 = 1
            if (r5 == 0) goto L32
            monitor-enter(r0)
            java.lang.Object[] r5 = r0.f11278f     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r5 = move-exception
            goto L30
        L1a:
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            r1 = r2
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 != 0) goto L2b
            int r3 = r0.f11285m     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + r2
            r0.f11285m = r3     // Catch: java.lang.Throwable -> L18
            int r5 = r5.length     // Catch: java.lang.Throwable -> L18
            if (r3 != r5) goto L2d
        L2b:
            r0.f11282j = r2     // Catch: java.lang.Throwable -> L18
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            r2 = r1
            goto L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r5
        L32:
            if (r2 == 0) goto L37
            r0.a()
        L37:
            r0.c()
            return
        L3b:
            mu.a.onError(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.y0.onError(java.lang.Throwable):void");
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        boolean z10;
        z0 z0Var = this.f11233b;
        int i10 = this.f11234c;
        synchronized (z0Var) {
            try {
                Object[] objArr = z0Var.f11278f;
                if (objArr == null) {
                    return;
                }
                Object obj2 = objArr[i10];
                int i11 = z0Var.f11284l;
                if (obj2 == null) {
                    i11++;
                    z0Var.f11284l = i11;
                }
                objArr[i10] = obj;
                if (i11 == objArr.length) {
                    z0Var.f11279g.offer(objArr.clone());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z0Var.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
