package nh;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f76166b;

    public d0(w wVar) {
        this.f76166b = wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f76166b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f76166b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new d(this.f76166b, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76166b.size();
    }
}
