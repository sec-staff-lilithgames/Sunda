package ol;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k extends RewardedAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f79540b;

    public k(n nVar) {
        this.f79540b = nVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f79540b.f79544c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(RewardedAd rewardedAd) {
        super.onAdLoaded((k) rewardedAd);
        n nVar = this.f79540b;
        nVar.f79544c.onAdLoaded();
        rewardedAd.setFullScreenContentCallback(nVar.f79547f);
        nVar.f79543b.setGmaAd(rewardedAd);
        kl.c cVar = nVar.f79525a;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }
}
