package xr;

import java.util.Map;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ua extends wr.h3 {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f93134b;

    static {
        f93134b = !mh.u2.isNullOrEmpty(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // wr.h3
    public String getPolicyName() {
        return "pick_first";
    }

    @Override // wr.h3
    public int getPriority() {
        return 5;
    }

    @Override // wr.h3
    public boolean isAvailable() {
        return true;
    }

    @Override // wr.b3.a
    public wr.b3 newLoadBalancer(b3.c cVar) {
        return f93134b ? new na(cVar) : new ta(cVar);
    }

    @Override // wr.h3
    public wr.o4 parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        try {
            return wr.o4.fromConfig(new pa(o6.getBoolean(map, "shuffleAddressList")));
        } catch (RuntimeException e10) {
            return wr.o4.fromError(wr.m6.f91047o.withCause(e10).withDescription("Failed parsing configuration for " + getPolicyName()));
        }
    }
}
