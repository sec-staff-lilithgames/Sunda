package vg;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f89262a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f89263b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f89264c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f89265d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f89266e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f89267f = b.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return o3.b.setAlphaComponent(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList convertToRippleDrawableColor(ColorStateList colorStateList) {
        int[] iArr = f89263b;
        return new ColorStateList(new int[][]{f89265d, iArr, StateSet.NOTHING}, new int[]{a(colorStateList, f89264c), a(colorStateList, iArr), a(colorStateList, f89262a)});
    }

    public static Drawable createOvalRippleLollipop(Context context, int i10) {
        return a.b(context, i10);
    }

    public static ColorStateList sanitizeRippleDrawableColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f89266e, 0)) != 0) {
            Log.w(f89267f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean shouldDrawRippleCompat(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
