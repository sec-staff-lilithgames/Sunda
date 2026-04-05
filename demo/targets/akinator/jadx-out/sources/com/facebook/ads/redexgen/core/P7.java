package com.facebook.ads.redexgen.core;

import android.content.res.Resources;

/* loaded from: assets/audience_network.dex */
public class P7 implements Runnable {
    public final /* synthetic */ PH A00;

    public P7(PH ph2) {
        this.A00 = ph2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        this.A00.setScrollState(0);
        this.A00.A0f();
    }
}
