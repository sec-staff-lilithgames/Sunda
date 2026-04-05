package hm;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import em.d0;
import em.g0;
import em.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends h0 {

    /* renamed from: k, reason: collision with root package name */
    public RewardedAd f59016k;

    @Override // em.u
    public final void b() {
        RewardedAd rewardedAd = this.f59016k;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f59016k.setOnPaidEventListener(null);
            this.f59016k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // em.c0
    public final void d(Activity activity, d0 d0Var) {
        RewardedAd rewardedAd = this.f59016k;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new f(d0Var));
            this.f59016k.show(activity, new l());
        } else {
            ((em.g) d0Var).onAdShowFailed(pr.a.internal("Internal GAM rewarded object is null or not loaded"));
        }
    }

    @Override // em.u
    public final void loadAd(Context context, g0 g0Var) {
        RewardedAd.load(context, getAdUnitId(), n.a(getAdUnit()), (RewardedAdLoadCallback) new j(this, g0Var));
    }
}
