package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1738a6 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0g] */
    public static C08300g A00(final C1775ai c1775ai, final C1480Qc c1480Qc, final String str, final C09705s c09705s) {
        final boolean z10 = true;
        return new C09595h(c1775ai, c1480Qc, z10, str, c09705s) { // from class: com.facebook.ads.redexgen.X.0g
            public KE A00;
            public C1904cn A01;
            public final US A02 = this.A0I.A06().A02().A0A();
            public final C1480Qc A03;
            public final C09705s A04;
            public final String A05;
            public static String[] A06 = {CampaignEx.JSON_KEY_AD_Q, "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (AbstractC1640Wl.A02 * (-4.0f));
            public static final int A07 = (int) (AbstractC1640Wl.A02 * 6.0f);

            {
                this.A03 = c1480Qc;
                this.A05 = str;
                this.A04 = c09705s;
                this.A03.A1L(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1290Ir
            public void setupNativeCtaExtension(C1904cn c1904cn) {
                N3 n3A21;
                this.A01 = c1904cn;
                int iA0Q = U7.A0Q(this.A0I.A06());
                C1400My c1400MyA01 = this.A03.A10().A1z().A01();
                C1937dL c1937dLA06 = this.A0I.A06();
                String strA0r = this.A03.A10().A0r();
                US us = this.A02;
                InterfaceC1668Xn dummyListener = C1709Zc.getDummyListener();
                C2010eX c2010eXA0b = this.A04.A0b();
                XH xhA1A = this.A03.A1A();
                if (this.A03.A10() == null) {
                    n3A21 = null;
                } else {
                    n3A21 = this.A03.A10().A21();
                }
                this.A00 = new KE(c1937dLA06, strA0r, c1400MyA01, us, dummyListener, c2010eXA0b, xhA1A, n3A21);
                this.A00.setCta(c1904cn.A03().A0J(), this.A05, new HashMap());
                this.A03.A1L(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0Q == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    XP.A0N(this.A00, A07, 5, c1400MyA01.A0A(false));
                    ((C09595h) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0Q == 2) {
                    layoutParams.addRule(3, ((C09595h) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C09595h) this).A06.bringToFront();
                }
            }
        };
    }
}
