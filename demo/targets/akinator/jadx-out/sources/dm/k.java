package dm;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import zl.c0;
import zl.e0;
import zl.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends c0 {

    /* renamed from: h, reason: collision with root package name */
    public RewardedAd f52383h;

    @Override // zl.t
    public final void b() {
        RewardedAd rewardedAd = this.f52383h;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f52383h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zl.y
    public final void c(Activity activity, z zVar) {
        RewardedAd rewardedAd = this.f52383h;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new d(zVar));
            this.f52383h.show(activity, new j());
        } else {
            ((zl.c) zVar).onAdShowFailed(pr.a.internal("InternalGAM rewarded object is null or not loaded"));
        }
    }

    @Override // zl.t
    public final void loadAd(Context context, e0 e0Var) {
        RewardedAd.load(context, getAdUnitId(), c.a(getGamLoader(), getGamUnitData()), (RewardedAdLoadCallback) new i(this, e0Var));
    }
}
