package w3;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public static float deriveDimension(int i10, float f10, DisplayMetrics displayMetrics) {
        float f11;
        float f12;
        if (Build.VERSION.SDK_INT >= 34) {
            return l.deriveDimension(i10, f10, displayMetrics);
        }
        if (i10 == 0) {
            return f10;
        }
        if (i10 == 1) {
            float f13 = displayMetrics.density;
            if (f13 == 0.0f) {
                return 0.0f;
            }
            return f10 / f13;
        }
        if (i10 == 2) {
            float f14 = displayMetrics.scaledDensity;
            if (f14 == 0.0f) {
                return 0.0f;
            }
            return f10 / f14;
        }
        if (i10 == 3) {
            float f15 = displayMetrics.xdpi;
            if (f15 == 0.0f) {
                return 0.0f;
            }
            f11 = f10 / f15;
            f12 = 0.013888889f;
        } else {
            if (i10 == 4) {
                float f16 = displayMetrics.xdpi;
                if (f16 == 0.0f) {
                    return 0.0f;
                }
                return f10 / f16;
            }
            if (i10 != 5) {
                throw new IllegalArgumentException(a.b.e(i10, "Invalid unitToConvertTo "));
            }
            float f17 = displayMetrics.xdpi;
            if (f17 == 0.0f) {
                return 0.0f;
            }
            f11 = f10 / f17;
            f12 = 0.03937008f;
        }
        return f11 / f12;
    }

    public static float dpToPx(float f10, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f10, displayMetrics);
    }

    public static int getUnitFromComplexDimension(int i10) {
        return i10 & 15;
    }

    public static float pxToDp(float f10, DisplayMetrics displayMetrics) {
        return deriveDimension(1, f10, displayMetrics);
    }

    public static float pxToSp(float f10, DisplayMetrics displayMetrics) {
        return deriveDimension(2, f10, displayMetrics);
    }

    public static float spToPx(float f10, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f10, displayMetrics);
    }
}
