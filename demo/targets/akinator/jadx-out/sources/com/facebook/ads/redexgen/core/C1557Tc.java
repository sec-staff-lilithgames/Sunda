package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1557Tc implements InterfaceC1590Uk {
    public WeakReference<C1480Qc> A00;

    public C1557Tc(C1480Qc c1480Qc) {
        this.A00 = new WeakReference<>(c1480Qc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1590Uk
    public final void AEW(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z10, false);
        }
    }
}
