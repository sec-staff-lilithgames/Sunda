package z1;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public int compare(b0 l12, b0 l22) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l12, "l1");
        kotlin.jvm.internal.e0.checkNotNullParameter(l22, "l2");
        int iCompare = kotlin.jvm.internal.e0.compare(l12.getDepth$ui_release(), l22.getDepth$ui_release());
        return iCompare != 0 ? iCompare : kotlin.jvm.internal.e0.compare(l12.hashCode(), l22.hashCode());
    }
}
