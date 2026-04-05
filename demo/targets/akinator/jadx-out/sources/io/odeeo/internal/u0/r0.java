package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class r0<E> extends p0<E> implements List<E> {
    public void add(int i10, E e10) {
        delegate().add(i10, e10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        return delegate().addAll(i10, collection);
    }

    @Override // io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract List<E> delegate();

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return delegate().get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return delegate().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return delegate().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override // java.util.List
    public E remove(int i10) {
        return delegate().remove(i10);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return delegate().set(i10, e10);
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return delegate().subList(i10, i11);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return delegate().listIterator(i10);
    }
}
