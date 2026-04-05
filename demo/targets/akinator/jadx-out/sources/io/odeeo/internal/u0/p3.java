package io.odeeo.internal.u0;

import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class p3<F, T> extends o3<F, T> implements ListIterator<T> {
    public p3(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final ListIterator<? extends F> a() {
        return w1.a(this.f67017a);
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return a().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return a(a().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return a().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        throw new UnsupportedOperationException();
    }
}
