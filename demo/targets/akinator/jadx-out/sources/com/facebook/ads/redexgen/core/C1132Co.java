package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Co, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1132Co implements InterfaceC1979e2 {
    public int A00;
    public ValueAnimator A01;
    public EnumC1978e1 A02 = EnumC1978e1.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public C1132Co(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A03 = i10;
        this.A00 = i11;
        this.A04 = i12;
    }

    private ValueAnimator A00(int i10, int i11, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C1982e5(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z10) {
        if (z10) {
            this.A02 = EnumC1978e1.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C1981e4(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        XP.A0F(this.A05);
        this.A02 = EnumC1978e1.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        XP.A0J(this.A05);
        if (z10) {
            this.A02 = EnumC1978e1.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C1980e3(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC1978e1.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1979e2
    public final void A42(boolean z10, boolean z11) {
        if (z11) {
            A07(z10);
        } else {
            A08(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1979e2
    public final EnumC1978e1 A93() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1979e2
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
