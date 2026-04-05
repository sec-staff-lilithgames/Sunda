package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a2 extends u1 {
    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.u1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    @Override // com.applovin.impl.u1
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.widget.ImageView r18, com.applovin.impl.adview.g r19, final com.applovin.impl.adview.l r20, com.applovin.impl.a r21, android.widget.ProgressBar r22, com.applovin.impl.i0 r23, android.view.View r24, android.view.View r25, com.applovin.adview.AppLovinAdView r26, com.applovin.impl.adview.k r27, android.widget.ImageView r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.a2.a(android.widget.ImageView, com.applovin.impl.adview.g, com.applovin.impl.adview.l, com.applovin.impl.a, android.widget.ProgressBar, com.applovin.impl.i0, android.view.View, android.view.View, com.applovin.adview.AppLovinAdView, com.applovin.impl.adview.k, android.widget.ImageView, android.view.ViewGroup):void");
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        s.a(this.f15792d, view);
        if (gVar != null) {
            a(this.f15791c.o(), (this.f15791c.E0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f15789a.a(v4.f15994o2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f15789a.a(v4.f16002p2)).intValue());
            this.f15792d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.f15792d.addView(kVar, this.f15793e);
        }
    }
}
