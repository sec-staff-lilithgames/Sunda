package com.facebook.ads.redexgen.core;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CY implements InterfaceC1979e2 {
    public static byte[] A06;
    public ValueAnimator A00;
    public EnumC1978e1 A01 = EnumC1978e1.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{49, 32, 61, 49, 6, 42, 41, 42, 55};
    }

    public CY(View view, int i10, int i11, int i12) {
        this.A02 = i10;
        this.A05 = view;
        this.A04 = i11;
        this.A03 = i12;
    }

    private void A06(int i10, int i11) {
        this.A01 = i10 == this.A04 ? EnumC1978e1.A03 : EnumC1978e1.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i10, i11);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C1985e8(this, i10, i11));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10, int i11, boolean z10) {
        if (z10) {
            A06(i10, i11);
        } else {
            ((TextView) this.A05).setTextColor(i11);
            this.A01 = i11 == this.A03 ? EnumC1978e1.A02 : EnumC1978e1.A04;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1979e2
    public final void A42(boolean z10, boolean z11) {
        int endColor = z11 ? this.A03 : this.A04;
        int startColor = z11 ? this.A04 : this.A03;
        A07(endColor, startColor, z10);
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
