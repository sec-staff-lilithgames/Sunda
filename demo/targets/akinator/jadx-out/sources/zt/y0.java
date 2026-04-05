package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98833b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f98834c;

    /* renamed from: e, reason: collision with root package name */
    public Object f98835e;

    public y0(mt.v vVar, st.c cVar) {
        this.f98833b = vVar;
        this.f98834c = cVar;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98833b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98833b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        mt.v vVar = this.f98833b;
        Object obj2 = this.f98835e;
        this.f98835e = null;
        try {
            vVar.onSuccess(ut.o0.requireNonNull(this.f98834c.apply(obj2, obj), "The resultSelector returned a null value"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }
}
