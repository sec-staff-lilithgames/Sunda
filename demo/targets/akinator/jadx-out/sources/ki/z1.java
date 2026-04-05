package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z1 extends f2.e.f.a {

    /* renamed from: a, reason: collision with root package name */
    public String f71544a;

    @Override // ki.f2.e.f.a
    public f2.e.f build() {
        String str = this.f71544a;
        if (str != null) {
            return new a2(str);
        }
        throw new IllegalStateException("Missing required properties: identifier");
    }

    @Override // ki.f2.e.f.a
    public f2.e.f.a setIdentifier(String str) {
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        this.f71544a = str;
        return this;
    }
}
