package ug;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class c {
    public static TypedValue resolve(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(Context context, int i10, boolean z10) {
        TypedValue typedValueResolve = resolve(context, i10);
        return (typedValueResolve == null || typedValueResolve.type != 18) ? z10 : typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(Context context, int i10, String str) {
        return resolveOrThrow(context, i10, str) != 0;
    }

    public static int resolveDimension(Context context, int i10, int i11) {
        TypedValue typedValueResolve = resolve(context, i10);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i11) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveInteger(Context context, int i10, int i11) {
        TypedValue typedValueResolve = resolve(context, i10);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i11 : typedValueResolve.data;
    }

    public static int resolveMinimumAccessibleTouchTarget(Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(Context context, int i10, String str) {
        return resolveTypedValueOrThrow(context, i10, str).data;
    }

    public static TypedValue resolveTypedValueOrThrow(View view, int i10) {
        return resolveTypedValueOrThrow(view.getContext(), i10, view.getClass().getCanonicalName());
    }

    public static int resolveOrThrow(View view, int i10) {
        return resolveTypedValueOrThrow(view, i10).data;
    }

    public static TypedValue resolveTypedValueOrThrow(Context context, int i10, String str) {
        TypedValue typedValueResolve = resolve(context, i10);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }
}
