package nh;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ze implements mh.q1, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final ze f76826e = new ze(t2.f76651c, r2.f76594c);

    /* renamed from: b, reason: collision with root package name */
    public final v2 f76827b;

    /* renamed from: c, reason: collision with root package name */
    public final v2 f76828c;

    public ze(v2 v2Var, v2 v2Var2) {
        this.f76827b = (v2) mh.p1.checkNotNull(v2Var);
        this.f76828c = (v2) mh.p1.checkNotNull(v2Var2);
        if (v2Var.compareTo(v2Var2) > 0 || v2Var == r2.f76594c || v2Var2 == t2.f76651c) {
            StringBuilder sb2 = new StringBuilder("Invalid range: ");
            StringBuilder sb3 = new StringBuilder(16);
            v2Var.c(sb3);
            sb3.append("..");
            v2Var2.d(sb3);
            sb2.append(sb3.toString());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static <C extends Comparable<?>> ze all() {
        return f76826e;
    }

    public static <C extends Comparable<?>> ze atLeast(C c10) {
        return new ze(v2.a(c10), r2.f76594c);
    }

    public static <C extends Comparable<?>> ze atMost(C c10) {
        return new ze(t2.f76651c, new s2(c10));
    }

    public static <C extends Comparable<?>> ze closed(C c10, C c11) {
        return new ze(v2.a(c10), new s2(c11));
    }

    public static <C extends Comparable<?>> ze closedOpen(C c10, C c11) {
        return new ze(v2.a(c10), v2.a(c11));
    }

    public static <C extends Comparable<?>> ze downTo(C c10, r0 r0Var) {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 0) {
            return greaterThan(c10);
        }
        if (iOrdinal == 1) {
            return atLeast(c10);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> ze encloseAll(Iterable<C> iterable) {
        mh.p1.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (we.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) mh.p1.checkNotNull(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) mh.p1.checkNotNull(it.next());
            comparable = (Comparable) we.natural().min(comparable, comparable3);
            comparable2 = (Comparable) we.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> ze greaterThan(C c10) {
        return new ze(new s2(c10), r2.f76594c);
    }

    public static <C extends Comparable<?>> ze lessThan(C c10) {
        return new ze(t2.f76651c, v2.a(c10));
    }

    public static <C extends Comparable<?>> ze open(C c10, C c11) {
        return new ze(new s2(c10), v2.a(c11));
    }

    public static <C extends Comparable<?>> ze openClosed(C c10, C c11) {
        return new ze(new s2(c10), new s2(c11));
    }

    public static <C extends Comparable<?>> ze range(C c10, r0 r0Var, C c11, r0 r0Var2) {
        mh.p1.checkNotNull(r0Var);
        mh.p1.checkNotNull(r0Var2);
        r0 r0Var3 = r0.f76591b;
        return new ze(r0Var == r0Var3 ? new s2(c10) : v2.a(c10), r0Var2 == r0Var3 ? v2.a(c11) : new s2(c11));
    }

    public static <C extends Comparable<?>> ze singleton(C c10) {
        return closed(c10, c10);
    }

    public static <C extends Comparable<?>> ze upTo(C c10, r0 r0Var) {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 0) {
            return lessThan(c10);
        }
        if (iOrdinal == 1) {
            return atMost(c10);
        }
        throw new AssertionError();
    }

    public ze canonical(a3 a3Var) {
        mh.p1.checkNotNull(a3Var);
        v2 v2Var = this.f76827b;
        v2 v2VarB = v2Var.b(a3Var);
        v2 v2Var2 = this.f76828c;
        v2 v2VarB2 = v2Var2.b(a3Var);
        return (v2VarB == v2Var && v2VarB2 == v2Var2) ? this : new ze(v2VarB, v2VarB2);
    }

    public boolean contains(Comparable comparable) {
        mh.p1.checkNotNull(comparable);
        return this.f76827b.g(comparable) && !this.f76828c.g(comparable);
    }

    public boolean containsAll(Iterable<Comparable> iterable) {
        if (i7.isEmpty(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (we.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<Comparable> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(ze zeVar) {
        return this.f76827b.compareTo(zeVar.f76827b) <= 0 && this.f76828c.compareTo(zeVar.f76828c) >= 0;
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (obj instanceof ze) {
            ze zeVar = (ze) obj;
            if (this.f76827b.equals(zeVar.f76827b) && this.f76828c.equals(zeVar.f76828c)) {
                return true;
            }
        }
        return false;
    }

    public ze gap(ze zeVar) {
        v2 v2Var = zeVar.f76828c;
        v2 v2Var2 = zeVar.f76827b;
        v2 v2Var3 = this.f76827b;
        if (v2Var3.compareTo(v2Var) >= 0 || v2Var2.compareTo(this.f76828c) >= 0) {
            boolean z10 = v2Var3.compareTo(v2Var2) < 0;
            ze zeVar2 = z10 ? this : zeVar;
            if (!z10) {
                zeVar = this;
            }
            return new ze(zeVar2.f76828c, zeVar.f76827b);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + zeVar);
    }

    public boolean hasLowerBound() {
        return this.f76827b != t2.f76651c;
    }

    public boolean hasUpperBound() {
        return this.f76828c != r2.f76594c;
    }

    public int hashCode() {
        return this.f76828c.hashCode() + (this.f76827b.hashCode() * 31);
    }

    public ze intersection(ze zeVar) {
        v2 v2Var = zeVar.f76827b;
        v2 v2Var2 = this.f76827b;
        int iCompareTo = v2Var2.compareTo(v2Var);
        v2 v2Var3 = zeVar.f76828c;
        v2 v2Var4 = this.f76828c;
        int iCompareTo2 = v2Var4.compareTo(v2Var3);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return zeVar;
        }
        if (iCompareTo < 0) {
            v2Var2 = zeVar.f76827b;
        }
        if (iCompareTo2 <= 0) {
            v2Var3 = v2Var4;
        }
        mh.p1.checkArgument(v2Var2.compareTo(v2Var3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, zeVar);
        return new ze(v2Var2, v2Var3);
    }

    public boolean isConnected(ze zeVar) {
        return this.f76827b.compareTo(zeVar.f76828c) <= 0 && zeVar.f76827b.compareTo(this.f76828c) <= 0;
    }

    public boolean isEmpty() {
        return this.f76827b.equals(this.f76828c);
    }

    public r0 lowerBoundType() {
        return this.f76827b.i();
    }

    public Comparable lowerEndpoint() {
        return this.f76827b.e();
    }

    public ze span(ze zeVar) {
        v2 v2Var = zeVar.f76827b;
        v2 v2Var2 = this.f76827b;
        int iCompareTo = v2Var2.compareTo(v2Var);
        v2 v2Var3 = zeVar.f76828c;
        v2 v2Var4 = this.f76828c;
        int iCompareTo2 = v2Var4.compareTo(v2Var3);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return zeVar;
        }
        if (iCompareTo > 0) {
            v2Var2 = zeVar.f76827b;
        }
        if (iCompareTo2 >= 0) {
            v2Var3 = v2Var4;
        }
        return new ze(v2Var2, v2Var3);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(16);
        this.f76827b.c(sb2);
        sb2.append("..");
        this.f76828c.d(sb2);
        return sb2.toString();
    }

    public r0 upperBoundType() {
        return this.f76828c.j();
    }

    public Comparable upperEndpoint() {
        return this.f76828c.e();
    }

    @Override // mh.q1
    @Deprecated
    public boolean apply(Comparable comparable) {
        return contains(comparable);
    }
}
