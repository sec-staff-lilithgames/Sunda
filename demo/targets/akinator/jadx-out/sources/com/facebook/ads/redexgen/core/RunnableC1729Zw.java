package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1729Zw implements Runnable {
    public final /* synthetic */ KL A00;

    public RunnableC1729Zw(KL kl2) {
        this.A00 = kl2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0H.getVisibility() == 0) {
                this.A00.A0p(8);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
