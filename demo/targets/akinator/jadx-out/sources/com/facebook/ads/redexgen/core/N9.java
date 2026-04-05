package com.facebook.ads.redexgen.core;

import java.io.Serializable;

/* loaded from: assets/audience_network.dex */
public final class N9 implements Serializable {
    public static final long serialVersionUID = 351643298236575728L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public N9(N8 n82) {
        this.A02 = n82.A02;
        this.A01 = n82.A01;
        this.A00 = n82.A00;
        this.A03 = n82.A03;
    }

    public final String A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }
}
