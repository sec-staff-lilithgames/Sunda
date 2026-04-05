package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1796b3 extends AnimatorListenerAdapter {
    public final /* synthetic */ JU A00;
    public final /* synthetic */ boolean A01;

    public C1796b3(JU ju2, boolean z10) {
        this.A00 = ju2;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0O.setTranslationY(0.0f);
        this.A00.A0W();
        if (!this.A01 && this.A00.A0L != null) {
            this.A00.A0L.destroy();
        }
        if (this.A00.A0m != null) {
            if (!this.A00.A0H.A1a()) {
                this.A00.A0m.setVisibility(this.A01 ? 8 : 0);
            } else {
                this.A00.A0m.setVisibility(8);
            }
        }
    }
}
