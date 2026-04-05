package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public final /* synthetic */ C09846g A00;

    public QA(C09846g c09846g) {
        this.A00 = c09846g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A05 != null) {
            this.A00.A05.A0I();
        }
        this.A00.A0K = false;
    }
}
