package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a3 extends p2<Comparable> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final a3 f66522a = new a3();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f66522a;
    }

    @Override // io.odeeo.internal.u0.p2
    public <S extends Comparable> p2<S> reverse() {
        return p2.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(Comparable comparable, Comparable comparable2) {
        io.odeeo.internal.t0.u.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E max(E e10, E e11) {
        return (E) j2.f66918c.min(e10, e11);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E min(E e10, E e11) {
        return (E) j2.f66918c.max(e10, e11);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E max(E e10, E e11, E e12, E... eArr) {
        return (E) j2.f66918c.min(e10, e11, e12, eArr);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E min(E e10, E e11, E e12, E... eArr) {
        return (E) j2.f66918c.max(e10, e11, e12, eArr);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E max(Iterator<E> it) {
        return (E) j2.f66918c.min(it);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E min(Iterator<E> it) {
        return (E) j2.f66918c.max(it);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E max(Iterable<E> iterable) {
        return (E) j2.f66918c.min(iterable);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E extends Comparable> E min(Iterable<E> iterable) {
        return (E) j2.f66918c.max(iterable);
    }
}
