package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l0 extends f2.d.b.a {

    /* renamed from: a, reason: collision with root package name */
    public String f71335a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f71336b;

    @Override // ki.f2.d.b.a
    public f2.d.b build() {
        byte[] bArr;
        String str = this.f71335a;
        if (str != null && (bArr = this.f71336b) != null) {
            return new m0(str, bArr);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71335a == null) {
            sb2.append(" filename");
        }
        if (this.f71336b == null) {
            sb2.append(" contents");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.d.b.a
    public f2.d.b.a setContents(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null contents");
        }
        this.f71336b = bArr;
        return this;
    }

    @Override // ki.f2.d.b.a
    public f2.d.b.a setFilename(String str) {
        if (str == null) {
            throw new NullPointerException("Null filename");
        }
        this.f71335a = str;
        return this;
    }
}
