package xr;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ge extends wr.m2 {
    @Override // wr.m2, wr.v2
    /* synthetic */ wr.n2 getLogId();

    ScheduledExecutorService getScheduledExecutorService();

    @Override // wr.m2
    /* synthetic */ sh.n1 getStats();

    void shutdown();

    void shutdownNow(wr.m6 m6Var);
}
