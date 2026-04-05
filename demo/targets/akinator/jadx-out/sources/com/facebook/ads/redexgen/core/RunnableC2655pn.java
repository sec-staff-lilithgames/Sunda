package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2655pn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2654pm A01;
    public final /* synthetic */ Exception A02;

    public RunnableC2655pn(C2654pm c2654pm, int i10, Exception exc) {
        this.A01 = c2654pm;
        this.A00 = i10;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    if (!A8.A07 || !this.A01.A08()) {
                        this.A01.A05(this.A01.A05.AC6());
                        this.A01.A04.postDelayed(this.A01.A0A, this.A00);
                    } else {
                        this.A01.A0C();
                    }
                }
            } catch (Exception ex2) {
                ex2.initCause(this.A02);
                throw ex2;
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
