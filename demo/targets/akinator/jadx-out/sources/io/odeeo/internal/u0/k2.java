package io.odeeo.internal.u0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k2<T> extends p2<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p2<? super T> f66923a;

    public k2(p2<? super T> p2Var) {
        this.f66923a = p2Var;
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return this.f66923a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            return this.f66923a.equals(((k2) obj).f66923a);
        }
        return false;
    }

    public int hashCode() {
        return this.f66923a.hashCode() ^ 957692532;
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends T> p2<S> nullsLast() {
        return this.f66923a.nullsLast();
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends T> p2<S> reverse() {
        return this.f66923a.reverse().nullsLast();
    }

    public String toString() {
        return this.f66923a + ".nullsFirst()";
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends T> p2<S> nullsFirst() {
        return this;
    }
}
