package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1681Ya implements View.OnClickListener {
    public final /* synthetic */ C1683Yc A00;

    public ViewOnClickListenerC1681Ya(C1683Yc c1683Yc) {
        this.A00 = c1683Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A04.AAg();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
