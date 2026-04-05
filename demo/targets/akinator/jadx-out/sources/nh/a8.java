package nh;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a8 extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final we f76093b;

    public a8(we weVar) {
        this.f76093b = weVar;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a8) {
            return this.f76093b.equals(((a8) obj).f76093b);
        }
        return false;
    }

    public int hashCode() {
        return this.f76093b.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f76093b + ".lexicographical()";
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Iterable<Object> iterable, Iterable<Object> iterable2) {
        Iterator<Object> it = iterable.iterator();
        Iterator<Object> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f76093b.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}
