package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ka {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3126 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3127;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f3128 = {'.', 'E', '3', '3', '.', 'G', AbstractJsonLexerKt.STRING_ESC, 23, 'E', 't', 230, 232, 209, 221, 231, 193, 205, 207, 184, 189, 213, 205, 177, 127, '3', 'e', GMTDateParser.DAY_OF_MONTH, 'p', 'p', '`', 'a', 'L', GMTDateParser.SECONDS, '-', AbstractJsonLexerKt.BEGIN_LIST, 'g', 'g', 'W', 'X', 'C', 28, '2', '9', GMTDateParser.MONTH, 'T'};

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static int m3158(String str, String str2) {
        f3127 = (f3126 + 53) % 128;
        int i10 = 0;
        String strIntern = m3161("\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, new int[]{0, 7, 0, 0}).intern();
        String str3 = QCmNMSGd.hDOLSBa;
        String[] strArrSplit = str.replaceAll(strIntern, str3).split(m3161("\u0000\u0000", true, new int[]{7, 2, 0, 2}).intern());
        String[] strArrSplit2 = str2.replaceAll(m3161("\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, new int[]{0, 7, 0, 0}).intern(), str3).split(m3161("\u0000\u0000", true, new int[]{7, 2, 0, 2}).intern());
        while (i10 < strArrSplit.length) {
            int i11 = f3126 + 51;
            f3127 = i11 % 128;
            if (i11 % 2 != 0) {
                int length = strArrSplit2.length;
                throw null;
            }
            if (i10 >= strArrSplit2.length || !strArrSplit[i10].equals(strArrSplit2[i10])) {
                break;
            }
            i10++;
        }
        if (i10 >= strArrSplit.length || i10 >= strArrSplit2.length) {
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }
        f3127 = (f3126 + 83) % 128;
        return Integer.signum(Integer.valueOf(strArrSplit[i10]).compareTo(Integer.valueOf(strArrSplit2[i10])));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m3163(String str, String str2) {
        f3127 = (f3126 + 51) % 128;
        List<String> listM3164 = m3164(str, str2, false);
        int i10 = f3127 + 45;
        f3126 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 0 / 0;
        }
        return listM3164;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m3167(String str, JSONArray jSONArray, boolean z10) {
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            f3127 = (f3126 + 111) % 128;
            String strM3160 = m3160(str, jSONArray.optString(i10), z10);
            if (strM3160 != null) {
                f3126 = (f3127 + 15) % 128;
                return strM3160;
            }
            i10++;
            f3126 = (f3127 + 1) % 128;
        }
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m3169(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            f3126 = (f3127 + 7) % 128;
            arrayList.addAll(m3164(str, jSONArray.optString(i10), false));
            i10++;
            f3127 = (f3126 + 59) % 128;
        }
        f3127 = (f3126 + 37) % 128;
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> m3164(String str, String str2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                f3127 = (f3126 + 95) % 128;
                arrayList.add(matcher.group());
                if (z10) {
                    int i10 = f3126 + 25;
                    f3127 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 93 / 0;
                    }
                    return arrayList;
                }
            } else {
                for (int i12 = 1; i12 <= matcher.groupCount(); i12++) {
                    f3127 = (f3126 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
                    arrayList.add(matcher.group(i12));
                    if (z10) {
                        f3127 = (f3126 + 75) % 128;
                        return arrayList;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m3166(String str, String str2) {
        int i10 = f3126 + 1;
        f3127 = i10 % 128;
        String strSubstring = i10 % 2 != 0 ? str.substring(1, str.length() >> str2.length()) : str.substring(0, str.length() - str2.length());
        int i11 = f3126 + 83;
        f3127 = i11 % 128;
        if (i11 % 2 == 0) {
            return strSubstring;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m3168(String str) {
        f3127 = (f3126 + 101) % 128;
        if (p.m3249()) {
            int i10 = (f3127 + 3) % 128;
            f3126 = i10;
            f3127 = (i10 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m3170(String str) {
        int i10 = f3126 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3127 = i10 % 128;
        if (i10 % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zMatches = str.matches(m3161("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000", false, new int[]{9, 14, 138, 0}).intern());
        f3127 = (f3126 + 35) % 128;
        return zMatches;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m3160(String str, String str2, boolean z10) {
        if (z10) {
            f3126 = (f3127 + 11) % 128;
            str2 = m3162(str2);
        }
        List<String> listM3164 = m3164(str, str2, true);
        if (listM3164.size() <= 0) {
            return null;
        }
        int i10 = f3127 + 113;
        f3126 = i10 % 128;
        return i10 % 2 == 0 ? listM3164.get(1) : listM3164.get(0);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m3165(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        f3126 = (f3127 + 75) % 128;
        if (str.length() <= 0) {
            return false;
        }
        f3126 = (f3127 + 37) % 128;
        return str.length() <= i10;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m3162(String str) {
        int i10 = f3127 + 75;
        f3126 = i10 % 128;
        if (i10 % 2 == 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith(m3161("\u0001", false, new int[]{23, 1, 161, 1}).intern())) {
                str = com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m3161("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{24, 8, 9, 0}), str);
                f3126 = (f3127 + 101) % 128;
            }
            if (!str.endsWith(m3161("\u0000", false, new int[]{32, 1, 194, 0}).intern())) {
                str = com.google.android.gms.internal.play_billing.a.i(m3161("\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{33, 7, 0, 0}), o2.u(str));
            }
        }
        int i11 = f3127 + 25;
        f3126 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 97 / 0;
        }
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m3159(String str) {
        if (str != null) {
            f3127 = (f3126 + 43) % 128;
            if (!p.m3249() && m3168(str)) {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[Segment.SIZE];
                    f3126 = (f3127 + 13) % 128;
                    int i10 = 0;
                    while (true) {
                        int i11 = gZIPInputStream.read(bArr, i10, 8192 - i10);
                        if (i11 == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, m3161("\u0000\u0001\u0001\u0000\u0001", true, new int[]{40, 5, 0, 5}).intern());
                        }
                        i10 += i11;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m3161(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f3128, i10, cArr, 0, i11);
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
