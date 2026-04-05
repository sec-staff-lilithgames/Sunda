package nh;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k3 extends ee {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f76414b;

    public k3(l3 l3Var) {
        this.f76414b = l3Var;
    }

    @Override // nh.ee
    public final ud c() {
        return this.f76414b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<td> iterator() {
        return this.f76414b.g();
    }

    @Override // nh.ig, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return this.f76414b.f76440f.h(new j3(mh.g2.in(collection), 0));
    }

    @Override // nh.ig, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        return this.f76414b.f76440f.h(new j3(mh.g2.not(mh.g2.in(collection)), 0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76414b.f76440f.keySet().size();
    }
}
