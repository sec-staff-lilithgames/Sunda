package x3;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f91534a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f91534a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f91534a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static float getScaledHorizontalScrollFactor(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? androidx.appcompat.app.j0.Z(viewConfiguration) : a(viewConfiguration, context);
    }

    public static int getScaledHoverSlop(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? e4.q.q(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int getScaledMaximumFlingVelocity(Context context, ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        int dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.browser.customtabs.w.d(viewConfiguration, i10, i11, i12);
        }
        InputDevice device = InputDevice.getDevice(i10);
        if (device == null || device.getMotionRange(i11, i12) == null) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int identifier = (i12 == 4194304 && i11 == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
        Objects.requireNonNull(viewConfiguration);
        if (identifier == -1) {
            return viewConfiguration.getScaledMaximumFlingVelocity();
        }
        if (identifier == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) < 0) {
            return Integer.MIN_VALUE;
        }
        return dimensionPixelSize;
    }

    public static int getScaledMinimumFlingVelocity(Context context, ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        int dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.browser.customtabs.w.e(viewConfiguration, i10, i11, i12);
        }
        InputDevice device = InputDevice.getDevice(i10);
        if (device == null || device.getMotionRange(i11, i12) == null) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int identifier = (i12 == 4194304 && i11 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
        Objects.requireNonNull(viewConfiguration);
        if (identifier == -1) {
            return viewConfiguration.getScaledMinimumFlingVelocity();
        }
        if (identifier == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) < 0) {
            return Integer.MAX_VALUE;
        }
        return dimensionPixelSize;
    }

    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float getScaledVerticalScrollFactor(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? androidx.appcompat.app.j0.a0(viewConfiguration) : a(viewConfiguration, context);
    }

    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.E(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
