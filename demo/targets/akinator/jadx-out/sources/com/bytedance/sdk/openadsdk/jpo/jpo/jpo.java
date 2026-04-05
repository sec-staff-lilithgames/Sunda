package com.bytedance.sdk.openadsdk.jpo.jpo;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener jpo;

    public jpo(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.jpo = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
    public void onError(final int i10, final String str) {
        if (this.jpo == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jpo.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                jpo.this.jpo.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jpo.jpo.2
            @Override // java.lang.Runnable
            public void run() {
                jpo.this.jpo.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
