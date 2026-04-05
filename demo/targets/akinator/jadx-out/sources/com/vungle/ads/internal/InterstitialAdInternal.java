package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InterstitialAdInternal extends FullscreenAdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdInternal(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        e0.checkNotNullParameter(placement, "placement");
        return placement.isInterstitial() || placement.isAppOpen();
    }
}
