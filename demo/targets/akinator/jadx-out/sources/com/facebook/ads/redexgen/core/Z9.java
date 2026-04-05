package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C1937dL c1937dL, final C1580Ua c1580Ua, final AbstractC2212hy abstractC2212hy, final InterfaceC1668Xn interfaceC1668Xn, final Z5 z52, Handler handler, Z6 z62) {
        c1937dL.A0F().AAv(z52.name().toLowerCase(Locale.US));
        return abstractC2212hy.A2F() ? new Z4(c1937dL, handler, z62, abstractC2212hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1937dL c1937dL2 = c1937dL;
                C1580Ua c1580Ua2 = c1580Ua;
                InterfaceC1668Xn interfaceC1668Xn2 = interfaceC1668Xn;
                Z5 z53 = z52;
                AbstractC2212hy abstractC2212hy2 = abstractC2212hy;
                Z9.A04(c1937dL2, c1580Ua2, interfaceC1668Xn2, z53, abstractC2212hy2.A25(), abstractC2212hy2.A23());
            }
        }) : new ZA(c1937dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1937dL c1937dL2 = c1937dL;
                C1580Ua c1580Ua2 = c1580Ua;
                InterfaceC1668Xn interfaceC1668Xn2 = interfaceC1668Xn;
                Z5 z53 = z52;
                AbstractC2212hy abstractC2212hy2 = abstractC2212hy;
                Z9.A04(c1937dL2, c1580Ua2, interfaceC1668Xn2, z53, abstractC2212hy2.A25(), abstractC2212hy2.A23());
            }
        });
    }

    public static ImageView A01(C1937dL c1937dL, C1580Ua c1580Ua, AbstractC2212hy abstractC2212hy, Z5 z52, InterfaceC1668Xn interfaceC1668Xn, Handler handler) {
        return A00(c1937dL, c1580Ua, abstractC2212hy, interfaceC1668Xn, z52, handler, Z6.A03);
    }

    public static void A04(C1937dL c1937dL, C1580Ua c1580Ua, InterfaceC1668Xn interfaceC1668Xn, Z5 z52, String str, N9 n9) {
        if (c1580Ua != null) {
            c1580Ua.A04(UZ.A0A, null);
        }
        c1937dL.A0F().AAu(z52.name().toLowerCase(Locale.US));
        if (O3.A00(c1937dL.A02()).A0O(c1937dL.A02(), true)) {
            interfaceC1668Xn.AAf(str, n9);
        } else {
            if (TextUtils.isEmpty(n9.A00())) {
                return;
            }
            WN.A0O(new WN(), c1937dL, WQ.A00(n9.A00()), str);
        }
    }
}
