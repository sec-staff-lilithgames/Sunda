package io.odeeo.internal.t0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l<F, T> extends i<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final k<F, ? extends T> f66428a;

    /* renamed from: b, reason: collision with root package name */
    public final i<T> f66429b;

    public l(k<F, ? extends T> kVar, i<T> iVar) {
        this.f66428a = (k) u.checkNotNull(kVar);
        this.f66429b = (i) u.checkNotNull(iVar);
    }

    @Override // io.odeeo.internal.t0.i
    public boolean a(F f10, F f11) {
        return this.f66429b.equivalent(this.f66428a.apply(f10), this.f66428a.apply(f11));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f66428a.equals(lVar.f66428a) && this.f66429b.equals(lVar.f66429b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return p.hashCode(this.f66428a, this.f66429b);
    }

    public String toString() {
        return this.f66429b + ".onResultOf(" + this.f66428a + ")";
    }

    @Override // io.odeeo.internal.t0.i
    public int a(F f10) {
        return this.f66429b.hash(this.f66428a.apply(f10));
    }
}
