package mk;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class s extends AbstractList implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f74799b;

    public s(ArrayList<Object> arrayList) {
        Objects.requireNonNull(arrayList);
        this.f74799b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Element must be non-null");
        }
        this.f74799b.add(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f74799b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f74799b.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return this.f74799b.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f74799b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.f74799b.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.f74799b.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.f74799b.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        return this.f74799b.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return this.f74799b.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        return this.f74799b.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        if (obj != null) {
            return this.f74799b.set(i10, obj);
        }
        throw new NullPointerException("Element must be non-null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74799b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.f74799b.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.f74799b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f74799b.toArray(tArr);
    }
}
