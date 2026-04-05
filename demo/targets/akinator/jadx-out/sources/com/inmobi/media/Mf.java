package com.inmobi.media;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Mf {
    public static final FrameLayout a(Context context, byte[] watermarkBytes, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermarkBytes, "watermarkBytes");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(watermarkBytes, 0, watermarkBytes.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(bitmapDrawable);
        frameLayout.setElevation(Float.MAX_VALUE);
        frameLayout.setAlpha(f10);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        return frameLayout;
    }
}
