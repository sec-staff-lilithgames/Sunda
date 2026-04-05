package com.facebook.ads.redexgen.core;

import java.io.Serializable;

/* loaded from: assets/audience_network.dex */
public final class NF implements Serializable {
    public static final long serialVersionUID = 42;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public NF(NE ne2) {
        this.A02 = ne2.A02;
        this.A03 = ne2.A03;
        this.A01 = ne2.A01;
        this.A00 = ne2.A00;
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
}
