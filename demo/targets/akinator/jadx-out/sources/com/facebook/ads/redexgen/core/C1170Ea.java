package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1170Ea extends C1752aL {
    public final ImageView A00;
    public final C1937dL A01;

    public C1170Ea(C1937dL c1937dL) {
        super(c1937dL);
        this.A01 = c1937dL;
        this.A00 = new ImageView(c1937dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        KZ downloadImageTask = new KZ(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
