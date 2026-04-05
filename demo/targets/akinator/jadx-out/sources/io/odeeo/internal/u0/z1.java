package io.odeeo.internal.u0;

import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends AbstractList<Character> {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f67203a;

        public a(CharSequence charSequence) {
            this.f67203a = charSequence;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67203a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, size());
            return Character.valueOf(this.f67203a.charAt(i10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final E f67204a;

        /* renamed from: b, reason: collision with root package name */
        public final E[] f67205b;

        public b(E e10, E[] eArr) {
            this.f67204a = e10;
            this.f67205b = (E[]) ((Object[]) io.odeeo.internal.t0.u.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, size());
            return i10 == 0 ? this.f67204a : this.f67205b[i10 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return io.odeeo.internal.v0.a.saturatedAdd(this.f67205b.length, 1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<T> extends AbstractList<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final List<T> f67206a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67207b;

        public c(List<T> list, int i10) {
            this.f67206a = list;
            this.f67207b = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f67206a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return io.odeeo.internal.v0.a.divide(this.f67206a.size(), this.f67207b, RoundingMode.CEILING);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, size());
            int i11 = this.f67207b;
            int i12 = i10 * i11;
            return this.f67206a.subList(i12, Math.min(i11 + i12, this.f67206a.size()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<T> extends c<T> implements RandomAccess {
        public d(List<T> list, int i10) {
            super(list, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<T> extends f<T> implements RandomAccess {
        public e(List<T> list) {
            super(list);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f<T> extends AbstractList<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<T> f67208a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements ListIterator<T> {

            /* renamed from: a, reason: collision with root package name */
            public boolean f67209a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListIterator f67210b;

            public a(ListIterator listIterator) {
                this.f67210b = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(T t10) {
                this.f67210b.add(t10);
                this.f67210b.previous();
                this.f67209a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f67210b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f67210b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f67209a = true;
                return (T) this.f67210b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return f.this.b(this.f67210b.nextIndex());
            }

            @Override // java.util.ListIterator
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f67209a = true;
                return (T) this.f67210b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                r.a(this.f67209a);
                this.f67210b.remove();
                this.f67209a = false;
            }

            @Override // java.util.ListIterator
            public void set(T t10) {
                io.odeeo.internal.t0.u.checkState(this.f67209a);
                this.f67210b.set(t10);
            }
        }

        public f(List<T> list) {
            this.f67208a = (List) io.odeeo.internal.t0.u.checkNotNull(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int b(int i10) {
            int size = size();
            io.odeeo.internal.t0.u.checkPositionIndex(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, T t10) {
            this.f67208a.add(b(i10), t10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f67208a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f67208a.get(a(i10));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f67208a.listIterator(b(i10)));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f67208a.remove(a(i10));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i10, T t10) {
            return this.f67208a.set(a(i10), t10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67208a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i10, int i11) {
            io.odeeo.internal.t0.u.checkPositionIndexes(i10, i11, size());
            return z1.reverse(this.f67208a.subList(b(i11), b(i10)));
        }

        public List<T> a() {
            return this.f67208a;
        }

        private int a(int i10) {
            int size = size();
            io.odeeo.internal.t0.u.checkElementIndex(i10, size);
            return (size - 1) - i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends h1<Character> {

        /* renamed from: c, reason: collision with root package name */
        public final String f67212c;

        public g(String str) {
            this.f67212c = str;
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f67212c.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return false;
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f67212c.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67212c.length();
        }

        @Override // java.util.List
        public Character get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, size());
            return Character.valueOf(this.f67212c.charAt(i10));
        }

        @Override // io.odeeo.internal.u0.h1, java.util.List
        public h1<Character> subList(int i10, int i11) {
            io.odeeo.internal.t0.u.checkPositionIndexes(i10, i11, size());
            return z1.charactersOf(this.f67212c.substring(i10, i11));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<F> f67213a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.t0.k<? super F, ? extends T> f67214b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends p3<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // io.odeeo.internal.u0.o3
            public T a(F f10) {
                return h.this.f67214b.apply(f10);
            }
        }

        public h(List<F> list, io.odeeo.internal.t0.k<? super F, ? extends T> kVar) {
            this.f67213a = (List) io.odeeo.internal.t0.u.checkNotNull(list);
            this.f67214b = (io.odeeo.internal.t0.k) io.odeeo.internal.t0.u.checkNotNull(kVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f67213a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f67214b.apply(this.f67213a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f67213a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f67213a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f67214b.apply(this.f67213a.remove(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67213a.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<F> f67216a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.t0.k<? super F, ? extends T> f67217b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends p3<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // io.odeeo.internal.u0.o3
            public T a(F f10) {
                return i.this.f67217b.apply(f10);
            }
        }

        public i(List<F> list, io.odeeo.internal.t0.k<? super F, ? extends T> kVar) {
            this.f67216a = (List) io.odeeo.internal.t0.u.checkNotNull(list);
            this.f67217b = (io.odeeo.internal.t0.k) io.odeeo.internal.t0.u.checkNotNull(kVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f67216a.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f67216a.listIterator(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67216a.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final E f67219a;

        /* renamed from: b, reason: collision with root package name */
        public final E f67220b;

        /* renamed from: c, reason: collision with root package name */
        public final E[] f67221c;

        public j(E e10, E e11, E[] eArr) {
            this.f67219a = e10;
            this.f67220b = e11;
            this.f67221c = (E[]) ((Object[]) io.odeeo.internal.t0.u.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            if (i10 == 0) {
                return this.f67219a;
            }
            if (i10 == 1) {
                return this.f67220b;
            }
            io.odeeo.internal.t0.u.checkElementIndex(i10, size());
            return this.f67221c[i10 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return io.odeeo.internal.v0.a.saturatedAdd(this.f67221c.length, 2);
        }
    }

    public static int a(int i10) {
        r.a(i10, "arraySize");
        return io.odeeo.internal.w0.d.saturatedCast(i10 + 5 + (i10 / 10));
    }

    public static <E> List<E> asList(E e10, E[] eArr) {
        return new b(e10, eArr);
    }

    public static int b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return c(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (io.odeeo.internal.t0.p.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int c(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return q.a(list);
    }

    public static h1<Character> charactersOf(String str) {
        return new g((String) io.odeeo.internal.t0.u.checkNotNull(str));
    }

    public static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (io.odeeo.internal.t0.p.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> newArrayListWithCapacity(int i10) {
        r.a(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i10) {
        return new ArrayList<>(a(i10));
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(list);
        io.odeeo.internal.t0.u.checkArgument(i10 > 0);
        return list instanceof RandomAccess ? new d(list, i10) : new c(list, i10);
    }

    public static <T> List<T> reverse(List<T> list) {
        return list instanceof h1 ? ((h1) list).reverse() : list instanceof f ? ((f) list).a() : list instanceof RandomAccess ? new e(list) : new f(list);
    }

    public static <F, T> List<T> transform(List<F> list, io.odeeo.internal.t0.k<? super F, ? extends T> kVar) {
        return list instanceof RandomAccess ? new h(list, kVar) : new i(list, kVar);
    }

    public static <E> List<E> asList(E e10, E e11, E[] eArr) {
        return new j(e10, e11, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new a((CharSequence) io.odeeo.internal.t0.u.checkNotNull(charSequence));
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        io.odeeo.internal.t0.u.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? s.a(iterable) : newArrayList(iterable));
    }

    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListNewLinkedList = newLinkedList();
        v1.addAll(linkedListNewLinkedList, iterable);
        return linkedListNewLinkedList;
    }

    public static boolean a(List<?> list, Object obj) {
        if (obj == io.odeeo.internal.t0.u.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return w1.elementsEqual(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!io.odeeo.internal.t0.p.equal(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>(s.a(iterable));
        }
        return newArrayList(iterable.iterator());
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        w1.addAll(arrayListNewArrayList, it);
        return arrayListNewArrayList;
    }

    public static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }
}
