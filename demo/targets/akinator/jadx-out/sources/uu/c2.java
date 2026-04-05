package uu;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c2 extends b2 {
    public static <T> Set<T> emptySet() {
        return d1.f88712b;
    }

    public static final <T> HashSet<T> hashSetOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return (HashSet) k0.toCollection(elements, new HashSet(o1.mapCapacity(elements.length)));
    }

    public static final <T> LinkedHashSet<T> linkedSetOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) k0.toCollection(elements, new LinkedHashSet(o1.mapCapacity(elements.length)));
    }

    public static <T> Set<T> mutableSetOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return (Set) k0.toCollection(elements, new LinkedHashSet(o1.mapCapacity(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> optimizeReadOnlySet(Set<? extends T> set) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : b2.setOf(set.iterator().next()) : emptySet();
    }

    public static <T> Set<T> setOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return k0.toSet(elements);
    }

    public static final <T> Set<T> setOfNotNull(T t10) {
        return t10 != null ? b2.setOf(t10) : emptySet();
    }

    public static final <T> Set<T> setOfNotNull(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return (Set) k0.filterNotNullTo(elements, new LinkedHashSet());
    }
}
