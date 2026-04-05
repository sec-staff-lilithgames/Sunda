package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i0 extends f2.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f71289a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71290b;

    public i0(String str, String str2) {
        this.f71289a = str;
        this.f71290b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.c) {
            f2.c cVar = (f2.c) obj;
            if (this.f71289a.equals(cVar.getKey()) && this.f71290b.equals(cVar.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.c
    public String getKey() {
        return this.f71289a;
    }

    @Override // ki.f2.c
    public String getValue() {
        return this.f71290b;
    }

    public int hashCode() {
        return ((this.f71289a.hashCode() ^ 1000003) * 1000003) ^ this.f71290b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f71289a);
        sb2.append(", value=");
        return o2.o(sb2, this.f71290b, "}");
    }
}
