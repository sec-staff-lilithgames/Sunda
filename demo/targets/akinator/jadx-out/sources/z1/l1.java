package z1;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f97340b = new l1();

    @Override // java.util.Comparator
    public int compare(b0 a10, b0 b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a10, "a");
        kotlin.jvm.internal.e0.checkNotNullParameter(b10, "b");
        int iCompare = kotlin.jvm.internal.e0.compare(b10.getDepth$ui_release(), a10.getDepth$ui_release());
        return iCompare != 0 ? iCompare : kotlin.jvm.internal.e0.compare(a10.hashCode(), b10.hashCode());
    }
}
