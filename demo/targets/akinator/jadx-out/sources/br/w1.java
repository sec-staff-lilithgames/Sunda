package br;

import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class w1 {
    public static final ImageView.ScaleType toImageViewScaleType(u1 u1Var) {
        int i10 = u1Var == null ? -1 : v1.$EnumSwitchMapping$0[u1Var.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i10 == 4) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        throw new tu.t();
    }
}
