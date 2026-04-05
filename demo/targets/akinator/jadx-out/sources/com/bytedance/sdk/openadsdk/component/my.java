package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements com.bytedance.sdk.openadsdk.jpo.cm.jd {

    /* renamed from: jd, reason: collision with root package name */
    private final AtomicBoolean f19796jd = new AtomicBoolean(false);
    private final PAGAppOpenAdInteractionListener jpo;

    public my(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.jpo = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.cm.jd
    public void jd() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.f19796jd.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.jpo) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.cm.jd
    public void jpo() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.jpo;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.jpo;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.cm.jd
    public void wqx() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.f19796jd.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.jpo) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
