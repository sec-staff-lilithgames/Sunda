package nh;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k0 implements af {
    @Override // nh.af
    public void add(ze zeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.af
    public void addAll(af afVar) {
        addAll(afVar.asRanges());
    }

    @Override // nh.af
    public abstract /* synthetic */ Set asDescendingSetOfRanges();

    @Override // nh.af
    public abstract /* synthetic */ Set asRanges();

    @Override // nh.af
    public void clear() {
        remove(ze.all());
    }

    @Override // nh.af
    public abstract /* synthetic */ af complement();

    @Override // nh.af
    public boolean contains(Comparable comparable) {
        return rangeContaining(comparable) != null;
    }

    @Override // nh.af
    public abstract boolean encloses(ze zeVar);

    @Override // nh.af
    public boolean enclosesAll(af afVar) {
        return enclosesAll(afVar.asRanges());
    }

    @Override // nh.af
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof af) {
            return asRanges().equals(((af) obj).asRanges());
        }
        return false;
    }

    @Override // nh.af
    public final int hashCode() {
        return asRanges().hashCode();
    }

    @Override // nh.af
    public boolean intersects(ze zeVar) {
        return !subRangeSet(zeVar).isEmpty();
    }

    @Override // nh.af
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @Override // nh.af
    public abstract ze rangeContaining(Comparable comparable);

    @Override // nh.af
    public void remove(ze zeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.af
    public void removeAll(af afVar) {
        removeAll(afVar.asRanges());
    }

    @Override // nh.af
    public abstract /* synthetic */ ze span();

    @Override // nh.af
    public abstract /* synthetic */ af subRangeSet(ze zeVar);

    @Override // nh.af
    public final String toString() {
        return asRanges().toString();
    }

    @Override // nh.af
    public void addAll(Iterable<ze> iterable) {
        Iterator<ze> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // nh.af
    public boolean enclosesAll(Iterable<ze> iterable) {
        Iterator<ze> it = iterable.iterator();
        while (it.hasNext()) {
            if (!encloses(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // nh.af
    public void removeAll(Iterable<ze> iterable) {
        Iterator<ze> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }
}
