package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j6 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f10464c;

    public j6(mt.b0 b0Var, mt.i iVar) {
        super(b0Var);
        this.f10464c = iVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        i6 i6Var = new i6(i0Var);
        i0Var.onSubscribe(i6Var);
        this.f10053b.subscribe(i6Var);
        this.f10464c.subscribe(i6Var.f10416e);
    }
}
