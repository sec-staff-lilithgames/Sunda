package com.facebook.ads.redexgen.core;

import java.io.Serializable;

/* loaded from: assets/audience_network.dex */
public final class O1 implements Serializable {
    public O0 A00;
    public O0 A01;

    public O1() {
        this(0.5d, 0.5d);
    }

    public O1(double d10) {
        this(d10, 0.5d);
    }

    public O1(double d10, double d11) {
        this.A00 = new O0(d10);
        this.A01 = new O0(d11);
        A02();
    }

    public final O0 A00() {
        return this.A00;
    }

    public final O0 A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d10, double d11) {
        this.A00.A09(d10, d11);
    }

    public final void A05(double d10, double d11) {
        this.A01.A09(d10, d11);
    }
}
