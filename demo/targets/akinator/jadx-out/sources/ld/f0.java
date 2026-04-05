package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f73227a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f73228b;

    public f0(t0 t0Var, s0 s0Var) {
        this.f73227a = t0Var;
        this.f73228b = s0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            t0 t0Var = this.f73227a;
            if (t0Var != null ? t0Var.equals(r0Var.getNetworkType()) : r0Var.getNetworkType() == null) {
                s0 s0Var = this.f73228b;
                if (s0Var != null ? s0Var.equals(r0Var.getMobileSubtype()) : r0Var.getMobileSubtype() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ld.r0
    public s0 getMobileSubtype() {
        return this.f73228b;
    }

    @Override // ld.r0
    public t0 getNetworkType() {
        return this.f73227a;
    }

    public int hashCode() {
        t0 t0Var = this.f73227a;
        int iHashCode = ((t0Var == null ? 0 : t0Var.hashCode()) ^ 1000003) * 1000003;
        s0 s0Var = this.f73228b;
        return (s0Var != null ? s0Var.hashCode() : 0) ^ iHashCode;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f73227a + ", mobileSubtype=" + this.f73228b + "}";
    }
}
