package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f82286b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static w f82287c;

    /* renamed from: a, reason: collision with root package name */
    public o2 f82288a;

    public static void a(Drawable drawable, k3 k3Var, int[] iArr) {
        PorterDuff.Mode mode = o2.f82190f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = k3Var.f82169d;
        if (!z10 && !k3Var.f82168c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z10 ? k3Var.f82166a : null;
        PorterDuff.Mode mode2 = k3Var.f82168c ? k3Var.f82167b : o2.f82190f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = o2.getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public static synchronized w get() {
        try {
            if (f82287c == null) {
                preload();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f82287c;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i10, PorterDuff.Mode mode) {
        return o2.getPorterDuffColorFilter(i10, mode);
    }

    public static synchronized void preload() {
        if (f82287c == null) {
            w wVar = new w();
            f82287c = wVar;
            wVar.f82288a = o2.get();
            f82287c.f82288a.setHooks(new v());
        }
    }

    public synchronized Drawable getDrawable(Context context, int i10) {
        return this.f82288a.getDrawable(context, i10);
    }

    public synchronized void onConfigurationChanged(Context context) {
        this.f82288a.onConfigurationChanged(context);
    }
}
