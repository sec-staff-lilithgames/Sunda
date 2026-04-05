package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.oU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2592oU implements C1S {
    public static byte[] A00;
    public static String[] A01 = {"aC8uc30vckBh0ldJ8CsDkWWGmQgl7sOm", "2", "dPCbCdxH5PRV4edn", "QHj", "dDf", "KHWYQA", "nwDl9CeJStZlhkBKgBcw2akg3aHE6X2p", "I5"};
    public static final String A02;
    public static final C1R<AbstractC2592oU> A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-126, -101, -104, -101, -100, -92, -101, 77, AbstractJsonLexerKt.TC_INVALID, -114, -95, -106, -101, -108, -127, -90, -99, -110, 103, 77};
    }

    static {
        A07();
        A02 = AbstractC09264a.A0h(0);
        A03 = new C1R() { // from class: com.facebook.ads.redexgen.X.oX
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return AbstractC2592oU.A04(bundle);
            }
        };
    }

    public static AbstractC2592oU A04(Bundle bundle) {
        int i10 = bundle.getInt(A02, -1);
        switch (i10) {
            case 0:
                return (AbstractC2592oU) C10619s.A02.A6X(bundle);
            case 1:
                AbstractC2592oU abstractC2592oU = (AbstractC2592oU) C10599q.A02.A6X(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr = A01;
                    strArr[7] = "RK";
                    strArr[1] = "0";
                    return abstractC2592oU;
                }
                break;
            case 2:
                return (AbstractC2592oU) C10589p.A04.A6X(bundle);
            case 3:
                C1S c1sA6X = C10579o.A02.A6X(bundle);
                if (A01[6].charAt(2) != 'F') {
                    String[] strArr2 = A01;
                    strArr2[7] = "Vr";
                    strArr2[1] = "2";
                    return (AbstractC2592oU) c1sA6X;
                }
                break;
            default:
                throw new IllegalArgumentException(A06(0, 20, 36) + i10);
        }
        throw new RuntimeException();
    }
}
