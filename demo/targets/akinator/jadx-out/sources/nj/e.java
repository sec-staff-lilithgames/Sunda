package nj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f76881a;

    /* renamed from: b, reason: collision with root package name */
    public final tj.k f76882b;

    public e(String str, tj.k kVar) {
        if (str == null) {
            throw new NullPointerException("Null installationId");
        }
        this.f76881a = str;
        if (kVar == null) {
            throw new NullPointerException("Null installationTokenResult");
        }
        this.f76882b = kVar;
    }

    @Override // nj.i0
    public final String a() {
        return this.f76881a;
    }

    @Override // nj.i0
    public final tj.k b() {
        return this.f76882b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f76881a.equals(i0Var.a()) && this.f76882b.equals(i0Var.b());
    }

    public int hashCode() {
        return ((this.f76881a.hashCode() ^ 1000003) * 1000003) ^ this.f76882b.hashCode();
    }

    public String toString() {
        return "InstallationIdResult{installationId=" + this.f76881a + ", installationTokenResult=" + this.f76882b + "}";
    }
}
