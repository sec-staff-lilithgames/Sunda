package nd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    public final h f75981a;

    /* renamed from: b, reason: collision with root package name */
    public final long f75982b;

    public c(h hVar, long j10) {
        this.f75981a = hVar;
        this.f75982b = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f75981a.equals(iVar.getStatus()) && this.f75982b == iVar.getNextRequestWaitMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // nd.i
    public long getNextRequestWaitMillis() {
        return this.f75982b;
    }

    @Override // nd.i
    public h getStatus() {
        return this.f75981a;
    }

    public int hashCode() {
        int iHashCode = (this.f75981a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f75982b;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f75981a);
        sb2.append(", nextRequestWaitMillis=");
        return a.b.g(this.f75982b, "}", sb2);
    }
}
