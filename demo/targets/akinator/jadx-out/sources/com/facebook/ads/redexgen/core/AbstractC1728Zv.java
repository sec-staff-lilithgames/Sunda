package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1728Zv extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1937dL A07;
    public final KE A08;
    public final C1751aK A09;

    public static String A0d(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0e() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0h(int i10);

    static {
        A0e();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1728Zv(C1937dL c1937dL, KE ke2, int i10, C1400My c1400My, boolean z10, String str, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, N3 n32, boolean z11, String str2) {
        super(c1937dL);
        this.A02 = A0d(0, 0, 37);
        XP.A0I(this);
        this.A07 = c1937dL;
        this.A04 = i10;
        this.A03 = z11;
        this.A02 = str2;
        this.A09 = new C1751aK(c1937dL);
        XP.A0K(this.A09, 0);
        XP.A0I(this.A09);
        if (z11) {
            this.A00 = new LinearLayout(c1937dL);
            this.A01 = new TextView(c1937dL);
            XP.A0I(this.A01);
        }
        if (ke2 == null) {
            this.A08 = new KE(c1937dL, str, c1400My, z10, us, interfaceC1668Xn, c2010eX, xh2, n32);
        } else {
            this.A08 = ke2;
        }
        XP.A0E(1001, this.A08);
        this.A05 = AbstractC1762aV.A03(this.A08, A0d(0, 9, 52));
        this.A06 = new RelativeLayout(c1937dL);
        this.A06.setLayoutParams(A0B);
        XP.A0I(this.A06);
    }

    public void A0f() {
    }

    public void A0g() {
        this.A09.setOnClickListener(this.A05);
    }

    public final KE getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C1398Mw c1398Mw, C1401Mz c1401Mz, String str, String str2, InterfaceC1650Wv interfaceC1650Wv, InterfaceC1737a4 interfaceC1737a4) {
        this.A08.setCta(c1401Mz, str, new HashMap(), interfaceC1650Wv, interfaceC1737a4);
        new KZ(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
