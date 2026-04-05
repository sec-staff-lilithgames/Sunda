package com.facebook.ads.redexgen.core;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3U, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3U {
    public static byte[] A00;
    public static String[] A01 = {"iRbt0o504Arwoby5JHXaSNdVCCanqX3Z", "ASbg6tg4kzyOiw5fOrTV48A6bdNu61QQ", "VJNj5t4vCwi8aTooUiCSn6hrJqJmgDCA", "jF3QiYzhpB2jmiLUWXOlRV8C8MCMW37s", "04l0YgLQyX7hnS2Tq5aYjCPcYldth61t", "viWvpQwMaKSmF6BaYaPf73TpnglWhe5o", "UZSp3mVbJo9", "8WqjnkkE7kcSKcejfHJHrMyyjo529bht"};
    public static final byte[] A02;
    public static final String[] A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-49, -58, -47, -45, -7, -5, -84, -74, 13, 34, 15, -35, -38, -47, -36, -34, 4, -47, -36, -34, 4, -47, -36, -34, 4, -43, -29, -48, -98, -101, -110, -32, -110, -47, -101, -110, -59, -101, -110, -48, -110, -47};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A03 = new String[]{A02(0, 0, 27), A02(5, 1, 112), A02(6, 1, 32), A02(7, 1, 41)};
    }

    public static Pair<Integer, Integer> A00(byte[] bArr) {
        C4J c4j = new C4J(bArr);
        c4j.A0f(9);
        int sampleRate = c4j.A0I();
        c4j.A0f(20);
        return Pair.create(Integer.valueOf(c4j.A0L()), Integer.valueOf(sampleRate));
    }

    public static String A01(int i10, int i11, int i12) {
        return String.format(A02(8, 17, 98), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String A03(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(AbstractC09264a.A0n(A02(25, 17, 35), A03[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(A02(0, 5, 87), Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static List<byte[]> A04(boolean z10) {
        byte[] bArr = new byte[1];
        if (z10) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return Collections.singletonList(bArr);
    }

    public static boolean A06(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1) {
            return false;
        }
        byte b10 = list.get(0)[0];
        if (A01[6].length() != 11) {
            throw new RuntimeException();
        }
        A01[6] = "7rG63N7qIw7";
        return b10 == 1;
    }

    public static byte[] A07(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[A02.length + i11];
        byte[] bArr3 = A02;
        byte[] nalUnit = A02;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A02;
        System.arraycopy(bArr, i10, bArr2, nalUnit2.length, i11);
        return bArr2;
    }
}
