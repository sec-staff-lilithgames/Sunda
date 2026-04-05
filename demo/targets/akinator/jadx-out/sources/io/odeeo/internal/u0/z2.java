package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z2<E> extends s1<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final z2<Comparable> f67222f = new z2<>(h1.of(), p2.natural());

    /* renamed from: e, reason: collision with root package name */
    public final transient h1<E> f67223e;

    public z2(h1<E> h1Var, Comparator<? super E> comparator) {
        super(comparator);
        this.f67223e = h1Var;
    }

    @Override // io.odeeo.internal.u0.d1
    public Object[] a() {
        return this.f67223e.a();
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1
    public h1<E> asList() {
        return this.f67223e;
    }

    @Override // io.odeeo.internal.u0.d1
    public int b() {
        return this.f67223e.b();
    }

    @Override // io.odeeo.internal.u0.d1
    public int c() {
        return this.f67223e.c();
    }

    @Override // io.odeeo.internal.u0.s1, java.util.NavigableSet
    public E ceiling(E e10) {
        int iD = d(e10, true);
        if (iD == size()) {
            return null;
        }
        return this.f67223e.get(iD);
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (a(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof h2) {
            collection = ((h2) collection).elementSet();
        }
        if (!h3.hasSameComparator(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        q3<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iA = a(next2, next);
                if (iA < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iA == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iA > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int d(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f67223e, io.odeeo.internal.t0.u.checkNotNull(e10), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // io.odeeo.internal.u0.q1, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!h3.hasSameComparator(this.f67051c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            q3<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || a(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // io.odeeo.internal.u0.s1
    public s1<E> f() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f67051c);
        return isEmpty() ? s1.a(comparatorReverseOrder) : new z2(this.f67223e.reverse(), comparatorReverseOrder);
    }

    @Override // io.odeeo.internal.u0.s1, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f67223e.get(0);
    }

    @Override // io.odeeo.internal.u0.s1, java.util.NavigableSet
    public E floor(E e10) {
        int iC = c((z2<E>) e10, true) - 1;
        if (iC == -1) {
            return null;
        }
        return this.f67223e.get(iC);
    }

    public Comparator<Object> g() {
        return this.f67051c;
    }

    @Override // io.odeeo.internal.u0.s1, java.util.NavigableSet
    public E higher(E e10) {
        int iD = d(e10, false);
        if (iD == size()) {
            return null;
        }
        return this.f67223e.get(iD);
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return this.f67223e.isPartialView();
    }

    @Override // io.odeeo.internal.u0.s1, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f67223e.get(size() - 1);
    }

    @Override // io.odeeo.internal.u0.s1, java.util.NavigableSet
    public E lower(E e10) {
        int iC = c((z2<E>) e10, false) - 1;
        if (iC == -1) {
            return null;
        }
        return this.f67223e.get(iC);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f67223e.size();
    }

    public final int a(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f67223e, obj, g());
    }

    @Override // io.odeeo.internal.u0.s1
    public s1<E> b(E e10, boolean z10) {
        return c(d(e10, z10), size());
    }

    public int c(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f67223e, io.odeeo.internal.t0.u.checkNotNull(e10), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // io.odeeo.internal.u0.s1, java.util.NavigableSet
    public q3<E> descendingIterator() {
        return this.f67223e.reverse().iterator();
    }

    @Override // io.odeeo.internal.u0.s1, io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<E> iterator() {
        return this.f67223e.iterator();
    }

    @Override // io.odeeo.internal.u0.d1
    public int a(Object[] objArr, int i10) {
        return this.f67223e.a(objArr, i10);
    }

    public z2<E> c(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        if (i10 < i11) {
            return new z2<>(this.f67223e.subList(i10, i11), this.f67051c);
        }
        return s1.a(this.f67051c);
    }

    @Override // io.odeeo.internal.u0.s1
    public s1<E> a(E e10, boolean z10) {
        return c(0, c((z2<E>) e10, z10));
    }

    @Override // io.odeeo.internal.u0.s1
    public s1<E> a(E e10, boolean z10, E e11, boolean z11) {
        return b((z2<E>) e10, z10).a((s1<E>) e11, z11);
    }
}
