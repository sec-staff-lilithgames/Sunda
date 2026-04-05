package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZD implements View.OnClickListener {
    public final /* synthetic */ ZH A00;

    public ZD(ZH zh2) {
        this.A00 = zh2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A08.canGoBack()) {
                return;
            }
            this.A00.A08.goBack();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
