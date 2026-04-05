package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o1 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final n1 f98712b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.v f98713c;

    public o1(n1 n1Var, mt.v vVar) {
        this.f98712b = n1Var;
        this.f98713c = vVar;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f98713c.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f98712b, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f98713c.onSuccess(obj);
    }
}
