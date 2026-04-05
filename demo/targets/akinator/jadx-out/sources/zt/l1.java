package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l1 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final k1 f98680b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.q0 f98681c;

    public l1(k1 k1Var, mt.q0 q0Var) {
        this.f98680b = k1Var;
        this.f98681c = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f98681c.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f98680b, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f98681c.onSuccess(obj);
    }
}
