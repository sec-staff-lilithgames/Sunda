package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class x1 extends u1 {
    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.u1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f15792d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f15791c.o(), (this.f15791c.E0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f15792d.addView(kVar, this.f15793e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f15792d);
        } else {
            this.f15790b.setContentView(this.f15792d);
        }
    }
}
