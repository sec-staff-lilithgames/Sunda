package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1678Xx implements View.OnClickListener {
    public final /* synthetic */ C1419Nr A00;

    public ViewOnClickListenerC1678Xx(C1419Nr c1419Nr) {
        this.A00 = c1419Nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A01 != null && this.A00.A02.A02()) {
                this.A00.A01.ACC(this.A00);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
