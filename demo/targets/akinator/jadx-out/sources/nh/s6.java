package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s6 extends m5 implements NavigableMap {

    /* renamed from: k, reason: collision with root package name */
    public static final we f76626k = we.natural();

    /* renamed from: l, reason: collision with root package name */
    public static final s6 f76627l = new s6(u6.n(we.natural()), b5.of(), null);

    /* renamed from: h, reason: collision with root package name */
    public final transient pf f76628h;

    /* renamed from: i, reason: collision with root package name */
    public final transient b5 f76629i;

    /* renamed from: j, reason: collision with root package name */
    public final transient s6 f76630j;

    public s6(pf pfVar, b5 b5Var, s6 s6Var) {
        this.f76628h = pfVar;
        this.f76629i = b5Var;
        this.f76630j = s6Var;
    }

    @Deprecated
    public static <K, V> r6 builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> r6 builderWithExpectedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> s6 copyOf(Map<? extends K, ? extends V> map) {
        return h(map, f76626k);
    }

    public static <K, V> s6 copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f76626k;
        }
        if (sortedMap instanceof s6) {
            s6 s6Var = (s6) sortedMap;
            if (!s6Var.f()) {
                return s6Var;
            }
        }
        Set<Map.Entry<K, ? extends V>> setEntrySet = sortedMap.entrySet();
        Map.Entry[] entryArr = (Map.Entry[]) (setEntrySet instanceof Collection ? setEntrySet : p8.newArrayList(setEntrySet.iterator())).toArray(m5.f76466g);
        return j(comparator, true, entryArr, entryArr.length);
    }

    public static s6 h(Map map, Comparator comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f76626k) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof s6)) {
            s6 s6Var = (s6) map;
            if (!s6Var.f()) {
                return s6Var;
            }
        }
        Set setEntrySet = map.entrySet();
        Map.Entry[] entryArr = (Map.Entry[]) (setEntrySet instanceof Collection ? setEntrySet : p8.newArrayList(setEntrySet.iterator())).toArray(m5.f76466g);
        return j(comparator, zEquals, entryArr, entryArr.length);
    }

    public static s6 i(Comparator comparator) {
        return we.natural().equals(comparator) ? of() : new s6(u6.n(comparator), b5.of(), null);
    }

    public static s6 j(Comparator comparator, boolean z10, Map.Entry[] entryArr, int i10) {
        if (i10 == 0) {
            return i(comparator);
        }
        int i11 = 1;
        if (i10 == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            return m(comparator, entry.getKey(), entry.getValue());
        }
        Object[] objArr = new Object[i10];
        Object[] objArr2 = new Object[i10];
        if (z10) {
            for (int i12 = 0; i12 < i10; i12++) {
                Map.Entry entry2 = entryArr[i12];
                Objects.requireNonNull(entry2);
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                jh.i.i(key, value);
                objArr[i12] = key;
                objArr2[i12] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i10, new com.google.android.exoplayer2.ui.v0(comparator, 2));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            jh.i.i(objArr[0], value2);
            while (i11 < i10) {
                Map.Entry entry4 = entryArr[i11 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i11];
                Objects.requireNonNull(entry5);
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                jh.i.i(key3, value3);
                objArr[i11] = key3;
                objArr2[i11] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + entry4 + " and " + entry5);
                }
                i11++;
                key2 = key3;
            }
        }
        return new s6(new pf(b5.f(i10, objArr), comparator), b5.f(i10, objArr2), null);
    }

    public static s6 k(Map.Entry... entryArr) {
        return j(we.natural(), false, entryArr, entryArr.length);
    }

    public static s6 m(Comparator comparator, Object obj, Object obj2) {
        return new s6(new pf(b5.of(obj), (Comparator) mh.p1.checkNotNull(comparator)), b5.of(obj2), null);
    }

    public static <K extends Comparable<?>, V> r6 naturalOrder() {
        return new r6(we.natural());
    }

    public static <K, V> s6 of() {
        return f76627l;
    }

    @SafeVarargs
    @Deprecated
    public static <K, V> s6 ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> r6 orderedBy(Comparator<K> comparator) {
        return new r6(comparator);
    }

    public static <K extends Comparable<?>, V> r6 reverseOrder() {
        return new r6(we.natural().reverse());
    }

    @Deprecated
    public static <T, K, V> Collector<T, ?, m5> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    public static <T, K, V> Collector<T, ?, s6> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(comparator);
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        return Collector.of(new d1(comparator, 1), new z0(function, function2, 8), new y0(12), new w0(13), Collector.Characteristics.UNORDERED);
    }

    @Override // nh.m5
    public final l6 a() {
        return isEmpty() ? l6.of() : new q6(this);
    }

    @Override // nh.m5
    public final l6 b() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.m5
    public final u4 c() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return ec.g(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return keySet().comparator();
    }

    @Override // nh.m5
    public final boolean f() {
        return this.f76628h.f76568g.isPartialView() || this.f76629i.isPartialView();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return ec.g(floorEntry(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    @Override // nh.m5, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            nh.pf r0 = r3.f76628h
            r0.getClass()
            r1 = -1
            if (r4 != 0) goto La
        L8:
            r4 = r1
            goto L14
        La:
            nh.b5 r2 = r0.f76568g     // Catch: java.lang.ClassCastException -> L8
            java.util.Comparator r0 = r0.f76685e     // Catch: java.lang.ClassCastException -> L8
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L8
            if (r4 < 0) goto L8
        L14:
            if (r4 != r1) goto L18
            r4 = 0
            goto L1e
        L18:
            nh.b5 r0 = r3.f76629i
            java.lang.Object r4 = r0.get(r4)
        L1e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.s6.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return ec.g(higherEntry(obj));
    }

    public final s6 l(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 == i11 ? i(comparator()) : new s6(this.f76628h.r(i10, i11), this.f76629i.subList(i10, i11), null);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return ec.g(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<Object, Object> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<Object, Object> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f76629i.size();
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10) {
        return m(we.natural(), k10, v10);
    }

    @Deprecated
    public static <T, K, V> Collector<T, ?, m5> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public u6 descendingKeySet() {
        return this.f76628h.descendingSet();
    }

    @Override // java.util.NavigableMap
    public s6 descendingMap() {
        s6 s6Var = this.f76630j;
        return s6Var == null ? isEmpty() ? i(we.from(comparator()).reverse()) : new s6((pf) this.f76628h.descendingSet(), this.f76629i.reverse(), this) : s6Var;
    }

    @Override // nh.m5, java.util.Map
    public l6 entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public u6 navigableKeySet() {
        return this.f76628h;
    }

    @Override // nh.m5, java.util.Map
    public u4 values() {
        return this.f76629i;
    }

    public static <K, V> s6 copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return h(map, (Comparator) mh.p1.checkNotNull(comparator));
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11) {
        return k(m5.d(k10, v10), m5.d(k11, v11));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public s6 headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // nh.m5, java.util.Map
    public u6 keySet() {
        return this.f76628h;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public s6 subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public s6 tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public static <K, V> s6 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, f76626k);
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12));
    }

    @Override // java.util.NavigableMap
    public s6 headMap(Object obj, boolean z10) {
        return l(0, this.f76628h.s(mh.p1.checkNotNull(obj), z10));
    }

    @Override // java.util.NavigableMap
    public s6 subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        mh.p1.checkNotNull(obj);
        mh.p1.checkNotNull(obj2);
        mh.p1.checkArgument(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z11).tailMap(obj, z10);
    }

    @Override // java.util.NavigableMap
    public s6 tailMap(Object obj, boolean z10) {
        return l(this.f76628h.t(mh.p1.checkNotNull(obj), z10), size());
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12), m5.d(k13, v13));
    }

    public static <K, V> s6 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        Collection collectionNewArrayList;
        Comparator comparator2 = (Comparator) mh.p1.checkNotNull(comparator);
        if (iterable instanceof Collection) {
            collectionNewArrayList = (Collection) iterable;
        } else {
            collectionNewArrayList = p8.newArrayList(iterable.iterator());
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionNewArrayList.toArray(m5.f76466g);
        return j(comparator2, false, entryArr, entryArr.length);
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12), m5.d(k13, v13), m5.d(k14, v14));
    }

    public static <T, K, V> Collector<T, ?, s6> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(comparator);
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        mh.p1.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new d1(comparator, 2)), new w0(14));
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12), m5.d(k13, v13), m5.d(k14, v14), m5.d(k15, v15));
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12), m5.d(k13, v13), m5.d(k14, v14), m5.d(k15, v15), m5.d(k16, v16));
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12), m5.d(k13, v13), m5.d(k14, v14), m5.d(k15, v15), m5.d(k16, v16), m5.d(k17, v17));
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12), m5.d(k13, v13), m5.d(k14, v14), m5.d(k15, v15), m5.d(k16, v16), m5.d(k17, v17), m5.d(k18, v18));
    }

    public static <K extends Comparable<? super K>, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        return k(m5.d(k10, v10), m5.d(k11, v11), m5.d(k12, v12), m5.d(k13, v13), m5.d(k14, v14), m5.d(k15, v15), m5.d(k16, v16), m5.d(k17, v17), m5.d(k18, v18), m5.d(k19, v19));
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <K, V> s6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        throw new UnsupportedOperationException();
    }
}
