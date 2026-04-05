package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.warren.VungleApiClient;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class hb extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2452 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2453;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2454 = {'y', 233, 228, 229, 230, 237};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends hb {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2455 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2456 = 140;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2457 = 1;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            int i10 = f2457 + 103;
            int i11 = i10 % 128;
            f2455 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            int i12 = i11 + 51;
            f2457 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 28 / 0;
            }
            return VungleApiClient.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾇ */
        public final bg mo2526() {
            cc ccVar = new cc(m2567(249 - (ViewConfiguration.getTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 7, "\u0001\b\t\ufff8\uffff\ufffa", ImageFormat.getBitsPerPixel(0) + 4, true).intern());
            int i10 = f2455 + 3;
            f2457 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 68 / 0;
            }
            return ccVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            f2457 = (f2455 + 77) % 128;
            String strIntern = m2567((ViewConfiguration.getWindowTouchSlop() >> 8) + 239, 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0002\t\u0004\u000b\u0012\ufff3ￋ\u000b\u0002\u000f\u000f\ufffe\u0014ￋ\u0002\t\u0004\u000b\u0012\u0013ￋ\n\f\u0000\u0011\u000b\u0002\u0006\t￠\u0006\r\uffde", 24 - (ViewConfiguration.getLongPressTimeout() >> 16), true).intern();
            f2455 = (f2457 + 23) % 128;
            return strIntern;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m2567(int i10, int i11, String str, int i12, boolean z10) {
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
                        cArr2[i14] = (char) (cArr2[i14] - f2456);
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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends hb {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2458 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f2459 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2460 = {34, 44, 35, -42, -41, 3, -16, -45, 5, -10, -45, 47, -45, -45, 53, 2, -23, -45, 41, -46, 41, 37, -35, 106, -24, 33, -39, -42, 39, -37, 44, 47, 17, -111, 37, 41, 25, -29, -45, 47, -45, -45, -43, 98, -21, -44, 38};

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2461 = 1953477844;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2462 = 13;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static short[] f2463 = null;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2464 = 1095976657;

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            int i10 = f2458 + 17;
            int i11 = i10 % 128;
            f2459 = i11;
            if (i10 % 2 == 0) {
                int i12 = 76 / 0;
            }
            int i13 = i11 + 37;
            f2458 = i13 % 128;
            if (i13 % 2 == 0) {
                return com.vungle.ads.internal.network.VungleApiClient.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾇ */
        public final bg mo2526() {
            ck ckVar = new ck(mo2524());
            int i10 = f2458 + 75;
            f2459 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 35 / 0;
            }
            return ckVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            f2459 = (f2458 + 71) % 128;
            String strIntern = m2568((ViewConfiguration.getWindowTouchSlop() >> 8) - 14, (short) View.combineMeasuredStates(0, 0), (-1953477845) - TextUtils.indexOf((CharSequence) "", '0'), (byte) (42 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1095976558).intern();
            int i10 = f2459 + 105;
            f2458 = i10 % 128;
            if (i10 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m2568(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (n.f3160) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2462;
                    int i14 = i10 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2460;
                        i14 = bArr != null ? (byte) (bArr[f2461 + i11] + i13) : (short) (f2463[f2461 + i11] + i13);
                    }
                    if (i14 > 0) {
                        n.f3165 = ((i11 + i14) - 2) + f2461 + i15;
                        n.f3163 = b10;
                        char c10 = (char) (i12 + f2464);
                        n.f3162 = c10;
                        sb2.append(c10);
                        n.f3161 = n.f3162;
                        n.f3164 = 1;
                        while (n.f3164 < i14) {
                            byte[] bArr2 = f2460;
                            if (bArr2 != null) {
                                int i16 = n.f3165;
                                n.f3165 = i16 - 1;
                                n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                            } else {
                                short[] sArr = f2463;
                                int i17 = n.f3165;
                                n.f3165 = i17 - 1;
                                n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                            }
                            sb2.append(n.f3162);
                            n.f3161 = n.f3162;
                            n.f3164++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2566(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f2454, i10, cArr, 0, i11);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2453 + 31;
        f2452 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m2566("\u0000\u0001\u0001\u0001\u0001\u0001", true, new int[]{0, 6, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 1}) : m2566("\u0000\u0001\u0001\u0001\u0001\u0001", true, new int[]{0, 6, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 1})).intern();
        f2453 = (f2452 + 15) % 128;
        return strIntern;
    }
}
