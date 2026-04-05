package com.bytedance.sdk.openadsdk.api.interstitial;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class PAGInterstitialAd implements PAGClientBidding, PangleAd {
    public static void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        ISDKTypeFactory iSDKTypeFactoryJpo = my.jpo(pAGInterstitialAdLoadListener);
        if (iSDKTypeFactoryJpo != null) {
            iSDKTypeFactoryJpo.createADTypeLoaderFactory(str).createInterstitialAdLoader().loadAd(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener);
        }
    }

    public abstract void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener);

    public abstract void show(Activity activity);

    public static void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, final PAGInterstitialAdLoadCallback pAGInterstitialAdLoadCallback) {
        loadAd(str, pAGInterstitialRequest, new PAGInterstitialAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
            public void onError(int i10, String str2) {
                pAGInterstitialAdLoadCallback.onError(new PAGErrorModel(i10, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                pAGInterstitialAdLoadCallback.onAdLoaded(pAGInterstitialAd);
            }
        });
    }
}
