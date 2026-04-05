package uu;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u0 extends t0 {
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void sortWith(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
