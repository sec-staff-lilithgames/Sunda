package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r0 extends f2.e.a.b.AbstractC0717a {

    /* renamed from: a, reason: collision with root package name */
    public String f71433a;

    @Override // ki.f2.e.a.b.AbstractC0717a
    public f2.e.a.b build() {
        String str = this.f71433a;
        if (str != null) {
            return new s0(str);
        }
        throw new IllegalStateException("Missing required properties: clsId");
    }

    @Override // ki.f2.e.a.b.AbstractC0717a
    public f2.e.a.b.AbstractC0717a setClsId(String str) {
        if (str == null) {
            throw new NullPointerException("Null clsId");
        }
        this.f71433a = str;
        return this;
    }
}
