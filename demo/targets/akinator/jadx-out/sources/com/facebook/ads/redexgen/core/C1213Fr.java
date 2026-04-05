package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1213Fr extends AbstractRunnableC1624Vt {
    public final /* synthetic */ InterfaceC1887cW A00;
    public final /* synthetic */ C1888cX A01;

    public C1213Fr(C1888cX c1888cX, InterfaceC1887cW interfaceC1887cW) {
        this.A01 = c1888cX;
        this.A00 = interfaceC1887cW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1214Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
