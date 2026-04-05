package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u1 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f52851b;

    public u1(Object obj) {
        this.f52851b = obj;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        q0Var.onSubscribe(pt.d.disposed());
        q0Var.onSuccess(this.f52851b);
    }
}
