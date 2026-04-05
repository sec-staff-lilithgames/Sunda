package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j1 extends f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a {

    /* renamed from: a, reason: collision with root package name */
    public long f71309a;

    /* renamed from: b, reason: collision with root package name */
    public String f71310b;

    /* renamed from: c, reason: collision with root package name */
    public String f71311c;

    /* renamed from: d, reason: collision with root package name */
    public long f71312d;

    /* renamed from: e, reason: collision with root package name */
    public int f71313e;

    /* renamed from: f, reason: collision with root package name */
    public byte f71314f;

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0727b build() {
        String str;
        if (this.f71314f == 7 && (str = this.f71310b) != null) {
            return new k1(this.f71309a, str, this.f71311c, this.f71312d, this.f71313e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f71314f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f71310b == null) {
            sb2.append(" symbol");
        }
        if ((this.f71314f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f71314f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a setFile(String str) {
        this.f71311c = str;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a setImportance(int i10) {
        this.f71313e = i10;
        this.f71314f = (byte) (this.f71314f | 4);
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a setOffset(long j10) {
        this.f71312d = j10;
        this.f71314f = (byte) (this.f71314f | 2);
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a setPc(long j10) {
        this.f71309a = j10;
        this.f71314f = (byte) (this.f71314f | 1);
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0727b.AbstractC0728a setSymbol(String str) {
        if (str == null) {
            throw new NullPointerException("Null symbol");
        }
        this.f71310b = str;
        return this;
    }
}
