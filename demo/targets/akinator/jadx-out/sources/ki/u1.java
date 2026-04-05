package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u1 extends f2.e.d.AbstractC0731e.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f71481a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71482b;

    public u1(String str, String str2) {
        this.f71481a = str;
        this.f71482b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.AbstractC0731e.b) {
            f2.e.d.AbstractC0731e.b bVar = (f2.e.d.AbstractC0731e.b) obj;
            if (this.f71481a.equals(bVar.getRolloutId()) && this.f71482b.equals(bVar.getVariantId())) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.AbstractC0731e.b
    public String getRolloutId() {
        return this.f71481a;
    }

    @Override // ki.f2.e.d.AbstractC0731e.b
    public String getVariantId() {
        return this.f71482b;
    }

    public int hashCode() {
        return ((this.f71481a.hashCode() ^ 1000003) * 1000003) ^ this.f71482b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f71481a);
        sb2.append(", variantId=");
        return o2.o(sb2, this.f71482b, "}");
    }
}
