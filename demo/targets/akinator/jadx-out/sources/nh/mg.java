package nh;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class mg extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final m5 f76483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76484c;

    public mg(int i10, m5 m5Var) {
        this.f76483b = m5Var;
        this.f76484c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Integer num = (Integer) this.f76483b.get(obj);
        return (num == null || ((1 << num.intValue()) & this.f76484c) == 0) ? false : true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new lg(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return Integer.bitCount(this.f76484c);
    }
}
