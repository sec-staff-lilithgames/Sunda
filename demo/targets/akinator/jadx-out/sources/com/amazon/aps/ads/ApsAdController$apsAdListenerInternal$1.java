package com.amazon.aps.ads;

import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.ApsUtils;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsAdController$apsAdListenerInternal$1 implements ApsAdListener {
    final /* synthetic */ ApsAdController this$0;

    public ApsAdController$apsAdListenerInternal$1(ApsAdController apsAdController) {
        this.this$0 = apsAdController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onAdClicked$lambda$2(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdClicked called");
        apsAdController.apsAdListener.onAdClicked(apsAd);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onAdClosed$lambda$7(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdClosed called");
        apsAdController.apsAdListener.onAdClosed(apsAd);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onAdError$lambda$5(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdError called");
        apsAdController.apsAdListener.onAdError(apsAd);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onAdFailedToLoad$lambda$1(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdFailedToLoad called");
        apsAdController.apsAdListener.onAdFailedToLoad(apsAd);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onAdLoaded$lambda$0(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdLoaded called");
        apsAdController.apsAdListener.onAdLoaded(apsAd);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onAdOpen$lambda$6(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdOpen called");
        apsAdController.apsAdListener.onAdOpen(apsAd);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onImpressionFired$lambda$4(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onImpressionFired called");
        if (apsAd != null && (apsAd.getApsAdFormat() == ApsAdFormat.INTERSTITIAL || apsAd.getApsAdFormat() == ApsAdFormat.REWARDED_VIDEO)) {
            ApsUtils.Companion.fireAAXImpressionPixel(apsAd);
        }
        apsAdController.apsAdListener.onImpressionFired(apsAd);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onVideoCompleted$lambda$8(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onVideoCompleted called");
        apsAdController.apsAdListener.onVideoCompleted(apsAd);
        return x0.f87415a;
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdClicked(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 7));
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdClosed(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 1));
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdError(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 3));
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdFailedToLoad(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 6));
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdLoaded(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 0));
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdOpen(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 5));
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onImpressionFired(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 4));
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onVideoCompleted(ApsAd apsAd) {
        ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new a(apsAdController, apsAd, 2));
    }
}
