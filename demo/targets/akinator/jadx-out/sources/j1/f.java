package j1;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f68863a;

    public f(Bitmap bitmap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bitmap, "bitmap");
        this.f68863a = bitmap;
    }

    public final Bitmap getBitmap$ui_graphics_release() {
        return this.f68863a;
    }

    @Override // j1.y0
    public k1.g getColorSpace() {
        return Build.VERSION.SDK_INT >= 26 ? v.composeColorSpace$ui_graphics_release(this.f68863a) : k1.k.f70039a.getSrgb();
    }

    @Override // j1.y0
    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public int mo4754getConfig_sVssgQ() {
        Bitmap.Config config = this.f68863a.getConfig();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(config, "bitmap.config");
        return g.toImageConfig(config);
    }

    @Override // j1.y0
    public boolean getHasAlpha() {
        return this.f68863a.hasAlpha();
    }

    @Override // j1.y0
    public int getHeight() {
        return this.f68863a.getHeight();
    }

    @Override // j1.y0
    public int getWidth() {
        return this.f68863a.getWidth();
    }

    @Override // j1.y0
    public void prepareToDraw() {
        this.f68863a.prepareToDraw();
    }

    @Override // j1.y0
    public void readPixels(int[] buffer, int i10, int i11, int i12, int i13, int i14, int i15) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        Bitmap bitmapAsAndroidBitmap = g.asAndroidBitmap(this);
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 26 && bitmapAsAndroidBitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapAsAndroidBitmap = bitmapAsAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
            z10 = true;
        }
        Bitmap bitmap = bitmapAsAndroidBitmap;
        boolean z11 = z10;
        bitmap.getPixels(buffer, i14, i15, i10, i11, i12, i13);
        if (z11) {
            bitmap.recycle();
        }
    }
}
