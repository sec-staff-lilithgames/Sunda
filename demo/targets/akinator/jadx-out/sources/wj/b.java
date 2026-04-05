package wj;

import wj.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f90651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90652b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90653c;

    /* renamed from: d, reason: collision with root package name */
    public final i f90654d;

    /* renamed from: e, reason: collision with root package name */
    public final g f90655e;

    public b(String str, String str2, String str3, i iVar, g gVar) {
        this.f90651a = str;
        this.f90652b = str2;
        this.f90653c = str3;
        this.f90654d = iVar;
        this.f90655e = gVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f90651a;
            if (str != null ? str.equals(fVar.getUri()) : fVar.getUri() == null) {
                String str2 = this.f90652b;
                if (str2 != null ? str2.equals(fVar.getFid()) : fVar.getFid() == null) {
                    String str3 = this.f90653c;
                    if (str3 != null ? str3.equals(fVar.getRefreshToken()) : fVar.getRefreshToken() == null) {
                        i iVar = this.f90654d;
                        if (iVar != null ? iVar.equals(fVar.getAuthToken()) : fVar.getAuthToken() == null) {
                            g gVar = this.f90655e;
                            if (gVar != null ? gVar.equals(fVar.getResponseCode()) : fVar.getResponseCode() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // wj.f
    public i getAuthToken() {
        return this.f90654d;
    }

    @Override // wj.f
    public String getFid() {
        return this.f90652b;
    }

    @Override // wj.f
    public String getRefreshToken() {
        return this.f90653c;
    }

    @Override // wj.f
    public g getResponseCode() {
        return this.f90655e;
    }

    @Override // wj.f
    public String getUri() {
        return this.f90651a;
    }

    public int hashCode() {
        String str = this.f90651a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f90652b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f90653c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        i iVar = this.f90654d;
        int iHashCode4 = (iHashCode3 ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        g gVar = this.f90655e;
        return (gVar != null ? gVar.hashCode() : 0) ^ iHashCode4;
    }

    @Override // wj.f
    public f.a toBuilder() {
        a aVar = new a();
        aVar.f90646a = getUri();
        aVar.f90647b = getFid();
        aVar.f90648c = getRefreshToken();
        aVar.f90649d = getAuthToken();
        aVar.f90650e = getResponseCode();
        return aVar;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f90651a + ", fid=" + this.f90652b + ", refreshToken=" + this.f90653c + ", authToken=" + this.f90654d + ", responseCode=" + this.f90655e + "}";
    }
}
