package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.e8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1985e8 implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CY A02;

    public C1985e8(CY cy, int i10, int i11) {
        this.A02 = cy;
        this.A01 = i10;
        this.A00 = i11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC1978e1 enumC1978e1;
        CY cy = this.A02;
        if (this.A01 == this.A02.A04) {
            enumC1978e1 = EnumC1978e1.A02;
        } else {
            enumC1978e1 = EnumC1978e1.A04;
        }
        cy.A01 = enumC1978e1;
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
