package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b5 extends u4 implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final y4 f76121c = new y4(0, ff.f76271g);

    public static <E> x4 builder() {
        return new x4();
    }

    public static <E> x4 builderWithExpectedSize(int i10) {
        jh.i.o(i10, "expectedSize");
        return new x4(i10);
    }

    public static <E> b5 copyOf(Iterable<? extends E> iterable) {
        mh.p1.checkNotNull(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    public static b5 f(int i10, Object[] objArr) {
        return i10 == 0 ? of() : new ff(objArr, i10);
    }

    public static <E> b5 of() {
        return ff.f76271g;
    }

    public static <E extends Comparable<? super E>> b5 sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) (iterable instanceof Collection ? (Collection) iterable : p8.newArrayList(iterable.iterator())).toArray(new Comparable[0]);
        pe.a(comparableArr.length, comparableArr);
        Arrays.sort(comparableArr);
        return f(comparableArr.length, comparableArr);
    }

    public static <E> Collector<E, ?, b5> toImmutableList() {
        return i1.f76343a;
    }

    @Override // nh.u4
    public int a(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == mh.p1.checkNotNull(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(list instanceof RandomAccess)) {
                    return z7.elementsEqual(iterator(), list.iterator());
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (Objects.equals(get(i10), list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    public b5 reverse() {
        return size() <= 1 ? this : new z4(this);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <E> b5 of(E e10) {
        Object[] objArr = {e10};
        pe.a(1, objArr);
        return f(1, objArr);
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public b5 subList(int i10, int i11) {
        mh.p1.checkPositionIndexes(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? of() : new a5(this, i10, i12);
    }

    @Override // java.util.List
    public fj listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public fj listIterator(int i10) {
        mh.p1.checkPositionIndex(i10, size());
        if (isEmpty()) {
            return f76121c;
        }
        return new y4(i10, this);
    }

    public static <E> b5 copyOf(Collection<? extends E> collection) {
        if (collection instanceof u4) {
            b5 b5VarAsList = ((u4) collection).asList();
            if (!b5VarAsList.isPartialView()) {
                return b5VarAsList;
            }
            Object[] array = b5VarAsList.toArray();
            return f(array.length, array);
        }
        Object[] array2 = collection.toArray();
        pe.a(array2.length, array2);
        return f(array2.length, array2);
    }

    public static <E> b5 of(E e10, E e11) {
        Object[] objArr = {e10, e11};
        pe.a(2, objArr);
        return f(2, objArr);
    }

    public static <E> b5 of(E e10, E e11, E e12) {
        Object[] objArr = {e10, e11, e12};
        pe.a(3, objArr);
        return f(3, objArr);
    }

    public static <E> b5 sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collectionNewArrayList;
        mh.p1.checkNotNull(comparator);
        if (iterable instanceof Collection) {
            collectionNewArrayList = (Collection) iterable;
        } else {
            collectionNewArrayList = p8.newArrayList(iterable.iterator());
        }
        Object[] array = collectionNewArrayList.toArray();
        pe.a(array.length, array);
        Arrays.sort(array, comparator);
        return f(array.length, array);
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13) {
        Object[] objArr = {e10, e11, e12, e13};
        pe.a(4, objArr);
        return f(4, objArr);
    }

    public static <E> b5 copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new x4().add((Object) next).addAll((Iterator<Object>) it).build();
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14) {
        Object[] objArr = {e10, e11, e12, e13, e14};
        pe.a(5, objArr);
        return f(5, objArr);
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14, E e15) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15};
        pe.a(6, objArr);
        return f(6, objArr);
    }

    public static <E> b5 copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        Object[] objArr = (Object[]) eArr.clone();
        pe.a(objArr.length, objArr);
        return f(objArr.length, objArr);
    }

    @Override // nh.u4
    @Deprecated
    public final b5 asList() {
        return this;
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15, e16};
        pe.a(7, objArr);
        return f(7, objArr);
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15, e16, e17};
        pe.a(8, objArr);
        return f(8, objArr);
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15, e16, e17, e18};
        pe.a(9, objArr);
        return f(9, objArr);
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15, e16, e17, e18, e19};
        pe.a(10, objArr);
        return f(10, objArr);
    }

    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20};
        pe.a(11, objArr);
        return f(11, objArr);
    }

    @SafeVarargs
    public static <E> b5 of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        mh.p1.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = eArr.length + 12;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        pe.a(length, objArr);
        return f(length, objArr);
    }
}
