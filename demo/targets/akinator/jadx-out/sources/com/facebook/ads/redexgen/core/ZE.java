package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZE implements View.OnClickListener {
    public final /* synthetic */ ZH A00;

    public ZE(ZH zh2) {
        this.A00 = zh2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A08.canGoForward()) {
                return;
            }
            this.A00.A08.goForward();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
