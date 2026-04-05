package com.bytedance.sdk.openadsdk.api.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class PAGRewardedAdInteractionCallback {
    public void onAdClicked() {
    }

    public void onAdDismissed() {
    }

    public void onAdShowed() {
    }

    public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
    }

    public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
    }

    public void onUserEarnedRewardFail(PAGErrorModel pAGErrorModel) {
    }
}
