package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class Y0 implements Animation.AnimationListener {
    public final /* synthetic */ R0 A00;
    public final /* synthetic */ NI A01;
    public final /* synthetic */ NI A02;

    public Y0(NI ni2, NI ni3, R0 r02) {
        this.A01 = ni2;
        this.A02 = ni3;
        this.A00 = r02;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        XP.A0F(this.A02);
        new Handler().postDelayed(new NL(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
