package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q7 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile sc f92922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f92923b;

    public q7(u8 u8Var) {
        this.f92923b = u8Var;
    }

    public final o1 a(va vaVar) {
        b3.f fVar = this.f92923b.F;
        if (this.f92923b.N.get()) {
            return this.f92923b.L;
        }
        if (fVar == null) {
            this.f92923b.f93126s.execute(new o7(this));
            return this.f92923b.L;
        }
        o1 o1VarA = c5.a(fVar.pickSubchannel(vaVar), vaVar.getCallOptions().isWaitForReady());
        return o1VarA != null ? o1VarA : this.f92923b.L;
    }

    @Override // xr.g1
    public k1 newStream(wr.k4 k4Var, wr.i iVar, wr.e4 e4Var, wr.u0 u0Var) {
        if (this.f92923b.f93108f0) {
            d9 d9Var = (d9) iVar.getOption(d9.f92427g);
            return new p7(this, k4Var, e4Var, iVar, d9Var == null ? null : d9Var.f92432e, d9Var != null ? d9Var.f92433f : null, u0Var);
        }
        o1 o1VarA = a(new va(k4Var, e4Var, iVar));
        wr.u0 u0VarAttach = u0Var.attach();
        try {
            return o1VarA.newStream(k4Var, e4Var, iVar, c5.getClientStreamTracers(iVar, e4Var, 0, false));
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }
}
