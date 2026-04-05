package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c0 extends f2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f71162b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71164d;

    /* renamed from: e, reason: collision with root package name */
    public final String f71165e;

    /* renamed from: f, reason: collision with root package name */
    public final String f71166f;

    /* renamed from: g, reason: collision with root package name */
    public final String f71167g;

    /* renamed from: h, reason: collision with root package name */
    public final String f71168h;

    /* renamed from: i, reason: collision with root package name */
    public final String f71169i;

    /* renamed from: j, reason: collision with root package name */
    public final String f71170j;

    /* renamed from: k, reason: collision with root package name */
    public final f2.e f71171k;

    /* renamed from: l, reason: collision with root package name */
    public final f2.d f71172l;

    /* renamed from: m, reason: collision with root package name */
    public final f2.a f71173m;

    public c0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, f2.e eVar, f2.d dVar, f2.a aVar) {
        this.f71162b = str;
        this.f71163c = str2;
        this.f71164d = i10;
        this.f71165e = str3;
        this.f71166f = str4;
        this.f71167g = str5;
        this.f71168h = str6;
        this.f71169i = str7;
        this.f71170j = str8;
        this.f71171k = eVar;
        this.f71172l = dVar;
        this.f71173m = aVar;
    }

    @Override // ki.f2
    public final b0 a() {
        b0 b0Var = new b0();
        b0Var.f71138a = getSdkVersion();
        b0Var.f71139b = getGmpAppId();
        b0Var.f71140c = getPlatform();
        b0Var.f71141d = getInstallationUuid();
        b0Var.f71142e = getFirebaseInstallationId();
        b0Var.f71143f = getFirebaseAuthenticationToken();
        b0Var.f71144g = getAppQualitySessionId();
        b0Var.f71145h = getBuildVersion();
        b0Var.f71146i = getDisplayVersion();
        b0Var.f71147j = getSession();
        b0Var.f71148k = getNdkPayload();
        b0Var.f71149l = getAppExitInfo();
        b0Var.f71150m = (byte) 1;
        return b0Var;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        f2.e eVar;
        f2.d dVar;
        f2.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            f2 f2Var = (f2) obj;
            if (this.f71162b.equals(f2Var.getSdkVersion()) && this.f71163c.equals(f2Var.getGmpAppId()) && this.f71164d == f2Var.getPlatform() && this.f71165e.equals(f2Var.getInstallationUuid()) && ((str = this.f71166f) != null ? str.equals(f2Var.getFirebaseInstallationId()) : f2Var.getFirebaseInstallationId() == null) && ((str2 = this.f71167g) != null ? str2.equals(f2Var.getFirebaseAuthenticationToken()) : f2Var.getFirebaseAuthenticationToken() == null) && ((str3 = this.f71168h) != null ? str3.equals(f2Var.getAppQualitySessionId()) : f2Var.getAppQualitySessionId() == null) && this.f71169i.equals(f2Var.getBuildVersion()) && this.f71170j.equals(f2Var.getDisplayVersion()) && ((eVar = this.f71171k) != null ? eVar.equals(f2Var.getSession()) : f2Var.getSession() == null) && ((dVar = this.f71172l) != null ? dVar.equals(f2Var.getNdkPayload()) : f2Var.getNdkPayload() == null) && ((aVar = this.f71173m) != null ? aVar.equals(f2Var.getAppExitInfo()) : f2Var.getAppExitInfo() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2
    public f2.a getAppExitInfo() {
        return this.f71173m;
    }

    @Override // ki.f2
    public String getAppQualitySessionId() {
        return this.f71168h;
    }

    @Override // ki.f2
    public String getBuildVersion() {
        return this.f71169i;
    }

    @Override // ki.f2
    public String getDisplayVersion() {
        return this.f71170j;
    }

    @Override // ki.f2
    public String getFirebaseAuthenticationToken() {
        return this.f71167g;
    }

    @Override // ki.f2
    public String getFirebaseInstallationId() {
        return this.f71166f;
    }

    @Override // ki.f2
    public String getGmpAppId() {
        return this.f71163c;
    }

    @Override // ki.f2
    public String getInstallationUuid() {
        return this.f71165e;
    }

    @Override // ki.f2
    public f2.d getNdkPayload() {
        return this.f71172l;
    }

    @Override // ki.f2
    public int getPlatform() {
        return this.f71164d;
    }

    @Override // ki.f2
    public String getSdkVersion() {
        return this.f71162b;
    }

    @Override // ki.f2
    public f2.e getSession() {
        return this.f71171k;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f71162b.hashCode() ^ 1000003) * 1000003) ^ this.f71163c.hashCode()) * 1000003) ^ this.f71164d) * 1000003) ^ this.f71165e.hashCode()) * 1000003;
        String str = this.f71166f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f71167g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f71168h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f71169i.hashCode()) * 1000003) ^ this.f71170j.hashCode()) * 1000003;
        f2.e eVar = this.f71171k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f2.d dVar = this.f71172l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f2.a aVar = this.f71173m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f71162b + ", gmpAppId=" + this.f71163c + ", platform=" + this.f71164d + ", installationUuid=" + this.f71165e + ", firebaseInstallationId=" + this.f71166f + ", firebaseAuthenticationToken=" + this.f71167g + ", appQualitySessionId=" + this.f71168h + ", buildVersion=" + this.f71169i + ", displayVersion=" + this.f71170j + ", session=" + this.f71171k + ", ndkPayload=" + this.f71172l + ", appExitInfo=" + this.f71173m + "}";
    }
}
