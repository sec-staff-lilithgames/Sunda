package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class CU implements InterfaceC1979e2 {
    public ValueAnimator A00;
    public EnumC1978e1 A01 = EnumC1978e1.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public CU(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A02 = i10;
        this.A04 = i11;
        this.A03 = i12;
    }

    private ValueAnimator A00(View view, int i10, int i11) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new C1988eB(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        if (z10) {
            this.A01 = EnumC1978e1.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C1987eA(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        XP.A0F(this.A05);
        this.A01 = EnumC1978e1.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10) {
        XP.A0J(this.A05);
        if (z10) {
            this.A01 = EnumC1978e1.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C1986e9(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC1978e1.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1979e2
    public final void A42(boolean z10, boolean z11) {
        if (z11) {
            A08(z10);
        } else {
            A09(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1979e2
    public final EnumC1978e1 A93() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1979e2
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
