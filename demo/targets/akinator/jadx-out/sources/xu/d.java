package xu;

import com.google.android.exoplayer2.ui.v0;
import java.util.Comparator;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d {
    public static final <T> Comparator<T> compareBy(l... selectors) {
        e0.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new bg.d(selectors, 5);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static <T extends Comparable<?>> int compareValues(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    public static final <T> int compareValuesBy(T t10, T t11, l... selectors) {
        e0.checkNotNullParameter(selectors, "selectors");
        if (selectors.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (l lVar : selectors) {
            int iCompareValues = compareValues((Comparable) lVar.invoke(t10), (Comparable) lVar.invoke(t11));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        f fVar = f.f93553b;
        e0.checkNotNull(fVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return fVar;
    }

    public static final <T> Comparator<T> nullsFirst(Comparator<? super T> comparator) {
        e0.checkNotNullParameter(comparator, "comparator");
        return new v0(comparator, 5);
    }

    public static final <T> Comparator<T> nullsLast(Comparator<? super T> comparator) {
        e0.checkNotNullParameter(comparator, "comparator");
        return new v0(comparator, 4);
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        g gVar = g.f93554b;
        e0.checkNotNull(gVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return gVar;
    }

    public static final <T> Comparator<T> reversed(Comparator<T> comparator) {
        e0.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof h) {
            return (Comparator<T>) ((h) comparator).getComparator();
        }
        f fVar = f.f93553b;
        boolean zAreEqual = e0.areEqual(comparator, fVar);
        g gVar = g.f93554b;
        if (zAreEqual) {
            e0.checkNotNull(gVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return gVar;
        }
        if (!e0.areEqual(comparator, gVar)) {
            return new h(comparator);
        }
        e0.checkNotNull(fVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        return fVar;
    }

    public static final <T> Comparator<T> then(Comparator<T> comparator, Comparator<? super T> comparator2) {
        e0.checkNotNullParameter(comparator, "<this>");
        e0.checkNotNullParameter(comparator2, "comparator");
        return new a(comparator, comparator2, 1);
    }

    public static final <T> Comparator<T> thenDescending(Comparator<T> comparator, Comparator<? super T> comparator2) {
        e0.checkNotNullParameter(comparator, "<this>");
        e0.checkNotNullParameter(comparator2, "comparator");
        return new a(comparator, comparator2, 0);
    }
}
