package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1892cb implements Runnable {
    public final /* synthetic */ C09173r A00;

    public RunnableC1892cb(C09173r c09173r) {
        this.A00 = c09173r;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            ((G2) this.A00).A09.A4b(((G2) this.A00).A0A.A7o());
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
