package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface h9 extends o1 {
    @Override // xr.o1, wr.m2, wr.v2
    /* synthetic */ wr.n2 getLogId();

    @Override // xr.o1, wr.m2
    /* synthetic */ sh.n1 getStats();

    @Override // xr.o1
    /* synthetic */ k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr);

    @Override // xr.o1
    /* synthetic */ void ping(n1 n1Var, Executor executor);

    void shutdown(wr.m6 m6Var);

    void shutdownNow(wr.m6 m6Var);

    Runnable start(g9 g9Var);
}
