package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2047f9 implements Runnable {
    public final /* synthetic */ C1115Bw A00;

    public RunnableC2047f9(C1115Bw c1115Bw) {
        this.A00 = c1115Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            C1115Bw.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
