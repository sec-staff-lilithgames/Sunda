package nh;

import com.ironsource.G5;
import io.ktor.http.ContentDisposition;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ec {
    public static Map a(Map map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    public static <A, B> mh.q0 asConverter(q0 q0Var) {
        return new ra(q0Var);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, mh.v0 v0Var) {
        return new qa(set, v0Var);
    }

    public static la b(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        mh.p1.checkNotNull(entry);
        return new la(entry);
    }

    public static int c(int i10) {
        if (i10 < 3) {
            jh.i.o(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(i10 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void d(Map map, Map map2, mh.u0 u0Var, AbstractMap abstractMap, AbstractMap abstractMap2, AbstractMap abstractMap3, AbstractMap abstractMap4) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map2.containsKey(key)) {
                Object objRemove = abstractMap2.remove(key);
                if (u0Var.equivalent(value, objRemove)) {
                    abstractMap3.put(key, value);
                } else {
                    abstractMap4.put(key, new bc(value, objRemove));
                }
            } else {
                abstractMap.put(key, value);
            }
        }
    }

    public static <K, V> r8 difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? difference((SortedMap) map, (Map) map2) : difference(map, map2, mh.u0.equals());
    }

    public static boolean e(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static m5 f(Collection collection) {
        g5 g5Var = new g5(collection.size());
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            g5Var.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return g5Var.buildOrThrow();
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        if (!(map instanceof oa)) {
            return new eb((Map) mh.p1.checkNotNull(map), q1Var);
        }
        oa oaVar = (oa) map;
        return new eb(oaVar.f76530f, mh.g2.and(oaVar.f76531g, q1Var));
    }

    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, mh.q1 q1Var) {
        return filterEntries((NavigableMap) navigableMap, mh.g2.compose(q1Var, wa.f76739b));
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, mh.q1 q1Var) {
        return filterEntries(map, mh.g2.compose(q1Var, wa.f76740c));
    }

    public static m5 fromProperties(Properties properties) {
        g5 g5VarBuilder = m5.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            Object objNextElement = enumerationPropertyNames.nextElement();
            Objects.requireNonNull(objNextElement);
            String str = (String) objNextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            g5VarBuilder.put(str, property);
        }
        return g5VarBuilder.buildOrThrow();
    }

    public static Object g(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static String h(Map map) {
        int size = map.size();
        jh.i.o(size, ContentDisposition.Parameters.Size);
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(G5.T);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public static m5 i(Iterator it, mh.v0 v0Var, g5 g5Var) {
        mh.p1.checkNotNull(v0Var);
        while (it.hasNext()) {
            Object next = it.next();
            g5Var.put(v0Var.apply(next), next);
        }
        try {
            return g5Var.buildOrThrow();
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static <K, V> Map.Entry<K, V> immutableEntry(K k10, V v10) {
        return new AbstractMap.SimpleImmutableEntry(k10, v10);
    }

    public static <K extends Enum<K>, V> m5 immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof v4) {
            return (v4) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return m5.of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        jh.i.i(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            jh.i.i(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return v4.i(enumMap);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) mh.p1.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i10) {
        return new HashMap<>(c(i10));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i10) {
        return new LinkedHashMap<>(c(i10));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, ze zeVar) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != we.natural() && zeVar.hasLowerBound() && zeVar.hasUpperBound()) {
            mh.p1.checkArgument(navigableMap.comparator().compare(zeVar.lowerEndpoint(), zeVar.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        boolean zHasLowerBound = zeVar.hasLowerBound();
        r0 r0Var = r0.f76592c;
        if (zHasLowerBound && zeVar.hasUpperBound()) {
            return navigableMap.subMap(zeVar.lowerEndpoint(), zeVar.lowerBoundType() == r0Var, zeVar.upperEndpoint(), zeVar.upperBoundType() == r0Var);
        }
        if (zeVar.hasLowerBound()) {
            return navigableMap.tailMap(zeVar.lowerEndpoint(), zeVar.lowerBoundType() == r0Var);
        }
        if (zeVar.hasUpperBound()) {
            return navigableMap.headMap(zeVar.upperEndpoint(), zeVar.upperBoundType() == r0Var);
        }
        return (NavigableMap) mh.p1.checkNotNull(navigableMap);
    }

    public static <K, V> q0 synchronizedBiMap(q0 q0Var) {
        return ((q0Var instanceof di) || (q0Var instanceof r4)) ? q0Var : new di(q0Var, null, null);
    }

    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return new li(navigableMap, null);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, m5> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        return Collector.of(new v0(4), new z0(function, function2, 2), new y0(5), new w0(6), Collector.Characteristics.UNORDERED);
    }

    public static <K, V> m5 toMap(Iterable<K> iterable, mh.v0 v0Var) {
        return toMap(iterable.iterator(), v0Var);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, ya yaVar) {
        return new ub(map, yaVar);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        return transformEntries(map, new ga(v0Var, 2));
    }

    public static <K, V> m5 uniqueIndex(Iterable<V> iterable, mh.v0 v0Var) {
        return iterable instanceof Collection ? i(iterable.iterator(), v0Var, m5.builderWithExpectedSize(((Collection) iterable).size())) : uniqueIndex(iterable.iterator(), v0Var);
    }

    public static <K, V> q0 unmodifiableBiMap(q0 q0Var) {
        return new xb(q0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        mh.p1.checkNotNull(navigableMap);
        return navigableMap instanceof ac ? navigableMap : new ac(navigableMap);
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, mh.v0 v0Var) {
        return new rb(sortedSet, v0Var);
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <K, V> m5 toMap(Iterator<K> it, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        g5 g5VarBuilder = m5.builder();
        while (it.hasNext()) {
            K next = it.next();
            g5VarBuilder.put(next, v0Var.apply(next));
        }
        return g5VarBuilder.buildKeepingLast();
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, ya yaVar) {
        return new wb(sortedMap, yaVar);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, mh.q1 q1Var) {
        return filterEntries((SortedMap) sortedMap, mh.g2.compose(q1Var, wa.f76739b));
    }

    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, mh.q1 q1Var) {
        return filterEntries((NavigableMap) navigableMap, mh.g2.compose(q1Var, wa.f76740c));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        return transformEntries((SortedMap) sortedMap, (ya) new ga(v0Var, 0));
    }

    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, mh.v0 v0Var) {
        return new pb(navigableSet, v0Var);
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, ya yaVar) {
        return new vb(navigableMap, yaVar);
    }

    public static <K, V> r8 difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, mh.u0 u0Var) {
        mh.p1.checkNotNull(u0Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        d(map, map2, u0Var, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        return new ob(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        mh.q1 q1VarCompose = mh.g2.compose(q1Var, wa.f76739b);
        if (map instanceof oa) {
            oa oaVar = (oa) map;
            return new eb(oaVar.f76530f, mh.g2.and(oaVar.f76531g, q1VarCompose));
        }
        return new jb((Map) mh.p1.checkNotNull(map), q1Var, q1VarCompose);
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, mh.q1 q1Var) {
        return filterEntries((SortedMap) sortedMap, mh.g2.compose(q1Var, wa.f76740c));
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, m5> toImmutableEnumMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        mh.p1.checkNotNull(binaryOperator);
        int i10 = 6;
        return Collector.of(new b1(binaryOperator, 2), new z0(function, function2, i10), new y0(5), new w0(i10), new Collector.Characteristics[0]);
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        return transformEntries((NavigableMap) navigableMap, (ya) new ga(v0Var, 1));
    }

    public static <K, V> m5 uniqueIndex(Iterator<V> it, mh.v0 v0Var) {
        return i(it, v0Var, m5.builder());
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        if (sortedMap instanceof ib) {
            ib ibVar = (ib) sortedMap;
            return new ib((SortedMap) ibVar.f76530f, mh.g2.and(ibVar.f76531g, q1Var));
        }
        return new ib((SortedMap) mh.p1.checkNotNull(sortedMap), q1Var);
    }

    public static <K, V> q0 filterValues(q0 q0Var, mh.q1 q1Var) {
        return filterEntries(q0Var, mh.g2.compose(q1Var, wa.f76740c));
    }

    public static <K, V> dh difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        mh.p1.checkNotNull(sortedMap);
        mh.p1.checkNotNull(map);
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = we.natural();
        }
        TreeMap treeMapNewTreeMap = newTreeMap(comparator);
        TreeMap treeMapNewTreeMap2 = newTreeMap(comparator);
        treeMapNewTreeMap2.putAll(map);
        TreeMap treeMapNewTreeMap3 = newTreeMap(comparator);
        TreeMap treeMapNewTreeMap4 = newTreeMap(comparator);
        d(sortedMap, map, mh.u0.equals(), treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new tb(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    public static <K, V> q0 filterKeys(q0 q0Var, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        return filterEntries(q0Var, mh.g2.compose(q1Var, wa.f76739b));
    }

    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        if (navigableMap instanceof gb) {
            gb gbVar = (gb) navigableMap;
            return new gb(gbVar.f76296b, mh.g2.and(gbVar.f76297c, q1Var));
        }
        return new gb((NavigableMap) mh.p1.checkNotNull(navigableMap), q1Var);
    }

    public static <K, V> q0 filterEntries(q0 q0Var, mh.q1 q1Var) {
        mh.p1.checkNotNull(q0Var);
        mh.p1.checkNotNull(q1Var);
        if (q0Var instanceof za) {
            za zaVar = (za) q0Var;
            return new za((q0) zaVar.f76530f, mh.g2.and(zaVar.f76531g, q1Var));
        }
        return new za(q0Var, q1Var);
    }
}
