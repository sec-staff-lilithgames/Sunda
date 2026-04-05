package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d1;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j1<K, V> implements Map<K, V>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f66899e = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    public transient q1<Map.Entry<K, V>> f66900a;

    /* renamed from: b, reason: collision with root package name */
    public transient q1<K> f66901b;

    /* renamed from: c, reason: collision with root package name */
    public transient d1<V> f66902c;

    /* renamed from: d, reason: collision with root package name */
    public transient r1<K, V> f66903d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends q3<K> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q3 f66904a;

        public a(q3 q3Var) {
            this.f66904a = q3Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66904a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f66904a.next()).getKey();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Comparator<? super V> f66906a;

        /* renamed from: b, reason: collision with root package name */
        public Object[] f66907b;

        /* renamed from: c, reason: collision with root package name */
        public int f66908c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f66909d;

        public b() {
            this(4);
        }

        public final void a(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f66907b;
            if (i11 > objArr.length) {
                this.f66907b = Arrays.copyOf(objArr, d1.b.a(objArr.length, i11));
                this.f66909d = false;
            }
        }

        public j1<K, V> build() {
            a();
            this.f66909d = true;
            return w2.a(this.f66908c, this.f66907b);
        }

        public b<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            io.odeeo.internal.t0.u.checkState(this.f66906a == null, "valueComparator was already set");
            this.f66906a = (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator, "valueComparator");
            return this;
        }

        public b<K, V> put(K k10, V v10) {
            a(this.f66908c + 1);
            r.a(k10, v10);
            Object[] objArr = this.f66907b;
            int i10 = this.f66908c;
            int i11 = i10 * 2;
            objArr[i11] = k10;
            objArr[i11 + 1] = v10;
            this.f66908c = i10 + 1;
            return this;
        }

        public b<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public b(int i10) {
            this.f66907b = new Object[i10 * 2];
            this.f66908c = 0;
            this.f66909d = false;
        }

        public b<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(((Collection) iterable).size() + this.f66908c);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public void a() {
            int i10;
            if (this.f66906a != null) {
                if (this.f66909d) {
                    this.f66907b = Arrays.copyOf(this.f66907b, this.f66908c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f66908c];
                int i11 = 0;
                while (true) {
                    i10 = this.f66908c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f66907b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, p2.from(this.f66906a).onResultOf(d2.b()));
                for (int i13 = 0; i13 < this.f66908c; i13++) {
                    int i14 = i13 * 2;
                    this.f66907b[i14] = entryArr[i13].getKey();
                    this.f66907b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }

        public b<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c<K, V> extends j1<K, V> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends k1<K, V> {
            public a() {
            }

            @Override // io.odeeo.internal.u0.k1
            public j1<K, V> f() {
                return c.this;
            }

            @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public q3<Map.Entry<K, V>> iterator() {
                return c.this.g();
            }
        }

        @Override // io.odeeo.internal.u0.j1
        public q1<Map.Entry<K, V>> a() {
            return new a();
        }

        @Override // io.odeeo.internal.u0.j1
        public q1<K> b() {
            return new l1(this);
        }

        @Override // io.odeeo.internal.u0.j1
        public d1<V> c() {
            return new m1(this);
        }

        @Override // io.odeeo.internal.u0.j1, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        public abstract q3<Map.Entry<K, V>> g();

        @Override // io.odeeo.internal.u0.j1, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // io.odeeo.internal.u0.j1, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d extends c<K, q1<V>> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends q3<Map.Entry<K, q1<V>>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator f66912a;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.j1$d$a$a, reason: collision with other inner class name */
            public class C0671a extends f<K, q1<V>> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f66914a;

                public C0671a(Map.Entry entry) {
                    this.f66914a = entry;
                }

                @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f66914a.getKey();
                }

                @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
                public q1<V> getValue() {
                    return q1.of(this.f66914a.getValue());
                }
            }

            public a(Iterator it) {
                this.f66912a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f66912a.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, q1<V>> next() {
                return new C0671a((Map.Entry) this.f66912a.next());
            }
        }

        public d() {
        }

        @Override // io.odeeo.internal.u0.j1.c, io.odeeo.internal.u0.j1
        public q1<K> b() {
            return j1.this.keySet();
        }

        @Override // io.odeeo.internal.u0.j1, java.util.Map
        public boolean containsKey(Object obj) {
            return j1.this.containsKey(obj);
        }

        @Override // io.odeeo.internal.u0.j1
        public boolean d() {
            return j1.this.d();
        }

        @Override // io.odeeo.internal.u0.j1
        public boolean e() {
            return j1.this.e();
        }

        @Override // io.odeeo.internal.u0.j1.c
        public q3<Map.Entry<K, q1<V>>> g() {
            return new a(j1.this.entrySet().iterator());
        }

        @Override // io.odeeo.internal.u0.j1, java.util.Map
        public int hashCode() {
            return j1.this.hashCode();
        }

        @Override // java.util.Map
        public int size() {
            return j1.this.size();
        }

        public /* synthetic */ d(j1 j1Var, a aVar) {
            this();
        }

        @Override // io.odeeo.internal.u0.j1, java.util.Map
        public q1<V> get(Object obj) {
            Object obj2 = j1.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return q1.of(obj2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f66916a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f66917b;

        public e(j1<?, ?> j1Var) {
            this.f66916a = new Object[j1Var.size()];
            this.f66917b = new Object[j1Var.size()];
            q3<Map.Entry<?, ?>> it = j1Var.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                this.f66916a[i10] = next.getKey();
                this.f66917b[i10] = next.getValue();
                i10++;
            }
        }

        public Object a(b<Object, Object> bVar) {
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f66916a;
                if (i10 >= objArr.length) {
                    return bVar.build();
                }
                bVar.put(objArr[i10], this.f66917b[i10]);
                i10++;
            }
        }

        public Object readResolve() {
            return a(new b<>(this.f66916a.length));
        }
    }

    public static <K, V> b<K, V> builder() {
        return new b<>();
    }

    public static <K, V> b<K, V> builderWithExpectedSize(int i10) {
        r.a(i10, "expectedSize");
        return new b<>(i10);
    }

    public static <K, V> j1<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof j1) && !(map instanceof SortedMap)) {
            j1<K, V> j1Var = (j1) map;
            if (!j1Var.e()) {
                return j1Var;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> j1<K, V> of() {
        return (j1<K, V>) w2.f67169i;
    }

    public abstract q1<Map.Entry<K, V>> a();

    public r1<K, V> asMultimap() {
        if (isEmpty()) {
            return r1.of();
        }
        r1<K, V> r1Var = this.f66903d;
        if (r1Var != null) {
            return r1Var;
        }
        r1<K, V> r1Var2 = new r1<>(new d(this, null), size(), null);
        this.f66903d = r1Var2;
        return r1Var2;
    }

    public abstract q1<K> b();

    public abstract d1<V> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean d() {
        return false;
    }

    public abstract boolean e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return d2.b(this, obj);
    }

    public q3<K> f() {
        return new a(entrySet().iterator());
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public int hashCode() {
        return e3.a(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return d2.b(this);
    }

    public Object writeReplace() {
        return new e(this);
    }

    public static <K, V> j1<K, V> of(K k10, V v10) {
        r.a(k10, v10);
        return w2.a(1, new Object[]{k10, v10});
    }

    @Override // java.util.Map
    public q1<Map.Entry<K, V>> entrySet() {
        q1<Map.Entry<K, V>> q1Var = this.f66900a;
        if (q1Var != null) {
            return q1Var;
        }
        q1<Map.Entry<K, V>> q1VarA = a();
        this.f66900a = q1VarA;
        return q1VarA;
    }

    @Override // java.util.Map
    public q1<K> keySet() {
        q1<K> q1Var = this.f66901b;
        if (q1Var != null) {
            return q1Var;
        }
        q1<K> q1VarB = b();
        this.f66901b = q1VarB;
        return q1VarB;
    }

    @Override // java.util.Map
    public d1<V> values() {
        d1<V> d1Var = this.f66902c;
        if (d1Var != null) {
            return d1Var;
        }
        d1<V> d1VarC = c();
        this.f66902c = d1VarC;
        return d1VarC;
    }

    public static <K, V> j1<K, V> of(K k10, V v10, K k11, V v11) {
        r.a(k10, v10);
        r.a(k11, v11);
        return w2.a(2, new Object[]{k10, v10, k11, v11});
    }

    public static <K, V> j1<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.putAll(iterable);
        return bVar.build();
    }

    public static <K, V> j1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        r.a(k10, v10);
        r.a(k11, v11);
        r.a(k12, v12);
        return w2.a(3, new Object[]{k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> j1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        r.a(k10, v10);
        r.a(k11, v11);
        r.a(k12, v12);
        r.a(k13, v13);
        return w2.a(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> j1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        r.a(k10, v10);
        r.a(k11, v11);
        r.a(k12, v12);
        r.a(k13, v13);
        r.a(k14, v14);
        return w2.a(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }
}
