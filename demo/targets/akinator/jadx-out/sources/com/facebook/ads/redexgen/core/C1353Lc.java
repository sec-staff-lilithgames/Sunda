package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1353Lc extends RelativeLayout implements InterfaceC1669Xo {
    public static byte[] A0b;
    public static String[] A0c = {"HOR7o31Iej4cYWuhQXExnEuENMywT0cc", "lMe4cl58LNQGNUAHyasApQ9JUE0svDiV", "D3sd2x1kxAGmbwUwbgSwAdGIbJmc5gOO", "0qcoppWNPh", "IKOWodR4Z8ze5gnDmb", "KTSiIx6w", "wnW3I4EzpNnUTo4gipPMifUFglZZiY67", "f8O"};
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final RelativeLayout.LayoutParams A0q;
    public View A00;
    public RelativeLayout A01;
    public RelativeLayout A02;
    public Toast A03;
    public R0 A04;
    public C1634Wd A05;
    public KE A06;
    public C1916cz A07;
    public C1934dI A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AbstractC2212hy A0I;
    public final NB A0J;
    public final R6 A0K;
    public final C1937dL A0L;
    public final US A0M;
    public final C1580Ua A0N;
    public final C1634Wd A0O;
    public final XC A0P;
    public final InterfaceC1668Xn A0Q;
    public final YY A0R;
    public final InterfaceC1748aH A0S;
    public final C1749aI A0T;
    public final C1921d4 A0U;
    public final AtomicBoolean A0V;
    public final AtomicBoolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final AbstractC1667Xm A0a;

    public static String A0D(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0b, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0N() {
        A0b = new byte[]{124, 85, 123, 83, 69, 67, 83, 125, 49, 62, 59, 49, 57, 13, 61, 32, 59, 53, 59, 60, 15, 0, 5, 15, 7, 51, 31, 3, 25, 30, 15, 9, 62, 57, 35, 50, 37, 36, 35, 62, 35, 62, 54, 59, 87, 88, 77, 80, 79, 92, 102, 90, 85, 80, 90, 82, 65, 93, 80, 82, 84, 92, 84, 95, 69, 104, AbstractJsonLexerKt.TC_INVALID, 109, 123, 104, 126, AbstractJsonLexerKt.TC_INVALID, 126, 69, 108, 115, 126, AbstractJsonLexerKt.TC_INVALID, 117, 30, 12, 11, 31, 0, 12, 30, 54, 10, 5, 0, 10, 2};
    }

    static {
        A0N();
        A0o = (int) (AbstractC1640Wl.A02 * 64.0f);
        A0g = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0p = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0e = (int) (AbstractC1640Wl.A02 * 10.0f);
        A0q = new RelativeLayout.LayoutParams(-1, -1);
        A0h = (int) (AbstractC1640Wl.A02 * 48.0f);
        A0i = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0n = (int) (AbstractC1640Wl.A02 * 14.0f);
        A0l = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0m = OP.A02(-1, 77);
        A0d = (int) (AbstractC1640Wl.A02 * 8.0f);
        A0j = (int) (AbstractC1640Wl.A02 * 20.0f);
        A0k = (int) (AbstractC1640Wl.A02 * 13.0f);
        A0f = (int) (AbstractC1640Wl.A02 * 8.0f);
    }

    public C1353Lc(C1937dL c1937dL, US us, InterfaceC1668Xn interfaceC1668Xn, AbstractC2212hy abstractC2212hy, String str, YY yy, C1916cz c1916cz) {
        this(c1937dL, us, interfaceC1668Xn, abstractC2212hy, str, yy, false, c1916cz);
    }

    public C1353Lc(C1937dL c1937dL, US us, InterfaceC1668Xn interfaceC1668Xn, AbstractC2212hy abstractC2212hy, String str, YY yy, boolean z10, C1916cz c1916cz) {
        int iA08;
        super(c1937dL);
        String strA0D = A0D(0, 0, 113);
        this.A0A = strA0D;
        this.A09 = strA0D;
        this.A0K = new C1371Lu(this);
        this.A0W = new AtomicBoolean(false);
        this.A0V = new AtomicBoolean(false);
        this.A0F = false;
        this.A0H = true;
        this.A0C = false;
        this.A0B = false;
        this.A0Z = z10;
        this.A0L = c1937dL;
        this.A0Q = interfaceC1668Xn;
        this.A0M = us;
        this.A0I = abstractC2212hy;
        this.A0J = abstractC2212hy.A20().A0H().A07();
        this.A0N = new C1580Ua(this.A0I.A25(), this.A0M);
        this.A0R = yy;
        this.A08 = new C1934dI(c1937dL, this.A0R, str, this.A0Q);
        if (abstractC2212hy.A20().A0H().A07() != null) {
            this.A0D = abstractC2212hy.A20().A0H().A07().A0N();
            this.A0A = abstractC2212hy.A20().A0H().A07().A0H();
            this.A09 = abstractC2212hy.A20().A0H().A07().A0G();
        }
        this.A0E = this.A0I.A20().A0S() && this.A0I.A20().A0H().A03() > 0;
        this.A0Y = this.A0I.A20().A0H().A0B();
        if (this.A0J == null) {
            this.A0Q.A4b(this.A0R.A7t());
            this.A0Q.A4b(this.A0R.A7o());
        }
        if (this.A0J != null) {
            if (!this.A0J.A0P()) {
                if (this.A0E && this.A0Y) {
                    iA08 = this.A0I.A20().A0H().A03();
                } else {
                    iA08 = this.A0J.A07();
                }
            } else {
                iA08 = this.A0J.A08();
            }
        } else {
            iA08 = 0;
        }
        this.A0W.set(!this.A0J.A0L());
        C1371Lu c1371Lu = null;
        this.A0O = new C1634Wd(iA08, new C1355Le(this, c1371Lu));
        this.A0X = U7.A0o(this.A0L);
        this.A0a = A07();
        if (this.A0J.A0P()) {
            this.A0a.A06();
        }
        this.A0U = new C1921d4(this.A0L, this.A0M, this.A0I);
        AbstractC1758aR.A00(c1937dL, this, abstractC2212hy.A20().A0H().A08());
        this.A0P = new XC(this);
        this.A0P.A05(XB.A02);
        if (U7.A2D(this.A0L)) {
            this.A0a.setProgressSpinnerInvisible(true);
        }
        C1354Ld c1354Ld = new C1354Ld(this, c1371Lu);
        if (c1916cz == null) {
            HashMap map = new HashMap();
            map.put(A0D(56, 9, 90), this.A0R.A8d());
            this.A07 = new C1916cz(this.A0L, this.A0I, this.A0J, this.A0M, c1354Ld, map);
        } else {
            this.A07 = c1916cz;
            this.A07.setPlayableAdsViewListener(c1354Ld);
        }
        A0K();
        this.A0Q.A3x(this, new RelativeLayout.LayoutParams(-1, -1));
        A0H();
        this.A0S = new C1368Lr(this);
        this.A0T = new C1749aI(this.A0L, this.A0a, this.A0I, (E1) null, this.A0Q, this.A0S, this.A06, this.A01, this.A07);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        if (this.A0J.A0P()) {
            this.A0L.A0F().ADq();
        }
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0L, this.A0Q, this.A0N, 0, this.A0I.A1t(), this.A0D);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A0A(this.A0I.A1z().A01(), KE.A05(this.A0I));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0I.A23(), this.A0I.A25(), this.A0J.A07(), this.A0I.A24());
        fullScreenAdToolbar.setToolbarListener(new C1356Lf(this));
        return fullScreenAdToolbar;
    }

    private KE A09() {
        if (this.A07 == null || this.A07.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        KE ke2 = new KE(this.A0L, this.A0R.A7E(), this.A0I.A1z().A01(), this.A0M, this.A0Q, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0I.A21());
        XP.A0I(ke2);
        ke2.setText(this.A0I.A20().A0J().A04());
        ke2.setTextSize(14.0f);
        ke2.setPadding(A0e, A0e, A0e, A0e);
        ke2.setOnClickListener(new YD(this));
        return ke2;
    }

    private C1757aQ A0B() {
        C1937dL c1937dL = this.A0L;
        C1400My c1400MyA01 = this.A0I.A1z().A01();
        int i10 = !this.A0E ? 16 : 17;
        boolean z10 = this.A0E;
        String[] strArr = A0c;
        if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0c;
        strArr2[7] = "YLS";
        strArr2[4] = "sNsC3VBoYaF6TxGjee";
        C1757aQ c1757aQ = new C1757aQ(c1937dL, c1400MyA01, true, i10, !z10 ? 14 : 13, 0);
        c1757aQ.A04(this.A0I.A20().A0I().A0F(), this.A0I.A20().A0I().A0E(), null, false, true);
        TextView descriptionTv = c1757aQ.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c1757aQ.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c1757aQ;
    }

    private void A0G() {
        String strA01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0h, A0h);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C1751aK c1751aK = new C1751aK(this.A0L);
        XP.A0K(c1751aK, 0);
        XP.A0I(c1751aK);
        new KZ(c1751aK, this.A0L).A05(A0h, A0h).A07(this.A0I.A23().A01());
        TextView textView = new TextView(this.A0L);
        XP.A0I(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0I.A1z().A01().A07(true));
        textView.setText(this.A0I.A20().A0I().A0F());
        textView.setTextSize(!this.A0D ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C1753aM c1753aM = new C1753aM(this.A0L, !this.A0D ? A0n : A0l, 5, A0m, -1);
        c1753aM.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0L);
        textView2.setTextColor(this.A0I.A1z().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!this.A0D) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0f;
        LinearLayout linearLayout = new LinearLayout(this.A0L);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0i);
        layoutParams4.topMargin = A0f / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(c1753aM, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        ratingInfoContainerParams.leftMargin = A0f;
        ratingInfoContainerParams.addRule(1, c1751aK.getId());
        ratingInfoContainerParams.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        if (this.A02 != null) {
            this.A02.removeAllViews();
            this.A02.addView(relativeLayout, ratingInfoContainerParams);
            this.A02.addView(c1751aK, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0I.A20().A0I().A0B())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c1753aM.setRating(Float.parseFloat(this.A0I.A20().A0I().A0B()));
        if (this.A0I.A20().A0I().A08() == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0D(0, 1, 63));
        if (!this.A0D) {
            strA01 = NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0I.A20().A0I().A08()));
        } else {
            strA01 = AbstractC1649Wu.A01(Integer.parseInt(this.A0I.A20().A0I().A08()));
        }
        sb2.append(strA01);
        sb2.append(A0D(1, 1, 23));
        textView2.setText(sb2.toString());
    }

    private void A0H() {
        if (this.A0J.A0L()) {
            A0J();
        } else {
            A0M();
        }
        this.A0P.A05(XB.A03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0G = true;
        if (this.A0I.A20().A0S()) {
            this.A08.A05();
            this.A0Q.A4c(this.A0R.A6d(), new C09033d(0, 0));
        }
    }

    private void A0J() {
        C1888cX c1888cXA0F = new C1886cV(this.A0L, this.A0I.A20().A0I(), this.A0I.A23()).A0A(this.A0I.A1z().A01()).A0D(this.A0J.A0J()).A0C(this.A0J.A0E()).A09(2000).A0E(this.A0D).A0B(this.A0A).A0F();
        AbstractC1582Uc.A04(c1888cXA0F, this.A0N, UZ.A0U);
        addView(c1888cXA0F, A0q);
        c1888cXA0F.A04(new C1366Lp(this));
    }

    private void A0K() {
        RelativeLayout.LayoutParams layoutParams;
        this.A06 = A09();
        this.A01 = new RelativeLayout(getContext());
        XP.A0I(this.A01);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(A0g, A0p, A0g, A0p);
        layoutParams2.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        XP.A0I(this.A02);
        if (this.A0X) {
            A0G();
        } else {
            RelativeLayout relativeLayout = this.A02;
            C1757aQ c1757aQA0B = A0B();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(c1757aQA0B, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, A0g, 0);
        this.A01.addView(this.A02, layoutParams3);
        if (this.A06 != null) {
            KE ke2 = this.A06;
            String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            A0c[3] = InneractiveMediationDefs.GENDER_FEMALE;
            layoutParams3.addRule(0, ke2.getId());
            if (!this.A0D) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(6, this.A02.getId());
                layoutParams.addRule(8, this.A02.getId());
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                XP.A0Q(this.A06, XP.A06(-16738826, A0d));
                this.A06.setStateListAnimator(null);
                this.A06.setPadding(A0j, A0k, A0j, A0k);
                XP.A0V(this.A06);
            }
            layoutParams.addRule(11);
            this.A01.addView(this.A06, layoutParams);
        }
        XP.A0I(this.A0a);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-1, -2);
        adWebViewParams.addRule(10);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-1, -1);
        iconAndMetaDataContainerParams.setMargins(A0g, 0, A0g, 0);
        iconAndMetaDataContainerParams.addRule(3, this.A0a.getId());
        iconAndMetaDataContainerParams.addRule(2, this.A01.getId());
        this.A0a.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0a, adWebViewParams);
        addView(this.A07, iconAndMetaDataContainerParams);
        addView(this.A01, layoutParams2);
        if (!this.A0J.A0M() && this.A0J.A0O()) {
            this.A07.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        new C1580Ua(this.A0I.A25(), this.A0M).A04(UZ.A0z, null);
        this.A0V.set(true);
        XP.A0R(this);
        XP.A0F(this.A07);
        XP.A0Z(this.A0T, this.A00, this.A07);
        if (this.A0D) {
            if (this.A0X) {
                XP.A0F(this.A0a);
            }
        } else {
            XP.A0J(this.A0a);
        }
        XP.A0J(this.A06);
        Pair<EnumC1920d3, View> pairA03 = this.A0U.A03(this.A06);
        this.A00 = (View) pairA03.second;
        switch (YE.A00[((EnumC1920d3) pairA03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, this.A0a.getToolbarHeight(), 0, 0);
                if (!this.A0D) {
                    XP.A0J(this.A01);
                    if (this.A01 != null) {
                        layoutParams.addRule(2, this.A01.getId());
                    }
                    addView(this.A00, layoutParams);
                    break;
                } else {
                    addView(new C1881cQ(this.A0L, this.A0I.A23(), this.A0I.A20().A0I(), A09(), this.A09, new YC(this)), new RelativeLayout.LayoutParams(-1, -1));
                    removeView(this.A0a);
                    break;
                }
            case 2:
                if (this.A01 != null) {
                    View[] viewArr = new View[1];
                    RelativeLayout relativeLayout = this.A01;
                    String[] strArr = A0c;
                    if (strArr[7].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0c;
                    strArr2[6] = "qNCG6dDJsAPFbWTySRxInyS8ppXyMF33";
                    strArr2[1] = "jWdNFAVobp8QAHjjZXwWCxlFqJ2u0nxR";
                    viewArr[0] = relativeLayout;
                    XP.A0Z(viewArr);
                }
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
                break;
        }
        if (this.A0J.A0P()) {
            this.A0L.A0F().ADl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        XP.A0R(this);
        if (!this.A0J.A0M() && !this.A0J.A0O()) {
            this.A07.A0B();
        }
        AbstractC1667Xm abstractC1667Xm = this.A0a;
        if (A0c[3].length() == 2) {
            throw new RuntimeException();
        }
        String[] strArr = A0c;
        strArr[6] = "O2ZpTY6Mgvz2uHPZTA3aMJEeHq37vzsd";
        strArr[1] = "1283TMQOTifPKRDoGDlRbVjXtyZxpzop";
        abstractC1667Xm.setVisibility(0);
        this.A07.setVisibility(0);
        if (this.A01 != null) {
            this.A01.setVisibility(0);
        }
        if (this.A06 != null && this.A0I.A1w() > 0 && this.A05 == null) {
            this.A05 = new C1634Wd(this.A0I.A1w(), new C1357Lg(this));
            this.A05.A07();
        }
        this.A0O.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(int i10) {
        String strValueOf = String.valueOf(i10);
        Toast toast = this.A03;
        String strA0D = this.A0J.A0D();
        String progress = A0D(2, 6, 75);
        XP.A0X(toast, strA0D.replace(progress, strValueOf), 49, 0, A0o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U(boolean z10, String str) throws PackageManager.NameNotFoundException, RemoteException {
        this.A0C = true;
        HashMap map = new HashMap();
        map.put(A0D(8, 12, 57), z10 ? A0D(79, 13, 2) : A0D(44, 12, 82));
        map.put(A0D(20, 12, 7), str);
        new a5(this.A0L, this.A0R.A7E(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0M, this.A0I.A21(), this.A0Q).A05(this.A0I.A25(), this.A0I.A20().A0J().A05(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0V() {
        return this.A0I.A0v().equals(A0D(65, 14, 113)) || (this.A0I.A0v().equals(A0D(32, 12, 60)) && this.A0I.A20().A0V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0W() {
        return this.A0Y && !this.A0F && !this.A0H && this.A0J.A07() < this.A0I.A20().A0H().A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) {
        this.A04 = r02;
        this.A04.A0A(this.A0K);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AEV(boolean z10) {
        this.A0O.A06();
        this.A0B = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AF0(boolean z10) {
        if ((!this.A0Y || !this.A0H) && !this.A0F) {
            boolean z11 = this.A0W.get();
            String[] strArr = A0c;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0c;
            strArr2[0] = "5YF9hd1VnayjDYXn8X9NIXHiJcVpNWhU";
            strArr2[2] = "6mHNY01g6eF3bUPoEn1oonlPgYyDS663";
            if (z11) {
                C1634Wd c1634Wd = this.A0O;
                String[] strArr3 = A0c;
                if (strArr3[6].charAt(22) != strArr3[1].charAt(22)) {
                    String[] strArr4 = A0c;
                    strArr4[7] = "SY9";
                    strArr4[4] = "T1jNCZgiG5fRSAcWDF";
                    if (c1634Wd.A05()) {
                        return;
                    }
                } else {
                    String[] strArr5 = A0c;
                    strArr5[7] = "0UX";
                    strArr5[4] = "cSjXeSxWsZqlnq3791";
                    if (c1634Wd.A05()) {
                        return;
                    }
                }
                this.A0O.A07();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public String getCurrentClientToken() {
        return this.A0I.A25();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void onDestroy() {
        this.A0P.A03();
        if (this.A04 != null) {
            this.A04.A0B(this.A0K);
        }
        if (this.A07 != null) {
            if (!TextUtils.isEmpty(this.A0I.A25())) {
                this.A0M.AAt(this.A0I.A25(), new C1722Zp().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0O.A06();
        this.A0a.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            AF0(false);
        } else {
            AEV(false);
        }
    }

    public void setListener(InterfaceC1668Xn interfaceC1668Xn) {
    }

    public void setServerSideRewardHandler(C1934dI c1934dI) {
        this.A08 = c1934dI;
    }
}
