package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final b3.c f92539a;

    /* renamed from: b, reason: collision with root package name */
    public wr.b3 f92540b;

    /* renamed from: c, reason: collision with root package name */
    public wr.h3 f92541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f92542d;

    public g0(l0 l0Var, b3.c cVar) {
        this.f92542d = l0Var;
        this.f92539a = cVar;
        wr.j3 j3Var = l0Var.f92746a;
        String str = l0Var.f92747b;
        wr.h3 provider = j3Var.getProvider(str);
        this.f92541c = provider;
        if (provider == null) {
            throw new IllegalStateException(a.b.l("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }
        this.f92540b = provider.newLoadBalancer(cVar);
    }

    public wr.b3 getDelegate() {
        return this.f92540b;
    }
}
