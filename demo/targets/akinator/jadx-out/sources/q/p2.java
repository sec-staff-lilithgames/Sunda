package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface p2 {
    Drawable createDrawableFor(o2 o2Var, Context context, int i10);

    ColorStateList getTintListForDrawableRes(Context context, int i10);

    PorterDuff.Mode getTintModeForDrawableRes(int i10);

    boolean tintDrawable(Context context, int i10, Drawable drawable);

    boolean tintDrawableUsingColorFilter(Context context, int i10, Drawable drawable);
}
