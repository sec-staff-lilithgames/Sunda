package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y1 extends f2.e.AbstractC0732e {

    /* renamed from: a, reason: collision with root package name */
    public final int f71533a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71534b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71535c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f71536d;

    public y1(int i10, String str, String str2, boolean z10) {
        this.f71533a = i10;
        this.f71534b = str;
        this.f71535c = str2;
        this.f71536d = z10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.AbstractC0732e) {
            f2.e.AbstractC0732e abstractC0732e = (f2.e.AbstractC0732e) obj;
            if (this.f71533a == abstractC0732e.getPlatform() && this.f71534b.equals(abstractC0732e.getVersion()) && this.f71535c.equals(abstractC0732e.getBuildVersion()) && this.f71536d == abstractC0732e.isJailbroken()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.AbstractC0732e
    public String getBuildVersion() {
        return this.f71535c;
    }

    @Override // ki.f2.e.AbstractC0732e
    public int getPlatform() {
        return this.f71533a;
    }

    @Override // ki.f2.e.AbstractC0732e
    public String getVersion() {
        return this.f71534b;
    }

    public int hashCode() {
        return ((((((this.f71533a ^ 1000003) * 1000003) ^ this.f71534b.hashCode()) * 1000003) ^ this.f71535c.hashCode()) * 1000003) ^ (this.f71536d ? 1231 : 1237);
    }

    @Override // ki.f2.e.AbstractC0732e
    public boolean isJailbroken() {
        return this.f71536d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f71533a);
        sb2.append(", version=");
        sb2.append(this.f71534b);
        sb2.append(", buildVersion=");
        sb2.append(this.f71535c);
        sb2.append(", jailbroken=");
        return a.b.q(sb2, this.f71536d, "}");
    }
}
