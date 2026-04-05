package io.odeeo.internal.u0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l2<T> extends p2<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p2<? super T> f66927a;

    public l2(p2<? super T> p2Var) {
        this.f66927a = p2Var;
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return 1;
        }
        if (t11 == null) {
            return -1;
        }
        return this.f66927a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            return this.f66927a.equals(((l2) obj).f66927a);
        }
        return false;
    }

    public int hashCode() {
        return this.f66927a.hashCode() ^ (-921210296);
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends T> p2<S> nullsFirst() {
        return this.f66927a.nullsFirst();
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends T> p2<S> reverse() {
        return this.f66927a.reverse().nullsFirst();
    }

    public String toString() {
        return this.f66927a + ".nullsLast()";
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends T> p2<S> nullsLast() {
        return this;
    }
}
