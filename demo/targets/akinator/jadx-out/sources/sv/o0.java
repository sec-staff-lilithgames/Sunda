package sv;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o0 extends n0 {
    @tu.f
    public static final /* synthetic */ Character max(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return p0.maxOrNull(charSequence);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
                if (comparable.compareTo(comparable2) < 0) {
                    cCharAt = cCharAt2;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @tu.f
    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return p0.maxWithOrNull(charSequence, comparator);
    }

    @tu.f
    public static final /* synthetic */ Character min(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return p0.minOrNull(charSequence);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
                if (comparable.compareTo(comparable2) > 0) {
                    cCharAt = cCharAt2;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @tu.f
    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return p0.minWithOrNull(charSequence, comparator);
    }

    public static final SortedSet<Character> toSortedSet(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) p0.toCollection(charSequence, new TreeSet());
    }
}
