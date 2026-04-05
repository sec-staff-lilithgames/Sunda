package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1805bC implements View.OnClickListener {
    public final /* synthetic */ JS A00;

    public ViewOnClickListenerC1805bC(JS js2) {
        this.A00 = js2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 != null) {
                this.A00.A02.AJF();
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
