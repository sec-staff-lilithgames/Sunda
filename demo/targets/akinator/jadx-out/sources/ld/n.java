package ld;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f73273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73274b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73275c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73276d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73277e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73278f;

    /* renamed from: g, reason: collision with root package name */
    public final String f73279g;

    /* renamed from: h, reason: collision with root package name */
    public final String f73280h;

    /* renamed from: i, reason: collision with root package name */
    public final String f73281i;

    /* renamed from: j, reason: collision with root package name */
    public final String f73282j;

    /* renamed from: k, reason: collision with root package name */
    public final String f73283k;

    /* renamed from: l, reason: collision with root package name */
    public final String f73284l;

    public n(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f73273a = num;
        this.f73274b = str;
        this.f73275c = str2;
        this.f73276d = str3;
        this.f73277e = str4;
        this.f73278f = str5;
        this.f73279g = str6;
        this.f73280h = str7;
        this.f73281i = str8;
        this.f73282j = str9;
        this.f73283k = str10;
        this.f73284l = str11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f73273a;
            if (num != null ? num.equals(aVar.getSdkVersion()) : aVar.getSdkVersion() == null) {
                String str = this.f73274b;
                if (str != null ? str.equals(aVar.getModel()) : aVar.getModel() == null) {
                    String str2 = this.f73275c;
                    if (str2 != null ? str2.equals(aVar.getHardware()) : aVar.getHardware() == null) {
                        String str3 = this.f73276d;
                        if (str3 != null ? str3.equals(aVar.getDevice()) : aVar.getDevice() == null) {
                            String str4 = this.f73277e;
                            if (str4 != null ? str4.equals(aVar.getProduct()) : aVar.getProduct() == null) {
                                String str5 = this.f73278f;
                                if (str5 != null ? str5.equals(aVar.getOsBuild()) : aVar.getOsBuild() == null) {
                                    String str6 = this.f73279g;
                                    if (str6 != null ? str6.equals(aVar.getManufacturer()) : aVar.getManufacturer() == null) {
                                        String str7 = this.f73280h;
                                        if (str7 != null ? str7.equals(aVar.getFingerprint()) : aVar.getFingerprint() == null) {
                                            String str8 = this.f73281i;
                                            if (str8 != null ? str8.equals(aVar.getLocale()) : aVar.getLocale() == null) {
                                                String str9 = this.f73282j;
                                                if (str9 != null ? str9.equals(aVar.getCountry()) : aVar.getCountry() == null) {
                                                    String str10 = this.f73283k;
                                                    if (str10 != null ? str10.equals(aVar.getMccMnc()) : aVar.getMccMnc() == null) {
                                                        String str11 = this.f73284l;
                                                        if (str11 != null ? str11.equals(aVar.getApplicationBuild()) : aVar.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ld.a
    public String getApplicationBuild() {
        return this.f73284l;
    }

    @Override // ld.a
    public String getCountry() {
        return this.f73282j;
    }

    @Override // ld.a
    public String getDevice() {
        return this.f73276d;
    }

    @Override // ld.a
    public String getFingerprint() {
        return this.f73280h;
    }

    @Override // ld.a
    public String getHardware() {
        return this.f73275c;
    }

    @Override // ld.a
    public String getLocale() {
        return this.f73281i;
    }

    @Override // ld.a
    public String getManufacturer() {
        return this.f73279g;
    }

    @Override // ld.a
    public String getMccMnc() {
        return this.f73283k;
    }

    @Override // ld.a
    public String getModel() {
        return this.f73274b;
    }

    @Override // ld.a
    public String getOsBuild() {
        return this.f73278f;
    }

    @Override // ld.a
    public String getProduct() {
        return this.f73277e;
    }

    @Override // ld.a
    public Integer getSdkVersion() {
        return this.f73273a;
    }

    public int hashCode() {
        Integer num = this.f73273a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f73274b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f73275c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f73276d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f73277e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f73278f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f73279g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f73280h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f73281i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f73282j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f73283k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f73284l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f73273a);
        sb2.append(", model=");
        sb2.append(this.f73274b);
        sb2.append(", hardware=");
        sb2.append(this.f73275c);
        sb2.append(", device=");
        sb2.append(this.f73276d);
        sb2.append(", product=");
        sb2.append(this.f73277e);
        sb2.append(", osBuild=");
        sb2.append(this.f73278f);
        sb2.append(", manufacturer=");
        sb2.append(this.f73279g);
        sb2.append(", fingerprint=");
        sb2.append(this.f73280h);
        sb2.append(", locale=");
        sb2.append(this.f73281i);
        sb2.append(", country=");
        sb2.append(this.f73282j);
        sb2.append(", mccMnc=");
        sb2.append(this.f73283k);
        sb2.append(", applicationBuild=");
        return o2.o(sb2, this.f73284l, "}");
    }
}
