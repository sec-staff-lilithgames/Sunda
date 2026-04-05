package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends n0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f73317a;

    public y(m0 m0Var) {
        this.f73317a = m0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        m0 m0Var = this.f73317a;
        m0 prequest = ((n0) obj).getPrequest();
        return m0Var == null ? prequest == null : m0Var.equals(prequest);
    }

    @Override // ld.n0
    public m0 getPrequest() {
        return this.f73317a;
    }

    public int hashCode() {
        m0 m0Var = this.f73317a;
        return (m0Var == null ? 0 : m0Var.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f73317a + "}";
    }
}
