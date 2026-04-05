package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1649Wu {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static String A01(long j10) {
        String string;
        String strA00 = A00(0, 0, 78);
        if (j10 < 1000) {
            string = j10 + strA00;
        } else {
            String strA002 = A00(0, 4, 79);
            if (j10 < 1000000) {
                StringBuilder sb2 = new StringBuilder();
                String formattedNumber = String.format(Locale.US, strA002, Double.valueOf(j10 / 1000.0d));
                StringBuilder sbAppend = sb2.append(formattedNumber);
                String formattedNumber2 = A00(8, 1, 55);
                string = sbAppend.append(formattedNumber2).toString();
            } else if (j10 < C.NANOS_PER_SECOND) {
                StringBuilder sb3 = new StringBuilder();
                String formattedNumber3 = String.format(Locale.US, strA002, Double.valueOf(j10 / 1000000.0d));
                StringBuilder sbAppend2 = sb3.append(formattedNumber3);
                String formattedNumber4 = A00(9, 1, 46);
                string = sbAppend2.append(formattedNumber4).toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                String formattedNumber5 = String.format(Locale.US, strA002, Double.valueOf(j10 / 1.0E9d));
                StringBuilder sbAppend3 = sb4.append(formattedNumber5);
                String formattedNumber6 = A00(7, 1, 67);
                string = sbAppend3.append(formattedNumber6).toString();
            }
        }
        String strA003 = A00(4, 3, 1);
        if (string.contains(strA003)) {
            return string.replace(strA003, strA00);
        }
        return string;
    }
}
