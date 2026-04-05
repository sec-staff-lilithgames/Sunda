package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.4Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4Z extends AbstractC1264Hr {
    public static byte[] A0o;
    public static String[] A0p = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C1400My A0D;
    public ZO A0E;
    public ZP A0F;
    public LJ A0G;
    public C1812bJ A0H;
    public EnumC1953db A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final MH A0V;
    public final C1937dL A0W;
    public final C1580Ua A0X;
    public final AbstractC1667Xm A0Y;
    public final InterfaceC1884cT A0Z;
    public final EG A0a;
    public final E1 A0b;
    public final C09083i A0c;
    public final DX A0d;
    public final DV A0e;
    public final DR A0f;
    public final DP A0g;
    public final DN A0h;
    public final DM A0i;
    public final D1 A0j;
    public final C1140Cw A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0X() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -68, -63, -61, -56, -57, -78, -64, -72, -57, -69, -62, -73, -26, -28, -42, -29, -44, -35, -38, -44, -36, -48, -41, -38, -35, -27, -42, -29, -42, -43, -40, -54, -49, -59, -48, -40, 47};
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0p;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0o = bArr;
    }

    static {
        A0X();
        A0q = (int) (AbstractC1640Wl.A02 * 4.0f);
        A0r = (int) (AbstractC1640Wl.A02 * 8.0f);
        A0s = OP.A02(-1, 77);
        A0w = (int) (AbstractC1640Wl.A02 * 26.0f);
        A0x = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0u = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0v = (int) (AbstractC1640Wl.A02 * 44.0f);
        A0t = (int) (AbstractC1640Wl.A02 * 8.0f);
    }

    public C4Z(C1937dL c1937dL, US us, AbstractC1667Xm abstractC1667Xm, AbstractC2212hy abstractC2212hy, SF sf2, YY yy, int i10, InterfaceC1668Xn interfaceC1668Xn, C1580Ua c1580Ua, int i11, boolean z10, boolean z11, InterfaceC1884cT interfaceC1884cT, int i12, int i13) {
        C1400My c1400MyA00;
        super(c1937dL, yy, us, abstractC2212hy, i10, z10, z11, interfaceC1668Xn, i13);
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0R = true;
        this.A0l = new RunnableC1870cF(this);
        this.A0L = false;
        this.A0T = false;
        this.A01 = 0.0f;
        this.A0h = new DN() { // from class: com.facebook.ads.redexgen.X.4k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.A0T = true;
            }
        };
        this.A0g = new DP() { // from class: com.facebook.ads.redexgen.X.4i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (!((AbstractC1264Hr) this.A00).A0A.A07()) {
                    this.A00.A1C();
                }
            }
        };
        this.A0f = new DR() { // from class: com.facebook.ads.redexgen.X.4h
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            public final /* bridge */ /* synthetic */ void A03(C1558Td c1558Td) {
            }
        };
        this.A0i = new DM() { // from class: com.facebook.ads.redexgen.X.4e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Q c3q) {
                this.A00.A0f(c3q);
                this.A00.A0Z.ADI((this.A00.A01 * this.A00.A0b.getDuration()) + c3q.A00());
            }
        };
        this.A0d = new DX() { // from class: com.facebook.ads.redexgen.X.4d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                this.A00.A0Z.ACy(this.A00.A0b.getDuration());
                C4Z.A03(this.A00, 1.0f);
                this.A00.A0b.A0h(EnumC1953db.A02, 28);
            }
        };
        this.A0e = new C09274b(this);
        this.A0Y = abstractC1667Xm;
        this.A0U = i12;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c1937dL.getSystemService(A0L(12, 12, 28));
        this.A0V = MI.A01(c1937dL, us, abstractC2212hy.A25(), WQ.A00(abstractC2212hy.A20().A0J().A05()), new HashMap(), false, true, abstractC2212hy.A21());
        this.A0W = c1937dL;
        this.A0X = c1580Ua;
        this.A0j = new D1(this.A0W, this.A0X);
        this.A0k = new C1140Cw(this.A0W, -1);
        this.A0Z = interfaceC1884cT;
        if (i11 == 1) {
            c1400MyA00 = super.A06.A1z().A01();
        } else {
            c1400MyA00 = super.A06.A1z().A00();
        }
        this.A0D = c1400MyA00;
        this.A0b = new E1(this.A0W);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C09083i(c1937dL, us, this.A0b, abstractC2212hy.A25());
        A0U();
        String videoUrl = super.A06.A20().A0H().A09();
        this.A0b.setVideoURI(sf2.A0T(videoUrl));
        A0R();
        A0O();
        A0N();
        C1937dL c1937dL2 = this.A0W;
        String videoUrl2 = abstractC2212hy.A20().A0H().A08();
        AbstractC1758aR.A00(c1937dL2, this, videoUrl2);
        setupLayoutConfiguration(false);
        A0T();
        A0S();
        postDelayed(new HA(this), 1000L);
        if (U7.A1u(this.A0W)) {
            InterfaceC1584Ue interfaceC1584UeA0B = this.A0W.A0B();
            E1 e12 = this.A0b;
            String videoUrl3 = super.A06.A25();
            interfaceC1584UeA0B.AK2(e12, videoUrl3, true);
        }
        if (U7.A1v(this.A0W)) {
            this.A0a = new EG(this.A0W, us, this.A0b, super.A06.A25(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0Y(abstractC2212hy.A20());
        this.A0m = super.A06.A1e();
        this.A0n = super.A06.A1p();
        c1937dL.A0F().ABe(this.A0m, this.A0n, true);
    }

    public static /* synthetic */ float A03(C4Z c4z, float f10) {
        float f11 = c4z.A01 + f10;
        c4z.A01 = f11;
        return f11;
    }

    public static /* synthetic */ int A05(C4Z c4z) {
        int i10 = c4z.A02;
        c4z.A02 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A07(C4Z c4z) {
        int i10 = c4z.A07;
        c4z.A07 = i10 + 1;
        return i10;
    }

    private void A0M() {
        XP.A0H(this.A0B);
        this.A0B = new LinearLayout(this.A0W);
        XP.A0P(this.A0B, this.A0W);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0N() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0x, A0x, A0x, A0x);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0w);
        layoutParams.addRule(12);
        addView(this.A0k, layoutParams);
    }

    private void A0O() {
        this.A0j.setPadding(A0u, A0u, A0u, A0u);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0v, A0v);
        layoutParams.setMargins(0, AbstractC1667Xm.A00, A0t, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        if (super.A06.A1W() && this.A0L) {
            this.A0L = false;
            A0h(A0L(24, 18, 58));
        }
    }

    private void A0Q() {
        if (super.A06.A1W() && this.A0L) {
            this.A0L = false;
            Map<String, String> mapA05 = new C1722Zp().A03(null).A02(null).A05();
            mapA05.put(A0L(0, 12, 87), A0L(24, 18, 58));
            super.A08.AAs(super.A06.A25(), mapA05);
        }
    }

    private void A0R() {
        postDelayed(new HD(this), U7.A0P(this.A0W));
    }

    private void A0S() {
        XP.A0H(this.A0A);
        this.A0A = new LinearLayout(this.A0W);
        this.A0A.setOrientation(1);
        XP.A0I(this.A0A);
        A0V();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0T() {
        View view = this.A0b;
        if (super.A06.A1W()) {
            view.setOnClickListener(new ViewOnClickListenerC1872cH(this));
        }
        XP.A0H(view);
        XP.A0I(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new TextView(this.A0W);
        View mMediaView = this.A0C;
        XP.A0I(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A06(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0r, A0r / 2, A0r, A0w);
        View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        View mMediaView3 = this.A0C;
        XP.A0I(mMediaView3);
        this.A0H = new C1812bJ(this.A0W, null, super.A06, super.A08, super.A0B, super.A0D, super.A0A, getColors(), new HH(this));
        View mMediaView4 = this.A0H;
        XP.A0E(1001, mMediaView4);
        View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0W();
        A0M();
        if (U7.A17(this.A0W)) {
            this.A0B.setOnClickListener(new ViewOnClickListenerC1864c9(this));
            View mMediaView6 = this.A0Y;
            if (mMediaView6 != null) {
                this.A0Y.setCTAClickListener(new ViewOnClickListenerC1865cA(this));
            }
        }
    }

    private void A0U() {
        this.A0b.A0i(this.A0k);
        this.A0b.A0i(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A20().A0H().A08())) {
            C08892p c08892p = new C08892p(this.A0W);
            this.A0b.A0i(c08892p);
            c08892p.setImage(super.A06.A20().A0H().A08());
        }
        this.A0b.A0i(new C2Y(this.A0W));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0A;
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0p[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Y(C1391Mp c1391Mp) {
        double dA00 = AbstractC1762aV.A00(c1391Mp);
        String strA0E = c1391Mp.A0I().A0E();
        if (strA0E == null || strA0E.trim().length() == 0) {
            XP.A0L(this.A0B, 8);
            if (U7.A17(this.A0W)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(strA0E);
            if (U7.A17(this.A0W)) {
                this.A0B.setClickable(true);
            }
        }
        if (dA00 > 0.0d) {
            this.A03 = (int) (this.A06 / dA00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(C3Q c3q) {
        if (this.A0b.getState() == EnumC2007eU.A02 && U7.A1Z(this.A0W)) {
            postDelayed(new HB(this, c3q), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(String str) {
        LJ lj2;
        XP.A0H(this.A0G);
        HG hg2 = new HG(this);
        if (this.A0W.A0E() == null) {
            this.A0W.A0F().A9n();
        }
        boolean zA02 = U8.A02(this.A0W);
        if (A0p[6].charAt(12) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0p;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (zA02 || this.A0W.A0E() == null) {
            lj2 = new LJ(this.A0W, hg2);
        } else {
            lj2 = new LJ(this.A0W, this.A0W.A0E(), hg2);
        }
        this.A0G = lj2;
        this.A0G.setOnTouchListener(new ViewOnTouchListenerC1866cB(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0h(String str) {
        Map<String, String> mapA05 = new C1722Zp().A03(null).A02(null).A05();
        mapA05.put(A0L(0, 12, 87), str);
        this.A0X.A04(UZ.A0J, mapA05);
        super.A0B.A4b(super.A06.A0r());
        super.A08.AB8(super.A06.A25(), mapA05);
        if (U7.A2N(this.A0W)) {
            HashMap map = new HashMap();
            map.put(AbstractC2256im.A04, Boolean.TRUE.toString());
            map.put(AbstractC2256im.A05, Boolean.TRUE.toString());
            map.put(AbstractC2256im.A06, Boolean.TRUE.toString());
            super.A08.ABH(super.A06.A25(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(String str) {
        if (super.A06.A1w() > 0) {
            if (super.A06.A2E()) {
                boolean z10 = this.A0M;
                if (A0p[1].charAt(27) != 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0p;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z10) {
                    return;
                }
            }
            this.A0M = true;
            A0h(str);
            return;
        }
        boolean zA1V = super.A06.A1V();
        if (A0p[1].charAt(27) == 'i') {
            String[] strArr2 = A0p;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!zA1V) {
                return;
            }
        } else if (!zA1V) {
            return;
        }
        A0P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0j(boolean z10) {
        if (!z10 && this.A0m && !this.A0R) {
            return;
        }
        this.A0K = z10;
        ObjectAnimator objectAnimatorOfFloat = null;
        if (!z10) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String strA0L = A0L(48, 1, 127);
        if (z10) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.A0H, strA0L, this.A0H.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float y10 = this.A0A.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0L, y10, i10);
        objectAnimatorOfFloat2.setDuration(500L);
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(this.A0b, strA0L, this.A0b.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0b.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i11).setDuration(500L);
        duration.addUpdateListener(new C1868cD(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(500L);
            animatorSet.playTogether(objectAnimatorOfFloat);
        }
        animatorSet.addListener(new C1869cE(this, z10));
        if (this.A0n) {
            this.A0b.A0f(animatorSet, z10);
        }
        animatorSet.start();
    }

    private void A0k(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        XP.A0H(this.A0b);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0S();
        }
        this.A0b.setTranslationY(0.0f);
        addView(this.A0b, 1, layoutParams);
        A0M();
        A0W();
    }

    private void A0l(boolean z10, int i10) {
        this.A0W.A0F().ABc(!z10, i10);
        if (this.A0E == null) {
            return;
        }
        this.A0E.setCloseButtonVisibility(z10 ? 0 : 4);
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final ME A1A(String str) {
        if (!A0m()) {
            ME meA02 = this.A0H.A02(str);
            String[] strArr = A0p;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A0p[1] = "gDqV8VnRL5n4dziTmRcIoSoDocYisV3G";
            return meA02;
        }
        return ME.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1B() {
        A0Q();
        if (U7.A1u(this.A0W)) {
            this.A0W.A0B().AJj(this.A0b);
        }
        if (this.A0a != null) {
            EG eg2 = this.A0a;
            if (A0p[6].charAt(12) != 'v') {
                throw new RuntimeException();
            }
            A0p[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            eg2.A07();
        }
        if (this.A0b != null) {
            this.A0b.getEventBus().A04(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
            XP.A0F(this.A0b);
            this.A0b.A0Z();
        }
        this.A0c.A0p();
        XP.A0Z(this.A0b, this.A0k, this.A0j);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1D() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1E() {
        E1 e12 = this.A0b;
        int secondsForNextCta = super.A06.A20().A0H().A0A() ? 0 : 1065353216;
        e12.setVolume(secondsForNextCta);
        this.A0b.A0h(EnumC1953db.A02, 20);
        int iA02 = super.A06.A20().A0H().A02();
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0U;
            if (iA02 < secondsForNextCta2) {
                if (iA02 <= 0) {
                    return;
                }
                this.A0Y.setProgressSpinnerInvisible(true);
                new C1634Wd(iA02, new HE(this)).A07();
                return;
            }
        }
        this.A0Y.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1F(boolean z10) {
        this.A0R = z10;
        A0l(z10, 4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1G(boolean z10) {
        if (this.A0b.A0q()) {
            return;
        }
        this.A0I = this.A0b.getVideoStartReason();
        this.A0S = z10;
        this.A0b.A0l(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1H(boolean z10) {
        if (this.A0b.getState() != EnumC2007eU.A06) {
            EnumC1953db enumC1953db = this.A0I;
            String[] strArr = A0p;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (enumC1953db != null) {
                if (!this.A0S || z10) {
                    this.A0b.A0h(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1I() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1J() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1K() {
        return true;
    }

    public final boolean A1L() {
        return !A0m();
    }

    public C1400My getColors() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public C1882cR getFullScreenAdStyle() {
        return new C1882cR(true, C1882cR.A06, super.A06.A1z().A01(), KE.A05(super.A06), super.A06.A1z().A01().A08(true), super.A06.A20().A0H().A08());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public XH getTouchDataRecorder() {
        return super.A0A;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0k(A0m());
        setupLayoutConfiguration(A0m());
        A0V();
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
        XP.A0H(this.A0E);
        this.A0E = new ZO(this.A0W, lj2, true, this.A0n);
        if (this.A0m) {
            A0l(this.A0R, 1);
        }
        lj2.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        XP.A0I(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new HF(this));
        this.A0E.setOnTouchListener(new ViewOnTouchListenerC1867cC(this));
        this.A0A.addView(this.A0E, layoutParams);
        XP.A0H(this.A0F);
        this.A0F = new ZP(this.A0W, null, R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0q));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0W.getSystemService(A0L(42, 6, 42));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
