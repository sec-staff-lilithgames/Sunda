package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10237t implements InterfaceC2376kk {
    public long A00;
    public final long A01;
    public final AnonymousClass45 A03 = new AnonymousClass45();
    public final AnonymousClass45 A02 = new AnonymousClass45();

    public C10237t(long j10, long j11, long j12) {
        this.A00 = j10;
        this.A01 = j12;
        this.A03.A04(0L);
        this.A02.A04(j11);
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(long j10, long j11) {
        if (A02(j10)) {
            return;
        }
        this.A03.A04(j10);
        this.A02.A04(j11);
    }

    public final boolean A02(long j10) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j10 - lastIndexedTimeUs < 100000;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2376kk
    public final long A7b() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final C1243Gv A8t(long j10) {
        int iA0C = AbstractC09264a.A0C(this.A03, j10, true, true);
        C1245Gx c1245Gx = new C1245Gx(this.A03.A03(iA0C), this.A02.A03(iA0C));
        if (c1245Gx.A01 != j10) {
            int targetIndex = this.A03.A02();
            if (iA0C != targetIndex - 1) {
                int targetIndex2 = iA0C + 1;
                long jA03 = this.A03.A03(targetIndex2);
                int targetIndex3 = iA0C + 1;
                C1245Gx nextSeekPoint = new C1245Gx(jA03, this.A02.A03(targetIndex3));
                return new C1243Gv(c1245Gx, nextSeekPoint);
            }
        }
        return new C1243Gv(c1245Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2376kk
    public final long A99(long j10) {
        return this.A03.A03(AbstractC09264a.A0C(this.A02, j10, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1244Gw
    public final boolean AAa() {
        return true;
    }
}
