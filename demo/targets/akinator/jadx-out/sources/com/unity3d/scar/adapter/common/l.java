package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public ll.e f50731a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f50732b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public kl.b f50733c;

    /* renamed from: d, reason: collision with root package name */
    public final d f50734d;

    public l(d dVar) {
        this.f50734d = dVar;
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void getSCARBiddingSignals(Context context, List<kl.e> list, ll.b bVar) {
        this.f50731a.getSCARBiddingSignals(context, list, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void getSCARSignal(Context context, String str, kl.e eVar, ll.b bVar) {
        this.f50731a.getSCARSignal(context, str, eVar, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public abstract /* synthetic */ void loadBannerAd(Context context, RelativeLayout relativeLayout, kl.d dVar, int i10, int i11, g gVar);

    @Override // com.unity3d.scar.adapter.common.f
    public abstract /* synthetic */ void loadInterstitialAd(Context context, kl.d dVar, h hVar);

    @Override // com.unity3d.scar.adapter.common.f
    public abstract /* synthetic */ void loadRewardedAd(Context context, kl.d dVar, i iVar);

    @Override // com.unity3d.scar.adapter.common.f
    public void show(Activity activity, String str, String str2) {
        kl.b bVar = (kl.b) this.f50732b.get(str2);
        if (bVar != null) {
            this.f50733c = bVar;
            m.runOnUiThread(new k(this, activity));
            return;
        }
        this.f50734d.handleError(b.NoAdsError(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void getSCARBiddingSignals(Context context, boolean z10, ll.b bVar) {
        this.f50731a.getSCARBiddingSignals(context, z10, bVar);
    }
}
