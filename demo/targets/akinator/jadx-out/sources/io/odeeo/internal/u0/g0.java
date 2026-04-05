package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d2;
import io.odeeo.internal.u0.g2;
import io.odeeo.internal.u0.h2;
import io.odeeo.internal.u0.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g0<K, V> extends g<K, V> implements l0<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public final e2<K, V> f66802f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.t0.v<? super Map.Entry<K, V>> f66803g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends d2.r0<K, Collection<V>> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.u0.g0$a$a, reason: collision with other inner class name */
        public class C0663a extends d2.s<K, Collection<V>> {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.g0$a$a$a, reason: collision with other inner class name */
            public class C0664a extends io.odeeo.internal.u0.b<Map.Entry<K, Collection<V>>> {

                /* renamed from: c, reason: collision with root package name */
                public final Iterator<Map.Entry<K, Collection<V>>> f66806c;

                public C0664a() {
                    this.f66806c = g0.this.f66802f.asMap().entrySet().iterator();
                }

                @Override // io.odeeo.internal.u0.b
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> computeNext() {
                    while (this.f66806c.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f66806c.next();
                        K key = next.getKey();
                        Collection collectionA = g0.a((Collection) next.getValue(), (io.odeeo.internal.t0.v) new c(key));
                        if (!collectionA.isEmpty()) {
                            return d2.immutableEntry(key, collectionA);
                        }
                    }
                    return a();
                }
            }

            public C0663a() {
            }

            @Override // io.odeeo.internal.u0.d2.s
            public Map<K, Collection<V>> a() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0664a();
            }

            @Override // io.odeeo.internal.u0.d2.s, io.odeeo.internal.u0.e3.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return g0.this.a(io.odeeo.internal.t0.w.in(collection));
            }

            @Override // io.odeeo.internal.u0.d2.s, io.odeeo.internal.u0.e3.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return g0.this.a(io.odeeo.internal.t0.w.not(io.odeeo.internal.t0.w.in(collection)));
            }

            @Override // io.odeeo.internal.u0.d2.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return w1.size(iterator());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b extends d2.b0<K, Collection<V>> {
            public b() {
                super(a.this);
            }

            @Override // io.odeeo.internal.u0.d2.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return a.this.remove(obj) != null;
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return g0.this.a(d2.a(io.odeeo.internal.t0.w.in(collection)));
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return g0.this.a(d2.a(io.odeeo.internal.t0.w.not(io.odeeo.internal.t0.w.in(collection))));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class c extends d2.q0<K, Collection<V>> {
            public c() {
                super(a.this);
            }

            @Override // io.odeeo.internal.u0.d2.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                if (!(obj instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) obj;
                Iterator<Map.Entry<K, Collection<V>>> it = g0.this.f66802f.asMap().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<K, Collection<V>> next = it.next();
                    Collection collectionA = g0.a((Collection) next.getValue(), (io.odeeo.internal.t0.v) new c(next.getKey()));
                    if (!collectionA.isEmpty() && collection.equals(collectionA)) {
                        if (collectionA.size() == next.getValue().size()) {
                            it.remove();
                            return true;
                        }
                        collectionA.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // io.odeeo.internal.u0.d2.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return g0.this.a(d2.b(io.odeeo.internal.t0.w.in(collection)));
            }

            @Override // io.odeeo.internal.u0.d2.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return g0.this.a(d2.b(io.odeeo.internal.t0.w.not(io.odeeo.internal.t0.w.in(collection))));
            }
        }

        public a() {
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0663a();
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Collection<Collection<V>> b() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            g0.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<K> createKeySet() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collection = g0.this.f66802f.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionA = g0.a((Collection) collection, (io.odeeo.internal.t0.v) new c(obj));
            if (collectionA.isEmpty()) {
                return null;
            }
            return collectionA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<V> collection = g0.this.f66802f.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListNewArrayList = z1.newArrayList();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (g0.this.a((g0) obj, (Object) next)) {
                    it.remove();
                    arrayListNewArrayList.add(next);
                }
            }
            if (arrayListNewArrayList.isEmpty()) {
                return null;
            }
            return g0.this.f66802f instanceof d3 ? Collections.unmodifiableSet(e3.newLinkedHashSet(arrayListNewArrayList)) : Collections.unmodifiableList(arrayListNewArrayList);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends g2.g<K, V> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends i2.h<K> {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.g0$b$a$a, reason: collision with other inner class name */
            public class C0665a implements io.odeeo.internal.t0.v<Map.Entry<K, Collection<V>>> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ io.odeeo.internal.t0.v f66812a;

                public C0665a(io.odeeo.internal.t0.v vVar) {
                    this.f66812a = vVar;
                }

                @Override // io.odeeo.internal.t0.v
                public boolean apply(Map.Entry<K, Collection<V>> entry) {
                    return this.f66812a.apply(i2.immutableEntry(entry.getKey(), entry.getValue().size()));
                }
            }

            public a() {
            }

            @Override // io.odeeo.internal.u0.i2.h
            public h2<K> a() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<h2.a<K>> iterator() {
                return b.this.e();
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return a(io.odeeo.internal.t0.w.in(collection));
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return a(io.odeeo.internal.t0.w.not(io.odeeo.internal.t0.w.in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return g0.this.keySet().size();
            }

            public final boolean a(io.odeeo.internal.t0.v<? super h2.a<K>> vVar) {
                return g0.this.a(new C0665a(vVar));
            }
        }

        public b() {
            super(g0.this);
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public Set<h2.a<K>> entrySet() {
            return new a();
        }

        @Override // io.odeeo.internal.u0.g2.g, io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int remove(Object obj, int i10) {
            r.a(i10, "occurrences");
            if (i10 == 0) {
                return count(obj);
            }
            Collection<V> collection = g0.this.f66802f.asMap().get(obj);
            int i11 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (g0.this.a((g0) obj, (Object) it.next()) && (i11 = i11 + 1) <= i10) {
                    it.remove();
                }
            }
            return i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c implements io.odeeo.internal.t0.v<V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f66814a;

        public c(K k10) {
            this.f66814a = k10;
        }

        @Override // io.odeeo.internal.t0.v
        public boolean apply(V v10) {
            return g0.this.a((g0) this.f66814a, (K) v10);
        }
    }

    public g0(e2<K, V> e2Var, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        this.f66802f = (e2) io.odeeo.internal.t0.u.checkNotNull(e2Var);
        this.f66803g = (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar);
    }

    @Override // io.odeeo.internal.u0.g
    public Collection<Map.Entry<K, V>> b() {
        return a((Collection) this.f66802f.entries(), (io.odeeo.internal.t0.v) this.f66803g);
    }

    @Override // io.odeeo.internal.u0.g
    public Set<K> c() {
        return asMap().keySet();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public void clear() {
        entries().clear();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public boolean containsKey(Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // io.odeeo.internal.u0.g
    public h2<K> d() {
        return new b();
    }

    @Override // io.odeeo.internal.u0.g
    public Collection<V> e() {
        return new m0(this);
    }

    @Override // io.odeeo.internal.u0.l0
    public io.odeeo.internal.t0.v<? super Map.Entry<K, V>> entryPredicate() {
        return this.f66803g;
    }

    @Override // io.odeeo.internal.u0.g
    public Iterator<Map.Entry<K, V>> f() {
        throw new AssertionError("should never be called");
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> get(K k10) {
        return a((Collection) this.f66802f.get(k10), (io.odeeo.internal.t0.v) new c(k10));
    }

    public Collection<V> h() {
        return this.f66802f instanceof d3 ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> removeAll(Object obj) {
        return (Collection) io.odeeo.internal.t0.o.firstNonNull(asMap().remove(obj), h());
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public int size() {
        return entries().size();
    }

    @Override // io.odeeo.internal.u0.l0
    public e2<K, V> unfiltered() {
        return this.f66802f;
    }

    public final boolean a(K k10, V v10) {
        return this.f66803g.apply(d2.immutableEntry(k10, v10));
    }

    public static <E> Collection<E> a(Collection<E> collection, io.odeeo.internal.t0.v<? super E> vVar) {
        if (collection instanceof Set) {
            return e3.filter((Set) collection, vVar);
        }
        return s.filter(collection, vVar);
    }

    @Override // io.odeeo.internal.u0.g
    public Map<K, Collection<V>> a() {
        return new a();
    }

    public boolean a(io.odeeo.internal.t0.v<? super Map.Entry<K, Collection<V>>> vVar) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f66802f.asMap().entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection collectionA = a((Collection) next.getValue(), (io.odeeo.internal.t0.v) new c(key));
            if (!collectionA.isEmpty() && vVar.apply(d2.immutableEntry(key, collectionA))) {
                if (collectionA.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionA.clear();
                }
                z10 = true;
            }
        }
        return z10;
    }
}
