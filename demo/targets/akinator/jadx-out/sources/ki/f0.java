package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f0 extends f2.a.AbstractC0714a.AbstractC0715a {

    /* renamed from: a, reason: collision with root package name */
    public String f71245a;

    /* renamed from: b, reason: collision with root package name */
    public String f71246b;

    /* renamed from: c, reason: collision with root package name */
    public String f71247c;

    @Override // ki.f2.a.AbstractC0714a.AbstractC0715a
    public f2.a.AbstractC0714a build() {
        String str;
        String str2;
        String str3 = this.f71245a;
        if (str3 != null && (str = this.f71246b) != null && (str2 = this.f71247c) != null) {
            return new g0(str3, str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71245a == null) {
            sb2.append(" arch");
        }
        if (this.f71246b == null) {
            sb2.append(" libraryName");
        }
        if (this.f71247c == null) {
            sb2.append(" buildId");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.a.AbstractC0714a.AbstractC0715a
    public f2.a.AbstractC0714a.AbstractC0715a setArch(String str) {
        if (str == null) {
            throw new NullPointerException("Null arch");
        }
        this.f71245a = str;
        return this;
    }

    @Override // ki.f2.a.AbstractC0714a.AbstractC0715a
    public f2.a.AbstractC0714a.AbstractC0715a setBuildId(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildId");
        }
        this.f71247c = str;
        return this;
    }

    @Override // ki.f2.a.AbstractC0714a.AbstractC0715a
    public f2.a.AbstractC0714a.AbstractC0715a setLibraryName(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f71246b = str;
        return this;
    }
}
