package io.odeeo.internal.u0;

import com.ironsource.G5;
import io.odeeo.internal.u0.a2;
import io.odeeo.internal.u0.e3;
import io.odeeo.internal.u0.j1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d2 {

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<V1, V2> implements io.odeeo.internal.t0.k<V1, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f66652a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f66653b;

        public a(t tVar, Object obj) {
            this.f66652a = tVar;
            this.f66653b = obj;
        }

        @Override // io.odeeo.internal.t0.k
        public V2 apply(V1 v12) {
            return (V2) this.f66652a.transformEntry(this.f66653b, v12);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a0<K, V> extends AbstractMap<K, V> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // io.odeeo.internal.u0.d2.s
            public Map<K, V> a() {
                return a0.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a0.this.a();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            w1.b(a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<K, V1, V2> implements io.odeeo.internal.t0.k<Map.Entry<K, V1>, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f66655a;

        public b(t tVar) {
            this.f66655a = tVar;
        }

        @Override // io.odeeo.internal.t0.k
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f66655a.transformEntry(entry.getKey(), entry.getValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b0<K, V> extends e3.j<K> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f66656a;

        public b0(Map<K, V> map) {
            this.f66656a = (Map) io.odeeo.internal.t0.u.checkNotNull(map);
        }

        /* renamed from: a */
        public Map<K, V> b() {
            return this.f66656a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return d2.a(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            b().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<K, V2> extends io.odeeo.internal.u0.f<K, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f66657a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f66658b;

        public c(Map.Entry entry, t tVar) {
            this.f66657a = entry;
            this.f66658b = tVar;
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public K getKey() {
            return (K) this.f66657a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public V2 getValue() {
            return (V2) this.f66658b.transformEntry(this.f66657a.getKey(), this.f66657a.getValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c0<K, V> implements a2<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f66659a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<K, V> f66660b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<K, V> f66661c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<K, a2.a<V>> f66662d;

        public c0(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, a2.a<V>> map4) {
            this.f66659a = d2.c(map);
            this.f66660b = d2.c(map2);
            this.f66661c = d2.c(map3);
            this.f66662d = d2.c(map4);
        }

        @Override // io.odeeo.internal.u0.a2
        public boolean areEqual() {
            return this.f66659a.isEmpty() && this.f66660b.isEmpty() && this.f66662d.isEmpty();
        }

        @Override // io.odeeo.internal.u0.a2
        public Map<K, a2.a<V>> entriesDiffering() {
            return this.f66662d;
        }

        @Override // io.odeeo.internal.u0.a2
        public Map<K, V> entriesInCommon() {
            return this.f66661c;
        }

        @Override // io.odeeo.internal.u0.a2
        public Map<K, V> entriesOnlyOnLeft() {
            return this.f66659a;
        }

        @Override // io.odeeo.internal.u0.a2
        public Map<K, V> entriesOnlyOnRight() {
            return this.f66660b;
        }

        @Override // io.odeeo.internal.u0.a2
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a2) {
                a2 a2Var = (a2) obj;
                if (entriesOnlyOnLeft().equals(a2Var.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(a2Var.entriesOnlyOnRight()) && entriesInCommon().equals(a2Var.entriesInCommon()) && entriesDiffering().equals(a2Var.entriesDiffering())) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.a2
        public int hashCode() {
            return io.odeeo.internal.t0.p.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb2 = new StringBuilder("not equal");
            if (!this.f66659a.isEmpty()) {
                sb2.append(": only on left=");
                sb2.append(this.f66659a);
            }
            if (!this.f66660b.isEmpty()) {
                sb2.append(": only on right=");
                sb2.append(this.f66660b);
            }
            if (!this.f66662d.isEmpty()) {
                sb2.append(": value differences=");
                sb2.append(this.f66662d);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<K, V1, V2> implements io.odeeo.internal.t0.k<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f66663a;

        public d(t tVar) {
            this.f66663a = tVar;
        }

        @Override // io.odeeo.internal.t0.k
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return d2.a(this.f66663a, (Map.Entry) entry);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d0<K, V> extends io.odeeo.internal.u0.i<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableSet<K> f66664a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.t0.k<? super K, V> f66665b;

        public d0(NavigableSet<K> navigableSet, io.odeeo.internal.t0.k<? super K, V> kVar) {
            this.f66664a = (NavigableSet) io.odeeo.internal.t0.u.checkNotNull(navigableSet);
            this.f66665b = (io.odeeo.internal.t0.k) io.odeeo.internal.t0.u.checkNotNull(kVar);
        }

        @Override // io.odeeo.internal.u0.d2.a0
        public Iterator<Map.Entry<K, V>> a() {
            return d2.a((Set) this.f66664a, (io.odeeo.internal.t0.k) this.f66665b);
        }

        @Override // io.odeeo.internal.u0.i
        public Iterator<Map.Entry<K, V>> b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // io.odeeo.internal.u0.d2.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f66664a.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f66664a.comparator();
        }

        @Override // io.odeeo.internal.u0.i, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return d2.asMap((NavigableSet) this.f66664a.descendingSet(), (io.odeeo.internal.t0.k) this.f66665b);
        }

        @Override // io.odeeo.internal.u0.i, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (io.odeeo.internal.u0.s.a(this.f66664a, obj)) {
                return this.f66665b.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            return d2.asMap((NavigableSet) this.f66664a.headSet(k10, z10), (io.odeeo.internal.t0.k) this.f66665b);
        }

        @Override // io.odeeo.internal.u0.i, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return d2.b((NavigableSet) this.f66664a);
        }

        @Override // io.odeeo.internal.u0.d2.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f66664a.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            return d2.asMap((NavigableSet) this.f66664a.subSet(k10, z10, k11, z11), (io.odeeo.internal.t0.k) this.f66665b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            return d2.asMap((NavigableSet) this.f66664a.tailSet(k10, z10), (io.odeeo.internal.t0.k) this.f66665b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<K, V> extends o3<Map.Entry<K, V>, K> {
        public e(Iterator it) {
            super(it);
        }

        @Override // io.odeeo.internal.u0.o3
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e0<K, V> extends g0<K, V> implements NavigableSet<K> {
        public e0(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // io.odeeo.internal.u0.d2.g0
        /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> b() {
            return (NavigableMap) this.f66656a;
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return a().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return a().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return a().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return a().headMap(k10, z10).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return a().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return a().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) d2.b(a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) d2.b(a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return a().subMap(k10, z10, k11, z11).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return a().tailMap(k10, z10).navigableKeySet();
        }

        @Override // io.odeeo.internal.u0.d2.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // io.odeeo.internal.u0.d2.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // io.odeeo.internal.u0.d2.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f<K, V> extends o3<Map.Entry<K, V>, V> {
        public f(Iterator it) {
            super(it);
        }

        @Override // io.odeeo.internal.u0.o3
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f0<K, V> extends o<K, V> implements SortedMap<K, V> {
        public f0(SortedSet<K> sortedSet, io.odeeo.internal.t0.k<? super K, V> kVar) {
            super(sortedSet, kVar);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // io.odeeo.internal.u0.d2.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> c() {
            return (SortedSet) super.c();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return c().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k10) {
            return d2.asMap((SortedSet) c().headSet(k10), (io.odeeo.internal.t0.k) this.f66683e);
        }

        @Override // io.odeeo.internal.u0.d2.r0, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d2.b((SortedSet) c());
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return c().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return d2.asMap((SortedSet) c().subSet(k10, k11), (io.odeeo.internal.t0.k) this.f66683e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k10) {
            return d2.asMap((SortedSet) c().tailSet(k10), (io.odeeo.internal.t0.k) this.f66683e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g<K, V> extends o3<K, Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.k f66666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Iterator it, io.odeeo.internal.t0.k kVar) {
            super(it);
            this.f66666b = kVar;
        }

        @Override // io.odeeo.internal.u0.o3
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10) {
            return d2.immutableEntry(k10, this.f66666b.apply(k10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g0<K, V> extends b0<K, V> implements SortedSet<K> {
        public g0(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // io.odeeo.internal.u0.d2.b0
        public SortedMap<K, V> b() {
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
            return new g0(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new g0(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new g0(b().tailMap(k10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<E> extends y0<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f66667a;

        public h(Set set) {
            this.f66667a = set;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: c */
        public Set<E> delegate() {
            return this.f66667a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h0<K, V> extends c0<K, V> implements i3<K, V> {
        public h0(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, a2.a<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // io.odeeo.internal.u0.d2.c0, io.odeeo.internal.u0.a2
        public SortedMap<K, a2.a<V>> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // io.odeeo.internal.u0.d2.c0, io.odeeo.internal.u0.a2
        public SortedMap<K, V> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // io.odeeo.internal.u0.d2.c0, io.odeeo.internal.u0.a2
        public SortedMap<K, V> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // io.odeeo.internal.u0.d2.c0, io.odeeo.internal.u0.a2
        public SortedMap<K, V> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i<E> extends a1<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SortedSet f66668a;

        public i(SortedSet sortedSet) {
            this.f66668a = sortedSet;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.a1, io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: d */
        public SortedSet<E> delegate() {
            return this.f66668a;
        }

        @Override // io.odeeo.internal.u0.a1, java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return d2.b((SortedSet) super.headSet(e10));
        }

        @Override // io.odeeo.internal.u0.a1, java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return d2.b((SortedSet) super.subSet(e10, e11));
        }

        @Override // io.odeeo.internal.u0.a1, java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return d2.b((SortedSet) super.tailSet(e10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i0<K, V1, V2> extends a0<K, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V1> f66669a;

        /* renamed from: b, reason: collision with root package name */
        public final t<? super K, ? super V1, V2> f66670b;

        public i0(Map<K, V1> map, t<? super K, ? super V1, V2> tVar) {
            this.f66669a = (Map) io.odeeo.internal.t0.u.checkNotNull(map);
            this.f66670b = (t) io.odeeo.internal.t0.u.checkNotNull(tVar);
        }

        @Override // io.odeeo.internal.u0.d2.a0
        public Iterator<Map.Entry<K, V2>> a() {
            return w1.transform(this.f66669a.entrySet().iterator(), d2.a(this.f66670b));
        }

        @Override // io.odeeo.internal.u0.d2.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f66669a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f66669a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v12 = this.f66669a.get(obj);
            if (v12 != null || this.f66669a.containsKey(obj)) {
                return this.f66670b.transformEntry(obj, v12);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f66669a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f66669a.containsKey(obj)) {
                return this.f66670b.transformEntry(obj, this.f66669a.remove(obj));
            }
            return null;
        }

        @Override // io.odeeo.internal.u0.d2.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f66669a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new q0(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j<E> extends w0<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavigableSet f66671a;

        public j(NavigableSet navigableSet) {
            this.f66671a = navigableSet;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.w0, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return d2.b((NavigableSet) super.descendingSet());
        }

        @Override // io.odeeo.internal.u0.w0, io.odeeo.internal.u0.a1, io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: e */
        public NavigableSet<E> delegate() {
            return this.f66671a;
        }

        @Override // io.odeeo.internal.u0.a1, java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return d2.b((SortedSet) super.headSet(e10));
        }

        @Override // io.odeeo.internal.u0.a1, java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return d2.b((SortedSet) super.subSet(e10, e11));
        }

        @Override // io.odeeo.internal.u0.a1, java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return d2.b((SortedSet) super.tailSet(e10));
        }

        @Override // io.odeeo.internal.u0.w0, java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            return d2.b((NavigableSet) super.headSet(e10, z10));
        }

        @Override // io.odeeo.internal.u0.w0, java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            return d2.b((NavigableSet) super.subSet(e10, z10, e11, z11));
        }

        @Override // io.odeeo.internal.u0.w0, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            return d2.b((NavigableSet) super.tailSet(e10, z10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j0<K, V1, V2> extends k0<K, V1, V2> implements NavigableMap<K, V2> {
        public j0(NavigableMap<K, V1> navigableMap, t<? super K, ? super V1, V2> tVar) {
            super(navigableMap, tVar);
        }

        public final Map.Entry<K, V2> a(Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return d2.a((t) this.f66670b, (Map.Entry) entry);
        }

        @Override // io.odeeo.internal.u0.d2.k0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(K k10) {
            return a(b().ceilingEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return d2.transformEntries((NavigableMap) b().descendingMap(), (t) this.f66670b);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
            return a(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(K k10) {
            return a(b().floorEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return b().floorKey(k10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d2.k0, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap((j0<K, V1, V2>) obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(K k10) {
            return a(b().higherEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
            return a(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(K k10) {
            return a(b().lowerEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
            return a(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
            return a(b().pollLastEntry());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.d2.k0, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap((j0<K, V1, V2>) obj);
        }

        @Override // io.odeeo.internal.u0.d2.k0, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k10, boolean z10, K k11, boolean z11) {
            return d2.transformEntries((NavigableMap) b().subMap(k10, z10, k11, z11), (t) this.f66670b);
        }

        @Override // io.odeeo.internal.u0.d2.k0, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k10, boolean z10) {
            return d2.transformEntries((NavigableMap) b().headMap(k10, z10), (t) this.f66670b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k10, boolean z10) {
            return d2.transformEntries((NavigableMap) b().tailMap(k10, z10), (t) this.f66670b);
        }

        @Override // io.odeeo.internal.u0.d2.k0, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k<K, V> extends io.odeeo.internal.u0.f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f66672a;

        public k(Map.Entry entry) {
            this.f66672a = entry;
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public K getKey() {
            return (K) this.f66672a.getKey();
        }

        @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
        public V getValue() {
            return (V) this.f66672a.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k0<K, V1, V2> extends i0<K, V1, V2> implements SortedMap<K, V2> {
        public k0(SortedMap<K, V1> sortedMap, t<? super K, ? super V1, V2> tVar) {
            super(sortedMap, tVar);
        }

        public SortedMap<K, V1> b() {
            return (SortedMap) this.f66669a;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return b().firstKey();
        }

        public SortedMap<K, V2> headMap(K k10) {
            return d2.transformEntries((SortedMap) b().headMap(k10), (t) this.f66670b);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return b().lastKey();
        }

        public SortedMap<K, V2> subMap(K k10, K k11) {
            return d2.transformEntries((SortedMap) b().subMap(k10, k11), (t) this.f66670b);
        }

        public SortedMap<K, V2> tailMap(K k10) {
            return d2.transformEntries((SortedMap) b().tailMap(k10), (t) this.f66670b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class l<K, V> extends q3<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f66673a;

        public l(Iterator it) {
            this.f66673a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66673a.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return d2.c((Map.Entry) this.f66673a.next());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class l0<K, V> extends s0<K, V> implements io.odeeo.internal.u0.n<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f66674a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.u0.n<? extends K, ? extends V> f66675b;

        /* renamed from: c, reason: collision with root package name */
        public io.odeeo.internal.u0.n<V, K> f66676c;

        /* renamed from: d, reason: collision with root package name */
        public transient Set<V> f66677d;

        public l0(io.odeeo.internal.u0.n<? extends K, ? extends V> nVar, io.odeeo.internal.u0.n<V, K> nVar2) {
            this.f66674a = Collections.unmodifiableMap(nVar);
            this.f66675b = nVar;
            this.f66676c = nVar2;
        }

        @Override // io.odeeo.internal.u0.s0, io.odeeo.internal.u0.x0
        /* renamed from: a */
        public Map<K, V> delegate() {
            return this.f66674a;
        }

        @Override // io.odeeo.internal.u0.n
        public V forcePut(K k10, V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.n
        public io.odeeo.internal.u0.n<V, K> inverse() {
            io.odeeo.internal.u0.n<V, K> nVar = this.f66676c;
            if (nVar != null) {
                return nVar;
            }
            l0 l0Var = new l0(this.f66675b.inverse(), this);
            this.f66676c = l0Var;
            return l0Var;
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public Set<V> values() {
            Set<V> set = this.f66677d;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.f66675b.values());
            this.f66677d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class m<K, V1, V2> implements t<K, V1, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.odeeo.internal.t0.k f66678a;

        public m(io.odeeo.internal.t0.k kVar) {
            this.f66678a = kVar;
        }

        @Override // io.odeeo.internal.u0.d2.t
        public V2 transformEntry(K k10, V1 v12) {
            return (V2) this.f66678a.apply(v12);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class m0<K, V> extends io.odeeo.internal.u0.p0<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<Map.Entry<K, V>> f66679a;

        public m0(Collection<Map.Entry<K, V>> collection) {
            this.f66679a = collection;
        }

        @Override // io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: a */
        public Collection<Map.Entry<K, V>> delegate() {
            return this.f66679a;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return d2.b(this.f66679a.iterator());
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection
        public Object[] toArray() {
            return b();
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a(tArr);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class n<K, V> extends r0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public final Map<K, V> f66680d;

        /* renamed from: e, reason: collision with root package name */
        public final io.odeeo.internal.t0.v<? super Map.Entry<K, V>> f66681e;

        public n(Map<K, V> map, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
            this.f66680d = map;
            this.f66681e = vVar;
        }

        public boolean a(Object obj, V v10) {
            return this.f66681e.apply(d2.immutableEntry(obj, v10));
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Collection<V> b() {
            return new z(this, this.f66680d, this.f66681e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f66680d.containsKey(obj) && a(obj, this.f66680d.get(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v10 = this.f66680d.get(obj);
            if (v10 == null || !a(obj, v10)) {
                return null;
            }
            return v10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            io.odeeo.internal.t0.u.checkArgument(a(k10, v10));
            return this.f66680d.put(k10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                io.odeeo.internal.t0.u.checkArgument(a(entry.getKey(), entry.getValue()));
            }
            this.f66680d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.f66680d.remove(obj);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class n0<K, V> extends m0<K, V> implements Set<Map.Entry<K, V>> {
        public n0(Set<Map.Entry<K, V>> set) {
            super(set);
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
    public static class o<K, V> extends r0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public final Set<K> f66682d;

        /* renamed from: e, reason: collision with root package name */
        public final io.odeeo.internal.t0.k<? super K, V> f66683e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // io.odeeo.internal.u0.d2.s
            public Map<K, V> a() {
                return o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return d2.a((Set) o.this.c(), (io.odeeo.internal.t0.k) o.this.f66683e);
            }
        }

        public o(Set<K> set, io.odeeo.internal.t0.k<? super K, V> kVar) {
            this.f66682d = (Set) io.odeeo.internal.t0.u.checkNotNull(set);
            this.f66683e = (io.odeeo.internal.t0.k) io.odeeo.internal.t0.u.checkNotNull(kVar);
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<Map.Entry<K, V>> a() {
            return new a();
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Collection<V> b() {
            return io.odeeo.internal.u0.s.transform(this.f66682d, this.f66683e);
        }

        public Set<K> c() {
            return this.f66682d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return c().contains(obj);
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<K> createKeySet() {
            return d2.b(c());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (io.odeeo.internal.u0.s.a(c(), obj)) {
                return this.f66683e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (c().remove(obj)) {
                return this.f66683e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return c().size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class o0<K, V> extends z0<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableMap<K, ? extends V> f66685a;

        /* renamed from: b, reason: collision with root package name */
        public transient o0<K, V> f66686b;

        public o0(NavigableMap<K, ? extends V> navigableMap) {
            this.f66685a = navigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k10) {
            return d2.d(this.f66685a.ceilingEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return this.f66685a.ceilingKey(k10);
        }

        @Override // io.odeeo.internal.u0.z0, io.odeeo.internal.u0.s0, io.odeeo.internal.u0.x0
        /* renamed from: d */
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.f66685a);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return e3.unmodifiableNavigableSet(this.f66685a.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            o0<K, V> o0Var = this.f66686b;
            if (o0Var != null) {
                return o0Var;
            }
            o0<K, V> o0Var2 = new o0<>(this.f66685a.descendingMap(), this);
            this.f66686b = o0Var2;
            return o0Var2;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return d2.d(this.f66685a.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k10) {
            return d2.d(this.f66685a.floorEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return this.f66685a.floorKey(k10);
        }

        @Override // io.odeeo.internal.u0.z0, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k10) {
            return d2.d(this.f66685a.higherEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return this.f66685a.higherKey(k10);
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return d2.d(this.f66685a.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k10) {
            return d2.d(this.f66685a.lowerEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return this.f66685a.lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return e3.unmodifiableNavigableSet(this.f66685a.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.z0, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // io.odeeo.internal.u0.z0, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            return d2.unmodifiableNavigableMap(this.f66685a.headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            return d2.unmodifiableNavigableMap(this.f66685a.subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            return d2.unmodifiableNavigableMap(this.f66685a.tailMap(k10, z10));
        }

        public o0(NavigableMap<K, ? extends V> navigableMap, o0<K, V> o0Var) {
            this.f66685a = navigableMap;
            this.f66686b = o0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class p<A, B> extends io.odeeo.internal.t0.h<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.u0.n<A, B> f66687c;

        public p(io.odeeo.internal.u0.n<A, B> nVar) {
            this.f66687c = (io.odeeo.internal.u0.n) io.odeeo.internal.t0.u.checkNotNull(nVar);
        }

        public static <X, Y> Y a(io.odeeo.internal.u0.n<X, Y> nVar, X x10) {
            Y y10 = nVar.get(x10);
            io.odeeo.internal.t0.u.checkArgument(y10 != null, "No non-null mapping present for input: %s", x10);
            return y10;
        }

        @Override // io.odeeo.internal.t0.h
        public A c(B b10) {
            return (A) a(this.f66687c.inverse(), b10);
        }

        @Override // io.odeeo.internal.t0.h
        public B d(A a10) {
            return (B) a(this.f66687c, a10);
        }

        @Override // io.odeeo.internal.t0.h, io.odeeo.internal.t0.k
        public boolean equals(Object obj) {
            if (obj instanceof p) {
                return this.f66687c.equals(((p) obj).f66687c);
            }
            return false;
        }

        public int hashCode() {
            return this.f66687c.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.f66687c + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class p0<V> implements a2.a<V> {

        /* renamed from: a, reason: collision with root package name */
        public final V f66688a;

        /* renamed from: b, reason: collision with root package name */
        public final V f66689b;

        public p0(V v10, V v11) {
            this.f66688a = v10;
            this.f66689b = v11;
        }

        public static <V> a2.a<V> a(V v10, V v11) {
            return new p0(v10, v11);
        }

        @Override // io.odeeo.internal.u0.a2.a
        public boolean equals(Object obj) {
            if (obj instanceof a2.a) {
                a2.a aVar = (a2.a) obj;
                if (io.odeeo.internal.t0.p.equal(this.f66688a, aVar.leftValue()) && io.odeeo.internal.t0.p.equal(this.f66689b, aVar.rightValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.a2.a
        public int hashCode() {
            return io.odeeo.internal.t0.p.hashCode(this.f66688a, this.f66689b);
        }

        @Override // io.odeeo.internal.u0.a2.a
        public V leftValue() {
            return this.f66688a;
        }

        @Override // io.odeeo.internal.u0.a2.a
        public V rightValue() {
            return this.f66689b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(this.f66688a);
            sb2.append(", ");
            return w0.i.e(sb2, this.f66689b, ")");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class q<K, V> extends s0<K, V> implements NavigableMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public transient Comparator<? super K> f66690a;

        /* renamed from: b, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f66691b;

        /* renamed from: c, reason: collision with root package name */
        public transient NavigableSet<K> f66692c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // io.odeeo.internal.u0.d2.s
            public Map<K, V> a() {
                return q.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return q.this.e();
            }
        }

        @Override // io.odeeo.internal.u0.s0, io.odeeo.internal.u0.x0
        /* renamed from: a */
        public final Map<K, V> delegate() {
            return f();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k10) {
            return f().floorEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return f().floorKey(k10);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f66690a;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = f().comparator();
            if (comparator2 == null) {
                comparator2 = p2.natural();
            }
            p2 p2VarA = a((Comparator) comparator2);
            this.f66690a = p2VarA;
            return p2VarA;
        }

        public Set<Map.Entry<K, V>> d() {
            return new a();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return f().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return f();
        }

        public abstract Iterator<Map.Entry<K, V>> e();

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f66691b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setD = d();
            this.f66691b = setD;
            return setD;
        }

        public abstract NavigableMap<K, V> f();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return f().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return f().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k10) {
            return f().ceilingEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return f().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            return f().tailMap(k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k10) {
            return f().lowerEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return f().lowerKey(k10);
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return f().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return f().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k10) {
            return f().higherEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return f().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f66692c;
            if (navigableSet != null) {
                return navigableSet;
            }
            e0 e0Var = new e0(this);
            this.f66692c = e0Var;
            return e0Var;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return f().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return f().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            return f().subMap(k11, z11, k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            return f().headMap(k10, z10).descendingMap();
        }

        @Override // io.odeeo.internal.u0.x0
        public String toString() {
            return c();
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public Collection<V> values() {
            return new q0(this);
        }

        public static <T> p2<T> a(Comparator<T> comparator) {
            return p2.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k10) {
            return tailMap(k10, true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class q0<K, V> extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f66694a;

        public q0(Map<K, V> map) {
            this.f66694a = (Map) io.odeeo.internal.t0.u.checkNotNull(map);
        }

        public final Map<K, V> a() {
            return this.f66694a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return d2.c(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (io.odeeo.internal.t0.p.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) io.odeeo.internal.t0.u.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = e3.newHashSet();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) io.odeeo.internal.t0.u.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = e3.newHashSet();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class r implements io.odeeo.internal.t0.k<Map.Entry<?, ?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f66695a;

        /* renamed from: b, reason: collision with root package name */
        public static final r f66696b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ r[] f66697c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum a extends r {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.odeeo.internal.u0.d2.r, io.odeeo.internal.t0.k
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum b extends r {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.odeeo.internal.u0.d2.r, io.odeeo.internal.t0.k
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            a aVar = new a("KEY", 0);
            f66695a = aVar;
            b bVar = new b("VALUE", 1);
            f66696b = bVar;
            f66697c = new r[]{aVar, bVar};
        }

        public r(String str, int i10) {
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) f66697c.clone();
        }

        @Override // io.odeeo.internal.t0.k
        public abstract /* synthetic */ Object apply(Map.Entry<?, ?> entry);

        public /* synthetic */ r(String str, int i10, e eVar) {
            this(str, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class r0<K, V> extends AbstractMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f66698a;

        /* renamed from: b, reason: collision with root package name */
        public transient Set<K> f66699b;

        /* renamed from: c, reason: collision with root package name */
        public transient Collection<V> f66700c;

        public abstract Set<Map.Entry<K, V>> a();

        public Collection<V> b() {
            return new q0(this);
        }

        public Set<K> createKeySet() {
            return new b0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f66698a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f66698a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f66699b;
            if (set != null) {
                return set;
            }
            Set<K> setCreateKeySet = createKeySet();
            this.f66699b = setCreateKeySet;
            return setCreateKeySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f66700c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionB = b();
            this.f66700c = collectionB;
            return collectionB;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class s<K, V> extends e3.j<Map.Entry<K, V>> {
        public abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object objD = d2.d(a(), key);
                if (io.odeeo.internal.t0.p.equal(objD, entry.getValue()) && (objD != null || a().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) io.odeeo.internal.t0.u.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return e3.a((Set<?>) this, collection.iterator());
            }
        }

        @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) io.odeeo.internal.t0.u.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSetWithExpectedSize = e3.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSetNewHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface t<K, V1, V2> {
        V2 transformEntry(K k10, V1 v12);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class u<K, V> extends v<K, V> implements io.odeeo.internal.u0.n<K, V> {

        /* renamed from: g, reason: collision with root package name */
        public final io.odeeo.internal.u0.n<V, K> f66701g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a implements io.odeeo.internal.t0.v<Map.Entry<V, K>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ io.odeeo.internal.t0.v f66702a;

            public a(io.odeeo.internal.t0.v vVar) {
                this.f66702a = vVar;
            }

            @Override // io.odeeo.internal.t0.v
            public boolean apply(Map.Entry<V, K> entry) {
                return this.f66702a.apply(d2.immutableEntry(entry.getValue(), entry.getKey()));
            }
        }

        public u(io.odeeo.internal.u0.n<K, V> nVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
            super(nVar, vVar);
            this.f66701g = new u(nVar.inverse(), a(vVar), this);
        }

        public static <K, V> io.odeeo.internal.t0.v<Map.Entry<V, K>> a(io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
            return new a(vVar);
        }

        public io.odeeo.internal.u0.n<K, V> c() {
            return (io.odeeo.internal.u0.n) this.f66680d;
        }

        @Override // io.odeeo.internal.u0.n
        public V forcePut(K k10, V v10) {
            io.odeeo.internal.t0.u.checkArgument(a(k10, v10));
            return c().forcePut(k10, v10);
        }

        @Override // io.odeeo.internal.u0.n
        public io.odeeo.internal.u0.n<V, K> inverse() {
            return this.f66701g;
        }

        @Override // io.odeeo.internal.u0.d2.r0, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.f66701g.keySet();
        }

        public u(io.odeeo.internal.u0.n<K, V> nVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar, io.odeeo.internal.u0.n<V, K> nVar2) {
            super(nVar, vVar);
            this.f66701g = nVar2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class v<K, V> extends n<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f66703f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends y0<Map.Entry<K, V>> {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.d2$v$a$a, reason: collision with other inner class name */
            public class C0658a extends o3<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: io.odeeo.internal.u0.d2$v$a$a$a, reason: collision with other inner class name */
                public class C0659a extends t0<K, V> {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Map.Entry f66706a;

                    public C0659a(Map.Entry entry) {
                        this.f66706a = entry;
                    }

                    @Override // io.odeeo.internal.u0.t0, io.odeeo.internal.u0.x0
                    /* renamed from: a */
                    public Map.Entry<K, V> delegate() {
                        return this.f66706a;
                    }

                    @Override // io.odeeo.internal.u0.t0, java.util.Map.Entry
                    public V setValue(V v10) {
                        io.odeeo.internal.t0.u.checkArgument(v.this.a(getKey(), v10));
                        return (V) super.setValue(v10);
                    }
                }

                public C0658a(Iterator it) {
                    super(it);
                }

                @Override // io.odeeo.internal.u0.o3
                public Map.Entry<K, V> a(Map.Entry<K, V> entry) {
                    return new C0659a(entry);
                }
            }

            public a() {
            }

            @Override // io.odeeo.internal.u0.y0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
            /* renamed from: c */
            public Set<Map.Entry<K, V>> delegate() {
                return v.this.f66703f;
            }

            @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0658a(v.this.f66703f.iterator());
            }

            public /* synthetic */ a(v vVar, e eVar) {
                this();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b extends b0<K, V> {
            public b() {
                super(v.this);
            }

            @Override // io.odeeo.internal.u0.d2.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!v.this.containsKey(obj)) {
                    return false;
                }
                v.this.f66680d.remove(obj);
                return true;
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                v vVar = v.this;
                return v.a(vVar.f66680d, vVar.f66681e, collection);
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                v vVar = v.this;
                return v.b(vVar.f66680d, vVar.f66681e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return z1.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) z1.newArrayList(iterator()).toArray(tArr);
            }
        }

        public v(Map<K, V> map, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
            super(map, vVar);
            this.f66703f = e3.filter(map.entrySet(), this.f66681e);
        }

        public static <K, V> boolean b(Map<K, V> map, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (vVar.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<Map.Entry<K, V>> a() {
            return new a(this, null);
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<K> createKeySet() {
            return new b();
        }

        public static <K, V> boolean a(Map<K, V> map, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (vVar.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class w<K, V> extends io.odeeo.internal.u0.i<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableMap<K, V> f66709a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.t0.v<? super Map.Entry<K, V>> f66710b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<K, V> f66711c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends e0<K, V> {
            public a(NavigableMap navigableMap) {
                super(navigableMap);
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.a(w.this.f66709a, w.this.f66710b, collection);
            }

            @Override // io.odeeo.internal.u0.e3.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.b(w.this.f66709a, w.this.f66710b, collection);
            }
        }

        public w(NavigableMap<K, V> navigableMap, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
            this.f66709a = (NavigableMap) io.odeeo.internal.t0.u.checkNotNull(navigableMap);
            this.f66710b = vVar;
            this.f66711c = new v(navigableMap, vVar);
        }

        @Override // io.odeeo.internal.u0.d2.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f66711c.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f66709a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f66711c.containsKey(obj);
        }

        @Override // io.odeeo.internal.u0.i, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return d2.filterEntries((NavigableMap) this.f66709a.descendingMap(), (io.odeeo.internal.t0.v) this.f66710b);
        }

        @Override // io.odeeo.internal.u0.d2.a0, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f66711c.entrySet();
        }

        @Override // io.odeeo.internal.u0.i, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return this.f66711c.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            return d2.filterEntries((NavigableMap) this.f66709a.headMap(k10, z10), (io.odeeo.internal.t0.v) this.f66710b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !v1.any(this.f66709a.entrySet(), this.f66710b);
        }

        @Override // io.odeeo.internal.u0.i, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // io.odeeo.internal.u0.i, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) v1.a(this.f66709a.entrySet(), this.f66710b);
        }

        @Override // io.odeeo.internal.u0.i, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) v1.a(this.f66709a.descendingMap().entrySet(), this.f66710b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            return this.f66711c.put(k10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f66711c.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return this.f66711c.remove(obj);
        }

        @Override // io.odeeo.internal.u0.d2.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f66711c.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            return d2.filterEntries((NavigableMap) this.f66709a.subMap(k10, z10, k11, z11), (io.odeeo.internal.t0.v) this.f66710b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            return d2.filterEntries((NavigableMap) this.f66709a.tailMap(k10, z10), (io.odeeo.internal.t0.v) this.f66710b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new z(this, this.f66709a, this.f66710b);
        }

        @Override // io.odeeo.internal.u0.d2.a0
        public Iterator<Map.Entry<K, V>> a() {
            return w1.filter(this.f66709a.entrySet().iterator(), this.f66710b);
        }

        @Override // io.odeeo.internal.u0.i
        public Iterator<Map.Entry<K, V>> b() {
            return w1.filter(this.f66709a.descendingMap().entrySet().iterator(), this.f66710b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class x<K, V> extends v<K, V> implements SortedMap<K, V> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends v<K, V>.b implements SortedSet<K> {
            public a() {
                super();
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
                return x.this.d().comparator();
            }

            @Override // java.util.SortedSet
            public K first() {
                return (K) x.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(K k10) {
                return (SortedSet) x.this.headMap(k10).keySet();
            }

            @Override // java.util.SortedSet
            public K last() {
                return (K) x.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(K k10, K k11) {
                return (SortedSet) x.this.subMap(k10, k11).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(K k10) {
                return (SortedSet) x.this.tailMap(k10).keySet();
            }
        }

        public x(SortedMap<K, V> sortedMap, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
            super(sortedMap, vVar);
        }

        @Override // io.odeeo.internal.u0.d2.v, io.odeeo.internal.u0.d2.r0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> createKeySet() {
            return new a();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, V> d() {
            return (SortedMap) this.f66680d;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return keySet().iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k10) {
            return new x(d().headMap(k10), this.f66681e);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            SortedMap<K, V> sortedMapD = d();
            while (true) {
                K kLastKey = sortedMapD.lastKey();
                if (a(kLastKey, this.f66680d.get(kLastKey))) {
                    return kLastKey;
                }
                sortedMapD = d().headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return new x(d().subMap(k10, k11), this.f66681e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k10) {
            return new x(d().tailMap(k10), this.f66681e);
        }

        @Override // io.odeeo.internal.u0.d2.r0, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class y<K, V> extends n<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public final io.odeeo.internal.t0.v<? super K> f66714f;

        public y(Map<K, V> map, io.odeeo.internal.t0.v<? super K> vVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar2) {
            super(map, vVar2);
            this.f66714f = vVar;
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<Map.Entry<K, V>> a() {
            return e3.filter(this.f66680d.entrySet(), this.f66681e);
        }

        @Override // io.odeeo.internal.u0.d2.n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f66680d.containsKey(obj) && this.f66714f.apply(obj);
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<K> createKeySet() {
            return e3.filter(this.f66680d.keySet(), this.f66714f);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class z<K, V> extends q0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final Map<K, V> f66715b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.t0.v<? super Map.Entry<K, V>> f66716c;

        public z(Map<K, V> map, Map<K, V> map2, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
            super(map);
            this.f66715b = map2;
            this.f66716c = vVar;
        }

        @Override // io.odeeo.internal.u0.d2.q0, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f66715b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f66716c.apply(next) && io.odeeo.internal.t0.p.equal(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.d2.q0, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f66715b.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f66716c.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // io.odeeo.internal.u0.d2.q0, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f66715b.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f66716c.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return z1.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) z1.newArrayList(iterator()).toArray(tArr);
        }
    }

    public static <A, B> io.odeeo.internal.t0.h<A, B> asConverter(io.odeeo.internal.u0.n<A, B> nVar) {
        return new p(nVar);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, io.odeeo.internal.t0.k<? super K, V> kVar) {
        return new o(set, kVar);
    }

    public static <V> io.odeeo.internal.t0.k<Map.Entry<?, V>, V> b() {
        return r.f66696b;
    }

    public static <K, V> Iterator<V> c(Iterator<Map.Entry<K, V>> it) {
        return new f(it);
    }

    public static <K, V> Map.Entry<K, V> d(Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return c(entry);
    }

    public static <K, V> a2<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? difference((SortedMap) map, (Map) map2) : difference(map, map2, io.odeeo.internal.t0.i.equals());
    }

    public static <V> V e(Map<?, V> map, Object obj) {
        io.odeeo.internal.t0.u.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        return map instanceof n ? a((n) map, (io.odeeo.internal.t0.v) vVar) : new v((Map) io.odeeo.internal.t0.u.checkNotNull(map), vVar);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, io.odeeo.internal.t0.v<? super K> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        io.odeeo.internal.t0.v vVarA = a(vVar);
        return map instanceof n ? a((n) map, vVarA) : new y((Map) io.odeeo.internal.t0.u.checkNotNull(map), vVar, vVarA);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, io.odeeo.internal.t0.v<? super V> vVar) {
        return filterEntries(map, b(vVar));
    }

    public static j1<String, String> fromProperties(Properties properties) {
        j1.b bVarBuilder = j1.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String str = (String) enumerationPropertyNames.nextElement();
            bVarBuilder.put(str, properties.getProperty(str));
        }
        return bVarBuilder.build();
    }

    public static <K, V> Map.Entry<K, V> immutableEntry(K k10, V v10) {
        return new e1(k10, v10);
    }

    public static <K extends Enum<K>, V> j1<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof f1) {
            return (f1) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return j1.of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        io.odeeo.internal.u0.r.a(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((EnumMap) key, (K) value);
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            io.odeeo.internal.u0.r.a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return f1.a(enumMap);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) io.odeeo.internal.t0.u.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i10) {
        return new HashMap<>(a(i10));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i10) {
        return new LinkedHashMap<>(a(i10));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, s2<K> s2Var) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != p2.natural() && s2Var.hasLowerBound() && s2Var.hasUpperBound()) {
            io.odeeo.internal.t0.u.checkArgument(navigableMap.comparator().compare(s2Var.lowerEndpoint(), s2Var.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (s2Var.hasLowerBound() && s2Var.hasUpperBound()) {
            Comparable comparableLowerEndpoint = s2Var.lowerEndpoint();
            io.odeeo.internal.u0.o oVarLowerBoundType = s2Var.lowerBoundType();
            io.odeeo.internal.u0.o oVar = io.odeeo.internal.u0.o.CLOSED;
            return navigableMap.subMap(comparableLowerEndpoint, oVarLowerBoundType == oVar, s2Var.upperEndpoint(), s2Var.upperBoundType() == oVar);
        }
        if (s2Var.hasLowerBound()) {
            return navigableMap.tailMap(s2Var.lowerEndpoint(), s2Var.lowerBoundType() == io.odeeo.internal.u0.o.CLOSED);
        }
        if (s2Var.hasUpperBound()) {
            return navigableMap.headMap(s2Var.upperEndpoint(), s2Var.upperBoundType() == io.odeeo.internal.u0.o.CLOSED);
        }
        return (NavigableMap) io.odeeo.internal.t0.u.checkNotNull(navigableMap);
    }

    public static <K, V> io.odeeo.internal.u0.n<K, V> synchronizedBiMap(io.odeeo.internal.u0.n<K, V> nVar) {
        return m3.a(nVar, (Object) null);
    }

    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return m3.a(navigableMap);
    }

    public static <K, V> j1<K, V> toMap(Iterable<K> iterable, io.odeeo.internal.t0.k<? super K, V> kVar) {
        return toMap(iterable.iterator(), kVar);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, t<? super K, ? super V1, V2> tVar) {
        return new i0(map, tVar);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, io.odeeo.internal.t0.k<? super V1, V2> kVar) {
        return transformEntries(map, a(kVar));
    }

    public static <K, V> j1<K, V> uniqueIndex(Iterable<V> iterable, io.odeeo.internal.t0.k<? super V, K> kVar) {
        return uniqueIndex(iterable.iterator(), kVar);
    }

    public static <K, V> io.odeeo.internal.u0.n<K, V> unmodifiableBiMap(io.odeeo.internal.u0.n<? extends K, ? extends V> nVar) {
        return new l0(nVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        io.odeeo.internal.t0.u.checkNotNull(navigableMap);
        return navigableMap instanceof o0 ? navigableMap : new o0(navigableMap);
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, io.odeeo.internal.t0.k<? super K, V> kVar) {
        return new f0(sortedSet, kVar);
    }

    public static <E> Set<E> b(Set<E> set) {
        return new h(set);
    }

    public static <K, V> Map<K, V> c(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    public static <V> V d(Map<?, V> map, Object obj) {
        io.odeeo.internal.t0.u.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, io.odeeo.internal.t0.v<? super V> vVar) {
        return filterEntries((SortedMap) sortedMap, b(vVar));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <K, V> j1<K, V> toMap(Iterator<K> it, io.odeeo.internal.t0.k<? super K, V> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        while (it.hasNext()) {
            K next = it.next();
            linkedHashMapNewLinkedHashMap.put(next, kVar.apply(next));
        }
        return j1.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, t<? super K, ? super V1, V2> tVar) {
        return new k0(sortedMap, tVar);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, io.odeeo.internal.t0.k<? super V1, V2> kVar) {
        return transformEntries((SortedMap) sortedMap, a(kVar));
    }

    public static <K, V> j1<K, V> uniqueIndex(Iterator<V> it, io.odeeo.internal.t0.k<? super V, K> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        j1.b bVarBuilder = j1.builder();
        while (it.hasNext()) {
            V next = it.next();
            bVarBuilder.put(kVar.apply(next), next);
        }
        try {
            return bVarBuilder.build();
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, io.odeeo.internal.t0.k<? super K, V> kVar) {
        return new d0(navigableSet, kVar);
    }

    public static <E> SortedSet<E> b(SortedSet<E> sortedSet) {
        return new i(sortedSet);
    }

    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, io.odeeo.internal.t0.v<? super V> vVar) {
        return filterEntries((NavigableMap) navigableMap, b(vVar));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, t<? super K, ? super V1, V2> tVar) {
        return new j0(navigableMap, tVar);
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, io.odeeo.internal.t0.k<? super V1, V2> kVar) {
        return transformEntries((NavigableMap) navigableMap, a(kVar));
    }

    public static <E> NavigableSet<E> b(NavigableSet<E> navigableSet) {
        return new j(navigableSet);
    }

    public static <K, V> io.odeeo.internal.u0.n<K, V> filterValues(io.odeeo.internal.u0.n<K, V> nVar, io.odeeo.internal.t0.v<? super V> vVar) {
        return filterEntries((io.odeeo.internal.u0.n) nVar, b(vVar));
    }

    public static <K, V> q3<Map.Entry<K, V>> b(Iterator<Map.Entry<K, V>> it) {
        return new l(it);
    }

    public static <K, V> Set<Map.Entry<K, V>> c(Set<Map.Entry<K, V>> set) {
        return new n0(Collections.unmodifiableSet(set));
    }

    public static <K, V> a2<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, io.odeeo.internal.t0.i<? super V> iVar) {
        io.odeeo.internal.t0.u.checkNotNull(iVar);
        LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = newLinkedHashMap();
        LinkedHashMap linkedHashMapNewLinkedHashMap3 = newLinkedHashMap();
        a(map, map2, iVar, linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
        return new c0(linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        if (sortedMap instanceof x) {
            return a((x) sortedMap, (io.odeeo.internal.t0.v) vVar);
        }
        return new x((SortedMap) io.odeeo.internal.t0.u.checkNotNull(sortedMap), vVar);
    }

    public static <K> io.odeeo.internal.t0.k<Map.Entry<K, ?>, K> a() {
        return r.f66695a;
    }

    public static <K, V1, V2> io.odeeo.internal.t0.k<Map.Entry<K, V1>, V2> b(t<? super K, ? super V1, V2> tVar) {
        io.odeeo.internal.t0.u.checkNotNull(tVar);
        return new b(tVar);
    }

    public static <K, V> Map.Entry<K, V> c(Map.Entry<? extends K, ? extends V> entry) {
        io.odeeo.internal.t0.u.checkNotNull(entry);
        return new k(entry);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, io.odeeo.internal.t0.v<? super K> vVar) {
        return filterEntries((SortedMap) sortedMap, a(vVar));
    }

    public static <K, V> Iterator<K> a(Iterator<Map.Entry<K, V>> it) {
        return new e(it);
    }

    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, io.odeeo.internal.t0.v<? super K> vVar) {
        return filterEntries((NavigableMap) navigableMap, a(vVar));
    }

    public static int a(int i10) {
        if (i10 < 3) {
            io.odeeo.internal.u0.r.a(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <V> io.odeeo.internal.t0.v<Map.Entry<?, V>> b(io.odeeo.internal.t0.v<? super V> vVar) {
        return io.odeeo.internal.t0.w.compose(vVar, b());
    }

    public static boolean c(Map<?, ?> map, Object obj) {
        io.odeeo.internal.t0.u.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <K, V> io.odeeo.internal.u0.n<K, V> filterKeys(io.odeeo.internal.u0.n<K, V> nVar, io.odeeo.internal.t0.v<? super K> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        return filterEntries((io.odeeo.internal.u0.n) nVar, a(vVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void a(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, io.odeeo.internal.t0.i<? super V> iVar, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, a2.a<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                V vRemove = map4.remove(key);
                if (iVar.equivalent(value, vRemove)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, p0.a(value, vRemove));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    public static <K, V> boolean b(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(c((Map.Entry) obj));
        }
        return false;
    }

    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        if (navigableMap instanceof w) {
            return a((w) navigableMap, (io.odeeo.internal.t0.v) vVar);
        }
        return new w((NavigableMap) io.odeeo.internal.t0.u.checkNotNull(navigableMap), vVar);
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> i3<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        io.odeeo.internal.t0.u.checkNotNull(sortedMap);
        io.odeeo.internal.t0.u.checkNotNull(map);
        Comparator comparatorA = a(sortedMap.comparator());
        TreeMap treeMapNewTreeMap = newTreeMap(comparatorA);
        TreeMap treeMapNewTreeMap2 = newTreeMap(comparatorA);
        treeMapNewTreeMap2.putAll(map);
        TreeMap treeMapNewTreeMap3 = newTreeMap(comparatorA);
        TreeMap treeMapNewTreeMap4 = newTreeMap(comparatorA);
        a(sortedMap, map, io.odeeo.internal.t0.i.equals(), treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new h0(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    public static <K, V> io.odeeo.internal.u0.n<K, V> filterEntries(io.odeeo.internal.u0.n<K, V> nVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(nVar);
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        return nVar instanceof u ? a((u) nVar, (io.odeeo.internal.t0.v) vVar) : new u(nVar, vVar);
    }

    public static String b(Map<?, ?> map) {
        StringBuilder sbA = io.odeeo.internal.u0.s.a(map.size());
        sbA.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append(G5.T);
            sbA.append(entry.getValue());
            z10 = false;
        }
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    public static <E> Comparator<? super E> a(Comparator<? super E> comparator) {
        return comparator != null ? comparator : p2.natural();
    }

    public static <K, V> Iterator<Map.Entry<K, V>> a(Set<K> set, io.odeeo.internal.t0.k<? super K, V> kVar) {
        return new g(set.iterator(), kVar);
    }

    public static <K> K b(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K, V1, V2> t<K, V1, V2> a(io.odeeo.internal.t0.k<? super V1, V2> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        return new m(kVar);
    }

    public static <K, V1, V2> io.odeeo.internal.t0.k<V1, V2> a(t<? super K, V1, V2> tVar, K k10) {
        io.odeeo.internal.t0.u.checkNotNull(tVar);
        return new a(tVar, k10);
    }

    public static <V2, K, V1> Map.Entry<K, V2> a(t<? super K, ? super V1, V2> tVar, Map.Entry<K, V1> entry) {
        io.odeeo.internal.t0.u.checkNotNull(tVar);
        io.odeeo.internal.t0.u.checkNotNull(entry);
        return new c(entry, tVar);
    }

    public static <K, V1, V2> io.odeeo.internal.t0.k<Map.Entry<K, V1>, Map.Entry<K, V2>> a(t<? super K, ? super V1, V2> tVar) {
        io.odeeo.internal.t0.u.checkNotNull(tVar);
        return new d(tVar);
    }

    public static <K> io.odeeo.internal.t0.v<Map.Entry<K, ?>> a(io.odeeo.internal.t0.v<? super K> vVar) {
        return io.odeeo.internal.t0.w.compose(vVar, a());
    }

    public static <K, V> Map<K, V> a(n<K, V> nVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        return new v(nVar.f66680d, io.odeeo.internal.t0.w.and(nVar.f66681e, vVar));
    }

    public static <K, V> SortedMap<K, V> a(x<K, V> xVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        return new x(xVar.d(), io.odeeo.internal.t0.w.and(xVar.f66681e, vVar));
    }

    public static <K, V> NavigableMap<K, V> a(w<K, V> wVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        return new w(wVar.f66709a, io.odeeo.internal.t0.w.and(wVar.f66710b, vVar));
    }

    public static <K, V> io.odeeo.internal.u0.n<K, V> a(u<K, V> uVar, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        return new u(uVar.c(), io.odeeo.internal.t0.w.and(uVar.f66681e, vVar));
    }

    public static boolean a(Map<?, ?> map, Object obj) {
        return w1.contains(c(map.entrySet().iterator()), obj);
    }

    public static <K, V> boolean a(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(c((Map.Entry) obj));
        }
        return false;
    }

    public static <E> j1<E, Integer> a(Collection<E> collection) {
        j1.b bVar = new j1.b(collection.size());
        Iterator<E> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bVar.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return bVar.build();
    }
}
