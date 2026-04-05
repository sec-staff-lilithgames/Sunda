package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.k f15789a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f15790b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f15791c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f15792d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f15793e;

    public u1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f15793e = layoutParams;
        this.f15791c = bVar;
        this.f15789a = kVar;
        this.f15790b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f15792d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f15792d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f15791c.o(), (this.f15791c.E0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f15348a, dVar.f15352e, dVar.f15351d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f15350c;
        layoutParams.setMargins(i11, dVar.f15349b, i11, 0);
        layoutParams.gravity = i10;
        this.f15792d.addView(gVar, layoutParams);
    }
}
