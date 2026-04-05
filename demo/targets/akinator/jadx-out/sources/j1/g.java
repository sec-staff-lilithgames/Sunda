package j1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final y0 m4757ActualImageBitmapx__hDU(int i10, int i11, int i12, boolean z10, k1.g colorSpace) {
        Bitmap bitmapCreateBitmap;
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap.Config configM4758toBitmapConfig1JJdX4A = m4758toBitmapConfig1JJdX4A(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = v.m5018createBitmapx__hDU$ui_graphics_release(i10, i11, i12, z10, colorSpace);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configM4758toBitmapConfig1JJdX4A);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new f(bitmapCreateBitmap);
    }

    public static final Bitmap asAndroidBitmap(y0 y0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<this>");
        if (y0Var instanceof f) {
            return ((f) y0Var).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final y0 asImageBitmap(Bitmap bitmap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bitmap, "<this>");
        return new f(bitmap);
    }

    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m4758toBitmapConfig1JJdX4A(int i10) {
        z0 z0Var = a1.f68819b;
        if (a1.m4657equalsimpl0(i10, z0Var.m5083getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (a1.m4657equalsimpl0(i10, z0Var.m5082getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (a1.m4657equalsimpl0(i10, z0Var.m5086getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || !a1.m4657equalsimpl0(i10, z0Var.m5084getF16_sVssgQ())) ? (i11 < 26 || !a1.m4657equalsimpl0(i10, z0Var.m5085getGpu_sVssgQ())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return a1.f68819b.m5082getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return a1.f68819b.m5086getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return a1.f68819b.m5083getArgb8888_sVssgQ();
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || config != Bitmap.Config.RGBA_F16) ? (i10 < 26 || config != Bitmap.Config.HARDWARE) ? a1.f68819b.m5083getArgb8888_sVssgQ() : a1.f68819b.m5085getGpu_sVssgQ() : a1.f68819b.m5084getF16_sVssgQ();
    }
}
