package xr;

import wr.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 extends f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wr.k4 f92911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.i f92912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f92913c;

    public q0(r0 r0Var, wr.k4 k4Var, wr.i iVar) {
        this.f92913c = r0Var;
        this.f92911a = k4Var;
        this.f92912b = iVar;
    }

    @Override // wr.f.b
    public String getAuthority() {
        return (String) mh.g1.firstNonNull(this.f92912b.getAuthority(), this.f92913c.f92940b);
    }

    @Override // wr.f.b
    public wr.i getCallOptions() {
        return this.f92912b;
    }

    @Override // wr.f.b
    public wr.k4 getMethodDescriptor() {
        return this.f92911a;
    }

    @Override // wr.f.b
    public wr.h5 getSecurityLevel() {
        return (wr.h5) mh.g1.firstNonNull((wr.h5) this.f92913c.f92939a.getAttributes().get(s4.f92979a), wr.h5.f90958b);
    }

    @Override // wr.f.b
    public wr.c getTransportAttrs() {
        return this.f92913c.f92939a.getAttributes();
    }
}
