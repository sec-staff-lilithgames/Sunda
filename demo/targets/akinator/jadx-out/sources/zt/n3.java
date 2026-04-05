package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n3 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f98707b;

    /* renamed from: c, reason: collision with root package name */
    public final o3 f98708c;

    public n3(mt.q0 q0Var, o3 o3Var) {
        this.f98707b = q0Var;
        this.f98708c = o3Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f98707b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f98708c, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f98707b.onSuccess(obj);
    }
}
