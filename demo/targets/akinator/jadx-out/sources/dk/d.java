package dk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f52363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52364b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52365c;

    /* renamed from: d, reason: collision with root package name */
    public final String f52366d;

    /* renamed from: e, reason: collision with root package name */
    public final long f52367e;

    public d(String str, String str2, String str3, String str4, long j10) {
        this.f52363a = str;
        this.f52364b = str2;
        this.f52365c = str3;
        this.f52366d = str4;
        this.f52367e = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f52363a.equals(fVar.getRolloutId()) && this.f52364b.equals(fVar.getVariantId()) && this.f52365c.equals(fVar.getParameterKey()) && this.f52366d.equals(fVar.getParameterValue()) && this.f52367e == fVar.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // dk.f
    public String getParameterKey() {
        return this.f52365c;
    }

    @Override // dk.f
    public String getParameterValue() {
        return this.f52366d;
    }

    @Override // dk.f
    public String getRolloutId() {
        return this.f52363a;
    }

    @Override // dk.f
    public long getTemplateVersion() {
        return this.f52367e;
    }

    @Override // dk.f
    public String getVariantId() {
        return this.f52364b;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f52363a.hashCode() ^ 1000003) * 1000003) ^ this.f52364b.hashCode()) * 1000003) ^ this.f52365c.hashCode()) * 1000003) ^ this.f52366d.hashCode()) * 1000003;
        long j10 = this.f52367e;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f52363a);
        sb2.append(", variantId=");
        sb2.append(this.f52364b);
        sb2.append(", parameterKey=");
        sb2.append(this.f52365c);
        sb2.append(", parameterValue=");
        sb2.append(this.f52366d);
        sb2.append(", templateVersion=");
        return a.b.g(this.f52367e, "}", sb2);
    }
}
