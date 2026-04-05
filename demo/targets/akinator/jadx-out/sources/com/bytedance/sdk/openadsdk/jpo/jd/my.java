package com.bytedance.sdk.openadsdk.jpo.jd;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener jpo;

    public my(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.jpo = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
    public void onError(final int i10, final String str) {
        if (this.jpo == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.my.1
            @Override // java.lang.Runnable
            public void run() {
                if (my.this.jpo != null) {
                    my.this.jpo.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.my.2
            @Override // java.lang.Runnable
            public void run() {
                if (my.this.jpo != null) {
                    my.this.jpo.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
