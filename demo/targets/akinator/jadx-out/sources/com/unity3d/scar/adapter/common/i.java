package com.unity3d.scar.adapter.common;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface i extends e {
    @Override // com.unity3d.scar.adapter.common.e
    /* synthetic */ void onAdClicked();

    @Override // com.unity3d.scar.adapter.common.e
    /* synthetic */ void onAdClosed();

    @Override // com.unity3d.scar.adapter.common.e
    /* synthetic */ void onAdFailedToLoad(int i10, String str);

    void onAdFailedToShow(int i10, String str);

    void onAdImpression();

    @Override // com.unity3d.scar.adapter.common.e
    /* synthetic */ void onAdLoaded();

    @Override // com.unity3d.scar.adapter.common.e
    /* synthetic */ void onAdOpened();

    void onAdSkipped();

    void onUserEarnedReward();
}
