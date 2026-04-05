package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.kc;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dh {

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int f1895 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1898;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Map<String, dp> f1900;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f1901;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String f1902;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private ds f1903;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private dn f1904;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f1905;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1906;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject f1907;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1908;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1909;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ds f1910;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f1896 = {'_', 194, 192, 192, 'x', 245, 243, 227, 239, 249, 242, 250, 253, 250, 242, '<', 'y', 'w', 'y', AbstractJsonLexerKt.END_OBJ, 'v', 'x', 143, 289, 294, 293, 293, 282, AbstractJsonLexerKt.COLON, GMTDateParser.SECONDS, 'n', 'j', 'o', 'r', 'k', 'i', 'i', '<', 'v', 't', 'r', 't', 'x', 'q', 'c', 'k', 'w', 'o', 'l', 'Z', '^', 'g', 'e', GMTDateParser.MINUTES, 'q'};

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f1899 = 5;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f1897 = {GMTDateParser.MINUTES, 'a', 'x', 'S', GMTDateParser.DAY_OF_MONTH, 'k', 'g', 'l', 'o', 'b', 'C', 'n', GMTDateParser.SECONDS, 't', 'E', 'r', ' ', 'c', 'e', 'i', 'f', 'w', 'V', 'J', 'p'};

    public dh(String str, ds dsVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1907 = jSONObject;
            this.f1910 = dsVar;
            this.f1906 = jSONObject.optString(m2232("\u0000\u0001\u0001\u0000", false, new int[]{0, 4, 89, 1}).intern());
            this.f1908 = this.f1907.optString(m2232("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", true, new int[]{4, 11, 140, 0}).intern());
            this.f1909 = this.f1907.optString(m2232("\u0001\u0001\u0000\u0000\u0001\u0001\u0001", true, new int[]{15, 7, 11, 0}).intern());
            this.f1901 = this.f1907.optString(m2232("\u0000\u0001\u0000\u0000\u0001\u0001", false, new int[]{22, 6, 186, 2}).intern());
            this.f1905 = this.f1907.optString(m2230((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, (byte) (109 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002\u0003\u0004\u0000\t").intern());
            if (this.f1907.has(m2230((ViewConfiguration.getFadingEdgeLength() >> 16) + 12, (byte) (TextUtils.getOffsetBefore("", 0) + 99), "\u0007\b\t\u0005\u0002\u0006\r\u0005\f\r\u000e\r").intern())) {
                m2231(this.f1907.optJSONObject(m2230(12 - View.combineMeasuredStates(0, 0), (byte) (99 - TextUtils.getOffsetBefore("", 0)), "\u0007\b\t\u0005\u0002\u0006\r\u0005\f\r\u000e\r").intern()));
            }
        } catch (Throwable th2) {
            co.m1955(this.f1906, m2230(32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58), "\n\u0013\u0012\u0005\u0010\u0011\u0012\u0010\u0010\u0003\u000e\u0012\u0010\u000b\u0011\u0012\u0006\r\r\u0010\u0012\f\u0005\u0012\u0011\u0012\u0006\r\u0018\u000f¡").intern(), th2);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m2229(dh dhVar) {
        int i10 = f1898;
        int i11 = i10 + 51;
        f1895 = i11 % 128;
        int i12 = i11 % 2;
        String str = dhVar.f1906;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 59;
        f1895 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 25 / 0;
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2231(JSONObject jSONObject) {
        f1895 = (f1898 + 43) % 128;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i10 = f1895 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f1898 = i10 % 128;
            if (i10 % 2 != 0) {
                String next = itKeys.next();
                this.f1910.m2419(next, jSONObject.opt(next));
                int i11 = 50 / 0;
            } else {
                String next2 = itKeys.next();
                this.f1910.m2419(next2, jSONObject.opt(next2));
            }
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Map<String, dp> m2233() {
        int i10 = f1898 + 35;
        f1895 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f1900 == null) {
            this.f1900 = kc.m3186(this.f1907.optJSONObject(m2232("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true, new int[]{28, 9, 0, 4}).intern()), new kc.b<dp>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.4
                @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
                /* renamed from: ﻐ */
                public final /* synthetic */ dp mo879(JSONObject jSONObject, String str) {
                    return new dp(dh.m2229(dh.this), str, jSONObject.optJSONObject(str));
                }
            });
            f1898 = (f1895 + 85) % 128;
        }
        return this.f1900;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final dn m2234() {
        f1898 = (f1895 + 45) % 128;
        if (this.f1904 == null) {
            this.f1904 = new dn(this.f1907.optJSONObject(m2230(10 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (44 - TextUtils.indexOf("", "", 0, 0)), "\u0017\u0010\u0007\u0018\u000f\u0013\u0016\u0018\u009f").intern()));
            f1895 = (f1898 + 67) % 128;
        }
        return this.f1904;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ds m2235() {
        int i10 = f1898 + 105;
        f1895 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f1903 == null) {
            ds dsVar = new ds(kc.m3186(this.f1907.optJSONObject(m2230(TextUtils.lastIndexOf("", '0', 0, 0) + 7, (byte) (103 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0012\u0007\f\r\u000e\r").intern()), new kc.b<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.3

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static int f1911 = 1;

                /* renamed from: ｋ, reason: contains not printable characters */
                private static int f1912 = 95;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static int f1913;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private static String m2242(int i11, int i12, String str, int i13, boolean z10) {
                    String str2;
                    char[] charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = charArray;
                    synchronized (e.f2108) {
                        try {
                            char[] cArr2 = new char[i12];
                            e.f2107 = 0;
                            while (true) {
                                int i14 = e.f2107;
                                if (i14 >= i12) {
                                    break;
                                }
                                e.f2110 = cArr[i14];
                                cArr2[e.f2107] = (char) (e.f2110 + i11);
                                int i15 = e.f2107;
                                cArr2[i15] = (char) (cArr2[i15] - f1912);
                                e.f2107 = i15 + 1;
                            }
                            if (i13 > 0) {
                                e.f2109 = i13;
                                char[] cArr3 = new char[i12];
                                System.arraycopy(cArr2, 0, cArr3, 0, i12);
                                int i16 = e.f2109;
                                System.arraycopy(cArr3, 0, cArr2, i12 - i16, i16);
                                int i17 = e.f2109;
                                System.arraycopy(cArr3, i17, cArr2, 0, i12 - i17);
                            }
                            if (z10) {
                                char[] cArr4 = new char[i12];
                                e.f2107 = 0;
                                while (true) {
                                    int i18 = e.f2107;
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    cArr4[i18] = cArr2[(i12 - i18) - 1];
                                    e.f2107 = i18 + 1;
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

                @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
                /* renamed from: ﻐ */
                public final Object mo879(JSONObject jSONObject, String str) {
                    String strOptString;
                    int i11 = f1911 + 75;
                    f1913 = i11 % 128;
                    try {
                        if (i11 % 2 != 0) {
                            strOptString = jSONObject.optString(str);
                            int i12 = 31 / 0;
                            if (jSONObject.opt(str) instanceof String) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m2242((ViewConfiguration.getLongPressTimeout() >> 16) + 129, 1 - (Process.myTid() >> 22), "\u0000", 1 - (ViewConfiguration.getScrollBarSize() >> 8), true).intern());
                                sb2.append(strOptString);
                                sb2.append(m2242(View.resolveSizeAndState(0, 0, 0) + 129, Color.rgb(0, 0, 0) + 16777217, "\u0000", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, true).intern());
                                strOptString = sb2.toString();
                            }
                        } else {
                            strOptString = jSONObject.optString(str);
                            if (jSONObject.opt(str) instanceof String) {
                                StringBuilder sb22 = new StringBuilder();
                                sb22.append(m2242((ViewConfiguration.getLongPressTimeout() >> 16) + 129, 1 - (Process.myTid() >> 22), "\u0000", 1 - (ViewConfiguration.getScrollBarSize() >> 8), true).intern());
                                sb22.append(strOptString);
                                sb22.append(m2242(View.resolveSizeAndState(0, 0, 0) + 129, Color.rgb(0, 0, 0) + 16777217, "\u0000", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, true).intern());
                                strOptString = sb22.toString();
                            }
                        }
                        String strM2229 = dh.m2229(dh.this);
                        ee eeVarM2410 = new dr(strM2229, strOptString).m2410(dt.m2424(strM2229, strOptString, strOptString));
                        f1913 = (f1911 + 35) % 128;
                        return eeVarM2410;
                    } catch (Throwable th2) {
                        String strM22292 = dh.m2229(dh.this);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m2242(ExpandableListView.getPackedPositionGroup(0L) + 190, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, "\u000f\b\uffc1￦\u0013\u0013\u0010\u0013\uffc1\u0011\u0002\u0013\u0014\n", View.resolveSize(0, 0) + 3, false).intern());
                        sb3.append(str);
                        sb3.append(m2242(TextUtils.indexOf("", "", 0) + 179, ExpandableListView.getPackedPositionGroup(0L) + 8, "\u001b\u001a\u001f ￦ￌￌ\u000f", Color.alpha(0) + 6, false).intern());
                        sb3.append(jSONObject.optString(str));
                        co.m1955(strM22292, sb3.toString(), th2);
                        return null;
                    }
                }
            }), this.f1910, true);
            this.f1903 = dsVar;
            dsVar.m2421(kc.m3192(this.f1907.optJSONArray(m2230(7 - TextUtils.getCapsMode("", 0, 0), (byte) (17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0003\u000f\u0004\u0005\u0013\u0010\u0084").intern()), new kc.c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.1
                @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
                /* renamed from: ｋ */
                public final /* synthetic */ String mo883(JSONArray jSONArray, int i11) {
                    return dy.m2458(jSONArray.optString(i11));
                }
            }));
        }
        ds dsVar2 = this.f1903;
        int i11 = f1895 + 99;
        f1898 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 97 / 0;
        }
        return dsVar2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m2236() {
        int i10 = f1898;
        int i11 = i10 + 93;
        f1895 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1905;
        f1895 = (i10 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2237() {
        int i10 = f1895;
        String str = this.f1909;
        f1898 = (i10 + 105) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2240() {
        int i10 = (f1895 + 59) % 128;
        f1898 = i10;
        String str = this.f1906;
        f1895 = (i10 + 97) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m2238() {
        int i10 = f1898;
        String str = this.f1901;
        f1895 = (i10 + 67) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2241(String str) {
        Map<String, String> mapM3187;
        f1898 = (f1895 + 37) % 128;
        if (this.f1902 == null && (mapM3187 = kc.m3187(this.f1907.optJSONObject(m2232("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", true, new int[]{37, 18, 6, 0}).intern()))) != null) {
            ArrayList arrayList = new ArrayList(mapM3187.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.5
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(String str2, String str3) {
                    return ka.m3158(str2, str3);
                }
            });
            Iterator it = arrayList.iterator();
            String str2 = null;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (ka.m3158(str, str3) >= 0) {
                    int i10 = f1898 + 69;
                    f1895 = i10 % 128;
                    if (i10 % 2 == 0) {
                        str2 = mapM3187.get(str3);
                        int i11 = 57 / 0;
                    } else {
                        str2 = mapM3187.get(str3);
                    }
                }
            }
            this.f1902 = str2;
        }
        return this.f1902;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2239() {
        int i10 = (f1898 + 115) % 128;
        f1895 = i10;
        String str = this.f1908;
        f1898 = (i10 + 107) % 128;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2230(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f1897;
                char c10 = f1899;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    h.f2448 = 0;
                    while (true) {
                        int i11 = h.f2448;
                        if (i11 >= i10) {
                            break;
                        }
                        h.f2450 = cArr[i11];
                        h.f2449 = cArr[h.f2448 + 1];
                        if (h.f2450 == h.f2449) {
                            cArr3[h.f2448] = (char) (h.f2450 - b10);
                            cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                        } else {
                            h.f2447 = h.f2450 / c10;
                            h.f2444 = h.f2450 % c10;
                            h.f2446 = h.f2449 / c10;
                            h.f2443 = h.f2449 % c10;
                            if (h.f2444 == h.f2443) {
                                h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                int i12 = (h.f2447 * c10) + h.f2444;
                                int i13 = (h.f2446 * c10) + h.f2443;
                                int i14 = h.f2448;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (h.f2447 == h.f2446) {
                                h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                int i15 = (h.f2447 * c10) + h.f2444;
                                int i16 = (h.f2446 * c10) + h.f2443;
                                int i17 = h.f2448;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (h.f2447 * c10) + h.f2443;
                                int i19 = (h.f2446 * c10) + h.f2444;
                                int i20 = h.f2448;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        h.f2448 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2232(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f1896, i10, cArr, 0, i11);
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
