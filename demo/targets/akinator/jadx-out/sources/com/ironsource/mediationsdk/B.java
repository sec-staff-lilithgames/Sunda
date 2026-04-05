package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class B extends AbstractC3345a<RewardedVideoAdListener> implements RewardedVideoSmashListener {
    public B(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.REWARDED_VIDEO, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f37258a.loadRewardedVideoForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f37258a.loadRewardedVideo(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public boolean b(JSONObject jSONObject) {
        return this.f37258a.isRewardedVideoAvailable(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void e(JSONObject jSONObject) {
        this.f37258a.showRewardedVideo(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdEnded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdRewarded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdVisible();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
        IronLog.INTERNAL.verbose(a("available = " + z10));
        if (this.f37259b.get() != null) {
            if (z10) {
                ((RewardedVideoAdListener) this.f37259b.get()).onAdLoadSuccess();
            } else {
                ((RewardedVideoAdListener) this.f37259b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, "");
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdLoadFailed(b(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdLoadSuccess();
        }
    }

    public boolean b(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1058;
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public IronSource.a b() {
        return IronSource.a.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((RewardedVideoAdListener) this.f37259b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f37258a.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void a(JSONObject jSONObject) {
        this.f37258a.destroyRewardedVideoAd(jSONObject);
    }

    private boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1057;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }
}
