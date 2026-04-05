package j1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {
    public static final k1.g composeColorSpace$ui_graphics_release(Bitmap bitmap) {
        k1.g gVarComposeColorSpace$ui_graphics_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (gVarComposeColorSpace$ui_graphics_release = composeColorSpace$ui_graphics_release(colorSpace)) == null) ? k1.k.f70039a.getSrgb() : gVarComposeColorSpace$ui_graphics_release;
    }

    /* renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
    public static final Bitmap m5018createBitmapx__hDU$ui_graphics_release(int i10, int i11, int i12, boolean z10, k1.g colorSpace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, g.m4758toBitmapConfig1JJdX4A(i12), z10, toFrameworkColorSpace$ui_graphics_release(colorSpace));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    public static final ColorSpace toFrameworkColorSpace$ui_graphics_release(k1.g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        k1.k kVar = k1.k.f70039a;
        ColorSpace colorSpace = ColorSpace.get(kotlin.jvm.internal.e0.areEqual(gVar, kVar.getSrgb()) ? ColorSpace.Named.SRGB : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getAces()) ? ColorSpace.Named.ACES : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getAcescg()) ? ColorSpace.Named.ACESCG : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getAdobeRgb()) ? ColorSpace.Named.ADOBE_RGB : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getBt2020()) ? ColorSpace.Named.BT2020 : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getBt709()) ? ColorSpace.Named.BT709 : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getCieLab()) ? ColorSpace.Named.CIE_LAB : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getCieXyz()) ? ColorSpace.Named.CIE_XYZ : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getDciP3()) ? ColorSpace.Named.DCI_P3 : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getDisplayP3()) ? ColorSpace.Named.DISPLAY_P3 : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getExtendedSrgb()) ? ColorSpace.Named.EXTENDED_SRGB : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getLinearExtendedSrgb()) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getLinearSrgb()) ? ColorSpace.Named.LINEAR_SRGB : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getNtsc1953()) ? ColorSpace.Named.NTSC_1953 : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getProPhotoRgb()) ? ColorSpace.Named.PRO_PHOTO_RGB : kotlin.jvm.internal.e0.areEqual(gVar, kVar.getSmpteC()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }

    public static final k1.g composeColorSpace$ui_graphics_release(ColorSpace colorSpace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "<this>");
        return kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB)) ? k1.k.f70039a.getSrgb() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.ACES)) ? k1.k.f70039a.getAces() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG)) ? k1.k.f70039a.getAcescg() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB)) ? k1.k.f70039a.getAdobeRgb() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020)) ? k1.k.f70039a.getBt2020() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.BT709)) ? k1.k.f70039a.getBt709() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB)) ? k1.k.f70039a.getCieLab() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ)) ? k1.k.f70039a.getCieXyz() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3)) ? k1.k.f70039a.getDciP3() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3)) ? k1.k.f70039a.getDisplayP3() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)) ? k1.k.f70039a.getExtendedSrgb() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB)) ? k1.k.f70039a.getLinearExtendedSrgb() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB)) ? k1.k.f70039a.getLinearSrgb() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953)) ? k1.k.f70039a.getNtsc1953() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB)) ? k1.k.f70039a.getProPhotoRgb() : kotlin.jvm.internal.e0.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? k1.k.f70039a.getSmpteC() : k1.k.f70039a.getSrgb();
    }
}
