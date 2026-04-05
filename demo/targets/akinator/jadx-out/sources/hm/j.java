package hm;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import em.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends RewardedAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final m f59013b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f59014c;

    public j(m mVar, g0 g0Var) {
        this.f59013b = mVar;
        this.f59014c = g0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f59013b.c(new gm.c(19, this, loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(RewardedAd rewardedAd) {
        m mVar = this.f59013b;
        rewardedAd.setOnPaidEventListener(new k(mVar));
        mVar.f59016k = rewardedAd;
        mVar.c(new gm.c(18, this, rewardedAd));
    }
}
