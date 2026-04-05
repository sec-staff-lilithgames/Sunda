package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class n0 {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, k0 mraidAdLoader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f mraidBaseAd, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l mraidFullscreenController, MraidActivity.a mraidAdActivity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidAdActivity, "mraidAdActivity");
        return new m0(context, watermark, mraidAdLoader, mraidBaseAd, mraidFullscreenController, mraidAdActivity);
    }
}
