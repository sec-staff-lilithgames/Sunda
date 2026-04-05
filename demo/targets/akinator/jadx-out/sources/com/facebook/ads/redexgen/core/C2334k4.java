package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.k4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2334k4 implements J7 {
    public final List<C2565o2> A00;

    public C2334k4(List<C2565o2> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C2565o2> A7P(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        C3M.A07(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
