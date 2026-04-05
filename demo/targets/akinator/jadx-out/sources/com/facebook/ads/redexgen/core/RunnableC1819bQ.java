package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1819bQ implements Runnable {
    public final /* synthetic */ C1291Is A00;

    public RunnableC1819bQ(C1291Is c1291Is) {
        this.A00 = c1291Is;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            this.A00.A0c.A0E().AFE(true);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
