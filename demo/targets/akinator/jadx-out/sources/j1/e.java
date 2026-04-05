package j1;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final n0 m4722actualColorMatrixColorFilterjHGOpc(float[] colorMatrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorMatrix, "colorMatrix");
        return new n0(new ColorMatrixColorFilter(colorMatrix));
    }

    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final n0 m4723actualLightingColorFilterOWjLjI(long j10, long j11) {
        return new n0(new LightingColorFilter(o0.m4894toArgb8_81llA(j10), o0.m4894toArgb8_81llA(j11)));
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final n0 m4724actualTintColorFilterxETnrds(long j10, int i10) {
        return new n0(Build.VERSION.SDK_INT >= 29 ? y.f69052a.m5081BlendModeColorFilterxETnrds(j10, i10) : new PorterDuffColorFilter(o0.m4894toArgb8_81llA(j10), b.m4670toPorterDuffModes9anfk8(i10)));
    }

    public static final ColorFilter asAndroidColorFilter(n0 n0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(n0Var, "<this>");
        return n0Var.getNativeColorFilter$ui_graphics_release();
    }

    public static final n0 asComposeColorFilter(ColorFilter colorFilter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorFilter, "<this>");
        return new n0(colorFilter);
    }
}
