package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k1 extends f2.e.d.a.b.AbstractC0725e.AbstractC0727b {

    /* renamed from: a, reason: collision with root package name */
    public final long f71325a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71326b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71327c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71328d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71329e;

    public k1(long j10, String str, String str2, long j11, int i10) {
        this.f71325a = j10;
        this.f71326b = str;
        this.f71327c = str2;
        this.f71328d = j11;
        this.f71329e = i10;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.a.b.AbstractC0725e.AbstractC0727b) {
            f2.e.d.a.b.AbstractC0725e.AbstractC0727b abstractC0727b = (f2.e.d.a.b.AbstractC0725e.AbstractC0727b) obj;
            if (this.f71325a == abstractC0727b.getPc() && this.f71326b.equals(abstractC0727b.getSymbol()) && ((str = this.f71327c) != null ? str.equals(abstractC0727b.getFile()) : abstractC0727b.getFile() == null) && this.f71328d == abstractC0727b.getOffset() && this.f71329e == abstractC0727b.getImportance()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b
    public String getFile() {
        return this.f71327c;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b
    public int getImportance() {
        return this.f71329e;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b
    public long getOffset() {
        return this.f71328d;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b
    public long getPc() {
        return this.f71325a;
    }

    @Override // ki.f2.e.d.a.b.AbstractC0725e.AbstractC0727b
    public String getSymbol() {
        return this.f71326b;
    }

    public int hashCode() {
        long j10 = this.f71325a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f71326b.hashCode()) * 1000003;
        String str = this.f71327c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f71328d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f71329e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f71325a);
        sb2.append(", symbol=");
        sb2.append(this.f71326b);
        sb2.append(", file=");
        sb2.append(this.f71327c);
        sb2.append(", offset=");
        sb2.append(this.f71328d);
        sb2.append(", importance=");
        return a.b.f(this.f71329e, "}", sb2);
    }
}
