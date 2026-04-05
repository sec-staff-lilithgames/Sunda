package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2360kU implements InterfaceC1295Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C1228Gg A02;
    public C1229Gh A03;

    public C2360kU(C1229Gh c1229Gh, C1228Gg c1228Gg) {
        this.A03 = c1229Gh;
        this.A02 = c1228Gg;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1295Iw
    public final InterfaceC1244Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C2400lK(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1295Iw
    public final long AGd(InterfaceC2403lN interfaceC2403lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1295Iw
    public final void AJR(long j10) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC09264a.A0L(jArr, j10, true, true)];
    }
}
