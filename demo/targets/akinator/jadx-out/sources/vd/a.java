package vd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final long f89202b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89203c;

    /* renamed from: d, reason: collision with root package name */
    public final int f89204d;

    /* renamed from: e, reason: collision with root package name */
    public final long f89205e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89206f;

    public a(int i10, int i11, int i12, long j10, long j11) {
        this.f89202b = j10;
        this.f89203c = i10;
        this.f89204d = i11;
        this.f89205e = j11;
        this.f89206f = i12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            a aVar = (a) ((e) obj);
            if (this.f89202b == aVar.f89202b && this.f89203c == aVar.f89203c && this.f89204d == aVar.f89204d && this.f89205e == aVar.f89205e && this.f89206f == aVar.f89206f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f89202b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f89203c) * 1000003) ^ this.f89204d) * 1000003;
        long j11 = this.f89205e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f89206f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f89202b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f89203c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f89204d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f89205e);
        sb2.append(", maxBlobByteSizePerRow=");
        return a.b.f(this.f89206f, "}", sb2);
    }
}
