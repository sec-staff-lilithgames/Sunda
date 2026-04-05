package sl;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k extends RewardedAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85923b;

    public k(n nVar) {
        this.f85923b = nVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f85923b.f85927c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(RewardedAd rewardedAd) {
        super.onAdLoaded((k) rewardedAd);
        n nVar = this.f85923b;
        nVar.f85927c.onAdLoaded();
        rewardedAd.setFullScreenContentCallback(nVar.f85930f);
        nVar.f85926b.setGmaAd(rewardedAd);
        kl.c cVar = nVar.f85908a;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }
}
