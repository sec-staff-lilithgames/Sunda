package uu;

import com.moloco.sdk.BKC.JzVV;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class x0 extends w0 {
    public static final <R> List<R> filterIsInstance(Iterable<?> iterable, Class<R> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(iterable, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Iterable<?> iterable, C destination, Class<R> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @tu.f
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m7408max(Iterable iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return y0.m7412maxOrNull((Iterable<Double>) iterable);
    }

    @tu.f
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    @tu.f
    public static final /* synthetic */ Object maxWith(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return y0.maxWithOrNull(iterable, comparator);
    }

    @tu.f
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m7410min(Iterable iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return y0.m7416minOrNull((Iterable<Double>) iterable);
    }

    @tu.f
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    @tu.f
    public static final /* synthetic */ Object minWith(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return y0.minWithOrNull(iterable, comparator);
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return (SortedSet) y0.toCollection(iterable, new TreeSet());
    }

    @tu.f
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m7409max(Iterable iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return y0.m7413maxOrNull((Iterable<Float>) iterable);
    }

    @tu.f
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m7411min(Iterable iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return y0.m7417minOrNull((Iterable<Float>) iterable);
    }

    public static <T> void reverse(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, JzVV.pRlGhRZIfTuCDG);
        Collections.reverse(list);
    }

    public static final <T> SortedSet<T> toSortedSet(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) y0.toCollection(iterable, new TreeSet(comparator));
    }

    @tu.f
    public static final /* synthetic */ Comparable max(Iterable iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return y0.maxOrNull(iterable);
    }

    @tu.f
    public static final /* synthetic */ Comparable min(Iterable iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return y0.minOrNull(iterable);
    }
}
