package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class ZR {
    public final String A07;
    public long A01 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A00 = -1;
    public long A05 = -1;
    public long A02 = -1;
    public long A06 = -1;

    public ZR(String str) {
        this.A07 = str;
    }

    public final ZR A00(long j10) {
        this.A00 = j10;
        return this;
    }

    public final ZR A01(long j10) {
        this.A01 = j10;
        return this;
    }

    public final ZR A02(long j10) {
        this.A02 = j10;
        return this;
    }

    public final ZR A03(long j10) {
        this.A03 = j10;
        return this;
    }

    public final ZR A04(long j10) {
        this.A04 = j10;
        return this;
    }

    public final ZR A05(long j10) {
        this.A05 = j10;
        return this;
    }

    public final ZR A06(long j10) {
        this.A06 = j10;
        return this;
    }

    public final ZS A07() {
        return new ZS(this.A07, this.A01, this.A03, this.A04, this.A00, this.A05, this.A02, this.A06);
    }
}
