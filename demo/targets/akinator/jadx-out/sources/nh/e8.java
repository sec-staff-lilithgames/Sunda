package nh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e8 extends AbstractList implements Serializable, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76211b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f76212c;

    public e8(Object obj, Object[] objArr) {
        this.f76211b = obj;
        this.f76212c = (Object[]) mh.p1.checkNotNull(objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        if (i10 == 0) {
            return this.f76211b;
        }
        return this.f76212c[i10 - 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return qh.f.saturatedAdd(this.f76212c.length, 1);
    }
}
