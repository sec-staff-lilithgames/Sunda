package uu;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v0 extends u0 {
    public static <T> boolean addAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final boolean b(Iterable iterable, kv.l lVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final boolean c(List list, kv.l lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.e0.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return b(kotlin.jvm.internal.h1.asMutableIterable(list), lVar, z10);
        }
        int lastIndex = p0.getLastIndex(list);
        if (lastIndex >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) lVar.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int lastIndex2 = p0.getLastIndex(list);
        if (i10 > lastIndex2) {
            return true;
        }
        while (true) {
            list.remove(lastIndex2);
            if (lastIndex2 == i10) {
                return true;
            }
            lastIndex2--;
        }
    }

    public static <T> Collection<T> convertToListIfNotCollection(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : y0.toList(iterable);
    }

    public static <T> boolean removeAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return collection.removeAll(convertToListIfNotCollection(elements));
    }

    public static <T> T removeFirst(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> T removeFirstOrNull(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T removeLast(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(p0.getLastIndex(list));
    }

    public static <T> T removeLastOrNull(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(p0.getLastIndex(list));
    }

    public static <T> boolean retainAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return collection.retainAll(convertToListIfNotCollection(elements));
    }

    public static <T> boolean removeAll(Collection<? super T> collection, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        List list = rv.f0.toList(elements);
        return !list.isEmpty() && collection.removeAll(list);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements.length != 0) {
            return collection.retainAll(f0.asList(elements));
        }
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    public static <T> boolean addAll(Collection<? super T> collection, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean removeAll(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(f0.asList(elements));
    }

    public static <T> boolean removeAll(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return b(iterable, predicate, true);
    }

    public static <T> boolean addAll(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return collection.addAll(f0.asList(elements));
    }

    public static <T> boolean removeAll(List<T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return c(list, predicate, true);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        List list = rv.f0.toList(elements);
        if (!list.isEmpty()) {
            return collection.retainAll(list);
        }
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    public static <T> boolean retainAll(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return b(iterable, predicate, false);
    }

    public static final <T> boolean retainAll(List<T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return c(list, predicate, false);
    }
}
