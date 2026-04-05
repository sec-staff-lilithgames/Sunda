package ki;

import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s1 extends f2.e.d.AbstractC0731e {

    /* renamed from: a, reason: collision with root package name */
    public final f2.e.d.AbstractC0731e.b f71447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71449c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71450d;

    public s1(f2.e.d.AbstractC0731e.b bVar, String str, String str2, long j10) {
        this.f71447a = bVar;
        this.f71448b = str;
        this.f71449c = str2;
        this.f71450d = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.AbstractC0731e) {
            f2.e.d.AbstractC0731e abstractC0731e = (f2.e.d.AbstractC0731e) obj;
            if (this.f71447a.equals(abstractC0731e.getRolloutVariant()) && this.f71448b.equals(abstractC0731e.getParameterKey()) && this.f71449c.equals(abstractC0731e.getParameterValue()) && this.f71450d == abstractC0731e.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // ki.f2.e.d.AbstractC0731e
    public String getParameterKey() {
        return this.f71448b;
    }

    @Override // ki.f2.e.d.AbstractC0731e
    public String getParameterValue() {
        return this.f71449c;
    }

    @Override // ki.f2.e.d.AbstractC0731e
    public f2.e.d.AbstractC0731e.b getRolloutVariant() {
        return this.f71447a;
    }

    @Override // ki.f2.e.d.AbstractC0731e
    public long getTemplateVersion() {
        return this.f71450d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f71447a.hashCode() ^ 1000003) * 1000003) ^ this.f71448b.hashCode()) * 1000003) ^ this.f71449c.hashCode()) * 1000003;
        long j10 = this.f71450d;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f71447a);
        sb2.append(", parameterKey=");
        sb2.append(this.f71448b);
        sb2.append(", parameterValue=");
        sb2.append(this.f71449c);
        sb2.append(", templateVersion=");
        return a.b.g(this.f71450d, "}", sb2);
    }
}
