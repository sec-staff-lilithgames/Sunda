package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f82117a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f82118b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f82119c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f82120d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f82121e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f82122f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f82123g = new int[1];

    public static void checkAppCompatTheme(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(k.a.f69986j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList createDisabledStateList(int i10, int i11) {
        return new ColorStateList(new int[][]{f82118b, f82122f}, new int[]{i11, i10});
    }

    public static int getDisabledThemeAttrColor(Context context, int i10) {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i10);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(f82118b, themeAttrColorStateList.getDefaultColor());
        }
        ThreadLocal threadLocal = f82117a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return o3.b.setAlphaComponent(getThemeAttrColor(context, i10), Math.round(Color.alpha(r4) * f10));
    }

    public static int getThemeAttrColor(Context context, int i10) {
        int[] iArr = f82123g;
        iArr[0] = i10;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return n3VarObtainStyledAttributes.getColor(0, 0);
        } finally {
            n3VarObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList getThemeAttrColorStateList(Context context, int i10) {
        int[] iArr = f82123g;
        iArr[0] = i10;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return n3VarObtainStyledAttributes.getColorStateList(0);
        } finally {
            n3VarObtainStyledAttributes.recycle();
        }
    }
}
