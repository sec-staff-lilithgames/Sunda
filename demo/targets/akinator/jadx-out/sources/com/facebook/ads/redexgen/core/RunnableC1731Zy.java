package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1731Zy implements Runnable {
    public final /* synthetic */ KL A00;

    public RunnableC1731Zy(KL kl2) {
        this.A00 = kl2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0m();
            this.A00.A0n();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
