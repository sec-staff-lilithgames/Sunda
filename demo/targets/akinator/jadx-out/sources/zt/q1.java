package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q1 implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f98734b;

    public q1(r1 r1Var) {
        this.f98734b = r1Var;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98734b.f98746b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98734b.f98746b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f98734b, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98734b.f98746b.onSuccess(obj);
    }
}
