package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f10447c;

    public j1(mt.b0 b0Var, mt.i iVar) {
        super(b0Var);
        this.f10447c = iVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new i1(i0Var, this.f10447c));
    }
}
