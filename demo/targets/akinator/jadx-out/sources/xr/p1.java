package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public wr.m f92865a;

    /* renamed from: b, reason: collision with root package name */
    public String f92866b = "unknown-authority";

    /* renamed from: c, reason: collision with root package name */
    public wr.c f92867c = wr.c.f90841b;

    /* renamed from: d, reason: collision with root package name */
    public String f92868d;

    /* renamed from: e, reason: collision with root package name */
    public wr.u1 f92869e;

    public boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f92866b.equals(p1Var.f92866b) && this.f92867c.equals(p1Var.f92867c) && mh.h1.equal(this.f92868d, p1Var.f92868d) && mh.h1.equal(this.f92869e, p1Var.f92869e);
    }

    public String getAuthority() {
        return this.f92866b;
    }

    public wr.m getChannelLogger() {
        return this.f92865a;
    }

    public wr.c getEagAttributes() {
        return this.f92867c;
    }

    public wr.u1 getHttpConnectProxiedSocketAddress() {
        return this.f92869e;
    }

    public String getUserAgent() {
        return this.f92868d;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f92866b, this.f92867c, this.f92868d, this.f92869e);
    }

    public p1 setAuthority(String str) {
        this.f92866b = (String) mh.p1.checkNotNull(str, "authority");
        return this;
    }

    public p1 setChannelLogger(wr.m mVar) {
        this.f92865a = mVar;
        return this;
    }

    public p1 setEagAttributes(wr.c cVar) {
        mh.p1.checkNotNull(cVar, "eagAttributes");
        this.f92867c = cVar;
        return this;
    }

    public p1 setHttpConnectProxiedSocketAddress(wr.u1 u1Var) {
        this.f92869e = u1Var;
        return this;
    }

    public p1 setUserAgent(String str) {
        this.f92868d = str;
        return this;
    }
}
