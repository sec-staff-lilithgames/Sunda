package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.B3;
import com.ironsource.C3286ja;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.unity3d.mediation.LevelPlay;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class w implements AdapterAPSDataInterface, AdapterBaseInterface, AdapterConsentInterface, AdapterDebugInterface, AdapterMetaDataInterface, AdapterSettingsInterface, BannerSmashListener, B3, InterstitialSmashListener, NativeAdSmashListener, RewardedVideoSmashListener, AdapterNetworkDataInterface {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractAdapter f37829a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<NetworkInitializationListener> f37830b;

    public w(AbstractAdapter abstractAdapter) {
        this.f37829a = abstractAdapter;
    }

    public void a() {
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (TextUtils.isEmpty(pluginType)) {
            return;
        }
        this.f37829a.setPluginData(pluginType);
    }

    @Override // com.ironsource.B3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) throws JSONException {
        JSONObject jSONObjectA = C3286ja.a(adData.getConfiguration());
        JSONObject jSONObjectA2 = C3286ja.a(adData.getAdUnitData());
        IronSource.a aVar = (IronSource.a) adData.getAdUnitData().get("adUnit");
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f37829a.collectRewardedVideoBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (aVar == IronSource.a.f37252c) {
            this.f37829a.collectInterstitialBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.f37829a.collectBannerBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            this.f37829a.collectNativeAdBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        IronLog.INTERNAL.error("ad unit not supported - " + aVar);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return this.f37829a.getVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return this.f37829a.getCoreSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) throws JSONException {
        this.f37830b = new WeakReference<>(networkInitializationListener);
        String str = (String) adData.getAdUnitData().get("userId");
        IronSource.a aVar = (IronSource.a) adData.getAdUnitData().get("adUnit");
        a();
        JSONObject jSONObjectA = C3286ja.a(adData.getConfiguration());
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f37829a.initRewardedVideoWithCallback("", str, jSONObjectA, this);
            return;
        }
        if (aVar == IronSource.a.f37252c) {
            Integer num = adData.getInt("instanceType");
            if (num == null || num.intValue() != 1) {
                this.f37829a.initInterstitialForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f37829a.initInterstitial("", str, jSONObjectA, this);
                return;
            }
        }
        if (aVar == IronSource.a.BANNER) {
            Integer num2 = adData.getInt("instanceType");
            if (num2 == null || num2.intValue() != 1) {
                this.f37829a.initBannerForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f37829a.initBanners("", str, jSONObjectA, this);
                return;
            }
        }
        if (aVar != IronSource.a.NATIVE_AD) {
            IronLog.INTERNAL.error("ad unit not supported - " + aVar);
            return;
        }
        Integer num3 = adData.getInt("instanceType");
        if (num3 == null || num3.intValue() != 1) {
            this.f37829a.initNativeAdForBidding("", str, jSONObjectA, this);
        } else {
            this.f37829a.initNativeAds("", str, jSONObjectA, this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return this.f37829a.isUsingActivityBeforeImpression(adFormat);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f37830b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public void setAPSData(LevelPlay.AdFormat adFormat, JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterface = this.f37829a;
        if (bannerAdapterInterface instanceof SetAPSInterface) {
            ((SetAPSInterface) bannerAdapterInterface).setAPSData(adFormat, jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
        this.f37829a.setAdapterDebug(Boolean.valueOf(z10));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z10) {
        this.f37829a.setConsent(z10);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        this.f37829a.setMetaData(str, list);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(AdapterNetworkData adapterNetworkData) {
        this.f37829a.setNetworkData(adapterNetworkData);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
    }
}
