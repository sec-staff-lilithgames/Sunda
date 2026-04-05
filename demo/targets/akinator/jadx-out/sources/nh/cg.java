package nh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class cg extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f76160c;

    public cg(int i10, m5 m5Var) {
        this.f76159b = i10;
        this.f76160c = m5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (set.size() == this.f76159b && this.f76160c.keySet().containsAll(set)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Set<Object>> iterator() {
        return new ag(this.f76159b, this.f76160c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return qh.f.binomial(this.f76160c.size(), this.f76159b);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Sets.combinations(");
        sb2.append(this.f76160c.keySet());
        sb2.append(", ");
        return a.b.f(this.f76159b, ")", sb2);
    }
}
