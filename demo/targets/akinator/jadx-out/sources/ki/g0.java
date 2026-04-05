package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g0 extends f2.a.AbstractC0714a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71262b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71263c;

    public g0(String str, String str2, String str3) {
        this.f71261a = str;
        this.f71262b = str2;
        this.f71263c = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.a.AbstractC0714a) {
            f2.a.AbstractC0714a abstractC0714a = (f2.a.AbstractC0714a) obj;
            if (this.f71261a.equals(abstractC0714a.getArch()) && this.f71262b.equals(abstractC0714a.getLibraryName()) && this.f71263c.equals(abstractC0714a.getBuildId())) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.a.AbstractC0714a
    public String getArch() {
        return this.f71261a;
    }

    @Override // ki.f2.a.AbstractC0714a
    public String getBuildId() {
        return this.f71263c;
    }

    @Override // ki.f2.a.AbstractC0714a
    public String getLibraryName() {
        return this.f71262b;
    }

    public int hashCode() {
        return ((((this.f71261a.hashCode() ^ 1000003) * 1000003) ^ this.f71262b.hashCode()) * 1000003) ^ this.f71263c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f71261a);
        sb2.append(", libraryName=");
        sb2.append(this.f71262b);
        sb2.append(", buildId=");
        return o2.o(sb2, this.f71263c, "}");
    }
}
