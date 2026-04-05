package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1690Yj implements View.OnClickListener {
    public final /* synthetic */ LV A00;

    public ViewOnClickListenerC1690Yj(LV lv2) {
        this.A00 = lv2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.AEC(O4.A04);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
