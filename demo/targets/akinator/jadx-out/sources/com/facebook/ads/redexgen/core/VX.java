package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class VX {
    public final TE A00;
    public final VW A01;
    public final String A02;

    public VX(VW vw2) {
        this(vw2, null, null);
    }

    public VX(VW vw2, TE te2, String str) {
        this.A01 = vw2;
        this.A00 = te2;
        this.A02 = str;
    }

    public TE A00() {
        return this.A00;
    }

    public final VW A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }
}
