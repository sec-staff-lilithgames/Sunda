package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y1 {
    public static boolean a(List list, List list2) {
        if (list.size() == list2.size()) {
            re reVar = new re();
            for (Object obj : list) {
                reVar.put(obj, reVar.get(obj) + 1);
            }
            re reVar2 = new re();
            for (Object obj2 : list2) {
                reVar2.put(obj2, reVar2.get(obj2) + 1);
            }
            if (list.size() == list2.size()) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (reVar.d(i10) == reVar2.get(reVar.c(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean b(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <E> Collection<E> filter(Collection<E> collection, mh.q1 q1Var) {
        if (!(collection instanceof s1)) {
            return new s1((Collection) mh.p1.checkNotNull(collection), (mh.q1) mh.p1.checkNotNull(q1Var));
        }
        s1 s1Var = (s1) collection;
        return new s1(s1Var.f76617b, mh.g2.and(s1Var.f76618c, q1Var));
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, we.natural());
    }

    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new v1(b5.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, mh.v0 v0Var) {
        return new x1(collection, v0Var);
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new t1(iterable, comparator);
    }
}
