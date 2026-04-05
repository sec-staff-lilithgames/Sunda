package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface f {
    void getSCARBiddingSignals(Context context, List<kl.e> list, ll.b bVar);

    void getSCARBiddingSignals(Context context, boolean z10, ll.b bVar);

    void getSCARSignal(Context context, String str, kl.e eVar, ll.b bVar);

    void loadBannerAd(Context context, RelativeLayout relativeLayout, kl.d dVar, int i10, int i11, g gVar);

    void loadInterstitialAd(Context context, kl.d dVar, h hVar);

    void loadRewardedAd(Context context, kl.d dVar, i iVar);

    void show(Activity activity, String str, String str2);
}
