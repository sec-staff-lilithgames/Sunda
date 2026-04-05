package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 extends AtomicReference implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f8105b;

    public k0(l0 l0Var) {
        this.f8105b = l0Var;
    }

    @Override // mt.f
    public void onComplete() {
        l0 l0Var = this.f8105b;
        AtomicReference atomicReference = l0Var.f8126g;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        if (l0Var.f8127h) {
            Throwable thTerminate = l0Var.f8125f.terminate();
            if (thTerminate == null) {
                l0Var.f8122b.onComplete();
            } else {
                l0Var.f8122b.onError(thTerminate);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        mu.a.onError(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        return;
     */
    @Override // mt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            au.l0 r0 = r3.f8105b
            java.util.concurrent.atomic.AtomicReference r1 = r0.f8126g
        L4:
            r2 = 0
            boolean r2 = r1.compareAndSet(r3, r2)
            if (r2 == 0) goto L3a
            iu.d r1 = r0.f8125f
            boolean r1 = r1.addThrowable(r4)
            if (r1 == 0) goto L40
            boolean r4 = r0.f8124e
            if (r4 == 0) goto L27
            boolean r4 = r0.f8127h
            if (r4 == 0) goto L39
            iu.d r4 = r0.f8125f
            java.lang.Throwable r4 = r4.terminate()
            mt.f r0 = r0.f8122b
            r0.onError(r4)
            return
        L27:
            r0.dispose()
            iu.d r4 = r0.f8125f
            java.lang.Throwable r4 = r4.terminate()
            iu.l r1 = iu.m.f68415a
            if (r4 == r1) goto L39
            mt.f r0 = r0.f8122b
            r0.onError(r4)
        L39:
            return
        L3a:
            java.lang.Object r2 = r1.get()
            if (r2 == r3) goto L4
        L40:
            mu.a.onError(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.k0.onError(java.lang.Throwable):void");
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
