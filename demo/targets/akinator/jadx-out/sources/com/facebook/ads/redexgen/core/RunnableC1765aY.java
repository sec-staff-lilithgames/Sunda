package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1765aY implements Runnable {
    public final /* synthetic */ C1322Jx A00;

    public RunnableC1765aY(C1322Jx c1322Jx) {
        this.A00 = c1322Jx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC1771ae) this.A00).A06.A0E() != null) {
                ((AbstractC1771ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
