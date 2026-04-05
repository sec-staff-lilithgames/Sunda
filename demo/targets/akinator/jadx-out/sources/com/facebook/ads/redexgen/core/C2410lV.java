package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2410lV implements InterfaceC1244Gw {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final GL A06;

    public C2410lV(GL gl2, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.A06 = gl2;
        this.A03 = j10;
        this.A05 = j11;
        this.A02 = j12;
        this.A04 = j13;
        this.A01 = j14;
        this.A00 = j15;
    }

    public final long A05(long j10) {
        return this.A06.AJf(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        return new C1243Gv(new C1245Gx(j10, GK.A05(this.A06.AJf(j10), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return true;
    }
}
