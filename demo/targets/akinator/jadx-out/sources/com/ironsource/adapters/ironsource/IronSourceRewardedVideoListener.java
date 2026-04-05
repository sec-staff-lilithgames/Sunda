package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.a;
import com.ironsource.Lc;
import com.ironsource.M9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class IronSourceRewardedVideoListener implements Lc {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    boolean mIsRvDemandOnly;
    RewardedVideoSmashListener mListener;

    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z10) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z10;
    }

    @Override // com.ironsource.Lc
    public void onInterstitialAdRewarded(String str, int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb2 = new StringBuilder();
        a.B(sb2, this.mDemandSourceName, " rewardedVideoListener demandSourceId=", str, " amount=");
        sb2.append(i10);
        ironLog.verbose(sb2.toString());
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClick() {
        a.A(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialClose() {
        a.A(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitFailed(String str) {
        a.A(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Lc
    public void onInterstitialInitSuccess() {
        a.A(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.Lc
    public void onInterstitialLoadSuccess(M9 m9) {
        a.A(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.Lc
    public void onInterstitialOpen() {
        a.A(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.ironsource.Lc
    public void onInterstitialShowSuccess() {
        a.A(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }
}
