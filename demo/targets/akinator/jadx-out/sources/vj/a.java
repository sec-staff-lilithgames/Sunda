package vj;

import j1.o2;
import vj.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public String f89279a;

    /* renamed from: b, reason: collision with root package name */
    public d f89280b;

    /* renamed from: c, reason: collision with root package name */
    public String f89281c;

    /* renamed from: d, reason: collision with root package name */
    public String f89282d;

    /* renamed from: e, reason: collision with root package name */
    public long f89283e;

    /* renamed from: f, reason: collision with root package name */
    public long f89284f;

    /* renamed from: g, reason: collision with root package name */
    public String f89285g;

    /* renamed from: h, reason: collision with root package name */
    public byte f89286h;

    @Override // vj.f.a
    public f build() {
        if (this.f89286h == 3 && this.f89280b != null) {
            return new b(this.f89279a, this.f89280b, this.f89281c, this.f89282d, this.f89283e, this.f89284f, this.f89285g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f89280b == null) {
            sb2.append(" registrationStatus");
        }
        if ((this.f89286h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f89286h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // vj.f.a
    public f.a setAuthToken(String str) {
        this.f89281c = str;
        return this;
    }

    @Override // vj.f.a
    public f.a setExpiresInSecs(long j10) {
        this.f89283e = j10;
        this.f89286h = (byte) (this.f89286h | 1);
        return this;
    }

    @Override // vj.f.a
    public f.a setFirebaseInstallationId(String str) {
        this.f89279a = str;
        return this;
    }

    @Override // vj.f.a
    public f.a setFisError(String str) {
        this.f89285g = str;
        return this;
    }

    @Override // vj.f.a
    public f.a setRefreshToken(String str) {
        this.f89282d = str;
        return this;
    }

    @Override // vj.f.a
    public f.a setRegistrationStatus(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f89280b = dVar;
        return this;
    }

    @Override // vj.f.a
    public f.a setTokenCreationEpochInSecs(long j10) {
        this.f89284f = j10;
        this.f89286h = (byte) (this.f89286h | 2);
        return this;
    }
}
