package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1712Zf implements Runnable {
    public final /* synthetic */ C1713Zg A00;
    public final /* synthetic */ InterfaceC1714Zh A01;

    public RunnableC1712Zf(C1713Zg c1713Zg, InterfaceC1714Zh interfaceC1714Zh) {
        this.A00 = c1713Zg;
        this.A01 = interfaceC1714Zh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
