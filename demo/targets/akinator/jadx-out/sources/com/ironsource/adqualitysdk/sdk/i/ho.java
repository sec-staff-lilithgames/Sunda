package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum ho {
    f2548(-1),
    f2549(0),
    f2547(1),
    f2550(2),
    f2551(3),
    f2544(4),
    f2545(5),
    f2543(6);


    /* renamed from: ﭴ, reason: contains not printable characters */
    private static long f2539 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f2540 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2541 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f2542;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final int f2552;

    static {
        m2621();
        int i10 = f2540 + 109;
        f2541 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    ho(int i10) {
        this.f2552 = i10;
    }

    public static ho valueOf(String str) {
        int i10 = f2540 + 55;
        f2541 = i10 % 128;
        int i11 = i10 % 2;
        ho hoVar = (ho) Enum.valueOf(ho.class, str);
        if (i11 == 0) {
            int i12 = 5 / 0;
        }
        f2540 = (f2541 + 99) % 128;
        return hoVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ho[] valuesCustom() throws CloneNotSupportedException {
        int i10 = f2541 + 67;
        f2540 = i10 % 128;
        if (i10 % 2 == 0) {
            return (ho[]) values().clone();
        }
        values().clone();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m2621() {
        f2542 = new char[]{'U', 3256, 6567, 9900, 13207, 16537, 19850, 25091, 28401, 31719, 17647, 20951, 45342, 48628, 43255, 38904, 'V', 3263, 6568, 9895, 13207, 27656, 24802, 30197, 19171, 24513, 11476, 8656, 13991, 3578, 286, 5123, 11039, 15924, 19748, 16428, 'S', 3234, 6573, 9910, 13201, 16525, 2200, 1132, 4453, 11894, 15190, 18502, 17754, 21037};
        f2539 = -227646984869245706L;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2622(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2542[i11 + i12] ^ (i12 * f2539)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m2623() {
        int i10 = f2540;
        int i11 = this.f2552;
        f2541 = (i10 + 75) % 128;
        return i11;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static ho m2620(int i10) {
        int i11 = f2541 + 25;
        int i12 = i11 % 128;
        f2540 = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        switch (i10) {
            case -1:
                return f2548;
            case 0:
                return f2549;
            case 1:
                ho hoVar = f2547;
                int i13 = i12 + 95;
                f2541 = i13 % 128;
                if (i13 % 2 != 0) {
                    return hoVar;
                }
                throw null;
            case 2:
                return f2550;
            case 3:
                return f2551;
            case 4:
                return f2544;
            case 5:
                return f2545;
            case 6:
                return f2543;
            default:
                return null;
        }
    }
}
