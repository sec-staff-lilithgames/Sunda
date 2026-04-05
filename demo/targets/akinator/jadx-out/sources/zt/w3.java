package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w3 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98817b;

    public w3(mt.v vVar) {
        this.f98817b = vVar;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98817b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98817b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98817b.onSuccess(obj);
    }
}
