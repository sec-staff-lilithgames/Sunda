package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZJ implements View.OnClickListener {
    public final /* synthetic */ ZO A00;

    public ZJ(ZO zo2) {
        this.A00 = zo2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.A0F().A9o();
            if (this.A00.A05 == null) {
                return;
            }
            this.A00.A05.ACl();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
