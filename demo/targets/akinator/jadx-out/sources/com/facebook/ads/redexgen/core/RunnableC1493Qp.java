package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1493Qp implements Runnable {
    public final /* synthetic */ C1494Qq A00;

    public RunnableC1493Qp(C1494Qq c1494Qq) {
        this.A00 = c1494Qq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
