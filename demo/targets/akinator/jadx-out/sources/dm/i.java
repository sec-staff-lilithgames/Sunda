package dm;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import zl.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends RewardedAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final k f52381b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f52382c;

    public i(k kVar, e0 e0Var) {
        this.f52381b = kVar;
        this.f52382c = e0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        ((zl.j) this.f52382c).onAdLoadFailed(this.f52381b, new pr.a(pr.a.f81798p, loadAdError.getCode(), loadAdError.getMessage()));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(RewardedAd rewardedAd) {
        k kVar = this.f52381b;
        kVar.f52383h = rewardedAd;
        kVar.onAdLoaded();
        ((zl.j) this.f52382c).onAdLoaded(kVar);
    }
}
