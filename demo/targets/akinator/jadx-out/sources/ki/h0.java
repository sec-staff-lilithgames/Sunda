package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h0 extends f2.c.a {

    /* renamed from: a, reason: collision with root package name */
    public String f71273a;

    /* renamed from: b, reason: collision with root package name */
    public String f71274b;

    @Override // ki.f2.c.a
    public f2.c build() {
        String str;
        String str2 = this.f71273a;
        if (str2 != null && (str = this.f71274b) != null) {
            return new i0(str2, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71273a == null) {
            sb2.append(" key");
        }
        if (this.f71274b == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.c.a
    public f2.c.a setKey(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f71273a = str;
        return this;
    }

    @Override // ki.f2.c.a
    public f2.c.a setValue(String str) {
        if (str == null) {
            throw new NullPointerException("Null value");
        }
        this.f71274b = str;
        return this;
    }
}
