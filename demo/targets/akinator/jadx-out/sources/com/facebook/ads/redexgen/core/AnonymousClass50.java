package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.50, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass50 extends AbstractC1264Hr {
    public static String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final RelativeLayout.LayoutParams A0A = new RelativeLayout.LayoutParams(-1, -1);
    public C1634Wd A00;
    public AbstractC1771ae A01;
    public C1140Cw A02;
    public final int A03;
    public final ImageView A04;
    public final C1580Ua A05;
    public final AbstractC1667Xm A06;
    public final InterfaceC1884cT A07;
    public final AtomicBoolean A08;

    public AnonymousClass50(C1937dL c1937dL, YY yy, int i10, US us, AbstractC2212hy abstractC2212hy, InterfaceC1668Xn interfaceC1668Xn, AbstractC1667Xm abstractC1667Xm, C1580Ua c1580Ua, boolean z10, boolean z11, InterfaceC1884cT interfaceC1884cT, int i11, int i12) {
        super(c1937dL, yy, us, abstractC2212hy, i10, z10, z11, interfaceC1668Xn, i12);
        this.A08 = new AtomicBoolean(false);
        this.A03 = i11;
        this.A07 = interfaceC1884cT;
        this.A04 = new ImageView(getContext());
        this.A06 = abstractC1667Xm;
        this.A05 = c1580Ua;
        if (abstractC2212hy.A1U()) {
            this.A02 = new C1140Cw(c1937dL, this.A03);
        }
        this.A04.setScaleType(ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new KZ(this.A04, c1937dL).A05(abstractC2212hy.A20().A0H().A00(), abstractC2212hy.A20().A0H().A01()).A06(new C1257Hj(this)).A07(abstractC2212hy.A20().A0H().A08());
        A08(c1937dL.getResources().getConfiguration().orientation);
    }

    private AbstractC1771ae A02(int i10) {
        if (this.A04.getParent() != null) {
            XP.A0H(this.A04);
        }
        boolean z10 = i10 != 2;
        C1774ah c1774ah = new C1774ah(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        C1774ah interstitialLayoutParamsBuilder = c1774ah.A0K(this.A06.getToolbarHeight());
        interstitialLayoutParamsBuilder.A0R(this.A06).A0J(i10).A0V(z10).A0U(super.A00).A0N(this.A05);
        if (this.A02 != null) {
            c1774ah.A0T(this.A02);
        }
        c1774ah.A0M(MI.A00(super.A07, super.A08, "", WQ.A00(super.A06.A20().A0J().A05()), new HashMap(), super.A06.A21()));
        c1774ah.A0S(this.A07);
        return AbstractC1772af.A00(c1774ah.A0W(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A08.get()) {
            A1C();
        }
    }

    private void A08(int i10) {
        XP.A0H(this.A01);
        this.A01 = A02(i10);
        if (this.A01 instanceof JU) {
            ((JU) this.A01).setChildChainedAd(true);
        } else if (this.A01 instanceof C1291Is) {
            AbstractC1771ae abstractC1771ae = this.A01;
            String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((C1291Is) abstractC1771ae).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final ME A1A(String str) {
        return this.A01.A1A(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1B() {
        if (U7.A1u(super.A07)) {
            super.A07.A0B().AJj(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1B();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1D() {
        if (this.A01 instanceof C1322Jx) {
            AbstractC1771ae abstractC1771ae = this.A01;
            String[] strArr = A09;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A09[3] = "fHRV";
            ((C1322Jx) abstractC1771ae).A1O();
            return;
        }
        if (this.A01 instanceof C1291Is) {
            ((C1291Is) this.A01).A1R(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1E() {
        int iA02 = super.A06.A20().A0H().A02();
        int secondsForNextCta = this.A03;
        if (secondsForNextCta > 0) {
            this.A00 = new C1634Wd(this.A03, 100.0f, 100L, new Handler(Looper.getMainLooper()), new HV(this));
            this.A00.A07();
            if (iA02 >= 0) {
                this.A06.setProgressSpinnerInvisible(true);
            }
            if (iA02 != 0) {
                int secondsForNextCta2 = this.A03;
                if (iA02 < secondsForNextCta2) {
                    if (iA02 <= 0) {
                        return;
                    }
                    new C1634Wd(iA02, new HS(this)).A07();
                    return;
                }
            }
            this.A06.setToolbarActionMode(8);
            return;
        }
        this.A07.AFE(false);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1F(boolean z10) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1G(boolean z10) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final void A1H(boolean z10) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1I() {
        if (this.A01.A1K()) {
            if (!(this.A01 instanceof C1322Jx) || ((C1322Jx) this.A01).A1P()) {
                return (this.A01 instanceof C1291Is) && !((C1291Is) this.A01).A1T();
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1J() {
        if (this.A01 instanceof C1322Jx) {
            return ((C1322Jx) this.A01).A1P();
        }
        boolean z10 = this.A01 instanceof C1291Is;
        String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z10) {
            return ((C1291Is) this.A01).A1T();
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public final boolean A1K() {
        if (this.A01 instanceof C1322Jx) {
            return ((C1322Jx) this.A01).A1Q();
        }
        if (this.A01 instanceof C1291Is) {
            return ((C1291Is) this.A01).A1U();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr
    public C1882cR getFullScreenAdStyle() {
        C1400My colors = this.A01.getColors();
        return new C1882cR(this.A01.A1M(), C1882cR.A07, colors, KE.A05(super.A06), colors.A08(this.A01.A1M() || (this.A01 instanceof AbstractC1321Jw)), null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1264Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof C1322Jx) {
            this.A01.onConfigurationChanged(configuration);
        } else if (!super.A06.A20().A0T()) {
            A08(configuration.orientation);
        }
    }
}
