package ol;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements OnUserEarnedRewardListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f79541b;

    public l(n nVar) {
        this.f79541b = nVar;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        this.f79541b.f79544c.onUserEarnedReward();
    }
}
