package sl;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class n extends b {

    /* renamed from: b, reason: collision with root package name */
    public final j f85926b;

    /* renamed from: c, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.i f85927c;

    /* renamed from: d, reason: collision with root package name */
    public final k f85928d = new k(this);

    /* renamed from: e, reason: collision with root package name */
    public final l f85929e = new l(this);

    /* renamed from: f, reason: collision with root package name */
    public final m f85930f = new m(this);

    public n(com.unity3d.scar.adapter.common.i iVar, j jVar) {
        this.f85927c = iVar;
        this.f85926b = jVar;
    }

    public RewardedAdLoadCallback getAdLoadListener() {
        return this.f85928d;
    }

    public OnUserEarnedRewardListener getOnUserEarnedRewardListener() {
        return this.f85929e;
    }
}
