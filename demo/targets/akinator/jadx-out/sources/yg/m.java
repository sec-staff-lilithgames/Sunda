package yg;

import android.graphics.drawable.Drawable;
import android.view.View;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class m {
    public static e a(int i10) {
        return i10 != 0 ? i10 != 1 ? new o() : new f() : new o();
    }

    public static void setElevation(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            ((j) background).setElevation(f10);
        }
    }

    public static void setParentAbsoluteElevation(View view) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            setParentAbsoluteElevation(view, (j) background);
        }
    }

    public static void setParentAbsoluteElevation(View view, j jVar) {
        if (jVar.isElevationOverlayEnabled()) {
            jVar.setParentAbsoluteElevation(t0.getParentAbsoluteElevation(view));
        }
    }
}
