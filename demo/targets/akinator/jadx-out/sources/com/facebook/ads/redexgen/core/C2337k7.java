package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.k7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2337k7 implements J7 {
    public final long[] A00;
    public final C2565o2[] A01;

    public C2337k7(C2565o2[] c2565o2Arr, long[] jArr) {
        this.A01 = c2565o2Arr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C2565o2> A7P(long j10) {
        int iA0L = AbstractC09264a.A0L(this.A00, j10, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C2565o2.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        boolean z10 = true;
        C3M.A07(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        C3M.A07(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        int iA0K = AbstractC09264a.A0K(this.A00, j10, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
