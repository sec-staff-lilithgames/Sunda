package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h1 implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f98628b;

    public h1(i1 i1Var) {
        this.f98628b = i1Var;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98628b.f98645b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98628b.f98645b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f98628b, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98628b.f98645b.onSuccess(obj);
    }
}
