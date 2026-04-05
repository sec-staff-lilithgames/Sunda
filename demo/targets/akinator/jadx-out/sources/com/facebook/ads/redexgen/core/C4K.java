package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.4K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4K extends AbstractC1264Hr {
    public static byte[] A0k;
    public static String[] A0l = {"PW", "VMuxnsAFAgr5cT24vzltLNiVzxTvarbU", "jq4GRSBqKMr4rGHs6WabqGWnms1UYtFJ", "ha", "80KuzsseMGT5f9rKVuNW3ow7LLk13v1X", "uG1OElCv3xaCg8aDr811TJkNgBcTan1c", "YwXHrw3Tlq3bJQZfooudgwuoCwRnfSi1", "LVHFB8bkqwAuG3vKzwVN0RmVN3FHwXeF"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public float A00;
    public int A01;
    public ImageView A02;
    public LinearLayout A03;
    public ZH A04;
    public ZP A05;
    public LJ A06;
    public KE A07;
    public C1787au A08;
    public EnumC1953db A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final float A0K;
    public final int A0L;
    public final Handler A0M;
    public final Handler A0N;
    public final MH A0O;
    public final C1400My A0P;
    public final C1937dL A0Q;
    public final C1580Ua A0R;
    public final AbstractC1667Xm A0S;
    public final KL A0T;
    public final InterfaceC1737a4 A0U;
    public final InterfaceC1884cT A0V;
    public final EG A0W;
    public final E1 A0X;
    public final C09083i A0Y;
    public final DX A0Z;
    public final DV A0a;
    public final DR A0b;
    public final DP A0c;
    public final DN A0d;
    public final DM A0e;
    public final D0 A0f;
    public final C1140Cw A0g;
    public final Runnable A0h;
    public final boolean A0i;
    public final boolean A0j;

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0k, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0U() {
        A0k = new byte[]{33, 46, 43, 33, 41, 29, 49, 45, 55, 48, 33, 39, 58, 54, 52, 119, Utf8.REPLACEMENT_BYTE, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 48, 55, 45, 60, 43, 42, 45, 48, 45, 48, 56, 53, 119, 58, 53, 48, 58, 50, 60, 61, 33, 54, 36, 50, 33, 55, 54, 55, 12, 37, 58, 55, 54, 60, 61, 59, 45, 58, 43, 36, 33, 43, 35, 23, 46, 33, 36, 60, 45, 58, 45, 44, 9};
    }

    static {
        A0U();
        A0m = (int) (AbstractC1640Wl.A02 * 4.0f);
        A0s = (int) (AbstractC1640Wl.A02 * 32.0f);
        A0r = (int) (AbstractC1640Wl.A02 * 8.0f);
        A0n = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0o = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0p = (int) (AbstractC1640Wl.A02 * 48.0f);
        A0q = (int) (AbstractC1640Wl.A02 * 64.0f);
        A0t = OP.A02(-1, 77);
        A0u = (int) (AbstractC1640Wl.A02 * 26.0f);
        A0v = (int) (AbstractC1640Wl.A02 * 12.0f);
    }

    public C4K(C1937dL c1937dL, US us, AbstractC1667Xm abstractC1667Xm, AbstractC2212hy abstractC2212hy, SF sf2, YY yy, int i10, InterfaceC1668Xn interfaceC1668Xn, C1580Ua c1580Ua, int i11, boolean z10, boolean z11, InterfaceC1884cT interfaceC1884cT, int i12, int i13) {
        C1400My c1400MyA00;
        super(c1937dL, yy, us, abstractC2212hy, i10, z10, z11, interfaceC1668Xn, i13);
        this.A0F = false;
        this.A0E = false;
        this.A0D = false;
        this.A01 = 0;
        this.A0H = true;
        this.A0J = false;
        this.A0G = false;
        this.A0N = new Handler(Looper.getMainLooper());
        this.A0h = new RunnableC1878cN(this);
        this.A0C = false;
        this.A00 = 0.0f;
        this.A0A = true;
        this.A0d = new DN() { // from class: com.facebook.ads.redexgen.X.4X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r10) {
                if (!this.A00.A0J) {
                    this.A00.A0J = true;
                    this.A00.A0Q.A0F().AJw(AbstractC1631Wa.A00((float) ((AbstractC1264Hr) this.A00).A06.A0h()), this.A00.getResources().getConfiguration().orientation, true, true, MH.A0A());
                    this.A00.A0V(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0T.setVisibility(0);
                    this.A00.A0T.A0q(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0T.bringToFront();
                    this.A00.A0T();
                }
            }
        };
        this.A0c = new DP() { // from class: com.facebook.ads.redexgen.X.4W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (!((AbstractC1264Hr) this.A00).A0A.A07()) {
                    this.A00.A1C();
                }
            }
        };
        this.A0b = new DR() { // from class: com.facebook.ads.redexgen.X.4V
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            public final /* bridge */ /* synthetic */ void A03(C1558Td c1558Td) {
            }
        };
        this.A0e = new DM() { // from class: com.facebook.ads.redexgen.X.4U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Q c3q) {
                this.A00.A0k(c3q);
                this.A00.A0V.ADI((this.A00.A00 * this.A00.A0X.getDuration()) + c3q.A00());
            }
        };
        this.A0Z = new DX() { // from class: com.facebook.ads.redexgen.X.4T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                this.A00.A0V.ACy(this.A00.A0X.getDuration());
                C4K.A01(this.A00, 1.0f);
                this.A00.A0X.A0h(EnumC1953db.A02, 28);
            }
        };
        this.A0a = new C4L(this);
        this.A0U = new G9(this);
        this.A0S = abstractC1667Xm;
        this.A0L = i12;
        this.A0M = new Handler(Looper.getMainLooper());
        this.A0O = MI.A01(c1937dL, us, abstractC2212hy.A25(), WQ.A00(abstractC2212hy.A20().A0J().A05()), new HashMap(), false, true, abstractC2212hy.A21());
        this.A0Q = c1937dL;
        this.A0R = c1580Ua;
        this.A0f = new D0(this.A0Q, this.A0R);
        this.A0g = new C1140Cw(this.A0Q, i12);
        this.A0V = interfaceC1884cT;
        if (i11 == 1) {
            c1400MyA00 = super.A06.A1z().A01();
        } else {
            c1400MyA00 = super.A06.A1z().A00();
        }
        this.A0P = c1400MyA00;
        AbstractC1758aR.A00(this.A0Q, this, abstractC2212hy.A20().A0H().A08());
        this.A0X = new E1(this.A0Q);
        this.A0X.getEventBus().A03(this.A0d, this.A0c, this.A0b, this.A0e, this.A0Z, this.A0a);
        this.A0Y = new C09083i(c1937dL, us, this.A0X, abstractC2212hy.A25());
        A0S();
        String videoUrl = super.A06.A20().A0H().A09();
        this.A0X.setVideoURI(sf2.A0T(videoUrl));
        this.A0K = (float) abstractC2212hy.A0h();
        A0P();
        A0L();
        A0K();
        this.A0T = A0D();
        addView(this.A0T);
        XP.A0I(this.A0T);
        A0R();
        A0Q();
        this.A0T.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        if (U7.A1u(this.A0Q)) {
            InterfaceC1584Ue interfaceC1584UeA0B = this.A0Q.A0B();
            E1 e12 = this.A0X;
            String videoUrl2 = super.A06.A25();
            interfaceC1584UeA0B.AK2(e12, videoUrl2, true);
        }
        if (U7.A1v(this.A0Q)) {
            this.A0W = new EG(this.A0Q, us, this.A0X, super.A06.A25(), false, this.A0Y, null);
        } else {
            this.A0W = null;
        }
        A0a(abstractC2212hy.A20());
        this.A0i = super.A06.A1e();
        this.A0j = super.A06.A1p();
        A0O();
        c1937dL.A0F().ABe(this.A0i, this.A0j, true);
        this.A0f.bringToFront();
    }

    public static /* synthetic */ float A01(C4K c4k, float f10) {
        float f11 = c4k.A00 + f10;
        c4k.A00 = f11;
        return f11;
    }

    public static /* synthetic */ int A03(C4K c4k) {
        int i10 = c4k.A01;
        c4k.A01 = i10 + 1;
        return i10;
    }

    private KL A0D() {
        String strA0I;
        KL c09695r;
        if (super.A06.A0v().equals(A0I(49, 14, 78))) {
            strA0I = EnumC1959dh.A04.A03();
        } else {
            strA0I = A0I(12, 37, 68);
        }
        if (A0t(this.A0K)) {
            c09695r = new C09685q(this.A0Q, this.A07, AbstractC1264Hr.A0G, false, getColors(), strA0I, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0g, this.A0R, true);
        } else if (A0u(this.A0K)) {
            c09695r = new C09675p(this.A0Q, this.A07, AbstractC1264Hr.A0G, false, getColors(), strA0I, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0g, this.A0R, true);
        } else {
            c09695r = new C09695r(this.A0Q, this.A07, AbstractC1264Hr.A0G, false, getColors(), strA0I, super.A08, super.A0B, super.A0D, super.A0A, super.A06, this.A0g, this.A0R, true);
        }
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        c09695r.setVisibility(8);
        c09695r.setChainedAdInfo(super.A00);
        c09695r.setLayoutParams(adDetailsParams);
        return c09695r;
    }

    private void A0J() {
        this.A08 = new C1787au(this.A0Q, super.A06, this.A0R, this.A0N, super.A0B);
        this.A08.A0D(false);
        addView(this.A08.A09(getRegularCtaForEndCard()));
    }

    private void A0K() {
        this.A0g.A08(-1, A0t, false);
        this.A0g.setPadding(A0v, A0v, A0v, A0v);
    }

    private void A0L() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0s, A0s);
        layoutParams.setMargins(A0o, A0p, A0o, A0n);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0X, videoViewParams);
        addView(this.A0f, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        if (super.A06.A1W() && this.A0C) {
            this.A0C = false;
            A0m(A0I(63, 18, 85));
        }
    }

    private void A0N() {
        if (super.A06.A1W() && this.A0C) {
            this.A0C = false;
            Map<String, String> mapA05 = new C1722Zp().A03(null).A02(null).A05();
            mapA05.put(A0I(0, 12, 95), A0I(63, 18, 85));
            super.A08.AAs(super.A06.A25(), mapA05);
        }
    }

    private void A0O() {
        if (!super.A06.A20().A0K().A04()) {
            return;
        }
        this.A02 = new ImageView(this.A0Q);
        addView(this.A02);
        this.A02.setVisibility(4);
        new KZ(this.A02, this.A0Q).A04().A06(new GD(this)).A07(super.A06.A20().A0H().A08());
    }

    private void A0P() {
        postDelayed(new GO(this), U7.A0P(this.A0Q));
    }

    private void A0Q() {
        XP.A0H(this.A03);
        this.A03 = new LinearLayout(this.A0Q);
        this.A03.setOrientation(1);
        XP.A0I(this.A03);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0R() {
        if (super.A06.A1W()) {
            this.A0X.setOnClickListener(new ViewOnClickListenerC1880cP(this));
        }
        XP.A0H(this.A0X);
        XP.A0I(this.A0X);
        addView(this.A0X, new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new KE(this.A0Q, super.A06, this.A0P, super.A08, super.A0B, super.A0D, super.A0A, (InterfaceC1650Wv) null);
        XP.A0E(1001, this.A07);
        if (U7.A17(this.A0Q)) {
            View.OnClickListener onClickListener = new ViewOnClickListenerC1873cI(this);
            this.A0T.setCTAClickListener(onClickListener);
            if (this.A0S != null) {
                View.OnClickListener onClickListener2 = new ViewOnClickListenerC1874cJ(this);
                this.A0S.setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0S() {
        this.A0X.A0i(this.A0g);
        this.A0X.A0i(this.A0f);
        if (!TextUtils.isEmpty(super.A06.A20().A0H().A08())) {
            C08892p c08892p = new C08892p(this.A0Q, true);
            this.A0X.A0i(c08892p);
            c08892p.setImage(super.A06.A20().A0H().A08());
        }
        this.A0X.A0i(new C2Y(this.A0Q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T() {
        int duration = this.A0X.getDuration();
        int videoDuration = this.A0g.getCustomDuration();
        if (videoDuration > duration) {
            this.A0g.setCustomDuration(duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(int i10) {
        if (!this.A0J) {
            return;
        }
        E1 e12 = this.A0X;
        RelativeLayout adjacentView = (RelativeLayout) this.A0X.getVideoView();
        this.A0X.A0c(i10);
        A0W(i10, e12, adjacentView);
    }

    private void A0W(int i10, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        XP.A0H(this.A0T);
        if ((this.A0T instanceof C09695r) || (this.A0T instanceof C09685q)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0T.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0T);
            } else {
                View view = this.A0T;
                String[] strArr = A0l;
                if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                    throw new RuntimeException();
                }
                A0l[4] = "hNSRRdlixh2gw3rjMoVJbJnBOeMmg8Zc";
                addView(view, layoutParams);
            }
        } else if (this.A0T instanceof C09675p) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0T.setLayoutParams(layoutParams2);
            addView(this.A0T, layoutParams2);
        }
        this.A0T.A0h(i10);
        this.A0T.A0s(viewGroup, relativeLayout, i10);
    }

    private void A0X(ViewGroup viewGroup, View view, int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i10 == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0V(i10);
    }

    private void A0Y(ViewGroup viewGroup, View view, AbstractC1667Xm abstractC1667Xm, int i10) {
        XP.A0Z(this.A03);
        XP.A0H(abstractC1667Xm);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, abstractC1667Xm.getToolbarHeight());
        layoutParams.addRule(10);
        layoutParams.setMargins(A0q, A0p, 0, 0);
        RelativeLayout.LayoutParams parentLayoutParam = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams toolbarParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        parentLayoutParam.width = -1;
        parentLayoutParam.height = -1;
        if (i10 == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(parentLayoutParam);
        view.setLayoutParams(toolbarParams);
        this.A0T.A0t(viewGroup, false, false, this.A03.getId());
        A0V(i10);
        viewGroup.addView(abstractC1667Xm, layoutParams);
    }

    private void A0Z(ViewGroup viewGroup, View view, AbstractC1667Xm abstractC1667Xm, int i10) {
        XP.A0H(this.A03);
        XP.A0H(abstractC1667Xm);
        XP.A0H(this.A0T);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(A0q, A0p, 0, 0);
        boolean zA0u = A0u(this.A0K);
        boolean isBrowserBelowMediaView = i10 == 1;
        RelativeLayout.LayoutParams containerLayoutParam = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams toolbarParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        toolbarParams.removeRule(14);
        toolbarParams.removeRule(9);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams2.removeRule(1);
        boolean isBrowserBelowMediaView2 = isBrowserBelowMediaView || zA0u;
        if (isBrowserBelowMediaView2) {
            containerLayoutParam.height = getHeightPixels() / 4;
            toolbarParams.height = getHeightPixels() / 4;
            toolbarParams.addRule(14);
            layoutParams2.addRule(3, viewGroup.getId());
        } else {
            this.A0X.A0c(i10);
            containerLayoutParam.height = -1;
            toolbarParams.height = -1;
            toolbarParams.addRule(9);
            layoutParams2.addRule(1, view.getId());
        }
        containerLayoutParam.addRule(9);
        String[] strArr = A0l;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0l[5] = "5Z0aNPRQigyxlbiqHgRS6C1obCW9NP1F";
        containerLayoutParam.addRule(10);
        viewGroup.setLayoutParams(containerLayoutParam);
        toolbarParams.width = -2;
        view.setLayoutParams(toolbarParams);
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams2);
        if (isBrowserBelowMediaView2) {
            addView(this.A03);
            addView(abstractC1667Xm, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            layoutParams.addRule(0, this.A03.getId());
            viewGroup.addView(abstractC1667Xm, layoutParams);
        }
        this.A0T.A0t(viewGroup, true, zA0u, this.A03.getId());
    }

    private void A0a(C1391Mp c1391Mp) {
        this.A0T.setInfo(c1391Mp.A0I(), c1391Mp.A0J(), super.A06.A25(), super.A06.A23().A01(), null, this.A0U);
        this.A0T.getCTAButton().setIsInAppBrowser(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0k(C3Q c3q) {
        if (this.A0X.getState() == EnumC2007eU.A02 && U7.A1Z(this.A0Q)) {
            postDelayed(new GM(this, c3q), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0l(String str) {
        LJ lj2;
        XP.A0H(this.A06);
        H0 h02 = new H0(this);
        if (this.A0Q.A0E() == null) {
            this.A0Q.A0F().A9n();
        }
        if (U8.A02(this.A0Q) || this.A0Q.A0E() == null) {
            lj2 = new LJ(this.A0Q, h02);
        } else {
            lj2 = new LJ(this.A0Q, this.A0Q.A0E(), h02);
        }
        this.A06 = lj2;
        setUpBrowserControls(this.A06);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A03.addView(this.A06, layoutParams);
        this.A06.loadUrl(str);
    }

    private void A0m(String str) {
        Map<String, String> mapA05 = new C1722Zp().A03(null).A02(null).A05();
        mapA05.put(A0I(0, 12, 95), str);
        this.A0R.A04(UZ.A0J, mapA05);
        super.A0B.A4b(super.A06.A0r());
        super.A08.AB8(super.A06.A25(), mapA05);
        if (U7.A2N(this.A0Q)) {
            HashMap map = new HashMap();
            map.put(AbstractC2256im.A04, Boolean.TRUE.toString());
            map.put(AbstractC2256im.A05, Boolean.TRUE.toString());
            map.put(AbstractC2256im.A06, Boolean.TRUE.toString());
            super.A08.ABH(super.A06.A25(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0n(String str) {
        if (super.A06.A1w() > 0) {
            if (super.A06.A2E() && this.A0D) {
                return;
            }
            this.A0D = true;
            A0m(str);
            return;
        }
        if (super.A06.A1V()) {
            A0M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(String str) {
        if (!this.A0B) {
            this.A0T.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(boolean z10) {
        if (!z10 && this.A0i && !this.A0H) {
            return;
        }
        this.A0B = z10;
        if (z10) {
            this.A01 = 0;
            this.A0E = false;
            this.A0D = false;
        } else {
            this.A0M.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.A03;
        float y10 = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z10) {
            heightPixels /= 4.0f;
        }
        String strA0I = A0I(81, 1, 109);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, strA0I, y10, heightPixels);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0X, strA0I, this.A0X.getY(), 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        int height = this.A0X.getHeight();
        int heightPixels2 = getHeightPixels();
        String[] strArr = A0l;
        if (strArr[6].charAt(0) != strArr[7].charAt(0)) {
            A0l[5] = "hP3GfijwEBNiA0lImhN0Ztc18yymbB1X";
            if (z10) {
                heightPixels2 /= 4;
            }
            ValueAnimator duration = ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
            duration.addUpdateListener(new C1875cK(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
            animatorSet.addListener(new C1876cL(this, z10));
            if (this.A0j) {
                this.A0X.A0f(animatorSet, z10);
            }
            A0r(this.A0B, true);
            if (!z10 && this.A06 != null) {
                LJ lj2 = this.A06;
                String[] strArr2 = A0l;
                if (strArr2[1].charAt(10) == strArr2[2].charAt(10)) {
                    A0l[5] = "eIqgt8tvAdbgJnV9sUYYUdNCze8JLL17";
                    lj2.destroy();
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0q(boolean z10, int i10) {
        this.A0Q.A0F().ABc(!z10, i10);
        if (this.A04 != null) {
            ZH zh2 = this.A04;
            if (A0l[5].charAt(30) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A0l;
            strArr[1] = "o7aXPQIkUGrcx1dZHr3fchF7eoR8nmh6";
            strArr[2] = "r1oqCm6AtkrDXyXzUZY25jylGRvSX4IA";
            zh2.setCloseButtonVisibility(z10 ? 0 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0r(boolean z10, boolean z11) {
        if (!this.A0J) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        if (z10) {
            A0Z(this.A0X, this.A0X.getVideoView(), this.A0S, i10);
            return;
        }
        if (z11) {
            E1 e12 = this.A0X;
            E1 e13 = this.A0X;
            String[] strArr = A0l;
            String str = strArr[6];
            String str2 = strArr[7];
            int iCharAt = str.charAt(0);
            int orientation = str2.charAt(0);
            if (iCharAt == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[6] = "obEiGvqtCCvFNuJUlwIyPJMxkodqaQ5K";
            strArr2[7] = "nJocAzrRDHwRQikLytOPP2BE8QGdYkmy";
            A0Y(e12, e13.getVideoView(), this.A0S, i10);
            return;
        }
        A0X(this.A0X, this.A0X.getVideoView(), i10);
    }

    private final boolean A0s() {
        return this.A0B;
    }

    public static boolean A0t(float f10) {
        return f10 <= 0.7f;
    }

    public static boolean A0u(float f10) {
        return f10 >= 1.2f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final ME A1A(String str) {
        if (!A0s()) {
            if (this.A08 != null) {
                return this.A08.A0B().A0E(str);
            }
            return this.A0T.getCTAButton().A0E(str);
        }
        return ME.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1B() {
        A0N();
        this.A0N.removeCallbacksAndMessages(null);
        if (U7.A1u(this.A0Q)) {
            this.A0Q.A0B().AJj(this.A0X);
        }
        if (this.A0W != null) {
            this.A0W.A07();
        }
        if (this.A0X != null) {
            this.A0X.getEventBus().A04(this.A0d, this.A0c, this.A0b, this.A0e, this.A0Z, this.A0a);
            XP.A0F(this.A0X);
            this.A0X.A0Z();
        }
        this.A0Y.A0p();
        View[] viewArr = {this.A0X, this.A0g, this.A0f};
        if (A0l[4].charAt(14) != 'r') {
            throw new RuntimeException();
        }
        A0l[5] = "x5K1WC5ur1IImcKdsfSp5hTLdY49e91C";
        XP.A0Z(viewArr);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1D() {
        this.A0G = true;
        this.A0T.A0j();
        XP.A0Z(this.A0X, this.A0T, this.A0g, this.A04, this.A0f, this.A03, this.A0S);
        XP.A0R(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        A0J();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(A0q, A0p, 0, 0);
        addView(this.A0S, layoutParams);
        this.A0S.bringToFront();
        this.A0A = true;
        this.A0V.AFE(true);
        if (this.A0S != null && getAdDataBundle().A20().A0K().A00() > 0) {
            this.A0A = false;
            if (getAdDataBundle().A2G()) {
                this.A0S.setToolbarActionMode(8);
            } else {
                this.A0S.setToolbarActionMode(2);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1877cM(this), getAdDataBundle().A20().A0K().A00());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1E() {
        E1 e12 = this.A0X;
        int secondsForNextCta = super.A06.A20().A0H().A0A() ? 0 : 1065353216;
        e12.setVolume(secondsForNextCta);
        this.A0X.A0h(EnumC1953db.A02, 20);
        int iA02 = super.A06.A20().A0H().A02();
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0L;
            if (iA02 < secondsForNextCta2) {
                if (iA02 <= 0) {
                    return;
                }
                this.A0S.setProgressSpinnerInvisible(true);
                new C1634Wd(iA02, new GW(this)).A07();
                return;
            }
        }
        this.A0S.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1F(boolean z10) {
        this.A0H = z10;
        A0q(z10, 4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1G(boolean z10) {
        if (this.A0X.A0q()) {
            return;
        }
        this.A09 = this.A0X.getVideoStartReason();
        this.A0I = z10;
        this.A0X.A0l(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1H(boolean z10) {
        if (this.A0X.getState() == EnumC2007eU.A06 || this.A09 == null) {
            return;
        }
        if (!this.A0I || z10) {
            E1 e12 = this.A0X;
            EnumC1953db enumC1953db = this.A09;
            String[] strArr = A0l;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[1] = "9WZdaf1ZSKrkBdUpSM4gGNVox8spVJjj";
            strArr2[2] = "I46V5u0Uk9rGg82Mpkl9CB9pMmc46Jha";
            e12.A0h(enumC1953db, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1I() {
        if (super.A06.A20().A0V() && super.A06.A20().A0K().A04()) {
            boolean z10 = this.A0G;
            if (A0l[4].charAt(14) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0l;
            strArr[1] = "C2SzQuWg94rP8CljhRH7nkSf4iQhtgDx";
            strArr[2] = "CARYfrdNq1rie86wRQdSwAxjb6sfTLqG";
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1J() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1K() {
        return this.A0A;
    }

    public final boolean A1L() {
        return !A0s();
    }

    public C1400My getColors() {
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public C1882cR getFullScreenAdStyle() {
        return new C1882cR(true, C1882cR.A06, super.A06.A1z().A01(), KE.A05(super.A06), super.A06.A1z().A01().A08(true), super.A06.A20().A0H().A08());
    }

    private int getHeightPixels() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private KE getRegularCtaForEndCard() {
        KE ke2 = new KE(this.A0Q, super.A06.A0r(), super.A06.A1z().A01(), super.A08, super.A0B, (C2010eX) null, super.A0A, super.A06.A21());
        ke2.setViewShowsOverMedia(true);
        XP.A0I(ke2);
        ke2.setText(super.A06.A20().A0J().A04());
        XP.A0E(1001, ke2);
        ke2.setCta(super.A06.A20().A0J(), super.A06.A25(), new HashMap(), null);
        return ke2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0G) {
            return;
        }
        A0V(configuration.orientation);
        A0r(this.A0B, false);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A1H(false);
        } else {
            A1G(false);
        }
    }

    private void setUpBrowserControls(LJ lj2) {
        if (this.A04 != null) {
            XP.A0H(this.A04);
        }
        this.A04 = new ZH(this.A0Q, lj2, true);
        if (this.A0i) {
            A0q(this.A0H, 1);
        }
        lj2.setBrowserNavigationListener(this.A04.getBrowserNavigationListener());
        XP.A0I(this.A04);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(A0r, A0r, A0r, A0r);
        this.A04.setListener(new C1242Gu(this));
        this.A03.addView(this.A04, layoutParams);
        if (this.A05 != null) {
            XP.A0H(this.A05);
        }
        this.A05 = new ZP(this.A0Q, null, R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, A0m));
    }
}
