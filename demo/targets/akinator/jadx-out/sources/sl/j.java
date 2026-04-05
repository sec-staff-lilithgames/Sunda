package sl;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class j extends a implements kl.b {
    public j(Context context, rl.a aVar, kl.d dVar, com.unity3d.scar.adapter.common.d dVar2, com.unity3d.scar.adapter.common.i iVar) {
        super(context, dVar, aVar, dVar2);
        this.f85906e = new n(iVar, this);
    }

    @Override // sl.a
    public final void a(AdRequest adRequest) {
        RewardedAd.load(this.f85903b, this.f85904c.getAdUnitId(), adRequest, ((n) this.f85906e).getAdLoadListener());
    }

    @Override // kl.b
    public void show(Activity activity) {
        Object obj = this.f85902a;
        if (obj != null) {
            ((RewardedAd) obj).show(activity, ((n) this.f85906e).getOnUserEarnedRewardListener());
        } else {
            this.f85907f.handleError(com.unity3d.scar.adapter.common.b.AdNotLoadedError(this.f85904c));
        }
    }
}
