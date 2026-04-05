package vj;

import j1.o2;
import vj.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f89287a;

    /* renamed from: b, reason: collision with root package name */
    public final d f89288b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89289c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89290d;

    /* renamed from: e, reason: collision with root package name */
    public final long f89291e;

    /* renamed from: f, reason: collision with root package name */
    public final long f89292f;

    /* renamed from: g, reason: collision with root package name */
    public final String f89293g;

    public b(String str, d dVar, String str2, String str3, long j10, long j11, String str4) {
        this.f89287a = str;
        this.f89288b = dVar;
        this.f89289c = str2;
        this.f89290d = str3;
        this.f89291e = j10;
        this.f89292f = j11;
        this.f89293g = str4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str4 = this.f89287a;
            if (str4 != null ? str4.equals(fVar.getFirebaseInstallationId()) : fVar.getFirebaseInstallationId() == null) {
                if (this.f89288b.equals(fVar.getRegistrationStatus()) && ((str = this.f89289c) != null ? str.equals(fVar.getAuthToken()) : fVar.getAuthToken() == null) && ((str2 = this.f89290d) != null ? str2.equals(fVar.getRefreshToken()) : fVar.getRefreshToken() == null) && this.f89291e == fVar.getExpiresInSecs() && this.f89292f == fVar.getTokenCreationEpochInSecs() && ((str3 = this.f89293g) != null ? str3.equals(fVar.getFisError()) : fVar.getFisError() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // vj.f
    public String getAuthToken() {
        return this.f89289c;
    }

    @Override // vj.f
    public long getExpiresInSecs() {
        return this.f89291e;
    }

    @Override // vj.f
    public String getFirebaseInstallationId() {
        return this.f89287a;
    }

    @Override // vj.f
    public String getFisError() {
        return this.f89293g;
    }

    @Override // vj.f
    public String getRefreshToken() {
        return this.f89290d;
    }

    @Override // vj.f
    public d getRegistrationStatus() {
        return this.f89288b;
    }

    @Override // vj.f
    public long getTokenCreationEpochInSecs() {
        return this.f89292f;
    }

    public int hashCode() {
        String str = this.f89287a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f89288b.hashCode()) * 1000003;
        String str2 = this.f89289c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f89290d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f89291e;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f89292f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f89293g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    @Override // vj.f
    public f.a toBuilder() {
        a aVar = new a();
        aVar.f89279a = getFirebaseInstallationId();
        aVar.f89280b = getRegistrationStatus();
        aVar.f89281c = getAuthToken();
        aVar.f89282d = getRefreshToken();
        aVar.f89283e = getExpiresInSecs();
        aVar.f89284f = getTokenCreationEpochInSecs();
        aVar.f89285g = getFisError();
        aVar.f89286h = (byte) 3;
        return aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f89287a);
        sb2.append(", registrationStatus=");
        sb2.append(this.f89288b);
        sb2.append(", authToken=");
        sb2.append(this.f89289c);
        sb2.append(", refreshToken=");
        sb2.append(this.f89290d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f89291e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f89292f);
        sb2.append(", fisError=");
        return o2.o(sb2, this.f89293g, "}");
    }
}
