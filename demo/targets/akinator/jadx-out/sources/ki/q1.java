package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q1 extends f2.e.d.AbstractC0730d {

    /* renamed from: a, reason: collision with root package name */
    public final String f71427a;

    public q1(String str) {
        this.f71427a = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.AbstractC0730d) {
            return this.f71427a.equals(((f2.e.d.AbstractC0730d) obj).getContent());
        }
        return false;
    }

    @Override // ki.f2.e.d.AbstractC0730d
    public String getContent() {
        return this.f71427a;
    }

    public int hashCode() {
        return this.f71427a.hashCode() ^ 1000003;
    }

    public String toString() {
        return o2.o(new StringBuilder("Log{content="), this.f71427a, "}");
    }
}
