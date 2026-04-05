package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
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
public final class m3 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<K, V> extends j<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: f, reason: collision with root package name */
        public transient Set<Map.Entry<K, Collection<V>>> f66935f;

        /* renamed from: g, reason: collision with root package name */
        public transient Collection<Collection<V>> f66936g;

        public b(Map<K, Collection<V>> map, Object obj) {
            super(map, obj);
        }

        @Override // io.odeeo.internal.u0.m3.j, java.util.Map
        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // io.odeeo.internal.u0.m3.j, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66935f == null) {
                        this.f66935f = new c(c().entrySet(), this.f66958b);
                    }
                    set = this.f66935f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // io.odeeo.internal.u0.m3.j, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f66958b) {
                try {
                    if (this.f66936g == null) {
                        this.f66936g = new d(c().values(), this.f66958b);
                    }
                    collection = this.f66936g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // io.odeeo.internal.u0.m3.j, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collectionD;
            synchronized (this.f66958b) {
                Collection collection = (Collection) super.get(obj);
                collectionD = collection == null ? null : m3.d(collection, this.f66958b);
            }
            return collectionD;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<V> extends f<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends o3<Collection<V>, Collection<V>> {
            public a(Iterator it) {
                super(it);
            }

            @Override // io.odeeo.internal.u0.o3
            public Collection<V> a(Collection<V> collection) {
                return m3.d(collection, d.this.f66958b);
            }
        }

        public d(Collection<Collection<V>> collection, Object obj) {
            super(collection, obj);
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<K, V> extends j<K, V> implements io.odeeo.internal.u0.n<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: f, reason: collision with root package name */
        public transient Set<V> f66941f;

        /* renamed from: g, reason: collision with root package name */
        public transient io.odeeo.internal.u0.n<V, K> f66942g;

        @Override // io.odeeo.internal.u0.m3.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public io.odeeo.internal.u0.n<K, V> c() {
            return (io.odeeo.internal.u0.n) super.c();
        }

        @Override // io.odeeo.internal.u0.n
        public V forcePut(K k10, V v10) {
            V vForcePut;
            synchronized (this.f66958b) {
                vForcePut = b().forcePut(k10, v10);
            }
            return vForcePut;
        }

        @Override // io.odeeo.internal.u0.n
        public io.odeeo.internal.u0.n<V, K> inverse() {
            io.odeeo.internal.u0.n<V, K> nVar;
            synchronized (this.f66958b) {
                try {
                    if (this.f66942g == null) {
                        this.f66942g = new e(b().inverse(), this.f66958b, this);
                    }
                    nVar = this.f66942g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return nVar;
        }

        public e(io.odeeo.internal.u0.n<K, V> nVar, Object obj, io.odeeo.internal.u0.n<V, K> nVar2) {
            super(nVar, obj);
            this.f66942g = nVar2;
        }

        @Override // io.odeeo.internal.u0.m3.j, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66941f == null) {
                        this.f66941f = m3.b((Set) b().values(), this.f66958b);
                    }
                    set = this.f66941f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f<E> extends o implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public boolean add(E e10) {
            boolean zAdd;
            synchronized (this.f66958b) {
                zAdd = c().add(e10);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f66958b) {
                zAddAll = c().addAll(collection);
            }
            return zAddAll;
        }

        /* renamed from: b */
        public Collection<E> c() {
            return (Collection) super.a();
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f66958b) {
                c().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f66958b) {
                zContains = c().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.f66958b) {
                zContainsAll = c().containsAll(collection);
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f66958b) {
                zIsEmpty = c().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return c().iterator();
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.f66958b) {
                zRemove = c().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f66958b) {
                zRemoveAll = c().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f66958b) {
                zRetainAll = c().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f66958b) {
                size = c().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f66958b) {
                array = c().toArray();
            }
            return array;
        }

        public f(Collection<E> collection, Object obj) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f66958b) {
                tArr2 = (T[]) c().toArray(tArr);
            }
            return tArr2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g<K, V> extends o implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public g(Map.Entry<K, V> entry, Object obj) {
            super(entry, obj);
        }

        public Map.Entry<K, V> b() {
            return (Map.Entry) super.a();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.f66958b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.f66958b) {
                key = b().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.f66958b) {
                value = b().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.f66958b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V value;
            synchronized (this.f66958b) {
                value = b().setValue(v10);
            }
            return value;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<E> extends f<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public h(List<E> list, Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i10, E e10) {
            synchronized (this.f66958b) {
                b().add(i10, e10);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f66958b) {
                zAddAll = b().addAll(i10, collection);
            }
            return zAddAll;
        }

        @Override // io.odeeo.internal.u0.m3.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<E> c() {
            return (List) super.c();
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f66958b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public E get(int i10) {
            E e10;
            synchronized (this.f66958b) {
                e10 = b().get(i10);
            }
            return e10;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.f66958b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.f66958b) {
                iIndexOf = b().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.f66958b) {
                iLastIndexOf = b().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return b().listIterator();
        }

        @Override // java.util.List
        public E remove(int i10) {
            E eRemove;
            synchronized (this.f66958b) {
                eRemove = b().remove(i10);
            }
            return eRemove;
        }

        @Override // java.util.List
        public E set(int i10, E e10) {
            E e11;
            synchronized (this.f66958b) {
                e11 = b().set(i10, e10);
            }
            return e11;
        }

        @Override // java.util.List
        public List<E> subList(int i10, int i11) {
            List<E> listB;
            synchronized (this.f66958b) {
                listB = m3.b((List) b().subList(i10, i11), this.f66958b);
            }
            return listB;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i10) {
            return b().listIterator(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i<K, V> extends k<K, V> implements y1<K, V> {
        private static final long serialVersionUID = 0;

        public i(y1<K, V> y1Var, Object obj) {
            super(y1Var, obj);
        }

        @Override // io.odeeo.internal.u0.m3.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public y1<K, V> b() {
            return (y1) super.b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((i<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((i<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V> get(K k10) {
            List<V> listB;
            synchronized (this.f66958b) {
                listB = m3.b((List) b().get((y1<K, V>) k10), this.f66958b);
            }
            return listB;
        }

        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V> removeAll(Object obj) {
            List<V> listRemoveAll;
            synchronized (this.f66958b) {
                listRemoveAll = b().removeAll(obj);
            }
            return listRemoveAll;
        }

        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            List<V> listReplaceValues;
            synchronized (this.f66958b) {
                listReplaceValues = b().replaceValues((y1<K, V>) k10, (Iterable) iterable);
            }
            return listReplaceValues;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j<K, V> extends o implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public transient Set<K> f66943c;

        /* renamed from: d, reason: collision with root package name */
        public transient Collection<V> f66944d;

        /* renamed from: e, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f66945e;

        public j(Map<K, V> map, Object obj) {
            super(map, obj);
        }

        /* renamed from: b */
        public Map<K, V> c() {
            return (Map) super.a();
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f66958b) {
                c().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f66958b) {
                zContainsKey = c().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f66958b) {
                zContainsValue = c().containsValue(obj);
            }
            return zContainsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66945e == null) {
                        this.f66945e = m3.b((Set) c().entrySet(), this.f66958b);
                    }
                    set = this.f66945e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f66958b) {
                zEquals = c().equals(obj);
            }
            return zEquals;
        }

        public V get(Object obj) {
            V v10;
            synchronized (this.f66958b) {
                v10 = c().get(obj);
            }
            return v10;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.f66958b) {
                iHashCode = c().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f66958b) {
                zIsEmpty = c().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66943c == null) {
                        this.f66943c = m3.b((Set) c().keySet(), this.f66958b);
                    }
                    set = this.f66943c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public V put(K k10, V v10) {
            V vPut;
            synchronized (this.f66958b) {
                vPut = c().put(k10, v10);
            }
            return vPut;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f66958b) {
                c().putAll(map);
            }
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            V vRemove;
            synchronized (this.f66958b) {
                vRemove = c().remove(obj);
            }
            return vRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f66958b) {
                size = c().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f66958b) {
                try {
                    if (this.f66944d == null) {
                        this.f66944d = m3.c(c().values(), this.f66958b);
                    }
                    collection = this.f66944d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class o implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f66957a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f66958b;

        public o(Object obj, Object obj2) {
            this.f66957a = io.odeeo.internal.t0.u.checkNotNull(obj);
            this.f66958b = obj2 == null ? this : obj2;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.f66958b) {
                objectOutputStream.defaultWriteObject();
            }
        }

        public Object a() {
            return this.f66957a;
        }

        public String toString() {
            String string;
            synchronized (this.f66958b) {
                string = this.f66957a.toString();
            }
            return string;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class p<E> extends h<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public p(List<E> list, Object obj) {
            super(list, obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class q<E> extends f<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public q(Set<E> set, Object obj) {
            super(set, obj);
        }

        @Override // io.odeeo.internal.u0.m3.f
        public Set<E> c() {
            return (Set) super.c();
        }

        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f66958b) {
                zEquals = c().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.f66958b) {
                iHashCode = c().hashCode();
            }
            return iHashCode;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class r<K, V> extends k<K, V> implements d3<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: h, reason: collision with root package name */
        public transient Set<Map.Entry<K, V>> f66959h;

        public r(d3<K, V> d3Var, Object obj) {
            super(d3Var, obj);
        }

        @Override // io.odeeo.internal.u0.m3.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d3<K, V> b() {
            return (d3) super.b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((r<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((r<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2
        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66959h == null) {
                        this.f66959h = m3.b((Set) b().entries(), this.f66958b);
                    }
                    set = this.f66959h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> get(K k10) {
            Set<V> setB;
            synchronized (this.f66958b) {
                setB = m3.b((Set) b().get((d3<K, V>) k10), this.f66958b);
            }
            return setB;
        }

        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> removeAll(Object obj) {
            Set<V> setRemoveAll;
            synchronized (this.f66958b) {
                setRemoveAll = b().removeAll(obj);
            }
            return setRemoveAll;
        }

        @Override // io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            Set<V> setReplaceValues;
            synchronized (this.f66958b) {
                setReplaceValues = b().replaceValues((d3<K, V>) k10, (Iterable) iterable);
            }
            return setReplaceValues;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class s<K, V> extends j<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public s(SortedMap<K, V> sortedMap, Object obj) {
            super(sortedMap, obj);
        }

        @Override // io.odeeo.internal.u0.m3.j
        public SortedMap<K, V> c() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f66958b) {
                comparator = c().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K kFirstKey;
            synchronized (this.f66958b) {
                kFirstKey = c().firstKey();
            }
            return kFirstKey;
        }

        public SortedMap<K, V> headMap(K k10) {
            SortedMap<K, V> sortedMapA;
            synchronized (this.f66958b) {
                sortedMapA = m3.a(c().headMap(k10), this.f66958b);
            }
            return sortedMapA;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K kLastKey;
            synchronized (this.f66958b) {
                kLastKey = c().lastKey();
            }
            return kLastKey;
        }

        public SortedMap<K, V> subMap(K k10, K k11) {
            SortedMap<K, V> sortedMapA;
            synchronized (this.f66958b) {
                sortedMapA = m3.a(c().subMap(k10, k11), this.f66958b);
            }
            return sortedMapA;
        }

        public SortedMap<K, V> tailMap(K k10) {
            SortedMap<K, V> sortedMapA;
            synchronized (this.f66958b) {
                sortedMapA = m3.a(c().tailMap(k10), this.f66958b);
            }
            return sortedMapA;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class t<E> extends q<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public t(SortedSet<E> sortedSet, Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f66958b) {
                comparator = c().comparator();
            }
            return comparator;
        }

        @Override // io.odeeo.internal.u0.m3.q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public SortedSet<E> c() {
            return (SortedSet) super.c();
        }

        @Override // java.util.SortedSet
        public E first() {
            E eFirst;
            synchronized (this.f66958b) {
                eFirst = c().first();
            }
            return eFirst;
        }

        public SortedSet<E> headSet(E e10) {
            SortedSet<E> sortedSetB;
            synchronized (this.f66958b) {
                sortedSetB = m3.b((SortedSet) c().headSet(e10), this.f66958b);
            }
            return sortedSetB;
        }

        @Override // java.util.SortedSet
        public E last() {
            E eLast;
            synchronized (this.f66958b) {
                eLast = c().last();
            }
            return eLast;
        }

        public SortedSet<E> subSet(E e10, E e11) {
            SortedSet<E> sortedSetB;
            synchronized (this.f66958b) {
                sortedSetB = m3.b((SortedSet) c().subSet(e10, e11), this.f66958b);
            }
            return sortedSetB;
        }

        public SortedSet<E> tailSet(E e10) {
            SortedSet<E> sortedSetB;
            synchronized (this.f66958b) {
                sortedSetB = m3.b((SortedSet) c().tailSet(e10), this.f66958b);
            }
            return sortedSetB;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class u<K, V> extends r<K, V> implements l3<K, V> {
        private static final long serialVersionUID = 0;

        public u(l3<K, V> l3Var, Object obj) {
            super(l3Var, obj);
        }

        @Override // io.odeeo.internal.u0.m3.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public l3<K, V> b() {
            return (l3) super.b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.r, io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((u<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.r, io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((u<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.l3
        public Comparator<? super V> valueComparator() {
            Comparator<? super V> comparatorValueComparator;
            synchronized (this.f66958b) {
                comparatorValueComparator = b().valueComparator();
            }
            return comparatorValueComparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.r, io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Set get(Object obj) {
            return get((u<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.m3.r, io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
            return replaceValues((u<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.m3.r, io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public SortedSet<V> get(K k10) {
            SortedSet<V> sortedSetB;
            synchronized (this.f66958b) {
                sortedSetB = m3.b((SortedSet) b().get((l3<K, V>) k10), this.f66958b);
            }
            return sortedSetB;
        }

        @Override // io.odeeo.internal.u0.m3.r, io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public SortedSet<V> removeAll(Object obj) {
            SortedSet<V> sortedSetRemoveAll;
            synchronized (this.f66958b) {
                sortedSetRemoveAll = b().removeAll(obj);
            }
            return sortedSetRemoveAll;
        }

        @Override // io.odeeo.internal.u0.m3.r, io.odeeo.internal.u0.m3.k, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public SortedSet<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            SortedSet<V> sortedSetReplaceValues;
            synchronized (this.f66958b) {
                sortedSetReplaceValues = b().replaceValues((l3<K, V>) k10, (Iterable) iterable);
            }
            return sortedSetReplaceValues;
        }
    }

    public static <E> Collection<E> c(Collection<E> collection, Object obj) {
        return new f(collection, obj);
    }

    public static <E> Collection<E> d(Collection<E> collection, Object obj) {
        return collection instanceof SortedSet ? b((SortedSet) collection, obj) : collection instanceof Set ? b((Set) collection, obj) : collection instanceof List ? b((List) collection, obj) : c(collection, obj);
    }

    public static <E> Set<E> b(Set<E> set, Object obj) {
        return new q(set, obj);
    }

    public static <E> Set<E> c(Set<E> set, Object obj) {
        return set instanceof SortedSet ? b((SortedSet) set, obj) : b((Set) set, obj);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<K, V> extends q<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends o3<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.m3$c$a$a, reason: collision with other inner class name */
            public class C0672a extends t0<K, Collection<V>> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f66938a;

                public C0672a(Map.Entry entry) {
                    this.f66938a = entry;
                }

                @Override // io.odeeo.internal.u0.t0, io.odeeo.internal.u0.x0
                /* renamed from: a */
                public Map.Entry<K, Collection<V>> delegate() {
                    return this.f66938a;
                }

                @Override // io.odeeo.internal.u0.t0, java.util.Map.Entry
                public Collection<V> getValue() {
                    return m3.d((Collection) this.f66938a.getValue(), c.this.f66958b);
                }
            }

            public a(Iterator it) {
                super(it);
            }

            @Override // io.odeeo.internal.u0.o3
            public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
                return new C0672a(entry);
            }
        }

        public c(Set<Map.Entry<K, Collection<V>>> set, Object obj) {
            super(set, obj);
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean zA;
            synchronized (this.f66958b) {
                zA = d2.a(c(), obj);
            }
            return zA;
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean zA;
            synchronized (this.f66958b) {
                zA = io.odeeo.internal.u0.s.a((Collection<?>) c(), collection);
            }
            return zA;
        }

        @Override // io.odeeo.internal.u0.m3.q, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean zA;
            if (obj == this) {
                return true;
            }
            synchronized (this.f66958b) {
                zA = e3.a(c(), obj);
            }
            return zA;
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zB;
            synchronized (this.f66958b) {
                zB = d2.b(c(), obj);
            }
            return zB;
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f66958b) {
                zRemoveAll = w1.removeAll(c().iterator(), collection);
            }
            return zRemoveAll;
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f66958b) {
                zRetainAll = w1.retainAll(c().iterator(), collection);
            }
            return zRetainAll;
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrA;
            synchronized (this.f66958b) {
                objArrA = m2.a(c());
            }
            return objArrA;
        }

        @Override // io.odeeo.internal.u0.m3.f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f66958b) {
                tArr2 = (T[]) m2.a((Collection<?>) c(), (Object[]) tArr);
            }
            return tArr2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k<K, V> extends o implements e2<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public transient Set<K> f66946c;

        /* renamed from: d, reason: collision with root package name */
        public transient Collection<V> f66947d;

        /* renamed from: e, reason: collision with root package name */
        public transient Collection<Map.Entry<K, V>> f66948e;

        /* renamed from: f, reason: collision with root package name */
        public transient Map<K, Collection<V>> f66949f;

        /* renamed from: g, reason: collision with root package name */
        public transient h2<K> f66950g;

        public k(e2<K, V> e2Var, Object obj) {
            super(e2Var, obj);
        }

        @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.f66958b) {
                try {
                    if (this.f66949f == null) {
                        this.f66949f = new b(b().asMap(), this.f66958b);
                    }
                    map = this.f66949f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return map;
        }

        public e2<K, V> b() {
            return (e2) super.a();
        }

        @Override // io.odeeo.internal.u0.e2
        public void clear() {
            synchronized (this.f66958b) {
                b().clear();
            }
        }

        @Override // io.odeeo.internal.u0.e2
        public boolean containsEntry(Object obj, Object obj2) {
            boolean zContainsEntry;
            synchronized (this.f66958b) {
                zContainsEntry = b().containsEntry(obj, obj2);
            }
            return zContainsEntry;
        }

        @Override // io.odeeo.internal.u0.e2
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f66958b) {
                zContainsKey = b().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // io.odeeo.internal.u0.e2
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f66958b) {
                zContainsValue = b().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // io.odeeo.internal.u0.e2
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f66958b) {
                try {
                    if (this.f66948e == null) {
                        this.f66948e = m3.d(b().entries(), this.f66958b);
                    }
                    collection = this.f66948e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f66958b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        public Collection<V> get(K k10) {
            Collection<V> collectionD;
            synchronized (this.f66958b) {
                collectionD = m3.d(b().get(k10), this.f66958b);
            }
            return collectionD;
        }

        @Override // io.odeeo.internal.u0.e2
        public int hashCode() {
            int iHashCode;
            synchronized (this.f66958b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // io.odeeo.internal.u0.e2
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f66958b) {
                zIsEmpty = b().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // io.odeeo.internal.u0.e2
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66946c == null) {
                        this.f66946c = m3.c((Set) b().keySet(), this.f66958b);
                    }
                    set = this.f66946c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // io.odeeo.internal.u0.e2
        public h2<K> keys() {
            h2<K> h2Var;
            synchronized (this.f66958b) {
                try {
                    if (this.f66950g == null) {
                        this.f66950g = m3.a((h2) b().keys(), this.f66958b);
                    }
                    h2Var = this.f66950g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return h2Var;
        }

        @Override // io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public boolean put(K k10, V v10) {
            boolean zPut;
            synchronized (this.f66958b) {
                zPut = b().put(k10, v10);
            }
            return zPut;
        }

        @Override // io.odeeo.internal.u0.e2
        public boolean putAll(K k10, Iterable<? extends V> iterable) {
            boolean zPutAll;
            synchronized (this.f66958b) {
                zPutAll = b().putAll(k10, iterable);
            }
            return zPutAll;
        }

        @Override // io.odeeo.internal.u0.e2
        public boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.f66958b) {
                zRemove = b().remove(obj, obj2);
            }
            return zRemove;
        }

        public Collection<V> removeAll(Object obj) {
            Collection<V> collectionRemoveAll;
            synchronized (this.f66958b) {
                collectionRemoveAll = b().removeAll(obj);
            }
            return collectionRemoveAll;
        }

        public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            Collection<V> collectionReplaceValues;
            synchronized (this.f66958b) {
                collectionReplaceValues = b().replaceValues(k10, iterable);
            }
            return collectionReplaceValues;
        }

        @Override // io.odeeo.internal.u0.e2
        public int size() {
            int size;
            synchronized (this.f66958b) {
                size = b().size();
            }
            return size;
        }

        @Override // io.odeeo.internal.u0.e2
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f66958b) {
                try {
                    if (this.f66947d == null) {
                        this.f66947d = m3.c(b().values(), this.f66958b);
                    }
                    collection = this.f66947d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // io.odeeo.internal.u0.e2
        public boolean putAll(e2<? extends K, ? extends V> e2Var) {
            boolean zPutAll;
            synchronized (this.f66958b) {
                zPutAll = b().putAll(e2Var);
            }
            return zPutAll;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class l<E> extends f<E> implements h2<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public transient Set<E> f66951c;

        /* renamed from: d, reason: collision with root package name */
        public transient Set<h2.a<E>> f66952d;

        public l(h2<E> h2Var, Object obj) {
            super(h2Var, obj);
        }

        @Override // io.odeeo.internal.u0.h2
        public int add(E e10, int i10) {
            int iAdd;
            synchronized (this.f66958b) {
                iAdd = b().add(e10, i10);
            }
            return iAdd;
        }

        @Override // io.odeeo.internal.u0.m3.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h2<E> c() {
            return (h2) super.c();
        }

        @Override // io.odeeo.internal.u0.h2
        public int count(Object obj) {
            int iCount;
            synchronized (this.f66958b) {
                iCount = b().count(obj);
            }
            return iCount;
        }

        @Override // io.odeeo.internal.u0.h2
        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66951c == null) {
                        this.f66951c = m3.c((Set) b().elementSet(), this.f66958b);
                    }
                    set = this.f66951c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // io.odeeo.internal.u0.h2
        public Set<h2.a<E>> entrySet() {
            Set<h2.a<E>> set;
            synchronized (this.f66958b) {
                try {
                    if (this.f66952d == null) {
                        this.f66952d = m3.c((Set) b().entrySet(), this.f66958b);
                    }
                    set = this.f66952d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Collection, io.odeeo.internal.u0.h2
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f66958b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, io.odeeo.internal.u0.h2
        public int hashCode() {
            int iHashCode;
            synchronized (this.f66958b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // io.odeeo.internal.u0.h2
        public int remove(Object obj, int i10) {
            int iRemove;
            synchronized (this.f66958b) {
                iRemove = b().remove(obj, i10);
            }
            return iRemove;
        }

        @Override // io.odeeo.internal.u0.h2
        public int setCount(E e10, int i10) {
            int count;
            synchronized (this.f66958b) {
                count = b().setCount(e10, i10);
            }
            return count;
        }

        @Override // io.odeeo.internal.u0.h2
        public boolean setCount(E e10, int i10, int i11) {
            boolean count;
            synchronized (this.f66958b) {
                count = b().setCount(e10, i10, i11);
            }
            return count;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class m<K, V> extends s<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: f, reason: collision with root package name */
        public transient NavigableSet<K> f66953f;

        /* renamed from: g, reason: collision with root package name */
        public transient NavigableMap<K, V> f66954g;

        /* renamed from: h, reason: collision with root package name */
        public transient NavigableSet<K> f66955h;

        public m(NavigableMap<K, V> navigableMap, Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k10) {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().ceilingEntry(k10), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            K kCeilingKey;
            synchronized (this.f66958b) {
                kCeilingKey = b().ceilingKey(k10);
            }
            return kCeilingKey;
        }

        @Override // io.odeeo.internal.u0.m3.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> c() {
            return (NavigableMap) super.c();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f66958b) {
                try {
                    NavigableSet<K> navigableSet = this.f66953f;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetA = m3.a((NavigableSet) b().descendingKeySet(), this.f66958b);
                    this.f66953f = navigableSetA;
                    return navigableSetA;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f66958b) {
                try {
                    NavigableMap<K, V> navigableMap = this.f66954g;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap<K, V> navigableMapA = m3.a((NavigableMap) b().descendingMap(), this.f66958b);
                    this.f66954g = navigableMapA;
                    return navigableMapA;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().firstEntry(), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k10) {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().floorEntry(k10), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            K kFloorKey;
            synchronized (this.f66958b) {
                kFloorKey = b().floorKey(k10);
            }
            return kFloorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            NavigableMap<K, V> navigableMapA;
            synchronized (this.f66958b) {
                navigableMapA = m3.a((NavigableMap) b().headMap(k10, z10), this.f66958b);
            }
            return navigableMapA;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k10) {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().higherEntry(k10), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            K kHigherKey;
            synchronized (this.f66958b) {
                kHigherKey = b().higherKey(k10);
            }
            return kHigherKey;
        }

        @Override // io.odeeo.internal.u0.m3.j, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().lastEntry(), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k10) {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().lowerEntry(k10), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            K kLowerKey;
            synchronized (this.f66958b) {
                kLowerKey = b().lowerKey(k10);
            }
            return kLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f66958b) {
                try {
                    NavigableSet<K> navigableSet = this.f66955h;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetA = m3.a((NavigableSet) b().navigableKeySet(), this.f66958b);
                    this.f66955h = navigableSetA;
                    return navigableSetA;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().pollFirstEntry(), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryB;
            synchronized (this.f66958b) {
                entryB = m3.b(b().pollLastEntry(), this.f66958b);
            }
            return entryB;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            NavigableMap<K, V> navigableMapA;
            synchronized (this.f66958b) {
                navigableMapA = m3.a((NavigableMap) b().subMap(k10, z10, k11, z11), this.f66958b);
            }
            return navigableMapA;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            NavigableMap<K, V> navigableMapA;
            synchronized (this.f66958b) {
                navigableMapA = m3.a((NavigableMap) b().tailMap(k10, z10), this.f66958b);
            }
            return navigableMapA;
        }

        @Override // io.odeeo.internal.u0.m3.s, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // io.odeeo.internal.u0.m3.s, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // io.odeeo.internal.u0.m3.s, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k10) {
            return tailMap(k10, true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class n<E> extends t<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public transient NavigableSet<E> f66956c;

        public n(NavigableSet<E> navigableSet, Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e10) {
            E eCeiling;
            synchronized (this.f66958b) {
                eCeiling = b().ceiling(e10);
            }
            return eCeiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return b().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f66958b) {
                try {
                    NavigableSet<E> navigableSet = this.f66956c;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<E> navigableSetA = m3.a((NavigableSet) b().descendingSet(), this.f66958b);
                    this.f66956c = navigableSetA;
                    return navigableSetA;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.odeeo.internal.u0.m3.t
        /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> c() {
            return (NavigableSet) super.c();
        }

        @Override // java.util.NavigableSet
        public E floor(E e10) {
            E eFloor;
            synchronized (this.f66958b) {
                eFloor = b().floor(e10);
            }
            return eFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            NavigableSet<E> navigableSetA;
            synchronized (this.f66958b) {
                navigableSetA = m3.a((NavigableSet) b().headSet(e10, z10), this.f66958b);
            }
            return navigableSetA;
        }

        @Override // java.util.NavigableSet
        public E higher(E e10) {
            E eHigher;
            synchronized (this.f66958b) {
                eHigher = b().higher(e10);
            }
            return eHigher;
        }

        @Override // java.util.NavigableSet
        public E lower(E e10) {
            E eLower;
            synchronized (this.f66958b) {
                eLower = b().lower(e10);
            }
            return eLower;
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            E ePollFirst;
            synchronized (this.f66958b) {
                ePollFirst = b().pollFirst();
            }
            return ePollFirst;
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            E ePollLast;
            synchronized (this.f66958b) {
                ePollLast = b().pollLast();
            }
            return ePollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            NavigableSet<E> navigableSetA;
            synchronized (this.f66958b) {
                navigableSetA = m3.a((NavigableSet) b().subSet(e10, z10, e11, z11), this.f66958b);
            }
            return navigableSetA;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            NavigableSet<E> navigableSetA;
            synchronized (this.f66958b) {
                navigableSetA = m3.a((NavigableSet) b().tailSet(e10, z10), this.f66958b);
            }
            return navigableSetA;
        }

        @Override // io.odeeo.internal.u0.m3.t, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e10) {
            return headSet(e10, false);
        }

        @Override // io.odeeo.internal.u0.m3.t, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e10) {
            return tailSet(e10, true);
        }

        @Override // io.odeeo.internal.u0.m3.t, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e10, E e11) {
            return subSet(e10, true, e11, false);
        }
    }

    public static <E> SortedSet<E> b(SortedSet<E> sortedSet, Object obj) {
        return new t(sortedSet, obj);
    }

    public static <E> List<E> b(List<E> list, Object obj) {
        return list instanceof RandomAccess ? new p(list, obj) : new h(list, obj);
    }

    public static <K, V> Map.Entry<K, V> b(Map.Entry<K, V> entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new g(entry, obj);
    }

    public static <E> h2<E> a(h2<E> h2Var, Object obj) {
        return ((h2Var instanceof l) || (h2Var instanceof o1)) ? h2Var : new l(h2Var, obj);
    }

    public static <K, V> e2<K, V> a(e2<K, V> e2Var, Object obj) {
        return ((e2Var instanceof k) || (e2Var instanceof io.odeeo.internal.u0.m)) ? e2Var : new k(e2Var, obj);
    }

    public static <K, V> y1<K, V> a(y1<K, V> y1Var, Object obj) {
        return ((y1Var instanceof i) || (y1Var instanceof io.odeeo.internal.u0.m)) ? y1Var : new i(y1Var, obj);
    }

    public static <K, V> d3<K, V> a(d3<K, V> d3Var, Object obj) {
        return ((d3Var instanceof r) || (d3Var instanceof io.odeeo.internal.u0.m)) ? d3Var : new r(d3Var, obj);
    }

    public static <K, V> l3<K, V> a(l3<K, V> l3Var, Object obj) {
        return l3Var instanceof u ? l3Var : new u(l3Var, obj);
    }

    public static <K, V> SortedMap<K, V> a(SortedMap<K, V> sortedMap, Object obj) {
        return new s(sortedMap, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> io.odeeo.internal.u0.n<K, V> a(io.odeeo.internal.u0.n<K, V> nVar, Object obj) {
        if ((nVar instanceof e) || (nVar instanceof c1)) {
            return nVar;
        }
        return new e(nVar, obj, null);
    }

    public static <E> NavigableSet<E> a(NavigableSet<E> navigableSet, Object obj) {
        return new n(navigableSet, obj);
    }

    public static <E> NavigableSet<E> a(NavigableSet<E> navigableSet) {
        return a((NavigableSet) navigableSet, (Object) null);
    }

    public static <K, V> NavigableMap<K, V> a(NavigableMap<K, V> navigableMap) {
        return a((NavigableMap) navigableMap, (Object) null);
    }

    public static <K, V> NavigableMap<K, V> a(NavigableMap<K, V> navigableMap, Object obj) {
        return new m(navigableMap, obj);
    }
}
