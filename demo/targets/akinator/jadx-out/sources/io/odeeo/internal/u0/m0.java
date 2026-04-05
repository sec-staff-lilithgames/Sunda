package io.odeeo.internal.u0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0<K, V> extends AbstractCollection<V> {

    /* renamed from: a, reason: collision with root package name */
    public final l0<K, V> f66928a;

    public m0(l0<K, V> l0Var) {
        this.f66928a = (l0) io.odeeo.internal.t0.u.checkNotNull(l0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f66928a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f66928a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return d2.c(this.f66928a.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        io.odeeo.internal.t0.v<? super Map.Entry<K, V>> vVarEntryPredicate = this.f66928a.entryPredicate();
        Iterator<Map.Entry<K, V>> it = this.f66928a.unfiltered().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (vVarEntryPredicate.apply(next) && io.odeeo.internal.t0.p.equal(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return v1.removeIf(this.f66928a.unfiltered().entries(), io.odeeo.internal.t0.w.and(this.f66928a.entryPredicate(), d2.b(io.odeeo.internal.t0.w.in(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return v1.removeIf(this.f66928a.unfiltered().entries(), io.odeeo.internal.t0.w.and(this.f66928a.entryPredicate(), d2.b(io.odeeo.internal.t0.w.not(io.odeeo.internal.t0.w.in(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f66928a.size();
    }
}
