package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class m4 implements a2 {
    public abstract a2 a();

    @Override // xr.a2
    public wr.c getAttributes() {
        return a().getAttributes();
    }

    @Override // xr.a2, xr.h9, xr.o1, wr.m2, wr.v2
    public wr.n2 getLogId() {
        return a().getLogId();
    }

    @Override // xr.a2, xr.h9, xr.o1, wr.m2
    public sh.n1 getStats() {
        return a().getStats();
    }

    @Override // xr.a2, xr.h9, xr.o1
    public k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr) {
        return a().newStream(k4Var, e4Var, iVar, uVarArr);
    }

    @Override // xr.a2, xr.h9, xr.o1
    public void ping(n1 n1Var, Executor executor) {
        a().ping(n1Var, executor);
    }

    @Override // xr.a2, xr.h9
    public void shutdown(wr.m6 m6Var) {
        a().shutdown(m6Var);
    }

    @Override // xr.a2, xr.h9
    public void shutdownNow(wr.m6 m6Var) {
        a().shutdownNow(m6Var);
    }

    @Override // xr.a2, xr.h9
    public Runnable start(g9 g9Var) {
        return a().start(g9Var);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", a()).toString();
    }
}
