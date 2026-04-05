package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a2 extends f2.e.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f71127a;

    public a2(String str) {
        this.f71127a = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.f) {
            return this.f71127a.equals(((f2.e.f) obj).getIdentifier());
        }
        return false;
    }

    @Override // ki.f2.e.f
    public String getIdentifier() {
        return this.f71127a;
    }

    public int hashCode() {
        return this.f71127a.hashCode() ^ 1000003;
    }

    public String toString() {
        return o2.o(new StringBuilder("User{identifier="), this.f71127a, "}");
    }
}
