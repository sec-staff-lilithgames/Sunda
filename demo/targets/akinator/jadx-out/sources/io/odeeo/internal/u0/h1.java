package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h1<E> extends d1<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final r3<Object> f66850b = new b(v2.f67128e, 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<E> extends d1.a<E> {
        public a() {
            this(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ d1.a add(Object obj) {
            return add((a<E>) obj);
        }

        public a(int i10) {
            super(i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ d1.b add(Object obj) {
            return add((a<E>) obj);
        }

        @Override // io.odeeo.internal.u0.d1.b
        public h1<E> build() {
            this.f66651c = true;
            return h1.b(this.f66649a, this.f66650b);
        }

        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> add(E e10) {
            super.add((a<E>) e10);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.b
        public a<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<E> extends io.odeeo.internal.u0.a<E> {

        /* renamed from: c, reason: collision with root package name */
        public final h1<E> f66851c;

        public b(h1<E> h1Var, int i10) {
            super(h1Var.size(), i10);
            this.f66851c = h1Var;
        }

        @Override // io.odeeo.internal.u0.a
        public E get(int i10) {
            return this.f66851c.get(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<E> extends h1<E> {

        /* renamed from: c, reason: collision with root package name */
        public final transient h1<E> f66852c;

        public c(h1<E> h1Var) {
            this.f66852c = h1Var;
        }

        public final int a(int i10) {
            return (size() - 1) - i10;
        }

        public final int b(int i10) {
            return size() - i10;
        }

        @Override // io.odeeo.internal.u0.h1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f66852c.contains(obj);
        }

        @Override // java.util.List
        public E get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, size());
            return this.f66852c.get(a(i10));
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f66852c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return a(iLastIndexOf);
            }
            return -1;
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return this.f66852c.isPartialView();
        }

        @Override // io.odeeo.internal.u0.h1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f66852c.indexOf(obj);
            if (iIndexOf >= 0) {
                return a(iIndexOf);
            }
            return -1;
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // io.odeeo.internal.u0.h1
        public h1<E> reverse() {
            return this.f66852c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f66852c.size();
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public h1<E> subList(int i10, int i11) {
            io.odeeo.internal.t0.u.checkPositionIndexes(i10, i11, size());
            return this.f66852c.subList(b(i11), b(i10)).reverse();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f66853a;

        public d(Object[] objArr) {
            this.f66853a = objArr;
        }

        public Object readResolve() {
            return h1.copyOf(this.f66853a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends h1<E> {

        /* renamed from: c, reason: collision with root package name */
        public final transient int f66854c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f66855d;

        public e(int i10, int i11) {
            this.f66854c = i10;
            this.f66855d = i11;
        }

        @Override // io.odeeo.internal.u0.d1
        public Object[] a() {
            return h1.this.a();
        }

        @Override // io.odeeo.internal.u0.d1
        public int b() {
            return h1.this.c() + this.f66854c + this.f66855d;
        }

        @Override // io.odeeo.internal.u0.d1
        public int c() {
            return h1.this.c() + this.f66854c;
        }

        @Override // java.util.List
        public E get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, this.f66855d);
            return h1.this.get(i10 + this.f66854c);
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // io.odeeo.internal.u0.h1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f66855d;
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public h1<E> subList(int i10, int i11) {
            io.odeeo.internal.t0.u.checkPositionIndexes(i10, i11, this.f66855d);
            h1 h1Var = h1.this;
            int i12 = this.f66854c;
            return h1Var.subList(i10 + i12, i11 + i12);
        }
    }

    public static <E> h1<E> a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    public static <E> h1<E> b(Object... objArr) {
        return a(m2.a(objArr));
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static <E> a<E> builderWithExpectedSize(int i10) {
        r.a(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <E> h1<E> copyOf(Iterable<? extends E> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    public static <E> h1<E> of() {
        return (h1<E>) v2.f67128e;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> h1<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) v1.a(iterable, new Comparable[0]);
        m2.a(comparableArr);
        Arrays.sort(comparableArr);
        return a(comparableArr);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return z1.a(this, obj);
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
        return z1.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return z1.d(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    public h1<E> reverse() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new d(toArray());
    }

    public static <E> h1<E> b(Object[] objArr, int i10) {
        return i10 == 0 ? of() : new v2(objArr, i10);
    }

    public static <E> h1<E> of(E e10) {
        return b(e10);
    }

    public h1<E> a(int i10, int i11) {
        return new e(i10, i11 - i10);
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public q3<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public h1<E> subList(int i10, int i11) {
        io.odeeo.internal.t0.u.checkPositionIndexes(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? of() : a(i10, i11);
    }

    public static <E> h1<E> of(E e10, E e11) {
        return b(e10, e11);
    }

    @Override // io.odeeo.internal.u0.d1
    public int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    public r3<E> listIterator() {
        return listIterator(0);
    }

    public static <E> h1<E> of(E e10, E e11, E e12) {
        return b(e10, e11, e12);
    }

    @Override // java.util.List
    public r3<E> listIterator(int i10) {
        io.odeeo.internal.t0.u.checkPositionIndex(i10, size());
        if (isEmpty()) {
            return (r3<E>) f66850b;
        }
        return new b(this, i10);
    }

    public static <E> h1<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof d1) {
            h1<E> h1VarAsList = ((d1) collection).asList();
            return h1VarAsList.isPartialView() ? a(h1VarAsList.toArray()) : h1VarAsList;
        }
        return b(collection.toArray());
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13) {
        return b(e10, e11, e12, e13);
    }

    public static <E> h1<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(comparator);
        Object[] objArrB = v1.b(iterable);
        m2.a(objArrB);
        Arrays.sort(objArrB, comparator);
        return a(objArrB);
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14) {
        return b(e10, e11, e12, e13, e14);
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14, E e15) {
        return b(e10, e11, e12, e13, e14, e15);
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return b(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> h1<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new a().add((a) next).addAll((Iterator) it).build();
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return b(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return b(e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        return b(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }

    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20) {
        return b(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);
    }

    @SafeVarargs
    public static <E> h1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        io.odeeo.internal.t0.u.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
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
        return b(objArr);
    }

    public static <E> h1<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return b((Object[]) eArr.clone());
    }

    @Override // io.odeeo.internal.u0.d1
    public final h1<E> asList() {
        return this;
    }
}
