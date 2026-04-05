package com.bytedance.sdk.openadsdk.my;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.reward.au;
import com.bytedance.sdk.openadsdk.component.reward.my;
import com.bytedance.sdk.openadsdk.component.wqx.jd;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz.qk;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.my.jpo.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.jpo.jpo.jpo jpoVar = new com.bytedance.sdk.openadsdk.jpo.jpo.jpo(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(new xyk("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.my.jpo.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sq.cm().oya() && tic.hx()) {
                            jpoVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(jpoVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iCm = va.cm(sq.jpo());
                            int iQk = va.qk(sq.jpo());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iCm || adSize.getWidth() <= 0 || height > iQk || height < 0) {
                                jpoVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            jpoVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            qk.jpo(sq.jpo()).jpo(adSlotBuild, 1, jpoVar);
                        }
                    }
                }, jpoVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.my.jpo.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final com.bytedance.sdk.openadsdk.jpo.wqx.jpo jpoVar = new com.bytedance.sdk.openadsdk.jpo.wqx.jpo(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(new xyk("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.my.jpo.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sq.cm().oya() && tic.hx()) {
                            jpoVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(jpoVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            jpoVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            my.jpo(sq.jpo()).jpo(adSlotBuild, new jd(jpoVar));
                        } catch (Throwable unused) {
                        }
                    }
                }, jpoVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.my.jpo.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.jpo.jd.my myVar = new com.bytedance.sdk.openadsdk.jpo.jd.my(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(new xyk("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.my.jpo.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sq.cm().oya() && tic.hx()) {
                            myVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(myVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            myVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.jd.jpo.jpo().jpo(sq.jpo(), adSlotBuild, myVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, myVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.my.jpo.1

            /* renamed from: jd, reason: collision with root package name */
            private int f21293jd;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.f21293jd = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.jpo.cm.jpo jpoVar = new com.bytedance.sdk.openadsdk.jpo.cm.jpo(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(new xyk("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.my.jpo.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!sq.cm().oya() && tic.hx()) {
                                jpoVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(jpoVar)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                jpoVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                com.bytedance.sdk.openadsdk.component.qk.jpo(sq.jpo()).jpo(adSlotBuild, jpoVar, AnonymousClass1.this.f21293jd);
                            }
                        } catch (Throwable th2) {
                            nmd.jpo("ADNFactory", "open component maybe not exist, please check", th2);
                        }
                    }
                }, jpoVar, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.my.jpo.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.jpo.my.jd jdVar = new com.bytedance.sdk.openadsdk.jpo.my.jd(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.jpo.jpo.jpo(new xyk("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.my.jpo.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!sq.cm().oya() && tic.hx()) {
                            jdVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.jpo.jpo.jpo(jdVar)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            jdVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            au.jpo(sq.jpo()).jpo(adSlotBuild, new com.bytedance.sdk.openadsdk.component.reward.qk(jdVar));
                        } catch (Throwable unused) {
                        }
                    }
                }, jdVar, adSlotBuild);
            }
        };
    }
}
