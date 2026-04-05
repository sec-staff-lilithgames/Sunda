package uu;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q1 extends p1 {
    @tu.f
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> minBy(Map<? extends K, ? extends V> map, kv.l selector) {
        Object obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) selector.invoke(next2);
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @tu.f
    public static final /* synthetic */ Map.Entry minWith(Map map, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) y0.minWithOrNull(map.entrySet(), comparator);
    }
}
