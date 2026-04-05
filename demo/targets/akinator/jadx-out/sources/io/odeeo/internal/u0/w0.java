package io.odeeo.internal.u0;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class w0<E> extends a1<E> implements NavigableSet<E> {
    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        return delegate().ceiling(e10);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    @Override // io.odeeo.internal.u0.a1, io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract NavigableSet<E> delegate();

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return delegate().floor(e10);
    }

    public NavigableSet<E> headSet(E e10, boolean z10) {
        return delegate().headSet(e10, z10);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        return delegate().higher(e10);
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        return delegate().lower(e10);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return delegate().pollLast();
    }

    public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        return delegate().subSet(e10, z10, e11, z11);
    }

    public NavigableSet<E> tailSet(E e10, boolean z10) {
        return delegate().tailSet(e10, z10);
    }
}
