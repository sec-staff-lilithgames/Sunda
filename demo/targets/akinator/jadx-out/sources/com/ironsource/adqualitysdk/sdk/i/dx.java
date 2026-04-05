package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dx {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2080 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2081 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2082 = 127;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private int f2083;

    /* renamed from: ｋ, reason: contains not printable characters */
    private e f2084;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2085;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum e {
        f2095,
        f2094,
        f2097,
        f2096,
        f2093,
        f2090,
        f2088,
        f2091;


        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f2086 = 1;

        /* renamed from: ﭸ, reason: contains not printable characters */
        private static int f2087;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2089;

        static {
            m2457();
            f2086 = (f2087 + 81) % 128;
        }

        public static e valueOf(String str) {
            int i10 = f2086 + 51;
            f2087 = i10 % 128;
            if (i10 % 2 == 0) {
                return (e) Enum.valueOf(e.class, str);
            }
            Enum.valueOf(e.class, str);
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            f2086 = (f2087 + 101) % 128;
            e[] eVarArr = (e[]) values().clone();
            f2087 = (f2086 + 49) % 128;
            return eVarArr;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m2456(int i10, int i11, String str, int i12, boolean z10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (com.ironsource.adqualitysdk.sdk.i.e.f2108) {
                try {
                    char[] cArr2 = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.e.f2107 = 0;
                    while (true) {
                        int i13 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                        if (i13 >= i11) {
                            break;
                        }
                        com.ironsource.adqualitysdk.sdk.i.e.f2110 = cArr[i13];
                        cArr2[com.ironsource.adqualitysdk.sdk.i.e.f2107] = (char) (com.ironsource.adqualitysdk.sdk.i.e.f2110 + i10);
                        int i14 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                        cArr2[i14] = (char) (cArr2[i14] - f2089);
                        com.ironsource.adqualitysdk.sdk.i.e.f2107 = i14 + 1;
                    }
                    if (i12 > 0) {
                        com.ironsource.adqualitysdk.sdk.i.e.f2109 = i12;
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr2, 0, cArr3, 0, i11);
                        int i15 = com.ironsource.adqualitysdk.sdk.i.e.f2109;
                        System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                        int i16 = com.ironsource.adqualitysdk.sdk.i.e.f2109;
                        System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        com.ironsource.adqualitysdk.sdk.i.e.f2107 = 0;
                        while (true) {
                            int i17 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i11 - i17) - 1];
                            com.ironsource.adqualitysdk.sdk.i.e.f2107 = i17 + 1;
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

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static void m2457() {
            f2089 = 24;
        }
    }

    public dx(e eVar, String str, int i10) {
        this.f2084 = eVar;
        this.f2085 = str;
        this.f2083 = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2084);
        sb2.append(m2442((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 185, ExpandableListView.getPackedPositionType(0L) + 1, "\u0000", (ViewConfiguration.getTapTimeout() >> 16) + 1, false).intern());
        sb2.append(this.f2085);
        String string = sb2.toString();
        f2081 = (f2080 + 95) % 128;
        return string;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final boolean m2443() {
        f2081 = (f2080 + 15) % 128;
        if (m2454() == e.f2095) {
            return true;
        }
        int i10 = f2081 + 29;
        f2080 = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final boolean m2444() {
        f2080 = (f2081 + 57) % 128;
        if (m2454() != e.f2094) {
            return false;
        }
        f2080 = (f2081 + 13) % 128;
        return true;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m2445() {
        int i10 = f2081 + 81;
        f2080 = i10 % 128;
        if (i10 % 2 == 0) {
            m2454();
            e eVar = e.f2095;
            throw null;
        }
        if (m2454() != e.f2088) {
            f2081 = (f2080 + 21) % 128;
            return false;
        }
        int i11 = f2080 + 31;
        f2081 = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2446() {
        f2081 = (f2080 + 17) % 128;
        if (m2454() == e.f2091) {
            int i10 = f2080 + 111;
            f2081 = i10 % 128;
            if (i10 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i11 = f2080 + 113;
        f2081 = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m2447() {
        f2081 = (f2080 + 65) % 128;
        if (m2454() == e.f2090) {
            return true;
        }
        int i10 = f2081 + 83;
        f2080 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 75 / 0;
        }
        return false;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m2448() {
        f2080 = (f2081 + 25) % 128;
        if (m2454() != e.f2093) {
            return false;
        }
        int i10 = (f2081 + 31) % 128;
        f2080 = i10;
        f2081 = (i10 + 107) % 128;
        return true;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2449() {
        int i10 = f2080 + 47;
        f2081 = i10 % 128;
        if (i10 % 2 != 0) {
            m2454();
            e eVar = e.f2095;
            throw null;
        }
        if (m2454() != e.f2097) {
            return false;
        }
        int i11 = f2081 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2080 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2451(String str) {
        int i10 = f2080 + 73;
        f2081 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2085.equals(str);
        }
        int i11 = 51 / 0;
        return this.f2085.equals(str);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2452() {
        f2081 = (f2080 + 93) % 128;
        if (m2454() != e.f2096) {
            return false;
        }
        int i10 = f2081 + 87;
        f2080 = i10 % 128;
        return i10 % 2 != 0;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m2453() {
        int i10 = f2080 + 45;
        f2081 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2085;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final e m2454() {
        int i10 = f2080 + 45;
        f2081 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2084;
        }
        int i11 = 96 / 0;
        return this.f2084;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m2455() {
        int i10 = f2080 + 57;
        int i11 = i10 % 128;
        f2081 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = this.f2083;
        f2080 = (i11 + 51) % 128;
        return i12;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2442(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.e.f2107 = 0;
                while (true) {
                    int i13 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    com.ironsource.adqualitysdk.sdk.i.e.f2110 = cArr[i13];
                    cArr2[com.ironsource.adqualitysdk.sdk.i.e.f2107] = (char) (com.ironsource.adqualitysdk.sdk.i.e.f2110 + i10);
                    int i14 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f2082);
                    com.ironsource.adqualitysdk.sdk.i.e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = com.ironsource.adqualitysdk.sdk.i.e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = com.ironsource.adqualitysdk.sdk.i.e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.e.f2107 = 0;
                    while (true) {
                        int i17 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        com.ironsource.adqualitysdk.sdk.i.e.f2107 = i17 + 1;
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

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2450() {
        int i10 = f2081 + 47;
        f2080 = i10 % 128;
        if (i10 % 2 == 0) {
            m2452();
            throw null;
        }
        if (m2452() || m2448() || m2447() || m2445()) {
            f2080 = (f2081 + 111) % 128;
            return true;
        }
        int i11 = f2080 + 9;
        f2081 = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
