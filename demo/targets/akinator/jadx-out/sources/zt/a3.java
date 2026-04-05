package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a3 implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98531b;

    /* renamed from: c, reason: collision with root package name */
    public final b3 f98532c;

    public a3(mt.v vVar, b3 b3Var) {
        this.f98531b = vVar;
        this.f98532c = b3Var;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98531b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98531b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f98532c, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98531b.onSuccess(obj);
    }
}
