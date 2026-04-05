package io.odeeo.internal.u0;

import io.odeeo.internal.u0.j1;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f1<K extends Enum<K>, V> extends j1.c<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public final transient EnumMap<K, V> f66768f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final EnumMap<K, V> f66769a;

        public b(EnumMap<K, V> enumMap) {
            this.f66769a = enumMap;
        }

        public Object readResolve() {
            return new f1(this.f66769a);
        }
    }

    public static <K extends Enum<K>, V> j1<K, V> a(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return j1.of();
        }
        if (size != 1) {
            return new f1(enumMap);
        }
        Map.Entry entry = (Map.Entry) v1.getOnlyElement(enumMap.entrySet());
        return j1.of(entry.getKey(), entry.getValue());
    }

    @Override // io.odeeo.internal.u0.j1, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f66768f.containsKey(obj);
    }

    @Override // io.odeeo.internal.u0.j1
    public boolean e() {
        return false;
    }

    @Override // io.odeeo.internal.u0.j1, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            obj = ((f1) obj).f66768f;
        }
        return this.f66768f.equals(obj);
    }

    @Override // io.odeeo.internal.u0.j1
    public q3<K> f() {
        return w1.unmodifiableIterator(this.f66768f.keySet().iterator());
    }

    @Override // io.odeeo.internal.u0.j1.c
    public q3<Map.Entry<K, V>> g() {
        return d2.b(this.f66768f.entrySet().iterator());
    }

    @Override // io.odeeo.internal.u0.j1, java.util.Map
    public V get(Object obj) {
        return this.f66768f.get(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f66768f.size();
    }

    @Override // io.odeeo.internal.u0.j1
    public Object writeReplace() {
        return new b(this.f66768f);
    }

    public f1(EnumMap<K, V> enumMap) {
        this.f66768f = enumMap;
        io.odeeo.internal.t0.u.checkArgument(!enumMap.isEmpty());
    }
}
