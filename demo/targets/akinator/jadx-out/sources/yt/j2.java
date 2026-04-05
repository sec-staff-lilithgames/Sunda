package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j2 extends AtomicReference implements Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f95715b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95716c;

    /* renamed from: e, reason: collision with root package name */
    public final k2 f95717e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f95718f = new AtomicBoolean();

    public j2(Object obj, long j10, k2 k2Var) {
        this.f95715b = obj;
        this.f95716c = j10;
        this.f95717e = k2Var;
    }

    public final void a() {
        if (this.f95718f.compareAndSet(false, true)) {
            k2 k2Var = this.f95717e;
            long j10 = this.f95716c;
            Object obj = this.f95715b;
            if (j10 == k2Var.f95793i) {
                if (k2Var.get() == 0) {
                    k2Var.cancel();
                    k2Var.f95787b.onError(new qt.e("Could not deliver value due to lack of requests"));
                } else {
                    k2Var.f95787b.onNext(obj);
                    iu.e.produced(k2Var, 1L);
                    dispose();
                }
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    public void setResource(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
