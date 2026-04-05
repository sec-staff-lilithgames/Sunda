package nh;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class rg {
    public static <E> Comparator<? super E> comparator(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? we.natural() : comparator;
    }

    public static boolean hasSameComparator(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator<Object> comparator2;
        mh.p1.checkNotNull(comparator);
        mh.p1.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else {
            if (!(iterable instanceof qg)) {
                return false;
            }
            comparator2 = ((qg) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
