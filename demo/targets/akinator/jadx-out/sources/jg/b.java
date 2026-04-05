package jg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import kg.d;
import ug.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class b {
    public static int a(int i10, int i11) {
        d dVarFromInt = d.fromInt(i10);
        dVarFromInt.setTone(i11);
        return dVarFromInt.toInt();
    }

    public static int compositeARGBWithAlpha(int i10, int i11) {
        return o3.b.setAlphaComponent(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static int getColor(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueResolveTypedValueOrThrow = c.resolveTypedValueOrThrow(view, i10);
        int i11 = typedValueResolveTypedValueOrThrow.resourceId;
        return i11 != 0 ? m3.a.getColor(context, i11) : typedValueResolveTypedValueOrThrow.data;
    }

    public static Integer getColorOrNull(Context context, int i10) {
        TypedValue typedValueResolve = c.resolve(context, i10);
        if (typedValueResolve == null) {
            return null;
        }
        int i11 = typedValueResolve.resourceId;
        return Integer.valueOf(i11 != 0 ? m3.a.getColor(context, i11) : typedValueResolve.data);
    }

    public static a getColorRoles(int i10, boolean z10) {
        return z10 ? new a(a(i10, 40), a(i10, 100), a(i10, 90), a(i10, 10)) : new a(a(i10, 80), a(i10, 20), a(i10, 30), a(i10, 90));
    }

    public static ColorStateList getColorStateList(Context context, int i10, ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        TypedValue typedValueResolve = c.resolve(context, i10);
        if (typedValueResolve != null) {
            int i11 = typedValueResolve.resourceId;
            colorStateList2 = i11 != 0 ? m3.a.getColorStateList(context, i11) : ColorStateList.valueOf(typedValueResolve.data);
        } else {
            colorStateList2 = null;
        }
        return colorStateList2 == null ? colorStateList : colorStateList2;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int i10) {
        TypedValue typedValueResolve = c.resolve(context, i10);
        if (typedValueResolve == null) {
            return null;
        }
        int i11 = typedValueResolve.resourceId;
        if (i11 != 0) {
            return m3.a.getColorStateList(context, i11);
        }
        int i12 = typedValueResolve.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    public static int getSurfaceContainerFromSeed(Context context, int i10) {
        d dVarFromInt = d.fromInt(a(i10, c.resolveBoolean(context, R.attr.isLightTheme, true) ? 94 : 12));
        dVarFromInt.setChroma(6);
        return dVarFromInt.toInt();
    }

    public static int getSurfaceContainerHighFromSeed(Context context, int i10) {
        d dVarFromInt = d.fromInt(a(i10, c.resolveBoolean(context, R.attr.isLightTheme, true) ? 92 : 17));
        dVarFromInt.setChroma(6);
        return dVarFromInt.toInt();
    }

    public static int harmonize(int i10, int i11) {
        return kg.a.harmonize(i10, i11);
    }

    public static int harmonizeWithPrimary(Context context, int i10) {
        return harmonize(i10, getColor(context, R.attr.colorPrimary, b.class.getCanonicalName()));
    }

    public static boolean isColorLight(int i10) {
        return i10 != 0 && o3.b.calculateLuminance(i10) > 0.5d;
    }

    public static int layer(View view, int i10, int i11) {
        return layer(view, i10, i11, 1.0f);
    }

    public static int layer(View view, int i10, int i11, float f10) {
        return layer(getColor(view, i10), getColor(view, i11), f10);
    }

    public static int layer(int i10, int i11, float f10) {
        return layer(i10, o3.b.setAlphaComponent(i11, Math.round(Color.alpha(i11) * f10)));
    }

    public static int getColor(Context context, int i10, String str) {
        TypedValue typedValueResolveTypedValueOrThrow = c.resolveTypedValueOrThrow(context, i10, str);
        int i11 = typedValueResolveTypedValueOrThrow.resourceId;
        if (i11 != 0) {
            return m3.a.getColor(context, i11);
        }
        return typedValueResolveTypedValueOrThrow.data;
    }

    public static int layer(int i10, int i11) {
        return o3.b.compositeColors(i11, i10);
    }

    public static int getColor(View view, int i10, int i11) {
        return getColor(view.getContext(), i10, i11);
    }

    public static int getColor(Context context, int i10, int i11) {
        Integer colorOrNull = getColorOrNull(context, i10);
        return colorOrNull != null ? colorOrNull.intValue() : i11;
    }

    public static a getColorRoles(Context context, int i10) {
        return getColorRoles(i10, c.resolveBoolean(context, R.attr.isLightTheme, true));
    }
}
