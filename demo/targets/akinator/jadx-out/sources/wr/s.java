package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends j {

    /* renamed from: a, reason: collision with root package name */
    public final j f91122a;

    /* renamed from: b, reason: collision with root package name */
    public final q f91123b;

    public s(j jVar, q qVar) {
        this.f91122a = jVar;
        this.f91123b = (q) mh.p1.checkNotNull(qVar, "interceptor");
    }

    @Override // wr.j
    public String authority() {
        return this.f91122a.authority();
    }

    @Override // wr.j
    public <ReqT, RespT> p newCall(k4 k4Var, i iVar) {
        return this.f91123b.interceptCall(k4Var, iVar, this.f91122a);
    }
}
