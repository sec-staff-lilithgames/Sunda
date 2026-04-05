package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09555d extends AbstractC1321Jw {
    public static byte[] A0L;
    public static String[] A0M = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public View A00;
    public View A01;
    public ImageView A02;
    public C1937dL A03;
    public C1634Wd A04;
    public AbstractC1667Xm A05;
    public AbstractC1667Xm A06;
    public AbstractC1771ae A07;
    public C1921d4 A08;
    public C1927dA A09;
    public CU A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final Handler A0E;
    public final InterfaceC1668Xn A0F;
    public final InterfaceC1748aH A0G;
    public final C1749aI A0H;
    public final C1775ai A0I;
    public final E1 A0J;
    public final C1140Cw A0K;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{-23, -117, 1, -6, 15, -2, 24, 12, 13, -6, 11, 13, 2, 7, 0, 24, -6, 7, 2, 6, -6, 13, 2, 8, 7, 12, 24, 9, 5, -6, 18, -2, -3, 26, 29, 33, 19, 45, 32, 19, 37, 15, 32, 18, 45, 33, 17, 32, 19, 19, 28, 45, 33, 22, 29, 37, 28, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    static {
        A0C();
        A0Q = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0b = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0N = (int) (AbstractC1640Wl.A02 * 8.0f);
        A0O = (int) (AbstractC1640Wl.A02 * 10.0f);
        A0W = (int) (AbstractC1640Wl.A02 * 20.0f);
        A0X = (int) (AbstractC1640Wl.A02 * 13.0f);
        A0R = (int) (AbstractC1640Wl.A02 * 48.0f);
        A0a = (int) (AbstractC1640Wl.A02 * 14.0f);
        A0Y = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0P = (int) (AbstractC1640Wl.A02 * 8.0f);
        A0Z = OP.A02(-1, 77);
        A0V = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0c = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0S = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0T = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0U = (int) (AbstractC1640Wl.A02 * 48.0f);
    }

    public C09555d(C1775ai c1775ai) {
        super(c1775ai, false);
        this.A0D = new Handler(Looper.getMainLooper());
        this.A0E = new Handler(Looper.getMainLooper());
        this.A0C = false;
        this.A0B = false;
        this.A03 = c1775ai.A06();
        this.A06 = c1775ai.A0C();
        this.A05 = c1775ai.A0B();
        this.A0I = c1775ai;
        this.A01 = new View(this.A03);
        XP.A0I(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A09();
        this.A0F = c1775ai.A0D();
        AbstractC1758aR.A00(c1775ai.A06(), this, getAdInfo().A0H().A08());
        this.A0J = A01(c1775ai);
        XP.A0I(this.A0J);
        getAdDetailsView().bringToFront();
        if (!A03()) {
            this.A0K = A02(c1775ai);
        } else {
            this.A0K = null;
        }
        if (getAdDataBundle().A1l()) {
            if (this.A0K != null) {
                this.A0K.setVisibility(8);
            }
            getAdDetailsView().setVisibility(8);
            A08();
        }
        A1R();
        this.A08 = new C1921d4(this.A03, c1775ai.A07(), getAdDataBundle());
        this.A0G = new C1317Js(this);
        this.A0H = new C1749aI(c1775ai, getAdDataBundle(), this.A0J, this.A0K, getAdDetailsView(), this.A0F, this.A0G);
        C1635Wg c1635WgA02 = super.A09.A02(getAdDataBundle());
        this.A03.A0H().A00(c1635WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A09);
        if (c1635WgA02.A00) {
            this.A0J.getVideoImplView().setOnClickListener(new ViewOnClickListenerC1778al(this));
        } else if (U7.A1K(getAdContextWrapper())) {
            AbstractC1725Zs.A00(this.A0J.getVideoImplView(), U7.A1L(getAdContextWrapper()), new ViewOnClickListenerC1779am(this));
        }
        if (c1775ai.A05().A1f()) {
            if (this.A0I.A05().A1i()) {
                this.A07 = new JR(c1775ai);
            } else {
                this.A07 = new JS(c1775ai);
            }
            View view = this.A07;
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private E1 A01(C1775ai c1775ai) {
        RelativeLayout.LayoutParams layoutParams;
        E1 e12 = (E1) c1775ai.A02();
        int iA1O = A1O(c1775ai.A0C());
        this.A02 = (ImageView) c1775ai.A03();
        if (!A03()) {
            ImageView imageView = this.A02;
            int i10 = AbstractC1321Jw.A0M;
            int i11 = AbstractC1321Jw.A0M;
            int toolbarHeight = AbstractC1321Jw.A0M;
            imageView.setPadding(i10, i11, toolbarHeight, AbstractC1321Jw.A0M);
            int toolbarHeight2 = AbstractC1321Jw.A0N;
            layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC1321Jw.A0N);
            int toolbarHeight3 = AbstractC1321Jw.A0L;
            layoutParams.setMargins(0, iA1O, toolbarHeight3, 0);
            layoutParams.addRule(11);
        } else {
            int toolbarHeight4 = AbstractC1771ae.A0J;
            layoutParams = new RelativeLayout.LayoutParams(toolbarHeight4, AbstractC1771ae.A0J);
            int i12 = A0T;
            int i13 = A0U;
            int toolbarHeight5 = A0T;
            layoutParams.setMargins(i12, i13, toolbarHeight5, A0S);
            layoutParams.addRule(9);
        }
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1l() && e12 != null) {
            View videoView = e12.getVideoView();
            int paddingLeft = e12.getVideoView().getPaddingLeft();
            int paddingTop = e12.getVideoView().getPaddingTop();
            int paddingRight = e12.getVideoView().getPaddingRight();
            int toolbarHeight6 = e12.getVideoView().getPaddingBottom();
            videoView.setPadding(paddingLeft, paddingTop, paddingRight, toolbarHeight6 + A0c);
        }
        layoutParams2.addRule(13);
        addView(e12, layoutParams2);
        e12.addView(this.A02, layoutParams);
        return e12;
    }

    private C1140Cw A02(C1775ai c1775ai) {
        C1140Cw c1140CwA0F = c1775ai.A0F();
        c1140CwA0F.A08(-1, AbstractC1321Jw.A0E, false);
        c1140CwA0F.setPadding(AbstractC1321Jw.A0Q, AbstractC1321Jw.A0Q, AbstractC1321Jw.A0Q, AbstractC1321Jw.A0Q);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1321Jw.A0P);
        progressBarLayoutParams.addRule(12);
        addView(c1140CwA0F, progressBarLayoutParams);
        return c1140CwA0F;
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A09 != null) {
            addView(this.A09.A0T(), layoutParams);
        }
    }

    private void A05() {
        addView(new C1787au(this.A0I.A06(), getAdDataBundle(), this.A0I.A08(), this.A0E, this.A0I.A0D()).A09(getCtaButton()));
    }

    private void A06() {
        XP.A0Z(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0H, this.A0I.A0C());
        for (InterfaceC1954dc interfaceC1954dc : this.A0J.getPlugins()) {
            if (interfaceC1954dc instanceof C2R) {
                this.A0J.A0j(interfaceC1954dc);
                return;
            }
        }
    }

    private void A07() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0H();
            this.A0J.A0j(getAnimationPlugin());
        }
    }

    private void A08() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        A0D(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0Q, 0);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0Q, A0b, A0Q, A0b);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        KE ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A1j()) {
            ctaButton.setPadding(A0O, A0O, A0O, A0O);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            XP.A0Q(ctaButton, XP.A06(-16738826, A0N));
            ctaButton.setPadding(A0W, A0X, A0W, A0X);
            ctaButton.setStateListAnimator(null);
            XP.A0V(ctaButton);
        }
        layoutParams.addRule(11);
        if (ctaButton.getParent() != null) {
            XP.A0Z(ctaButton);
        }
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A09() {
        if (this.A06 == null) {
            return;
        }
        this.A0A = new CU(this.A06, 400, -this.A06.getToolbarHeight(), 0);
    }

    private void A0A() {
        new C1580Ua(getAdDataBundle().A25(), getAdEventManager()).A04(UZ.A0z, null);
        if (!getAdInfo().A0V()) {
            return;
        }
        super.A0A.set(true);
        XP.A0R(this);
        XP.A0Z(this.A0K, this.A0H, this.A00);
        XP.A0J(this.A06);
        Pair<EnumC1920d3, View> pairA03 = this.A08.A03(getCtaButton());
        this.A00 = (View) pairA03.second;
        A0E((EnumC1920d3) pairA03.first);
        if (getAdInfo().A0K().A00() >= 0) {
            this.A0B = true;
            if (this.A06 != null) {
                this.A06.setToolbarActionMode(getAdDataBundle().A2G() ? 8 : 2);
                this.A06.setProgressImmediate(0.0f);
            }
            this.A04 = new C1634Wd((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1315Jq(this));
            this.A04.A07();
        }
    }

    private void A0B() {
        if (this.A0A != null) {
            this.A0A.A42(true, false);
        }
        if (!A03() && !getAdDataBundle().A1l() && getAdDetailsAnimation() != null) {
            CU adDetailsAnimation = getAdDetailsAnimation();
            String[] strArr = A0M;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            A0M[1] = "NNplzEPPEJhw482VYN3vhqCWu3reteuX";
            adDetailsAnimation.A42(true, false);
        }
    }

    private void A0D(RelativeLayout relativeLayout) {
        int i10;
        String formattingRatingCount;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0R, A0R);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C1751aK c1751aK = new C1751aK(this.A03);
        XP.A0K(c1751aK, 0);
        XP.A0I(c1751aK);
        new KZ(c1751aK, this.A03).A05(A0R, A0R).A07(getAdDataBundle().A23().A01());
        TextView textView = new TextView(this.A03);
        XP.A0I(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A1z().A01().A07(true));
        textView.setText(getAdDataBundle().A20().A0I().A0F());
        textView.setTextSize(!getAdDataBundle().A1j() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C1937dL c1937dL = this.A03;
        if (!getAdDataBundle().A1j()) {
            i10 = A0a;
        } else {
            i10 = A0Y;
        }
        C1753aM c1753aM = new C1753aM(c1937dL, i10, 5, A0Z, -1);
        c1753aM.setGravity(16);
        LinearLayout.LayoutParams ratingCountParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(getAdDataBundle().A1z().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1j()) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0P;
        LinearLayout linearLayout = new LinearLayout(this.A03);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, A0V);
        ratingInfoContainerParams.topMargin = A0P / 2;
        ratingInfoContainerParams.addRule(3, textView.getId());
        linearLayout.addView(c1753aM, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams iconParams = new RelativeLayout.LayoutParams(-2, -2);
        iconParams.leftMargin = A0P;
        iconParams.addRule(1, c1751aK.getId());
        iconParams.addRule(15);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, ratingInfoContainerParams);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, iconParams);
        relativeLayout.addView(c1751aK, layoutParams);
        if (TextUtils.isEmpty(getAdDataBundle().A20().A0I().A0B())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c1753aM.setRating(Float.parseFloat(getAdDataBundle().A20().A0I().A0B()));
        if (getAdDataBundle().A20().A0I().A08() == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A03(0, 1, 108));
        if (!getAdDataBundle().A1j()) {
            formattingRatingCount = NumberFormat.getNumberInstance().format(Integer.parseInt(getAdDataBundle().A20().A0I().A08()));
        } else {
            formattingRatingCount = AbstractC1649Wu.A01(Integer.parseInt(getAdDataBundle().A20().A0I().A08()));
        }
        sb2.append(formattingRatingCount);
        String formattingRatingCount2 = A03(1, 1, 13);
        sb2.append(formattingRatingCount2);
        String formattingRatingCount3 = sb2.toString();
        textView2.setText(formattingRatingCount3);
    }

    private void A0E(EnumC1920d3 enumC1920d3) {
        if (!getAdDataBundle().A20().A0K().A02().isEmpty()) {
            if (getAdDataBundle().A20().A0K().A03()) {
                this.A09 = new C1927dA(this.A03, getAdDataBundle(), this.A0F, getCtaButton(), this.A0E, this.A0I.A08());
                XP.A0Z(this.A06, getAdDetailsView(), this.A02);
                A04();
                return;
            }
        } else if (getAdDataBundle().A20().A0K().A03() || getAdDataBundle().A20().A0K().A04()) {
            A06();
            A05();
            return;
        }
        A0F(enumC1920d3);
    }

    private void A0F(EnumC1920d3 enumC1920d3) {
        this.A0J.A0k(false);
        this.A0J.setVisibility(8);
        if (this.A06 instanceof C1419Nr) {
            AbstractC1667Xm abstractC1667Xm = this.A05;
            if (A0M[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "VBTxPCVQSRRVVKfJEBHdIagRaEa9moGI";
            strArr[6] = "iS4EeCSjafPAdymtQeFXdNKcyC2MGxGr";
            if (abstractC1667Xm != null) {
                XP.A0F(this.A06);
                this.A06 = this.A05;
                XP.A0J(this.A06);
            }
        }
        switch (enumC1920d3) {
            case A03:
                AbstractC1728Zv oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
                if (A0M[4].charAt(31) != 'A') {
                    A0M[2] = "XFfDcp5VJF8GQaNSTNs87nOmJmOzmbPV";
                    if (oldEndCardAdDetailsView == null) {
                        AbstractC1728Zv oldEndCard = getAdDetailsView();
                        oldEndCard.setVisibility(0);
                    } else {
                        addView(oldEndCardAdDetailsView);
                    }
                    RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
                    screenshotParams.setMargins(0, A1O(this.A06), 0, 0);
                    if (oldEndCardAdDetailsView != null) {
                        screenshotParams.addRule(2, oldEndCardAdDetailsView.getId());
                    } else {
                        AbstractC1728Zv oldEndCard2 = getAdDetailsView();
                        screenshotParams.addRule(2, oldEndCard2.getId());
                    }
                    addView(this.A00, screenshotParams);
                    return;
                }
                throw new RuntimeException();
            case A02:
                XP.A0Z(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(AbstractC1321Jw.A0O, AbstractC1321Jw.A0O, AbstractC1321Jw.A0O, AbstractC1321Jw.A0O);
                addView(this.A00, layoutParams);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw, com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1B() throws RemoteException {
        super.A1B();
        A07();
        getAdDetailsView().A0f();
        this.A0E.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw, com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1G(C1391Mp c1391Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1391Mp, str, d10, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(2, 31, 100), false)) {
            A0B();
        }
        if (bundle.getBoolean(A03(57, 18, 77), false)) {
            A0A();
        }
        if (bundle.getBoolean(A03(33, 24, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), false)) {
            this.A0H.A07(this);
        }
        if (A03()) {
            boolean z10 = getAdDetailsView() instanceof KL;
            if (A0M[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "TYF9Gze5okVE8nAMFw0kZuTKWJAG4GPN";
            strArr[6] = "e5C8lQxoH1vEX5uTYGqpe7vBIorNDTyW";
            if (z10) {
                ((KL) getAdDetailsView()).A0l();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1H(C09033d c09033d) {
        super.A1H(c09033d);
        if (A03()) {
            AbstractC1728Zv adDetailsView = getAdDetailsView();
            if (A0M[0].length() == 5) {
                throw new RuntimeException();
            }
            A0M[4] = "m5gTgOd0mlzOyrsuIVxaBMecvKjJBXrq";
            removeView(adDetailsView);
        }
        A0A();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1I(DO r10) {
        super.A1I(r10);
        if (this.A07 != null && this.A07.getVisibility() == 0) {
            return;
        }
        if (A03()) {
            this.A03.A0F().AJw(AbstractC1631Wa.A00((float) this.A0I.A05().A0h()), getResources().getConfiguration().orientation, true, false, MH.A0C(this.A0I.A04()));
        }
        A1Z(getResources().getConfiguration().orientation);
        if (getAdDataBundle().A1W()) {
            this.A0J.setOnClickListener(getCtaButton());
        }
        if (A03()) {
            getAdDetailsView().setVisibility(0);
            if (getAdDetailsView() instanceof KL) {
                ((KL) getAdDetailsView()).A0q(getResources().getConfiguration().orientation);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1J(C3Q c3q, int i10) {
        super.A1J(c3q, i10);
        int videoLengthMs = c3q.A00();
        int remainingVideoTimeInMillis = this.A0J.getDuration();
        int videoLengthMs2 = remainingVideoTimeInMillis - videoLengthMs;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0M()) {
            getAnimationPlugin().A0I();
        }
        if ((getAdDetailsView() instanceof KL) && !this.A0I.A05().A1i()) {
            int currentPosMs = c3q.A00();
            ((KL) getAdDetailsView()).A0o(((remainingVideoTimeInMillis * i10) + currentPosMs) / 1000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A1K() {
        return getAdInfo().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A1M() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A1N(boolean z10) {
        if (z10 && !this.A0C && !super.A0A.get()) {
            this.A0H.A07(this);
            return true;
        }
        if (!getAdInfo().A0V()) {
            return false;
        }
        boolean z11 = super.A0A.get();
        if (A0M[4].charAt(31) == 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
        strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
        if (!z11) {
            this.A0J.A0g(EnumC1945dT.A08);
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw
    public final AbstractC1728Zv A1P(C1775ai c1775ai, C1391Mp c1391Mp, String str) {
        double dA0h = c1775ai.A05().A0h();
        if (A03()) {
            if (E1.A0T((float) dA0h)) {
                return new C09685q(c1775ai.A06(), getCtaButton(), AbstractC1321Jw.A0I, false, getColors(), str, c1775ai.A07(), c1775ai.A0D(), c1775ai.A0G(), c1775ai.A0A(), c1775ai.A05(), c1775ai.A0F(), c1775ai.A08(), false);
            }
            if (E1.A0V((float) dA0h)) {
                return new C09675p(c1775ai.A06(), getCtaButton(), AbstractC1321Jw.A0I, false, getColors(), str, c1775ai.A07(), c1775ai.A0D(), c1775ai.A0G(), c1775ai.A0A(), c1775ai.A05(), c1775ai.A0F(), c1775ai.A08(), false);
            }
            return new C09695r(c1775ai.A06(), getCtaButton(), AbstractC1321Jw.A0I, false, getColors(), str, c1775ai.A07(), c1775ai.A0D(), c1775ai.A0G(), c1775ai.A0A(), c1775ai.A05(), c1775ai.A0F(), c1775ai.A08(), false);
        }
        return new C1323Jy(c1775ai.A06(), getCtaButton(), AbstractC1321Jw.A0J, c1391Mp.A0I().A00() == EnumC1396Mu.A05, getColors(), c1391Mp.A0J().A06(), str, c1775ai.A07(), c1775ai.A0D(), c1775ai.A0G(), c1775ai.A0A(), c1775ai.A05());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw
    public final C1323Jy A1Q(C1775ai c1775ai, C1391Mp c1391Mp, String str) {
        return new C1323Jy(c1775ai.A06(), getCtaButton(), AbstractC1321Jw.A0J, c1391Mp.A0I().A00() == EnumC1396Mu.A05, getColors(), c1391Mp.A0J().A06(), str, c1775ai.A07(), c1775ai.A0D(), c1775ai.A0G(), c1775ai.A0A(), c1775ai.A05());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw
    public final void A1R() {
        super.A1R();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().AAm(this.A0J);
        }
    }

    public final void A1W() {
        getCtaButton().A0E(A03(75, 9, 37));
    }

    public final void A1X() {
        if (getAdDetailsView() instanceof KL) {
            ((KL) getAdDetailsView()).setPlaceHolderTextForRewardsConversion(getAdDataBundle().A14());
        }
    }

    public final void A1Y() {
        new C1580Ua(this.A0I.A05().A25(), getAdEventManager()).A04(UZ.A0h, null);
        if (this.A0I.A0C() != null) {
            AbstractC1667Xm abstractC1667XmA0C = this.A0I.A0C();
            if (A0M[4].charAt(31) == 'A') {
                throw new RuntimeException();
            }
            A0M[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            abstractC1667XmA0C.setVisibility(8);
            removeView(this.A0I.A0C());
        }
        removeView(this.A07);
        removeView(this.A0J);
        A07();
        removeView(getAdDetailsView());
        removeView(this.A0K);
        removeView(this.A00);
        if (this.A09 != null) {
            removeView(this.A09.A0U());
        }
        if (this.A0I.A05().A1i()) {
            A1T();
        } else {
            A1S();
        }
    }

    public final void A1Z(int i10) {
        if (!A03()) {
            return;
        }
        this.A03.A0F().AJy(i10);
        this.A0J.A0c(i10);
        A1U(i10, this.A0J, (RelativeLayout) this.A0J.getVideoView());
    }

    public final void A1a(C09083i c09083i) {
        if (this.A07 != null) {
            if (this.A07 instanceof JR) {
                ((JR) this.A07).A1O(c09083i);
            }
            if (this.A07 instanceof JS) {
                ((JS) this.A07).A1O(c09083i);
            }
            this.A07.A1B();
            AbstractC1771ae abstractC1771ae = this.A07;
            String[] strArr = A0M;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "wl3lZ2t8QgZzPvgxh0a22wDB24cvqHL6";
            strArr2[6] = "goKzKnMqtJl7yehw7GAGrdNRW8UKCTH6";
            removeView(abstractC1771ae);
            this.A07 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public int getCloseButtonStyle() {
        if (this.A0B) {
            if (getAdDataBundle().A2G()) {
                return 8;
            }
            return 2;
        }
        if (A1K() && !super.A0A.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw, com.facebook.ads.redexgen.core.AbstractC1771ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A07 != null) {
            AbstractC1771ae abstractC1771ae = this.A07;
            if (A0M[0].length() == 5) {
                throw new RuntimeException();
            }
            A0M[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (abstractC1771ae.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
                return;
            }
        }
        if (getAdDataBundle().A20().A0K().A03() && this.A09 != null && super.A0A.get()) {
            this.A09.A0W(configuration.orientation);
        }
        if (this.A09 != null || super.A0A.get()) {
            AbstractC1728Zv oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
            if (oldEndCardAdDetailsView != null) {
                oldEndCardAdDetailsView.A0h(configuration.orientation);
                return;
            }
            return;
        }
        A1Z(configuration.orientation);
    }

    public void setVideoAdViewListener(InterfaceC1895ce interfaceC1895ce) {
        if (this.A07 instanceof JR) {
            ((JR) this.A07).setVideoAdViewListener(interfaceC1895ce);
        }
        if (this.A07 instanceof JS) {
            ((JS) this.A07).setVideoAdViewListener(interfaceC1895ce);
        }
    }
}
