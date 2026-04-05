package uu;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d2 extends c2 {
    public static <T> Set<T> minus(Set<? extends T> set, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(o1.mapCapacity(set.size()));
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.e0.areEqual(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> plus(Set<? extends T> set, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(o1.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(o1.mapCapacity(set.size() + elements.length));
        linkedHashSet.addAll(set);
        v0.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        v0.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static <T> Set<T> plus(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Integer numCollectionSizeOrNull = q0.collectionSizeOrNull(elements);
        if (numCollectionSizeOrNull != null) {
            size = set.size() + numCollectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(o1.mapCapacity(size));
        linkedHashSet.addAll(set);
        v0.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection<?> collectionConvertToListIfNotCollection = v0.convertToListIfNotCollection(elements);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return y0.toSet(set);
        }
        if (collectionConvertToListIfNotCollection instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t10 : set) {
                if (!((Set) collectionConvertToListIfNotCollection).contains(t10)) {
                    linkedHashSet.add(t10);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collectionConvertToListIfNotCollection);
        return linkedHashSet2;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(o1.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        v0.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        v0.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }
}
