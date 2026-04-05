package e6;

import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y0 {
    public static int a(ViewGroup viewGroup, int i10) {
        return viewGroup.getChildDrawingOrder(i10);
    }

    public static void b(ViewGroup viewGroup, boolean z10) {
        viewGroup.suppressLayout(z10);
    }
}
