package wj;

import wj.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f90660a;

    /* renamed from: b, reason: collision with root package name */
    public final long f90661b;

    /* renamed from: c, reason: collision with root package name */
    public final j f90662c;

    public d(String str, long j10, j jVar) {
        this.f90660a = str;
        this.f90661b = j10;
        this.f90662c = jVar;
    }

    public boolean equals(Object obj) {
        j jVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = this.f90660a;
            if (str != null ? str.equals(iVar.getToken()) : iVar.getToken() == null) {
                if (this.f90661b == iVar.getTokenExpirationTimestamp() && ((jVar = this.f90662c) != null ? jVar.equals(iVar.getResponseCode()) : iVar.getResponseCode() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // wj.i
    public j getResponseCode() {
        return this.f90662c;
    }

    @Override // wj.i
    public String getToken() {
        return this.f90660a;
    }

    @Override // wj.i
    public long getTokenExpirationTimestamp() {
        return this.f90661b;
    }

    public int hashCode() {
        String str = this.f90660a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f90661b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        j jVar = this.f90662c;
        return (jVar != null ? jVar.hashCode() : 0) ^ i10;
    }

    @Override // wj.i
    public i.a toBuilder() {
        c cVar = new c();
        cVar.f90656a = getToken();
        cVar.f90657b = getTokenExpirationTimestamp();
        cVar.f90658c = getResponseCode();
        cVar.f90659d = (byte) 1;
        return cVar;
    }

    public String toString() {
        return "TokenResult{token=" + this.f90660a + ", tokenExpirationTimestamp=" + this.f90661b + ", responseCode=" + this.f90662c + "}";
    }
}
