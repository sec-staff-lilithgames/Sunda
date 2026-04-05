package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s1 extends gu.o implements mt.q0 {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f96302g;

    /* renamed from: h, reason: collision with root package name */
    public mt.t0 f96303h;

    public s1(tw.c cVar, mt.t0 t0Var) {
        super(cVar);
        this.f96303h = t0Var;
        this.f96302g = new AtomicReference();
    }

    @Override // gu.o, tw.d
    public void cancel() {
        super.cancel();
        tt.d.dispose(this.f96302g);
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f58460c = hu.g.f59176b;
        mt.t0 t0Var = this.f96303h;
        this.f96303h = null;
        t0Var.subscribe(this);
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58459b.onError(th2);
    }

    @Override // gu.o, mt.q, tw.c
    public void onNext(Object obj) {
        this.f58462f++;
        this.f58459b.onNext(obj);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f96302g, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        a(obj);
    }
}
