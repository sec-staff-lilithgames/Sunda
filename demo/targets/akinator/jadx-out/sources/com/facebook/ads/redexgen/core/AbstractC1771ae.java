package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1771ae extends RelativeLayout {
    public C1400My A00;
    public boolean A01;
    public final C1937dL A02;
    public final US A03;
    public final KE A04;
    public final C1757aQ A05;
    public final C1775ai A06;
    public static final int A07 = (int) (AbstractC1640Wl.A02 * 16.0f);
    public static final int A08 = (int) (AbstractC1640Wl.A02 * 28.0f);
    public static final int A0B = (int) (AbstractC1640Wl.A02 * 2.0f);
    public static final int A0E = (int) (AbstractC1640Wl.A02 * 4.0f);
    public static final int A0I = (int) (AbstractC1640Wl.A02 * 8.0f);
    public static final int A09 = (int) (AbstractC1640Wl.A02 * 12.0f);
    public static final int A0A = (int) (AbstractC1640Wl.A02 * 16.0f);
    public static final int A0C = (int) (AbstractC1640Wl.A02 * 20.0f);
    public static final int A0D = (int) (AbstractC1640Wl.A02 * 24.0f);
    public static final int A0F = (int) (AbstractC1640Wl.A02 * 44.0f);
    public static final int A0G = (int) (AbstractC1640Wl.A02 * 48.0f);
    public static final int A0H = (int) (AbstractC1640Wl.A02 * 64.0f);
    public static final int A0J = (int) (AbstractC1640Wl.A02 * 32.0f);

    public abstract boolean A1M();

    public AbstractC1771ae(C1775ai c1775ai, boolean z10) {
        C1400My c1400MyA00;
        super(c1775ai.A06());
        this.A06 = c1775ai;
        this.A02 = c1775ai.A06();
        this.A03 = c1775ai.A07();
        if (c1775ai.A00() == 1) {
            c1400MyA00 = c1775ai.A05().A1z().A01();
        } else {
            c1400MyA00 = c1775ai.A05().A1z().A00();
        }
        this.A00 = c1400MyA00;
        this.A01 = z10;
        this.A04 = new KE(c1775ai.A06(), c1775ai.A05(), this.A00, c1775ai.A07(), c1775ai.A0D(), c1775ai.A0G(), c1775ai.A0A(), c1775ai.A09());
        this.A04.setRoundedCornersEnabled(A01());
        this.A04.setViewShowsOverMedia(A0C());
        XP.A0E(1001, this.A04);
        this.A05 = new C1757aQ(this.A02, this.A00, this.A01, A02(), A0D());
        XP.A0I(this.A05);
    }

    public final ImageView A00(C1937dL c1937dL, AbstractC2212hy abstractC2212hy, C1580Ua c1580Ua, Z5 z52, InterfaceC1668Xn interfaceC1668Xn, Handler handler) {
        ImageView imageViewA01 = Z9.A01(c1937dL, c1580Ua, abstractC2212hy, z52, interfaceC1668Xn, handler);
        XP.A0I(imageViewA01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0A, 0, 0, A0A);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        imageViewA01.setLayoutParams(layoutParams);
        return imageViewA01;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public final boolean A03() {
        return this.A06.A05().A1m() || this.A06.A05().A1o();
    }

    public boolean A0C() {
        return true;
    }

    public boolean A0D() {
        return true;
    }

    public ME A1A(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1B() {
    }

    public void A1C() {
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G(C1391Mp c1391Mp, String str, double d10, Bundle bundle) {
        this.A05.A04(c1391Mp.A0I().A0E(), c1391Mp.A0I().A04(), null, false, !A1M() && d10 > 0.0d && d10 < 1.0d);
        this.A04.setCta(c1391Mp.A0J(), str, new HashMap());
    }

    public void A1H(C09033d c09033d) {
    }

    public void A1I(DO r12) {
    }

    public void A1J(C3Q c3q, int i10) {
    }

    public boolean A1K() {
        return false;
    }

    public boolean A1L() {
        return true;
    }

    public boolean A1N(boolean z10) {
        return false;
    }

    public C1937dL getAdContextWrapper() {
        return this.A02;
    }

    public US getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C1400My getColors() {
        return this.A00;
    }

    public KE getCtaButton() {
        return this.A04;
    }

    public C1757aQ getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1400My c1400MyA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c1400MyA00 = this.A06.A05().A1z().A01();
        } else {
            c1400MyA00 = this.A06.A05().A1z().A00();
        }
        this.A00 = c1400MyA00;
        this.A04.setViewShowsOverMedia(A0C());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(MF mf2) {
        getCtaButton().getCtaActionHelper().A07(mf2);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z10) {
    }
}
