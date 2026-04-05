package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g2 extends AtomicReference implements mt.q0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52736b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f52737c = new tt.h();

    /* renamed from: e, reason: collision with root package name */
    public final mt.t0 f52738e;

    public g2(mt.q0 q0Var, mt.t0 t0Var) {
        this.f52736b = q0Var;
        this.f52738e = t0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        this.f52737c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52736b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52736b.onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52738e.subscribe(this);
    }
}
