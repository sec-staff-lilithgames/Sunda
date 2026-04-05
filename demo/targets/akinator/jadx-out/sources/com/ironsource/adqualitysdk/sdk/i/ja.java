package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ja {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2853 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2854 = {'P', 'F', 'f', 200, 193, 'X', 170, 168, 173, 176, 171, 163, 162, 135, 'b', 170, 178, 210};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2855 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f2856;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f2857;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f2858;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2859;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f2860;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends c {

        /* renamed from: ｋ, reason: contains not printable characters */
        private final String f2861;

        public b(String str, String str2, String str3) {
            super(str, str2);
            this.f2861 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ja
        /* renamed from: ﻛ */
        public final String mo2909() {
            return m2913(this.f2861);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends ja {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2862 = 20;

        public c(String str, String str2) {
            super(str, m2914(125 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 4, "�\ufffa\u0006\u0005", 1 - ExpandableListView.getPackedPositionType(0L), false).intern(), str2, m2914(119 - View.MeasureSpec.getSize(0), AndroidCharacter.getMirror('0') - '(', "\f\u000bￋ\u0002\u000b\u0000\u0007\u0010", 6 - Gravity.getAbsoluteGravity(0, 0), false).intern(), (byte) 0);
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m2914(int i10, int i11, String str, int i12, boolean z10) {
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
                        cArr2[i14] = (char) (cArr2[i14] - f2862);
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
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends ja {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2863 = -1699375103;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2864;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f2865;

        public d(String str, String str2) {
            super(str, m2915("䇰㻪윱ⴚ", (char) (6855 - TextUtils.getTrimmedLength("")), "䒩瑖넆疒", Process.myTid() >> 22, "\u0000\u0000\u0000\u0000").intern(), str2, m2915("檏랁뮦紡", (char) Drawable.resolveOpacity(0, 0), "累\uda91琛麤皒ꇍ쥌吰", ViewConfiguration.getLongPressTimeout() >> 16, "\u0000\u0000\u0000\u0000").intern(), (byte) 0);
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m2915(String str, char c10, String str2, int i10, String str3) {
            String str4;
            char[] charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = charArray;
            char[] charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = charArray2;
            char[] charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = charArray3;
            synchronized (f.f2212) {
                try {
                    char[] cArr4 = (char[]) cArr3.clone();
                    char[] cArr5 = (char[]) cArr.clone();
                    cArr4[0] = (char) (c10 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i10));
                    int length = cArr2.length;
                    char[] cArr6 = new char[length];
                    f.f2213 = 0;
                    while (true) {
                        int i11 = f.f2213;
                        if (i11 < length) {
                            int i12 = (i11 + 2) % 4;
                            int i13 = (i11 + 3) % 4;
                            int i14 = cArr4[i11 % 4] * 32718;
                            char c11 = cArr5[i12];
                            char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            f.f2211 = c12;
                            cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            cArr4[i13] = c12;
                            int i15 = f.f2213;
                            cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f2865) ^ f2863) ^ f2864);
                            f.f2213 = i15 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str4;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends d {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private final String f2866;

        public e(String str, String str2, String str3) {
            super(str, str2);
            this.f2866 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ja
        /* renamed from: ﻛ */
        public final String mo2909() {
            return m2913(this.f2866);
        }
    }

    public /* synthetic */ ja(String str, String str2, String str3, String str4, byte b10) {
        this(str, str2, str3, str4);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m2903() {
        f2855 = (f2853 + 51) % 128;
        String strIntern = m2907("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false, new int[]{5, 9, 63, 0}).intern();
        String strM2905 = m2905();
        if (this.f2858) {
            f2855 = (f2853 + 15) % 128;
            if (!TextUtils.isEmpty(strM2905)) {
                StringBuilder sbU = o2.u(strIntern);
                sbU.append(m2907("\u0001\u0000\u0001\u0000", true, new int[]{14, 4, 96, 1}).intern());
                sbU.append(strM2905);
                strIntern = com.google.android.gms.internal.play_billing.a.i(m2907(null, true, new int[]{0, 1, 33, 1}), sbU);
            }
        }
        f2853 = (f2855 + 95) % 128;
        return strIntern;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m2904() {
        int i10 = (f2855 + 25) % 128;
        f2853 = i10;
        String str = this.f2857;
        int i11 = i10 + 75;
        f2855 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m2905() {
        int i10 = f2855 + 93;
        f2853 = i10 % 128;
        if (i10 % 2 != 0) {
            aq.m814().mo826();
            throw null;
        }
        String strMo826 = aq.m814().mo826();
        int i11 = f2855 + 79;
        f2853 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 23 / 0;
        }
        return strMo826;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m2906() {
        int i10 = f2855;
        String str = this.f2860;
        int i11 = i10 + 59;
        f2853 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 21 / 0;
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m2908() {
        int i10 = (f2855 + 27) % 128;
        f2853 = i10;
        String str = this.f2856;
        f2855 = (i10 + 101) % 128;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String mo2909() {
        StringBuilder sbU = o2.u(m2903());
        sbU.append(this.f2859);
        sbU.append(m2907(null, true, new int[]{0, 1, 33, 1}).intern());
        sbU.append(this.f2860);
        sbU.append(m2907("\u0001", true, new int[]{1, 1, 95, 0}).intern());
        sbU.append(m2907("\u0001\u0000\u0001", false, new int[]{2, 3, 95, 2}).intern());
        sbU.append(m2907("\u0001", true, new int[]{1, 1, 95, 0}).intern());
        sbU.append(this.f2856);
        sbU.append(m2907("\u0001", true, new int[]{1, 1, 95, 0}).intern());
        sbU.append(this.f2857);
        String string = sbU.toString();
        int i10 = f2855 + 17;
        f2853 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 0;
        }
        return string;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2910() {
        int i10 = f2853;
        this.f2858 = false;
        int i11 = i10 + 85;
        f2855 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 42 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2911() {
        f2855 = (f2853 + 57) % 128;
        String strReplace = mo2909().replace(m2907(null, true, new int[]{0, 1, 33, 1}).intern(), m2907("\u0001", true, new int[]{1, 1, 95, 0}).intern());
        int i10 = f2855 + 9;
        f2853 = i10 % 128;
        if (i10 % 2 == 0) {
            return strReplace;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2912() {
        int i10 = f2853;
        int i11 = i10 + 85;
        f2855 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f2859;
        int i12 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2855 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private ja(String str, String str2, String str3, String str4) {
        this.f2859 = str;
        this.f2860 = str2;
        this.f2856 = str3;
        this.f2857 = str4;
        this.f2858 = true;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2907(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2854, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2913(String str) {
        StringBuilder sbU = o2.u(m2903());
        sbU.append(m2912());
        sbU.append(m2907(null, true, new int[]{0, 1, 33, 1}).intern());
        sbU.append(m2907("\u0001\u0000\u0001", false, new int[]{2, 3, 95, 2}).intern());
        sbU.append(m2907(null, true, new int[]{0, 1, 33, 1}).intern());
        sbU.append(str);
        sbU.append(m2907(null, true, new int[]{0, 1, 33, 1}).intern());
        sbU.append(m2906());
        sbU.append(m2907("\u0001", true, new int[]{1, 1, 95, 0}).intern());
        sbU.append(m2907("\u0001\u0000\u0001", false, new int[]{2, 3, 95, 2}).intern());
        sbU.append(m2907("\u0001", true, new int[]{1, 1, 95, 0}).intern());
        sbU.append(m2908());
        sbU.append(m2907("\u0001", true, new int[]{1, 1, 95, 0}).intern());
        sbU.append(m2904());
        String string = sbU.toString();
        int i10 = f2855 + 55;
        f2853 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 87 / 0;
        }
        return string;
    }
}
