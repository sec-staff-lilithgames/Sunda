package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1214Fs extends XO {
    public final /* synthetic */ C1213Fr A00;

    public C1214Fs(C1213Fr c1213Fr) {
        this.A00 = c1213Fr;
    }

    @Override // com.facebook.ads.redexgen.core.XO, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        XP.A0F(this.A00.A01);
        this.A00.A00.ADh();
    }
}
