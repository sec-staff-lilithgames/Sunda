package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1314Jp extends AbstractC1771ae implements Wf {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC2212hy A00;
    public final C1636Wh A01;
    public final InterfaceC1668Xn A02;
    public final C1803bA A03;
    public final C1903cm A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, 30, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C1314Jp(C1775ai c1775ai, boolean z10) {
        int id2;
        int iA01;
        super(c1775ai, z10);
        this.A02 = c1775ai.A0D();
        this.A00 = c1775ai.A05();
        this.A03 = new C1803bA(c1775ai.A06(), c1775ai.A02());
        this.A03.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC1771ae.A07, AbstractC1771ae.A07, AbstractC1771ae.A07, AbstractC1771ae.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c1775ai.A0I()) {
            this.A04 = new C1903cm(c1775ai.A06());
            this.A04.setPageDetails(c1775ai.A05().A23());
            XP.A0E(1007, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC1771ae.A07, AbstractC1771ae.A07 - (AbstractC1771ae.A07 / 2), AbstractC1771ae.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id2 = this.A04.getId();
            iA01 = c1775ai.A01() - (AbstractC1771ae.A07 / 2);
        } else {
            id2 = getCtaButton().getId();
            iA01 = c1775ai.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c1775ai.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id2);
        layoutParams2.setMargins(0, iA01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC1771ae.A07, 0, AbstractC1771ae.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0F(c1775ai.A05(), c1775ai.A0C());
        View viewA02 = c1775ai.A02();
        this.A01 = C1636Wh.A00(c1775ai.A06(), this.A00, this);
        C1635Wg c1635WgA02 = this.A01.A02(this.A00);
        c1775ai.A06().A0H().A00(c1635WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (viewA02 != null && c1635WgA02.A00) {
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ao
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1O(view);
                }
            });
        } else if (viewA02 != null && U7.A1I(getAdContextWrapper())) {
            AbstractC1725Zs.A00(viewA02, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC1782ap(this));
        }
        if (U7.A17(c1775ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1775ai.A0C() != null) {
                c1775ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && U7.A18(c1775ai.A06())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1G(C1391Mp c1391Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1391Mp, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A06 - (AbstractC1771ae.A07 * 2)) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A1M() {
        return false;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
