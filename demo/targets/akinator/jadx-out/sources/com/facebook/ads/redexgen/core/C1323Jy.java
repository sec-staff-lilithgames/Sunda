package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.text.NumberFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1323Jy extends AbstractC1728Zv {
    public static byte[] A0J;
    public static String[] A0K = {"U1MfpI1C6bH5E6SUUi1isARh9jp", "U", "Ubu5RVHkDHh3GnMyAX4EkYenDqWvQs6J", "Crj7vvGLMnYJtX1VpNFn8xcnVkyg9fPV", "3oNG9AhO9bk5LTGV0GcEQxoD", ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, "kfjfnNCZtD", "orAcnrCTNYiJWv2aZLW"};
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C1398Mw A06;
    public C1400My A07;
    public C1401Mz A08;
    public C1753aM A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final LinearLayout A0D;
    public final RelativeLayout A0E;
    public final RelativeLayout A0F;
    public final TextView A0G;
    public final C1937dL A0H;
    public final boolean A0I;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A04() {
        this.A0E.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0O;
        this.A0E.setLayoutParams(layoutParams);
        XP.A0I(this.A0E);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(super.A04, super.A04);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0E.addView(super.A09, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = A0P;
        layoutParams3.addRule(1, super.A09.getId());
        layoutParams3.addRule(15);
        this.A0E.addView(this.A0F, layoutParams3);
        this.A0F.removeAllViews();
        XP.A0I(this.A05);
        this.A05.setLayoutParams(AbstractC1728Zv.A0B);
        this.A05.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        XP.A0W(this.A05, true, 18);
        this.A0F.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0Q);
        layoutParams4.topMargin = A0P / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0F.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        XP.A0W(this.A04, false, 14);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams5.leftMargin = A0P;
        this.A02.addView(this.A04, layoutParams5);
    }

    public static void A09() {
        A0J = new byte[]{-80, -64};
    }

    static {
        A09();
        A0U = OP.A02(-1, 77);
        A0O = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0P = (int) (AbstractC1640Wl.A02 * 8.0f);
        A0L = (int) (AbstractC1640Wl.A02 * 26.0f);
        A0N = (int) (AbstractC1640Wl.A02 * 144.0f);
        A0M = (int) (AbstractC1640Wl.A02 * 48.0f);
        A0Q = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0V = (int) (AbstractC1640Wl.A02 * 14.0f);
        A0R = (int) (OE.A08 * 21.0f);
        A0S = (int) (OE.A08 * 12.0f);
        A0T = (int) (OE.A08 * 10.0f);
    }

    public C1323Jy(C1937dL c1937dL, KE ke2, int i10, boolean z10, C1400My c1400My, boolean z11, String str, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, N3 n32, boolean z12, String str2, boolean z13) {
        super(c1937dL, ke2, i10, c1400My, z11, str, us, interfaceC1668Xn, c2010eX, xh2, n32, z12, str2);
        this.A0C = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0A = true;
        this.A0H = c1937dL;
        super.A09.setFullCircleCorners(z10);
        setPadding(A0O, A0O, A0O, A0L);
        this.A0E = new RelativeLayout(getContext());
        this.A05 = new TextView(getContext());
        this.A02 = new LinearLayout(getContext());
        this.A09 = new C1753aM(this.A0H, A0V, 5, A0U, -1);
        this.A0F = new RelativeLayout(getContext());
        this.A0D = new LinearLayout(getContext());
        this.A04 = new TextView(getContext());
        this.A03 = new TextView(getContext());
        super.A06.addView(this.A0E);
        super.A06.addView(this.A0D);
        this.A0G = new TextView(getContext());
        this.A07 = c1400My;
        this.A0I = U7.A17(c1937dL);
        XP.A0P(this, c1937dL);
        this.A0B = U7.A2U(this.A0H);
        A0i();
        if (z13) {
            this.A03.setVisibility(8);
            this.A0D.setVisibility(8);
        }
    }

    public C1323Jy(C1937dL c1937dL, KE ke2, int i10, boolean z10, C1400My c1400My, boolean z11, String str, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, AbstractC2212hy abstractC2212hy) {
        this(c1937dL, ke2, i10, z10, c1400My, false, str, us, interfaceC1668Xn, c2010eX, xh2, abstractC2212hy.A21(), abstractC2212hy.A1c(), abstractC2212hy.A0x(), abstractC2212hy.A1k());
    }

    private GradientDrawable A00(int i10, float f10) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(f10);
        drawable.setColor(i10);
        return drawable;
    }

    private void A02() {
        super.A08.setPadding(0, 0, 0, 0);
        super.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, A0M));
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams;
        this.A0D.setOrientation(1);
        this.A0D.setPadding(0, 0, 0, A0O);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0E.getId());
        this.A0D.setLayoutParams(layoutParams2);
        this.A0D.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0B ? this.A07.A06(true) : -1);
        XP.A0W(this.A03, false, 16);
        if (this.A0I) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        this.A0D.addView(this.A03, layoutParams);
    }

    private void A05() {
        if (super.A01 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            super.A01.setPadding(0, 0, 0, A0S);
            super.A01.setText(super.A02);
            super.A01.setTextColor(-1);
            XP.A0W(super.A01, false, 15);
            super.A01.setLayoutParams(layoutParams);
        }
    }

    private void A06() {
        if (super.A00 != null) {
            super.A00.removeAllViews();
            super.A00.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.setMargins(0, A0R, 0, A0R);
            super.A00.setGravity(17);
            super.A00.setPadding(A0S, A0S, A0S, A0S);
            super.A00.setLayoutParams(layoutParams);
            XP.A0Q(super.A00, A00(-1121112787, A0T));
            A05();
            A02();
            if (super.A01 != null) {
                super.A00.addView(super.A01);
            }
            super.A00.addView(super.A08);
        }
    }

    private void A07() {
        LinearLayout.LayoutParams layoutParams;
        this.A0G.setMaxLines(1);
        this.A0G.setEllipsize(TextUtils.TruncateAt.END);
        this.A0G.setGravity(17);
        this.A0G.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        this.A0G.setAllCaps(true);
        XP.A0W(this.A0G, false, 12);
        new LinearLayout.LayoutParams(-1, -2);
        if (this.A0I) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = A0O;
        this.A0G.setLayoutParams(layoutParams);
    }

    private void A08() {
        if (this.A06 == null) {
            return;
        }
        TextView textView = this.A05;
        C1398Mw c1398Mw = this.A06;
        if (A0K[2].charAt(28) == 'n') {
            throw new RuntimeException();
        }
        A0K[2] = "SIvKbfulzllrpdkfdrym2tho7PogZ3oV";
        textView.setText(c1398Mw.A0F());
        this.A03.setText(this.A06.A04());
        this.A0G.setText(this.A06.A0D());
        if (TextUtils.isEmpty(this.A08.A04())) {
            XP.A0F(super.A08);
        }
        if (TextUtils.isEmpty(this.A06.A0D())) {
            XP.A0F(this.A0G);
        }
        if (TextUtils.isEmpty(this.A06.A0B())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        this.A09.setRating(Float.parseFloat(this.A06.A0B()));
        if (this.A06.A08() == null) {
            return;
        }
        this.A04.setText(A01(0, 1, 41) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A06.A08())) + A01(1, 1, 56));
    }

    private final void A0A() {
        setWeightSum(5.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = !super.A03 ? 4.0f : 3.0f;
        layoutParams.bottomMargin = A0L - A0O;
        super.A06.setLayoutParams(layoutParams);
        XP.A0H(super.A06);
        addView(super.A06);
        if (!super.A03) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, A0M);
            layoutParams2.bottomMargin = A0L / 2;
            layoutParams2.weight = 1.0f;
            layoutParams2.gravity = 80;
            super.A08.setLayoutParams(layoutParams2);
            super.A08.setMinWidth(A0N);
            XP.A0H(super.A08);
            addView(super.A08);
        } else if (super.A00 != null) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
            layoutParams3.weight = 2.0f;
            super.A00.setLayoutParams(layoutParams3);
            super.A00.requestLayout();
        }
        XP.A0H(this.A0G);
        LinearLayout.LayoutParams socialContextParams = new LinearLayout.LayoutParams(-1, -1);
        socialContextParams.topMargin = 0;
        socialContextParams.bottomMargin = A0P;
        this.A0D.addView(this.A0G, socialContextParams);
        this.A0D.setPadding(0, 0, 0, 0);
        this.A0G.setGravity(3);
    }

    private final void A0B() {
        super.A06.setLayoutParams(AbstractC1728Zv.A0B);
        A04();
        A03();
        if (!super.A03) {
            A02();
        } else {
            A06();
        }
        A07();
        A08();
        XP.A0H(super.A06);
        if (!super.A03) {
            KE ke2 = super.A08;
            if (A0K[5].length() == 26) {
                throw new RuntimeException();
            }
            A0K[5] = "AjTT";
            XP.A0H(ke2);
        }
        addView(super.A06);
        if (!super.A03) {
            KE ke3 = super.A08;
            if (A0K[4].length() != 24) {
                addView(ke3);
            } else {
                A0K[4] = "rq1KML2CIBWnAolyigIp8Fd7";
                addView(ke3);
            }
        } else if (super.A00 != null) {
            addView(super.A00);
        }
        XP.A0H(this.A0G);
        addView(this.A0G);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final void A0g() {
        super.A0g();
        this.A09.setOnClickListener(super.A05);
        this.A0G.setOnClickListener(super.A05);
        this.A04.setOnClickListener(super.A05);
        this.A03.setOnClickListener(super.A05);
        this.A05.setOnClickListener(super.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final void A0h(int i10) {
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        this.A0A = z10;
        setOrientation(this.A0A ? 1 : 0);
        A0i();
        bringToFront();
    }

    public final void A0i() {
        removeAllViews();
        if (this.A0A) {
            A0B();
        } else {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final View getExpandableLayout() {
        return this.A0D;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0G.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public void setInfo(C1398Mw c1398Mw, C1401Mz c1401Mz, String str, String str2, InterfaceC1650Wv interfaceC1650Wv, InterfaceC1737a4 interfaceC1737a4) {
        super.setInfo(c1398Mw, c1401Mz, str, str2, interfaceC1650Wv, interfaceC1737a4);
        this.A06 = c1398Mw;
        this.A08 = c1401Mz;
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public void setTitleMaxLines(int i10) {
        this.A05.setMaxLines(i10);
        this.A05.setEllipsize(TextUtils.TruncateAt.END);
    }
}
