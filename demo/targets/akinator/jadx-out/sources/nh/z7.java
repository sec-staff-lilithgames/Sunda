package nh;

import com.ironsource.C3191e4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z7 {
    public static void a(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(p0.o2.k(i10, "position (", ") must not be negative"));
        }
    }

    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        mh.p1.checkNotNull(collection);
        mh.p1.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int advance(Iterator<?> it, int i10) {
        mh.p1.checkNotNull(it);
        int i11 = 0;
        mh.p1.checkArgument(i10 >= 0, "numberToAdvance must be nonnegative");
        while (i11 < i10 && it.hasNext()) {
            it.next();
            i11++;
        }
        return i11;
    }

    public static <T> boolean all(Iterator<T> it, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        while (it.hasNext()) {
            if (!q1Var.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, mh.q1 q1Var) {
        return indexOf(it, q1Var) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> it) {
        mh.p1.checkNotNull(it);
        return new j7(it);
    }

    public static Object b(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        mh.p1.checkNotNull(it);
        mh.p1.checkNotNull(it2);
        return concat(new m7(new Iterator[]{it, it2}));
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> it) {
        mh.p1.checkNotNull(it);
        return new q7(it);
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        mh.p1.checkNotNull(iterable);
        return new l7(iterable);
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> ej filter(Iterator<T> it, mh.q1 q1Var) {
        mh.p1.checkNotNull(it);
        mh.p1.checkNotNull(q1Var);
        return new u1(it, q1Var);
    }

    public static <T> T find(Iterator<T> it, mh.q1 q1Var) {
        mh.p1.checkNotNull(it);
        mh.p1.checkNotNull(q1Var);
        while (it.hasNext()) {
            T next = it.next();
            if (q1Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> ej forArray(T... tArr) {
        if (tArr.length != 0) {
            return new s7(tArr);
        }
        mh.p1.checkPositionIndex(0, tArr.length);
        return s7.f76631f;
    }

    public static <T> ej forEnumeration(Enumeration<T> enumeration) {
        mh.p1.checkNotNull(enumeration);
        return new r7(enumeration);
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i10 = 0;
        while (contains(it, obj)) {
            i10++;
        }
        return i10;
    }

    public static <T> T get(Iterator<T> it, int i10) {
        a(i10);
        int iAdvance = advance(it, i10);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException(p0.o2.i(i10, iAdvance, "position (", ") must be less than the number of elements that remained (", ")"));
    }

    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T getNext(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> int indexOf(Iterator<T> it, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (q1Var.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Iterator<T> limit(Iterator<T> it, int i10) {
        mh.p1.checkNotNull(it);
        mh.p1.checkArgument(i10 >= 0, "limit is negative");
        return new p7(i10, it);
    }

    public static <T> ej mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        mh.p1.checkNotNull(iterable, "iterators");
        mh.p1.checkNotNull(comparator, "comparator");
        return new w7(iterable, comparator);
    }

    public static <T> ej paddedPartition(Iterator<T> it, int i10) {
        mh.p1.checkNotNull(it);
        mh.p1.checkArgument(i10 > 0);
        return new n7(it, i10, true);
    }

    public static <T> ej partition(Iterator<T> it, int i10) {
        mh.p1.checkNotNull(it);
        mh.p1.checkArgument(i10 > 0);
        return new n7(it, i10, false);
    }

    public static <T> xe peekingIterator(Iterator<? extends T> it) {
        return it instanceof x7 ? (x7) it : new x7(it);
    }

    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        mh.p1.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean removeIf(Iterator<T> it, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        boolean z10 = false;
        while (it.hasNext()) {
            if (q1Var.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        mh.p1.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> ej singletonIterator(T t10) {
        return new y7(t10);
    }

    public static int size(Iterator<?> it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return rh.w.saturatedCast(j10);
    }

    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) i7.toArray(p8.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        return new o7(it, v0Var, 0);
    }

    public static <T> mh.k1 tryFind(Iterator<T> it, mh.q1 q1Var) {
        mh.p1.checkNotNull(it);
        mh.p1.checkNotNull(q1Var);
        while (it.hasNext()) {
            T next = it.next();
            if (q1Var.apply(next)) {
                return mh.k1.of(next);
            }
        }
        return mh.k1.absent();
    }

    public static <T> ej unmodifiableIterator(Iterator<? extends T> it) {
        mh.p1.checkNotNull(it);
        return it instanceof ej ? (ej) it : new k7(it);
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(p8.newArrayList(tArr));
    }

    public static <T> T getLast(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) getLast(it) : t10;
    }

    public static <T> ej filter(Iterator<?> it, Class<T> cls) {
        return filter(it, mh.g2.instanceOf(cls));
    }

    @Deprecated
    public static <T> xe peekingIterator(xe xeVar) {
        return (xe) mh.p1.checkNotNull(xeVar);
    }

    @Deprecated
    public static <T> ej unmodifiableIterator(ej ejVar) {
        return (ej) mh.p1.checkNotNull(ejVar);
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        mh.p1.checkNotNull(it);
        mh.p1.checkNotNull(it2);
        mh.p1.checkNotNull(it3);
        return concat(new m7(new Iterator[]{it, it2, it3}));
    }

    public static <T> T find(Iterator<? extends T> it, mh.q1 q1Var, T t10) {
        mh.p1.checkNotNull(it);
        mh.p1.checkNotNull(q1Var);
        while (it.hasNext()) {
            T next = it.next();
            if (q1Var.apply(next)) {
                return next;
            }
        }
        return t10;
    }

    public static <T> T getOnlyElement(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) getOnlyElement(it) : t10;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        mh.p1.checkNotNull(it);
        mh.p1.checkNotNull(it2);
        mh.p1.checkNotNull(it3);
        mh.p1.checkNotNull(it4);
        return concat(new m7(new Iterator[]{it, it2, it3, it4}));
    }

    public static <T> T get(Iterator<? extends T> it, int i10, T t10) {
        a(i10);
        advance(it, i10);
        return (T) getNext(it, t10);
    }

    @SafeVarargs
    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        Iterator[] itArr2 = (Iterator[]) Arrays.copyOf(itArr, itArr.length);
        for (Iterator it : (Iterator[]) mh.p1.checkNotNull(itArr2)) {
            mh.p1.checkNotNull(it);
        }
        return concat(new m7(itArr2));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        t7 t7Var = new t7();
        t7Var.f76658c = s7.f76631f;
        t7Var.f76659e = (Iterator) mh.p1.checkNotNull(it);
        return t7Var;
    }
}
