package nh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x3 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final w3 f76756b;

    public x3(w3 w3Var) {
        this.f76756b = (w3) mh.p1.checkNotNull(w3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f76756b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return ((e0) this.f76756b).containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new ha(1, this.f76756b.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        w3 w3Var = this.f76756b;
        mh.q1 q1VarEntryPredicate = w3Var.entryPredicate();
        Iterator<Map.Entry<Object, Object>> it = w3Var.unfiltered().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            if (q1VarEntryPredicate.apply(next) && Objects.equals(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        w3 w3Var = this.f76756b;
        return i7.removeIf(w3Var.unfiltered().entries(), mh.g2.and(w3Var.entryPredicate(), mh.g2.compose(mh.g2.in(collection), wa.f76740c)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        w3 w3Var = this.f76756b;
        return i7.removeIf(w3Var.unfiltered().entries(), mh.g2.and(w3Var.entryPredicate(), mh.g2.compose(mh.g2.not(mh.g2.in(collection)), wa.f76740c)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f76756b.size();
    }
}
