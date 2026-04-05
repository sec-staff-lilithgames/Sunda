package hi;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58800b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58801c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f58799a = str;
        this.f58800b = str2;
        this.f58801c = str3;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (this.f58799a.equals(o0Var.getCrashlyticsInstallId()) && ((str = this.f58800b) != null ? str.equals(o0Var.getFirebaseInstallationId()) : o0Var.getFirebaseInstallationId() == null) && ((str2 = this.f58801c) != null ? str2.equals(o0Var.getFirebaseAuthenticationToken()) : o0Var.getFirebaseAuthenticationToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // hi.o0
    public String getCrashlyticsInstallId() {
        return this.f58799a;
    }

    @Override // hi.o0
    public String getFirebaseAuthenticationToken() {
        return this.f58801c;
    }

    @Override // hi.o0
    public String getFirebaseInstallationId() {
        return this.f58800b;
    }

    public int hashCode() {
        int iHashCode = (this.f58799a.hashCode() ^ 1000003) * 1000003;
        String str = this.f58800b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f58801c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f58799a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f58800b);
        sb2.append(", firebaseAuthenticationToken=");
        return o2.o(sb2, this.f58801c, "}");
    }
}
