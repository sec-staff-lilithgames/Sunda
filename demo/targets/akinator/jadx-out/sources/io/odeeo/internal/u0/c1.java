package io.odeeo.internal.u0;

import io.odeeo.internal.u0.j1;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c1<K, V> extends j1<K, V> implements n<K, V> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<K, V> extends j1.b<K, V> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.j1.b
        public /* bridge */ /* synthetic */ j1.b put(Object obj, Object obj2) {
            return put((a<K, V>) obj, obj2);
        }

        public a(int i10) {
            super(i10);
        }

        @Override // io.odeeo.internal.u0.j1.b
        public c1<K, V> build() {
            if (this.f66908c == 0) {
                return c1.of();
            }
            a();
            this.f66909d = true;
            return new u2(this.f66907b, this.f66908c);
        }

        @Override // io.odeeo.internal.u0.j1.b
        public a<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue((Comparator) comparator);
            return this;
        }

        @Override // io.odeeo.internal.u0.j1.b
        public a<K, V> put(K k10, V v10) {
            super.put((a<K, V>) k10, (K) v10);
            return this;
        }

        @Override // io.odeeo.internal.u0.j1.b
        public a<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // io.odeeo.internal.u0.j1.b
        public a<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // io.odeeo.internal.u0.j1.b
        public a<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends j1.e {
        private static final long serialVersionUID = 0;

        public b(c1<?, ?> c1Var) {
            super(c1Var);
        }

        @Override // io.odeeo.internal.u0.j1.e
        public Object readResolve() {
            return a(new a());
        }
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> a<K, V> builderWithExpectedSize(int i10) {
        r.a(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <K, V> c1<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof c1) {
            c1<K, V> c1Var = (c1) map;
            if (!c1Var.e()) {
                return c1Var;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> c1<K, V> of() {
        return u2.f67098k;
    }

    @Override // io.odeeo.internal.u0.n
    @Deprecated
    public V forcePut(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.j1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final q1<V> c() {
        throw new AssertionError("should never be called");
    }

    @Override // io.odeeo.internal.u0.n
    public abstract c1<V, K> inverse();

    @Override // io.odeeo.internal.u0.j1
    public Object writeReplace() {
        return new b(this);
    }

    public static <K, V> c1<K, V> of(K k10, V v10) {
        r.a(k10, v10);
        return new u2(new Object[]{k10, v10}, 1);
    }

    public static <K, V> c1<K, V> of(K k10, V v10, K k11, V v11) {
        r.a(k10, v10);
        r.a(k11, v11);
        return new u2(new Object[]{k10, v10, k11, v11}, 2);
    }

    @Override // io.odeeo.internal.u0.j1, java.util.Map
    public q1<V> values() {
        return inverse().keySet();
    }

    public static <K, V> c1<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable) iterable).build();
    }

    public static <K, V> c1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        r.a(k10, v10);
        r.a(k11, v11);
        r.a(k12, v12);
        return new u2(new Object[]{k10, v10, k11, v11, k12, v12}, 3);
    }

    public static <K, V> c1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        r.a(k10, v10);
        r.a(k11, v11);
        r.a(k12, v12);
        r.a(k13, v13);
        return new u2(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13}, 4);
    }

    public static <K, V> c1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        r.a(k10, v10);
        r.a(k11, v11);
        r.a(k12, v12);
        r.a(k13, v13);
        r.a(k14, v14);
        return new u2(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, 5);
    }
}
