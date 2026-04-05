package nh;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m5 implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final Map.Entry[] f76466g = new Map.Entry[0];

    /* renamed from: b, reason: collision with root package name */
    public transient l6 f76467b;

    /* renamed from: c, reason: collision with root package name */
    public transient l6 f76468c;

    /* renamed from: e, reason: collision with root package name */
    public transient u4 f76469e;

    /* renamed from: f, reason: collision with root package name */
    public transient o6 f76470f;

    public static <K, V> g5 builder() {
        return new g5();
    }

    public static <K, V> g5 builderWithExpectedSize(int i10) {
        jh.i.o(i10, "expectedSize");
        return new g5(i10);
    }

    public static <K, V> m5 copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof m5) && !(map instanceof SortedMap)) {
            m5 m5Var = (m5) map;
            if (!m5Var.f()) {
                return m5Var;
            }
        }
        return copyOf(map.entrySet());
    }

    public static AbstractMap.SimpleImmutableEntry d(Object obj, Object obj2) {
        jh.i.i(obj, obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static <K, V> m5 of() {
        return lf.f76453k;
    }

    @SafeVarargs
    public static <K, V> m5 ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public static <T, K, V> Collector<T, ?, m5> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        return Collector.of(new v0(5), new z0(function, function2, 3), new y0(6), new w0(8), new Collector.Characteristics[0]);
    }

    public abstract l6 a();

    public o6 asMultimap() {
        if (isEmpty()) {
            return o6.of();
        }
        o6 o6Var = this.f76470f;
        if (o6Var != null) {
            return o6Var;
        }
        o6 o6Var2 = new o6(new l5(this), size(), null);
        this.f76470f = o6Var2;
        return o6Var2;
    }

    public abstract l6 b();

    public abstract u4 c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean e() {
        return false;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ec.e(this, obj);
    }

    public abstract boolean f();

    public ej g() {
        return new e5(entrySet().iterator());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return og.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<Object, Object> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return ec.h(this);
    }

    public static <K, V> m5 of(K k10, V v10) {
        jh.i.i(k10, v10);
        return lf.h(1, new Object[]{k10, v10}, null);
    }

    @Override // java.util.Map
    public l6 entrySet() {
        l6 l6Var = this.f76467b;
        if (l6Var != null) {
            return l6Var;
        }
        l6 l6VarA = a();
        this.f76467b = l6VarA;
        return l6VarA;
    }

    @Override // java.util.Map
    public l6 keySet() {
        l6 l6Var = this.f76468c;
        if (l6Var != null) {
            return l6Var;
        }
        l6 l6VarB = b();
        this.f76468c = l6VarB;
        return l6VarB;
    }

    @Override // java.util.Map
    public u4 values() {
        u4 u4Var = this.f76469e;
        if (u4Var != null) {
            return u4Var;
        }
        u4 u4VarC = c();
        this.f76469e = u4VarC;
        return u4VarC;
    }

    public static <K, V> m5 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        g5 g5Var = new g5(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        g5Var.putAll(iterable);
        return g5Var.build();
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        return lf.h(2, new Object[]{k10, v10, k11, v11}, null);
    }

    public static <T, K, V> Collector<T, ?, m5> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        mh.p1.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new v0(9)), new w0(12));
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        return lf.h(3, new Object[]{k10, v10, k11, v11, k12, v12}, null);
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        return lf.h(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13}, null);
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        return lf.h(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, null);
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        return lf.h(6, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, null);
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        jh.i.i(k16, v16);
        return lf.h(7, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16}, null);
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        jh.i.i(k16, v16);
        jh.i.i(k17, v17);
        return lf.h(8, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17}, null);
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        jh.i.i(k16, v16);
        jh.i.i(k17, v17);
        jh.i.i(k18, v18);
        return lf.h(9, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18}, null);
    }

    public static <K, V> m5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        jh.i.i(k16, v16);
        jh.i.i(k17, v17);
        jh.i.i(k18, v18);
        jh.i.i(k19, v19);
        return lf.h(10, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19}, null);
    }
}
