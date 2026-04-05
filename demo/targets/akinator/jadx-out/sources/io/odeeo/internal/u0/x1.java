package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x1<T> extends p2<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f67184a;

    public x1(Comparator<? super T> comparator) {
        this.f67184a = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            return this.f67184a.equals(((x1) obj).f67184a);
        }
        return false;
    }

    public int hashCode() {
        return this.f67184a.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f67184a + ".lexicographical()";
    }

    @Override // io.odeeo.internal.u0.p2, java.util.Comparator
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f67184a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}
