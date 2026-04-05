package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1697Yq implements View.OnClickListener {
    public final /* synthetic */ LU A00;

    public ViewOnClickListenerC1697Yq(LU lu2) {
        this.A00 = lu2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9U();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
