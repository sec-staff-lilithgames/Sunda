package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class JV {
    public static byte[] A05;
    public static String[] A06 = {"rlpJzJvMZPS96752sWOw4hHmtt9HQE0Q", "UPlQWo", "ZXUw26V2c7", "6tEwv6Up9NP4MOjnWwfRMdieV7ltrfDK", "1MWXcVZusFrtXDSpfsJ6Y4yHAb", "3y9vGkKnNQnOlcIPORqt4hFWNeEUPhWe", "", "J1HUrfSw1j9IlDpk2TzINIeAn4Xj8ByV"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].charAt(28) == strArr[3].charAt(28)) {
                throw new RuntimeException();
            }
            A06[6] = "";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
            i13++;
        }
    }

    public static void A02() {
        A05 = new byte[]{122, 107, 66, 95, 64, 76, 89, 23, 89, 82, 88, 2, 5, 16, 3, 5, 118, 113, 124, 105, 96, 33, 48, 45, 33};
    }

    static {
        A02();
    }

    public JV(int i10, int i11, int i12, int i13, int i14) {
        this.A02 = i10;
        this.A00 = i11;
        this.A03 = i12;
        this.A04 = i13;
        this.A01 = i14;
    }

    public static JV A00(String str) {
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        String strA01 = A01(1, 7, 78);
        C3M.A07(str.startsWith(strA01));
        int startTimeIndex = strA01.length();
        String[] keys = TextUtils.split(str.substring(startTimeIndex), A01(0, 1, 53));
        int i14 = 0;
        while (true) {
            int startTimeIndex2 = keys.length;
            int textIndex = -1;
            if (i14 < startTimeIndex2) {
                String strA012 = AbstractC2244iY.A01(keys[i14].trim());
                int startTimeIndex3 = strA012.hashCode();
                switch (startTimeIndex3) {
                    case 100571:
                        if (strA012.equals(A01(8, 3, 95))) {
                            textIndex = 1;
                            break;
                        }
                        break;
                    case 3556653:
                        if (strA012.equals(A01(21, 4, 54))) {
                            textIndex = 3;
                            break;
                        }
                        break;
                    case 109757538:
                        if (strA012.equals(A01(11, 5, 18))) {
                            textIndex = 0;
                            break;
                        }
                        break;
                    case 109780401:
                        int endTimeIndex = A06[7].charAt(11);
                        if (endTimeIndex == 70) {
                            throw new RuntimeException();
                        }
                        A06[6] = "";
                        if (strA012.equals(A01(16, 5, 102))) {
                            textIndex = 2;
                            break;
                        }
                        break;
                }
                switch (textIndex) {
                    case 0:
                        i10 = i14;
                        break;
                    case 1:
                        i11 = i14;
                        break;
                    case 2:
                        i12 = i14;
                        break;
                    case 3:
                        i13 = i14;
                        break;
                }
                i14++;
            } else {
                if (i10 != -1 && i11 != -1 && i13 != -1) {
                    return new JV(i10, i11, i12, i13, keys.length);
                }
                return null;
            }
        }
    }
}
