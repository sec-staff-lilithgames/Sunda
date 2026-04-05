package nh;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z4 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final transient b5 f76810e;

    public z4(b5 b5Var) {
        this.f76810e = b5Var;
    }

    @Override // nh.b5, nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76810e.contains(obj);
    }

    @Override // java.util.List
    public Object get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        return this.f76810e.get((size() - 1) - i10);
    }

    @Override // nh.b5, java.util.List
    public int indexOf(Object obj) {
        int iLastIndexOf = this.f76810e.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return this.f76810e.isPartialView();
    }

    @Override // nh.b5, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // nh.b5, java.util.List
    public int lastIndexOf(Object obj) {
        int iIndexOf = this.f76810e.indexOf(obj);
        if (iIndexOf >= 0) {
            return (size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // nh.b5, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // nh.b5
    public b5 reverse() {
        return this.f76810e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76810e.size();
    }

    @Override // nh.b5, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return super.listIterator(i10);
    }

    @Override // nh.b5, java.util.List
    public b5 subList(int i10, int i11) {
        mh.p1.checkPositionIndexes(i10, i11, size());
        return this.f76810e.subList(size() - i11, size() - i10).reverse();
    }
}
