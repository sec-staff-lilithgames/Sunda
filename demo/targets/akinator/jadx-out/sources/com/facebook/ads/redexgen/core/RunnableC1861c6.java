package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1861c6 implements Runnable {
    public final /* synthetic */ C09394n A00;

    public RunnableC1861c6(C09394n c09394n) {
        this.A00 = c09394n;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = true;
            this.A00.A0M.AFE(true);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
