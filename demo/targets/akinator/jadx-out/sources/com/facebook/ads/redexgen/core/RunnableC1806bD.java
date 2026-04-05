package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1806bD implements Runnable {
    public final /* synthetic */ JR A00;

    public RunnableC1806bD(JR jr2) {
        this.A00 = jr2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A03 != null && this.A00.A03.getVisibility() == 0) {
                this.A00.A0S(8);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
