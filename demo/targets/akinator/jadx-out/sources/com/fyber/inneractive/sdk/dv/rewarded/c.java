package com.fyber.inneractive.sdk.dv.rewarded;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements OnUserEarnedRewardListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23460a;

    public c(d dVar) {
        this.f23460a = dVar;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f23460a.f23020j;
        if (aVar != null) {
            aVar.onReward();
        }
    }
}
