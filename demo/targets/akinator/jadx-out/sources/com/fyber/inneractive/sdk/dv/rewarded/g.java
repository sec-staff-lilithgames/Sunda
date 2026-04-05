package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* renamed from: k, reason: collision with root package name */
    public final e f23466k;

    /* renamed from: l, reason: collision with root package name */
    public final f f23467l;

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f23466k = new e(this);
        this.f23467l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f23428g = cVar;
        RewardedAd rewardedAd = new RewardedAd(o.f26796a, "FyberRewarded");
        this.f23430i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f23466k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f23430i;
        if (obj != null) {
            return ((RewardedAd) obj).isLoaded();
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f23020j = aVar;
        ((RewardedAd) this.f23430i).show(activity, this.f23467l);
    }
}
