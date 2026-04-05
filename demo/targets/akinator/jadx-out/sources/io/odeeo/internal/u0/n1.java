package io.odeeo.internal.u0;

import io.ktor.http.ContentDisposition;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import io.odeeo.internal.u0.c3;
import io.odeeo.internal.u0.h2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class n1<K, V> extends m<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public final transient j1<K, ? extends d1<V>> f66960f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f66961g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends q3<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends d1<V>>> f66962a;

        /* renamed from: b, reason: collision with root package name */
        public K f66963b = null;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<V> f66964c = w1.a();

        public a() {
            this.f66962a = n1.this.f66960f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66964c.hasNext() || this.f66962a.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!this.f66964c.hasNext()) {
                Map.Entry<K, ? extends d1<V>> next = this.f66962a.next();
                this.f66963b = next.getKey();
                this.f66964c = next.getValue().iterator();
            }
            return d2.immutableEntry(this.f66963b, this.f66964c.next());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends q3<V> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<? extends d1<V>> f66966a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<V> f66967b = w1.a();

        public b() {
            this.f66966a = n1.this.f66960f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66967b.hasNext() || this.f66966a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f66967b.hasNext()) {
                this.f66967b = this.f66966a.next().iterator();
            }
            return this.f66967b.next();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<K, V> extends d1<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final n1<K, V> f66972b;

        public d(n1<K, V> n1Var) {
            this.f66972b = n1Var;
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f66972b.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f66972b.size();
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public q3<Map.Entry<K, V>> iterator() {
            return this.f66972b.f();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final c3.b<n1> f66973a = c3.a(n1.class, "map");

        /* renamed from: b, reason: collision with root package name */
        public static final c3.b<n1> f66974b = c3.a(n1.class, ContentDisposition.Parameters.Size);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends o1<K> {
        public f() {
        }

        @Override // io.odeeo.internal.u0.o1
        public h2.a<K> a(int i10) {
            Map.Entry<K, ? extends d1<V>> entry = n1.this.f66960f.entrySet().asList().get(i10);
            return i2.immutableEntry(entry.getKey(), entry.getValue().size());
        }

        @Override // io.odeeo.internal.u0.o1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return n1.this.containsKey(obj);
        }

        @Override // io.odeeo.internal.u0.o1, io.odeeo.internal.u0.h2
        public int count(Object obj) {
            d1<V> d1Var = n1.this.f66960f.get(obj);
            if (d1Var == null) {
                return 0;
            }
            return d1Var.size();
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
        public int size() {
            return n1.this.size();
        }

        @Override // io.odeeo.internal.u0.o1, io.odeeo.internal.u0.d1
        public Object writeReplace() {
            return new g(n1.this);
        }

        @Override // io.odeeo.internal.u0.o1, io.odeeo.internal.u0.h2
        public q1<K> elementSet() {
            return n1.this.keySet();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final n1<?, ?> f66976a;

        public g(n1<?, ?> n1Var) {
            this.f66976a = n1Var;
        }

        public Object readResolve() {
            return this.f66976a.keys();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h<K, V> extends d1<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final transient n1<K, V> f66977b;

        public h(n1<K, V> n1Var) {
            this.f66977b = n1Var;
        }

        @Override // io.odeeo.internal.u0.d1
        public int a(Object[] objArr, int i10) {
            q3<? extends d1<V>> it = this.f66977b.f66960f.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().a(objArr, i10);
            }
            return i10;
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f66977b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f66977b.size();
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public q3<V> iterator() {
            return this.f66977b.g();
        }
    }

    public n1(j1<K, ? extends d1<V>> j1Var, int i10) {
        this.f66960f = j1Var;
        this.f66961g = i10;
    }

    public static <K, V> c<K, V> builder() {
        return new c<>();
    }

    public static <K, V> n1<K, V> copyOf(e2<? extends K, ? extends V> e2Var) {
        if (e2Var instanceof n1) {
            n1<K, V> n1Var = (n1) e2Var;
            if (!n1Var.l()) {
                return n1Var;
            }
        }
        return i1.copyOf((e2) e2Var);
    }

    public static <K, V> n1<K, V> of() {
        return i1.of();
    }

    @Override // io.odeeo.internal.u0.g
    public Set<K> c() {
        throw new AssertionError("unreachable");
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public boolean containsKey(Object obj) {
        return this.f66960f.containsKey(obj);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public abstract d1<V> get(K k10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((n1<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public d1<Map.Entry<K, V>> b() {
        return new d(this);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // io.odeeo.internal.u0.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o1<K> d() {
        return new f();
    }

    public abstract n1<V, K> inverse();

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // io.odeeo.internal.u0.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d1<V> e() {
        return new h(this);
    }

    @Override // io.odeeo.internal.u0.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public q3<Map.Entry<K, V>> f() {
        return new a();
    }

    public boolean l() {
        return this.f66960f.e();
    }

    @Override // io.odeeo.internal.u0.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public q3<V> g() {
        return new b();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    @Deprecated
    public boolean putAll(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((n1<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public int size() {
        return this.f66961g;
    }

    @Override // io.odeeo.internal.u0.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Map<K, Collection<V>> f66969a = r2.b();

        /* renamed from: b, reason: collision with root package name */
        public Comparator<? super K> f66970b;

        /* renamed from: c, reason: collision with root package name */
        public Comparator<? super V> f66971c;

        public Collection<V> a() {
            return new ArrayList();
        }

        public n1<K, V> build() {
            Collection collectionEntrySet = this.f66969a.entrySet();
            Comparator<? super K> comparator = this.f66970b;
            if (comparator != null) {
                collectionEntrySet = p2.from(comparator).a().immutableSortedCopy(collectionEntrySet);
            }
            return i1.a(collectionEntrySet, this.f66971c);
        }

        public c<K, V> orderKeysBy(Comparator<? super K> comparator) {
            this.f66970b = (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator);
            return this;
        }

        public c<K, V> orderValuesBy(Comparator<? super V> comparator) {
            this.f66971c = (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator);
            return this;
        }

        public c<K, V> put(K k10, V v10) {
            r.a(k10, v10);
            Collection<V> collection = this.f66969a.get(k10);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f66969a;
                Collection<V> collectionA = a();
                map.put(k10, collectionA);
                collection = collectionA;
            }
            collection.add(v10);
            return this;
        }

        public c<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public c<K, V> putAll(K k10, Iterable<? extends V> iterable) {
            if (k10 != null) {
                Collection<V> collection = this.f66969a.get(k10);
                if (collection != null) {
                    for (V v10 : iterable) {
                        r.a(k10, v10);
                        collection.add(v10);
                    }
                } else {
                    Iterator<? extends V> it = iterable.iterator();
                    if (it.hasNext()) {
                        Collection<V> collectionA = a();
                        while (it.hasNext()) {
                            V next = it.next();
                            r.a(k10, next);
                            collectionA.add(next);
                        }
                        this.f66969a.put(k10, collectionA);
                        return this;
                    }
                }
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + v1.toString(iterable));
        }

        public c<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public c<K, V> putAll(K k10, V... vArr) {
            return putAll((c<K, V>) k10, Arrays.asList(vArr));
        }

        public c<K, V> putAll(e2<? extends K, ? extends V> e2Var) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : e2Var.asMap().entrySet()) {
                putAll((c<K, V>) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public static <K, V> n1<K, V> of(K k10, V v10) {
        return i1.of((Object) k10, (Object) v10);
    }

    @Override // io.odeeo.internal.u0.g
    public Map<K, Collection<V>> a() {
        throw new AssertionError(QCmNMSGd.COLRfVhUq);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public j1<K, Collection<V>> asMap() {
        return this.f66960f;
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public d1<Map.Entry<K, V>> entries() {
        return (d1) super.entries();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public q1<K> keySet() {
        return this.f66960f.keySet();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public o1<K> keys() {
        return (o1) super.keys();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    @Deprecated
    public boolean putAll(e2<? extends K, ? extends V> e2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public d1<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public d1<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public d1<V> values() {
        return (d1) super.values();
    }

    public static <K, V> n1<K, V> of(K k10, V v10, K k11, V v11) {
        return i1.of((Object) k10, (Object) v10, (Object) k11, (Object) v11);
    }

    public static <K, V> n1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        return i1.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12);
    }

    public static <K, V> n1<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return i1.copyOf((Iterable) iterable);
    }

    public static <K, V> n1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return i1.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13);
    }

    public static <K, V> n1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return i1.of((Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12, (Object) k13, (Object) v13, (Object) k14, (Object) v14);
    }
}
