package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC1181El implements Runnable {
    public final InterfaceC1180Ek A00;

    public RunnableC1181El(InterfaceC1180Ek interfaceC1180Ek) {
        this.A00 = interfaceC1180Ek;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
