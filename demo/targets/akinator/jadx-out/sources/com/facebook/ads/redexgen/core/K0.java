package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC1721Zo {
    public final WeakReference<C09595h> A00;

    public K0(C09595h c09595h) {
        this.A00 = new WeakReference<>(c09595h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1721Zo
    public final void ADT(C1720Zn c1720Zn) {
        C09595h c09595h = this.A00.get();
        if (c09595h != null) {
            c09595h.A04 = c1720Zn.A00() != null;
            c09595h.A02();
        }
    }
}
