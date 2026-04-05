package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f1 extends f2.e.d.a.b.AbstractC0723d.AbstractC0724a {

    /* renamed from: a, reason: collision with root package name */
    public String f71248a;

    /* renamed from: b, reason: collision with root package name */
    public String f71249b;

    /* renamed from: c, reason: collision with root package name */
    public long f71250c;

    /* renamed from: d, reason: collision with root package name */
    public byte f71251d;

    @Override // ki.f2.e.d.a.b.AbstractC0723d.AbstractC0724a
    public f2.e.d.a.b.AbstractC0723d build() {
        String str;
        String str2;
        if (this.f71251d == 1 && (str = this.f71248a) != null && (str2 = this.f71249b) != null) {
            return new g1(str, str2, this.f71250c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71248a == null) {
            sb2.append(" name");
        }
        if (this.f71249b == null) {
            sb2.append(" code");
        }
        if ((1 & this.f71251d) == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.b.AbstractC0723d.AbstractC0724a
    public f2.e.d.a.b.AbstractC0723d.AbstractC0724a setAddress(long j10) {
        this.f71250c = j10;
        this.f71251d = (byte) (this.f71251d | 1);
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0723d.AbstractC0724a
    public f2.e.d.a.b.AbstractC0723d.AbstractC0724a setCode(String str) {
        if (str == null) {
            throw new NullPointerException("Null code");
        }
        this.f71249b = str;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0723d.AbstractC0724a
    public f2.e.d.a.b.AbstractC0723d.AbstractC0724a setName(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f71248a = str;
        return this;
    }
}
