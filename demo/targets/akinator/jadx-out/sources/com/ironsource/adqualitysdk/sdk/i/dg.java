package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class dg extends da implements ci {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f1883 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1884 = 0;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1885 = 91;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f1886 = 2978;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1887;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static long f1888;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1890;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1891;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1893;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1894 = "";

    /* renamed from: ｋ, reason: contains not printable characters */
    private double f1892 = -1.0d;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f1889 = false;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m2213() {
        String strIntern;
        f1883 = (f1884 + 15) % 128;
        if (m2214()) {
            f1883 = (f1884 + 79) % 128;
            strIntern = m2218("硅뮶ﺺఱ", (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "㕕놗\uf12c콮灹鞙尶鿫ⳏ㕾", ViewConfiguration.getScrollBarFadeDuration() >> 16, "\u0000\u0000\u0000\u0000").intern();
            f1883 = (f1884 + 63) % 128;
        } else {
            strIntern = m2218("櫀ၳᑭ리", (char) (TextUtils.getOffsetAfter("", 0) + 44052), "蘛ꖱﯧᆎ䓂嶃", ViewConfiguration.getMaximumFlingVelocity() >> 16, "\u0000\u0000\u0000\u0000").intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2221((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 190, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, "\u0000\u0001\tￊ\n\u000b\u0005\u0010�\u0005", ((Process.getThreadPriority(0) + 20) >> 6) + 3, true).intern());
        sb2.append(this.f1894);
        return com.google.android.gms.internal.play_billing.a.k(sb2, m2218("딽﹔ᒎ岭", (char) (44308 - Color.argb(0, 0, 0, 0)), "⍏", (-1895934795) - Drawable.resolveOpacity(0, 0), "\u0000\u0000\u0000\u0000"), strIntern);
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private boolean m2214() {
        int i10 = (f1883 + 75) % 128;
        f1884 = i10;
        boolean z10 = this.f1893;
        f1883 = (i10 + 5) % 128;
        return z10;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m2215() {
        String str;
        int i10 = f1883 + 99;
        int i11 = i10 % 128;
        f1884 = i11;
        if (i10 % 2 != 0) {
            str = this.f1890;
            int i12 = 90 / 0;
        } else {
            str = this.f1890;
        }
        f1883 = (i11 + 93) % 128;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m2216() {
        int i10 = (f1883 + 87) % 128;
        f1884 = i10;
        String str = this.f1891;
        f1883 = (i10 + 45) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m2219() {
        int i10 = f1884 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1883 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1889;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m2220() {
        int i10 = f1884;
        String str = this.f1894;
        f1883 = (i10 + 13) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2223(String str) {
        int i10 = f1883 + 13;
        int i11 = i10 % 128;
        f1884 = i11;
        int i12 = i10 % 2;
        this.f1894 = str;
        if (i12 != 0) {
            throw null;
        }
        f1883 = (i11 + 63) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2225(String str) {
        int i10 = f1884;
        this.f1891 = str;
        f1883 = (i10 + 17) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2217(boolean z10) {
        int i10 = f1883;
        this.f1893 = z10;
        f1884 = (i10 + 49) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2226(boolean z10) {
        int i10 = f1883;
        this.f1889 = z10;
        f1884 = (i10 + 51) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m2227(String str) {
        int i10 = f1884;
        int i11 = i10 + 45;
        f1883 = i11 % 128;
        int i12 = i11 % 2;
        this.f1890 = str;
        if (i12 == 0) {
            throw null;
        }
        f1883 = (i10 + 9) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m2228(Double d10) {
        f1883 = (f1884 + 69) % 128;
        this.f1892 = d10.doubleValue();
        int i10 = f1884 + 105;
        f1883 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2221(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1885);
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Double m2222() {
        int i10 = f1883 + 69;
        f1884 = i10 % 128;
        if (i10 % 2 == 0) {
            return Double.valueOf(this.f1892);
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m2224() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ig.f2707, this.f1891);
            double d10 = this.f1892;
            if (d10 > -1.0d) {
                jSONObject2.put(ig.f2657, d10);
                f1883 = (f1884 + 71) % 128;
            }
            jSONObject2.put(ig.f2658, this.f1890);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                int i10 = f1884 + 65;
                f1883 = i10 % 128;
                if (i10 % 2 != 0) {
                    if (this.f1889) {
                        jSONObject2.put(ig.f2655, true);
                    }
                    jSONObject.put(ig.f2656, jSONObject2);
                } else {
                    throw null;
                }
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1170(java.lang.String r21, java.util.List<java.lang.Object> r22, com.ironsource.adqualitysdk.sdk.i.ch r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dg.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2218(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1888) ^ f1887) ^ f1886);
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
