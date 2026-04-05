package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1838bj implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"cNFcWbBTlC21yVLFwbr", "9GV2E8F9E2oE8CHXfnhYKiZsDK3egbEW", "QOwDSeu1r9UmOYKCJ4q7pu", "wLxLWw50lPgC4sAeZiCwv7pW84ixD2Ig", "u8mrTBG1NeFkrttZ2j0LSs7yOPehuw8f", "R35JTbeYnLlLSORxODVCOg1", "dSDMu8RDcGvfG7f91Jn", "vgGOrZScmi2DEwHan2nQobkknD6iF2"};
    public final /* synthetic */ AnonymousClass54 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{121, 70, 75, 74, 64, AbstractJsonLexerKt.TC_INVALID, 67, 78, 86, 77, 78, 76, 68, 106, 93, 93, 64, 93};
    }

    static {
        A01();
    }

    public RunnableC1838bj(AnonymousClass54 anonymousClass54) {
        this.A00 = anonymousClass54;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0I(A00(0, 18, 33));
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            if (A02[3].charAt(14) != 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "BiobfU8eOeDJTRwO1wDdFp";
            strArr[5] = "4fmLJ7Dm7W0RRBNKueLwAfq";
        }
    }
}
