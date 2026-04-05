package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1419Nr extends AbstractC1667Xm {
    public static byte[] A03;
    public C1937dL A00;
    public InterfaceC1666Xl A01;
    public final YQ A02;

    static {
        A05();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public C1419Nr(C1937dL c1937dL, InterfaceC1668Xn interfaceC1668Xn, C1580Ua c1580Ua, int i10) {
        super(c1937dL);
        this.A00 = c1937dL;
        setGravity(16);
        A04();
        this.A02 = new YQ(this.A00, i10);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1678Xx(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A06() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A07() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A09(float f10, int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A0A(C1400My c1400My, boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public int getToolbarHeight() {
        return AbstractC1667Xm.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public InterfaceC1666Xl getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setAdReportingVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setCTAClickListener(KE ke2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setFullscreen(boolean z10) {
    }

    public void setInitialUnskippableSeconds(int i10) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setPageDetails(N9 n9, String str, int i10, NF nf2) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setPageDetailsVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgress(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressImage(XX xx) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressImmediate(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressSpinnerInvisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setToolbarActionMode(int i10) {
        this.A02.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setToolbarListener(InterfaceC1666Xl interfaceC1666Xl) {
        this.A01 = interfaceC1666Xl;
    }
}
