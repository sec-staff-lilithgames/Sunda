package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz implements com.bytedance.sdk.openadsdk.jpo.my.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicBoolean f20076cm;

    /* renamed from: jd, reason: collision with root package name */
    private final PAGRewardedAdInteractionCallback f20077jd;
    private final PAGRewardedAdInteractionListener jpo;
    private final AtomicBoolean my;
    private final AtomicBoolean wqx;

    public zz(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.wqx = new AtomicBoolean(false);
        this.f20076cm = new AtomicBoolean(false);
        this.my = new AtomicBoolean(false);
        this.jpo = pAGRewardedAdInteractionListener;
        this.f20077jd = null;
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.my.jpo
    public void jd() {
        if (this.f20076cm.compareAndSet(false, true)) {
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.jpo;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f20077jd;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.my.jpo
    public void jpo() {
        if (this.wqx.compareAndSet(false, true)) {
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.jpo;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f20077jd;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.jpo;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f20077jd;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jpo.my.jpo
    public void jpo(boolean z10, int i10, String str, int i11, String str2) {
        if (this.my.compareAndSet(false, true)) {
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.jpo;
            if (pAGRewardedAdInteractionListener != null) {
                if (z10) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i10, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i11, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.f20077jd;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z10) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i10, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i11, str2));
                }
            }
        }
    }

    public zz(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.wqx = new AtomicBoolean(false);
        this.f20076cm = new AtomicBoolean(false);
        this.my = new AtomicBoolean(false);
        this.f20077jd = pAGRewardedAdInteractionCallback;
        this.jpo = null;
    }
}
