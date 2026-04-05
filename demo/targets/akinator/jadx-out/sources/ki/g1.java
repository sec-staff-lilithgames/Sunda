package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g1 extends f2.e.d.a.b.AbstractC0723d {

    /* renamed from: a, reason: collision with root package name */
    public final String f71264a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71265b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71266c;

    public g1(String str, String str2, long j10) {
        this.f71264a = str;
        this.f71265b = str2;
        this.f71266c = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a.b.AbstractC0723d) {
            f2.e.d.a.b.AbstractC0723d abstractC0723d = (f2.e.d.a.b.AbstractC0723d) obj;
            if (this.f71264a.equals(abstractC0723d.getName()) && this.f71265b.equals(abstractC0723d.getCode()) && this.f71266c == abstractC0723d.getAddress()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0723d
    public long getAddress() {
        return this.f71266c;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0723d
    public String getCode() {
        return this.f71265b;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0723d
    public String getName() {
        return this.f71264a;
    }

    public int hashCode() {
        int iHashCode = (((this.f71264a.hashCode() ^ 1000003) * 1000003) ^ this.f71265b.hashCode()) * 1000003;
        long j10 = this.f71266c;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f71264a);
        sb2.append(", code=");
        sb2.append(this.f71265b);
        sb2.append(", address=");
        return a.b.g(this.f71266c, "}", sb2);
    }
}
