package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c4 extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final b4 f98559b;

    public c4(b4 b4Var) {
        this.f98559b = b4Var;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f98559b.otherComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f98559b.otherError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        ((tw.d) get()).cancel();
        this.f98559b.otherComplete();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
