package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d4 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final mh.k1 f76173b;

    public d4() {
        this.f76173b = mh.k1.absent();
    }

    public static c4 a(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            mh.p1.checkNotNull(iterable);
        }
        return new c4(iterableArr);
    }

    public static <T> d4 concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return a(iterable, iterable2);
    }

    public static <E> d4 from(Iterable<E> iterable) {
        return iterable instanceof d4 ? (d4) iterable : new z3(iterable, iterable);
    }

    public static <E> d4 of() {
        return from(Collections.EMPTY_LIST);
    }

    public final boolean allMatch(mh.q1 q1Var) {
        return i7.all(c(), q1Var);
    }

    public final boolean anyMatch(mh.q1 q1Var) {
        return i7.any(c(), q1Var);
    }

    public final d4 append(Iterable<Object> iterable) {
        return concat(c(), iterable);
    }

    public final Iterable c() {
        return (Iterable) this.f76173b.or(this);
    }

    public final boolean contains(Object obj) {
        return i7.contains(c(), obj);
    }

    public final <C extends Collection<Object>> C copyInto(C c10) {
        mh.p1.checkNotNull(c10);
        Iterable iterableC = c();
        if (iterableC instanceof Collection) {
            c10.addAll((Collection) iterableC);
            return c10;
        }
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public final d4 cycle() {
        return from(i7.cycle(c()));
    }

    public final d4 filter(mh.q1 q1Var) {
        return from(i7.filter(c(), q1Var));
    }

    public final mh.k1 first() {
        Iterator it = c().iterator();
        return it.hasNext() ? mh.k1.of(it.next()) : mh.k1.absent();
    }

    public final mh.k1 firstMatch(mh.q1 q1Var) {
        return i7.tryFind(c(), q1Var);
    }

    public final Object get(int i10) {
        return i7.get(c(), i10);
    }

    public final <K> d5 index(mh.v0 v0Var) {
        return sd.index(c(), v0Var);
    }

    public final boolean isEmpty() {
        return !c().iterator().hasNext();
    }

    public final String join(mh.d1 d1Var) {
        return d1Var.join(this);
    }

    public final mh.k1 last() {
        Object next;
        Iterable iterableC = c();
        if (iterableC instanceof List) {
            List list = (List) iterableC;
            return list.isEmpty() ? mh.k1.absent() : mh.k1.of(list.get(list.size() - 1));
        }
        Iterator it = iterableC.iterator();
        if (!it.hasNext()) {
            return mh.k1.absent();
        }
        if (iterableC instanceof SortedSet) {
            return mh.k1.of(((SortedSet) iterableC).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return mh.k1.of(next);
    }

    public final d4 limit(int i10) {
        return from(i7.limit(c(), i10));
    }

    public final int size() {
        return i7.size(c());
    }

    public final d4 skip(int i10) {
        return from(i7.skip(c(), i10));
    }

    public final Object[] toArray(Class<Object> cls) {
        return i7.toArray(c(), cls);
    }

    public final b5 toList() {
        return b5.copyOf(c());
    }

    public final <V> m5 toMap(mh.v0 v0Var) {
        return ec.toMap(c(), v0Var);
    }

    public final d6 toMultiset() {
        return d6.copyOf(c());
    }

    public final l6 toSet() {
        return l6.copyOf(c());
    }

    public final b5 toSortedList(Comparator<Object> comparator) {
        return we.from(comparator).immutableSortedCopy(c());
    }

    public final u6 toSortedSet(Comparator<Object> comparator) {
        return u6.copyOf(comparator, c());
    }

    public String toString() {
        return i7.toString(c());
    }

    public final <T> d4 transform(mh.v0 v0Var) {
        return from(i7.transform(c(), v0Var));
    }

    public <T> d4 transformAndConcat(mh.v0 v0Var) {
        return concat(transform(v0Var));
    }

    public final <K> m5 uniqueIndex(mh.v0 v0Var) {
        return ec.uniqueIndex(c(), v0Var);
    }

    public static <T> d4 concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return a(iterable, iterable2, iterable3);
    }

    public static <E> d4 of(E e10, E... eArr) {
        return from(p8.asList(e10, eArr));
    }

    public final d4 append(Object... objArr) {
        return concat(c(), Arrays.asList(objArr));
    }

    public final <T> d4 filter(Class<T> cls) {
        return from(i7.filter((Iterable<?>) c(), cls));
    }

    public d4(Iterable iterable) {
        this.f76173b = mh.k1.of(iterable);
    }

    public static <T> d4 concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return a(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> d4 concat(Iterable<? extends T>... iterableArr) {
        return a((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <E> d4 from(E[] eArr) {
        return from(Arrays.asList(eArr));
    }

    public static <T> d4 concat(Iterable<? extends Iterable<? extends T>> iterable) {
        mh.p1.checkNotNull(iterable);
        return new a4(iterable);
    }

    @Deprecated
    public static <E> d4 from(d4 d4Var) {
        return (d4) mh.p1.checkNotNull(d4Var);
    }
}
