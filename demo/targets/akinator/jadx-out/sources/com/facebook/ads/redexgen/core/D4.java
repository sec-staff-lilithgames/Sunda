package com.facebook.ads.redexgen.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class D4 implements InterfaceC1954dc {
    public View A00;
    public E1 A01;
    public EnumC1968dr A02;
    public boolean A03;
    public final Handler A04;
    public final DX A05;
    public final DR A06;
    public final DP A07;
    public final DG A08;
    public final boolean A09;
    public final boolean A0A;

    public D4(View view, EnumC1968dr enumC1968dr, boolean z10) {
        this(view, enumC1968dr, z10, false);
    }

    public D4(View view, EnumC1968dr enumC1968dr, boolean z10, boolean z11) {
        this.A06 = new DR() { // from class: com.facebook.ads.redexgen.X.3B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                this.A00.A06(1, 0);
            }
        };
        this.A07 = new DP() { // from class: com.facebook.ads.redexgen.X.32
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (!this.A00.A03) {
                    return;
                }
                if (this.A00.A02 == EnumC1968dr.A02 || this.A00.A09) {
                    this.A00.A02 = null;
                    this.A00.A05();
                } else {
                    this.A00.A06(0, 8);
                }
            }
        };
        this.A05 = new DX() { // from class: com.facebook.ads.redexgen.X.30
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                if (this.A00.A02 == EnumC1968dr.A03) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new C08982y(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, enumC1968dr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C1967dq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i10, int i11) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i10);
        this.A00.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC1968dr enumC1968dr) {
        this.A02 = enumC1968dr;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC1968dr == EnumC1968dr.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1954dc
    public final void AAm(E1 e12) {
        this.A01 = e12;
        e12.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1954dc
    public final void AJk(E1 e12) {
        A06(1, 0);
        e12.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
