package uu;

import j1.o2;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n1 {
    public static <K, V> V getOrImplicitDefaultNullable(Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        if (map instanceof l1) {
            return (V) ((l1) map).getOrImplicitDefault(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException(o2.k(k10, "Key ", " is missing in the map."));
    }

    public static final <K, V> Map<K, V> withDefault(Map<K, ? extends V> map, kv.l defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof l1 ? withDefault(((l1) map).getMap(), defaultValue) : new m1(map, defaultValue);
    }

    public static final <K, V> Map<K, V> withDefaultMutable(Map<K, V> map, kv.l defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof t1 ? withDefaultMutable(((t1) map).getMap(), defaultValue) : new u1(map, defaultValue);
    }
}
