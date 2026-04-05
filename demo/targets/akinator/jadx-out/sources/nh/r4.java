package nh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class r4 extends m5 implements q0 {
    public static <K, V> q4 builder() {
        return new q4();
    }

    public static <K, V> q4 builderWithExpectedSize(int i10) {
        jh.i.o(i10, "expectedSize");
        return new q4(i10);
    }

    public static <K, V> r4 copyOf(Map<? extends K, ? extends V> map) {
        return map instanceof r4 ? (r4) map : copyOf((Iterable) map.entrySet());
    }

    public static <K, V> r4 of() {
        return ef.f76224m;
    }

    @SafeVarargs
    public static <K, V> r4 ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    public static <T, K, V> Collector<T, ?, r4> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        int i10 = 0;
        return Collector.of(new v0(i10), new z0(function, function2, i10), new y0(4), new w0(7), new Collector.Characteristics[0]);
    }

    @Deprecated
    public static <T, K, V> Collector<T, ?, m5> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.m5
    public final u4 c() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.q0
    @Deprecated
    public final Object forcePut(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.q0
    public abstract r4 inverse();

    public static <K, V> r4 of(K k10, V v10) {
        jh.i.i(k10, v10);
        return new ef(new Object[]{k10, v10}, 1);
    }

    @Deprecated
    public static <T, K, V> Collector<T, ?, m5> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> r4 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new q4(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable).build();
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        return new ef(new Object[]{k10, v10, k11, v11}, 2);
    }

    @Override // nh.m5, java.util.Map
    public l6 values() {
        return inverse().keySet();
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12}, 3);
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13}, 4);
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, 5);
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, 6);
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        jh.i.i(k16, v16);
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16}, 7);
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        jh.i.i(k16, v16);
        jh.i.i(k17, v17);
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17}, 8);
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        jh.i.i(k10, v10);
        jh.i.i(k11, v11);
        jh.i.i(k12, v12);
        jh.i.i(k13, v13);
        jh.i.i(k14, v14);
        jh.i.i(k15, v15);
        jh.i.i(k16, v16);
        jh.i.i(k17, v17);
        jh.i.i(k18, v18);
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18}, 9);
    }

    public static <K, V> r4 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
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
        return new ef(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19}, 10);
    }
}
