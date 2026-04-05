package com.bytedance.adsdk.jd;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
abstract class prr<K, V> {

    /* renamed from: jd, reason: collision with root package name */
    prr<K, V>.jd f17414jd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class jd implements Set<K> {
        public jd() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            prr.this.wqx();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return prr.this.jpo(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return prr.jpo(prr.this.jd(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return prr.jpo(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iJpo = prr.this.jpo() - 1; iJpo >= 0; iJpo--) {
                Object objJpo = prr.this.jpo(iJpo, 0);
                iHashCode += objJpo == null ? 0 : objJpo.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return prr.this.jpo() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new jpo(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iJpo = prr.this.jpo(obj);
            if (iJpo < 0) {
                return false;
            }
            prr.this.jpo(iJpo);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return prr.jd(prr.this.jd(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return prr.wqx(prr.this.jd(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return prr.this.jpo();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return prr.this.jd(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) prr.this.jpo(tArr, 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class jpo<T> implements Iterator<T> {

        /* renamed from: cm, reason: collision with root package name */
        boolean f17415cm = false;

        /* renamed from: jd, reason: collision with root package name */
        int f17416jd;
        final int jpo;
        int wqx;

        public jpo(int i10) {
            this.jpo = i10;
            this.f17416jd = prr.this.jpo();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.wqx < this.f17416jd;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) prr.this.jpo(this.wqx, this.jpo);
            this.wqx++;
            this.f17415cm = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f17415cm) {
                throw new IllegalStateException();
            }
            int i10 = this.wqx - 1;
            this.wqx = i10;
            this.f17416jd--;
            this.f17415cm = false;
            prr.this.jpo(i10);
        }
    }

    public static <K, V> boolean jd(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean jpo(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean wqx(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Set<K> cm() {
        if (this.f17414jd == null) {
            this.f17414jd = new jd();
        }
        return this.f17414jd;
    }

    public abstract Map<K, V> jd();

    public abstract int jpo();

    public abstract int jpo(Object obj);

    public abstract Object jpo(int i10, int i11);

    public abstract void jpo(int i10);

    public abstract void wqx();

    public <T> T[] jpo(T[] tArr, int i10) {
        int iJpo = jpo();
        if (tArr.length < iJpo) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iJpo));
        }
        for (int i11 = 0; i11 < iJpo; i11++) {
            tArr[i11] = jpo(i11, i10);
        }
        if (tArr.length > iJpo) {
            tArr[iJpo] = null;
        }
        return tArr;
    }

    public Object[] jd(int i10) {
        int iJpo = jpo();
        Object[] objArr = new Object[iJpo];
        for (int i11 = 0; i11 < iJpo; i11++) {
            objArr[i11] = jpo(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean jpo(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
