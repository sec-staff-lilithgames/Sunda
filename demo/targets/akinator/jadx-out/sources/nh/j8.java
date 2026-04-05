package nh;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j8 extends AbstractList {

    /* renamed from: b, reason: collision with root package name */
    public final List f76392b;

    public j8(List list) {
        this.f76392b = (List) mh.p1.checkNotNull(list);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int size = size();
        mh.p1.checkPositionIndex(i10, size);
        this.f76392b.add(size - i10, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f76392b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        int size = size();
        mh.p1.checkElementIndex(i10, size);
        return this.f76392b.get((size - 1) - i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        int size = size();
        mh.p1.checkPositionIndex(i10, size);
        return new i8(this, this.f76392b.listIterator(size - i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        int size = size();
        mh.p1.checkElementIndex(i10, size);
        return this.f76392b.remove((size - 1) - i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        subList(i10, i11).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int size = size();
        mh.p1.checkElementIndex(i10, size);
        return this.f76392b.set((size - 1) - i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76392b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Object> subList(int i10, int i11) {
        mh.p1.checkPositionIndexes(i10, i11, size());
        int size = size();
        mh.p1.checkPositionIndex(i11, size);
        int i12 = size - i11;
        int size2 = size();
        mh.p1.checkPositionIndex(i10, size2);
        return p8.reverse(this.f76392b.subList(i12, size2 - i10));
    }
}
