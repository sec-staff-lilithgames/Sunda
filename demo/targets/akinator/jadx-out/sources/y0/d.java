package y0;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final void checkElementIndex$runtime(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(i.a(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void checkPositionIndex$runtime(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(i.a(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void checkRangeIndexes$runtime(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbF = i.f(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbF.append(i12);
            throw new IndexOutOfBoundsException(sbF.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(i.a(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final boolean orderedEquals$runtime(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!e0.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final int orderedHashCode$runtime(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
