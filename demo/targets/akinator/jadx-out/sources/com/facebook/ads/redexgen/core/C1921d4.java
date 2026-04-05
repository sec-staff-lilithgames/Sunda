package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1921d4 {
    public KE A00;
    public final C1388Ml A01;
    public final C1398Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C1937dL A05;
    public final C1580Ua A06;
    public static final int A09 = (int) (AbstractC1640Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC1640Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC1640Wl.A02 * 8.0f);

    public C1921d4(C1937dL c1937dL, US us, AbstractC2212hy abstractC2212hy) {
        this.A05 = c1937dL;
        this.A06 = new C1580Ua(abstractC2212hy.A25(), us);
        this.A01 = abstractC2212hy.A1z();
        this.A02 = abstractC2212hy.A20().A0I();
        this.A04 = abstractC2212hy.A23();
        this.A03 = abstractC2212hy.A20().A0K();
    }

    private View A00(KE ke2) {
        C1757aQ c1757aQ = new C1757aQ(this.A05, this.A01.A01(), true, false, false);
        c1757aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c1757aQ.setAlignment(17);
        C1751aK c1751aK = new C1751aK(this.A05);
        XP.A0K(c1751aK, 0);
        c1751aK.setRadius(50);
        new KZ(c1751aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1751aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1757aQ, layoutParams);
        if (ke2 != null) {
            XP.A0H(ke2);
            linearLayout.addView(ke2, layoutParams);
            if (TextUtils.isEmpty(ke2.getText())) {
                XP.A0F(ke2);
            }
        }
        return linearLayout;
    }

    private C09846g A01() {
        C09846g c09846g = new C09846g(this.A05);
        c09846g.setLayoutManager(new C2117gI(this.A05, 0, false));
        c09846g.setAdapter(new C1171Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c09846g;
    }

    private final EnumC1920d3 A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1920d3.A03;
        }
        return EnumC1920d3.A02;
    }

    public final Pair<EnumC1920d3, View> A03(KE ke2) {
        View viewA01;
        this.A00 = ke2;
        EnumC1920d3 enumC1920d3A02 = A02();
        switch (C1919d2.A00[enumC1920d3A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC1582Uc.A04(viewA01, this.A06, UZ.A0S);
        return new Pair<>(enumC1920d3A02, viewA01);
    }
}
