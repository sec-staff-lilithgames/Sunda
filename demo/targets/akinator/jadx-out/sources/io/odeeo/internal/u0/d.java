package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d2;
import io.odeeo.internal.u0.g;
import io.odeeo.internal.u0.g2;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d<K, V> extends io.odeeo.internal.u0.g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: f, reason: collision with root package name */
    public transient Map<K, Collection<V>> f66609f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f66610g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends d<K, V>.AbstractC0657d<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // io.odeeo.internal.u0.d.AbstractC0657d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10, V v10) {
            return d2.immutableEntry(k10, v10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends d2.r0<K, Collection<V>> {

        /* renamed from: d, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f66613d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends d2.s<K, Collection<V>> {
            public a() {
            }

            @Override // io.odeeo.internal.u0.d2.s
            public Map<K, Collection<V>> a() {
                return c.this;
            }

            @Override // io.odeeo.internal.u0.d2.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return s.a(c.this.f66613d.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // io.odeeo.internal.u0.d2.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.c(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f66616a;

            /* renamed from: b, reason: collision with root package name */
            public Collection<V> f66617b;

            public b() {
                this.f66616a = c.this.f66613d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f66616a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                r.a(this.f66617b != null);
                this.f66616a.remove();
                d.this.f66610g -= this.f66617b.size();
                this.f66617b.clear();
                this.f66617b = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f66616a.next();
                this.f66617b = next.getValue();
                return c.this.a(next);
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.f66613d = map;
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f66613d == d.this.f66609f) {
                d.this.clear();
            } else {
                w1.b(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return d2.c(this.f66613d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f66613d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f66613d.hashCode();
        }

        @Override // io.odeeo.internal.u0.d2.r0, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f66613d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f66613d.toString();
        }

        public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return d2.immutableEntry(key, d.this.a((d) key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) d2.d(this.f66613d, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a((d) obj, (Collection) collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f66613d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionI = d.this.i();
            collectionI.addAll(collectionRemove);
            d.this.f66610g -= collectionRemove.size();
            collectionRemove.clear();
            return collectionI;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.u0.d$d, reason: collision with other inner class name */
    public abstract class AbstractC0657d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f66619a;

        /* renamed from: b, reason: collision with root package name */
        public K f66620b = null;

        /* renamed from: c, reason: collision with root package name */
        public Collection<V> f66621c = null;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<V> f66622d = w1.c();

        public AbstractC0657d() {
            this.f66619a = d.this.f66609f.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66619a.hasNext() || this.f66622d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f66622d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f66619a.next();
                this.f66620b = next.getKey();
                Collection<V> value = next.getValue();
                this.f66621c = value;
                this.f66622d = value.iterator();
            }
            return a(this.f66620b, this.f66622d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f66622d.remove();
            if (this.f66621c.isEmpty()) {
                this.f66619a.remove();
            }
            d.d(d.this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends d2.b0<K, Collection<V>> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f66625a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f66626b;

            public a(Iterator it) {
                this.f66626b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f66626b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f66626b.next();
                this.f66625a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                r.a(this.f66625a != null);
                Collection<V> value = this.f66625a.getValue();
                this.f66626b.remove();
                d.this.f66610g -= value.size();
                value.clear();
                this.f66625a = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // io.odeeo.internal.u0.d2.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            w1.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return b().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return b().keySet().hashCode();
        }

        @Override // io.odeeo.internal.u0.d2.b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(b().entrySet().iterator());
        }

        @Override // io.odeeo.internal.u0.d2.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = b().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.this.f66610g -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionI = d.this.i();
            collectionI.addAll(next.getValue());
            it.remove();
            return d2.immutableEntry(next.getKey(), d.this.c((Collection) collectionI));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = d().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return d().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(d().descendingMap());
        }

        @Override // io.odeeo.internal.u0.d.i, io.odeeo.internal.u0.d2.r0
        /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> createKeySet() {
            return new g(d());
        }

        @Override // io.odeeo.internal.u0.d.i
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = d().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return d().floorKey(k10);
        }

        @Override // io.odeeo.internal.u0.d.i, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap((f) obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = d().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return d().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = d().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return d().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        @Override // io.odeeo.internal.u0.d.i, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap((f) obj);
        }

        @Override // io.odeeo.internal.u0.d.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // io.odeeo.internal.u0.d.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // io.odeeo.internal.u0.d.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(d().headMap(k10, z10));
        }

        @Override // io.odeeo.internal.u0.d.i, io.odeeo.internal.u0.d.c, io.odeeo.internal.u0.d2.r0, java.util.AbstractMap, java.util.Map
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(d().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(d().tailMap(k10, z10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g extends d<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // io.odeeo.internal.u0.d.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return b().floorKey(k10);
        }

        @Override // io.odeeo.internal.u0.d.j, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
            return headSet((g) obj);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) w1.c(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) w1.c(descendingIterator());
        }

        @Override // io.odeeo.internal.u0.d.j, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
            return tailSet((g) obj);
        }

        @Override // io.odeeo.internal.u0.d.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // io.odeeo.internal.u0.d.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // io.odeeo.internal.u0.d.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(b().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(b().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(b().tailMap(k10, z10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h extends d<K, V>.l implements RandomAccess {
        public h(K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: f, reason: collision with root package name */
        public SortedSet<K> f66631f;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // io.odeeo.internal.u0.d2.r0
        /* renamed from: c */
        public SortedSet<K> createKeySet() {
            return new j(d());
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f66613d;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(d().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(d().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(d().tailMap(k10));
        }

        @Override // io.odeeo.internal.u0.d.c, io.odeeo.internal.u0.d2.r0, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f66631f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetCreateKeySet = createKeySet();
            this.f66631f = sortedSetCreateKeySet;
            return sortedSetCreateKeySet;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j extends d<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.b();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(b().tailMap(k10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m extends d<K, V>.o implements NavigableSet<V> {
        public m(K k10, NavigableSet<V> navigableSet, d<K, V>.k kVar) {
            super(k10, navigableSet, kVar);
        }

        public final NavigableSet<V> a(NavigableSet<V> navigableSet) {
            return new m(this.f66634a, navigableSet, b() == null ? this : b());
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v10) {
            return g().ceiling(v10);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(g().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return a(g().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v10) {
            return g().floor(v10);
        }

        @Override // io.odeeo.internal.u0.d.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v10, boolean z10) {
            return a(g().headSet(v10, z10));
        }

        @Override // java.util.NavigableSet
        public V higher(V v10) {
            return g().higher(v10);
        }

        @Override // java.util.NavigableSet
        public V lower(V v10) {
            return g().lower(v10);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) w1.c(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) w1.c(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v10, boolean z10, V v11, boolean z11) {
            return a(g().subSet(v10, z10, v11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v10, boolean z10) {
            return a(g().tailSet(v10, z10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n extends d<K, V>.k implements Set<V> {
        public n(K k10, Set<V> set) {
            super(k10, set, null);
        }

        @Override // io.odeeo.internal.u0.d.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zA = e3.a((Set<?>) this.f66635b, collection);
            if (zA) {
                int size2 = this.f66635b.size();
                d dVar = d.this;
                dVar.f66610g = (size2 - size) + dVar.f66610g;
                f();
            }
            return zA;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o extends d<K, V>.k implements SortedSet<V> {
        public o(K k10, SortedSet<V> sortedSet, d<K, V>.k kVar) {
            super(k10, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            e();
            return g().first();
        }

        public SortedSet<V> g() {
            return (SortedSet) c();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v10) {
            e();
            return new o(d(), g().headSet(v10), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public V last() {
            e();
            return g().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v10, V v11) {
            e();
            return new o(d(), g().subSet(v10, v11), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v10) {
            e();
            return new o(d(), g().tailSet(v10), b() == null ? this : b());
        }
    }

    public d(Map<K, Collection<V>> map) {
        io.odeeo.internal.t0.u.checkArgument(map.isEmpty());
        this.f66609f = map;
    }

    public static /* synthetic */ int c(d dVar) {
        int i10 = dVar.f66610g;
        dVar.f66610g = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int d(d dVar) {
        int i10 = dVar.f66610g;
        dVar.f66610g = i10 - 1;
        return i10;
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public void clear() {
        Iterator<Collection<V>> it = this.f66609f.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f66609f.clear();
        this.f66610g = 0;
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public boolean containsKey(Object obj) {
        return this.f66609f.containsKey(obj);
    }

    @Override // io.odeeo.internal.u0.g
    public Collection<V> e() {
        return new g.c();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // io.odeeo.internal.u0.g
    public Iterator<Map.Entry<K, V>> f() {
        return new b();
    }

    @Override // io.odeeo.internal.u0.g
    public Iterator<V> g() {
        return new a();
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> get(K k10) {
        Collection<V> collectionA = this.f66609f.get(k10);
        if (collectionA == null) {
            collectionA = a((d<K, V>) k10);
        }
        return a((d<K, V>) k10, (Collection) collectionA);
    }

    public Map<K, Collection<V>> h() {
        return this.f66609f;
    }

    public abstract Collection<V> i();

    public final Map<K, Collection<V>> j() {
        Map<K, Collection<V>> map = this.f66609f;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f66609f) : map instanceof SortedMap ? new i((SortedMap) this.f66609f) : new c(this.f66609f);
    }

    public final Set<K> k() {
        Map<K, Collection<V>> map = this.f66609f;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f66609f) : map instanceof SortedMap ? new j((SortedMap) this.f66609f) : new e(this.f66609f);
    }

    public Collection<V> l() {
        return (Collection<V>) c(i());
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f66609f.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f66610g++;
            return true;
        }
        Collection<V> collectionA = a((d<K, V>) k10);
        if (!collectionA.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f66610g++;
        this.f66609f.put(k10, collectionA);
        return true;
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> removeAll(Object obj) {
        Collection<V> collectionRemove = this.f66609f.remove(obj);
        if (collectionRemove == null) {
            return l();
        }
        Collection collectionI = i();
        collectionI.addAll(collectionRemove);
        this.f66610g -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) c(collectionI);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k10);
        }
        Collection<V> collectionB = b((d<K, V>) k10);
        Collection<V> collectionI = i();
        collectionI.addAll(collectionB);
        this.f66610g -= collectionB.size();
        collectionB.clear();
        while (it.hasNext()) {
            if (collectionB.add(it.next())) {
                this.f66610g++;
            }
        }
        return (Collection<V>) c((Collection) collectionI);
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public int size() {
        return this.f66610g;
    }

    @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public Collection<V> values() {
        return super.values();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f66634a;

        /* renamed from: b, reason: collision with root package name */
        public Collection<V> f66635b;

        /* renamed from: c, reason: collision with root package name */
        public final d<K, V>.k f66636c;

        /* renamed from: d, reason: collision with root package name */
        public final Collection<V> f66637d;

        public k(K k10, Collection<V> collection, d<K, V>.k kVar) {
            this.f66634a = k10;
            this.f66635b = collection;
            this.f66636c = kVar;
            this.f66637d = kVar == null ? null : kVar.c();
        }

        public void a() {
            d<K, V>.k kVar = this.f66636c;
            if (kVar != null) {
                kVar.a();
            } else {
                d.this.f66609f.put(this.f66634a, this.f66635b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            e();
            boolean zIsEmpty = this.f66635b.isEmpty();
            boolean zAdd = this.f66635b.add(v10);
            if (zAdd) {
                d.c(d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f66635b.addAll(collection);
            if (zAddAll) {
                int size2 = this.f66635b.size();
                d dVar = d.this;
                dVar.f66610g = (size2 - size) + dVar.f66610g;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        public d<K, V>.k b() {
            return this.f66636c;
        }

        public Collection<V> c() {
            return this.f66635b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f66635b.clear();
            d.this.f66610g -= size;
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.f66635b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            e();
            return this.f66635b.containsAll(collection);
        }

        public K d() {
            return this.f66634a;
        }

        public void e() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f66636c;
            if (kVar != null) {
                kVar.e();
                if (this.f66636c.c() != this.f66637d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f66635b.isEmpty() || (collection = (Collection) d.this.f66609f.get(this.f66634a)) == null) {
                    return;
                }
                this.f66635b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f66635b.equals(obj);
        }

        public void f() {
            d<K, V>.k kVar = this.f66636c;
            if (kVar != null) {
                kVar.f();
            } else if (this.f66635b.isEmpty()) {
                d.this.f66609f.remove(this.f66634a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.f66635b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean zRemove = this.f66635b.remove(obj);
            if (zRemove) {
                d.d(d.this);
                f();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f66635b.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.f66635b.size();
                d dVar = d.this;
                dVar.f66610g = (size2 - size) + dVar.f66610g;
                f();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            io.odeeo.internal.t0.u.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.f66635b.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.f66635b.size();
                d dVar = d.this;
                dVar.f66610g = (size2 - size) + dVar.f66610g;
                f();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.f66635b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.f66635b.toString();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<V> f66639a;

            /* renamed from: b, reason: collision with root package name */
            public final Collection<V> f66640b;

            public a() {
                Collection<V> collection = k.this.f66635b;
                this.f66640b = collection;
                this.f66639a = d.b((Collection) collection);
            }

            public Iterator<V> a() {
                b();
                return this.f66639a;
            }

            public void b() {
                k.this.e();
                if (k.this.f66635b != this.f66640b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f66639a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f66639a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f66639a.remove();
                d.d(d.this);
                k.this.f();
            }

            public a(Iterator<V> it) {
                this.f66640b = k.this.f66635b;
                this.f66639a = it;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l extends d<K, V>.k implements List<V> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends d<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v10);
                d.c(d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            public final ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                c().set(v10);
            }

            public a(int i10) {
                super(l.this.g().listIterator(i10));
            }
        }

        public l(K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            e();
            boolean zIsEmpty = c().isEmpty();
            g().add(i10, v10);
            d.c(d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = g().addAll(i10, collection);
            if (zAddAll) {
                int size2 = c().size();
                d dVar = d.this;
                dVar.f66610g = (size2 - size) + dVar.f66610g;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        public List<V> g() {
            return (List) c();
        }

        @Override // java.util.List
        public V get(int i10) {
            e();
            return g().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i10) {
            e();
            V vRemove = g().remove(i10);
            d.d(d.this);
            f();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            e();
            return g().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            e();
            return d.this.a(d(), g().subList(i10, i11), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            e();
            return new a(i10);
        }
    }

    public final Collection<V> b(K k10) {
        Collection<V> collection = this.f66609f.get(k10);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionA = a((d<K, V>) k10);
        this.f66609f.put(k10, collectionA);
        return collectionA;
    }

    public <E> Collection<E> c(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // io.odeeo.internal.u0.g
    public h2<K> d() {
        return new g2.g(this);
    }

    @Override // io.odeeo.internal.u0.g
    public Set<K> c() {
        return new e(this.f66609f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        Collection collection = (Collection) d2.e(this.f66609f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f66610g -= size;
        }
    }

    public static <E> Iterator<E> b(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    public final void a(Map<K, Collection<V>> map) {
        this.f66609f = map;
        this.f66610g = 0;
        for (Collection<V> collection : map.values()) {
            io.odeeo.internal.t0.u.checkArgument(!collection.isEmpty());
            this.f66610g = collection.size() + this.f66610g;
        }
    }

    @Override // io.odeeo.internal.u0.g
    public Collection<Map.Entry<K, V>> b() {
        if (this instanceof d3) {
            return new g.b();
        }
        return new g.a();
    }

    public Collection<V> a(K k10) {
        return i();
    }

    public Collection<V> a(K k10, Collection<V> collection) {
        return new k(k10, collection, null);
    }

    public final List<V> a(K k10, List<V> list, d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // io.odeeo.internal.u0.g
    public Map<K, Collection<V>> a() {
        return new c(this.f66609f);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends d<K, V>.AbstractC0657d<V> {
        public a() {
            super();
        }

        @Override // io.odeeo.internal.u0.d.AbstractC0657d
        public V a(K k10, V v10) {
            return v10;
        }
    }
}
