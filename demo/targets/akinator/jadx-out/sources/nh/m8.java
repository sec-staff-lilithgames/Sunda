package nh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m8 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final List f76473b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.v0 f76474c;

    public m8(List list, mh.v0 v0Var) {
        this.f76473b = (List) mh.p1.checkNotNull(list);
        this.f76474c = (mh.v0) mh.p1.checkNotNull(v0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f76474c.apply(this.f76473b.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f76473b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return new l8(this, this.f76473b.listIterator(i10), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        return this.f76474c.apply(this.f76473b.remove(i10));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f76473b.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76473b.size();
    }
}
