package io.odeeo.internal.u0;

import io.odeeo.internal.u0.g2;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g<K, V> implements e2<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public transient Collection<Map.Entry<K, V>> f66794a;

    /* renamed from: b, reason: collision with root package name */
    public transient Set<K> f66795b;

    /* renamed from: c, reason: collision with root package name */
    public transient h2<K> f66796c;

    /* renamed from: d, reason: collision with root package name */
    public transient Collection<V> f66797d;

    /* renamed from: e, reason: collision with root package name */
    public transient Map<K, Collection<V>> f66798e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends g2.f<K, V> {
        public a() {
        }

        @Override // io.odeeo.internal.u0.g2.f
        public e2<K, V> a() {
            return g.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return g.this.f();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends g<K, V>.a implements Set<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return e3.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return e3.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return g.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return g.this.size();
        }
    }

    public abstract Map<K, Collection<V>> a();

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f66798e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapA = a();
        this.f66798e = mapA;
        return mapA;
    }

    public abstract Collection<Map.Entry<K, V>> b();

    public abstract Set<K> c();

    @Override // io.odeeo.internal.u0.e2
    public abstract /* synthetic */ void clear();

    @Override // io.odeeo.internal.u0.e2
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // io.odeeo.internal.u0.e2
    public abstract /* synthetic */ boolean containsKey(Object obj);

    @Override // io.odeeo.internal.u0.e2
    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract h2<K> d();

    public abstract Collection<V> e();

    @Override // io.odeeo.internal.u0.e2
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f66794a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionB = b();
        this.f66794a = collectionB;
        return collectionB;
    }

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean equals(Object obj) {
        return g2.a(this, obj);
    }

    public abstract Iterator<Map.Entry<K, V>> f();

    public Iterator<V> g() {
        return d2.c(entries().iterator());
    }

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public abstract /* synthetic */ Collection get(Object obj);

    @Override // io.odeeo.internal.u0.e2
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // io.odeeo.internal.u0.e2
    public Set<K> keySet() {
        Set<K> set = this.f66795b;
        if (set != null) {
            return set;
        }
        Set<K> setC = c();
        this.f66795b = setC;
        return setC;
    }

    @Override // io.odeeo.internal.u0.e2
    public h2<K> keys() {
        h2<K> h2Var = this.f66796c;
        if (h2Var != null) {
            return h2Var;
        }
        h2<K> h2VarD = d();
        this.f66796c = h2VarD;
        return h2VarD;
    }

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean put(K k10, V v10) {
        return get(k10).add(v10);
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean putAll(K k10, Iterable<? extends V> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(k10).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && w1.addAll(get(k10), it);
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public abstract /* synthetic */ Collection removeAll(Object obj);

    @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        Collection<V> collectionRemoveAll = removeAll(k10);
        putAll(k10, iterable);
        return collectionRemoveAll;
    }

    @Override // io.odeeo.internal.u0.e2
    public abstract /* synthetic */ int size();

    public String toString() {
        return asMap().toString();
    }

    @Override // io.odeeo.internal.u0.e2
    public Collection<V> values() {
        Collection<V> collection = this.f66797d;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionE = e();
        this.f66797d = collectionE;
        return collectionE;
    }

    @Override // io.odeeo.internal.u0.e2
    public boolean putAll(e2<? extends K, ? extends V> e2Var) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : e2Var.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
