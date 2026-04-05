package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i4 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final wr.m6 f92604a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f92605b;

    public i4(wr.m6 m6Var, l1 l1Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "error must not be OK");
        this.f92604a = m6Var;
        this.f92605b = l1Var;
    }

    @Override // xr.o1, wr.m2, wr.v2
    public wr.n2 getLogId() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // xr.o1, wr.m2
    public sh.n1 getStats() {
        sh.a2 a2VarCreate = sh.a2.create();
        a2VarCreate.set(null);
        return a2VarCreate;
    }

    @Override // xr.o1
    public k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr) {
        return new g4(this.f92604a, this.f92605b, uVarArr);
    }

    @Override // xr.o1
    public void ping(n1 n1Var, Executor executor) {
        executor.execute(new h4(this, n1Var));
    }
}
