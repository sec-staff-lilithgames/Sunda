package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ja, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1299Ja {
    public static byte[] A0A;
    public static String[] A0B = {"6HehIsk5UTdQ8YwGLZ8u", "HAdSfToap9UtbNGqUYR7rfHJagkNK6YB", "nRaQRY6nAt4CmU7uet6FlSe17FvhWZYJ", "8IXD4Lb5", "pveGGnyGJyzGs1AN", "NjeHfVTmziUN3gQJJf", "25ItPJi0PU1GUlSkVtogtpFEj7NyufcW", "xHU94vBDrMO8JpAh"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{47, 65, 118, 55, 18, 53, 61, 56, 49, 48, 116, 32, 59, 116, 36, 53, 38, 39, 49, 116, 54, 59, 59, 56, 49, 53, 58, 116, 34, 53, 56, 33, 49, 110, 116, 115, 38, 1, 9, 12, 5, 4, 64, 20, 15, 64, 16, 1, 18, 19, 5, 64, 3, 15, 12, 15, 18, 64, 5, 24, 16, 18, 5, 19, 19, 9, 15, 14, 90, 64, 71, 101, 66, 74, 79, 70, 71, 3, 87, 76, 3, 83, 66, 81, 80, 70, 3, 69, 76, 77, 87, 3, 80, 74, 89, 70, 25, 3, 4, 77, 99, 106, 107, 118, 109, 106, 99, 36, 113, 106, 111, 106, 107, 115, 106, 36, 70, 107, 118, 96, 97, 118, 87, 112, 125, 104, 97, 62, 36, 100, 74, 67, 66, 95, 68, 67, 74, 13, 88, 67, 70, 67, 66, 90, 67, 13, 76, 65, 68, 74, 67, 64, 72, 67, 89, 23, 13, 120, 64, 66, 91, 91, 66, 69, 76, 11, 70, 74, 71, 77, 68, 89, 70, 78, 79, 11, 12, 120, 95, 82, 71, 78, 17, 12, 11, 71, 66, 69, 78, 11, 3, 78, 83, 91, 78, 72, 95, 78, 79, 11, 14, 88, 11, 93, 74, 71, 94, 78, 88, 7, 11, 77, 68, 94, 69, 79, 11, 14, 88, 2, 17, 11, 12, 14, 88, 12, 90, 98, 96, 121, 121, 96, 103, 110, 41, 100, 104, 101, 111, 102, 123, 100, 108, 109, 41, 46, 90, 125, 112, 101, 108, 51, 46, 41, 101, 96, 103, 108, 51, 41, 46, 90, 122, 104, 90, 125, 112, 101, 108, 56, 31, 18, 7, 14, 81};
    }

    static {
        A07();
    }

    public C1299Ja(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.A05 = str;
        this.A01 = i10;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f10;
        this.A06 = z10;
        this.A07 = z11;
        this.A09 = z12;
        this.A08 = z13;
        this.A02 = i11;
    }

    public static float A00(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            AnonymousClass44.A0A(A06(261, 8, 80), A06(71, 28, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + str + A06(2, 1, 8), e10);
            return -3.4028235E38f;
        }
    }

    public static int A01(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (A08(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        AnonymousClass44.A07(A06(261, 8, 80), A06(129, 28, 116) + str);
        return -1;
    }

    public static int A02(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (A09(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        AnonymousClass44.A07(A06(261, 8, 80), A06(99, 30, 93) + str);
        return -1;
    }

    public static C1299Ja A04(String str, JW jw2) {
        int iA01;
        Integer numA05;
        Integer numA052;
        float fA00;
        String strA06 = A06(269, 6, 50);
        C3M.A07(str.startsWith(strA06));
        String[] strArrSplit = TextUtils.split(str.substring(strA06.length()), A06(3, 1, 66));
        int length = strArrSplit.length;
        int i10 = jw2.A05;
        String strA062 = A06(261, 8, 80);
        if (length != i10) {
            AnonymousClass44.A07(strA062, AbstractC09264a.A0n(A06(157, 69, 114), Integer.valueOf(jw2.A05), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[jw2.A06].trim();
            if (jw2.A00 != -1) {
                iA01 = A01(strArrSplit[jw2.A00].trim());
            } else {
                iA01 = -1;
            }
            if (jw2.A08 != -1) {
                numA05 = A05(strArrSplit[jw2.A08].trim());
            } else {
                numA05 = null;
            }
            if (jw2.A07 != -1) {
                numA052 = A05(strArrSplit[jw2.A07].trim());
            } else {
                numA052 = null;
            }
            if (jw2.A03 != -1) {
                fA00 = A00(strArrSplit[jw2.A03].trim());
            } else {
                fA00 = -3.4028235E38f;
            }
            return new C1299Ja(strTrim, iA01, numA05, numA052, fA00, jw2.A01 != -1 && A0A(strArrSplit[jw2.A01].trim()), jw2.A04 != -1 && A0A(strArrSplit[jw2.A04].trim()), jw2.A0A != -1 && A0A(strArrSplit[jw2.A0A].trim()), jw2.A09 != -1 && A0A(strArrSplit[jw2.A09].trim()), jw2.A02 != -1 ? A02(strArrSplit[jw2.A02].trim()) : -1);
        } catch (RuntimeException e10) {
            AnonymousClass44.A0A(strA062, A06(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 35, 80) + str + A06(2, 1, 8), e10);
            return null;
        }
    }

    public static Integer A05(String str) throws NumberFormatException {
        long j10;
        try {
            if (str.startsWith(A06(0, 2, 80))) {
                j10 = Long.parseLong(str.substring(2), 16);
            } else {
                j10 = Long.parseLong(str);
            }
            C3M.A07(j10 <= 4294967295L);
            int iA03 = AD.A03(((j10 >> 24) & 255) ^ 255);
            int iA032 = AD.A03((j10 >> 16) & 255);
            int b10 = AD.A03((j10 >> 8) & 255);
            int a10 = AD.A03(j10 & 255);
            return Integer.valueOf(Color.argb(iA03, a10, b10, iA032));
        } catch (IllegalArgumentException e10) {
            AnonymousClass44.A0A(A06(261, 8, 80), A06(36, 35, 57) + str + A06(2, 1, 8), e10);
            return null;
        }
    }

    public static boolean A08(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean A09(int i10) {
        switch (i10) {
            case 1:
            case 3:
                return true;
            case 2:
            default:
                String[] strArr = A0B;
                if (strArr[7].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                A0B[6] = "OxYydzu443viAUiIiorbVSFSlAhvbuco";
                return false;
        }
    }

    public static boolean A0A(String str) throws NumberFormatException {
        try {
            int value = Integer.parseInt(str);
            return value == 1 || value == -1;
        } catch (NumberFormatException e10) {
            AnonymousClass44.A0A(A06(261, 8, 80), A06(4, 32, 13) + str + A06(2, 1, 8), e10);
            return false;
        }
    }
}
