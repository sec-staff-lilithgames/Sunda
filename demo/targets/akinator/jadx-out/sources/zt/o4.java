package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o4 extends AtomicReference implements mt.v, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98717b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f98718c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98719e;

    public o4(mt.v vVar, mt.m0 m0Var) {
        this.f98717b = vVar;
        this.f98718c = m0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d dVar = tt.d.f87352b;
        pt.c cVar = (pt.c) getAndSet(dVar);
        if (cVar != dVar) {
            this.f98719e = cVar;
            this.f98718c.scheduleDirect(this);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        this.f98717b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98717b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98717b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98717b.onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98719e.dispose();
    }
}
