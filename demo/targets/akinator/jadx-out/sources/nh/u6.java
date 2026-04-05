package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u6 extends l6 implements NavigableSet, qg {

    /* renamed from: e, reason: collision with root package name */
    public final transient Comparator f76685e;

    /* renamed from: f, reason: collision with root package name */
    public transient u6 f76686f;

    public u6(Comparator comparator) {
        this.f76685e = comparator;
    }

    @Deprecated
    public static <E> t6 builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> t6 builderWithExpectedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    public static <E extends Comparable<? super E>> u6 copyOf(E[] eArr) {
        return j(we.natural(), eArr.length, (Comparable[]) eArr.clone());
    }

    public static <E> u6 copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparator = rg.comparator(sortedSet);
        b5 b5VarCopyOf = b5.copyOf((Collection) sortedSet);
        return b5VarCopyOf.isEmpty() ? n(comparator) : new pf(b5VarCopyOf, comparator);
    }

    public static pf j(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return n(comparator);
        }
        pe.a(i10, objArr);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new pf(b5.f(i11, objArr), comparator);
    }

    public static pf n(Comparator comparator) {
        return we.natural().equals(comparator) ? pf.f76567h : new pf(b5.of(), comparator);
    }

    public static <E extends Comparable<?>> t6 naturalOrder() {
        return new t6(we.natural());
    }

    public static <E> u6 of() {
        return pf.f76567h;
    }

    public static <E> t6 orderedBy(Comparator<E> comparator) {
        return new t6(comparator);
    }

    public static <E extends Comparable<?>> t6 reverseOrder() {
        return new t6(Collections.reverseOrder());
    }

    @Deprecated
    public static <E> Collector<E, ?, l6> toImmutableSet() {
        throw new UnsupportedOperationException();
    }

    public static <E> Collector<E, ?, u6> toImmutableSortedSet(Comparator<? super E> comparator) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(comparator);
        return Collector.of(new d1(comparator, 0), new x0(3), new y0(7), new w0(9), new Collector.Characteristics[0]);
    }

    public Object ceiling(Object obj) {
        return i7.getFirst(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, nh.qg
    public Comparator<Object> comparator() {
        return this.f76685e;
    }

    @Override // java.util.NavigableSet
    public abstract ej descendingIterator();

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return z7.getNext(headSet(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return i7.getFirst(tailSet(obj, false), null);
    }

    @Override // nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract ej iterator();

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return z7.getNext(headSet(obj, false).descendingIterator(), null);
    }

    public abstract u6 m();

    public abstract u6 o(Object obj, boolean z10);

    public abstract u6 p(Object obj, boolean z10, Object obj2, boolean z11);

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract u6 q(Object obj, boolean z10);

    public static <E> u6 copyOf(Iterable<? extends E> iterable) {
        return copyOf(we.natural(), iterable);
    }

    public static <E extends Comparable<? super E>> u6 of(E e10) {
        return new pf(b5.of(e10), we.natural());
    }

    @Override // java.util.NavigableSet
    public u6 descendingSet() {
        u6 u6Var = this.f76686f;
        if (u6Var != null) {
            return u6Var;
        }
        u6 u6VarM = m();
        this.f76686f = u6VarM;
        u6VarM.f76686f = this;
        return u6VarM;
    }

    public static <E extends Comparable<? super E>> u6 of(E e10, E e11) {
        return j(we.natural(), 2, e10, e11);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public u6 headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public u6 subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public u6 tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public static <E> u6 copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) we.natural(), (Collection) collection);
    }

    public static <E extends Comparable<? super E>> u6 of(E e10, E e11, E e12) {
        return j(we.natural(), 3, e10, e11, e12);
    }

    @Override // java.util.NavigableSet
    public u6 headSet(Object obj, boolean z10) {
        return o(mh.p1.checkNotNull(obj), z10);
    }

    @Override // java.util.NavigableSet
    public u6 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        mh.p1.checkNotNull(obj);
        mh.p1.checkNotNull(obj2);
        mh.p1.checkArgument(this.f76685e.compare(obj, obj2) <= 0);
        return p(obj, z10, obj2, z11);
    }

    @Override // java.util.NavigableSet
    public u6 tailSet(Object obj, boolean z10) {
        return q(mh.p1.checkNotNull(obj), z10);
    }

    public static <E extends Comparable<? super E>> u6 of(E e10, E e11, E e12, E e13) {
        return j(we.natural(), 4, e10, e11, e12, e13);
    }

    public static <E> u6 copyOf(Iterator<? extends E> it) {
        return copyOf(we.natural(), it);
    }

    public static <E extends Comparable<? super E>> u6 of(E e10, E e11, E e12, E e13, E e14) {
        return j(we.natural(), 5, e10, e11, e12, e13, e14);
    }

    public static <E extends Comparable<? super E>> u6 of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e10;
        comparableArr[1] = e11;
        comparableArr[2] = e12;
        comparableArr[3] = e13;
        comparableArr[4] = e14;
        comparableArr[5] = e15;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return j(we.natural(), length, comparableArr);
    }

    public static <E> u6 copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new t6(comparator).addAll((Iterator<Object>) it).build();
    }

    public static <E> u6 copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collectionNewArrayList;
        mh.p1.checkNotNull(comparator);
        if (rg.hasSameComparator(comparator, iterable) && (iterable instanceof u6)) {
            u6 u6Var = (u6) iterable;
            if (!u6Var.isPartialView()) {
                return u6Var;
            }
        }
        if (iterable instanceof Collection) {
            collectionNewArrayList = (Collection) iterable;
        } else {
            collectionNewArrayList = p8.newArrayList(iterable.iterator());
        }
        Object[] array = collectionNewArrayList.toArray();
        return j(comparator, array.length, array);
    }

    @Deprecated
    public static <E> u6 of(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> u6 of(E e10, E e11) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> u6 of(E e10, E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    public static <E> u6 copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    @Deprecated
    public static <E> u6 of(E e10, E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <Z> u6 copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> u6 of(E e10, E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> u6 of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
