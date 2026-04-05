package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public class TA extends MQ {
    public static byte[] A01;
    public final /* synthetic */ C1480Qc A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, AbstractJsonLexerKt.TC_INVALID, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, AbstractJsonLexerKt.TC_INVALID, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, AbstractJsonLexerKt.TC_INVALID, 98, Utf8.REPLACEMENT_BYTE};
    }

    public TA(C1480Qc c1480Qc) {
        this.A00 = c1480Qc;
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0B(C2233iN c2233iN) {
        this.A00.A1W(c2233iN);
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0C() {
        if (this.A00.A0G != null) {
            this.A00.A0G.ACD();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0F(MP mp2) {
        if (this.A00.A0A != null) {
            this.A00.A0A.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0G(V1 v12) {
        this.A00.A12().A0F().A3F(XG.A01(this.A00.A00), v12.A03().getErrorCode(), v12.A04());
        if (this.A00.A0G != null) {
            this.A00.A0G.ADB(v12);
        }
    }
}
