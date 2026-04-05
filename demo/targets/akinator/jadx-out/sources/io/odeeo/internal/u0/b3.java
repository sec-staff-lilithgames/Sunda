package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b3<T> extends p2<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p2<? super T> f66540a;

    public b3(p2<? super T> p2Var) {
        this.f66540a = (p2) io.odeeo.internal.t0.u.checkNotNull(p2Var);
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f66540a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b3) {
            return this.f66540a.equals(((b3) obj).f66540a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f66540a.hashCode();
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E max(E e10, E e11) {
        return (E) this.f66540a.min(e10, e11);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E min(E e10, E e11) {
        return (E) this.f66540a.max(e10, e11);
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends T> p2<S> reverse() {
        return this.f66540a;
    }

    public String toString() {
        return this.f66540a + ".reverse()";
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E max(E e10, E e11, E e12, E... eArr) {
        return (E) this.f66540a.min(e10, e11, e12, eArr);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E min(E e10, E e11, E e12, E... eArr) {
        return (E) this.f66540a.max(e10, e11, e12, eArr);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E max(Iterator<E> it) {
        return (E) this.f66540a.min(it);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E min(Iterator<E> it) {
        return (E) this.f66540a.max(it);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) this.f66540a.min(iterable);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) this.f66540a.max(iterable);
    }
}
