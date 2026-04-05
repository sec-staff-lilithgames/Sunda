package com.vungle.ads.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WatermarkView extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkView(Context context, String watermark) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(watermark, "watermark");
        byte[] overlayBytes = Base64.decode(watermark, 0);
        e0.checkNotNullExpressionValue(overlayBytes, "overlayBytes");
        Bitmap overlayBm = BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length);
        e0.checkNotNullExpressionValue(overlayBm, "overlayBm");
        Resources resources = context.getResources();
        e0.checkNotNullExpressionValue(resources, "context.resources");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, overlayBm);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
