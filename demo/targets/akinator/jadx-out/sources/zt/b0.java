package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f98538b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.v f98539c;

    public b0(c0 c0Var, mt.v vVar) {
        this.f98538b = c0Var;
        this.f98539c = vVar;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98539c.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98539c.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f98538b, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98539c.onSuccess(obj);
    }
}
