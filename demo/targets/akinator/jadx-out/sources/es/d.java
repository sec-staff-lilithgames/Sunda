package es;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import mh.g1;
import wr.a3;
import wr.b3;
import wr.f1;
import wr.k3;
import wr.l3;
import wr.n4;
import wr.u6;
import wr.w4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d extends b3.c {
    public abstract b3.c a();

    @Override // wr.b3.c
    public k3 createOobChannel(f1 f1Var, String str) {
        return a().createOobChannel(f1Var, str);
    }

    @Override // wr.b3.c
    public k3 createResolvingOobChannel(String str) {
        return a().createResolvingOobChannel(str);
    }

    @Override // wr.b3.c
    @Deprecated
    public l3 createResolvingOobChannelBuilder(String str) {
        return a().createResolvingOobChannelBuilder(str);
    }

    @Override // wr.b3.c
    public b3.e createSubchannel(a3 a3Var) {
        return a().createSubchannel(a3Var);
    }

    @Override // wr.b3.c
    public String getAuthority() {
        return a().getAuthority();
    }

    @Override // wr.b3.c
    public wr.k getChannelCredentials() {
        return a().getChannelCredentials();
    }

    @Override // wr.b3.c
    public wr.m getChannelLogger() {
        return a().getChannelLogger();
    }

    @Override // wr.b3.c
    public n4 getNameResolverArgs() {
        return a().getNameResolverArgs();
    }

    @Override // wr.b3.c
    public w4 getNameResolverRegistry() {
        return a().getNameResolverRegistry();
    }

    @Override // wr.b3.c
    public ScheduledExecutorService getScheduledExecutorService() {
        return a().getScheduledExecutorService();
    }

    @Override // wr.b3.c
    public u6 getSynchronizationContext() {
        return a().getSynchronizationContext();
    }

    @Override // wr.b3.c
    public wr.k getUnsafeChannelCredentials() {
        return a().getUnsafeChannelCredentials();
    }

    @Override // wr.b3.c
    @Deprecated
    public void ignoreRefreshNameResolutionCheck() {
        a().ignoreRefreshNameResolutionCheck();
    }

    @Override // wr.b3.c
    public void refreshNameResolution() {
        a().refreshNameResolution();
    }

    public String toString() {
        return g1.toStringHelper(this).add("delegate", a()).toString();
    }

    @Override // wr.b3.c
    public void updateBalancingState(wr.f0 f0Var, b3.f fVar) {
        a().updateBalancingState(f0Var, fVar);
    }

    @Override // wr.b3.c
    public void updateOobChannelAddresses(k3 k3Var, f1 f1Var) {
        a().updateOobChannelAddresses(k3Var, f1Var);
    }

    @Override // wr.b3.c
    public k3 createOobChannel(List<f1> list, String str) {
        return a().createOobChannel(list, str);
    }

    @Override // wr.b3.c
    public l3 createResolvingOobChannelBuilder(String str, wr.k kVar) {
        return a().createResolvingOobChannelBuilder(str, kVar);
    }

    @Override // wr.b3.c
    public void updateOobChannelAddresses(k3 k3Var, List<f1> list) {
        a().updateOobChannelAddresses(k3Var, list);
    }
}
