package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09565e extends AbstractC1321Jw {
    public static byte[] A02;
    public static String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final View A00;
    public final boolean A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[7].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 71);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C09565e(C1775ai c1775ai, boolean z10) {
        super(c1775ai, true);
        this.A01 = z10;
        this.A00 = c1775ai.A02();
        A1R();
        if (this.A01) {
            addView(c1775ai.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c1775ai.A06());
            RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC1771ae.A07, 0, AbstractC1771ae.A07, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        C1635Wg c1635WgA02 = this.A09.A02(getAdDataBundle());
        c1775ai.A06().A0H().A00(c1635WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A09);
        if (this.A00 != null) {
            if (c1635WgA02.A00) {
                this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A1W(view);
                    }
                });
            } else if (U7.A1I(getAdContextWrapper())) {
                AbstractC1725Zs.A00(this.A00, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC1777ak(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A0C() {
        return this.A01 && super.A0D();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A0D() {
        return this.A01 && super.A0D();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw, com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1G(C1391Mp c1391Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1391Mp, str, d10, bundle);
        if (!this.A01 && d10 > 0.0d) {
            int mediaHeight = (int) ((A04 - (AbstractC1771ae.A07 * 2)) / d10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i10 = AbstractC1771ae.A07;
            int mediaHeight2 = AbstractC1771ae.A07;
            layoutParams.setMargins(i10, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A1M() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1321Jw
    public final AbstractC1728Zv A1P(C1775ai c1775ai, C1391Mp c1391Mp, String str) {
        return new C1323Jy(c1775ai.A06(), getCtaButton(), AbstractC1321Jw.A0H, c1391Mp.A0I().A00() == EnumC1396Mu.A05, getColors(), c1391Mp.A0J().A06(), str, c1775ai.A07(), c1775ai.A0D(), c1775ai.A0G(), c1775ai.A0A(), c1775ai.A05());
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A00(0, 5, 11));
    }
}
