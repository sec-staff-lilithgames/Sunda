package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l1 extends f2.e.d.a.c.AbstractC0729a {

    /* renamed from: a, reason: collision with root package name */
    public String f71337a;

    /* renamed from: b, reason: collision with root package name */
    public int f71338b;

    /* renamed from: c, reason: collision with root package name */
    public int f71339c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f71340d;

    /* renamed from: e, reason: collision with root package name */
    public byte f71341e;

    @Override // ki.f2.e.d.a.c.AbstractC0729a
    public f2.e.d.a.c build() {
        String str;
        if (this.f71341e == 7 && (str = this.f71337a) != null) {
            return new m1(str, this.f71338b, this.f71339c, this.f71340d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71337a == null) {
            sb2.append(" processName");
        }
        if ((this.f71341e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f71341e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f71341e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.c.AbstractC0729a
    public f2.e.d.a.c.AbstractC0729a setDefaultProcess(boolean z10) {
        this.f71340d = z10;
        this.f71341e = (byte) (this.f71341e | 4);
        return this;
    }

    @Override // ki.f2.e.d.a.c.AbstractC0729a
    public f2.e.d.a.c.AbstractC0729a setImportance(int i10) {
        this.f71339c = i10;
        this.f71341e = (byte) (this.f71341e | 2);
        return this;
    }

    @Override // ki.f2.e.d.a.c.AbstractC0729a
    public f2.e.d.a.c.AbstractC0729a setPid(int i10) {
        this.f71338b = i10;
        this.f71341e = (byte) (this.f71341e | 1);
        return this;
    }

    @Override // ki.f2.e.d.a.c.AbstractC0729a
    public f2.e.d.a.c.AbstractC0729a setProcessName(String str) {
        if (str == null) {
            throw new NullPointerException("Null processName");
        }
        this.f71337a = str;
        return this;
    }
}
