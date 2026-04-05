package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class dj extends da implements ci {

    /* renamed from: 爫, reason: contains not printable characters */
    private static char f1930 = 23581;

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f1931 = 1;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int f1932 = 0;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static long f1933 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1934 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static long f1935 = 7214887859272684907L;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private String f1936;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private String f1937;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String f1938;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String f1939;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String f1940;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String f1941;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f1942;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1943;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1944;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1945;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1946;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1947;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Object m2267() {
        int i10 = f1932 + 57;
        f1931 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1936;
        }
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m2269(String str) {
        int i10 = f1931 + 19;
        int i11 = i10 % 128;
        f1932 = i11;
        int i12 = i10 % 2;
        this.f1937 = str;
        if (i12 != 0) {
            throw null;
        }
        f1931 = (i11 + 15) % 128;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private void m2271(String str) {
        int i10 = f1931 + 19;
        int i11 = i10 % 128;
        f1932 = i11;
        int i12 = i10 % 2;
        this.f1936 = str;
        if (i12 != 0) {
            int i13 = 50 / 0;
        }
        f1931 = (i11 + 27) % 128;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m2272() {
        String str;
        int i10 = f1931 + 109;
        int i11 = i10 % 128;
        f1932 = i11;
        if (i10 % 2 != 0) {
            str = this.f1940;
            int i12 = 74 / 0;
        } else {
            str = this.f1940;
        }
        int i13 = i11 + 63;
        f1931 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m2275(String str) {
        int i10 = f1932;
        this.f1941 = str;
        int i11 = i10 + 55;
        f1931 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 5 / 0;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m2277(String str) {
        int i10 = f1931;
        this.f1940 = str;
        f1932 = (i10 + 73) % 128;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m2279(String str) {
        int i10 = f1931 + 37;
        int i11 = i10 % 128;
        f1932 = i11;
        int i12 = i10 % 2;
        this.f1938 = str;
        if (i12 != 0) {
            int i13 = 20 / 0;
        }
        f1931 = (i11 + 5) % 128;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m2281(String str) {
        int i10 = (f1931 + 55) % 128;
        f1932 = i10;
        this.f1939 = str;
        int i11 = i10 + 85;
        f1931 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2283(String str) {
        int i10 = f1931 + 83;
        f1932 = i10 % 128;
        int i11 = i10 % 2;
        this.f1947 = str;
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2286(String str) {
        int i10 = f1932;
        int i11 = i10 + 113;
        f1931 = i11 % 128;
        int i12 = i11 % 2;
        this.f1944 = str;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 95;
        f1931 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2288(String str) {
        int i10 = f1931 + 87;
        int i11 = i10 % 128;
        f1932 = i11;
        int i12 = i10 % 2;
        this.f1943 = str;
        if (i12 != 0) {
            throw null;
        }
        f1931 = (i11 + 87) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m2289() {
        int i10 = f1931;
        String str = this.f1944;
        int i11 = i10 + 37;
        f1932 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m2291() {
        int i10 = f1931 + 13;
        int i11 = i10 % 128;
        f1932 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1945;
        int i12 = i11 + 113;
        f1931 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 98 / 0;
        }
        return str;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private Object m2268() {
        int i10 = f1931;
        String str = this.f1937;
        f1932 = (i10 + 97) % 128;
        return str;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private JSONObject m2270() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ig.f2674, this.f1947);
            jSONObject.putOpt(ig.f2675, this.f1944);
            jSONObject.putOpt(ig.f2679, this.f1945);
            jSONObject.putOpt(ig.f2682, this.f1943);
            jSONObject.putOpt(ig.f2683, this.f1939);
            jSONObject.putOpt(ig.f2677, this.f1940);
            jSONObject.putOpt(ig.f2678, this.f1941);
            jSONObject.putOpt(ig.f2676, this.f1938);
            jSONObject.putOpt(ig.f2673, this.f1942);
            f1932 = (f1931 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m2273(String str) {
        int i10 = f1931;
        int i11 = i10 + 41;
        f1932 = i11 % 128;
        int i12 = i11 % 2;
        this.f1942 = str;
        if (i12 != 0) {
            throw null;
        }
        f1932 = (i10 + 81) % 128;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m2274() {
        int i10 = f1931 + 47;
        f1932 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1938;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m2276() {
        int i10 = f1932 + 101;
        int i11 = i10 % 128;
        f1931 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1941;
        f1932 = (i11 + 49) % 128;
        return str;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m2278() {
        int i10 = f1931;
        String str = this.f1942;
        int i11 = i10 + 31;
        f1932 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m2280() {
        int i10 = (f1931 + 75) % 128;
        f1932 = i10;
        String str = this.f1939;
        int i11 = i10 + 9;
        f1931 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m2282() {
        int i10 = (f1931 + 97) % 128;
        f1932 = i10;
        String str = this.f1947;
        int i11 = i10 + 45;
        f1931 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Object m2284() {
        int i10 = f1932 + 109;
        f1931 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1946;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m2287() {
        int i10 = (f1931 + 51) % 128;
        f1932 = i10;
        String str = this.f1943;
        f1931 = (i10 + 9) % 128;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2290(String str) {
        int i10 = f1931 + 73;
        f1932 = i10 % 128;
        int i11 = i10 % 2;
        this.f1945 = str;
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2293(String str) {
        int i10 = f1932;
        int i11 = i10 + 47;
        f1931 = i11 % 128;
        int i12 = i11 % 2;
        this.f1946 = str;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 1;
        f1931 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2285(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1933) ^ f1934) ^ f1930);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r10.equals(m2285("퉜\ue7ef蕻꿨", (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "ཷꊕ䗊룮⯱\ue801駢㜎", 1 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), "\u0000\u0000\u0000\u0000").intern()) != false) goto L66;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1170(java.lang.String r10, java.util.List<java.lang.Object> r11, com.ironsource.adqualitysdk.sdk.i.ch r12) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dj.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2292(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f1935);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
