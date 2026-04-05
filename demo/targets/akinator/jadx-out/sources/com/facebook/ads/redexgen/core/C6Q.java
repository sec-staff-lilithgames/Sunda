package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Q extends C2080fg {
    public InterfaceC1938dM A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C1937dL c1937dL, NativeAd nativeAd, C1597Ur c1597Ur) {
        C1751aK c1751aK = new C1751aK(c1937dL);
        MediaView mediaView = new MediaView(c1937dL);
        AdOptionsView adOptionsView = new AdOptionsView(c1937dL, nativeAd, nativeAdLayout);
        c1597Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c1937dL, nativeAd, c1597Ur, C1480Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c1751aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c1597Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1751aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
