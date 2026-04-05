package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.fO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC2062fO {
    public static byte[] A01;
    public static String[] A02 = {"4MR", "ox3", "IUsSI7rcrCx1ERgKd0rYF5wqQshT9MFY", "XMpLbdKCI8ptDt9BVBTjCKDwrbbZ39Yk", "reDnu4iC6gOf", "58W6JAylc1sA", "T5hdxNMEH3a8tXz2YdYKh9bF2ZTD6zRG", "CM8HCV1eVyulF3snUIL5CjajvzNLA86A"};
    public static final /* synthetic */ EnumC2062fO[] A03;
    public static final EnumC2062fO A04;
    public static final EnumC2062fO A05;
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "zM61rMpjrvDScug74JUjCxPutIg5FxhC";
            strArr2[7] = "TMGBJitMUu1pxt90KbWrvOLR2BVfJ6J0";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 11);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-86, -83, -80, -80, -104, -109, -121, -124, -105, -120, -116, -113, -110, -110, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
        A04 = new EnumC2062fO(A00(0, 4, 89), 0, A00(10, 4, 27));
        A05 = new EnumC2062fO(A00(4, 6, 56), 1, A00(14, 6, 40));
        A03 = A02();
    }

    public EnumC2062fO(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC2062fO[] A02() {
        EnumC2062fO[] enumC2062fOArr = new EnumC2062fO[2];
        enumC2062fOArr[0] = A04;
        EnumC2062fO enumC2062fO = A05;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[2] = "lJSENTz9psORZi9A2zDcPU2PQxg7yytN";
        enumC2062fOArr[1] = enumC2062fO;
        return enumC2062fOArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC2062fO valueOf(String str) {
        return (EnumC2062fO) Enum.valueOf(EnumC2062fO.class, str);
    }

    public static EnumC2062fO[] values() {
        return (EnumC2062fO[]) A03.clone();
    }
}
