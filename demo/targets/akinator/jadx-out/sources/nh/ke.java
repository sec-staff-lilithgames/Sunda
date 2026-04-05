package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ke extends h0 {
    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        elementSet().clear();
    }

    @Override // nh.h0, nh.ud
    public abstract /* synthetic */ int count(Object obj);

    @Override // nh.h0
    public int e() {
        return elementSet().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, nh.ud, nh.qg, java.util.Set, java.util.NavigableSet
    public Iterator<Object> iterator() {
        return new ie(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public int size() {
        long count = 0;
        while (entrySet().iterator().hasNext()) {
            count += r0.next().getCount();
        }
        return rh.w.saturatedCast(count);
    }
}
