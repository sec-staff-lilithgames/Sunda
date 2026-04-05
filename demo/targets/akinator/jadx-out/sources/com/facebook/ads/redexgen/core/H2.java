package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class H2 {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{78, 104, 111, AbstractJsonLexerKt.TC_INVALID, 82, 94, 58, 121, 114, 111, 116, 113, 58, 105, 123, 119, 106, 118, AbstractJsonLexerKt.TC_INVALID, 105, 58, 119, 111, 105, 110, 58, 120, AbstractJsonLexerKt.TC_INVALID, 58, 121, 117, 116, 110, 115, 125, 111, 117, 111, 105, 58, 115, 116, 58, 110, 114, AbstractJsonLexerKt.TC_INVALID, 58, 105, 123, 119, 106, 118, AbstractJsonLexerKt.TC_INVALID, 58, 107, 111, AbstractJsonLexerKt.TC_INVALID, 111, AbstractJsonLexerKt.TC_INVALID, 52};
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(InterfaceC2403lN interfaceC2403lN) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC2403lN.AG9(this.A06, 0, 10);
        interfaceC2403lN.AI1();
        if (GF.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(H1 h12, long j10, int i10, int i11, int i12, C1247Gz c1247Gz) {
        C3M.A0A(this.A01 <= i11 + i12, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i13 = this.A02;
        this.A02 = i13 + 1;
        if (i13 == 0) {
            this.A04 = j10;
            this.A00 = i10;
            this.A03 = 0;
        }
        this.A03 += i11;
        this.A01 = i12;
        if (this.A02 >= 16) {
            A05(h12, c1247Gz);
        }
    }

    public final void A05(H1 h12, C1247Gz c1247Gz) {
        if (this.A02 > 0) {
            h12.AIA(this.A04, this.A00, this.A03, this.A01, c1247Gz);
            this.A02 = 0;
        }
    }
}
