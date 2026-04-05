package ug;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class d {
    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = l.a.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateList;
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawable = l.a.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawable;
    }

    public static float getFontScale(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static g getTextAppearance(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new g(context, resourceId);
    }

    public static int getUnscaledLineHeight(Context context, int i10, int i11) throws Resources.NotFoundException {
        if (i10 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, uf.a.D);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
            if (!value) {
                value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i11;
    }

    public static int getUnscaledTextSize(Context context, int i10, int i11) throws Resources.NotFoundException {
        if (i10 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.a.f70001y);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i11;
    }

    public static boolean isFontScaleAtLeast1_3(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean isFontScaleAtLeast2_0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static ColorStateList getColorStateList(Context context, n3 n3Var, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        return (!n3Var.hasValue(i10) || (resourceId = n3Var.getResourceId(i10, 0)) == 0 || (colorStateList = l.a.getColorStateList(context, resourceId)) == null) ? n3Var.getColorStateList(i10) : colorStateList;
    }
}
