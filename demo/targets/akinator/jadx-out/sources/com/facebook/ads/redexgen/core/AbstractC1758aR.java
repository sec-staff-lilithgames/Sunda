package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1758aR {
    public static final int A00 = XP.A00();

    public static void A00(C1937dL c1937dL, ViewGroup viewGroup, String str) {
        new KZ(viewGroup, c1937dL).A07(str);
        View view = new View(c1937dL);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        XP.A0P(view, c1937dL);
        viewGroup.addView(view, 0);
    }
}
