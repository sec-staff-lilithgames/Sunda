package ki;

import ki.h2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c2 extends h2.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71178a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71179b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71180c;

    /* renamed from: d, reason: collision with root package name */
    public final String f71181d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71182e;

    /* renamed from: f, reason: collision with root package name */
    public final ei.e f71183f;

    public c2(String str, String str2, String str3, String str4, int i10, ei.e eVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f71178a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f71179b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f71180c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f71181d = str4;
        this.f71182e = i10;
        if (eVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f71183f = eVar;
    }

    @Override // ki.h2.a
    public String appIdentifier() {
        return this.f71178a;
    }

    @Override // ki.h2.a
    public int deliveryMechanism() {
        return this.f71182e;
    }

    @Override // ki.h2.a
    public ei.e developmentPlatformProvider() {
        return this.f71183f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2.a) {
            h2.a aVar = (h2.a) obj;
            if (this.f71178a.equals(aVar.appIdentifier()) && this.f71179b.equals(aVar.versionCode()) && this.f71180c.equals(aVar.versionName()) && this.f71181d.equals(aVar.installUuid()) && this.f71182e == aVar.deliveryMechanism() && this.f71183f.equals(aVar.developmentPlatformProvider())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f71178a.hashCode() ^ 1000003) * 1000003) ^ this.f71179b.hashCode()) * 1000003) ^ this.f71180c.hashCode()) * 1000003) ^ this.f71181d.hashCode()) * 1000003) ^ this.f71182e) * 1000003) ^ this.f71183f.hashCode();
    }

    @Override // ki.h2.a
    public String installUuid() {
        return this.f71181d;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f71178a + ", versionCode=" + this.f71179b + ", versionName=" + this.f71180c + ", installUuid=" + this.f71181d + ", deliveryMechanism=" + this.f71182e + ", developmentPlatformProvider=" + this.f71183f + "}";
    }

    @Override // ki.h2.a
    public String versionCode() {
        return this.f71179b;
    }

    @Override // ki.h2.a
    public String versionName() {
        return this.f71180c;
    }
}
