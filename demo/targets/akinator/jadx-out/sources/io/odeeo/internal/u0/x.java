package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x<T> extends p2<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<T> f67183a;

    public x(Comparator<T> comparator) {
        this.f67183a = (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator);
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f67183a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return this.f67183a.equals(((x) obj).f67183a);
        }
        return false;
    }

    public int hashCode() {
        return this.f67183a.hashCode();
    }

    public String toString() {
        return this.f67183a.toString();
    }
}
