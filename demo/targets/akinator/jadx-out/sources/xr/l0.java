package xr;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final wr.j3 f92746a = (wr.j3) mh.p1.checkNotNull(wr.j3.getDefaultRegistry(), "registry");

    /* renamed from: b, reason: collision with root package name */
    public final String f92747b;

    public l0(String str) {
        this.f92747b = (String) mh.p1.checkNotNull(str, "defaultPolicy");
    }

    public g0 newLoadBalancer(b3.c cVar) {
        return new g0(this, cVar);
    }
}
