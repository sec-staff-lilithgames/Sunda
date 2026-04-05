package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09173r extends G2 {
    public static byte[] A0U;
    public static String[] A0V = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public UZ A01;
    public AbstractC1667Xm A02;
    public AbstractC1771ae A03;
    public InterfaceC1896cf A04;
    public C1934dI A05;
    public EnumC1953db A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final View A0H;
    public final R6 A0I;
    public final InterfaceC1895ce A0J;
    public final EG A0K;
    public final E1 A0L;
    public final C09083i A0M;
    public final DX A0N;
    public final DV A0O;
    public final DR A0P;
    public final DP A0Q;
    public final DN A0R;
    public final DM A0S;
    public final C1140Cw A0T;

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0U, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0U = new byte[]{23, Utf8.REPLACEMENT_BYTE, 41, 47, Utf8.REPLACEMENT_BYTE, 17, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 61, 42, 56, 46, 61, 43, 42, 43, 16, 57, 38, 43, 42, 32, 49, 41, 43, 50};
    }

    static {
        A0G();
    }

    public C09173r(C1937dL c1937dL, YY yy, US us, AbstractC2212hy abstractC2212hy, SF sf2, InterfaceC1668Xn interfaceC1668Xn) {
        super(c1937dL, yy, us, abstractC2212hy, sf2, interfaceC1668Xn);
        this.A0I = new FO(this);
        this.A0R = new DN() { // from class: com.facebook.ads.redexgen.X.4G
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.A0E = true;
                this.A00.A03.A1I(r32);
            }
        };
        this.A0Q = new DP() { // from class: com.facebook.ads.redexgen.X.4F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                this.A00.A0F = true;
                this.A00.A0c();
            }
        };
        this.A0P = new DR() { // from class: com.facebook.ads.redexgen.X.4E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
            }
        };
        this.A0S = new DM() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Q c3q) {
                this.A00.A0Q(c3q);
                this.A00.A0P(c3q);
                this.A00.A03.A1J(c3q, this.A00.A00);
            }
        };
        this.A0N = new DX() { // from class: com.facebook.ads.redexgen.X.3t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                this.A00.A0O(c09033d, this.A00.A0L.getState() != EnumC2007eU.A06, false);
            }
        };
        this.A0O = new C09183s(this);
        boolean z10 = false;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0C = false;
        this.A0A = false;
        this.A00 = 0;
        this.A07 = false;
        this.A09 = false;
        this.A01 = UZ.A0c;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A0J = new FN(this);
        this.A0L = new E1(super.A04);
        this.A0L.setFunnelLoggingHandler(super.A06);
        this.A0L.getEventBus().A03(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
        this.A0B = abstractC2212hy.A1k();
        this.A0M = new C09083i(super.A04, super.A05, this.A0L, super.A02.A25(), 0, 0, super.A02.A20().A0U(), null, null);
        if (U7.A1v(super.A04)) {
            this.A0K = new EG(super.A04, super.A05, this.A0L, super.A02.A25(), super.A02.A20().A0U(), this.A0M, null);
        } else {
            this.A0K = null;
        }
        this.A05 = new C1934dI(super.A04, super.A0A, super.A02.A1A(), interfaceC1668Xn);
        if (!A0j()) {
            this.A0H = new D1(super.A04, super.A06);
        } else {
            this.A0H = new D0(super.A04, super.A06);
        }
        int iA02 = (super.A02.A1Z() || A0j()) ? A02(super.A02) * 1000 : -1;
        if (!A0j()) {
            this.A0T = new C1140Cw(super.A04, iA02);
        } else {
            this.A0T = new C1140Cw(super.A04, iA02, C1140Cw.A0D);
        }
        if ((this.A0B && !super.A02.A1i()) || super.A02.A1a()) {
            this.A0T.setVisibility(8);
        }
        if (super.A02.A20().A0U()) {
            this.A0T.setShouldClearAnimationWhenVideoCompleted(false);
        }
        A0F();
        String strA09 = super.A02.A20().A0H().A09();
        E1 e12 = this.A0L;
        String videoUrl = super.A03.A0T(strA09);
        e12.setVideoURI(videoUrl);
        A0D();
        int unskippableSeconds = super.A02.A20().A0H().A04();
        if (U7.A2J(super.A04)) {
            this.A0C = unskippableSeconds == 0;
        } else {
            this.A0C = unskippableSeconds <= 0;
        }
        if (super.A02.A20().A0S() && super.A02.A20().A0H().A03() > 0) {
            z10 = true;
        }
        this.A08 = z10;
        C1400My colors = super.A02.A1z().A01();
        XP.A0K(this, colors.A08(true));
        if (U7.A2D(super.A04) || super.A02.A1Z()) {
            super.A08.setProgressSpinnerInvisible(true);
        }
        if (super.A02.A1l()) {
            super.A04.A0F().ADt();
        }
    }

    private float A00() {
        float fA04 = super.A02.A20().A0H().A04();
        boolean isRV = super.A0A.A8d().equals(AdPlacementType.REWARDED_VIDEO.toString());
        if (fA04 == -1.0f && isRV && super.A02.A1e()) {
            float videoDuration = this.A0L.getDuration();
            if (videoDuration <= 0.0f) {
                return 0.0f;
            }
            return videoDuration;
        }
        if (!this.A0B) {
            float serverUnskippableSeconds = this.A0L.getDuration();
            return Math.min(1000.0f * fA04, serverUnskippableSeconds);
        }
        return 1000.0f * fA04;
    }

    private int A01(int i10, int i11, int i12) {
        int i13 = 0;
        if (this.A0B) {
            int i14 = this.A00;
            if (A0V[4].charAt(26) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[0] = "";
            strArr[1] = "GEJnt8SXHB7Z";
            i13 = i12 * i14;
        }
        int completedVideoCycleDuration = i10 / 1000;
        return (i11 - i13) - completedVideoCycleDuration;
    }

    public static int A02(AbstractC2212hy abstractC2212hy) {
        if (abstractC2212hy.A0v().equals(A0A(18, 14, 49))) {
            return abstractC2212hy.A20().A0H().A03();
        }
        if (abstractC2212hy.A0v().equals(A0A(6, 12, 112))) {
            return abstractC2212hy.A20().A0H().A04();
        }
        String[] strArr = A0V;
        if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[0] = "";
        strArr2[1] = "oU1GMCkqMMy1";
        return 0;
    }

    private AbstractC1771ae A06(int i10) throws SecurityException {
        C1774ah c1774ahA0N = new C1774ah(super.A04, super.A05, super.A09, super.A02, this.A0L, super.A0B, super.A07).A0K(super.A08.getToolbarHeight()).A0R(super.A08).A0J(i10).A0L(this.A0H).A0T(this.A0T).A0Q(this.A02).A0N(super.A06);
        if (super.A02.A20().A0S() && U7.A1Y(super.A04) && super.A02.A20().A0L() != null) {
            c1774ahA0N.A0P(getPackageInstallListener());
        }
        c1774ahA0N.A0M(MI.A00(super.A04, super.A05, A0A(0, 0, 98), WQ.A00(super.A02.A20().A0J().A05()), new HashMap(), super.A02.A21()));
        C1775ai params = c1774ahA0N.A0W();
        return AbstractC1772af.A00(params, null, true);
    }

    private void A0B() {
        if (!super.A02.A20().A0K().A03()) {
            this.A02 = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 0, super.A02.A1t(), super.A02.A1j());
            this.A02.setFullscreen(true);
            this.A02.A0A(super.A02.A1z().A01(), KE.A05(super.A02));
            this.A02.setPageDetails(super.A02.A23(), super.A02.A25(), 0, super.A02.A24());
            this.A02.setPageDetailsVisible(false);
            this.A02.setToolbarListener(new C1207Fl(this));
            if (super.A02.A2K()) {
                this.A02.setOnClickListener(new ViewOnClickListenerC1890cZ(this));
            }
        }
    }

    private void A0C() {
        this.A0L.postDelayed(new C1198Fc(this), U7.A0O(super.A04));
    }

    private void A0D() {
        this.A0L.postDelayed(new C1197Fb(this), U7.A0P(super.A04));
    }

    private void A0E() {
        this.A0C = true;
        super.A08.A07();
        if (this.A03 != null) {
            this.A03.A1E();
        }
    }

    private void A0F() {
        this.A0L.A0i(this.A0T);
        if (this.A0H instanceof InterfaceC1954dc) {
            this.A0L.A0i((InterfaceC1954dc) this.A0H);
        }
        if (!TextUtils.isEmpty(super.A02.A20().A0H().A08())) {
            C08892p c08892p = new C08892p(super.A04, A0j());
            this.A0L.A0i(c08892p);
            c08892p.setImage(super.A02.A20().A0H().A08());
        }
        if (!A0j()) {
            C2R c2r = new C2R(super.A04, true, super.A06);
            this.A0L.A0i(c2r);
            this.A0L.A0i(new D4(c2r, EnumC1968dr.A02, true));
        }
        this.A0L.A0i(new C2Y(super.A04));
    }

    private void A0H(UZ uz) {
        new C1580Ua(super.A02.A25(), super.A04.A0A()).A04(uz, null);
        super.A09.A4b(super.A0A.A6d());
        this.A05.A05();
        if (this.A03 instanceof C09555d) {
            ((C09555d) this.A03).A1Y();
        }
        if (!super.A02.A1i()) {
            this.A0G.postDelayed(new RunnableC1892cb(this), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(UZ uz) {
        if (!this.A07) {
            this.A09 = true;
            this.A01 = uz;
        } else {
            A0H(uz);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(C09033d c09033d, boolean z10, boolean z11) {
        if (this.A04 != null) {
            if (z10) {
                super.A04.A0F().ADu();
            }
            super.A04.A0F().ADr();
            this.A04.AHo();
            return;
        }
        if (this.A0D) {
            return;
        }
        if (!z10 && this.A08 && this.A0B) {
            this.A00++;
            this.A0L.A0h(EnumC1953db.A02, 20);
            return;
        }
        if (!this.A0C) {
            A0E();
        }
        if (!z10 && this.A00 < super.A02.A20().A0G()) {
            this.A0L.A0h(EnumC1953db.A02, 32);
        } else {
            this.A0D = true;
            if (this.A03 != null) {
                this.A03.A1H(c09033d);
            }
        }
        if (this.A00 == 0) {
            A0S(z10, z11);
        }
        this.A00++;
        String[] strArr = A0V;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[0] = "";
        strArr2[1] = "mBWwcFSbVIKH";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(C3Q c3q) {
        if (this.A0L.getState() == EnumC2007eU.A02 && U7.A1Z(super.A04)) {
            this.A0L.postDelayed(new FZ(this, c3q), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(C3Q c3q) {
        float f10;
        int iA00 = c3q.A00();
        int totalSecondsForNextCta = super.A02.A20().A0H().A02();
        int currentPosMs = super.A02.A20().A0H().A05();
        int currentPosMs2 = A01(iA00, totalSecondsForNextCta, currentPosMs);
        if (totalSecondsForNextCta >= 0 && currentPosMs2 <= 0 && !super.A01 && this.A03 != null && this.A03.A1L()) {
            super.A01 = true;
            super.A08.setToolbarActionMode(8);
        }
        if (this.A08) {
            int totalSecondsForNextCta2 = super.A02.A20().A0H().A03();
            int currentPosMs3 = super.A02.A20().A0H().A05();
            int iA01 = A01(iA00, totalSecondsForNextCta2, currentPosMs3);
            AbstractC2212hy abstractC2212hy = super.A02;
            if (A0V[6].length() != 22) {
                String[] strArr = A0V;
                strArr[0] = "";
                strArr[1] = "CRWrhlQnYLwh";
                if (!KE.A05(abstractC2212hy)) {
                    boolean zA1l = super.A02.A1l();
                    String strA0A = A0A(0, 0, 98);
                    if (!zA1l && !super.A02.A1j() && !super.A02.A1Z() && iA01 > 0) {
                        super.A08.setToolbarActionMessage(super.A02.A24().A02().replace(A0A(0, 6, 50), String.valueOf(iA01)));
                    } else {
                        super.A08.setToolbarActionMessage(strA0A);
                    }
                }
                if (iA01 <= 0) {
                    A0T(false, false);
                }
            } else {
                throw new RuntimeException();
            }
        }
        float fA00 = A00();
        float totalCurrentPosMs = iA00;
        if (this.A0B) {
            int totalSecondsForNextCta3 = this.A0L.getDuration();
            int currentPosMs4 = this.A00;
            totalCurrentPosMs += totalSecondsForNextCta3 * currentPosMs4;
        }
        if (!super.A02.A1e() || fA00 > 0.0f) {
            f10 = totalCurrentPosMs / fA00;
        } else {
            f10 = 1.0f;
        }
        boolean zA1j = super.A02.A1j();
        if (A0V[5].charAt(8) != 102) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[7] = "BY5kACpHY7KFfLoLkWPFyXHXe8tQ4ZYS";
        strArr2[2] = "FXqF0wWRYQoNHbRw7kiC8WRpThpP8Fmr";
        if (!zA1j) {
            float unskippableSeconds = 100.0f * f10;
            super.A08.setProgress(unskippableSeconds);
        } else {
            int i10 = 0;
            if (fA00 - totalCurrentPosMs > 0.0f) {
                int currentPosMs5 = (int) (fA00 - totalCurrentPosMs);
                i10 = currentPosMs5 / 1000;
            }
            AbstractC1667Xm abstractC1667Xm = super.A08;
            String[] strArr3 = A0V;
            String str = strArr3[7];
            String str2 = strArr3[2];
            int totalSecondsForNextCta4 = str.charAt(8);
            int currentPosMs6 = str2.charAt(8);
            if (totalSecondsForNextCta4 != currentPosMs6) {
                float unskippableSeconds2 = 100.0f * f10;
                abstractC1667Xm.A09(unskippableSeconds2, i10);
            } else {
                A0V[3] = "ksHgyK5pJeiIhpnbSmOLRLGEWkwS8h7S";
                float unskippableSeconds3 = 100.0f * f10;
                abstractC1667Xm.A09(unskippableSeconds3, i10);
            }
        }
        if (f10 >= 1.0f && !this.A0C) {
            A0E();
            AbstractC1667Xm abstractC1667Xm2 = super.A08;
            int currentPosMs7 = getCloseButtonStyle();
            abstractC1667Xm2.setToolbarActionMode(currentPosMs7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(String str) {
        int currentPositionInMillis = 0;
        int duration = 0;
        if (this.A0L != null) {
            currentPositionInMillis = this.A0L.getCurrentPositionInMillis();
            duration = this.A0L.getDuration();
            this.A0L.A0e(3);
        }
        super.A04.A0F().A3S(str);
        if (U7.A1a(super.A04)) {
            A0O(new C09033d(currentPositionInMillis, duration), false, true);
        } else {
            super.A09.A4b(super.A0A.A7t());
            super.A09.A4b(super.A0A.A7o());
        }
    }

    private void A0S(boolean z10, boolean z11) {
        super.A08.setToolbarActionMessage(A0A(0, 0, 98));
        A0T(z10, z11);
        super.A08.setToolbarActionMode(getCloseButtonStyle());
    }

    private synchronized void A0T(boolean z10, boolean z11) {
        if (this.A04 != null) {
            this.A08 = false;
            return;
        }
        if (this.A08 && !z10 && !z11) {
            super.A09.A4b(super.A0A.A6d());
            this.A05.A05();
            this.A08 = false;
            if (this.A03 != null) {
                this.A03.A1C();
            }
            return;
        }
        this.A08 = false;
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final AbstractC1667Xm A0b() {
        AbstractC1667Xm c1419Nr;
        if (!A0j()) {
            c1419Nr = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 1, super.A02.A1t(), super.A02.A1j());
        } else {
            c1419Nr = new C1419Nr(super.A04, super.A09, super.A06, 1);
            A0B();
            if (super.A02.A2K()) {
                c1419Nr.setOnTouchListener(new ViewOnTouchListenerC1894cd(this));
            }
        }
        if (super.A02.A2K()) {
            c1419Nr.setOnClickListener(new ViewOnClickListenerC1889cY(this));
        }
        return c1419Nr;
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0e() {
        if (this.A03 != null) {
            super.A06.A04(UZ.A0Y, null);
            ME meA1A = this.A03.A1A(A0A(32, 4, 60));
            if (super.A02.A2D()) {
                return;
            }
            ME actionOutcome = ME.A09;
            if (meA1A != actionOutcome) {
                ME actionOutcome2 = ME.A06;
                if (meA1A != actionOutcome2) {
                    A0d();
                    return;
                }
                return;
            }
            return;
        }
        super.A06.A04(UZ.A0Z, null);
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0f() {
        XP.A0J(this.A03);
        this.A0L.setVisibility(4);
        if (!super.A02.A1f()) {
            A0k();
        }
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0h(R0 r02) {
        FrameLayout.LayoutParams layoutParams;
        r02.A0A(this.A0I);
        int orientation = r02.A05().getResources().getConfiguration().orientation;
        this.A03 = A06(orientation);
        this.A03.setAccidentalClickCappingListener(new MF() { // from class: com.facebook.ads.redexgen.X.Fq
            @Override // com.facebook.ads.redexgen.core.MF
            public final void ACB() {
                this.A00.A0l();
            }
        });
        addView(this.A03, G2.A0E);
        boolean z10 = false;
        if (A0j()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i10 = G2.A0G;
            int orientation2 = G2.A0F;
            layoutParams.setMargins(i10, orientation2, 0, 0);
        } else {
            int orientation3 = super.A08.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation3);
        }
        addView(super.A08, layoutParams);
        if (this.A02 != null) {
            addView(this.A02, new FrameLayout.LayoutParams(-1, this.A02.getToolbarHeight()));
            XP.A0F(this.A02);
        }
        XP.A0F(this.A03);
        XP.A0F(super.A08);
        if (super.A02.A1f() && (this.A03 instanceof C09555d)) {
            ((C09555d) this.A03).setVideoAdViewListener(this.A0J);
        }
        AbstractC1771ae abstractC1771ae = this.A03;
        if (A0V[6].length() == 22) {
            throw new RuntimeException();
        }
        A0V[5] = "wo0V9GMefx8z7FmkoRuQRU6XLmQOOAjz";
        if (abstractC1771ae != null && this.A03.A1M()) {
            z10 = true;
        }
        setUpFullscreenMode(z10);
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final boolean A0i() {
        if (this.A03 != null) {
            boolean zA1N = this.A03.A1N(this.A08);
            String[] strArr = A0V;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0V[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (zA1N) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final boolean A0j() {
        return super.A02.A1m() || super.A02.A1o();
    }

    public final void A0k() {
        this.A0L.setVisibility(0);
        XP.A0J(super.A08);
        this.A0L.setVolume(super.A02.A20().A0H().A0A() ? 0.0f : 1.0f);
        if (A0j()) {
            AbstractC1771ae abstractC1771ae = this.A03;
            if (A0V[3].charAt(17) == 'M') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[7] = "EZroGEyqYXPxT1OpX1Zo9PGFXXX4LGG2";
            strArr[2] = "A8BrNBzgYOoIkIhiYkC2R6mbpOJkqkYa";
            if (abstractC1771ae instanceof C09555d) {
                ((C09555d) this.A03).A1Z(getResources().getConfiguration().orientation);
                ((C09555d) this.A03).A1X();
            }
        }
        this.A0L.A0h(EnumC1953db.A02, 20);
        if (this.A03 != null && this.A08) {
            this.A03.A1D();
        }
        if (this.A03 != null && !this.A0C) {
            this.A03.A1F();
        }
        A0C();
    }

    public final /* synthetic */ void A0l() {
        A0d();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AEV(boolean z10) {
        this.A07 = false;
        if (this.A0L.getVisibility() != 0 || this.A0L.A0q()) {
            return;
        }
        this.A06 = this.A0L.getVideoStartReason();
        this.A0A = z10;
        this.A0L.A0l(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AF0(boolean z10) {
        this.A07 = true;
        if (this.A09) {
            this.A09 = false;
            A0H(this.A01);
        }
        if (this.A0L.getVisibility() != 0 || this.A0L.A0r() || this.A0D || this.A0L.getState() == EnumC2007eU.A06 || this.A06 == null) {
            return;
        }
        if (!this.A0A || z10) {
            this.A0L.A0h(this.A06, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A03 != null) {
            return this.A03.getCloseButtonStyle();
        }
        return 0;
    }

    private InterfaceC1650Wv getPackageInstallListener() {
        return new FP(this);
    }

    @Override // com.facebook.ads.redexgen.core.G2, com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void onDestroy() {
        super.onDestroy();
        if (U7.A1u(super.A04)) {
            super.A04.A0B().AJj(this.A0L);
        }
        if (this.A03 != null) {
            this.A03.A1B();
        }
        if (this.A0L != null) {
            if (!this.A0D) {
                this.A0L.A0g(EnumC1945dT.A05);
            }
            this.A0L.getEventBus().A04(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
            this.A0L.A0Z();
        }
        if (this.A0K != null) {
            this.A0K.A07();
        }
        C09083i c09083i = this.A0M;
        if (A0V[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0V[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c09083i.A0p();
        this.A0G.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(C1934dI c1934dI) {
        this.A05 = c1934dI;
    }

    public void setVideoLeadingPlayableAdListener(InterfaceC1896cf interfaceC1896cf) {
        this.A04 = interfaceC1896cf;
    }
}
