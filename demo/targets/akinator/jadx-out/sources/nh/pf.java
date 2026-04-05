package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class pf extends u6 {

    /* renamed from: h, reason: collision with root package name */
    public static final pf f76567h = new pf(b5.of(), we.natural());

    /* renamed from: g, reason: collision with root package name */
    public final transient b5 f76568g;

    public pf(b5 b5Var, Comparator comparator) {
        super(comparator);
        this.f76568g = b5Var;
    }

    @Override // nh.u4
    public final int a(int i10, Object[] objArr) {
        return this.f76568g.a(i10, objArr);
    }

    @Override // nh.l6, nh.u4
    public b5 asList() {
        return this.f76568g;
    }

    @Override // nh.u4
    public final Object[] c() {
        return this.f76568g.c();
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object ceiling(Object obj) {
        int iT = t(obj, true);
        if (iT == size()) {
            return null;
        }
        return this.f76568g.get(iT);
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f76568g, obj, this.f76685e) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof ud) {
            collection = ((ud) collection).elementSet();
        }
        if (!rg.hasSameComparator(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        ej it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iCompare = this.f76685e.compare(next2, next);
                if (iCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // nh.u4
    public final int d() {
        return this.f76568g.d();
    }

    @Override // nh.u4
    public final int e() {
        return this.f76568g.e();
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f76685e;
        if (!rg.hasSameComparator(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            ej it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // nh.u6, java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f76568g.get(0);
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object floor(Object obj) {
        int iS = s(obj, true) - 1;
        if (iS == -1) {
            return null;
        }
        return this.f76568g.get(iS);
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object higher(Object obj) {
        int iT = t(obj, false);
        if (iT == size()) {
            return null;
        }
        return this.f76568g.get(iT);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return this.f76568g.isPartialView();
    }

    @Override // nh.u6, java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f76568g.get(size() - 1);
    }

    @Override // nh.u6, java.util.NavigableSet
    public Object lower(Object obj) {
        int iS = s(obj, false) - 1;
        if (iS == -1) {
            return null;
        }
        return this.f76568g.get(iS);
    }

    @Override // nh.u6
    public final u6 m() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f76685e);
        return isEmpty() ? u6.n(comparatorReverseOrder) : new pf(this.f76568g.reverse(), comparatorReverseOrder);
    }

    @Override // nh.u6
    public final u6 o(Object obj, boolean z10) {
        return r(0, s(obj, z10));
    }

    @Override // nh.u6
    public final u6 p(Object obj, boolean z10, Object obj2, boolean z11) {
        return q(obj, z10).o(obj2, z11);
    }

    @Override // nh.u6
    public final u6 q(Object obj, boolean z10) {
        return r(t(obj, z10), size());
    }

    public final pf r(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        Comparator comparator = this.f76685e;
        return i10 < i11 ? new pf(this.f76568g.subList(i10, i11), comparator) : u6.n(comparator);
    }

    public final int s(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f76568g, mh.p1.checkNotNull(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76568g.size();
    }

    public final int t(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f76568g, mh.p1.checkNotNull(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // nh.u6, java.util.NavigableSet
    public ej descendingIterator() {
        return this.f76568g.reverse().iterator();
    }

    @Override // nh.u6, nh.l6, nh.u4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public ej iterator() {
        return this.f76568g.iterator();
    }
}
