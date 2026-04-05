package com.bytedance.sdk.openadsdk.component.wqx;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements com.bytedance.sdk.openadsdk.jpo.wqx.jd {
    private final PAGInterstitialAdInteractionListener jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final AtomicBoolean f20095jd = new AtomicBoolean(false);
    private final AtomicBoolean wqx = new AtomicBoolean(false);

    public jpo(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.jpo = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.wqx.jd
    public void jd() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener;
        if (this.wqx.compareAndSet(false, true) && (pAGInterstitialAdInteractionListener = this.jpo) != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.wqx.jd
    public void jpo() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener;
        if (this.f20095jd.compareAndSet(false, true) && (pAGInterstitialAdInteractionListener = this.jpo) != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.jpo;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
