package uu;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b2 {
    public static <E> Set<E> build(Set<E> builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        return (Set<E>) ((vu.h) builder).build();
    }

    public static <E> Set<E> createSetBuilder() {
        return new vu.h();
    }

    public static <T> Set<T> setOf(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static <T> TreeSet<T> sortedSetOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return (TreeSet) k0.toCollection(elements, new TreeSet());
    }

    public static final <E> Set<E> createSetBuilder(int i10) {
        return new vu.h(i10);
    }

    public static final <T> TreeSet<T> sortedSetOf(Comparator<? super T> comparator, T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return (TreeSet) k0.toCollection(elements, new TreeSet(comparator));
    }
}
