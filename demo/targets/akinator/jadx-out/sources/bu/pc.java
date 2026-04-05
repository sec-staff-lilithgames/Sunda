package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pc extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10815c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10816e;

    public pc(mt.g0 g0Var, mt.g0 g0Var2, int i10) {
        super(g0Var);
        this.f10815c = g0Var2;
        this.f10816e = i10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        oc ocVar = new oc(i0Var, this.f10816e);
        i0Var.onSubscribe(ocVar);
        this.f10815c.subscribe(ocVar.f10767e);
        this.f10053b.subscribe(ocVar);
    }
}
