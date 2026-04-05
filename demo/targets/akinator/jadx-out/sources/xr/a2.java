package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a2 extends h9 {
    wr.c getAttributes();

    @Override // xr.h9, xr.o1, wr.m2, wr.v2
    /* synthetic */ wr.n2 getLogId();

    @Override // xr.h9, xr.o1, wr.m2
    /* synthetic */ sh.n1 getStats();

    @Override // xr.h9, xr.o1
    /* synthetic */ k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr);

    @Override // xr.h9, xr.o1
    /* synthetic */ void ping(n1 n1Var, Executor executor);

    @Override // xr.h9
    /* synthetic */ void shutdown(wr.m6 m6Var);

    @Override // xr.h9
    /* synthetic */ void shutdownNow(wr.m6 m6Var);

    @Override // xr.h9
    /* synthetic */ Runnable start(g9 g9Var);
}
