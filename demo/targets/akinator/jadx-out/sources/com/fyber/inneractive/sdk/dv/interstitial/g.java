package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends com.fyber.inneractive.sdk.a {

    /* renamed from: k, reason: collision with root package name */
    public final e f23454k;

    /* renamed from: l, reason: collision with root package name */
    public final f f23455l;

    public g(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f23454k = new e(this);
        this.f23455l = new f(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f23428g = cVar;
        InterstitialAd interstitialAd = new InterstitialAd(o.f26796a);
        this.f23430i = interstitialAd;
        interstitialAd.setAdListener(this.f23454k);
        ((InterstitialAd) this.f23430i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f23430i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        Object obj = this.f23430i;
        return obj != null && ((InterstitialAd) obj).isLoaded();
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(a aVar, Activity activity) {
        this.f23020j = aVar;
        Object obj = this.f23430i;
        if (obj != null) {
            ((InterstitialAd) obj).setAdListener(this.f23455l);
            ((InterstitialAd) this.f23430i).show();
        }
    }
}
