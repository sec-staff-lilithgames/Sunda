package nh;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d5 extends y5 implements c8 {

    /* renamed from: j, reason: collision with root package name */
    public transient d5 f76174j;

    public static <K, V> c5 builder() {
        return new c5();
    }

    public static <K, V> c5 builderWithExpectedKeys(int i10) {
        jh.i.o(i10, "expectedKeys");
        return new c5(i10);
    }

    public static <K, V> d5 copyOf(fc fcVar) {
        if (fcVar.isEmpty()) {
            return of();
        }
        if (fcVar instanceof d5) {
            d5 d5Var = (d5) fcVar;
            if (!d5Var.f76784h.f()) {
                return d5Var;
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
            b5 b5VarCopyOf = b5.copyOf((Collection) entry.getValue());
            if (!b5VarCopyOf.isEmpty()) {
                g5Var.put(key, b5VarCopyOf);
                size = b5VarCopyOf.size() + size;
            }
        }
        return new d5(size, g5Var.buildOrThrow());
    }

    public static <T, K, V> Collector<T, ?, d5> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        a1 a1Var = new a1(function, 0);
        a1 a1Var2 = new a1(function2, 1);
        nc ncVarArrayListValues = yc.linkedHashKeys().arrayListValues();
        Objects.requireNonNull(ncVarArrayListValues);
        return Collectors.collectingAndThen(i1.a(a1Var, a1Var2, new b1(ncVarArrayListValues, 0)), new w0(3));
    }

    public static <K, V> d5 of() {
        return c3.f76149k;
    }

    public static <T, K, V> Collector<T, ?, d5> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function, "keyFunction");
        mh.p1.checkNotNull(function2, "valueFunction");
        return Collector.of(new v0(6), new z0(function, function2, 4), new y0(8), new w0(10), new Collector.Characteristics[0]);
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    public static <K, V> d5 of(K k10, V v10) {
        c5 c5VarBuilder = builder();
        c5VarBuilder.put((Object) k10, (Object) v10);
        return c5VarBuilder.build();
    }

    @Override // nh.y5
    public d5 inverse() {
        d5 d5Var = this.f76174j;
        if (d5Var != null) {
            return d5Var;
        }
        c5 c5VarBuilder = builder();
        ej it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c5VarBuilder.put(entry.getValue(), entry.getKey());
        }
        d5 d5VarBuild = c5VarBuilder.build();
        d5VarBuild.f76174j = this;
        this.f76174j = d5VarBuild;
        return d5VarBuild;
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public /* bridge */ /* synthetic */ u4 replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.y5, nh.p0, nh.e0, nh.fc, nh.c8
    public b5 get(Object obj) {
        b5 b5Var = (b5) this.f76784h.get(obj);
        return b5Var == null ? b5.of() : b5Var;
    }

    @Override // nh.y5, nh.p0, nh.e0, nh.fc, nh.c8
    @Deprecated
    public final b5 removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.y5, nh.e0, nh.fc, nh.c8
    @Deprecated
    public final b5 replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> d5 of(K k10, V v10, K k11, V v11) {
        c5 c5VarBuilder = builder();
        c5VarBuilder.put((Object) k10, (Object) v10);
        c5VarBuilder.put((Object) k11, (Object) v11);
        return c5VarBuilder.build();
    }

    public static <K, V> d5 of(K k10, V v10, K k11, V v11, K k12, V v12) {
        c5 c5VarBuilder = builder();
        c5VarBuilder.put((Object) k10, (Object) v10);
        c5VarBuilder.put((Object) k11, (Object) v11);
        c5VarBuilder.put((Object) k12, (Object) v12);
        return c5VarBuilder.build();
    }

    public static <K, V> d5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        c5 c5VarBuilder = builder();
        c5VarBuilder.put((Object) k10, (Object) v10);
        c5VarBuilder.put((Object) k11, (Object) v11);
        c5VarBuilder.put((Object) k12, (Object) v12);
        c5VarBuilder.put((Object) k13, (Object) v13);
        return c5VarBuilder.build();
    }

    public static <K, V> d5 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new c5().putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable).build();
    }

    public static <K, V> d5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        c5 c5VarBuilder = builder();
        c5VarBuilder.put((Object) k10, (Object) v10);
        c5VarBuilder.put((Object) k11, (Object) v11);
        c5VarBuilder.put((Object) k12, (Object) v12);
        c5VarBuilder.put((Object) k13, (Object) v13);
        c5VarBuilder.put((Object) k14, (Object) v14);
        return c5VarBuilder.build();
    }
}
