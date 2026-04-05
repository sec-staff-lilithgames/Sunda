package tj;

import tj.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f86922a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86923b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86924c;

    public b(String str, long j10, long j11) {
        this.f86922a = str;
        this.f86923b = j10;
        this.f86924c = j11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f86922a.equals(kVar.getToken()) && this.f86923b == kVar.getTokenExpirationTimestamp() && this.f86924c == kVar.getTokenCreationTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // tj.k
    public String getToken() {
        return this.f86922a;
    }

    @Override // tj.k
    public long getTokenCreationTimestamp() {
        return this.f86924c;
    }

    @Override // tj.k
    public long getTokenExpirationTimestamp() {
        return this.f86923b;
    }

    public int hashCode() {
        int iHashCode = (this.f86922a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f86923b;
        long j11 = this.f86924c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // tj.k
    public k.a toBuilder() {
        a aVar = new a();
        aVar.f86919a = getToken();
        aVar.f86920b = Long.valueOf(getTokenExpirationTimestamp());
        aVar.f86921c = Long.valueOf(getTokenCreationTimestamp());
        return aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f86922a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f86923b);
        sb2.append(", tokenCreationTimestamp=");
        return a.b.g(this.f86924c, "}", sb2);
    }
}
