package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2296jS implements InterfaceC1244Gw {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C1336Kl A04;

    public C2296jS(C1336Kl c1336Kl, int i10, long j10, long j11) {
        this.A04 = c1336Kl;
        this.A00 = i10;
        this.A03 = j10;
        this.A01 = (j11 - j10) / c1336Kl.A02;
        this.A02 = A00(this.A01);
    }

    private long A00(long j10) {
        return AbstractC09264a.A0U(j10 * this.A00, 1000000L, this.A04.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        long jA0T = AbstractC09264a.A0T((this.A04.A04 * j10) / (this.A00 * 1000000), 0L, this.A01 - 1);
        long j11 = this.A03 + (this.A04.A02 * jA0T);
        long jA00 = A00(jA0T);
        C1245Gx c1245Gx = new C1245Gx(jA00, j11);
        if (jA00 >= j10 || jA0T == this.A01 - 1) {
            return new C1243Gv(c1245Gx);
        }
        long j12 = 1 + jA0T;
        return new C1243Gv(c1245Gx, new C1245Gx(A00(j12), this.A03 + (this.A04.A02 * j12)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return true;
    }
}
