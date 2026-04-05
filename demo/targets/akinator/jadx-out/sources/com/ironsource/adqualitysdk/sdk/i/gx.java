package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.cg;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gx extends gk {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2425 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2426 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f2427 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2428 = {-11, -19, -31, -7, -16, -29, -22, -47, 25, -30, -24, -8, -42, -60, 56, -19, -31, -7, -16, -29, -22, -15, -94, 41, -82, 57, -30, -24, -8, -10, -92, 30, -3, -21, -37, -106, -94, 119, -100, -102, 106, 104};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2429 = 683296284;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2430 = 45;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2431 = -1508738418;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends gk {

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2432 = 1;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2433;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2434 = {23, 'P', 'l', 'k', 't', 'o', 'f', GMTDateParser.DAY_OF_MONTH, 'l', 'P', 'G', 'b', 'k', 'P', 'G', 'b', 'l', 'q', 'k', 'n', 'Q', '7', 'R', AbstractJsonLexerKt.STRING_ESC, 'a', 'k', 'n', 'Z', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'n', 'i', 'n', GMTDateParser.MONTH, 'Q', 'q', 'k', 'n', 'v', 'V', 'K', '2', 'k', 't', 'q', 'k', 'n', 'v', GMTDateParser.MINUTES};

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static boolean m2562() {
            boolean zM1148 = bc.m1148(new gx());
            f2432 = (f2433 + 37) % 128;
            return zM1148;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻐ */
        public final String mo2524() {
            f2432 = (f2433 + 95) % 128;
            String strIntern = m2563("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, new int[]{46, 8, 0, 2}).intern();
            int i10 = f2433 + 71;
            f2432 = i10 % 128;
            if (i10 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            if (!m2562()) {
                return AdUnitActivity.class;
            }
            int i10 = f2432 + 29;
            f2433 = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾇ */
        public final bg mo2526() {
            cg.b bVar = new cg.b(mo2524());
            f2433 = (f2432 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            f2432 = (f2433 + 85) % 128;
            if (!m2562()) {
                return m2563("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 46, 0, 35}).intern();
            }
            f2432 = (f2433 + 113) % 128;
            return null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m2563(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                    System.arraycopy(f2434, i10, cArr, 0, i11);
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
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2426 = (f2425 + 113) % 128;
        String strIntern = m2561((-46) - TextUtils.indexOf("", "", 0), (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), 1508738452 - TextUtils.getCapsMode("", 0, 0), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29), Color.green(0) - 683296167).intern();
        int i10 = f2425 + 17;
        f2426 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 98 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = (f2426 + 59) % 128;
        f2425 = i10;
        int i11 = i10 + 21;
        f2426 = i11 % 128;
        if (i11 % 2 == 0) {
            return UnityServices.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        cg cgVar = new cg(mo2524());
        f2425 = (f2426 + 47) % 128;
        return cgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        f2425 = (f2426 + 69) % 128;
        String strIntern = m2561((-46) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((-110) - View.getDefaultSize(0, 0)), 1508738418 - View.resolveSize(0, 0), (byte) (TextUtils.getOffsetBefore("", 0) + 113), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 683296184).intern();
        int i10 = f2425 + 53;
        f2426 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2561(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2430;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2428;
                    i14 = bArr != null ? (byte) (bArr[f2431 + i11] + i13) : (short) (f2427[f2431 + i11] + i13);
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f2431 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f2429);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f2428;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f2427;
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
