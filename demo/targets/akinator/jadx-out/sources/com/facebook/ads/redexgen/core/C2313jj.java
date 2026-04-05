package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.jj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2313jj implements KW {
    public C2614or A00;
    public C4R A01;
    public H1 A02;

    public C2313jj(String str) {
        this.A00 = new C2D().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        C3M.A02(this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void A52(C4J c4j) {
        A00();
        long jA03 = this.A01.A03();
        long jA04 = this.A01.A04();
        if (jA03 == C.TIME_UNSET || jA04 == C.TIME_UNSET) {
            return;
        }
        if (jA04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(jA04).A14();
            this.A02.A6W(this.A00);
        }
        int iA07 = c4j.A07();
        this.A02.AI7(c4j, iA07);
        this.A02.AIA(jA03, 1, iA07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void AA2(C4R c4r, GY gy, C1329Ke c1329Ke) {
        this.A01 = c4r;
        c1329Ke.A05();
        this.A02 = gy.AJh(c1329Ke.A03(), 5);
        this.A02.A6W(this.A00);
    }
}
