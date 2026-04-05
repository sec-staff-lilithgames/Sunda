package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends com.fyber.inneractive.sdk.dv.a {

    /* renamed from: j, reason: collision with root package name */
    public boolean f23433j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23434k;

    /* renamed from: l, reason: collision with root package name */
    public final a f23435l;

    public b(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar, iVar);
        this.f23433j = false;
        this.f23434k = false;
        this.f23435l = new a(this);
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public final void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.c cVar) {
        l0 l0Var;
        this.f23428g = cVar;
        AdView adView = new AdView(o.f26796a);
        this.f23430i = adView;
        AdSize adSize = AdSize.BANNER;
        s0 s0Var = this.f23947d;
        if (s0Var != null && (l0Var = ((r0) s0Var).f23345c) != null && l0Var.f23330b == UnitDisplayType.MRECT) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f23430i).setAdUnitId("FyberBanner");
        ((AdView) this.f23430i).setAdListener(this.f23435l);
        ((AdView) this.f23430i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f23434k;
    }
}
