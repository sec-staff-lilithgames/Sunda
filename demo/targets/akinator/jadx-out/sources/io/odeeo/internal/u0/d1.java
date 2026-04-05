package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d1<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f66648a = new Object[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f66649a;

        /* renamed from: b, reason: collision with root package name */
        public int f66650b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f66651c;

        public a(int i10) {
            r.a(i10, "initialCapacity");
            this.f66649a = new Object[i10];
            this.f66650b = 0;
        }

        public final void a(int i10) {
            Object[] objArr = this.f66649a;
            if (objArr.length < i10) {
                this.f66649a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f66651c = false;
            } else if (this.f66651c) {
                this.f66649a = (Object[]) objArr.clone();
                this.f66651c = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ b add(Object obj) {
            return add((a<E>) obj);
        }

        @Override // io.odeeo.internal.u0.d1.b
        public b<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                a(collection.size() + this.f66650b);
                if (collection instanceof d1) {
                    this.f66650b = ((d1) collection).a(this.f66649a, this.f66650b);
                    return this;
                }
            }
            super.addAll(iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.b
        public a<E> add(E e10) {
            io.odeeo.internal.t0.u.checkNotNull(e10);
            a(this.f66650b + 1);
            Object[] objArr = this.f66649a;
            int i10 = this.f66650b;
            this.f66650b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.b
        public b<E> add(E... eArr) {
            m2.a(eArr);
            a(this.f66650b + eArr.length);
            System.arraycopy(eArr, 0, this.f66649a, this.f66650b, eArr.length);
            this.f66650b += eArr.length;
            return this;
        }
    }

    public Object[] a() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public h1<E> asList() {
        return isEmpty() ? h1.of() : h1.a(toArray());
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract q3<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f66648a);
    }

    public Object writeReplace() {
        return new h1.d(toArray());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b<E> {
        public static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b<E> add(E e10);

        public b<E> add(E... eArr) {
            for (E e10 : eArr) {
                add((b<E>) e10);
            }
            return this;
        }

        public b<E> addAll(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                add((b<E>) it.next());
            }
            return this;
        }

        public abstract d1<E> build();

        public b<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add((b<E>) it.next());
            }
            return this;
        }
    }

    public int a(Object[] objArr, int i10) {
        q3<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        io.odeeo.internal.t0.u.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrA = a();
            if (objArrA != null) {
                return (T[]) r2.a(objArrA, c(), b(), tArr);
            }
            tArr = (T[]) m2.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
