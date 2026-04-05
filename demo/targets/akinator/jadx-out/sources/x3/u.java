package x3;

import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u {
    public static void apply(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    public static void applyDisplay(int i10, Rect rect, Rect rect2, int i11) {
        Gravity.applyDisplay(i10, rect, rect2, i11);
    }

    public static int getAbsoluteGravity(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }

    public static void apply(int i10, int i11, int i12, Rect rect, int i13, int i14, Rect rect2, int i15) {
        Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
    }
}
