package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1705Yy implements View.OnClickListener {
    public final /* synthetic */ C1688Yh A00;
    public final /* synthetic */ LS A01;

    public ViewOnClickListenerC1705Yy(LS ls2, C1688Yh c1688Yh) {
        this.A01 = ls2;
        this.A00 = c1688Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AEC(O4.A06);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
