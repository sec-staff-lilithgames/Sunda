package com.bytedance.sdk.openadsdk.component.wqx;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener jpo;

    public jd(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.jpo = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.jpo != null) {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.wqx.jd.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = jd.this.jpo;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
    public void onError(final int i10, final String str) {
        if (this.jpo != null) {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.wqx.jd.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = jd.this.jpo;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}
