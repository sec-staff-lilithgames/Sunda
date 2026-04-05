package ao;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a2 extends y {

    /* renamed from: f, reason: collision with root package name */
    public final gn.p0 f7545f;

    public a2(gn.u1 u1Var, gn.p0 p0Var) {
        super(u1Var);
        this.f7545f = p0Var;
    }

    @Override // ao.y, gn.u1
    public gn.t1 getWindow(int i10, gn.t1 t1Var, long j10) {
        super.getWindow(i10, t1Var, j10);
        gn.p0 p0Var = this.f7545f;
        t1Var.f58177c = p0Var;
        gn.j0 j0Var = p0Var.f58053b;
        t1Var.f58176b = j0Var != null ? j0Var.f57970h : null;
        return t1Var;
    }
}
