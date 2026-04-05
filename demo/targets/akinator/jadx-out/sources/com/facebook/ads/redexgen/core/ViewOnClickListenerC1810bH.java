package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1810bH implements View.OnClickListener {
    public final /* synthetic */ JR A00;

    public ViewOnClickListenerC1810bH(JR jr2) {
        this.A00 = jr2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A07 != null) {
                this.A00.A07.AJF();
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
