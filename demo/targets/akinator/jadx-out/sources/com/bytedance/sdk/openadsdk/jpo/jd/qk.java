package com.bytedance.sdk.openadsdk.jpo.jd;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk implements jj {
    private final PAGNativeAdInteractionListener jpo;

    public qk(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.jpo = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.jd.jj
    public boolean jd() {
        return this.jpo != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.qk.1
            @Override // java.lang.Runnable
            public void run() {
                if (qk.this.jpo != null) {
                    qk.this.jpo.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.jd.jj
    public void jpo(PAGNativeAd pAGNativeAd) {
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.qk.2
            @Override // java.lang.Runnable
            public void run() {
                if (qk.this.jpo != null) {
                    qk.this.jpo.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.jd.jj
    public void jpo() {
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.qk.3
            @Override // java.lang.Runnable
            public void run() {
                if (qk.this.jpo != null) {
                    qk.this.jpo.onAdDismissed();
                }
            }
        });
    }
}
