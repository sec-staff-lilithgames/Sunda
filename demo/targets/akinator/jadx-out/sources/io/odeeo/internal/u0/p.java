package io.odeeo.internal.u0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p<F, T> extends p2<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.t0.k<F, ? extends T> f67018a;

    /* renamed from: b, reason: collision with root package name */
    public final p2<T> f67019b;

    public p(io.odeeo.internal.t0.k<F, ? extends T> kVar, p2<T> p2Var) {
        this.f67018a = (io.odeeo.internal.t0.k) io.odeeo.internal.t0.u.checkNotNull(kVar);
        this.f67019b = (p2) io.odeeo.internal.t0.u.checkNotNull(p2Var);
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f67019b.compare(this.f67018a.apply(f10), this.f67018a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f67018a.equals(pVar.f67018a) && this.f67019b.equals(pVar.f67019b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.odeeo.internal.t0.p.hashCode(this.f67018a, this.f67019b);
    }

    public String toString() {
        return this.f67019b + ".onResultOf(" + this.f67018a + ")";
    }
}
