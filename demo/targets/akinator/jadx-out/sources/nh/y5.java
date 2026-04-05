package nh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y5 extends p0 implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final transient m5 f76784h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f76785i;

    public y5(int i10, m5 m5Var) {
        this.f76784h = m5Var;
        this.f76785i = i10;
    }

    public static <K, V> u5 builder() {
        return new u5();
    }

    public static <K, V> u5 builderWithExpectedKeys(int i10) {
        jh.i.o(i10, "expectedKeys");
        return new u5(i10);
    }

    public static <K, V> y5 copyOf(fc fcVar) {
        if (fcVar instanceof y5) {
            y5 y5Var = (y5) fcVar;
            if (!y5Var.f76784h.f()) {
                return y5Var;
            }
        }
        return d5.copyOf(fcVar);
    }

    public static <K, V> y5 of() {
        return d5.of();
    }

    @Override // nh.e0
    public final Map a() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.e0
    public final Collection b() {
        return new v5(this);
    }

    @Override // nh.e0
    public final Set c() {
        throw new AssertionError("unreachable");
    }

    @Override // nh.p0, nh.e0, nh.fc
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // nh.p0, nh.e0, nh.fc
    public boolean containsKey(Object obj) {
        return this.f76784h.containsKey(obj);
    }

    @Override // nh.e0, nh.fc
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // nh.e0
    public final ud d() {
        return new w5(this);
    }

    @Override // nh.e0
    public final Collection e() {
        return new x5(this);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // nh.e0
    public final Iterator f() {
        return new s5(this);
    }

    @Override // nh.p0, nh.e0, nh.fc, nh.c8
    public abstract u4 get(Object obj);

    @Override // nh.e0, nh.fc
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract y5 inverse();

    @Override // nh.e0, nh.fc
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // nh.e0, nh.fc, nh.c8
    @Deprecated
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    @Deprecated
    public final boolean putAll(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc, nh.c8
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.p0, nh.e0, nh.fc
    public int size() {
        return this.f76785i;
    }

    @Override // nh.e0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> y5 of(K k10, V v10) {
        return d5.of((Object) k10, (Object) v10);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public m5 asMap() {
        return this.f76784h;
    }

    @Override // nh.e0, nh.fc
    public u4 entries() {
        return (u4) super.entries();
    }

    @Override // nh.e0, nh.fc
    public l6 keySet() {
        return this.f76784h.keySet();
    }

    @Override // nh.e0, nh.fc
    public d6 keys() {
        return (d6) super.keys();
    }

    @Override // nh.e0, nh.fc
    @Deprecated
    public final boolean putAll(fc fcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.p0, nh.e0, nh.fc, nh.c8
    @Deprecated
    public u4 removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc, nh.c8
    @Deprecated
    public u4 replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    public u4 values() {
        return (u4) super.values();
    }

    public static <K, V> y5 of(K k10, V v10, K k11, V v11) {
        return d5.of((Object) k10, (Object) v10, (Object) k11, (Object) v11);
    }

    public static <K, V> y5 of(K k10, V v10, K k11, V v11, K k12, V v12) {
        return d5.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12);
    }

    public static <K, V> y5 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return d5.copyOf((Iterable) iterable);
    }

    public static <K, V> y5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return d5.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13);
    }

    public static <K, V> y5 of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return d5.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13, (Object) k14, (Object) v14);
    }
}
