package es;

import java.util.Map;
import wr.b3;
import wr.h3;
import wr.o4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o0 extends h3 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f55085b = 0;

    @Override // wr.h3
    public String getPolicyName() {
        return "round_robin";
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
    public b3 newLoadBalancer(b3.c cVar) {
        return new n0(cVar);
    }

    @Override // wr.h3
    public o4 parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        return o4.fromConfig("no service config");
    }
}
