package sv;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {
    public a(kotlin.jvm.internal.u uVar) {
    }

    public final b valueOf(int i10) {
        if (i10 >= 0 && i10 < 17) {
            return (b) b.getEntries().get(i10);
        }
        if (18 > i10 || i10 >= 31) {
            throw new IllegalArgumentException(o2.k(i10, "Category #", " is not defined."));
        }
        return (b) b.getEntries().get(i10 - 1);
    }
}
