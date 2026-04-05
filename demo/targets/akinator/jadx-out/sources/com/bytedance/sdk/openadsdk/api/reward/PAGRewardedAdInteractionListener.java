package com.bytedance.sdk.openadsdk.api.reward;

import com.bytedance.sdk.openadsdk.api.PAGAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface PAGRewardedAdInteractionListener extends PAGAdListener {
    void onUserEarnedReward(PAGRewardItem pAGRewardItem);

    void onUserEarnedRewardFail(int i10, String str);
}
