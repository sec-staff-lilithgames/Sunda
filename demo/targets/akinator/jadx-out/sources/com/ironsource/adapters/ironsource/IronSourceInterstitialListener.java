package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.a;
import com.ironsource.Lc;
import com.ironsource.M9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class IronSourceInterstitialListener implements Lc {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    public IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.ironsource.Lc
    public void onInterstitialAdRewarded(String str, int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb2 = new StringBuilder();
        a.B(sb2, this.mDemandSourceName, " interstitialListener demandSourceId=", str, " amount=");
        sb2.append(i10);
        ironLog.verbose(sb2.toString());
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClick() {
        a.A(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClose() {
        a.A(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitFailed(String str) {
        a.A(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitSuccess() {
        a.A(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadSuccess(M9 m9) {
        a.A(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialOpen() {
        a.A(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowSuccess() {
        a.A(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
