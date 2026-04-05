package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o6 extends y5 implements sf {

    /* renamed from: j, reason: collision with root package name */
    public final transient l6 f76521j;

    /* renamed from: k, reason: collision with root package name */
    public transient o6 f76522k;

    /* renamed from: l, reason: collision with root package name */
    public transient n6 f76523l;

    public o6(m5 m5Var, int i10, Comparator comparator) {
        super(i10, m5Var);
        this.f76521j = comparator == null ? l6.of() : u6.n(comparator);
    }

    public static <K, V> m6 builder() {
        return new m6();
    }

    public static <K, V> m6 builderWithExpectedKeys(int i10) {
        jh.i.o(i10, "expectedKeys");
        return new m6(i10);
    }

    public static <K, V> o6 copyOf(fc fcVar) {
        mh.p1.checkNotNull(fcVar);
        if (fcVar.isEmpty()) {
            return of();
        }
        if (fcVar instanceof o6) {
            o6 o6Var = (o6) fcVar;
            if (!o6Var.f76784h.f()) {
                return o6Var;
            }
        }
        Set<Map.Entry<Object, Collection<Object>>> setEntrySet = fcVar.asMap().entrySet();
        if (setEntrySet.isEmpty()) {
            return of();
        }
        g5 g5Var = new g5(setEntrySet.size());
        int size = 0;
        for (Map.Entry<Object, Collection<Object>> entry : setEntrySet) {
            Object key = entry.getKey();
            l6 l6VarCopyOf = l6.copyOf((Collection) entry.getValue());
            if (!l6VarCopyOf.isEmpty()) {
                g5Var.put(key, l6VarCopyOf);
                size = l6VarCopyOf.size() + size;
            }
        }
        return new o6(g5Var.buildOrThrow(), size, null);
    }

    public static <T, K, V> Collector<T, ?, o6> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        a1 a1Var = new a1(function, 2);
        a1 a1Var2 = new a1(function2, 3);
        vc vcVarLinkedHashSetValues = yc.linkedHashKeys().linkedHashSetValues();
        Objects.requireNonNull(vcVarLinkedHashSetValues);
        return Collectors.collectingAndThen(i1.a(a1Var, a1Var2, new b1(vcVarLinkedHashSetValues, 1)), new w0(5));
    }

    public static <K, V> o6 of() {
        return d3.f76172m;
    }

    public static <T, K, V> Collector<T, ?, o6> toImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function, "keyFunction");
        mh.p1.checkNotNull(function2, "valueFunction");
        return Collector.of(new v0(8), new z0(function, function2, 5), new y0(9), new w0(11), new Collector.Characteristics[0]);
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    public static <K, V> o6 of(K k10, V v10) {
        m6 m6VarBuilder = builder();
        m6VarBuilder.put((Object) k10, (Object) v10);
        return m6VarBuilder.build();
    }

    @Override // nh.y5
    public o6 inverse() {
        o6 o6Var = this.f76522k;
        if (o6Var != null) {
            return o6Var;
        }
        m6 m6VarBuilder = builder();
        ej it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m6VarBuilder.put(entry.getValue(), entry.getKey());
        }
        o6 o6VarBuild = m6VarBuilder.build();
        o6VarBuild.f76522k = this;
        this.f76522k = o6VarBuild;
        return o6VarBuild;
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public /* bridge */ /* synthetic */ u4 replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.y5, nh.e0, nh.fc
    public l6 entries() {
        n6 n6Var = this.f76523l;
        if (n6Var != null) {
            return n6Var;
        }
        n6 n6Var2 = new n6(this);
        this.f76523l = n6Var2;
        return n6Var2;
    }

    @Override // nh.y5, nh.p0, nh.e0, nh.fc, nh.c8
    public l6 get(Object obj) {
        return (l6) mh.g1.firstNonNull((l6) this.f76784h.get(obj), this.f76521j);
    }

    @Override // nh.y5, nh.p0, nh.e0, nh.fc, nh.c8
    @Deprecated
    public final l6 removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public final l6 replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> o6 of(K k10, V v10, K k11, V v11) {
        m6 m6VarBuilder = builder();
        m6VarBuilder.put((Object) k10, (Object) v10);
        m6VarBuilder.put((Object) k11, (Object) v11);
        return m6VarBuilder.build();
    }

    public static <K, V> o6 of(K k10, V v10, K k11, V v11, K k12, V v12) {
        m6 m6VarBuilder = builder();
        m6VarBuilder.put((Object) k10, (Object) v10);
        m6VarBuilder.put((Object) k11, (Object) v11);
        m6VarBuilder.put((Object) k12, (Object) v12);
        return m6VarBuilder.build();
    }

    public static <K, V> o6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        m6 m6VarBuilder = builder();
        m6VarBuilder.put((Object) k10, (Object) v10);
        m6VarBuilder.put((Object) k11, (Object) v11);
        m6VarBuilder.put((Object) k12, (Object) v12);
        m6VarBuilder.put((Object) k13, (Object) v13);
        return m6VarBuilder.build();
    }

    public static <K, V> o6 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new m6().putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable).build();
    }

    public static <K, V> o6 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        m6 m6VarBuilder = builder();
        m6VarBuilder.put((Object) k10, (Object) v10);
        m6VarBuilder.put((Object) k11, (Object) v11);
        m6VarBuilder.put((Object) k12, (Object) v12);
        m6VarBuilder.put((Object) k13, (Object) v13);
        m6VarBuilder.put((Object) k14, (Object) v14);
        return m6VarBuilder.build();
    }
}
