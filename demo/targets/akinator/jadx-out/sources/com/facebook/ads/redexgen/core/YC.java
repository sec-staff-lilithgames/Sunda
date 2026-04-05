package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YC implements View.OnClickListener {
    public final /* synthetic */ C1353Lc A00;

    public YC(C1353Lc c1353Lc) {
        this.A00 = c1353Lc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0N.A04(UZ.A07, null);
            this.A00.A0Q.A4b(this.A00.A0R.A7o());
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
