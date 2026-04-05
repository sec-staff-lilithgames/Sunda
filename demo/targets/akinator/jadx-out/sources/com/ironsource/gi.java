package com.ironsource;

import com.ironsource.AbstractC3472u3;
import com.ironsource.C3470u1;
import com.ironsource.G7;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class gi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36823c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36824e;

    public /* synthetic */ gi(int i10, Object obj, Object obj2) {
        this.f36822b = i10;
        this.f36823c = obj;
        this.f36824e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36822b) {
            case 0:
                C3470u1.a.a((androidx.lifecycle.i0) this.f36823c, (C3470u1.a) this.f36824e);
                break;
            case 1:
                ((AbstractC3472u3.c) this.f36823c).b((G7.a) this.f36824e);
                break;
            case 2:
                Ae.a((InterfaceC3432re) this.f36823c, (IronSourceError) this.f36824e);
                break;
            case 3:
                Da.a((LevelPlayAdError) this.f36823c, (Da) this.f36824e);
                break;
            case 4:
                Da.a((Da) this.f36823c, (LevelPlayBannerAdViewListener) this.f36824e);
                break;
            case 5:
                Nd.a((Nd) this.f36823c, (IronSourceError) this.f36824e);
                break;
            case 6:
                P9.a((C3364ne) this.f36823c, (InitListener) this.f36824e);
                break;
            case 7:
                Pd.a((Pd) this.f36823c, (M9) this.f36824e);
                break;
            case 8:
                Pd.a((Pd) this.f36823c, (IronSourceError) this.f36824e);
                break;
            case 9:
                Qf.a((Qf) this.f36823c, (String) this.f36824e);
                break;
            case 10:
                Rd.a((Rd) this.f36823c, (IronSourceError) this.f36824e);
                break;
            case 11:
                Rd.a((RewardedAd) this.f36823c, (Rd) this.f36824e);
                break;
            case 12:
                Uf.a((Uf) this.f36823c, (AbstractC3236gd[]) this.f36824e);
                break;
            case 13:
                C3162cb.a((C3162cb) this.f36823c, (LevelPlayReward) this.f36824e);
                break;
            case 14:
                C3172d3.a((C3172d3) this.f36823c, (IronSourceError) this.f36824e);
                break;
            case 15:
                C3208f3.a((BannerAdView) this.f36823c, (C3208f3) this.f36824e);
                break;
            case 16:
                C3208f3.a((IronSourceError) this.f36823c, (C3208f3) this.f36824e);
                break;
            case 17:
                C3318l6.a((C3318l6) this.f36823c, (Map) this.f36824e);
                break;
            case 18:
                C3341mb.a((C3341mb) this.f36823c, (LevelPlayAdError) this.f36824e);
                break;
            case 19:
                C3341mb.a((C3341mb) this.f36823c, (String) this.f36824e);
                break;
            case 20:
                C3341mb.a((C3341mb) this.f36823c, (InterfaceC3379ob) this.f36824e);
                break;
            case 21:
                C3374o6.a((C3374o6) this.f36823c, (LevelPlayAdInfo) this.f36824e);
                break;
            case 22:
                C3408q6.a((C3408q6) this.f36823c, (LevelPlayAdInfo) this.f36824e);
                break;
            case 23:
                C3478u9.a((C3478u9) this.f36823c, (IronSourceError) this.f36824e);
                break;
            case 24:
                C3497vb.a((C3364ne) this.f36823c, (LevelPlayInitListener) this.f36824e);
                break;
            case 25:
                C3497vb.a((LevelPlayInitListener) this.f36823c, (C3126ab) this.f36824e);
                break;
            case 26:
                C3512w9.a((C3512w9) this.f36823c, (M9) this.f36824e);
                break;
            case 27:
                C3512w9.a((C3512w9) this.f36823c, (IronSourceError) this.f36824e);
                break;
            case 28:
                C3539y2.a((C3539y2) this.f36823c, (pg) this.f36824e);
                break;
            default:
                C3546y9.a((InterstitialAd) this.f36823c, (C3546y9) this.f36824e);
                break;
        }
    }
}
