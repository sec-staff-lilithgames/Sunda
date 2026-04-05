package iu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 extends AtomicInteger implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f68404b;

    public b0() {
        this.f68404b = new ArrayList();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        ArrayList arrayList = this.f68404b;
        boolean zAdd = arrayList.add(obj);
        lazySet(arrayList.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        ArrayList arrayList = this.f68404b;
        boolean zAddAll = arrayList.addAll(collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f68404b.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f68404b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f68404b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        boolean z10 = obj instanceof b0;
        ArrayList arrayList = this.f68404b;
        return z10 ? arrayList.equals(((b0) obj).f68404b) : arrayList.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i10) {
        return this.f68404b.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f68404b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f68404b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f68404b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f68404b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return this.f68404b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        ArrayList arrayList = this.f68404b;
        boolean zRemove = arrayList.remove(obj);
        lazySet(arrayList.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        ArrayList arrayList = this.f68404b;
        boolean zRemoveAll = arrayList.removeAll(collection);
        lazySet(arrayList.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        ArrayList arrayList = this.f68404b;
        boolean zRetainAll = arrayList.retainAll(collection);
        lazySet(arrayList.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        return this.f68404b.set(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<Object> subList(int i10, int i11) {
        return this.f68404b.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f68404b.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f68404b.toString();
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return this.f68404b.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f68404b.toArray(eArr);
    }

    public b0(int i10) {
        this.f68404b = new ArrayList(i10);
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        ArrayList arrayList = this.f68404b;
        arrayList.add(i10, obj);
        lazySet(arrayList.size());
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        ArrayList arrayList = this.f68404b;
        boolean zAddAll = arrayList.addAll(i10, collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List
    public Object remove(int i10) {
        ArrayList arrayList = this.f68404b;
        Object objRemove = arrayList.remove(i10);
        lazySet(arrayList.size());
        return objRemove;
    }
}
