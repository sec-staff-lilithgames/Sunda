package ji;

import com.moloco.sdk.BKC.JzVV;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class c extends r {

    /* renamed from: b, reason: collision with root package name */
    public final String f69577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69578c;

    /* renamed from: d, reason: collision with root package name */
    public final String f69579d;

    /* renamed from: e, reason: collision with root package name */
    public final String f69580e;

    /* renamed from: f, reason: collision with root package name */
    public final long f69581f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f69577b.equals(rVar.getRolloutId()) && this.f69578c.equals(rVar.getParameterKey()) && this.f69579d.equals(rVar.getParameterValue()) && this.f69580e.equals(rVar.getVariantId()) && this.f69581f == rVar.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // ji.r
    public String getParameterKey() {
        return this.f69578c;
    }

    @Override // ji.r
    public String getParameterValue() {
        return this.f69579d;
    }

    @Override // ji.r
    public String getRolloutId() {
        return this.f69577b;
    }

    @Override // ji.r
    public long getTemplateVersion() {
        return this.f69581f;
    }

    @Override // ji.r
    public String getVariantId() {
        return this.f69580e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f69577b.hashCode() ^ 1000003) * 1000003) ^ this.f69578c.hashCode()) * 1000003) ^ this.f69579d.hashCode()) * 1000003) ^ this.f69580e.hashCode()) * 1000003;
        long j10 = this.f69581f;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f69577b);
        sb2.append(", parameterKey=");
        sb2.append(this.f69578c);
        sb2.append(", parameterValue=");
        sb2.append(this.f69579d);
        sb2.append(", variantId=");
        sb2.append(this.f69580e);
        sb2.append(", templateVersion=");
        return a.b.g(this.f69581f, "}", sb2);
    }

    public c(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f69577b = str;
            if (str2 != null) {
                this.f69578c = str2;
                if (str3 != null) {
                    this.f69579d = str3;
                    if (str4 != null) {
                        this.f69580e = str4;
                        this.f69581f = j10;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException(JzVV.oAWoUzXyN);
    }
}
