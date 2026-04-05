package io.odeeo.internal.u0;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j0<K, V> extends g<K, V> implements l0<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public final e2<K, V> f66894f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.t0.v<? super K> f66895g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<K, V> extends r0<V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f66896a;

        public a(K k10) {
            this.f66896a = k10;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean add(V v10) {
            add(0, v10);
            return true;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // io.odeeo.internal.u0.r0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: c */
        public List<V> delegate() {
            return Collections.EMPTY_LIST;
        }

        @Override // io.odeeo.internal.u0.r0, java.util.List
        public void add(int i10, V v10) {
            io.odeeo.internal.t0.u.checkPositionIndex(i10, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f66896a);
        }

        @Override // io.odeeo.internal.u0.r0, java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            io.odeeo.internal.t0.u.checkNotNull(collection);
            io.odeeo.internal.t0.u.checkPositionIndex(i10, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f66896a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<K, V> extends y0<V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f66897a;

        public b(K k10) {
            this.f66897a = k10;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean add(V v10) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f66897a);
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends V> collection) {
            io.odeeo.internal.t0.u.checkNotNull(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f66897a);
        }

        @Override // io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: c */
        public Set<V> delegate() {
            return Collections.EMPTY_SET;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends p0<Map.Entry<K, V>> {
        public c() {
        }

        @Override // io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: a */
        public Collection<Map.Entry<K, V>> delegate() {
            return s.filter(j0.this.f66894f.entries(), j0.this.entryPredicate());
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, io.odeeo.internal.u0.h2
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (j0.this.f66894f.containsKey(entry.getKey()) && j0.this.f66895g.apply((Object) entry.getKey())) {
                return j0.this.f66894f.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }
    }

    public j0(e2<K, V> e2Var, io.odeeo.internal.t0.v<? super K> vVar) {
        this.f66894f = (e2) io.odeeo.internal.t0.u.checkNotNull(e2Var);
        this.f66895g = (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar);
    }

    @Override // io.odeeo.internal.u0.g
    public Map<K, Collection<V>> a() {
        return d2.filterKeys(this.f66894f.asMap(), this.f66895g);
    }

    @Override // io.odeeo.internal.u0.g
    public Collection<Map.Entry<K, V>> b() {
        return new c();
    }

    @Override // io.odeeo.internal.u0.g
    public Set<K> c() {
        return e3.filter(this.f66894f.keySet(), this.f66895g);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public void clear() {
        keySet().clear();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public boolean containsKey(Object obj) {
        if (this.f66894f.containsKey(obj)) {
            return this.f66895g.apply(obj);
        }
        return false;
    }

    @Override // io.odeeo.internal.u0.g
    public h2<K> d() {
        return i2.filter(this.f66894f.keys(), this.f66895g);
    }

    @Override // io.odeeo.internal.u0.g
    public Collection<V> e() {
        return new m0(this);
    }

    @Override // io.odeeo.internal.u0.l0
    public io.odeeo.internal.t0.v<? super Map.Entry<K, V>> entryPredicate() {
        return d2.a(this.f66895g);
    }

    @Override // io.odeeo.internal.u0.g
    public Iterator<Map.Entry<K, V>> f() {
        throw new AssertionError("should never be called");
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> get(K k10) {
        return this.f66895g.apply(k10) ? this.f66894f.get(k10) : this.f66894f instanceof d3 ? new b(k10) : new a(k10);
    }

    public Collection<V> h() {
        return this.f66894f instanceof d3 ? q1.of() : h1.of();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> removeAll(Object obj) {
        return containsKey(obj) ? this.f66894f.removeAll(obj) : h();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public int size() {
        Iterator<Collection<V>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public e2<K, V> unfiltered() {
        return this.f66894f;
    }
}
