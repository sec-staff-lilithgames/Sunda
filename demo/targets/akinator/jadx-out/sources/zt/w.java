package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98806b;

    /* renamed from: c, reason: collision with root package name */
    public Object f98807c;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f98808e;

    public w(mt.v vVar) {
        this.f98806b = vVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        Throwable th2 = this.f98808e;
        mt.v vVar = this.f98806b;
        if (th2 != null) {
            vVar.onError(th2);
            return;
        }
        Object obj = this.f98807c;
        if (obj != null) {
            vVar.onSuccess(obj);
        } else {
            vVar.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        Throwable th3 = this.f98808e;
        mt.v vVar = this.f98806b;
        if (th3 == null) {
            vVar.onError(th2);
        } else {
            vVar.onError(new qt.c(th3, th2));
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        tw.d dVar = (tw.d) get();
        hu.g gVar = hu.g.f59176b;
        if (dVar != gVar) {
            lazySet(gVar);
            dVar.cancel();
            onComplete();
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
