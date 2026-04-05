package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends p2<Object> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final l f66924a = new l();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f66924a;
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return 0;
    }

    @Override // io.odeeo.internal.u0.p2
    public <E> h1<E> immutableSortedCopy(Iterable<E> iterable) {
        return h1.copyOf(iterable);
    }

    @Override // io.odeeo.internal.u0.p2
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return z1.newArrayList(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }

    @Override // io.odeeo.internal.u0.p2
    public <S> p2<S> reverse() {
        return this;
    }
}
