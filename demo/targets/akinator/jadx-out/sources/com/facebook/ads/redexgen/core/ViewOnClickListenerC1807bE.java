package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1807bE implements View.OnClickListener {
    public final /* synthetic */ JR A00;

    public ViewOnClickListenerC1807bE(JR jr2) {
        this.A00 = jr2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A03 == null || this.A00.A03.getVisibility() != 8) {
                this.A00.A0O();
                this.A00.A0A.removeCallbacks(this.A00.A0U);
                this.A00.A0S(8);
            } else {
                this.A00.A0S(0);
                this.A00.A0A.postDelayed(this.A00.A0U, 1500L);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
