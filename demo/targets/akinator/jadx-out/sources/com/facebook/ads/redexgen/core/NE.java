package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class NE {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final NE A04(String str) {
        this.A00 = str;
        return this;
    }

    public final NE A05(String str) {
        this.A01 = str;
        return this;
    }

    public final NE A06(String str) {
        this.A02 = str;
        return this;
    }

    public final NE A07(String str) {
        this.A03 = str;
        return this;
    }

    public final NF A08() {
        return new NF(this);
    }
}
