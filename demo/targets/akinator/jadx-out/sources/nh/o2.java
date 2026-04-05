package nh;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o2 extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator[] f76519b;

    public o2(Iterable iterable) {
        this.f76519b = (Comparator[]) (iterable instanceof Collection ? (Collection) iterable : p8.newArrayList(iterable.iterator())).toArray(new Comparator[0]);
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f76519b;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
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
        if (obj instanceof o2) {
            return Arrays.equals(this.f76519b, ((o2) obj).f76519b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f76519b);
    }

    public String toString() {
        return j1.o2.o(new StringBuilder("Ordering.compound("), Arrays.toString(this.f76519b), ")");
    }

    public o2(we weVar, Comparator comparator) {
        this.f76519b = new Comparator[]{weVar, comparator};
    }
}
