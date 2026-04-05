package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.facebook.ads.redexgen.X.44, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass44 {
    public static int A00;
    public static AnonymousClass43 A01;
    public static boolean A02;
    public static byte[] A03;
    public static String[] A04 = {"pjC", "Ar4G3OSxcgl2D", "AarUE2nt7cnp4GdKoelKCQn2Jt4OXyEc", "B5uTmPcht7q4WCzfelpVRln9dVKzTr9W", "36fORse15dXsGKgrcWq47HxFqRHPKtSm", "Eh56lsHHP32qxPGDjQKhG4rai7NSZl8p", "QN71kq8063jCyPpsf", "zuMcuSAj79dOj6A3T"};
    public static final Object A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A04[1].length() == 28) {
                throw new RuntimeException();
            }
            A04[0] = "EwS";
            bArrCopyOfRange[i13] = (byte) (i14 - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-58, -65, AbstractJsonLexerKt.TC_INVALID, -107, -107, 4, 4, 4, 4, -8, 17, 14, 17, 18, 26, 17, -21, 18, 22, 23, -24, 27, 6, 8, 19, 23, 12, 18, 17, -61, -53, 17, 18, -61, 17, 8, 23, 26, 18, 21, 14, -52};
    }

    static {
        A03();
        A05 = new Object();
        A00 = 0;
        A02 = true;
        A01 = AnonymousClass43.A00;
    }

    @Pure
    public static String A01(String str, Throwable th2) {
        String strA02 = A02(th2);
        if (!TextUtils.isEmpty(strA02)) {
            StringBuilder sbAppend = new StringBuilder().append(str);
            String strA00 = A00(2, 3, 2);
            StringBuilder sbAppend2 = sbAppend.append(strA00);
            String throwableString = A00(1, 1, 66);
            return sbAppend2.append(strA02.replace(throwableString, strA00)).append('\n').toString();
        }
        return str;
    }

    @Pure
    public static String A02(Throwable th2) {
        synchronized (A05) {
            if (th2 == null) {
                return null;
            }
            if (A0B(th2)) {
                return A00(9, 33, 48);
            }
            if (!A02) {
                return th2.getMessage();
            }
            return Log.getStackTraceString(th2).trim().replace(A00(0, 1, 74), A00(5, 4, 113));
        }
    }

    @Pure
    public static void A04(String str, String str2) {
        synchronized (A05) {
            int i10 = A00;
        }
    }

    @Pure
    public static void A05(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 3) {
                A01.A69(str, str2);
            }
        }
    }

    @Pure
    public static void A06(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 1) {
                A01.A9l(str, str2);
            }
        }
    }

    @Pure
    public static void A07(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 2) {
                A01.AK1(str, str2);
            }
        }
    }

    @Pure
    public static void A08(String str, String str2, Throwable th2) {
        A05(str, A01(str2, th2));
    }

    @Pure
    public static void A09(String str, String str2, Throwable th2) {
        A06(str, A01(str2, th2));
    }

    @Pure
    public static void A0A(String str, String str2, Throwable th2) {
        A07(str, A01(str2, th2));
    }

    @Pure
    public static boolean A0B(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                String[] strArr = A04;
                if (strArr[3].charAt(22) != strArr[2].charAt(22)) {
                    throw new RuntimeException();
                }
                A04[1] = "Bi";
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }
}
