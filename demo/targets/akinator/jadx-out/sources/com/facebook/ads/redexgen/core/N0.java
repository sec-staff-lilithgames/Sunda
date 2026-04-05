package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class N0 implements Serializable {
    public static final long serialVersionUID = -2102939945352398575L;
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final List<String> A05;

    public N0(List<String> screenshots, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        this.A05 = screenshots;
        this.A00 = j10;
        this.A01 = j11;
        this.A04 = z10;
        this.A02 = z11;
        this.A03 = z12;
    }

    public final long A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final List<String> A02() {
        return Collections.unmodifiableList(this.A05);
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }

    public final boolean A05() {
        return this.A04;
    }
}
