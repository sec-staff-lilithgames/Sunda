package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2857kd extends X1 {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f33022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2857kd(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.e0.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f33022b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.InterfaceC2946q0
    public final Object a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        View adView = (View) this.f33022b.get();
        if (adView == null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("ScreenShotProcess", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("view reference lost. aborting...", PglCryptUtils.KEY_MESSAGE);
            Log.i("ScreenShotProcess", "view reference lost. aborting...");
            String message = "fail - time taken - " + (System.currentTimeMillis() - jCurrentTimeMillis);
            kotlin.jvm.internal.e0.checkNotNullParameter("ScreenShotProcess", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
            Log.i("ScreenShotProcess", message);
            return null;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "adView");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(adView.getMeasuredWidth(), adView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = adView.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        adView.draw(canvas);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        String message2 = "success - time taken - " + (System.currentTimeMillis() - jCurrentTimeMillis);
        kotlin.jvm.internal.e0.checkNotNullParameter("ScreenShotProcess", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message2, "message");
        Log.i("ScreenShotProcess", message2);
        return a(bitmapCreateBitmap);
    }
}
