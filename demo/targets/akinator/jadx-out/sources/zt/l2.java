package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l2 extends mt.s implements vt.m {

    /* renamed from: b, reason: collision with root package name */
    public final Object f98682b;

    public l2(Object obj) {
        this.f98682b = obj;
    }

    @Override // vt.m, java.util.concurrent.Callable
    public Object call() {
        return this.f98682b;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        vVar.onSubscribe(pt.d.disposed());
        vVar.onSuccess(this.f98682b);
    }
}
