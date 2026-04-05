package com.ironsource.mediationsdk;

import bp.oM.DwaEpyvxz;
import com.ironsource.C3422r4;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class AbstractAdapter implements RewardedVideoAdapterInterface, InterstitialAdapterInterface, BannerAdapterInterface, NativeAdAdapterInterface, AdapterNetworkDataInterface {
    private static Boolean mAdapterDebug;
    private String mPluginType;
    private final String mProviderName;
    private String mProviderNetworkKey;
    private final Map<LevelPlay.AdFormat, AdUnitAdapterInterface> mAdUnitAdapters = new HashMap();
    protected LoadWhileShowSupportState mLWSSupportState = LoadWhileShowSupportState.NONE;
    protected LoadWhileShowSupportState mBannerLoadWhileShowSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;

    public AbstractAdapter(String str) {
        this.mProviderName = str;
    }

    private BannerAdapterInterface a() {
        return (BannerAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.BANNER);
    }

    private InterstitialAdapterInterface b() {
        return (InterstitialAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.INTERSTITIAL);
    }

    private NativeAdAdapterInterface c() {
        return (NativeAdAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.NATIVE_AD);
    }

    private RewardedVideoAdapterInterface d() {
        return (RewardedVideoAdapterInterface) this.mAdUnitAdapters.get(LevelPlay.AdFormat.REWARDED);
    }

    public static void postBackgroundThread(Runnable runnable) {
        IronSourceThreadManager.INSTANCE.postAdapterBackgroundTask(runnable);
    }

    public static void postOnUIThread(Runnable runnable) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            bannerAdapterInterfaceA.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
        if (interstitialAdapterInterfaceB != null) {
            interstitialAdapterInterfaceB.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceC = c();
        if (nativeAdAdapterInterfaceC != null) {
            nativeAdAdapterInterfaceC.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            rewardedVideoAdapterInterfaceD.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyBanner(JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            bannerAdapterInterfaceA.destroyBanner(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(JSONObject jSONObject) {
        InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
        if (interstitialAdapterInterfaceB != null) {
            interstitialAdapterInterfaceB.destroyInterstitialAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject jSONObject) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceC = c();
        if (nativeAdAdapterInterfaceC != null) {
            nativeAdAdapterInterfaceC.destroyNativeAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(JSONObject jSONObject) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            rewardedVideoAdapterInterfaceD.destroyRewardedVideoAd(jSONObject);
        }
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i10) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            return bannerAdapterInterfaceA.getAdaptiveHeight(i10);
        }
        return -1;
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            return bannerAdapterInterfaceA.getBannerBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public LoadWhileShowSupportState getBannerLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mBannerLoadWhileShowSupportState;
    }

    public abstract String getCoreSDKVersion();

    public String getDynamicUserId() {
        return r.m().l();
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
        if (interstitialAdapterInterfaceB != null) {
            return interstitialAdapterInterfaceB.getInterstitialBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mLWSSupportState;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceC = c();
        if (nativeAdAdapterInterfaceC != null) {
            return nativeAdAdapterInterfaceC.getNativeAdBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getProviderName() {
        return this.mProviderName;
    }

    public String getProviderNetworkKey() {
        return this.mProviderNetworkKey;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            return rewardedVideoAdapterInterfaceD.getRewardedVideoBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public abstract String getVersion();

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
            try {
                if (rewardedVideoAdapterInterfaceD != null) {
                    rewardedVideoAdapterInterfaceD.initAndLoadRewardedVideo(str, str2, jSONObject, jSONObject2, rewardedVideoSmashListener);
                } else if (rewardedVideoSmashListener != null) {
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                }
            } catch (Error e10) {
                e = e10;
                Error error = e;
                C3422r4.d().a(error);
                IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + error.getMessage());
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        } catch (Error e11) {
            e = e11;
        }
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        try {
            BannerAdapterInterface bannerAdapterInterfaceA = a();
            if (bannerAdapterInterfaceA != null) {
                bannerAdapterInterfaceA.initBannerForBidding(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e10.getMessage());
            StringBuilder sb2 = new StringBuilder("error - ");
            sb2.append(e10.getMessage());
            bannerSmashListener.onBannerInitFailed(new IronSourceError(510, sb2.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        try {
            BannerAdapterInterface bannerAdapterInterfaceA = a();
            if (bannerAdapterInterfaceA != null) {
                bannerAdapterInterfaceA.initBanners(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e10.getMessage());
            StringBuilder sb2 = new StringBuilder("error - ");
            sb2.append(e10.getMessage());
            bannerSmashListener.onBannerInitFailed(new IronSourceError(510, sb2.toString()));
        }
    }

    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        try {
            InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
            if (interstitialAdapterInterfaceB != null) {
                interstitialAdapterInterfaceB.initInterstitial(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e10.getMessage());
            StringBuilder sb2 = new StringBuilder("error - ");
            sb2.append(e10.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, sb2.toString()));
        }
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        try {
            InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
            if (interstitialAdapterInterfaceB != null) {
                interstitialAdapterInterfaceB.initInterstitialForBidding(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e10.getMessage());
            StringBuilder sb2 = new StringBuilder("error - ");
            sb2.append(e10.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(510, sb2.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceC = c();
        if (nativeAdAdapterInterfaceC != null) {
            nativeAdAdapterInterfaceC.initNativeAdForBidding(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(String str, String str2, JSONObject jSONObject, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceC = c();
        if (nativeAdAdapterInterfaceC != null) {
            nativeAdAdapterInterfaceC.initNativeAds(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            rewardedVideoAdapterInterfaceD.initRewardedVideoForDemandOnly(str, str2, jSONObject, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
            if (rewardedVideoAdapterInterfaceD != null) {
                rewardedVideoAdapterInterfaceD.initRewardedVideoWithCallback(str, str2, jSONObject, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(510, "method not implemented"));
            }
        } catch (Error e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e10.getMessage());
            StringBuilder sb2 = new StringBuilder("error - ");
            sb2.append(e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(510, sb2.toString()));
        }
    }

    public boolean isAdaptersDebugEnabled() {
        Boolean bool = mAdapterDebug;
        return bool != null && bool.booleanValue();
    }

    public boolean isInterstitialReady(JSONObject jSONObject) {
        InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
        if (interstitialAdapterInterfaceB != null) {
            return interstitialAdapterInterfaceB.isInterstitialReady(jSONObject);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            return rewardedVideoAdapterInterfaceD.isRewardedVideoAvailable(jSONObject);
        }
        return false;
    }

    public boolean isUsingActivityBeforeImpression(LevelPlay.AdFormat adFormat) {
        return true;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            bannerAdapterInterfaceA.loadBanner(jSONObject, jSONObject2, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            bannerAdapterInterfaceA.loadBannerForBidding(jSONObject, jSONObject2, str, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            bannerAdapterInterfaceA.loadBannerForDemandOnlyForBidding(jSONObject, str, iSDemandOnlyBannerLayout, bannerSmashListener);
        }
    }

    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
        if (interstitialAdapterInterfaceB != null) {
            interstitialAdapterInterfaceB.loadInterstitial(jSONObject, jSONObject2, interstitialSmashListener);
        }
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
        if (interstitialAdapterInterfaceB != null) {
            interstitialAdapterInterfaceB.loadInterstitialForBidding(jSONObject, jSONObject2, str, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(JSONObject jSONObject, JSONObject jSONObject2, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceC = c();
        if (nativeAdAdapterInterfaceC != null) {
            nativeAdAdapterInterfaceC.loadNativeAd(jSONObject, jSONObject2, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, NativeAdSmashListener nativeAdSmashListener) {
        NativeAdAdapterInterface nativeAdAdapterInterfaceC = c();
        if (nativeAdAdapterInterfaceC != null) {
            nativeAdAdapterInterfaceC.loadNativeAdForBidding(jSONObject, jSONObject2, str, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            rewardedVideoAdapterInterfaceD.loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            rewardedVideoAdapterInterfaceD.loadRewardedVideoForBidding(jSONObject, jSONObject2, str, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            bannerAdapterInterfaceA.onBannerViewBound(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterfaceA = a();
        if (bannerAdapterInterfaceA != null) {
            bannerAdapterInterfaceA.onBannerViewWillBind(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        Iterator<AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(str);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Iterator<AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
    }

    public void setAdapterDebug(Boolean bool) {
        mAdapterDebug = bool;
    }

    public void setBannerAdapter(BannerAdapterInterface bannerAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.BANNER, bannerAdapterInterface);
    }

    public void setConsent(boolean z10) {
    }

    public void setInterstitialAdapter(InterstitialAdapterInterface interstitialAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.INTERSTITIAL, interstitialAdapterInterface);
    }

    public void setMetaData(String str, List<String> list) {
    }

    public void setNativeAdAdapter(NativeAdAdapterInterface nativeAdAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.NATIVE_AD, nativeAdAdapterInterface);
    }

    public void setNewConsent(boolean z10) {
        setConsent(z10);
    }

    public void setPluginData(String str) {
        this.mPluginType = str;
    }

    public void setProviderNetworkKey(String str) {
        this.mProviderNetworkKey = str;
    }

    public void setRewardedVideoAdapter(RewardedVideoAdapterInterface rewardedVideoAdapterInterface) {
        this.mAdUnitAdapters.put(LevelPlay.AdFormat.REWARDED, rewardedVideoAdapterInterface);
    }

    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        InterstitialAdapterInterface interstitialAdapterInterfaceB = b();
        if (interstitialAdapterInterfaceB != null) {
            interstitialAdapterInterfaceB.showInterstitial(jSONObject, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoAdapterInterface rewardedVideoAdapterInterfaceD = d();
        if (rewardedVideoAdapterInterfaceD != null) {
            rewardedVideoAdapterInterfaceD.showRewardedVideo(jSONObject, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(AdapterNetworkData adapterNetworkData) {
        IronLog.INTERNAL.verbose("setNetworkData not implemented | adapter=" + getClass().getSimpleName() + DwaEpyvxz.INLPPfrfU + adapterNetworkData);
    }
}
