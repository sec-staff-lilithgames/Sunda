package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1931dF implements Runnable {
    public final /* synthetic */ C1175Ef A00;

    public RunnableC1931dF(C1175Ef c1175Ef) {
        this.A00 = c1175Ef;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B() != 0) {
                this.A00.A05.scrollBy(this.A00.A01, 0);
                this.A00.A04.postDelayed(this, 16L);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
