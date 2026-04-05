package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1877cM implements Runnable {
    public final /* synthetic */ C4K A00;

    public RunnableC1877cM(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A = true;
            this.A00.A0V.AFE(true);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
