package ki;

import j1.o2;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c1 extends f2.e.d.a.b.AbstractC0719a {

    /* renamed from: a, reason: collision with root package name */
    public final long f71174a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71176c;

    /* renamed from: d, reason: collision with root package name */
    public final String f71177d;

    public c1(String str, String str2, long j10, long j11) {
        this.f71174a = j10;
        this.f71175b = j11;
        this.f71176c = str;
        this.f71177d = str2;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a.b.AbstractC0719a) {
            f2.e.d.a.b.AbstractC0719a abstractC0719a = (f2.e.d.a.b.AbstractC0719a) obj;
            if (this.f71174a == abstractC0719a.getBaseAddress() && this.f71175b == abstractC0719a.getSize() && this.f71176c.equals(abstractC0719a.getName()) && ((str = this.f71177d) != null ? str.equals(abstractC0719a.getUuid()) : abstractC0719a.getUuid() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a
    public long getBaseAddress() {
        return this.f71174a;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a
    public String getName() {
        return this.f71176c;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a
    public long getSize() {
        return this.f71175b;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0719a
    public String getUuid() {
        return this.f71177d;
    }

    public int hashCode() {
        long j10 = this.f71174a;
        long j11 = this.f71175b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f71176c.hashCode()) * 1000003;
        String str = this.f71177d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f71174a);
        sb2.append(", size=");
        sb2.append(this.f71175b);
        sb2.append(", name=");
        sb2.append(this.f71176c);
        sb2.append(", uuid=");
        return o2.o(sb2, this.f71177d, "}");
    }
}
