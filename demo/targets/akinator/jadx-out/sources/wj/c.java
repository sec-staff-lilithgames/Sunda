package wj;

import wj.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c extends i.a {

    /* renamed from: a, reason: collision with root package name */
    public String f90656a;

    /* renamed from: b, reason: collision with root package name */
    public long f90657b;

    /* renamed from: c, reason: collision with root package name */
    public j f90658c;

    /* renamed from: d, reason: collision with root package name */
    public byte f90659d;

    @Override // wj.i.a
    public i build() {
        if (this.f90659d == 1) {
            return new d(this.f90656a, this.f90657b, this.f90658c);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    @Override // wj.i.a
    public i.a setResponseCode(j jVar) {
        this.f90658c = jVar;
        return this;
    }

    @Override // wj.i.a
    public i.a setToken(String str) {
        this.f90656a = str;
        return this;
    }

    @Override // wj.i.a
    public i.a setTokenExpirationTimestamp(long j10) {
        this.f90657b = j10;
        this.f90659d = (byte) (this.f90659d | 1);
        return this;
    }
}
