package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v3 extends AtomicReference implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w3 f11116b;

    public v3(w3 w3Var) {
        this.f11116b = w3Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        w3 w3Var = this.f11116b;
        pt.b bVar = w3Var.f11162e;
        bVar.delete(this);
        if (!w3Var.f11164g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!w3Var.f11161c) {
            w3Var.f11167j.dispose();
            bVar.dispose();
        }
        w3Var.f11163f.decrementAndGet();
        if (w3Var.getAndIncrement() == 0) {
            w3Var.a();
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // mt.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            bu.w3 r0 = r4.f11116b
            pt.b r1 = r0.f11162e
            r1.delete(r4)
            int r1 = r0.get()
            if (r1 != 0) goto L50
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L50
            mt.i0 r3 = r0.f11160b
            r3.onNext(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f11163f
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L23
            r1 = r2
        L23:
            java.util.concurrent.atomic.AtomicReference r5 = r0.f11166i
            java.lang.Object r5 = r5.get()
            eu.d r5 = (eu.d) r5
            if (r1 == 0) goto L49
            if (r5 == 0) goto L35
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L49
        L35:
            iu.d r5 = r0.f11164g
            java.lang.Throwable r5 = r5.terminate()
            if (r5 == 0) goto L43
            mt.i0 r0 = r0.f11160b
            r0.onError(r5)
            return
        L43:
            mt.i0 r5 = r0.f11160b
            r5.onComplete()
            return
        L49:
            int r5 = r0.decrementAndGet()
            if (r5 != 0) goto L7e
            goto L7d
        L50:
            java.util.concurrent.atomic.AtomicReference r1 = r0.f11166i
        L52:
            java.lang.Object r2 = r1.get()
            eu.d r2 = (eu.d) r2
            if (r2 == 0) goto L5c
        L5a:
            r3 = r2
            goto L6d
        L5c:
            eu.d r2 = new eu.d
            int r3 = mt.b0.bufferSize()
            r2.<init>(r3)
        L65:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L85
            goto L5a
        L6d:
            monitor-enter(r3)
            r3.offer(r5)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f11163f
            r5.decrementAndGet()
            int r5 = r0.getAndIncrement()
            if (r5 == 0) goto L7e
        L7d:
            return
        L7e:
            r0.a()
            return
        L82:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            throw r5
        L85:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L65
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.v3.onSuccess(java.lang.Object):void");
    }
}
