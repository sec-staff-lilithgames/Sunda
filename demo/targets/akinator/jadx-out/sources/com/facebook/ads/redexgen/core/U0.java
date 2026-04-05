package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class U0 {
    public final int A00;
    public final C1577Tx A01;

    public U0(int i10, C1577Tx c1577Tx) {
        this.A00 = i10;
        this.A01 = c1577Tx;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final C1568To A02(int i10, byte[] bArr, int i11, int[] iArr, int i12) throws IOException {
        return this.A01.A06(i10, bArr, i11, iArr, i12);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}
