package com.facebook.ads.redexgen.core;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class ES {
    public final CopyOnWriteArrayList<ER> A00 = new CopyOnWriteArrayList<>();

    public final void A00(int i10, long j10, long j11) {
        Iterator<ER> it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            ER.A02(null);
            throw null;
        }
    }
}
