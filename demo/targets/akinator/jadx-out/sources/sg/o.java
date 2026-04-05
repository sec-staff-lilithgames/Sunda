package sg;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import r4.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class o {
    public static float a(String[] strArr, int i10) throws NumberFormatException {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int resolveThemeDuration(Context context, int i10, int i11) {
        return ug.c.resolveInteger(context, i10, i11);
    }

    public static TimeInterpolator resolveThemeInterpolator(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!b(strValueOf, "cubic-bezier") && !b(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!b(strValueOf, "cubic-bezier")) {
            if (b(strValueOf, "path")) {
                return new PathInterpolator(o3.f.createPathFromPathData(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static f0 resolveThemeSpringForce(Context context, int i10, int i11) {
        TypedValue typedValueResolve = ug.c.resolve(context, i10);
        int[] iArr = uf.a.C;
        TypedArray typedArrayObtainStyledAttributes = typedValueResolve == null ? context.obtainStyledAttributes(null, iArr, 0, i11) : context.obtainStyledAttributes(typedValueResolve.resourceId, iArr);
        f0 f0Var = new f0();
        try {
            float f10 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f10 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f11 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            f0Var.setStiffness(f10);
            f0Var.setDampingRatio(f11);
            return f0Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
