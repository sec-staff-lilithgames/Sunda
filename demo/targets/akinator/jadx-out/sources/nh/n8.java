package nh;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n8 extends AbstractSequentialList implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final List f76498b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.v0 f76499c;

    public n8(List list, mh.v0 v0Var) {
        this.f76498b = (List) mh.p1.checkNotNull(list);
        this.f76499c = (mh.v0) mh.p1.checkNotNull(v0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f76498b.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return new l8(this, this.f76498b.listIterator(i10), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f76498b.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76498b.size();
    }
}
