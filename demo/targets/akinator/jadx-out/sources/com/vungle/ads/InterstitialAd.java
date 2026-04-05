package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.InterstitialAdInternal;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InterstitialAd extends BaseFullscreenAd {
    public /* synthetic */ InterstitialAd(Context context, String str, AdConfig adConfig, int i10, u uVar) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAd(Context context, String placementId, AdConfig adConfig) {
        super(context, placementId, adConfig);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public InterstitialAdInternal constructAdInternal$vungle_ads_release(Context context) {
        e0.checkNotNullParameter(context, "context");
        return new InterstitialAdInternal(context);
    }
}
