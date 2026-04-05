package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1797b4 implements Runnable {
    public final /* synthetic */ JU A00;

    public RunnableC1797b4(JU ju2) {
        this.A00 = ju2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0Q) {
                this.A00.A0N();
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
