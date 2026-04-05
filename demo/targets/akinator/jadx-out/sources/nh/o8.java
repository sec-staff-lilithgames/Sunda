package nh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o8 extends AbstractList implements Serializable, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76526b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76527c;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f76528e;

    public o8(Object obj, Object obj2, Object[] objArr) {
        this.f76526b = obj;
        this.f76527c = obj2;
        this.f76528e = (Object[]) mh.p1.checkNotNull(objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        if (i10 == 0) {
            return this.f76526b;
        }
        if (i10 == 1) {
            return this.f76527c;
        }
        mh.p1.checkElementIndex(i10, size());
        return this.f76528e[i10 - 2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return qh.f.saturatedAdd(this.f76528e.length, 2);
    }
}
