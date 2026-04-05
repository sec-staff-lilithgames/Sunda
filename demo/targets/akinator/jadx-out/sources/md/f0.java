package md;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 implements jd.k {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f74270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74271b;

    /* renamed from: c, reason: collision with root package name */
    public final jd.e f74272c;

    /* renamed from: d, reason: collision with root package name */
    public final jd.j f74273d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f74274e;

    public f0(d0 d0Var, String str, jd.e eVar, jd.j jVar, h0 h0Var) {
        this.f74270a = d0Var;
        this.f74271b = str;
        this.f74272c = eVar;
        this.f74273d = jVar;
        this.f74274e = h0Var;
    }

    @Override // jd.k
    public void schedule(jd.f fVar, jd.m mVar) {
        k kVarC = c0.builder().setTransportContext(this.f74270a).b(fVar).setTransportName(this.f74271b).c(this.f74273d);
        kVarC.a(this.f74272c);
        this.f74274e.send(kVarC.build(), mVar);
    }

    @Override // jd.k
    public void send(jd.f fVar) {
        schedule(fVar, new li.a(11));
    }
}
