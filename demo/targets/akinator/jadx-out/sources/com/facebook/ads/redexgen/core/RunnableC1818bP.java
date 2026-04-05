package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1818bP implements Runnable {
    public final /* synthetic */ C1291Is A00;

    public RunnableC1818bP(C1291Is c1291Is) {
        this.A00 = c1291Is;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0D) {
                this.A00.A0L();
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
