package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i7 {
    public static Object a(Iterable iterable, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (q1Var.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : z7.addAll(collection, ((Iterable) mh.p1.checkNotNull(iterable)).iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, mh.q1 q1Var) {
        return z7.all(iterable.iterator(), q1Var);
    }

    public static <T> boolean any(Iterable<T> iterable, mh.q1 q1Var) {
        return z7.any(iterable.iterator(), q1Var);
    }

    public static void b(List list, mh.q1 q1Var, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (q1Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return d4.concat(iterable, iterable2);
    }

    public static <T> Iterable<T> consumingIterable(Iterable<T> iterable) {
        mh.p1.checkNotNull(iterable);
        return new f7(iterable);
    }

    public static boolean contains(Iterable<?> iterable, Object obj) {
        if (!(iterable instanceof Collection)) {
            return z7.contains(iterable.iterator(), obj);
        }
        Collection collection = (Collection) iterable;
        mh.p1.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <T> Iterable<T> cycle(Iterable<T> iterable) {
        mh.p1.checkNotNull(iterable);
        return new x6(iterable);
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return z7.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    public static <T> Iterable<T> filter(Iterable<T> iterable, mh.q1 q1Var) {
        mh.p1.checkNotNull(iterable);
        mh.p1.checkNotNull(q1Var);
        return new a7(iterable, q1Var);
    }

    public static <T> T find(Iterable<T> iterable, mh.q1 q1Var) {
        return (T) z7.find(iterable.iterator(), q1Var);
    }

    public static int frequency(Iterable<?> iterable, Object obj) {
        return iterable instanceof ud ? ((ud) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : z7.frequency(iterable.iterator(), obj);
    }

    public static <T> T get(Iterable<T> iterable, int i10) {
        mh.p1.checkNotNull(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) z7.get(iterable.iterator(), i10);
    }

    public static <T> T getFirst(Iterable<? extends T> iterable, T t10) {
        return (T) z7.getNext(iterable.iterator(), t10);
    }

    public static <T> T getLast(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return iterable instanceof SortedSet ? (T) ((SortedSet) iterable).last() : (T) z7.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) p0.o2.g(1, list);
    }

    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) z7.getOnlyElement(iterable.iterator());
    }

    public static <T> int indexOf(Iterable<T> iterable, mh.q1 q1Var) {
        return z7.indexOf(iterable.iterator(), q1Var);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> limit(Iterable<T> iterable, int i10) {
        mh.p1.checkNotNull(iterable);
        mh.p1.checkArgument(i10 >= 0, "limit is negative");
        return new e7(iterable, i10);
    }

    public static <T> Iterable<T> mergeSorted(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        mh.p1.checkNotNull(iterable, "iterables");
        mh.p1.checkNotNull(comparator, "comparator");
        return new h7(new g7(iterable, comparator));
    }

    public static <T> Iterable<List<T>> paddedPartition(Iterable<T> iterable, int i10) {
        mh.p1.checkNotNull(iterable);
        mh.p1.checkArgument(i10 > 0);
        return new z6(iterable, i10);
    }

    public static <T> Iterable<List<T>> partition(Iterable<T> iterable, int i10) {
        mh.p1.checkNotNull(iterable);
        mh.p1.checkArgument(i10 > 0);
        return new y6(iterable, i10);
    }

    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) mh.p1.checkNotNull(collection)) : z7.removeAll(iterable.iterator(), collection);
    }

    public static <T> boolean removeIf(Iterable<T> iterable, mh.q1 q1Var) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return z7.removeIf(iterable.iterator(), q1Var);
        }
        List list = (List) iterable;
        mh.q1 q1Var2 = (mh.q1) mh.p1.checkNotNull(q1Var);
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!q1Var2.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        b(list, q1Var2, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        b(list, q1Var2, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) mh.p1.checkNotNull(collection)) : z7.retainAll(iterable.iterator(), collection);
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : z7.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(Iterable<T> iterable, int i10) {
        mh.p1.checkNotNull(iterable);
        mh.p1.checkArgument(i10 >= 0, "number to skip cannot be negative");
        return new d7(iterable, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) (iterable instanceof Collection ? (Collection) iterable : p8.newArrayList(iterable.iterator())).toArray(pe.newArray(cls, 0));
    }

    public static String toString(Iterable<?> iterable) {
        return z7.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(Iterable<F> iterable, mh.v0 v0Var) {
        mh.p1.checkNotNull(iterable);
        mh.p1.checkNotNull(v0Var);
        return new b7(iterable, v0Var);
    }

    public static <T> mh.k1 tryFind(Iterable<T> iterable, mh.q1 q1Var) {
        return z7.tryFind(iterable.iterator(), q1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
        mh.p1.checkNotNull(iterable);
        return ((iterable instanceof h7) || (iterable instanceof u4)) ? iterable : new h7(iterable);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return d4.concat(iterable, iterable2, iterable3);
    }

    public static <T> T find(Iterable<? extends T> iterable, mh.q1 q1Var, T t10) {
        return (T) z7.find(iterable.iterator(), q1Var, t10);
    }

    public static <T> T getOnlyElement(Iterable<? extends T> iterable, T t10) {
        return (T) z7.getOnlyElement(iterable.iterator(), t10);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return d4.concat(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
        return cycle(p8.newArrayList(tArr));
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
        return d4.concat(iterableArr);
    }

    public static <T> Iterable<T> filter(Iterable<?> iterable, Class<T> cls) {
        mh.p1.checkNotNull(iterable);
        mh.p1.checkNotNull(cls);
        return filter(iterable, mh.g2.instanceOf(cls));
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(u4 u4Var) {
        return (Iterable) mh.p1.checkNotNull(u4Var);
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        return d4.concat(iterable);
    }

    public static <T> T get(Iterable<? extends T> iterable, int i10, T t10) {
        mh.p1.checkNotNull(iterable);
        z7.a(i10);
        if (iterable instanceof List) {
            List list = (List) iterable;
            return i10 < list.size() ? (T) list.get(i10) : t10;
        }
        Iterator<? extends T> it = iterable.iterator();
        z7.advance(it, i10);
        return (T) z7.getNext(it, t10);
    }

    public static <T> T getLast(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) p0.o2.g(1, (List) iterable);
            }
            if (iterable instanceof SortedSet) {
                return (T) ((SortedSet) iterable).last();
            }
        }
        return (T) z7.getLast(iterable.iterator(), t10);
    }
}
