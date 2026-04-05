package com.facebook.ads.redexgen.core;

import io.ktor.util.cio.ByteBufferPoolKt;

/* renamed from: com.facebook.ads.redexgen.X.jd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2307jd implements InterfaceC1330Kf {
    public static String[] A06 = {"EnQWPJ3V2xjVAThncas5joPITTvIB7EF", "1EuaMqG73HQ", "rjBteZjJ0vNfufCjCKCkAuxJVtJJHvWb", "xDvWT2DyWg3zA1fFgEAgA6zc8FBdFJ1B", "sfKNNRwM9cmkD7QHngaf04", "qaF2qGcI8dYBUqEwfxAr3oVVO8wm", "moKLjsoCWr0SdwKtjYcTHr1Csc5rll9E", "bRjHr7kF"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C4J A04 = new C4J(32);
    public final KW A05;

    public C2307jd(KW kw2) {
        this.A05 = kw2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1330Kf
    public final void A53(C4J c4j, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iA09 = -1;
        if (z10) {
            iA09 = c4j.A09() + c4j.A0I();
        }
        boolean payloadUnitStartIndicator = this.A03;
        if (payloadUnitStartIndicator) {
            if (!z10) {
                return;
            }
            this.A03 = false;
            c4j.A0f(iA09);
            this.A00 = 0;
        }
        while (c4j.A07() > 0) {
            if (this.A00 < 3) {
                if (this.A00 == 0) {
                    int iA0I = c4j.A0I();
                    c4j.A0f(c4j.A09() - 1);
                    if (iA0I == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int iMin = Math.min(c4j.A07(), 3 - this.A00);
                c4j.A0k(this.A04.A0l(), this.A00, iMin);
                this.A00 += iMin;
                if (this.A00 == 3) {
                    this.A04.A0f(0);
                    this.A04.A0e(3);
                    this.A04.A0g(1);
                    int iA0I2 = this.A04.A0I();
                    int iA0I3 = this.A04.A0I();
                    boolean payloadUnitStartIndicator2 = (iA0I2 & 128) != 0;
                    this.A02 = payloadUnitStartIndicator2;
                    this.A01 = (((iA0I2 & 15) << 8) | iA0I3) + 3;
                    if (this.A04.A08() < this.A01) {
                        this.A04.A0c(Math.min(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE, Math.max(this.A01, this.A04.A08() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c4j.A07(), this.A01 - this.A00);
                c4j.A0k(this.A04.A0l(), this.A00, iMin2);
                this.A00 += iMin2;
                if (this.A00 == this.A01) {
                    boolean payloadUnitStartIndicator3 = this.A02;
                    if (payloadUnitStartIndicator3) {
                        if (AbstractC09264a.A0I(this.A04.A0l(), 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A04.A0e(this.A01 - 4);
                    } else {
                        this.A04.A0e(this.A01);
                    }
                    this.A04.A0f(0);
                    KW kw2 = this.A05;
                    if (A06[3].charAt(18) == '6') {
                        throw new RuntimeException();
                    }
                    A06[6] = "q6sMTbjJkDPtFUqTMgY1hgSKkn8mDgdv";
                    kw2.A52(this.A04);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1330Kf
    public final void AA2(C4R c4r, GY gy, C1329Ke c1329Ke) {
        this.A05.AA2(c4r, gy, c1329Ke);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1330Kf
    public final void AIL() {
        this.A03 = true;
    }
}
