package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y3 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final x3 f98840b;

    public y3(x3 x3Var) {
        this.f98840b = x3Var;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98840b.otherComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98840b.otherError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98840b.otherComplete();
    }
}
