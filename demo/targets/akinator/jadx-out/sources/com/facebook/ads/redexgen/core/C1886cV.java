package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1886cV {
    public String A02;
    public String A03;
    public String A04;
    public final C1398Mw A06;
    public final N9 A07;
    public final C1937dL A08;
    public C1400My A01 = C1400My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C1886cV(C1937dL c1937dL, C1398Mw c1398Mw, N9 n9) {
        this.A08 = c1937dL;
        this.A06 = c1398Mw;
        this.A07 = n9;
    }

    public final C1886cV A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1886cV A0A(C1400My c1400My) {
        this.A01 = c1400My;
        return this;
    }

    public final C1886cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C1886cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C1886cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C1886cV A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C1888cX A0F() {
        return new C1888cX(this, null);
    }
}
