package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZK implements View.OnClickListener {
    public final /* synthetic */ ZO A00;

    public ZK(ZO zo2) {
        this.A00 = zo2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A09.canGoBack()) {
                return;
            }
            this.A00.A09.goBack();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
