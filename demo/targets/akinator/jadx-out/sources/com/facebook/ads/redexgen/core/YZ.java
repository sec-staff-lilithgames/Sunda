package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YZ implements View.OnClickListener {
    public final /* synthetic */ C1683Yc A00;

    public YZ(C1683Yc c1683Yc) {
        this.A00 = c1683Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A4v();
            } else {
                this.A00.A04.A4w();
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
