package nh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x1 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f76751b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.v0 f76752c;

    public x1(Collection collection, mh.v0 v0Var) {
        this.f76751b = (Collection) mh.p1.checkNotNull(collection);
        this.f76752c = (mh.v0) mh.p1.checkNotNull(v0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f76751b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f76751b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.transform(this.f76751b.iterator(), this.f76752c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76751b.size();
    }
}
