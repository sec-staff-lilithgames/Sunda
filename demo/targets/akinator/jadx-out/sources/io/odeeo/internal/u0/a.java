package io.odeeo.internal.u0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a<E> extends r3<E> {

    /* renamed from: a, reason: collision with root package name */
    public final int f66519a;

    /* renamed from: b, reason: collision with root package name */
    public int f66520b;

    public a(int i10) {
        this(i10, 0);
    }

    public abstract E get(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f66520b < this.f66519a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f66520b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f66520b;
        this.f66520b = i10 + 1;
        return get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f66520b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f66520b - 1;
        this.f66520b = i10;
        return get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f66520b - 1;
    }

    public a(int i10, int i11) {
        io.odeeo.internal.t0.u.checkPositionIndex(i11, i10);
        this.f66519a = i10;
        this.f66520b = i11;
    }
}
