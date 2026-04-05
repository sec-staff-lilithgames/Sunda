package com.bytedance.sdk.openadsdk.jpo.my;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener jpo;

    public jd(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.jpo = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
    public void onError(final int i10, final String str) {
        if (this.jpo == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.my.jd.1
            @Override // java.lang.Runnable
            public void run() {
                if (jd.this.jpo != null) {
                    jd.this.jpo.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.my.jd.2
            @Override // java.lang.Runnable
            public void run() {
                if (jd.this.jpo != null) {
                    jd.this.jpo.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
