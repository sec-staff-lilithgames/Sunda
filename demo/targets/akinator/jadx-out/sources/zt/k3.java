package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k3 implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98674b;

    /* renamed from: c, reason: collision with root package name */
    public final l3 f98675c;

    public k3(mt.v vVar, l3 l3Var) {
        this.f98674b = vVar;
        this.f98675c = l3Var;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98674b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98674b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f98675c, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98674b.onSuccess(obj);
    }
}
