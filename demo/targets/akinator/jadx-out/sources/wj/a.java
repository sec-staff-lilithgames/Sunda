package wj;

import wj.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public String f90646a;

    /* renamed from: b, reason: collision with root package name */
    public String f90647b;

    /* renamed from: c, reason: collision with root package name */
    public String f90648c;

    /* renamed from: d, reason: collision with root package name */
    public i f90649d;

    /* renamed from: e, reason: collision with root package name */
    public g f90650e;

    @Override // wj.f.a
    public f build() {
        return new b(this.f90646a, this.f90647b, this.f90648c, this.f90649d, this.f90650e);
    }

    @Override // wj.f.a
    public f.a setAuthToken(i iVar) {
        this.f90649d = iVar;
        return this;
    }

    @Override // wj.f.a
    public f.a setFid(String str) {
        this.f90647b = str;
        return this;
    }

    @Override // wj.f.a
    public f.a setRefreshToken(String str) {
        this.f90648c = str;
        return this;
    }

    @Override // wj.f.a
    public f.a setResponseCode(g gVar) {
        this.f90650e = gVar;
        return this;
    }

    @Override // wj.f.a
    public f.a setUri(String str) {
        this.f90646a = str;
        return this;
    }
}
