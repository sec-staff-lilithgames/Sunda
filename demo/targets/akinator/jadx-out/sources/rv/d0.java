package rv;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import p0.g2;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d0 extends y {
    public static final <R> t filterIsInstance(t tVar, Class<R> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        t tVarFilter = f0.filter(tVar, new g2(klass, 7));
        kotlin.jvm.internal.e0.checkNotNull(tVarFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return tVarFilter;
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(t tVar, C destination, Class<R> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        for (Object obj : tVar) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @tu.f
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m6103max(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return f0.m6107maxOrNull(tVar);
    }

    @tu.f
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        if (!itW.hasNext()) {
            return null;
        }
        T t10 = (T) itW.next();
        if (!itW.hasNext()) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.invoke(t10);
        do {
            Object next = itW.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next);
            if (comparable.compareTo(comparable2) < 0) {
                t10 = (T) next;
                comparable = comparable2;
            }
        } while (itW.hasNext());
        return t10;
    }

    @tu.f
    public static final /* synthetic */ Object maxWith(t tVar, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return f0.maxWithOrNull(tVar, comparator);
    }

    @tu.f
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m6105min(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return f0.m6111minOrNull(tVar);
    }

    @tu.f
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        if (!itW.hasNext()) {
            return null;
        }
        T t10 = (T) itW.next();
        if (!itW.hasNext()) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.invoke(t10);
        do {
            Object next = itW.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next);
            if (comparable.compareTo(comparable2) > 0) {
                t10 = (T) next;
                comparable = comparable2;
            }
        } while (itW.hasNext());
        return t10;
    }

    @tu.f
    public static final /* synthetic */ Object minWith(t tVar, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return f0.minWithOrNull(tVar, comparator);
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return (SortedSet) f0.toCollection(tVar, new TreeSet());
    }

    @tu.f
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m6104max(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return f0.m6108maxOrNull(tVar);
    }

    @tu.f
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m6106min(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return f0.m6112minOrNull(tVar);
    }

    public static final <T> SortedSet<T> toSortedSet(t tVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) f0.toCollection(tVar, new TreeSet(comparator));
    }

    @tu.f
    public static final /* synthetic */ Comparable max(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return f0.maxOrNull(tVar);
    }

    @tu.f
    public static final /* synthetic */ Comparable min(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return f0.minOrNull(tVar);
    }
}
