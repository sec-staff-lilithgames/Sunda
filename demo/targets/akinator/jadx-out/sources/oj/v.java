package oj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v implements a {

    /* renamed from: a, reason: collision with root package name */
    public nj.a f79459a;

    /* renamed from: b, reason: collision with root package name */
    public pj.d f79460b;

    /* renamed from: c, reason: collision with root package name */
    public pj.z f79461c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f79462d;

    /* renamed from: e, reason: collision with root package name */
    public jd.l f79463e;

    @Override // oj.a
    public b build() {
        dj.d.checkBuilderRequirement(this.f79459a, nj.a.class);
        dj.d.checkBuilderRequirement(this.f79460b, pj.d.class);
        dj.d.checkBuilderRequirement(this.f79461c, pj.z.class);
        dj.d.checkBuilderRequirement(this.f79462d, a0.class);
        dj.d.checkBuilderRequirement(this.f79463e, jd.l.class);
        return new u(this.f79460b, this.f79461c, this.f79462d, this.f79459a, this.f79463e);
    }

    @Override // oj.a
    public v abtIntegrationHelper(nj.a aVar) {
        this.f79459a = (nj.a) dj.d.checkNotNull(aVar);
        return this;
    }

    @Override // oj.a
    public v apiClientModule(pj.d dVar) {
        this.f79460b = (pj.d) dj.d.checkNotNull(dVar);
        return this;
    }

    @Override // oj.a
    public v grpcClientModule(pj.z zVar) {
        this.f79461c = (pj.z) dj.d.checkNotNull(zVar);
        return this;
    }

    @Override // oj.a
    public v transportFactory(jd.l lVar) {
        this.f79463e = (jd.l) dj.d.checkNotNull(lVar);
        return this;
    }

    @Override // oj.a
    public v universalComponent(a0 a0Var) {
        this.f79462d = (a0) dj.d.checkNotNull(a0Var);
        return this;
    }
}
