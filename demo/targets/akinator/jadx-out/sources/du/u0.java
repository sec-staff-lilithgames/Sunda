package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final v0 f52849b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.q0 f52850c;

    public u0(v0 v0Var, mt.q0 q0Var) {
        this.f52849b = v0Var;
        this.f52850c = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52850c.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f52849b, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52850c.onSuccess(obj);
    }
}
