package io.odeeo.internal.u0;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h3 {
    public static <E> Comparator<? super E> comparator(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? p2.natural() : comparator;
    }

    public static boolean hasSameComparator(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        io.odeeo.internal.t0.u.checkNotNull(comparator);
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else {
            if (!(iterable instanceof g3)) {
                return false;
            }
            comparator2 = ((g3) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
