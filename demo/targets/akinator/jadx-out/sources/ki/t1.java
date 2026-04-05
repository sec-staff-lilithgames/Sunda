package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t1 extends f2.e.d.AbstractC0731e.b.a {

    /* renamed from: a, reason: collision with root package name */
    public String f71468a;

    /* renamed from: b, reason: collision with root package name */
    public String f71469b;

    @Override // ki.f2.e.d.AbstractC0731e.b.a
    public f2.e.d.AbstractC0731e.b build() {
        String str;
        String str2 = this.f71468a;
        if (str2 != null && (str = this.f71469b) != null) {
            return new u1(str2, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71468a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f71469b == null) {
            sb2.append(" variantId");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.AbstractC0731e.b.a
    public f2.e.d.AbstractC0731e.b.a setRolloutId(String str) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f71468a = str;
        return this;
    }

    @Override // ki.f2.e.d.AbstractC0731e.b.a
    public f2.e.d.AbstractC0731e.b.a setVariantId(String str) {
        if (str == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f71469b = str;
        return this;
    }
}
