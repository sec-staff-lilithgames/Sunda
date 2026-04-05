package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f90943a;

    /* renamed from: b, reason: collision with root package name */
    public final m6 f90944b;

    public g0(f0 f0Var, m6 m6Var) {
        this.f90943a = (f0) mh.p1.checkNotNull(f0Var, "state is null");
        this.f90944b = (m6) mh.p1.checkNotNull(m6Var, "status is null");
    }

    public static g0 forNonError(f0 f0Var) {
        mh.p1.checkArgument(f0Var != f0.f90914e, "state is TRANSIENT_ERROR. Use forError() instead");
        return new g0(f0Var, m6.f91037e);
    }

    public static g0 forTransientFailure(m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "The error status must not be OK");
        return new g0(f0.f90914e, m6Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f90943a.equals(g0Var.f90943a) && this.f90944b.equals(g0Var.f90944b);
    }

    public f0 getState() {
        return this.f90943a;
    }

    public m6 getStatus() {
        return this.f90944b;
    }

    public int hashCode() {
        return this.f90943a.hashCode() ^ this.f90944b.hashCode();
    }

    public String toString() {
        m6 m6Var = this.f90944b;
        boolean zIsOk = m6Var.isOk();
        f0 f0Var = this.f90943a;
        if (zIsOk) {
            return f0Var.toString();
        }
        return f0Var + "(" + m6Var + ")";
    }
}
