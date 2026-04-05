package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Qd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1481Qd {
    public static byte[] A0H;
    public int A01;
    public int A02;
    public int A06;
    public int A07;
    public long A08;
    public SparseArray<Object> A0G;
    public int A0F = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{75, 9, 30, 31, 75, 2, 31, 75, 2, 24, 75, 22, 26, 87, 126, 91, 78, 91, 7, 78, 66, 15, 38, 7, 14, 7, 22, 7, 6, 43, 12, 20, 11, 17, 11, 0, 14, 7, 43, 22, 7, 15, 33, 13, 23, 12, 22, 49, 11, 12, 1, 7, 50, 16, 7, 20, 11, 13, 23, 17, 46, 3, 27, 13, 23, 22, 95, 33, 45, 96, 68, 99, 93, AbstractJsonLexerKt.TC_INVALID, 104, 65, 108, 116, 98, 120, 121, 48, 60, 48, 125, 89, 100, 117, 125, 83, AbstractJsonLexerKt.TC_INVALID, 101, 126, 100, 45, 3, 15, 66, AbstractJsonLexerKt.TC_INVALID, 93, 74, 89, 70, 64, 90, 92, 99, 78, 86, 64, 90, 91, 102, 91, 74, 66, 108, 64, 90, 65, 91, 18, 86, 90, 23, 40, 15, 20, 42, 8, 31, 30, 19, 25, 14, 19, 12, 31, 59, 20, 19, 23, 27, 14, 19, 21, 20, 9, 71, 41, 37, 104, 87, 112, 107, 86, 108, 104, 117, 105, 96, 68, 107, 108, 104, 100, 113, 108, 106, 107, 118, 56, 17, 29, 80, 110, 73, 79, 72, 94, 73, 72, 79, 88, 126, 85, 92, 83, 90, 88, 89, 0, 120, 85, 77, 91, 65, 64, 20, 71, 64, 85, 64, 81, 20, 71, 92, 91, 65, 88, 80, 20, 86, 81, 20, 91, 90, 81, 20, 91, 82, 20, 107, 76, 89, 76, 93, 67, 85, 108, 89, 74, 95, 93, 76, 104, 87, 75, 81, 76, 81, 87, 86, 5};
    }

    public final int A03() {
        if (this.A09) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public final void A04(int i10) {
        if ((this.A04 & i10) != 0) {
        } else {
            throw new IllegalStateException(A01(PsExtractor.AUDIO_STREAM, 30, 44) + Integer.toBinaryString(i10) + A01(0, 11, 115) + Integer.toBinaryString(this.A04));
        }
    }

    public final void A05(QC qc2) {
        this.A04 = 1;
        this.A03 = qc2.A0B();
        this.A09 = false;
        this.A0E = false;
        this.A0A = false;
    }

    public final boolean A06() {
        return this.A0F != -1;
    }

    public final boolean A07() {
        return this.A09;
    }

    public final boolean A08() {
        return this.A0B;
    }

    public final String toString() {
        return A01(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 22, 32) + this.A0F + A01(11, 8, 34) + this.A0G + A01(82, 13, 8) + this.A03 + A01(95, 27, 55) + this.A05 + A01(19, 48, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + this.A00 + A01(172, 20, 37) + this.A0D + A01(67, 15, 21) + this.A09 + A01(149, 23, 29) + this.A0C + A01(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 27, 98) + this.A0B + AbstractJsonLexerKt.END_OBJ;
    }
}
