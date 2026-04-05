package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum hi {
    f2503(-1),
    f2502(0),
    f2505(1),
    f2501(2),
    f2504(3),
    f2500(4),
    f2497(5),
    f2499(6),
    f2498(7);


    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2493 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2494 = 1;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f2495;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final int f2506;

    static {
        m2581();
        f2494 = (f2493 + 75) % 128;
    }

    hi(int i10) {
        this.f2506 = i10;
    }

    public static hi valueOf(String str) {
        int i10 = f2493 + 37;
        f2494 = i10 % 128;
        if (i10 % 2 == 0) {
            Enum.valueOf(hi.class, str);
            throw null;
        }
        hi hiVar = (hi) Enum.valueOf(hi.class, str);
        int i11 = f2493 + 109;
        f2494 = i11 % 128;
        if (i11 % 2 != 0) {
            return hiVar;
        }
        throw null;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static hi[] valuesCustom() {
        f2494 = (f2493 + 79) % 128;
        hi[] hiVarArr = (hi[]) values().clone();
        int i10 = f2494 + 1;
        f2493 = i10 % 128;
        if (i10 % 2 == 0) {
            return hiVarArr;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static hi m2579(int i10) {
        switch (i10) {
            case -1:
                return f2503;
            case 0:
                return f2502;
            case 1:
                return f2505;
            case 2:
                hi hiVar = f2501;
                int i11 = f2493 + 51;
                f2494 = i11 % 128;
                if (i11 % 2 != 0) {
                    return hiVar;
                }
                throw null;
            case 3:
                return f2504;
            case 4:
                hi hiVar2 = f2500;
                int i12 = f2493 + 19;
                f2494 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 80 / 0;
                }
                return hiVar2;
            case 5:
                hi hiVar3 = f2497;
                f2494 = (f2493 + 53) % 128;
                return hiVar3;
            case 6:
                return f2499;
            case 7:
                return f2498;
            default:
                return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m2581() {
        f2495 = 152;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m2582() {
        int i10 = (f2493 + 79) % 128;
        f2494 = i10;
        int i11 = this.f2506;
        int i12 = i10 + 111;
        f2493 = i12 % 128;
        if (i12 % 2 == 0) {
            return i11;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2580(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i10);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f2495);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        e.f2107 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
