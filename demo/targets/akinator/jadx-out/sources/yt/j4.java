package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j4 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k4 f95720b;

    public j4(k4 k4Var) {
        this.f95720b = k4Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        k4 k4Var = this.f95720b;
        int i10 = k4Var.f95801e;
        tw.c cVar = k4Var.f95799b;
        AtomicInteger atomicInteger = k4Var.f95804h;
        k4Var.f95803g.delete(this);
        if (k4Var.get() == 0) {
            if (k4Var.compareAndSet(0, 1)) {
                boolean z10 = atomicInteger.decrementAndGet() == 0;
                eu.d dVar = (eu.d) k4Var.f95807k.get();
                if (z10 && (dVar == null || dVar.isEmpty())) {
                    Throwable thTerminate = k4Var.f95805i.terminate();
                    if (thTerminate != null) {
                        cVar.onError(thTerminate);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                }
                if (i10 != Integer.MAX_VALUE) {
                    k4Var.f95808l.request(1L);
                }
                if (k4Var.decrementAndGet() == 0) {
                    return;
                }
                k4Var.a();
                return;
            }
        }
        atomicInteger.decrementAndGet();
        if (i10 != Integer.MAX_VALUE) {
            k4Var.f95808l.request(1L);
        }
        if (k4Var.getAndIncrement() == 0) {
            k4Var.a();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        k4 k4Var = this.f95720b;
        pt.b bVar = k4Var.f95803g;
        bVar.delete(this);
        if (!k4Var.f95805i.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!k4Var.f95800c) {
            k4Var.f95808l.cancel();
            bVar.dispose();
        } else if (k4Var.f95801e != Integer.MAX_VALUE) {
            k4Var.f95808l.request(1L);
        }
        k4Var.f95804h.decrementAndGet();
        if (k4Var.getAndIncrement() == 0) {
            k4Var.a();
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    @Override // mt.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            yt.k4 r0 = r6.f95720b
            pt.b r1 = r0.f95803g
            r1.delete(r6)
            int r1 = r0.get()
            if (r1 != 0) goto L7c
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L7c
            java.util.concurrent.atomic.AtomicInteger r3 = r0.f95804h
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L1e
            r1 = r2
        L1e:
            java.util.concurrent.atomic.AtomicLong r2 = r0.f95802f
            long r2 = r2.get()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L69
            tw.c r2 = r0.f95799b
            r2.onNext(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r0.f95807k
            java.lang.Object r7 = r7.get()
            eu.d r7 = (eu.d) r7
            if (r1 == 0) goto L55
            if (r7 == 0) goto L41
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L55
        L41:
            iu.d r7 = r0.f95805i
            java.lang.Throwable r7 = r7.terminate()
            if (r7 == 0) goto L4f
            tw.c r0 = r0.f95799b
            r0.onError(r7)
            return
        L4f:
            tw.c r7 = r0.f95799b
            r7.onComplete()
            return
        L55:
            java.util.concurrent.atomic.AtomicLong r7 = r0.f95802f
            r1 = 1
            iu.e.produced(r7, r1)
            int r7 = r0.f95801e
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r3) goto L72
            tw.d r7 = r0.f95808l
            r7.request(r1)
            goto L72
        L69:
            eu.d r1 = r0.b()
            monitor-enter(r1)
            r1.offer(r7)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
        L72:
            int r7 = r0.decrementAndGet()
            if (r7 != 0) goto L91
            goto L90
        L79:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            throw r7
        L7c:
            eu.d r1 = r0.b()
            monitor-enter(r1)
            r1.offer(r7)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.atomic.AtomicInteger r7 = r0.f95804h
            r7.decrementAndGet()
            int r7 = r0.getAndIncrement()
            if (r7 == 0) goto L91
        L90:
            return
        L91:
            r0.a()
            return
        L95:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L95
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.j4.onSuccess(java.lang.Object):void");
    }
}
