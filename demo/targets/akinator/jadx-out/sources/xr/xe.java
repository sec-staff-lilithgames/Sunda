package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class xe implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ af f93243a;

    public xe(af afVar) {
        this.f93243a = afVar;
    }

    @Override // xr.g1
    public k1 newStream(wr.k4 k4Var, wr.i iVar, wr.e4 e4Var, wr.u0 u0Var) {
        o1 o1Var = this.f93243a.f92258a.f92631x;
        if (o1Var == null) {
            o1Var = af.f92257h;
        }
        wr.u[] clientStreamTracers = c5.getClientStreamTracers(iVar, e4Var, 0, false);
        wr.u0 u0VarAttach = u0Var.attach();
        try {
            return o1Var.newStream(k4Var, e4Var, iVar, clientStreamTracers);
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }
}
