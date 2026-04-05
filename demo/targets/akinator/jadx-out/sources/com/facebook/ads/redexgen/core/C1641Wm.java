package com.facebook.ads.redexgen.core;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1641Wm {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, 57, 54, AbstractJsonLexerKt.TC_INVALID, 44, 120, 60, 61, 44, 61, 42, 53, 49, 54, 61, 120, 49, 62, 120, 57, 40, 40, 120, 49, 43, 120, 13, 54, 49, 44, 33, 118, 55, 13, 94, 43, 16, 23, 10, 7, 94, 31, 14, 14, 68, 94, 88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 73, 94, 90, 88, 79, 21, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, 18, 30, 28, 95, 4, 31, 24, 5, 8, 66, 21, 95, 1, 29, 16, 8, 20, 3, 95, 36, 31, 24, 5, 8, 33, 29, 16, 8, 20, 3, 48, 18, 5, 24, 7, 24, 5, 8};
    }

    static {
        A01();
        A02 = C1641Wm.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i10, int i11) {
        return i10 >= 640 && i11 >= 640;
    }

    public static boolean A05(SQ sq2) {
        boolean z10 = false;
        try {
            PackageManager packageManager = sq2.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(sq2.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfoArr[i10].name);
                    if (!activityDeclared) {
                        i10++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = sq2.A05().AAF();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th2) {
            if (sq2.A05().AAF()) {
                Log.e(A02, A00(0, 32, 79), th2);
            }
            return false;
        }
    }
}
