package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z<T> extends p2<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<? super T>[] f67202a;

    public z(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f67202a = new Comparator[]{comparator, comparator2};
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(T t10, T t11) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f67202a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return Arrays.equals(this.f67202a, ((z) obj).f67202a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f67202a);
    }

    public String toString() {
        return j1.o2.o(new StringBuilder("Ordering.compound("), Arrays.toString(this.f67202a), ")");
    }

    public z(Iterable<? extends Comparator<? super T>> iterable) {
        this.f67202a = (Comparator[]) v1.a(iterable, new Comparator[0]);
    }
}
