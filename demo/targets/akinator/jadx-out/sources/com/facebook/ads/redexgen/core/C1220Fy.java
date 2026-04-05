package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1220Fy extends FrameLayout implements InterfaceC1669Xo {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public static final int A0O;
    public static final int A0P;
    public int A00;
    public int A01;
    public int A02;
    public C1739a8 A03;
    public AbstractC1264Hr A04;
    public C1934dI A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C2210hw A0A;
    public final R6 A0B;
    public final SF A0C;
    public final C1937dL A0D;
    public final US A0E;
    public final C1580Ua A0F;
    public final XC A0G;
    public final AbstractC1667Xm A0H;
    public final InterfaceC1668Xn A0I;
    public final YY A0J;
    public final ArrayList<C1882cR> A0K;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0G();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
        A0O = (int) (AbstractC1640Wl.A02 * 48.0f);
        A0P = (int) (AbstractC1640Wl.A02 * 64.0f);
    }

    public C1220Fy(C1937dL c1937dL, YY yy, US us, C2210hw c2210hw, SF sf2, InterfaceC1668Xn interfaceC1668Xn) {
        FrameLayout.LayoutParams layoutParams;
        super(c1937dL);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new G1(this);
        this.A0D = c1937dL;
        this.A0J = yy;
        this.A0E = us;
        this.A0A = c2210hw;
        this.A0C = sf2;
        this.A0I = interfaceC1668Xn;
        this.A0F = new C1580Ua(this.A0A.A1x(0).A25(), this.A0E);
        this.A0G = new XC(this);
        this.A0G.A05(XB.A02);
        this.A05 = new C1934dI(this.A0D, this.A0J, this.A0A.A1A(), interfaceC1668Xn);
        this.A0H = A05();
        if (this.A0A.A1U()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0P, A0O, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
        }
        addView(this.A0H, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r4.A1I() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r6.A0H.setToolbarActionMode(0);
        r6.A0D.A0F().A4p();
        r6.A04.A1D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r4.A1I() != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1220Fy.A00():int");
    }

    private int A01(int i10) {
        if (this.A0A.A26()) {
            C2210hw c2210hw = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i10 < c2210hw.A21().size() && i10 >= 0) {
                return this.A0A.A21().get(i10).intValue();
            }
        }
        return this.A0A.A0m();
    }

    public static /* synthetic */ int A02(C1220Fy c1220Fy, int i10) {
        int i11 = c1220Fy.A01 + i10;
        c1220Fy.A01 = i11;
        return i11;
    }

    private AbstractC1667Xm A05() {
        AbstractC1667Xm c1419Nr;
        if (!this.A0A.A1U()) {
            c1419Nr = new FullScreenAdToolbar(this.A0D, this.A0I, this.A0F, 2, -1, false);
        } else {
            c1419Nr = new C1419Nr(this.A0D, this.A0I, this.A0F, 2);
        }
        c1419Nr.setFullscreen(true);
        c1419Nr.setToolbarListener(new C1221Fz(this));
        return c1419Nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.core.AbstractC1264Hr A0A(boolean r33, int r34) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1220Fy.A0A(boolean, int):com.facebook.ads.redexgen.X.Hr");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        int iA00 = A00();
        if (iA00 != 0) {
            this.A0D.A0F().A4q(iA00);
        }
    }

    private void A0D() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A1x(this.A00 - 1).A25())) {
            US us = this.A0E;
            String strA25 = this.A0A.A1x(this.A00 - 1).A25();
            C1722Zp c1722ZpA03 = new C1722Zp().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC1264Hr abstractC1264Hr = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            us.AAt(strA25, c1722ZpA03.A02(abstractC1264Hr != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A0H.getToolbarActionMode() == 8) {
            AbstractC1667Xm abstractC1667Xm = this.A0H;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "ALooRHp0AOPErSNB2N5ax0GYeQeSWGkg";
            strArr2[4] = "Jojrpwo5bfgl2L1NDhbRQaPRUafbLI0W";
            abstractC1667Xm.setToolbarActionMode(2);
        }
        int i10 = this.A00 - 1;
        if (this.A0A.A27(i10)) {
            AbstractC2212hy abstractC2212hyA1x = this.A0A.A1x(i10);
            AbstractC1667Xm abstractC1667Xm2 = this.A0H;
            String[] strArr3 = A0M;
            String str = strArr3[2];
            String str2 = strArr3[4];
            int iCharAt = str.charAt(19);
            int index = str2.charAt(19);
            if (iCharAt == index) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "SYmrADrPyc9xENaNAh";
            strArr4[1] = "82lRVJ32R9K27GgHKLOx";
            abstractC1667Xm2.setProgressSpinnerInvisible(!abstractC2212hyA1x.A2J());
            abstractC2212hyA1x.A2B(false);
            abstractC2212hyA1x.A20().A0M(-1);
        }
    }

    private void A0F() {
        this.A0D.A0F().A4o();
        this.A07 = true;
        this.A03 = new C1739a8(this.A0D, this.A0A, this.A0E, this.A0I, this.A0H.getToolbarHeight(), this.A02);
        C1882cR c1882cR = null;
        Iterator<C1882cR> it = this.A0K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1882cR next = it.next();
            if (next.A00 == C1882cR.A06) {
                c1882cR = next;
                break;
            }
        }
        if (c1882cR != null) {
            A0L(this.A03, c1882cR);
        } else {
            boolean zIsEmpty = this.A0K.isEmpty();
            String[] strArr = A0M;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "8vyvfMLKM55zirtuKFzVGEL0IOO7sZ";
            strArr2[7] = "ODibu6eYSRbNQzGgUnvrLUj83p1fS4";
            if (!zIsEmpty) {
                A0L(this.A03, this.A0K.get(0));
            }
        }
        A0U(true);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
        }
        if (this.A04 != null) {
            XP.A0H(this.A04);
            this.A04.A1B();
            this.A04 = null;
        }
        XP.A0H(this.A03);
        XP.A0E(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0H() {
        this.A0G.A05(XB.A03);
    }

    private synchronized void A0I() {
        this.A0I.A4b(this.A0J.A6d());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(float f10) {
        float seenCurrentPosMS;
        float fA01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A26() ? 0 : this.A01) + f10;
        if (fA01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / fA01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A26()) {
            this.A06 = false;
            this.A0H.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0H.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0H.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i10) {
        this.A0D.A0F().A4l(i10);
        setUnskippableSecondsComplete(true);
        A0I();
        A0D();
        this.A0I.A4b(this.A0J.A7o());
    }

    private void A0L(ViewGroup viewGroup, C1882cR c1882cR) {
        if (c1882cR.A00 == C1882cR.A06 && c1882cR.A03 != null) {
            AbstractC1758aR.A00(this.A0D, viewGroup, c1882cR.A03);
        } else {
            int i10 = c1882cR.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            XP.A0K(viewGroup, i10);
        }
        this.A0H.setFullscreen(c1882cR.A05);
        this.A0H.A0A(c1882cR.A02, c1882cR.A04);
    }

    private void A0M(AbstractC2212hy abstractC2212hy) {
        if (this.A0H instanceof FullScreenAdToolbar) {
            if (A0Z(abstractC2212hy) && this.A02 == 2) {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(abstractC2212hy.A23());
            } else {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
            }
        }
    }

    private final void A0N(R0 r02) {
        r02.A0A(this.A0B);
        int i10 = r02.A05().getResources().getConfiguration().orientation;
        this.A02 = i10;
        A0V(this.A0A.A23(), i10);
        A0H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0U(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0X()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto La5
            boolean r0 = r6.A0W()
            if (r0 != 0) goto La5
            boolean r5 = r6.A0Y()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1220Fy.A0M
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lad
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1220Fy.A0M
            java.lang.String r1 = "abX2oERzf98UggHhJlwc5xOu8ehA434Q"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE"
            r0 = 4
            r2[r0] = r1
            if (r5 != 0) goto La5
            r1 = 1
        L33:
            boolean r0 = r6.A0W()
            if (r0 != 0) goto L71
            if (r1 != 0) goto L71
            r6.setUnskippableSecondsComplete(r3)
            if (r7 == 0) goto L4d
            com.facebook.ads.redexgen.X.Xm r3 = r6.A0H
            r2 = 0
            r1 = 0
            r0 = 85
            java.lang.String r0 = A0B(r2, r1, r0)
            r3.setToolbarActionMessage(r0)
        L4d:
            com.facebook.ads.redexgen.X.Xm r3 = r6.A0H
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1220Fy.A0M
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1220Fy.A0M
            java.lang.String r1 = "6hDdRvQvhZI2wvmWyf"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "dfELTL2TgrvtcbRt37j2"
            r0 = 1
            r2[r0] = r1
            r3.setToolbarActionMode(r4)
        L70:
            return
        L71:
            com.facebook.ads.redexgen.X.Xm r4 = r6.A0H
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1220Fy.A0M
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L95
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1220Fy.A0M
            java.lang.String r1 = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3"
            r0 = 4
            r2[r0] = r1
            r4.setToolbarActionMode(r3)
            goto L70
        L95:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1220Fy.A0M
            java.lang.String r1 = "uCb48oA3"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "eCwSqnipc7icS"
            r0 = 3
            r2[r0] = r1
            r4.setToolbarActionMode(r3)
            goto L70
        La5:
            r1 = 0
            goto L33
        La7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lad:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1220Fy.A0U(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(boolean z10, int i10) {
        if (this.A04 != null) {
            this.A04.A1B();
            this.A04.removeAllViews();
            XP.A0H(this.A04);
        }
        if (this.A0A.A1U()) {
            XP.A0H(this.A0H);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0P, A0O, 0, 0);
            addView(this.A0H, layoutParams);
        }
        if (!A0W()) {
            setUnskippableSecondsComplete(true);
            if (A0X()) {
                A0F();
                return;
            }
            A0K(1);
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "b6hirdpqFqEpTGRF7TvzfLNB23PEQW";
                strArr2[7] = "Y5Eb3FssofDa3ImZpKtnPvm2BrdUNN";
                return;
            }
        } else {
            if (this.A0A.A26()) {
                setUnskippableSecondsComplete(false);
                this.A0H.setProgressImmediate(0.0f);
            }
            SJ sjA01 = this.A0D.A01();
            AbstractC2212hy abstractC2212hyA1x = this.A0A.A1x(this.A00);
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                boolean isLoaded = sjA01.AAD(abstractC2212hyA1x.A25(), this.A0A.A1y());
                if (!isLoaded) {
                    this.A0D.A0F().A4m();
                    A0K(2);
                    return;
                }
                AbstractC1264Hr abstractC1264HrA0A = A0A(z10, i10);
                this.A04 = abstractC1264HrA0A;
                AbstractC1264Hr abstractC1264Hr = this.A04;
                boolean isLoaded2 = this.A09;
                abstractC1264Hr.A1F(isLoaded2);
                setupToolbarForAd(abstractC1264HrA0A);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A1E();
                return;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0W() {
        return this.A00 < this.A0A.A1u();
    }

    private boolean A0X() {
        return this.A0A.A1t() == 2;
    }

    private final boolean A0Y() {
        return this.A07;
    }

    public static boolean A0Z(AbstractC2212hy abstractC2212hy) {
        return TextUtils.isEmpty(abstractC2212hy.A20().A0H().A09());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) {
        this.A0I.A3x(this, A0N);
        A0N(r02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AEV(boolean z10) {
        if (this.A04 != null) {
            this.A04.A1G(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AF0(boolean z10) {
        if (this.A04 != null) {
            this.A04.A1H(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AIB(Bundle bundle) {
    }

    public AbstractC1264Hr getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof AnonymousClass50) {
            A0L(this.A04, this.A04.getFullScreenAdStyle());
            A0M(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A1B();
            this.A04 = null;
        }
        this.A0D.A01().A4r(this.A0A.A1y());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1668Xn interfaceC1668Xn) {
    }

    public void setServerSideRewardHandler(C1934dI c1934dI) {
        this.A05 = c1934dI;
    }

    public void setUnskippableSecondsComplete(boolean z10) {
        this.A09 = z10;
        if (this.A04 != null) {
            this.A04.A1F(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC1264Hr abstractC1264Hr) {
        if (this.A0H == null) {
            return;
        }
        this.A06 = true;
        AbstractC2212hy abstractC2212hyA1x = this.A0A.A1x(this.A00);
        int iA01 = A01(this.A00);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).A0D(this.A0D, abstractC2212hyA1x.A1t());
            ((FullScreenAdToolbar) this.A0H).A0C(abstractC2212hyA1x.A23(), abstractC2212hyA1x.A25(), iA01);
        } else if (this.A0H instanceof C1419Nr) {
            ((C1419Nr) this.A0H).setInitialUnskippableSeconds(iA01);
        }
        C1882cR fullScreenAdStyle = abstractC1264Hr.getFullScreenAdStyle();
        A0L(abstractC1264Hr, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0H.setToolbarActionMessage(A0B(4, 3, 90) + (this.A00 + 1) + A0B(0, 4, 21) + this.A0A.A1u());
        if (this.A08) {
            this.A0H.setToolbarActionMode(1);
        }
        A0M(abstractC2212hyA1x);
    }
}
