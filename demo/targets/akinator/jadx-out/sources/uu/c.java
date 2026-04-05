package uu;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {
    public c(kotlin.jvm.internal.u uVar) {
    }

    public final void checkElementIndex$kotlin_stdlib(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(w0.i.a(i10, i11, "index: ", ", size: "));
        }
    }

    public final void checkRangeIndexes$kotlin_stdlib(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbF = w0.i.f(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbF.append(i12);
            throw new IndexOutOfBoundsException(sbF.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public final int newCapacity$kotlin_stdlib(int i10, int i11) {
        int i12 = i10 + (i10 >> 1);
        if (i12 - i11 < 0) {
            i12 = i11;
        }
        return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
    }

    public final boolean orderedEquals$kotlin_stdlib(Collection<?> c10, Collection<?> other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c10, "c");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (c10.size() != other.size()) {
            return false;
        }
        Iterator<?> it = other.iterator();
        Iterator<?> it2 = c10.iterator();
        while (it2.hasNext()) {
            if (!kotlin.jvm.internal.e0.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int orderedHashCode$kotlin_stdlib(Collection<?> c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c10, "c");
        Iterator<?> it = c10.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void checkBoundsIndexes$kotlin_stdlib(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbF = w0.i.f(i10, i11, "startIndex: ", duhsDlGWdBkekB.PBFzlhA, ", size: ");
            sbF.append(i12);
            throw new IndexOutOfBoundsException(sbF.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "startIndex: ", " > endIndex: "));
        }
    }

    public final void checkPositionIndex$kotlin_stdlib(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(w0.i.a(i10, i11, "index: ", QGjYBESwAiCc.kUFibuEeYsgQS));
        }
    }
}
