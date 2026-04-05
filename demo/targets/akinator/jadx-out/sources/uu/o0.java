package uu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o0 {
    public static <E> List<E> build(List<E> builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        return (List<E>) ((vu.b) builder).build();
    }

    public static final <T> Object[] copyToArrayOfAny(T[] tArr, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        if (z10 && kotlin.jvm.internal.e0.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static <E> List<E> createListBuilder() {
        return new vu.b(0, 1, null);
    }

    public static <T> List<T> listOf(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = y0.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    public static <T> T[] terminateCollectionToArray(int i10, T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    public static <E> List<E> createListBuilder(int i10) {
        return new vu.b(i10);
    }

    public static <T> List<T> shuffled(Iterable<? extends T> iterable, Random random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        List<T> mutableList = y0.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }
}
