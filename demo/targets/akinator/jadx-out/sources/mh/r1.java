package mh;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r1 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final List f74681b;

    public r1(List list) {
        this.f74681b = list;
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f74681b;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((q1) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (obj instanceof r1) {
            return this.f74681b.equals(((r1) obj).f74681b);
        }
        return false;
    }

    public int hashCode() {
        return this.f74681b.hashCode() + 306654252;
    }

    public String toString() {
        return g2.a(this.f74681b, "and");
    }
}
