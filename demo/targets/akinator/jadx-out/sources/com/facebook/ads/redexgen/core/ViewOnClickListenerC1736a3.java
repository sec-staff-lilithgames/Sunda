package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1736a3 implements View.OnClickListener {
    public final /* synthetic */ KG A00;

    public ViewOnClickListenerC1736a3(KG kg2) {
        this.A00 = kg2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
