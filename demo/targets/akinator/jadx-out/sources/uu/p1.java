package uu;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p1 extends o1 {
    public static <K, V> Map<K, V> emptyMap() {
        c1 c1Var = c1.f88708b;
        kotlin.jvm.internal.e0.checkNotNull(c1Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c1Var;
    }

    public static final <K, V> Map<K, V> filter(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterKeys(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterNot(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!((Boolean) predicate.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(Map<? extends K, ? extends V> map, M destination, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!((Boolean) predicate.invoke(entry)).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(Map<? extends K, ? extends V> map, M destination, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry)).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V> Map<K, V> filterValues(Map<? extends K, ? extends V> map, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry.getValue())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> V getOrElseNullable(Map<K, ? extends V> map, K k10, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : (V) defaultValue.invoke();
    }

    public static final <K, V> V getOrPut(Map<K, V> map, K k10, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) defaultValue.invoke();
        map.put(k10, v11);
        return v11;
    }

    public static <K, V> V getValue(Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        return (V) n1.getOrImplicitDefaultNullable(map, k10);
    }

    public static <K, V> HashMap<K, V> hashMapOf(tu.v... pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(o1.mapCapacity(pairs.length));
        putAll(map, pairs);
        return map;
    }

    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(tu.v... pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        return (LinkedHashMap) toMap(pairs, new LinkedHashMap(o1.mapCapacity(pairs.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<R, V> mapKeys(Map<? extends K, ? extends V> map, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(transform.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(Map<? extends K, ? extends V> map, M destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        for (Object obj : map.entrySet()) {
            destination.put(transform.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return destination;
    }

    public static <K, V> Map<K, V> mapOf(tu.v... pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        return pairs.length > 0 ? toMap(pairs, new LinkedHashMap(o1.mapCapacity(pairs.length))) : emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<K, R> mapValues(Map<? extends K, ? extends V> map, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(map.size()));
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), transform.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(Map<? extends K, ? extends V> map, M destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        for (Object obj : map.entrySet()) {
            destination.put(((Map.Entry) obj).getKey(), transform.invoke(obj));
        }
        return destination;
    }

    public static <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        Map mutableMap = toMutableMap(map);
        mutableMap.remove(k10);
        return optimizeReadOnlyMap(mutableMap);
    }

    public static <K, V> Map<K, V> mutableMapOf(tu.v... pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(pairs.length));
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(Map<K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : o1.toSingletonMap(map) : emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, tu.v pair) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return o1.mapOf(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static <K, V> void putAll(Map<? super K, ? super V> map, tu.v[] pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        for (tu.v vVar : pairs) {
            map.put(vVar.component1(), vVar.component2());
        }
    }

    public static <K, V> Map<K, V> toMap(Iterable<? extends tu.v> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return optimizeReadOnlyMap(toMap(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMap(iterable, new LinkedHashMap(o1.mapCapacity(collection.size())));
        }
        return o1.mapOf((tu.v) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static <K, V> Map<K, V> toMutableMap(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Map mutableMap = toMutableMap(map);
        v0.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Iterable<? extends tu.v> pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            return toMap(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K[] keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Map mutableMap = toMutableMap(map);
        v0.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, tu.v[] pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            return toMap(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static <K, V> void putAll(Map<? super K, ? super V> map, Iterable<? extends tu.v> pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        for (tu.v vVar : pairs) {
            map.put(vVar.component1(), vVar.component2());
        }
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, rv.t keys) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        Map mutableMap = toMutableMap(map);
        v0.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, rv.t pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return optimizeReadOnlyMap(linkedHashMap);
    }

    public static <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, TJzY.PeHWvGJzXGJc);
        kotlin.jvm.internal.e0.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> void putAll(Map<? super K, ? super V> map, rv.t pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        Iterator<Object> it = pairs.iterator();
        while (it.hasNext()) {
            tu.v vVar = (tu.v) it.next();
            map.put(vVar.component1(), vVar.component2());
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Iterable<? extends tu.v> iterable, M destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        putAll(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> toMap(tu.v[] vVarArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVarArr, "<this>");
        int length = vVarArr.length;
        if (length == 0) {
            return emptyMap();
        }
        if (length != 1) {
            return toMap(vVarArr, new LinkedHashMap(o1.mapCapacity(vVarArr.length)));
        }
        return o1.mapOf(vVarArr[0]);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(tu.v[] vVarArr, M destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVarArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        putAll(destination, vVarArr);
        return destination;
    }

    public static <K, V> Map<K, V> toMap(rv.t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return optimizeReadOnlyMap(toMap(tVar, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(rv.t tVar, M destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        putAll(destination, tVar);
        return destination;
    }

    public static <K, V> Map<K, V> toMap(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMutableMap(map);
        }
        return o1.toSingletonMap(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Map<? extends K, ? extends V> map, M destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        destination.putAll(map);
        return destination;
    }
}
