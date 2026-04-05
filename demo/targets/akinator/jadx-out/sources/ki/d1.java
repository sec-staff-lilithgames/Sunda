package ki;

import j1.o2;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d1 extends f2.e.d.a.b.c.AbstractC0722a {

    /* renamed from: a, reason: collision with root package name */
    public String f71207a;

    /* renamed from: b, reason: collision with root package name */
    public String f71208b;

    /* renamed from: c, reason: collision with root package name */
    public List f71209c;

    /* renamed from: d, reason: collision with root package name */
    public f2.e.d.a.b.c f71210d;

    /* renamed from: e, reason: collision with root package name */
    public int f71211e;

    /* renamed from: f, reason: collision with root package name */
    public byte f71212f;

    @Override // ki.f2.e.d.a.b.c.AbstractC0722a
    public f2.e.d.a.b.c build() {
        String str;
        List list;
        if (this.f71212f == 1 && (str = this.f71207a) != null && (list = this.f71209c) != null) {
            return new e1(str, this.f71208b, list, this.f71210d, this.f71211e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71207a == null) {
            sb2.append(" type");
        }
        if (this.f71209c == null) {
            sb2.append(" frames");
        }
        if ((1 & this.f71212f) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.d.a.b.c.AbstractC0722a
    public f2.e.d.a.b.c.AbstractC0722a setCausedBy(f2.e.d.a.b.c cVar) {
        this.f71210d = cVar;
        return this;
    }

    @Override // ki.f2.e.d.a.b.c.AbstractC0722a
    public f2.e.d.a.b.c.AbstractC0722a setFrames(List<f2.e.d.a.b.AbstractC0725e.AbstractC0727b> list) {
        if (list == null) {
            throw new NullPointerException("Null frames");
        }
        this.f71209c = list;
        return this;
    }

    @Override // ki.f2.e.d.a.b.c.AbstractC0722a
    public f2.e.d.a.b.c.AbstractC0722a setOverflowCount(int i10) {
        this.f71211e = i10;
        this.f71212f = (byte) (this.f71212f | 1);
        return this;
    }

    @Override // ki.f2.e.d.a.b.c.AbstractC0722a
    public f2.e.d.a.b.c.AbstractC0722a setReason(String str) {
        this.f71208b = str;
        return this;
    }

    @Override // ki.f2.e.d.a.b.c.AbstractC0722a
    public f2.e.d.a.b.c.AbstractC0722a setType(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.f71207a = str;
        return this;
    }
}
