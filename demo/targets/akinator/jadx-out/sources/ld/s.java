package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f73292a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f73293b;

    public s(n0 n0Var, k0 k0Var) {
        this.f73292a = n0Var;
        this.f73293b = k0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            n0 n0Var = this.f73292a;
            if (n0Var != null ? n0Var.equals(j0Var.getPrivacyContext()) : j0Var.getPrivacyContext() == null) {
                k0 k0Var = this.f73293b;
                if (k0Var != null ? k0Var.equals(j0Var.getProductIdOrigin()) : j0Var.getProductIdOrigin() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ld.j0
    public n0 getPrivacyContext() {
        return this.f73292a;
    }

    @Override // ld.j0
    public k0 getProductIdOrigin() {
        return this.f73293b;
    }

    public int hashCode() {
        n0 n0Var = this.f73292a;
        int iHashCode = ((n0Var == null ? 0 : n0Var.hashCode()) ^ 1000003) * 1000003;
        k0 k0Var = this.f73293b;
        return (k0Var != null ? k0Var.hashCode() : 0) ^ iHashCode;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f73292a + ", productIdOrigin=" + this.f73293b + "}";
    }
}
