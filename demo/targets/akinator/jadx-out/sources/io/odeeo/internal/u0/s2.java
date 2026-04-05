package io.odeeo.internal.u0;

import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s2<C extends Comparable> extends t2 implements io.odeeo.internal.t0.v<C> {

    /* renamed from: c, reason: collision with root package name */
    public static final s2<Comparable> f67056c = new s2<>(b0.b(), b0.a());
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b0<C> f67057a;

    /* renamed from: b, reason: collision with root package name */
    public final b0<C> f67058b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67059a;

        static {
            int[] iArr = new int[o.values().length];
            f67059a = iArr;
            try {
                iArr[o.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67059a[o.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public s2(b0<C> b0Var, b0<C> b0Var2) {
        this.f67057a = (b0) io.odeeo.internal.t0.u.checkNotNull(b0Var);
        this.f67058b = (b0) io.odeeo.internal.t0.u.checkNotNull(b0Var2);
        if (b0Var.compareTo((b0) b0Var2) > 0 || b0Var == b0.a() || b0Var2 == b0.b()) {
            throw new IllegalArgumentException("Invalid range: " + b(b0Var, b0Var2));
        }
    }

    public static <C extends Comparable<?>> s2<C> a(b0<C> b0Var, b0<C> b0Var2) {
        return new s2<>(b0Var, b0Var2);
    }

    public static <C extends Comparable<?>> s2<C> all() {
        return (s2<C>) f67056c;
    }

    public static <C extends Comparable<?>> s2<C> atLeast(C c10) {
        return a(b0.b(c10), b0.a());
    }

    public static <C extends Comparable<?>> s2<C> atMost(C c10) {
        return a(b0.b(), b0.a(c10));
    }

    public static String b(b0<?> b0Var, b0<?> b0Var2) {
        StringBuilder sb2 = new StringBuilder(16);
        b0Var.a(sb2);
        sb2.append("..");
        b0Var2.b(sb2);
        return sb2.toString();
    }

    public static <C extends Comparable<?>> s2<C> closed(C c10, C c11) {
        return a(b0.b(c10), b0.a(c11));
    }

    public static <C extends Comparable<?>> s2<C> closedOpen(C c10, C c11) {
        return a(b0.b(c10), b0.b(c11));
    }

    public static <C extends Comparable<?>> s2<C> downTo(C c10, o oVar) {
        int i10 = a.f67059a[oVar.ordinal()];
        if (i10 == 1) {
            return greaterThan(c10);
        }
        if (i10 == 2) {
            return atLeast(c10);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> s2<C> encloseAll(Iterable<C> iterable) {
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSetA = a(iterable);
            Comparator comparator = sortedSetA.comparator();
            if (p2.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSetA.first(), (Comparable) sortedSetA.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) io.odeeo.internal.t0.u.checkNotNull(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) io.odeeo.internal.t0.u.checkNotNull(it.next());
            comparable = (Comparable) p2.natural().min(comparable, comparable3);
            comparable2 = (Comparable) p2.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> s2<C> greaterThan(C c10) {
        return a(b0.a(c10), b0.a());
    }

    public static <C extends Comparable<?>> s2<C> lessThan(C c10) {
        return a(b0.b(), b0.b(c10));
    }

    public static <C extends Comparable<?>> s2<C> open(C c10, C c11) {
        return a(b0.a(c10), b0.b(c11));
    }

    public static <C extends Comparable<?>> s2<C> openClosed(C c10, C c11) {
        return a(b0.a(c10), b0.a(c11));
    }

    public static <C extends Comparable<?>> s2<C> range(C c10, o oVar, C c11, o oVar2) {
        io.odeeo.internal.t0.u.checkNotNull(oVar);
        io.odeeo.internal.t0.u.checkNotNull(oVar2);
        o oVar3 = o.OPEN;
        return a(oVar == oVar3 ? b0.a(c10) : b0.b(c10), oVar2 == oVar3 ? b0.b(c11) : b0.a(c11));
    }

    public static <C extends Comparable<?>> s2<C> singleton(C c10) {
        return closed(c10, c10);
    }

    public static <C extends Comparable<?>> s2<C> upTo(C c10, o oVar) {
        int i10 = a.f67059a[oVar.ordinal()];
        if (i10 == 1) {
            return lessThan(c10);
        }
        if (i10 == 2) {
            return atMost(c10);
        }
        throw new AssertionError();
    }

    public s2<C> canonical(c0<C> c0Var) {
        io.odeeo.internal.t0.u.checkNotNull(c0Var);
        b0<C> b0VarA = this.f67057a.a(c0Var);
        b0<C> b0VarA2 = this.f67058b.a(c0Var);
        return (b0VarA == this.f67057a && b0VarA2 == this.f67058b) ? this : a((b0) b0VarA, (b0) b0VarA2);
    }

    public boolean contains(C c10) {
        io.odeeo.internal.t0.u.checkNotNull(c10);
        return this.f67057a.c(c10) && !this.f67058b.c(c10);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (v1.isEmpty(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSetA = a(iterable);
            Comparator comparator = sortedSetA.comparator();
            if (p2.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSetA.first()) && contains((Comparable) sortedSetA.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(s2<C> s2Var) {
        return this.f67057a.compareTo((b0) s2Var.f67057a) <= 0 && this.f67058b.compareTo((b0) s2Var.f67058b) >= 0;
    }

    @Override // io.odeeo.internal.t0.v
    public boolean equals(Object obj) {
        if (obj instanceof s2) {
            s2 s2Var = (s2) obj;
            if (this.f67057a.equals(s2Var.f67057a) && this.f67058b.equals(s2Var.f67058b)) {
                return true;
            }
        }
        return false;
    }

    public s2<C> gap(s2<C> s2Var) {
        boolean z10 = this.f67057a.compareTo((b0) s2Var.f67057a) < 0;
        s2<C> s2Var2 = z10 ? this : s2Var;
        if (!z10) {
            s2Var = this;
        }
        return a((b0) s2Var2.f67058b, (b0) s2Var.f67057a);
    }

    public boolean hasLowerBound() {
        return this.f67057a != b0.b();
    }

    public boolean hasUpperBound() {
        return this.f67058b != b0.a();
    }

    public int hashCode() {
        return this.f67058b.hashCode() + (this.f67057a.hashCode() * 31);
    }

    public s2<C> intersection(s2<C> s2Var) {
        int iCompareTo = this.f67057a.compareTo((b0) s2Var.f67057a);
        int iCompareTo2 = this.f67058b.compareTo((b0) s2Var.f67058b);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo > 0 || iCompareTo2 < 0) {
            return a((b0) (iCompareTo >= 0 ? this.f67057a : s2Var.f67057a), (b0) (iCompareTo2 <= 0 ? this.f67058b : s2Var.f67058b));
        }
        return s2Var;
    }

    public boolean isConnected(s2<C> s2Var) {
        return this.f67057a.compareTo((b0) s2Var.f67058b) <= 0 && s2Var.f67057a.compareTo((b0) this.f67058b) <= 0;
    }

    public boolean isEmpty() {
        return this.f67057a.equals(this.f67058b);
    }

    public o lowerBoundType() {
        return this.f67057a.d();
    }

    public C lowerEndpoint() {
        return (C) this.f67057a.c();
    }

    public Object readResolve() {
        return equals(f67056c) ? all() : this;
    }

    public s2<C> span(s2<C> s2Var) {
        int iCompareTo = this.f67057a.compareTo((b0) s2Var.f67057a);
        int iCompareTo2 = this.f67058b.compareTo((b0) s2Var.f67058b);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return a((b0) (iCompareTo <= 0 ? this.f67057a : s2Var.f67057a), (b0) (iCompareTo2 >= 0 ? this.f67058b : s2Var.f67058b));
        }
        return s2Var;
    }

    public String toString() {
        return b(this.f67057a, this.f67058b);
    }

    public o upperBoundType() {
        return this.f67058b.e();
    }

    public C upperEndpoint() {
        return (C) this.f67058b.c();
    }

    public static <T> SortedSet<T> a(Iterable<T> iterable) {
        return (SortedSet) iterable;
    }

    @Override // io.odeeo.internal.t0.v
    @Deprecated
    public boolean apply(C c10) {
        return contains(c10);
    }

    public static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
