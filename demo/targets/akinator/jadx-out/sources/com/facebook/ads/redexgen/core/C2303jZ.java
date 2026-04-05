package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2303jZ implements KW {
    public final C4I A00 = new C4I(new byte[4]);
    public final /* synthetic */ C2301jX A01;

    public C2303jZ(C2301jX c2301jX) {
        this.A01 = c2301jX;
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void A52(C4J c4j) {
        int tableId = c4j.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c4j.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c4j.A0g(6);
        int iA07 = c4j.A07() / 4;
        for (int i10 = 0; i10 < iA07; i10++) {
            c4j.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int iA04 = this.A00.A04(13);
                if (this.A01.A0B.get(iA04) == null) {
                    this.A01.A0B.put(iA04, new C2307jd(new C2302jY(this.A01, iA04)));
                    C2301jX.A02(this.A01);
                }
            }
        }
        int secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            this.A01.A0B.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void AA2(C4R c4r, GY gy, C1329Ke c1329Ke) {
    }
}
