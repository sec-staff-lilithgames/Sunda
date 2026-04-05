package gm;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import em.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends RewardedAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final n f57720b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f57721c;

    public k(n nVar, g0 g0Var) {
        this.f57720b = nVar;
        this.f57721c = g0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f57720b.c(new c(5, this, loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(RewardedAd rewardedAd) {
        n nVar = this.f57720b;
        rewardedAd.setOnPaidEventListener(new l(nVar));
        nVar.f57723k = rewardedAd;
        nVar.c(new c(6, this, rewardedAd));
    }
}
