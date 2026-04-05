package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.r0 f52739b;

    public h(mt.r0 r0Var) {
        this.f52739b = r0Var;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        g gVar = new g(q0Var);
        q0Var.onSubscribe(gVar);
        try {
            this.f52739b.subscribe(gVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            gVar.onError(th2);
        }
    }
}
