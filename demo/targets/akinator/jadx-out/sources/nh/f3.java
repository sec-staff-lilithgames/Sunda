package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f3 extends xa {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f76247b;

    public f3(i3 i3Var) {
        this.f76247b = i3Var;
    }

    @Override // nh.xa
    public final Map c() {
        return this.f76247b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
        return new u1(this);
    }

    @Override // nh.xa, nh.ig, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return this.f76247b.f76349f.h(mh.g2.in(collection));
    }

    @Override // nh.xa, nh.ig, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        return this.f76247b.f76349f.h(mh.g2.not(mh.g2.in(collection)));
    }

    @Override // nh.xa, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return z7.size(iterator());
    }
}
