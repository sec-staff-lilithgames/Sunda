package io.odeeo.internal.u0;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a1<E> extends y0<E> implements SortedSet<E> {
    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet<E> delegate();

    @Override // java.util.SortedSet
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e10) {
        return delegate().headSet(e10);
    }

    @Override // java.util.SortedSet
    public E last() {
        return delegate().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e10, E e11) {
        return delegate().subSet(e10, e11);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e10) {
        return delegate().tailSet(e10);
    }
}
