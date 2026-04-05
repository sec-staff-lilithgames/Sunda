package im;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import em.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends RewardedAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final n f59745b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f59746c;

    public j(n nVar, g0 g0Var) {
        this.f59745b = nVar;
        this.f59746c = g0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f59745b.c(new gm.c(28, this, loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(RewardedAd rewardedAd) {
        n nVar = this.f59745b;
        rewardedAd.setOnPaidEventListener(new l(nVar));
        nVar.f59751k = rewardedAd;
        nVar.c(new gm.c(29, this, rewardedAd));
    }
}
