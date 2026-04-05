package io.odeeo.internal.u0;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class p2<T> implements Comparator<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends p2<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f67020a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        public final ConcurrentMap<Object, Integer> f67021b = r2.a(new b2()).makeMap();

        public final Integer a(Object obj) {
            Integer numPutIfAbsent;
            Integer numValueOf = this.f67021b.get(obj);
            return (numValueOf != null || (numPutIfAbsent = this.f67021b.putIfAbsent(obj, (numValueOf = Integer.valueOf(this.f67020a.getAndIncrement())))) == null) ? numValueOf : numPutIfAbsent;
        }

        public int b(Object obj) {
            return System.identityHashCode(obj);
        }

        @Override // io.odeeo.internal.u0.p2, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iB = b(obj);
            int iB2 = b(obj2);
            if (iB != iB2) {
                return iB < iB2 ? -1 : 1;
            }
            int iCompareTo = a(obj).compareTo(a(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final p2<Object> f67022a = new a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends ClassCastException {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f67023a;

        public c(Object obj) {
            super(j1.o2.j(obj, "Cannot compare value: "));
            this.f67023a = obj;
        }
    }

    public static p2<Object> allEqual() {
        return l.f66924a;
    }

    public static p2<Object> arbitrary() {
        return b.f67022a;
    }

    public static <T> p2<T> explicit(List<T> list) {
        return new f0(list);
    }

    public static <T> p2<T> from(Comparator<T> comparator) {
        return comparator instanceof p2 ? (p2) comparator : new x(comparator);
    }

    public static <C extends Comparable> p2<C> natural() {
        return j2.f66918c;
    }

    public static p2<Object> usingToString() {
        return t3.f67085a;
    }

    public <T2 extends T> p2<Map.Entry<T2, ?>> a() {
        return (p2<Map.Entry<T2, ?>>) onResultOf(d2.a());
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, T t10) {
        return Collections.binarySearch(list, t10, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public <U extends T> p2<U> compound(Comparator<? super U> comparator) {
        return new z(this, (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i10) {
        return reverse().leastOf(iterable, i10);
    }

    public <E extends T> h1<E> immutableSortedCopy(Iterable<E> iterable) {
        return h1.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i10) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= i10 * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i10) {
                    array = Arrays.copyOf(array, i10);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i10);
    }

    public <S extends T> p2<Iterable<S>> lexicographical() {
        return new x1(this);
    }

    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public <S extends T> p2<S> nullsFirst() {
        return new k2(this);
    }

    public <S extends T> p2<S> nullsLast() {
        return new l2(this);
    }

    public <F> p2<F> onResultOf(io.odeeo.internal.t0.k<F, ? extends T> kVar) {
        return new p(kVar, this);
    }

    public <S extends T> p2<S> reverse() {
        return new b3(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrB = v1.b(iterable);
        Arrays.sort(objArrB, this);
        return z1.newArrayList(Arrays.asList(objArrB));
    }

    public static <T> p2<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new z(iterable);
    }

    public static <T> p2<T> explicit(T t10, T... tArr) {
        return explicit(z1.asList(t10, tArr));
    }

    @Deprecated
    public static <T> p2<T> from(p2<T> p2Var) {
        return (p2) io.odeeo.internal.t0.u.checkNotNull(p2Var);
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i10) {
        return reverse().leastOf(it, i10);
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E max(E e10, E e11) {
        return compare(e10, e11) >= 0 ? e10 : e11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends T> E min(E e10, E e11) {
        return compare(e10, e11) <= 0 ? e10 : e11;
    }

    public <E extends T> E max(E e10, E e11, E e12, E... eArr) {
        E e13 = (E) max(max(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) max(e13, e14);
        }
        return e13;
    }

    public <E extends T> E min(E e10, E e11, E e12, E... eArr) {
        E e13 = (E) min(min(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) min(e13, e14);
        }
        return e13;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i10) {
        io.odeeo.internal.t0.u.checkNotNull(it);
        r.a(i10, CampaignEx.JSON_KEY_AD_K);
        if (i10 == 0 || !it.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (i10 >= 1073741823) {
            ArrayList arrayListNewArrayList = z1.newArrayList(it);
            Collections.sort(arrayListNewArrayList, this);
            if (arrayListNewArrayList.size() > i10) {
                arrayListNewArrayList.subList(i10, arrayListNewArrayList.size()).clear();
            }
            arrayListNewArrayList.trimToSize();
            return Collections.unmodifiableList(arrayListNewArrayList);
        }
        n3 n3VarLeast = n3.least(i10, this);
        n3VarLeast.offerAll(it);
        return n3VarLeast.topK();
    }
}
