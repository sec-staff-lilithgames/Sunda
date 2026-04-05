package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p0 extends f2.e.a.AbstractC0716a {

    /* renamed from: a, reason: collision with root package name */
    public String f71406a;

    /* renamed from: b, reason: collision with root package name */
    public String f71407b;

    /* renamed from: c, reason: collision with root package name */
    public String f71408c;

    /* renamed from: d, reason: collision with root package name */
    public f2.e.a.b f71409d;

    /* renamed from: e, reason: collision with root package name */
    public String f71410e;

    /* renamed from: f, reason: collision with root package name */
    public String f71411f;

    /* renamed from: g, reason: collision with root package name */
    public String f71412g;

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a build() {
        String str;
        String str2 = this.f71406a;
        if (str2 != null && (str = this.f71407b) != null) {
            return new q0(str2, str, this.f71408c, this.f71409d, this.f71410e, this.f71411f, this.f71412g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71406a == null) {
            sb2.append(" identifier");
        }
        if (this.f71407b == null) {
            sb2.append(" version");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a.AbstractC0716a setDevelopmentPlatform(String str) {
        this.f71411f = str;
        return this;
    }

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a.AbstractC0716a setDevelopmentPlatformVersion(String str) {
        this.f71412g = str;
        return this;
    }

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a.AbstractC0716a setDisplayVersion(String str) {
        this.f71408c = str;
        return this;
    }

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a.AbstractC0716a setIdentifier(String str) {
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        this.f71406a = str;
        return this;
    }

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a.AbstractC0716a setInstallationUuid(String str) {
        this.f71410e = str;
        return this;
    }

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a.AbstractC0716a setOrganization(f2.e.a.b bVar) {
        this.f71409d = bVar;
        return this;
    }

    @Override // ki.f2.e.a.AbstractC0716a
    public f2.e.a.AbstractC0716a setVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null version");
        }
        this.f71407b = str;
        return this;
    }
}
