package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class SO {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public final void A00(boolean z10) {
        this.A00.set(z10);
    }

    public final boolean A01() {
        return this.A00.get();
    }
}
