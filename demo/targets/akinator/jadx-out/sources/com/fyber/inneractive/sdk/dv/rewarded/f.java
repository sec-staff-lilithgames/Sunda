package com.fyber.inneractive.sdk.dv.rewarded;

import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends RewardedAdCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f23465a;

    public f(g gVar) {
        this.f23465a = gVar;
    }

    public final void onRewardedAdClosed() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f23465a.f23020j;
        if (aVar != null) {
            aVar.h();
        }
    }

    public final void onRewardedAdOpened() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f23465a.f23020j;
        if (aVar != null) {
            aVar.w();
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f23465a.f23020j;
        if (aVar != null) {
            aVar.onReward();
        }
    }

    public final void onRewardedAdFailedToShow(int i10) {
    }
}
