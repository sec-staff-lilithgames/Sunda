package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.hE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2172hE extends AbstractRunnableC1624Vt {
    public static byte[] A01;
    public final /* synthetic */ AbstractC2171hD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, 38, 48, 55, 49, 44, 58, 99, 52, 34, 48, 99, 45, 44, 55, 99, 32, 34, 47, 47, 38, 39, 109, 123, AbstractJsonLexerKt.TC_INVALID, 124, 72, 89, 84, 88, 83, 94, 88, 115, 88, 73, 74, 82, 79, 86, 86, 96, 122, 47, 107, 102, 107, 97, 40, 123, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, 39, 38, 47, 105, 96, 125, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, 33, 47, 91, 103, 102, 124, 47, 98, 110, 118, 47, 99, 106, 110, 107, 47, 123, 96, 47, 99, 106, 110, 100, 102, 97, 104, 47, 98, 106, 98, 96, 125, 118, 33, 47, 95, 99, 106, 110, 124, 106, 35, 47, 110, 99, 120, 110, 118, 124, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, 39, 38, 47, 120, 103, 106, 97, 47, 118, 96, 122, 47, 107, 96, 97, 40, 123, 47, 97, 106, 106, 107, 47, 123, 103, 102, 124, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, 47, 110, 97, 118, 47, 98, 96, 125, 106, 33, 56, 41, 48};
    }

    public C2172hE(AbstractC2171hD abstractC2171hD) {
        this.A00 = abstractC2171hD;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A02.A0F().A3N();
        if (this.A00.A00.A6h() == NZ.A03) {
            return;
        }
        if (!BuildConfigApi.isDebug()) {
            this.A00.A02.A08().ABR(A00(188, 3, 107), AbstractC1550Sv.A0Y, new C1551Sw(A00(0, 23, 113)));
        }
        Log.e(A00(23, 17, 15), A00(40, 148, 61));
        this.A00.A08();
    }
}
