package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.5D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C5D {
    public static byte[] A00;
    public static String[] A01 = {"G8ArwIe2VOAE4nt8xzvdLml4UmjpJECF", "hTc5Tda99b5K7ktAOz7Sk2ePkoxu5mJv", "uXzWM43WnlFlNXm1DUXcodvE16nJuXl6", "iRkaMP8lpeEdZIVhMcVD", "lMyhq9DthkfLW6CwBUqq2OEeTBOLdcXD", "OKiPy9zk89rZ6EyhyRbLHpsFwU1qXXE1", "FmDgVX5KrdTAXflr9ckY", "OW8d6LiXJNMD0YcnlVVA282INy85kiu1"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{101, 39, 27, 27, 31, 58, 27, 6, 3, 103, 64, 77, 65, 64, 93, 71, 93, 90, 75, 64, 90, 14, 70, 75, 79, 74, 75, 92, 93, 14, 117, 84, 111, 100, 121, 113, 100, 98, 117, 100, 101, 33, 66, 110, 111, 117, 100, 111, 117, 44, 77, 100, 111, 102, 117, 105, 33, 90, 117, 78, 69, 88, 80, 69, 67, 84, 69, 68, 0, 99, 79, 78, 84, 69, 78, 84, 13, 114, 65, 78, 71, 69, 0, 123, 49, 107, 22, 109, 5, 30, 19, 2, 20, 71, 79, 88, 93, 79, 88, 93, 59, 3, 76, 74, 59, 3, 76, 78, 27, 59, 77, 78, 72, 79, 59, 3, 76, 78, 115, 104, 101, 116, 98, 49, 57, 77, 117, 58, 56, 60, 57, 77, 117, 58, 56, 62, 57, 46, 43, 77, 117, 58, 109, 77, 59, 56, 104, 115, 126, 111, 121, 55};
    }

    static {
        A04();
        A03 = Pattern.compile(A02(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 28, 72));
        A02 = Pattern.compile(A02(88, 30, 62));
    }

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) C3M.A01(matcher.group(1)));
        }
        return -1L;
    }

    public static long A01(String str, String str2) throws NumberFormatException {
        long jMax = -1;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strA02 = A02(84, 1, 53);
        String strA022 = A02(1, 8, 54);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AnonymousClass44.A05(strA022, A02(31, 27, 88) + str + strA02);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = A03.matcher(str2);
            if (matcher.matches()) {
                try {
                    long j10 = (Long.parseLong((String) C3M.A01(matcher.group(2))) - Long.parseLong((String) C3M.A01(matcher.group(1)))) + 1;
                    if (jMax < 0) {
                        return j10;
                    }
                    if (jMax != j10) {
                        AnonymousClass44.A07(strA022, A02(9, 22, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + str + A02(85, 3, 111) + str2 + strA02);
                        jMax = Math.max(jMax, j10);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    AnonymousClass44.A05(strA022, A02(58, 26, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) + str2 + strA02);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A03(long r6, long r8) {
        /*
            r1 = 0
            r4 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C5D.A01
            r0 = 7
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L23
        L1d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L23:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C5D.A01
            java.lang.String r1 = "BG6bsnZi4wlgFYmXUZNM"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "Qc01l7LnjPCXX6IxAAkq"
            r0 = 6
            r2[r0] = r1
            if (r3 != 0) goto L33
            r0 = 0
            return r0
        L33:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 146(0x92, float:2.05E-43)
            r1 = 6
            r0 = 83
            java.lang.String r0 = A02(r2, r1, r0)
            r3.append(r0)
            r3.append(r6)
            r2 = 0
            r1 = 1
            r0 = 17
            java.lang.String r0 = A02(r2, r1, r0)
            r3.append(r0)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r6 = r6 + r8
            r0 = 1
            long r6 = r6 - r0
            r3.append(r6)
        L5d:
            java.lang.String r3 = r3.toString()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C5D.A01
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L74
            goto L1d
        L74:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C5D.A01
            java.lang.String r1 = "BYD36Vzxv8JTZl7GEmQPPJy8vzWoDg2F"
            r0 = 0
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C5D.A03(long, long):java.lang.String");
    }
}
