package es;

import wr.b3;
import wr.c3;
import wr.e3;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends b3 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f55029f;

    public f(i iVar) {
        this.f55029f = iVar;
    }

    @Override // wr.b3
    public void handleNameResolutionError(m6 m6Var) {
        this.f55029f.f55044g.updateBalancingState(wr.f0.f90914e, new b3.b(c3.withError(m6Var)));
    }

    @Override // wr.b3
    public void handleResolvedAddresses(e3 e3Var) {
        throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
    }

    @Override // wr.b3
    public void shutdown() {
    }
}
