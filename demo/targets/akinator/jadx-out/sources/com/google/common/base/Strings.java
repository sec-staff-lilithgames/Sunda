package com.google.common.base;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class Strings {
    public static byte[] A00;
    public static String[] A01 = {"", "rJg0GTHRX", "K9dQxfkFvyPrqanCyvVi9t8TsdGmyNgC", "tUuj0V7XDkeAi6SkgPTUgMEzqoPOG2wI", "s5Ev4BEaYYaheBbHJPARkFomt6p83FKm", "U0fqfbzQ6IMhOxnuinQg0kR", "WEAQUpFs2V4MiUsuqBnPNaxCCDrbqZTD", "9mERPiqnqMQrbOPuWUaYAoq2giX9Yyaq"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{124, 7, 85, 1, 29, 7, 16, 2, 85, 20, 66, 108, 11, 38, 46, 33, 39, 48, 31, 25, 109, 42, 49, 40, 40, 74, 70, 18, 122, 48, 13, 22, 16, 5, 1, 28, 26, 27, 85, 17, 0, 7, 28, 27, 18, 85, 25, 16, 27, 28, 16, 27, 1, 51, 26, 7, 24, 20, 1, 85, 19, 26, 7, 85, 38, 42, 40, 107, 34, 42, 42, 34, 41, 32, 107, 38, 42, 40, 40, 42, 43, 107, 39, 36, 54, 32, 107, 22, 49, 55, 44, 43, 34, 54, 59, 32, 57, 57};
    }

    static {
        A03();
    }

    public static String A01(@CheckForNull Object o10) {
        if (o10 == null) {
            return A00(94, 4, 87);
        }
        try {
            return o10.toString();
        } catch (Exception e10) {
            String str = o10.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o10));
            Logger.getLogger(A00(64, 30, 71)).log(Level.WARNING, A00(29, 35, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + str, (Throwable) e10);
            return A00(27, 1, 44) + str + A00(2, 7, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + e10.getClass().getName() + A00(28, 1, 70);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x007c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A02(@javax.annotation.CheckForNull java.lang.String r6, @javax.annotation.CheckForNull java.lang.Object... r7) {
        /*
            java.lang.String r3 = java.lang.String.valueOf(r6)
            if (r7 != 0) goto L7a
            r0 = 1
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r2 = 11
            r1 = 14
            r0 = 70
            java.lang.String r1 = A00(r2, r1, r0)
            r0 = 0
            r7[r0] = r1
        L16:
            int r1 = r3.length()
            int r0 = r7.length
            int r0 = r0 * 16
            int r1 = r1 + r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r6 = 0
            r5 = 0
        L25:
            int r0 = r7.length
            if (r5 >= r0) goto L38
            r2 = 9
            r1 = 2
            r0 = 51
            java.lang.String r0 = A00(r2, r1, r0)
            int r2 = r3.indexOf(r0, r6)
            r0 = -1
            if (r2 != r0) goto L6c
        L38:
            int r0 = r3.length()
            r4.append(r3, r6, r0)
            int r0 = r7.length
            if (r5 >= r0) goto L8e
            r2 = 0
            r1 = 2
            r0 = 94
            java.lang.String r0 = A00(r2, r1, r0)
            r4.append(r0)
            int r3 = r5 + 1
            r0 = r7[r5]
            r4.append(r0)
        L54:
            int r0 = r7.length
            if (r3 >= r0) goto L89
            r2 = 25
            r1 = 2
            r0 = 100
            java.lang.String r0 = A00(r2, r1, r0)
            r4.append(r0)
            int r1 = r3 + 1
            r0 = r7[r3]
            r4.append(r0)
            r3 = r1
            goto L54
        L6c:
            r4.append(r3, r6, r2)
            int r1 = r5 + 1
            r0 = r7[r5]
            r4.append(r0)
            int r6 = r2 + 2
            r5 = r1
            goto L25
        L7a:
            r1 = 0
        L7b:
            int r0 = r7.length
            if (r1 >= r0) goto L16
            r0 = r7[r1]
            java.lang.String r0 = A01(r0)
            r7[r1] = r0
            int r1 = r1 + 1
            goto L7b
        L89:
            r0 = 93
            r4.append(r0)
        L8e:
            java.lang.String r3 = r4.toString()
            java.lang.String[] r2 = com.google.common.base.Strings.A01
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb3
            java.lang.String[] r2 = com.google.common.base.Strings.A01
            java.lang.String r1 = "Qm2mYSTY5Rq3J9usgP1HZ6PJLyEDSebu"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "9oyFi5AVRUYlh10JePir3xWfNUiO2b4f"
            r0 = 4
            r2[r0] = r1
            return r3
        Lb3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Strings.A02(java.lang.String, java.lang.Object[]):java.lang.String");
    }
}
