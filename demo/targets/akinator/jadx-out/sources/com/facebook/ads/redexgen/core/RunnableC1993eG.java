package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1993eG implements Runnable {
    public final /* synthetic */ C1996eJ A00;

    public RunnableC1993eG(C1996eJ c1996eJ) {
        this.A00 = c1996eJ;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
