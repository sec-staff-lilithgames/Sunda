package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l6 extends u4 implements Set {

    /* renamed from: c, reason: collision with root package name */
    public transient b5 f76442c;

    public static <E> k6 builder() {
        return new k6();
    }

    public static <E> k6 builderWithExpectedSize(int i10) {
        jh.i.o(i10, "expectedSize");
        k6 k6Var = new k6(i10);
        k6Var.f76416d = new Object[f(i10)];
        return k6Var;
    }

    public static <E> l6 copyOf(Collection<? extends E> collection) {
        if ((collection instanceof l6) && !(collection instanceof SortedSet)) {
            l6 l6Var = (l6) collection;
            if (!l6Var.isPartialView()) {
                return l6Var;
            }
        }
        Object[] array = collection.toArray();
        return g(array.length, array);
    }

    public static int f(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            mh.p1.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static l6 g(int i10, Object... objArr) {
        if (i10 == 0) {
            return of();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iF = f(i10);
        Object[] objArr2 = new Object[iF];
        int i11 = iF - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(a.b.e(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iF2 = kotlin.jvm.internal.d0.F(iHashCode);
            while (true) {
                int i15 = iF2 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iF2++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new pg(obj4);
        }
        if (f(i13) < iF / 2) {
            return g(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new of(objArr, i12, objArr2, i11, i13);
    }

    public static <E> l6 of() {
        return of.f76540k;
    }

    public static <E> Collector<E, ?, l6> toImmutableSet() {
        return i1.f76344b;
    }

    @Override // nh.u4
    public b5 asList() {
        b5 b5Var = this.f76442c;
        if (b5Var != null) {
            return b5Var;
        }
        b5 b5VarH = h();
        this.f76442c = b5VarH;
        return b5VarH;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l6) && i() && ((l6) obj).i() && hashCode() != obj.hashCode()) {
            return false;
        }
        return og.a(this, obj);
    }

    public b5 h() {
        Object[] array = toArray();
        y4 y4Var = b5.f76121c;
        return b5.f(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return og.b(this);
    }

    public boolean i() {
        return this instanceof b3;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract ej iterator();

    public static <E> l6 of(E e10) {
        return new pg(e10);
    }

    public static <E> l6 of(E e10, E e11) {
        return g(2, e10, e11);
    }

    public static <E> l6 of(E e10, E e11, E e12) {
        return g(3, e10, e11, e12);
    }

    public static <E> l6 of(E e10, E e11, E e12, E e13) {
        return g(4, e10, e11, e12, e13);
    }

    public static <E> l6 copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> l6 of(E e10, E e11, E e12, E e13, E e14) {
        return g(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> l6 of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        mh.p1.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return g(length, objArr);
    }

    public static <E> l6 copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new k6().add((Object) next).addAll((Iterator<Object>) it).build();
    }

    public static <E> l6 copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return g(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
