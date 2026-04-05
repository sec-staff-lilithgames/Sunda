package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1970dt implements View.OnClickListener {
    public final /* synthetic */ D1 A00;

    public ViewOnClickListenerC1970dt(D1 d12) {
        this.A00 = d12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A04(UZ.A0l, null);
            this.A00.A03.A0F().A3e();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
