package q;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f82170a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f82171b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f82172c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f82170a);
        } else {
            drawable.setState(f82171b);
        }
        drawable.setState(state);
    }

    @Deprecated
    public static boolean canSafelyMutateDrawable(Drawable drawable) {
        return true;
    }

    public static Rect getOpticalBounds(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsA = k1.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        Drawable drawableUnwrap = p3.a.unwrap(drawable);
        if (i10 >= 29) {
            boolean z10 = j1.f82131a;
        } else if (j1.f82131a) {
            try {
                Object objInvoke = j1.f82132b.invoke(drawableUnwrap, null);
                if (objInvoke != null) {
                    return new Rect(j1.f82133c.getInt(objInvoke), j1.f82134d.getInt(objInvoke), j1.f82135e.getInt(objInvoke), j1.f82136f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f82172c;
    }

    public static PorterDuff.Mode parseTintMode(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
