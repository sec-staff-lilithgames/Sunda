package io.odeeo.internal.u0;

import io.odeeo.internal.u0.d;
import io.odeeo.internal.u0.d2;
import io.odeeo.internal.u0.e3;
import io.odeeo.internal.u0.g;
import io.odeeo.internal.u0.h2;
import io.odeeo.internal.u0.i1;
import io.odeeo.internal.u0.i2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<K, V> extends d2.r0<K, Collection<V>> {

        /* renamed from: d, reason: collision with root package name */
        public final e2<K, V> f66819d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.u0.g2$a$a, reason: collision with other inner class name */
        public class C0666a extends d2.s<K, Collection<V>> {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.g2$a$a$a, reason: collision with other inner class name */
            public class C0667a implements io.odeeo.internal.t0.k<K, Collection<V>> {
                public C0667a() {
                }

                @Override // io.odeeo.internal.t0.k
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C0667a) obj);
                }

                @Override // io.odeeo.internal.t0.k
                public Collection<V> apply(K k10) {
                    return a.this.f66819d.get(k10);
                }
            }

            public C0666a() {
            }

            @Override // io.odeeo.internal.u0.d2.s
            public Map<K, Collection<V>> a() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return d2.a((Set) a.this.f66819d.keySet(), (io.odeeo.internal.t0.k) new C0667a());
            }

            @Override // io.odeeo.internal.u0.d2.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                a.this.a(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public a(e2<K, V> e2Var) {
            this.f66819d = (e2) io.odeeo.internal.t0.u.checkNotNull(e2Var);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f66819d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f66819d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f66819d.isEmpty();
        }

        @Override // io.odeeo.internal.u0.d2.r0, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f66819d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f66819d.keySet().size();
        }

        @Override // io.odeeo.internal.u0.d2.r0
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0666a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f66819d.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f66819d.removeAll(obj);
            }
            return null;
        }

        public void a(Object obj) {
            this.f66819d.keySet().remove(obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<K, V> extends io.odeeo.internal.u0.c<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: h, reason: collision with root package name */
        public transient io.odeeo.internal.t0.b0<? extends List<V>> f66822h;

        public b(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends List<V>> b0Var) {
            super(map);
            this.f66822h = (io.odeeo.internal.t0.b0) io.odeeo.internal.t0.u.checkNotNull(b0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f66822h = (io.odeeo.internal.t0.b0) objectInputStream.readObject();
            a((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f66822h);
            objectOutputStream.writeObject(h());
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Map<K, Collection<V>> a() {
            return j();
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Set<K> c() {
            return k();
        }

        @Override // io.odeeo.internal.u0.c, io.odeeo.internal.u0.d
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<V> i() {
            return this.f66822h.get();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<K, V> extends io.odeeo.internal.u0.d<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: h, reason: collision with root package name */
        public transient io.odeeo.internal.t0.b0<? extends Collection<V>> f66823h;

        public c(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends Collection<V>> b0Var) {
            super(map);
            this.f66823h = (io.odeeo.internal.t0.b0) io.odeeo.internal.t0.u.checkNotNull(b0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f66823h = (io.odeeo.internal.t0.b0) objectInputStream.readObject();
            a((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f66823h);
            objectOutputStream.writeObject(h());
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Map<K, Collection<V>> a() {
            return j();
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Set<K> c() {
            return k();
        }

        @Override // io.odeeo.internal.u0.d
        public Collection<V> i() {
            return this.f66823h.get();
        }

        @Override // io.odeeo.internal.u0.d
        public Collection<V> a(K k10, Collection<V> collection) {
            return collection instanceof List ? a(k10, (List) collection, null) : collection instanceof NavigableSet ? new d.m(k10, (NavigableSet) collection, null) : collection instanceof SortedSet ? new d.o(k10, (SortedSet) collection, null) : collection instanceof Set ? new d.n(k10, (Set) collection) : new d.k(k10, collection, null);
        }

        @Override // io.odeeo.internal.u0.d
        public <E> Collection<E> c(Collection<E> collection) {
            return collection instanceof NavigableSet ? e3.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<K, V> extends io.odeeo.internal.u0.j<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: h, reason: collision with root package name */
        public transient io.odeeo.internal.t0.b0<? extends Set<V>> f66824h;

        public d(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends Set<V>> b0Var) {
            super(map);
            this.f66824h = (io.odeeo.internal.t0.b0) io.odeeo.internal.t0.u.checkNotNull(b0Var);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f66824h = (io.odeeo.internal.t0.b0) objectInputStream.readObject();
            a((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f66824h);
            objectOutputStream.writeObject(h());
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Map<K, Collection<V>> a() {
            return j();
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Set<K> c() {
            return k();
        }

        @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Set<V> i() {
            return this.f66824h.get();
        }

        @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d
        public Collection<V> a(K k10, Collection<V> collection) {
            return collection instanceof NavigableSet ? new d.m(k10, (NavigableSet) collection, null) : collection instanceof SortedSet ? new d.o(k10, (SortedSet) collection, null) : new d.n(k10, (Set) collection);
        }

        @Override // io.odeeo.internal.u0.j, io.odeeo.internal.u0.d
        public <E> Collection<E> c(Collection<E> collection) {
            return collection instanceof NavigableSet ? e3.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e<K, V> extends io.odeeo.internal.u0.k<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: h, reason: collision with root package name */
        public transient io.odeeo.internal.t0.b0<? extends SortedSet<V>> f66825h;

        /* renamed from: i, reason: collision with root package name */
        public transient Comparator<? super V> f66826i;

        public e(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends SortedSet<V>> b0Var) {
            super(map);
            this.f66825h = (io.odeeo.internal.t0.b0) io.odeeo.internal.t0.u.checkNotNull(b0Var);
            this.f66826i = b0Var.get().comparator();
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            io.odeeo.internal.t0.b0<? extends SortedSet<V>> b0Var = (io.odeeo.internal.t0.b0) objectInputStream.readObject();
            this.f66825h = b0Var;
            this.f66826i = b0Var.get().comparator();
            a((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f66825h);
            objectOutputStream.writeObject(h());
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Map<K, Collection<V>> a() {
            return j();
        }

        @Override // io.odeeo.internal.u0.d, io.odeeo.internal.u0.g
        public Set<K> c() {
            return k();
        }

        @Override // io.odeeo.internal.u0.k, io.odeeo.internal.u0.j
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> i() {
            return this.f66825h.get();
        }

        @Override // io.odeeo.internal.u0.k, io.odeeo.internal.u0.l3
        public Comparator<? super V> valueComparator() {
            return this.f66826i;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract e2<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g<K, V> extends io.odeeo.internal.u0.h<K> {

        /* renamed from: c, reason: collision with root package name */
        public final e2<K, V> f66827c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends o3<Map.Entry<K, Collection<V>>, h2.a<K>> {

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.g2$g$a$a, reason: collision with other inner class name */
            public class C0668a extends i2.e<K> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f66829a;

                public C0668a(Map.Entry entry) {
                    this.f66829a = entry;
                }

                @Override // io.odeeo.internal.u0.i2.e, io.odeeo.internal.u0.h2.a
                public int getCount() {
                    return ((Collection) this.f66829a.getValue()).size();
                }

                @Override // io.odeeo.internal.u0.i2.e, io.odeeo.internal.u0.h2.a
                public K getElement() {
                    return (K) this.f66829a.getKey();
                }
            }

            public a(Iterator it) {
                super(it);
            }

            @Override // io.odeeo.internal.u0.o3
            public h2.a<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C0668a(entry);
            }
        }

        public g(e2<K, V> e2Var) {
            this.f66827c = e2Var;
        }

        @Override // io.odeeo.internal.u0.h
        public int c() {
            return this.f66827c.asMap().size();
        }

        @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f66827c.clear();
        }

        @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
        public boolean contains(Object obj) {
            return this.f66827c.containsKey(obj);
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int count(Object obj) {
            Collection collection = (Collection) d2.d(this.f66827c.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<K> d() {
            throw new AssertionError("should never be called");
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<h2.a<K>> e() {
            return new a(this.f66827c.asMap().entrySet().iterator());
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public Set<K> elementSet() {
            return this.f66827c.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, io.odeeo.internal.u0.h2
        public Iterator<K> iterator() {
            return d2.a(this.f66827c.entries().iterator());
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int remove(Object obj, int i10) {
            r.a(i10, "occurrences");
            if (i10 == 0) {
                return count(obj);
            }
            Collection collection = (Collection) d2.d(this.f66827c.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i10 >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i11 = 0; i11 < i10; i11++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
        public int size() {
            return this.f66827c.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<K, V> extends io.odeeo.internal.u0.g<K, V> implements d3<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* renamed from: f, reason: collision with root package name */
        public final Map<K, V> f66831f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends e3.j<V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f66832a;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: io.odeeo.internal.u0.g2$h$a$a, reason: collision with other inner class name */
            public class C0669a implements Iterator<V> {

                /* renamed from: a, reason: collision with root package name */
                public int f66834a;

                public C0669a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f66834a != 0) {
                        return false;
                    }
                    a aVar = a.this;
                    return h.this.f66831f.containsKey(aVar.f66832a);
                }

                @Override // java.util.Iterator
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f66834a++;
                    a aVar = a.this;
                    return h.this.f66831f.get(aVar.f66832a);
                }

                @Override // java.util.Iterator
                public void remove() {
                    r.a(this.f66834a == 1);
                    this.f66834a = -1;
                    a aVar = a.this;
                    h.this.f66831f.remove(aVar.f66832a);
                }
            }

            public a(Object obj) {
                this.f66832a = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C0669a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return h.this.f66831f.containsKey(this.f66832a) ? 1 : 0;
            }
        }

        public h(Map<K, V> map) {
            this.f66831f = (Map) io.odeeo.internal.t0.u.checkNotNull(map);
        }

        @Override // io.odeeo.internal.u0.g
        public Map<K, Collection<V>> a() {
            return new a(this);
        }

        @Override // io.odeeo.internal.u0.g
        public Collection<Map.Entry<K, V>> b() {
            throw new AssertionError("unreachable");
        }

        @Override // io.odeeo.internal.u0.g
        public Set<K> c() {
            return this.f66831f.keySet();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public void clear() {
            this.f66831f.clear();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean containsEntry(Object obj, Object obj2) {
            return this.f66831f.entrySet().contains(d2.immutableEntry(obj, obj2));
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean containsKey(Object obj) {
            return this.f66831f.containsKey(obj);
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean containsValue(Object obj) {
            return this.f66831f.containsValue(obj);
        }

        @Override // io.odeeo.internal.u0.g
        public h2<K> d() {
            return new g(this);
        }

        @Override // io.odeeo.internal.u0.g
        public Collection<V> e() {
            return this.f66831f.values();
        }

        @Override // io.odeeo.internal.u0.g
        public Iterator<Map.Entry<K, V>> f() {
            return this.f66831f.entrySet().iterator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((h<K, V>) obj);
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public int hashCode() {
            return this.f66831f.hashCode();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public boolean put(K k10, V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean putAll(K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean remove(Object obj, Object obj2) {
            return this.f66831f.entrySet().remove(d2.immutableEntry(obj, obj2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((h<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public int size() {
            return this.f66831f.size();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public Set<Map.Entry<K, V>> entries() {
            return this.f66831f.entrySet();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> get(K k10) {
            return new a(k10);
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean putAll(e2<? extends K, ? extends V> e2Var) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.f66831f.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.f66831f.remove(obj));
            return hashSet;
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i<K, V1, V2> extends j<K, V1, V2> implements y1<K, V2> {
        public i(y1<K, V1> y1Var, d2.t<? super K, ? super V1, V2> tVar) {
            super(y1Var, tVar);
        }

        @Override // io.odeeo.internal.u0.g2.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<V2> a(K k10, Collection<V1> collection) {
            return z1.transform((List) collection, d2.a(this.f66837g, k10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.j, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((i<K, V1, V2>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.j, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((i<K, V1, V2>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.g2.j, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V2> get(K k10) {
            return a(k10, this.f66836f.get(k10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.j, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V2> removeAll(Object obj) {
            return a(obj, this.f66836f.removeAll(obj));
        }

        @Override // io.odeeo.internal.u0.g2.j, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V2> replaceValues(K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j<K, V1, V2> extends io.odeeo.internal.u0.g<K, V2> {

        /* renamed from: f, reason: collision with root package name */
        public final e2<K, V1> f66836f;

        /* renamed from: g, reason: collision with root package name */
        public final d2.t<? super K, ? super V1, V2> f66837g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements d2.t<K, Collection<V1>, Collection<V2>> {
            public a() {
            }

            @Override // io.odeeo.internal.u0.d2.t
            public /* bridge */ /* synthetic */ Object transformEntry(Object obj, Object obj2) {
                return transformEntry((a) obj, (Collection) obj2);
            }

            public Collection<V2> transformEntry(K k10, Collection<V1> collection) {
                return j.this.a(k10, collection);
            }
        }

        public j(e2<K, V1> e2Var, d2.t<? super K, ? super V1, V2> tVar) {
            this.f66836f = (e2) io.odeeo.internal.t0.u.checkNotNull(e2Var);
            this.f66837g = (d2.t) io.odeeo.internal.t0.u.checkNotNull(tVar);
        }

        public Collection<V2> a(K k10, Collection<V1> collection) {
            io.odeeo.internal.t0.k kVarA = d2.a(this.f66837g, k10);
            return collection instanceof List ? z1.transform((List) collection, kVarA) : s.transform(collection, kVarA);
        }

        @Override // io.odeeo.internal.u0.g
        public Collection<Map.Entry<K, V2>> b() {
            return new g.a();
        }

        @Override // io.odeeo.internal.u0.g
        public Set<K> c() {
            return this.f66836f.keySet();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public void clear() {
            this.f66836f.clear();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean containsKey(Object obj) {
            return this.f66836f.containsKey(obj);
        }

        @Override // io.odeeo.internal.u0.g
        public h2<K> d() {
            return this.f66836f.keys();
        }

        @Override // io.odeeo.internal.u0.g
        public Collection<V2> e() {
            return s.transform(this.f66836f.entries(), d2.b(this.f66837g));
        }

        @Override // io.odeeo.internal.u0.g
        public Iterator<Map.Entry<K, V2>> f() {
            return w1.transform(this.f66836f.entries().iterator(), d2.a(this.f66837g));
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Collection<V2> get(K k10) {
            return a(k10, this.f66836f.get(k10));
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean isEmpty() {
            return this.f66836f.isEmpty();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public boolean put(K k10, V2 v22) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean putAll(K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Collection<V2> removeAll(Object obj) {
            return a(obj, this.f66836f.removeAll(obj));
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Collection<V2> replaceValues(K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public int size() {
            return this.f66836f.size();
        }

        @Override // io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
        public boolean putAll(e2<? extends K, ? extends V2> e2Var) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g
        public Map<K, Collection<V2>> a() {
            return d2.transformEntries(this.f66836f.asMap(), new a());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k<K, V> extends l<K, V> implements y1<K, V> {
        private static final long serialVersionUID = 0;

        public k(y1<K, V> y1Var) {
            super(y1Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((k<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((k<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V> get(K k10) {
            return Collections.unmodifiableList(delegate().get((y1<K, V>) k10));
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public List<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.x0
        public y1<K, V> delegate() {
            return (y1) super.delegate();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class l<K, V> extends u0<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final e2<K, V> f66839a;

        /* renamed from: b, reason: collision with root package name */
        public transient Collection<Map.Entry<K, V>> f66840b;

        /* renamed from: c, reason: collision with root package name */
        public transient h2<K> f66841c;

        /* renamed from: d, reason: collision with root package name */
        public transient Set<K> f66842d;

        /* renamed from: e, reason: collision with root package name */
        public transient Collection<V> f66843e;

        /* renamed from: f, reason: collision with root package name */
        public transient Map<K, Collection<V>> f66844f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements io.odeeo.internal.t0.k<Collection<V>, Collection<V>> {
            public a() {
            }

            @Override // io.odeeo.internal.t0.k
            public Collection<V> apply(Collection<V> collection) {
                return g2.d(collection);
            }
        }

        public l(e2<K, V> e2Var) {
            this.f66839a = (e2) io.odeeo.internal.t0.u.checkNotNull(e2Var);
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.f66844f;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(d2.transformValues(this.f66839a.asMap(), new a()));
            this.f66844f = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.f66840b;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionC = g2.c(this.f66839a.entries());
            this.f66840b = collectionC;
            return collectionC;
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Collection<V> get(K k10) {
            return g2.d(this.f66839a.get(k10));
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public Set<K> keySet() {
            Set<K> set = this.f66842d;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.f66839a.keySet());
            this.f66842d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public h2<K> keys() {
            h2<K> h2Var = this.f66841c;
            if (h2Var != null) {
                return h2Var;
            }
            h2<K> h2VarUnmodifiableMultiset = i2.unmodifiableMultiset(this.f66839a.keys());
            this.f66841c = h2VarUnmodifiableMultiset;
            return h2VarUnmodifiableMultiset;
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public boolean put(K k10, V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public boolean putAll(K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Collection<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public Collection<V> values() {
            Collection<V> collection = this.f66843e;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f66839a.values());
            this.f66843e = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.x0
        public e2<K, V> delegate() {
            return this.f66839a;
        }

        @Override // io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public boolean putAll(e2<? extends K, ? extends V> e2Var) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class m<K, V> extends l<K, V> implements d3<K, V> {
        private static final long serialVersionUID = 0;

        public m(d3<K, V> d3Var) {
            super(d3Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((m<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((m<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2
        public Set<Map.Entry<K, V>> entries() {
            return d2.c(delegate().entries());
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> get(K k10) {
            return Collections.unmodifiableSet(delegate().get((d3<K, V>) k10));
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public Set<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.x0
        public d3<K, V> delegate() {
            return (d3) super.delegate();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class n<K, V> extends m<K, V> implements l3<K, V> {
        private static final long serialVersionUID = 0;

        public n(l3<K, V> l3Var) {
            super(l3Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((n<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues((n<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.l3
        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Set get(Object obj) {
            return get((n<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
            return replaceValues((n<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public SortedSet<V> get(K k10) {
            return Collections.unmodifiableSortedSet(delegate().get((l3<K, V>) k10));
        }

        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
        public SortedSet<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.g2.m, io.odeeo.internal.u0.g2.l, io.odeeo.internal.u0.u0, io.odeeo.internal.u0.x0
        public l3<K, V> delegate() {
            return (l3) super.delegate();
        }
    }

    public static <K, V> Map<K, List<V>> asMap(y1<K, V> y1Var) {
        return y1Var.asMap();
    }

    public static <K, V> Collection<Map.Entry<K, V>> c(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? d2.c((Set) collection) : new d2.m0(Collections.unmodifiableCollection(collection));
    }

    public static <V> Collection<V> d(Collection<V> collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static <K, V> e2<K, V> filterEntries(e2<K, V> e2Var, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        return e2Var instanceof d3 ? filterEntries((d3) e2Var, (io.odeeo.internal.t0.v) vVar) : e2Var instanceof l0 ? a((l0) e2Var, (io.odeeo.internal.t0.v) vVar) : new g0((e2) io.odeeo.internal.t0.u.checkNotNull(e2Var), vVar);
    }

    public static <K, V> e2<K, V> filterKeys(e2<K, V> e2Var, io.odeeo.internal.t0.v<? super K> vVar) {
        if (e2Var instanceof d3) {
            return filterKeys((d3) e2Var, (io.odeeo.internal.t0.v) vVar);
        }
        if (e2Var instanceof y1) {
            return filterKeys((y1) e2Var, (io.odeeo.internal.t0.v) vVar);
        }
        if (!(e2Var instanceof j0)) {
            return e2Var instanceof l0 ? a((l0) e2Var, d2.a(vVar)) : new j0(e2Var, vVar);
        }
        j0 j0Var = (j0) e2Var;
        return new j0(j0Var.f66894f, io.odeeo.internal.t0.w.and(j0Var.f66895g, vVar));
    }

    public static <K, V> e2<K, V> filterValues(e2<K, V> e2Var, io.odeeo.internal.t0.v<? super V> vVar) {
        return filterEntries(e2Var, d2.b(vVar));
    }

    public static <K, V> d3<K, V> forMap(Map<K, V> map) {
        return new h(map);
    }

    public static <K, V> i1<K, V> index(Iterable<V> iterable, io.odeeo.internal.t0.k<? super V, K> kVar) {
        return index(iterable.iterator(), kVar);
    }

    public static <K, V, M extends e2<K, V>> M invertFrom(e2<? extends V, ? extends K> e2Var, M m9) {
        io.odeeo.internal.t0.u.checkNotNull(m9);
        for (Map.Entry<? extends V, ? extends K> entry : e2Var.entries()) {
            m9.put(entry.getValue(), entry.getKey());
        }
        return m9;
    }

    public static <K, V> y1<K, V> newListMultimap(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends List<V>> b0Var) {
        return new b(map, b0Var);
    }

    public static <K, V> e2<K, V> newMultimap(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends Collection<V>> b0Var) {
        return new c(map, b0Var);
    }

    public static <K, V> d3<K, V> newSetMultimap(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends Set<V>> b0Var) {
        return new d(map, b0Var);
    }

    public static <K, V> l3<K, V> newSortedSetMultimap(Map<K, Collection<V>> map, io.odeeo.internal.t0.b0<? extends SortedSet<V>> b0Var) {
        return new e(map, b0Var);
    }

    public static <K, V> y1<K, V> synchronizedListMultimap(y1<K, V> y1Var) {
        return m3.a((y1) y1Var, (Object) null);
    }

    public static <K, V> e2<K, V> synchronizedMultimap(e2<K, V> e2Var) {
        return m3.a(e2Var, (Object) null);
    }

    public static <K, V> d3<K, V> synchronizedSetMultimap(d3<K, V> d3Var) {
        return m3.a((d3) d3Var, (Object) null);
    }

    public static <K, V> l3<K, V> synchronizedSortedSetMultimap(l3<K, V> l3Var) {
        return m3.a((l3) l3Var, (Object) null);
    }

    public static <K, V1, V2> e2<K, V2> transformEntries(e2<K, V1> e2Var, d2.t<? super K, ? super V1, V2> tVar) {
        return new j(e2Var, tVar);
    }

    public static <K, V1, V2> e2<K, V2> transformValues(e2<K, V1> e2Var, io.odeeo.internal.t0.k<? super V1, V2> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        return transformEntries(e2Var, d2.a(kVar));
    }

    public static <K, V> y1<K, V> unmodifiableListMultimap(y1<K, V> y1Var) {
        return ((y1Var instanceof k) || (y1Var instanceof i1)) ? y1Var : new k(y1Var);
    }

    public static <K, V> e2<K, V> unmodifiableMultimap(e2<K, V> e2Var) {
        return ((e2Var instanceof l) || (e2Var instanceof n1)) ? e2Var : new l(e2Var);
    }

    public static <K, V> d3<K, V> unmodifiableSetMultimap(d3<K, V> d3Var) {
        return ((d3Var instanceof m) || (d3Var instanceof r1)) ? d3Var : new m(d3Var);
    }

    public static <K, V> l3<K, V> unmodifiableSortedSetMultimap(l3<K, V> l3Var) {
        return l3Var instanceof n ? l3Var : new n(l3Var);
    }

    public static <K, V> e2<K, V> a(l0<K, V> l0Var, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        return new g0(l0Var.unfiltered(), io.odeeo.internal.t0.w.and(l0Var.entryPredicate(), vVar));
    }

    public static <K, V> Map<K, Set<V>> asMap(d3<K, V> d3Var) {
        return d3Var.asMap();
    }

    public static <K, V> d3<K, V> filterValues(d3<K, V> d3Var, io.odeeo.internal.t0.v<? super V> vVar) {
        return filterEntries((d3) d3Var, d2.b(vVar));
    }

    public static <K, V> i1<K, V> index(Iterator<V> it, io.odeeo.internal.t0.k<? super V, K> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        i1.a aVarBuilder = i1.builder();
        while (it.hasNext()) {
            V next = it.next();
            io.odeeo.internal.t0.u.checkNotNull(next, it);
            aVarBuilder.put((i1.a) kVar.apply(next), (K) next);
        }
        return aVarBuilder.build();
    }

    public static <K, V1, V2> y1<K, V2> transformEntries(y1<K, V1> y1Var, d2.t<? super K, ? super V1, V2> tVar) {
        return new i(y1Var, tVar);
    }

    public static <K, V> Map<K, SortedSet<V>> asMap(l3<K, V> l3Var) {
        return l3Var.asMap();
    }

    @Deprecated
    public static <K, V> y1<K, V> unmodifiableListMultimap(i1<K, V> i1Var) {
        return (y1) io.odeeo.internal.t0.u.checkNotNull(i1Var);
    }

    @Deprecated
    public static <K, V> e2<K, V> unmodifiableMultimap(n1<K, V> n1Var) {
        return (e2) io.odeeo.internal.t0.u.checkNotNull(n1Var);
    }

    @Deprecated
    public static <K, V> d3<K, V> unmodifiableSetMultimap(r1<K, V> r1Var) {
        return (d3) io.odeeo.internal.t0.u.checkNotNull(r1Var);
    }

    public static <K, V> d3<K, V> a(n0<K, V> n0Var, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        return new h0(n0Var.unfiltered(), io.odeeo.internal.t0.w.and(n0Var.entryPredicate(), vVar));
    }

    public static <K, V> Map<K, Collection<V>> asMap(e2<K, V> e2Var) {
        return e2Var.asMap();
    }

    public static <K, V1, V2> y1<K, V2> transformValues(y1<K, V1> y1Var, io.odeeo.internal.t0.k<? super V1, V2> kVar) {
        io.odeeo.internal.t0.u.checkNotNull(kVar);
        return transformEntries((y1) y1Var, d2.a(kVar));
    }

    public static boolean a(e2<?, ?> e2Var, Object obj) {
        if (obj == e2Var) {
            return true;
        }
        if (obj instanceof e2) {
            return e2Var.asMap().equals(((e2) obj).asMap());
        }
        return false;
    }

    public static <K, V> d3<K, V> filterEntries(d3<K, V> d3Var, io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVar) {
        io.odeeo.internal.t0.u.checkNotNull(vVar);
        if (d3Var instanceof n0) {
            return a((n0) d3Var, (io.odeeo.internal.t0.v) vVar);
        }
        return new h0((d3) io.odeeo.internal.t0.u.checkNotNull(d3Var), vVar);
    }

    public static <K, V> d3<K, V> filterKeys(d3<K, V> d3Var, io.odeeo.internal.t0.v<? super K> vVar) {
        if (d3Var instanceof k0) {
            k0 k0Var = (k0) d3Var;
            return new k0(k0Var.unfiltered(), io.odeeo.internal.t0.w.and(k0Var.f66895g, vVar));
        }
        if (d3Var instanceof n0) {
            return a((n0) d3Var, d2.a(vVar));
        }
        return new k0(d3Var, vVar);
    }

    public static <K, V> y1<K, V> filterKeys(y1<K, V> y1Var, io.odeeo.internal.t0.v<? super K> vVar) {
        if (y1Var instanceof i0) {
            i0 i0Var = (i0) y1Var;
            return new i0(i0Var.unfiltered(), io.odeeo.internal.t0.w.and(i0Var.f66895g, vVar));
        }
        return new i0(y1Var, vVar);
    }
}
