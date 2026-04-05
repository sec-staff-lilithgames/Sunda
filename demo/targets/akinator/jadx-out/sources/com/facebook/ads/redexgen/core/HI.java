package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public abstract class HI {
    public final H1 A00;

    public abstract boolean A0B(C4J c4j) throws C08822i;

    public abstract boolean A0C(C4J c4j, long j10) throws C08822i;

    public HI(H1 h12) {
        this.A00 = h12;
    }

    public final boolean A00(C4J c4j, long j10) throws C08822i {
        return A0B(c4j) && A0C(c4j, j10);
    }
}
