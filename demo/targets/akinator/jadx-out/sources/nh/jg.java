package nh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class jg extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final m5 f76404b;

    public jg(Set set) {
        mh.p1.checkArgument(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
        this.f76404b = ec.f(set);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        return this.f76404b.keySet().containsAll((Set) obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj instanceof jg ? this.f76404b.keySet().equals(((jg) obj).f76404b.keySet()) : super.equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f76404b.keySet().hashCode() << (r0.size() - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Set<Object>> iterator() {
        return new y4(this, size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1 << this.f76404b.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "powerSet(" + this.f76404b + ")";
    }
}
