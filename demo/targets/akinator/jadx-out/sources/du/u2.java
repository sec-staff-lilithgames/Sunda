package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u2 extends AtomicReference implements mt.q0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52852b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f52853c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52854e;

    public u2(mt.q0 q0Var, mt.m0 m0Var) {
        this.f52852b = q0Var;
        this.f52853c = m0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d dVar = tt.d.f87352b;
        pt.c cVar = (pt.c) getAndSet(dVar);
        if (cVar != dVar) {
            this.f52854e = cVar;
            this.f52853c.scheduleDirect(this);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52852b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f52852b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52852b.onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52854e.dispose();
    }
}
