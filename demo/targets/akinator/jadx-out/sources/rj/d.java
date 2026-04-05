package rj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends v {

    /* renamed from: a, reason: collision with root package name */
    public final String f84439a;

    /* renamed from: b, reason: collision with root package name */
    public final long f84440b;

    /* renamed from: c, reason: collision with root package name */
    public final long f84441c;

    public d(String str, long j10, long j11) {
        this.f84439a = str;
        this.f84440b = j10;
        this.f84441c = j11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f84439a.equals(vVar.limiterKey()) && this.f84440b == vVar.limit() && this.f84441c == vVar.timeToLiveMillis()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f84439a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f84440b;
        long j11 = this.f84441c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // rj.v
    public long limit() {
        return this.f84440b;
    }

    @Override // rj.v
    public String limiterKey() {
        return this.f84439a;
    }

    @Override // rj.v
    public long timeToLiveMillis() {
        return this.f84441c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RateLimit{limiterKey=");
        sb2.append(this.f84439a);
        sb2.append(", limit=");
        sb2.append(this.f84440b);
        sb2.append(", timeToLiveMillis=");
        return a.b.g(this.f84441c, "}", sb2);
    }
}
