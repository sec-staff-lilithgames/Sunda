package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1339Ko extends AbstractRunnableC1624Vt {
    public final WeakReference<C2010eX> A00;

    public C1339Ko(C2010eX c2010eX) {
        this.A00 = new WeakReference<>(c2010eX);
    }

    public C1339Ko(WeakReference<C2010eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        C2010eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
