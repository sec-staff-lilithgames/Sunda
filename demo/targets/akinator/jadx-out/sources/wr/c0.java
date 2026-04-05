package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 extends k {

    /* renamed from: a, reason: collision with root package name */
    public final k f90843a;

    /* renamed from: b, reason: collision with root package name */
    public final f f90844b;

    public c0(k kVar, f fVar) {
        this.f90843a = (k) mh.p1.checkNotNull(kVar, "channelCreds");
        this.f90844b = (f) mh.p1.checkNotNull(fVar, "callCreds");
    }

    public static k create(k kVar, f fVar) {
        return new c0(kVar, fVar);
    }

    public f getCallCredentials() {
        return this.f90844b;
    }

    public k getChannelCredentials() {
        return this.f90843a;
    }

    @Override // wr.k
    public k withoutBearerTokens() {
        return this.f90843a.withoutBearerTokens();
    }
}
