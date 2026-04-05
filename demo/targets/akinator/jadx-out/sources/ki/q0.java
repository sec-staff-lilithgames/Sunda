package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q0 extends f2.e.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71421b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71422c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.e.a.b f71423d;

    /* renamed from: e, reason: collision with root package name */
    public final String f71424e;

    /* renamed from: f, reason: collision with root package name */
    public final String f71425f;

    /* renamed from: g, reason: collision with root package name */
    public final String f71426g;

    public q0(String str, String str2, String str3, f2.e.a.b bVar, String str4, String str5, String str6) {
        this.f71420a = str;
        this.f71421b = str2;
        this.f71422c = str3;
        this.f71423d = bVar;
        this.f71424e = str4;
        this.f71425f = str5;
        this.f71426g = str6;
    }

    @Override // ki.f2.e.a
    public final p0 a() {
        p0 p0Var = new p0();
        p0Var.f71406a = getIdentifier();
        p0Var.f71407b = getVersion();
        p0Var.f71408c = getDisplayVersion();
        p0Var.f71409d = getOrganization();
        p0Var.f71410e = getInstallationUuid();
        p0Var.f71411f = getDevelopmentPlatform();
        p0Var.f71412g = getDevelopmentPlatformVersion();
        return p0Var;
    }

    public boolean equals(Object obj) {
        String str;
        f2.e.a.b bVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.a) {
            f2.e.a aVar = (f2.e.a) obj;
            if (this.f71420a.equals(aVar.getIdentifier()) && this.f71421b.equals(aVar.getVersion()) && ((str = this.f71422c) != null ? str.equals(aVar.getDisplayVersion()) : aVar.getDisplayVersion() == null) && ((bVar = this.f71423d) != null ? bVar.equals(aVar.getOrganization()) : aVar.getOrganization() == null) && ((str2 = this.f71424e) != null ? str2.equals(aVar.getInstallationUuid()) : aVar.getInstallationUuid() == null) && ((str3 = this.f71425f) != null ? str3.equals(aVar.getDevelopmentPlatform()) : aVar.getDevelopmentPlatform() == null) && ((str4 = this.f71426g) != null ? str4.equals(aVar.getDevelopmentPlatformVersion()) : aVar.getDevelopmentPlatformVersion() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.a
    public String getDevelopmentPlatform() {
        return this.f71425f;
    }

    @Override // ki.f2.e.a
    public String getDevelopmentPlatformVersion() {
        return this.f71426g;
    }

    @Override // ki.f2.e.a
    public String getDisplayVersion() {
        return this.f71422c;
    }

    @Override // ki.f2.e.a
    public String getIdentifier() {
        return this.f71420a;
    }

    @Override // ki.f2.e.a
    public String getInstallationUuid() {
        return this.f71424e;
    }

    @Override // ki.f2.e.a
    public f2.e.a.b getOrganization() {
        return this.f71423d;
    }

    @Override // ki.f2.e.a
    public String getVersion() {
        return this.f71421b;
    }

    public int hashCode() {
        int iHashCode = (((this.f71420a.hashCode() ^ 1000003) * 1000003) ^ this.f71421b.hashCode()) * 1000003;
        String str = this.f71422c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        f2.e.a.b bVar = this.f71423d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f71424e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f71425f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f71426g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f71420a);
        sb2.append(", version=");
        sb2.append(this.f71421b);
        sb2.append(", displayVersion=");
        sb2.append(this.f71422c);
        sb2.append(", organization=");
        sb2.append(this.f71423d);
        sb2.append(", installationUuid=");
        sb2.append(this.f71424e);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f71425f);
        sb2.append(", developmentPlatformVersion=");
        return o2.o(sb2, this.f71426g, "}");
    }
}
