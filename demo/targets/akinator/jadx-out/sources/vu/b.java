package vu;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.f0;
import uu.o;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends o implements List, RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final b f89612f;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f89613b;

    /* renamed from: c, reason: collision with root package name */
    public int f89614c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89615e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends o implements List, RandomAccess, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public Object[] f89616b;

        /* renamed from: c, reason: collision with root package name */
        public final int f89617c;

        /* renamed from: e, reason: collision with root package name */
        public int f89618e;

        /* renamed from: f, reason: collision with root package name */
        public final a f89619f;

        /* renamed from: g, reason: collision with root package name */
        public final b f89620g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: vu.b$a$a, reason: collision with other inner class name */
        public static final class C0803a implements ListIterator, lv.e {

            /* renamed from: b, reason: collision with root package name */
            public final a f89621b;

            /* renamed from: c, reason: collision with root package name */
            public int f89622c;

            /* renamed from: e, reason: collision with root package name */
            public int f89623e;

            /* renamed from: f, reason: collision with root package name */
            public int f89624f;

            public C0803a(a list, int i10) {
                e0.checkNotNullParameter(list, "list");
                this.f89621b = list;
                this.f89622c = i10;
                this.f89623e = -1;
                this.f89624f = ((AbstractList) list).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f89621b.f89620g).modCount != this.f89624f) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                int i10 = this.f89622c;
                this.f89622c = i10 + 1;
                a aVar = this.f89621b;
                aVar.add(i10, obj);
                this.f89623e = -1;
                this.f89624f = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f89622c < this.f89621b.f89618e;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f89622c > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                int i10 = this.f89622c;
                a aVar = this.f89621b;
                if (i10 >= aVar.f89618e) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f89622c;
                this.f89622c = i11 + 1;
                this.f89623e = i11;
                return aVar.f89616b[aVar.f89617c + this.f89623e];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f89622c;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f89622c;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f89622c = i11;
                this.f89623e = i11;
                a aVar = this.f89621b;
                return aVar.f89616b[aVar.f89617c + this.f89623e];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f89622c - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f89623e;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                a aVar = this.f89621b;
                aVar.removeAt(i10);
                this.f89622c = this.f89623e;
                this.f89623e = -1;
                this.f89624f = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f89623e;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f89621b.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, b root) {
            e0.checkNotNullParameter(backing, "backing");
            e0.checkNotNullParameter(root, "root");
            this.f89616b = backing;
            this.f89617c = i10;
            this.f89618e = i11;
            this.f89619f = aVar;
            this.f89620g = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        public final void a(int i10, Collection collection, int i11) {
            ((AbstractList) this).modCount++;
            b bVar = this.f89620g;
            a aVar = this.f89619f;
            if (aVar != null) {
                aVar.a(i10, collection, i11);
            } else {
                bVar.a(i10, collection, i11);
            }
            this.f89616b = bVar.f89613b;
            this.f89618e += i11;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            d();
            c();
            b(this.f89617c + this.f89618e, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<Object> elements) {
            e0.checkNotNullParameter(elements, "elements");
            d();
            c();
            int size = elements.size();
            a(this.f89617c + this.f89618e, elements, size);
            return size > 0;
        }

        public final void b(int i10, Object obj) {
            ((AbstractList) this).modCount++;
            b bVar = this.f89620g;
            a aVar = this.f89619f;
            if (aVar != null) {
                aVar.b(i10, obj);
            } else {
                b.access$addAtInternal(bVar, i10, obj);
            }
            this.f89616b = bVar.f89613b;
            this.f89618e++;
        }

        public final void c() {
            if (((AbstractList) this.f89620g).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            d();
            c();
            f(this.f89617c, this.f89618e);
        }

        public final void d() {
            if (this.f89620g.f89615e) {
                throw new UnsupportedOperationException();
            }
        }

        public final Object e(int i10) {
            ((AbstractList) this).modCount++;
            a aVar = this.f89619f;
            this.f89618e--;
            return aVar != null ? aVar.e(i10) : this.f89620g.e(i10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            c();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                return vu.c.access$subarrayContentEquals(this.f89616b, this.f89617c, this.f89618e, (List) obj);
            }
            return false;
        }

        public final void f(int i10, int i11) {
            if (i11 > 0) {
                ((AbstractList) this).modCount++;
            }
            a aVar = this.f89619f;
            if (aVar != null) {
                aVar.f(i10, i11);
            } else {
                this.f89620g.f(i10, i11);
            }
            this.f89618e -= i11;
        }

        public final int g(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f89619f;
            int iG = aVar != null ? aVar.g(i10, i11, collection, z10) : this.f89620g.g(i10, i11, collection, z10);
            if (iG > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f89618e -= iG;
            return iG;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            c();
            uu.g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f89618e);
            return this.f89616b[this.f89617c + i10];
        }

        @Override // uu.o
        public int getSize() {
            c();
            return this.f89618e;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            c();
            return vu.c.access$subarrayContentHashCode(this.f89616b, this.f89617c, this.f89618e);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            c();
            for (int i10 = 0; i10 < this.f89618e; i10++) {
                if (e0.areEqual(this.f89616b[this.f89617c + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            c();
            return this.f89618e == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<Object> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            c();
            for (int i10 = this.f89618e - 1; i10 >= 0; i10--) {
                if (e0.areEqual(this.f89616b[this.f89617c + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            d();
            c();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> elements) {
            e0.checkNotNullParameter(elements, "elements");
            d();
            c();
            return g(this.f89617c, this.f89618e, elements, false) > 0;
        }

        @Override // uu.o
        public Object removeAt(int i10) {
            d();
            c();
            uu.g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f89618e);
            return e(this.f89617c + i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> elements) {
            e0.checkNotNullParameter(elements, "elements");
            d();
            c();
            return g(this.f89617c, this.f89618e, elements, true) > 0;
        }

        @Override // uu.o, java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            d();
            c();
            uu.g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f89618e);
            Object[] objArr = this.f89616b;
            int i11 = this.f89617c;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Object> subList(int i10, int i11) {
            uu.g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, this.f89618e);
            return new a(this.f89616b, this.f89617c + i10, i11 - i10, this, this.f89620g);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            e0.checkNotNullParameter(array, "array");
            c();
            int length = array.length;
            int i10 = this.f89618e;
            int i11 = this.f89617c;
            if (length >= i10) {
                f0.copyInto(this.f89616b, array, 0, i11, i10 + i11);
                return (T[]) o0.terminateCollectionToArray(this.f89618e, array);
            }
            T[] tArr = (T[]) Arrays.copyOfRange(this.f89616b, i11, i10 + i11, array.getClass());
            e0.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            c();
            return vu.c.access$subarrayContentToString(this.f89616b, this.f89617c, this.f89618e, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i10) {
            c();
            uu.g.Companion.checkPositionIndex$kotlin_stdlib(i10, this.f89618e);
            return new C0803a(this, i10);
        }

        @Override // uu.o, java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            d();
            c();
            uu.g.Companion.checkPositionIndex$kotlin_stdlib(i10, this.f89618e);
            b(this.f89617c + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection<Object> elements) {
            e0.checkNotNullParameter(elements, "elements");
            d();
            c();
            uu.g.Companion.checkPositionIndex$kotlin_stdlib(i10, this.f89618e);
            int size = elements.size();
            a(this.f89617c + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            c();
            Object[] objArr = this.f89616b;
            int i10 = this.f89618e;
            int i11 = this.f89617c;
            return f0.copyOfRange(objArr, i11, i10 + i11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: vu.b$b, reason: collision with other inner class name */
    public static final class C0804b {
        public C0804b(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements ListIterator, lv.e {

        /* renamed from: b, reason: collision with root package name */
        public final b f89625b;

        /* renamed from: c, reason: collision with root package name */
        public int f89626c;

        /* renamed from: e, reason: collision with root package name */
        public int f89627e;

        /* renamed from: f, reason: collision with root package name */
        public int f89628f;

        public c(b list, int i10) {
            e0.checkNotNullParameter(list, "list");
            this.f89625b = list;
            this.f89626c = i10;
            this.f89627e = -1;
            this.f89628f = ((AbstractList) list).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f89625b).modCount != this.f89628f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            int i10 = this.f89626c;
            this.f89626c = i10 + 1;
            b bVar = this.f89625b;
            bVar.add(i10, obj);
            this.f89627e = -1;
            this.f89628f = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f89626c < this.f89625b.f89614c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f89626c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            int i10 = this.f89626c;
            b bVar = this.f89625b;
            if (i10 >= bVar.f89614c) {
                throw new NoSuchElementException();
            }
            int i11 = this.f89626c;
            this.f89626c = i11 + 1;
            this.f89627e = i11;
            return bVar.f89613b[this.f89627e];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f89626c;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f89626c;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f89626c = i11;
            this.f89627e = i11;
            return this.f89625b.f89613b[this.f89627e];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f89626c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f89627e;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            b bVar = this.f89625b;
            bVar.removeAt(i10);
            this.f89626c = this.f89627e;
            this.f89627e = -1;
            this.f89628f = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f89627e;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f89625b.set(i10, obj);
        }
    }

    static {
        new C0804b(null);
        b bVar = new b(0);
        bVar.f89615e = true;
        f89612f = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    public static final void access$addAtInternal(b bVar, int i10, Object obj) {
        ((AbstractList) bVar).modCount++;
        bVar.d(i10, 1);
        bVar.f89613b[i10] = obj;
    }

    public final void a(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        d(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f89613b[i10 + i12] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i10 = this.f89614c;
        ((AbstractList) this).modCount++;
        d(i10, 1);
        this.f89613b[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        c();
        int size = elements.size();
        a(this.f89614c, elements, size);
        return size > 0;
    }

    public final List<Object> build() {
        c();
        this.f89615e = true;
        return this.f89614c > 0 ? this : f89612f;
    }

    public final void c() {
        if (this.f89615e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        f(0, this.f89614c);
    }

    public final void d(int i10, int i11) {
        int i12 = this.f89614c + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f89613b;
        if (i12 > objArr.length) {
            this.f89613b = vu.c.copyOfUninitializedElements(this.f89613b, uu.g.Companion.newCapacity$kotlin_stdlib(objArr.length, i12));
        }
        Object[] objArr2 = this.f89613b;
        f0.copyInto(objArr2, objArr2, i10 + i11, i10, this.f89614c);
        this.f89614c += i11;
    }

    public final Object e(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f89613b;
        Object obj = objArr[i10];
        f0.copyInto(objArr, objArr, i10, i10 + 1, this.f89614c);
        vu.c.resetAt(this.f89613b, this.f89614c - 1);
        this.f89614c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (vu.c.access$subarrayContentEquals(this.f89613b, 0, this.f89614c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f89613b;
        f0.copyInto(objArr, objArr, i10, i10 + i11, this.f89614c);
        Object[] objArr2 = this.f89613b;
        int i12 = this.f89614c;
        vu.c.resetRange(objArr2, i12 - i11, i12);
        this.f89614c -= i11;
    }

    public final int g(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f89613b[i14]) == z10) {
                Object[] objArr = this.f89613b;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f89613b;
        f0.copyInto(objArr2, objArr2, i10 + i13, i11 + i10, this.f89614c);
        Object[] objArr3 = this.f89613b;
        int i16 = this.f89614c;
        vu.c.resetRange(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f89614c -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        uu.g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f89614c);
        return this.f89613b[i10];
    }

    @Override // uu.o
    public int getSize() {
        return this.f89614c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return vu.c.access$subarrayContentHashCode(this.f89613b, 0, this.f89614c);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f89614c; i10++) {
            if (e0.areEqual(this.f89613b[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f89614c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f89614c - 1; i10 >= 0; i10--) {
            if (e0.areEqual(this.f89613b[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        c();
        return g(0, this.f89614c, elements, false) > 0;
    }

    @Override // uu.o
    public Object removeAt(int i10) {
        c();
        uu.g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f89614c);
        return e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        c();
        return g(0, this.f89614c, elements, true) > 0;
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        c();
        uu.g.Companion.checkElementIndex$kotlin_stdlib(i10, this.f89614c);
        Object[] objArr = this.f89613b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Object> subList(int i10, int i11) {
        uu.g.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, this.f89614c);
        return new a(this.f89613b, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        e0.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.f89614c;
        if (length >= i10) {
            f0.copyInto(this.f89613b, array, 0, 0, i10);
            return (T[]) o0.terminateCollectionToArray(this.f89614c, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.f89613b, 0, i10, array.getClass());
        e0.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return vu.c.access$subarrayContentToString(this.f89613b, 0, this.f89614c, this);
    }

    public /* synthetic */ b(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        uu.g.Companion.checkPositionIndex$kotlin_stdlib(i10, this.f89614c);
        return new c(this, i10);
    }

    public b(int i10) {
        this.f89613b = vu.c.arrayOfUninitializedElements(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        c();
        uu.g.Companion.checkPositionIndex$kotlin_stdlib(i10, this.f89614c);
        int size = elements.size();
        a(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return f0.copyOfRange(this.f89613b, 0, this.f89614c);
    }

    @Override // uu.o, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        c();
        uu.g.Companion.checkPositionIndex$kotlin_stdlib(i10, this.f89614c);
        ((AbstractList) this).modCount++;
        d(i10, 1);
        this.f89613b[i10] = obj;
    }
}
