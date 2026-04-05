package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52744b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f52745c;

    public h2(mt.t0 t0Var, mt.m0 m0Var) {
        this.f52744b = t0Var;
        this.f52745c = m0Var;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        g2 g2Var = new g2(q0Var, this.f52744b);
        q0Var.onSubscribe(g2Var);
        g2Var.f52737c.replace(this.f52745c.scheduleDirect(g2Var));
    }
}
