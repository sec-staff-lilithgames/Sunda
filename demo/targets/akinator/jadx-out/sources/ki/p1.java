package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p1 extends f2.e.d.AbstractC0730d.a {

    /* renamed from: a, reason: collision with root package name */
    public String f71413a;

    @Override // ki.f2.e.d.AbstractC0730d.a
    public f2.e.d.AbstractC0730d build() {
        String str = this.f71413a;
        if (str != null) {
            return new q1(str);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    @Override // ki.f2.e.d.AbstractC0730d.a
    public f2.e.d.AbstractC0730d.a setContent(String str) {
        if (str == null) {
            throw new NullPointerException("Null content");
        }
        this.f71413a = str;
        return this;
    }
}
