package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p6 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f10795c;

    public p6(mt.b0 b0Var, mt.t0 t0Var) {
        super(b0Var);
        this.f10795c = t0Var;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        o6 o6Var = new o6(i0Var);
        i0Var.onSubscribe(o6Var);
        this.f10053b.subscribe(o6Var);
        this.f10795c.subscribe(o6Var.f10744e);
    }
}
