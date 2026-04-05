package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52767b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f52768c;

    public k2(mt.t0 t0Var, tw.b bVar) {
        this.f52767b = t0Var;
        this.f52768c = bVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        i2 i2Var = new i2(q0Var);
        q0Var.onSubscribe(i2Var);
        this.f52768c.subscribe(i2Var.f52751c);
        this.f52767b.subscribe(i2Var);
    }
}
