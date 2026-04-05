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
public final class d extends com.fyber.inneractive.sdk.a {

    /* renamed from: k, reason: collision with root package name */
    public final a f23461k;

    /* renamed from: l, reason: collision with root package name */
    public final b f23462l;

    /* renamed from: m, reason: collision with root package name */
    public final c f23463m;

    public d(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f23461k = new a(this);
        this.f23462l = new b(this);
        this.f23463m = new c(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        this.f23428g = cVar;
        RewardedAd.load(o.f26796a, "FyberRewarded", adRequest, this.f23461k);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f23430i != null;
    }

    @Override // com.fyber.inneractive.sdk.a
    public final void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f23020j = aVar;
        Object obj = this.f23430i;
        if (obj != null) {
            ((RewardedAd) obj).setFullScreenContentCallback(this.f23462l);
            ((RewardedAd) this.f23430i).show(activity, this.f23463m);
        }
    }
}
