package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a4 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98533b;

    public a4(mt.v vVar) {
        this.f98533b = vVar;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98533b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98533b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98533b.onSuccess(obj);
    }
}
