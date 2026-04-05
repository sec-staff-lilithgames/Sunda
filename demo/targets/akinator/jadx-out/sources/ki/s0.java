package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s0 extends f2.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f71446a;

    public s0(String str) {
        this.f71446a = str;
    }

    @Override // ki.f2.e.a.b
    public final r0 a() {
        r0 r0Var = new r0();
        r0Var.f71433a = getClsId();
        return r0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.a.b) {
            return this.f71446a.equals(((f2.e.a.b) obj).getClsId());
        }
        return false;
    }

    @Override // ki.f2.e.a.b
    public String getClsId() {
        return this.f71446a;
    }

    public int hashCode() {
        return this.f71446a.hashCode() ^ 1000003;
    }

    public String toString() {
        return o2.o(new StringBuilder("Organization{clsId="), this.f71446a, "}");
    }
}
