package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class tb implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11055b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f11056c;

    public tb(mt.i0 i0Var, AtomicReference atomicReference) {
        this.f11055b = i0Var;
        this.f11056c = atomicReference;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11055b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11055b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11055b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f11056c, cVar);
    }
}
