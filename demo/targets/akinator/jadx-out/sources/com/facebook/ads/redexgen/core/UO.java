package com.facebook.ads.redexgen.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class UO {
    public double A00;
    public UU A01;
    public UV A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final UO A00(double d10) {
        this.A00 = d10;
        return this;
    }

    public final UO A01(UU uu2) {
        this.A01 = uu2;
        return this;
    }

    public final UO A02(UV uv2) {
        this.A02 = uv2;
        return this;
    }

    public final UO A03(String str) {
        this.A03 = str;
        return this;
    }

    public final UO A04(String str) {
        this.A04 = str;
        return this;
    }

    public final UO A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final UO A06(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final UP A07(SQ sq2) {
        return new UP(sq2, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
