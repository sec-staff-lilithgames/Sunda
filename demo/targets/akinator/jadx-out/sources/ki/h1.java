package ki;

import j1.o2;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h1 extends f2.e.d.a.b.AbstractC0725e.AbstractC0726a {

    /* renamed from: a, reason: collision with root package name */
    public String f71275a;

    /* renamed from: b, reason: collision with root package name */
    public int f71276b;

    /* renamed from: c, reason: collision with root package name */
    public List f71277c;

    /* renamed from: d, reason: collision with root package name */
    public byte f71278d;

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0726a
    public f2.e.d.a.b.AbstractC0725e build() {
        String str;
        List list;
        if (this.f71278d == 1 && (str = this.f71275a) != null && (list = this.f71277c) != null) {
            return new i1(str, this.f71276b, list);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71275a == null) {
            sb2.append(" name");
        }
        if ((1 & this.f71278d) == 0) {
            sb2.append(" importance");
        }
        if (this.f71277c == null) {
            sb2.append(" frames");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0726a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0726a setFrames(List<f2.e.d.a.b.AbstractC0725e.AbstractC0727b> list) {
        if (list == null) {
            throw new NullPointerException("Null frames");
        }
        this.f71277c = list;
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0726a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0726a setImportance(int i10) {
        this.f71276b = i10;
        this.f71278d = (byte) (this.f71278d | 1);
        return this;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0726a
    public f2.e.d.a.b.AbstractC0725e.AbstractC0726a setName(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f71275a = str;
        return this;
    }
}
