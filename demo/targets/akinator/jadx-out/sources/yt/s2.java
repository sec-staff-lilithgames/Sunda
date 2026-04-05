package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s2 extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f96304b;

    public s2(t2 t2Var) {
        this.f96304b = t2Var;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (((tw.d) get()) != hu.g.f59176b) {
            t2 t2Var = this.f96304b;
            t2Var.f96347c.subscribe(t2Var);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (((tw.d) get()) != hu.g.f59176b) {
            this.f96304b.f96346b.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        tw.d dVar = (tw.d) get();
        hu.g gVar = hu.g.f59176b;
        if (dVar != gVar) {
            lazySet(gVar);
            dVar.cancel();
            t2 t2Var = this.f96304b;
            t2Var.f96347c.subscribe(t2Var);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            dVar.request(Long.MAX_VALUE);
        }
    }
}
