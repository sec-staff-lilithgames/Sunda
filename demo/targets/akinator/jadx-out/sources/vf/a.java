package vf;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f89240a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final y4.b f89241b = new y4.b();

    /* renamed from: c, reason: collision with root package name */
    public static final y4.a f89242c = new y4.a();

    /* renamed from: d, reason: collision with root package name */
    public static final y4.c f89243d = new y4.c();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f89244e = new DecelerateInterpolator();

    public static float lerp(float f10, float f11, float f12) {
        return o2.a(f11, f10, f12, f10);
    }

    public static int lerp(int i10, int i11, float f10) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }

    public static float lerp(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : lerp(f10, f11, (f14 - f12) / (f13 - f12));
    }
}
