package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f52795c;

    public n0(o0 o0Var, mt.q0 q0Var) {
        this.f52795c = o0Var;
        this.f52794b = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52794b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52794b.onSubscribe(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.q0 q0Var = this.f52794b;
        try {
            this.f52795c.f52805c.accept(obj);
            q0Var.onSuccess(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            q0Var.onError(th2);
        }
    }
}
