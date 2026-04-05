package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C3478u9;
import com.ironsource.InterfaceC3495v9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InterstitialAd implements InterfaceC3495v9 {

    /* renamed from: a, reason: collision with root package name */
    private final C3478u9 f50611a;

    /* renamed from: b, reason: collision with root package name */
    private InterstitialAdListener f50612b;

    public InterstitialAd(C3478u9 interstitialAdInternal) {
        e0.checkNotNullParameter(interstitialAdInternal, "interstitialAdInternal");
        this.f50611a = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    public final InterstitialAdInfo getAdInfo() {
        return this.f50611a.b();
    }

    public final InterstitialAdListener getListener() {
        return this.f50612b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f50611a.d();
    }

    @Override // com.ironsource.InterfaceC3495v9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f50612b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC3495v9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f50612b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC3495v9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f50612b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC3495v9
    public void onAdInstanceDidFailedToShow(IronSourceError error) {
        e0.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f50612b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC3495v9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f50612b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(InterstitialAdListener interstitialAdListener) {
        this.f50612b = interstitialAdListener;
    }

    public final void show(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        IronLog.API.info();
        this.f50611a.a(activity);
    }

    @Override // com.ironsource.InterfaceC3495v9
    public void onAdInstanceDidReward(String str, int i10) {
    }
}
