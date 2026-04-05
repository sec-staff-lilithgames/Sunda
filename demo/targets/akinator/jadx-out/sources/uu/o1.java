package uu;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o1 extends n1 {
    public static <K, V> Map<K, V> build(Map<K, V> builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        return (Map<K, V>) ((vu.d) builder).build();
    }

    public static <K, V> Map<K, V> createMapBuilder() {
        return new vu.d();
    }

    public static final <K, V> V getOrPut(ConcurrentMap<K, V> concurrentMap, K k10, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(concurrentMap, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        V v10 = concurrentMap.get(k10);
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) defaultValue.invoke();
        V vPutIfAbsent = concurrentMap.putIfAbsent(k10, v11);
        return vPutIfAbsent == null ? v11 : vPutIfAbsent;
    }

    public static int mapCapacity(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> mapOf(tu.v pair) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(tu.v... pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        p1.putAll(treeMap, pairs);
        return treeMap;
    }

    public static final <K, V> Map<K, V> toSingletonMap(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        return new TreeMap(map);
    }

    public static <K, V> Map<K, V> createMapBuilder(int i10) {
        return new vu.d(i10);
    }

    public static final <K, V> SortedMap<K, V> sortedMapOf(Comparator<? super K> comparator, tu.v... pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        p1.putAll(treeMap, pairs);
        return treeMap;
    }

    public static final <K, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
