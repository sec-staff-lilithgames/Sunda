package com.inmobi.media;

import android.graphics.Bitmap;
import android.util.Log;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class X1 implements InterfaceC2946q0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f32481a;

    public X1(AdConfig.AdQualityConfig adQualityConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f32481a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bitmap, "bitmap");
        double resizedPercentage = (this.f32481a.getResizedPercentage() / 100.0d) * bitmap.getWidth();
        double resizedPercentage2 = (this.f32481a.getResizedPercentage() / 100.0d) * bitmap.getHeight();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f32481a.getMaxImageSize()) {
            return bitmapCreateScaledBitmap;
        }
        StringBuilder sb2 = new StringBuilder("resize - original - ");
        sb2.append(resizedPercentage);
        String str = "  - ";
        sb2.append("  - ");
        sb2.append(resizedPercentage2);
        sb2.append(" - size - ");
        sb2.append(length);
        String message = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullParameter("BaseScreenShotProcess", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Log.i("BaseScreenShotProcess", message);
        while (length > this.f32481a.getMaxImageSize()) {
            String str2 = str;
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            double dSqrt = Math.sqrt(this.f32481a.getMaxImageSize() / length);
            resizedPercentage *= dSqrt;
            resizedPercentage2 *= dSqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return bitmapCreateScaledBitmap;
            }
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream2.reset();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
            length = byteArrayOutputStream2.toByteArray().length;
            str = str2;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        String message2 = "resize - " + resizedPercentage + str + resizedPercentage2 + " - " + byteArrayOutputStream.size();
        kotlin.jvm.internal.e0.checkNotNullParameter("BaseScreenShotProcess", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message2, "message");
        Log.i("BaseScreenShotProcess", message2);
        return bitmapCreateScaledBitmap;
    }
}
