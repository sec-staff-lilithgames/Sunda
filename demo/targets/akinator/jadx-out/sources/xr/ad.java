package xr;

import java.util.List;
import java.util.Map;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ad extends p4.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92252a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92254c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f92255d;

    public ad(boolean z10, int i10, int i11, l0 l0Var) {
        this.f92252a = z10;
        this.f92253b = i10;
        this.f92254c = i11;
        this.f92255d = (l0) mh.p1.checkNotNull(l0Var, "autoLoadBalancerFactory");
    }

    @Override // wr.p4.c
    public wr.o4 parseServiceConfig(Map<String, ?> map) {
        List<ie> listUnwrapLoadBalancingConfigList;
        wr.o4 o4VarFromError;
        try {
            l0 l0Var = this.f92255d;
            l0Var.getClass();
            Object config = null;
            if (map != null) {
                try {
                    listUnwrapLoadBalancingConfigList = ke.unwrapLoadBalancingConfigList(ke.getLoadBalancingConfigsFromServiceConfig(map));
                } catch (RuntimeException e10) {
                    o4VarFromError = wr.o4.fromError(wr.m6.f91039g.withDescription("can't parse load balancer configuration").withCause(e10));
                }
            } else {
                listUnwrapLoadBalancingConfigList = null;
            }
            o4VarFromError = (listUnwrapLoadBalancingConfigList == null || listUnwrapLoadBalancingConfigList.isEmpty()) ? null : ke.selectLbPolicyFromList(listUnwrapLoadBalancingConfigList, l0Var.f92746a);
            if (o4VarFromError != null) {
                if (o4VarFromError.getError() != null) {
                    return wr.o4.fromError(o4VarFromError.getError());
                }
                config = o4VarFromError.getConfig();
            }
            return wr.o4.fromConfig(f9.a(map, this.f92252a, this.f92253b, this.f92254c, config));
        } catch (RuntimeException e11) {
            return wr.o4.fromError(wr.m6.f91039g.withDescription("failed to parse service config").withCause(e11));
        }
    }
}
