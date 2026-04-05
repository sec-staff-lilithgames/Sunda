package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.redexgen.core.AbstractC1640Wl;
import com.facebook.ads.redexgen.core.AbstractC1667Xm;
import com.facebook.ads.redexgen.core.AbstractC1762aV;
import com.facebook.ads.redexgen.core.C1400My;
import com.facebook.ads.redexgen.core.C1580Ua;
import com.facebook.ads.redexgen.core.C1665Xk;
import com.facebook.ads.redexgen.core.C1903cm;
import com.facebook.ads.redexgen.core.C1937dL;
import com.facebook.ads.redexgen.core.InterfaceC1666Xl;
import com.facebook.ads.redexgen.core.InterfaceC1668Xn;
import com.facebook.ads.redexgen.core.KE;
import com.facebook.ads.redexgen.core.N9;
import com.facebook.ads.redexgen.core.NF;
import com.facebook.ads.redexgen.core.ViewOnClickListenerC1677Xw;
import com.facebook.ads.redexgen.core.XP;
import com.facebook.ads.redexgen.core.XX;
import com.facebook.ads.redexgen.core.YG;
import com.facebook.ads.redexgen.core.YO;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC1667Xm {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C1665Xk A00;
    public InterfaceC1666Xl A01;
    public InterfaceC1666Xl A02;
    public YG A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final C1580Ua A07;
    public final InterfaceC1668Xn A08;
    public final YO A09;
    public final C1903cm A0A;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (AbstractC1640Wl.A02 * 10.0f);
        A0H = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (AbstractC1640Wl.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1937dL c1937dL, InterfaceC1668Xn interfaceC1668Xn, C1580Ua c1580Ua, int i10, int i11, boolean z10) {
        super(c1937dL);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z10;
        this.A08 = interfaceC1668Xn;
        this.A07 = c1580Ua;
        setGravity(16);
        this.A09 = new YO(c1937dL, i10, z10);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC1677Xw(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c1937dL);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C1903cm(c1937dL);
            XP.A0E(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i11 != -1) {
                A0D(c1937dL, i11);
                return;
            }
            return;
        }
        if (i11 != -1) {
            A0D(c1937dL, i11);
        }
        this.A06 = new RelativeLayout(c1937dL);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C1903cm(c1937dL);
        XP.A0E(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A06() {
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A07() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A08() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A09(float f10, int i10) {
        this.A09.A03(f10, i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final void A0A(C1400My c1400My, boolean z10) {
        boolean z11 = this.A04;
        int iA05 = c1400My.A05(z11);
        this.A0A.A02(c1400My.A0B(z11), iA05);
        boolean z12 = this.A05;
        String strA02 = A02(8, 9, 52);
        if (!z12) {
            if (this.A00 != null) {
                this.A00.setIconColors(iA05);
                this.A00.setContentDescription(strA02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(iA05);
            this.A03.setContentDescription(strA02);
        }
        this.A09.A04(c1400My, z11, z10);
        if (z11) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            XP.A0Q(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        XP.A0K(this, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public final boolean A0B() {
        return this.A09.A05();
    }

    public final void A0C(N9 n9, String str, int i10) {
        this.A09.setInitialUnskippableSeconds(i10);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(n9, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(n9, str, this.A07, this.A08);
        }
    }

    public final void A0D(C1937dL c1937dL, int i10) {
        if (this.A00 != null) {
            XP.A0H(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new C1665Xk(c1937dL, i10);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new YG(c1937dL);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public int getToolbarHeight() {
        return AbstractC1667Xm.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public InterfaceC1666Xl getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setAdReportingVisible(boolean z10) {
        A04(!this.A05 ? this.A00 : this.A03, z10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setCTAClickListener(KE ke2) {
        this.A0A.setOnClickListener(AbstractC1762aV.A03(ke2, A02(17, 7, 47)));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setFullscreen(boolean z10) {
        this.A04 = z10;
    }

    public void setOnlyPageDetails(N9 n9) {
        if (n9 != null) {
            this.A0A.setPageDetails(n9);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setPageDetails(N9 n9, String str, int i10, NF nf2) {
        this.A09.setInitialUnskippableSeconds(i10);
        this.A0A.setPageDetails(n9);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(n9, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(n9, str, this.A07, this.A08);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setPageDetailsVisible(boolean z10) {
        this.A06.removeAllViews();
        if (z10) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgress(float f10) {
        this.A09.setProgress(f10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressImage(XX xx) {
        this.A09.setProgressImage(xx);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressImmediate(float f10) {
        this.A09.setProgressImmediate(f10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setProgressSpinnerInvisible(boolean z10) {
        this.A09.setProgressSpinnerInvisible(z10);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            XP.A0O(view, 0, -16777216, A0E);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setToolbarActionMode(int i10) {
        this.A09.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1667Xm
    public void setToolbarListener(InterfaceC1666Xl interfaceC1666Xl) {
        this.A02 = interfaceC1666Xl;
    }
}
