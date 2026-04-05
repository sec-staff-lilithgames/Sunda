package y;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f93942a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        return (float) (((1.0d - f93942a) * f11) + f10);
    }

    public static float b(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f93942a) * f11) + (f10 * 1.5f));
    }
}
