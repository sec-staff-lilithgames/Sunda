package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1698Yr implements View.OnClickListener {
    public final /* synthetic */ O6 A00;
    public final /* synthetic */ C1688Yh A01;
    public final /* synthetic */ LU A02;

    public ViewOnClickListenerC1698Yr(LU lu2, C1688Yh c1688Yh, O6 o62) {
        this.A02 = lu2;
        this.A01 = c1688Yh;
        this.A00 = o62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AEP(this.A00);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
