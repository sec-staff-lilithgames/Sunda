package uu;

import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w0 extends v0 {
    public static final int access$reverseElementIndex(List list, int i10) {
        if (i10 >= 0 && i10 <= p0.getLastIndex(list)) {
            return p0.getLastIndex(list) - i10;
        }
        StringBuilder sbT = o2.t(i10, "Element index ", " must be in range [");
        sbT.append(new qv.m(0, p0.getLastIndex(list)));
        sbT.append("].");
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public static final int access$reverseIteratorIndex(List list, int i10) {
        return p0.getLastIndex(list) - i10;
    }

    public static final int access$reversePositionIndex(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        StringBuilder sbT = o2.t(i10, "Position index ", " must be in range [");
        sbT.append(new qv.m(0, list.size()));
        sbT.append("].");
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public static <T> List<T> asReversed(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        return new y1(list);
    }

    public static final <T> List<T> asReversedMutable(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        return new w1(list);
    }
}
