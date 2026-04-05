package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j4 implements Set, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f14183a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f14184b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(a()) > 0) {
            this.f14183a.add(comparable);
        } else {
            this.f14183a.add(b(comparable), comparable);
        }
        return this.f14184b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public Comparable b(int i10) {
        Comparable comparable = (Comparable) this.f14183a.remove(i10);
        this.f14184b.remove(comparable);
        return comparable;
    }

    public int c(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f14183a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch < size() && comparableA == a(iBinarySearch)) {
            iBinarySearch++;
        }
        return iBinarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f14183a.clear();
        this.f14184b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f14184b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f14184b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f14183a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f14183a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iD = d((Comparable) obj);
        if (iD == -1) {
            return false;
        }
        this.f14183a.remove(iD);
        return this.f14184b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f14183a.get(size);
            if (!collection.contains(comparable)) {
                this.f14183a.remove(size);
                this.f14184b.remove(comparable);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f14183a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f14183a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f14183a.toArray(objArr);
    }

    public int b(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f14183a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch >= 0 && comparableA == a(iBinarySearch)) {
            iBinarySearch--;
        }
        return iBinarySearch + 1;
    }

    public Comparable a(int i10) {
        return (Comparable) this.f14183a.get(i10);
    }

    public void a(int i10, Comparable comparable) {
        this.f14184b.remove((Comparable) this.f14183a.get(i10));
        this.f14183a.set(i10, comparable);
        this.f14184b.add(comparable);
    }

    public Comparable a() {
        return (Comparable) this.f14183a.get(size() - 1);
    }
}
