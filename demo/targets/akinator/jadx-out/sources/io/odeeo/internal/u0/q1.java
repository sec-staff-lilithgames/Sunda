package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class q1<E> extends d1<E> implements Set<E> {

    /* renamed from: b, reason: collision with root package name */
    public transient h1<E> f67028b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<E> extends d1.a<E> {

        /* renamed from: d, reason: collision with root package name */
        public Object[] f67029d;

        /* renamed from: e, reason: collision with root package name */
        public int f67030e;

        public a() {
            super(4);
        }

        public final void a(E e10) {
            int length = this.f67029d.length - 1;
            int iHashCode = e10.hashCode();
            int iA = b1.a(iHashCode);
            while (true) {
                int i10 = iA & length;
                Object[] objArr = this.f67029d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f67030e += iHashCode;
                    super.add((a<E>) e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    iA = i10 + 1;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ d1.a add(Object obj) {
            return add((a<E>) obj);
        }

        public a(int i10) {
            super(i10);
            this.f67029d = new Object[q1.a(i10)];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public /* bridge */ /* synthetic */ d1.b add(Object obj) {
            return add((a<E>) obj);
        }

        @Override // io.odeeo.internal.u0.d1.b
        public q1<E> build() {
            q1<E> q1VarB;
            int i10 = this.f66650b;
            if (i10 == 0) {
                return q1.of();
            }
            if (i10 == 1) {
                return q1.of(this.f66649a[0]);
            }
            if (this.f67029d == null || q1.a(i10) != this.f67029d.length) {
                q1VarB = q1.b(this.f66650b, this.f66649a);
                this.f66650b = q1VarB.size();
            } else {
                Object[] objArrCopyOf = q1.b(this.f66650b, this.f66649a.length) ? Arrays.copyOf(this.f66649a, this.f66650b) : this.f66649a;
                q1VarB = new y2<>(objArrCopyOf, this.f67030e, this.f67029d, r5.length - 1, this.f66650b);
            }
            this.f66651c = true;
            this.f67029d = null;
            return q1VarB;
        }

        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> addAll(Iterable<? extends E> iterable) {
            io.odeeo.internal.t0.u.checkNotNull(iterable);
            if (this.f67029d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((a<E>) it.next());
                }
                return this;
            }
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> add(E e10) {
            io.odeeo.internal.t0.u.checkNotNull(e10);
            if (this.f67029d != null && q1.a(this.f66650b) <= this.f67029d.length) {
                a((a<E>) e10);
                return this;
            }
            this.f67029d = null;
            super.add((a<E>) e10);
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.b
        public a<E> addAll(Iterator<? extends E> it) {
            io.odeeo.internal.t0.u.checkNotNull(it);
            while (it.hasNext()) {
                add((a<E>) it.next());
            }
            return this;
        }

        @Override // io.odeeo.internal.u0.d1.a, io.odeeo.internal.u0.d1.b
        public a<E> add(E... eArr) {
            if (this.f67029d != null) {
                for (E e10 : eArr) {
                    add((a<E>) e10);
                }
                return this;
            }
            super.add((Object[]) eArr);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f67031a;

        public b(Object[] objArr) {
            this.f67031a = objArr;
        }

        public Object readResolve() {
            return q1.copyOf(this.f67031a);
        }
    }

    public static boolean b(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static <E> a<E> builderWithExpectedSize(int i10) {
        r.a(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <E> q1<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof q1) && !(collection instanceof SortedSet)) {
            q1<E> q1Var = (q1) collection;
            if (!q1Var.isPartialView()) {
                return q1Var;
            }
        }
        Object[] array = collection.toArray();
        return b(array.length, array);
    }

    public static <E> q1<E> of() {
        return y2.f67196h;
    }

    @Override // io.odeeo.internal.u0.d1
    public h1<E> asList() {
        h1<E> h1Var = this.f67028b;
        if (h1Var != null) {
            return h1Var;
        }
        h1<E> h1VarD = d();
        this.f67028b = h1VarD;
        return h1VarD;
    }

    public h1<E> d() {
        return h1.a(toArray());
    }

    public boolean e() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q1) && e() && ((q1) obj).e() && hashCode() != obj.hashCode()) {
            return false;
        }
        return e3.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return e3.a(this);
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract q3<E> iterator();

    @Override // io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new b(toArray());
    }

    public static <E> q1<E> b(int i10, Object... objArr) {
        if (i10 == 0) {
            return of();
        }
        if (i10 == 1) {
            return of(objArr[0]);
        }
        int iA = a(i10);
        Object[] objArr2 = new Object[iA];
        int i11 = iA - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = m2.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iA2 = b1.a(iHashCode);
            while (true) {
                int i15 = iA2 & i11;
                Object obj = objArr2[i15];
                if (obj == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj.equals(objA)) {
                    break;
                }
                iA2++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            return new f3(objArr[0], i12);
        }
        if (a(i13) < iA / 2) {
            return b(i13, objArr);
        }
        if (b(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new y2(objArr, i12, objArr2, i11, i13);
    }

    public static <E> q1<E> of(E e10) {
        return new f3(e10);
    }

    public static int a(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        io.odeeo.internal.t0.u.checkArgument(iMax < 1073741824, "collection too large");
        return 1073741824;
    }

    public static <E> q1<E> of(E e10, E e11) {
        return b(2, e10, e11);
    }

    public static <E> q1<E> of(E e10, E e11, E e12) {
        return b(3, e10, e11, e12);
    }

    public static <E> q1<E> of(E e10, E e11, E e12, E e13) {
        return b(4, e10, e11, e12, e13);
    }

    public static <E> q1<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> q1<E> of(E e10, E e11, E e12, E e13, E e14) {
        return b(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> q1<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        io.odeeo.internal.t0.u.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return b(length, objArr);
    }

    public static <E> q1<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new a().add((a) next).addAll((Iterator) it).build();
    }

    public static <E> q1<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return b(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
