package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class di extends da implements ci {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static short[] f1916 = null;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1917 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1918 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static byte[] f1919 = {-38, 61, -63, 33, 46, 1, -16, 47, -46, 8, -17, 27, -7, 1, -9, -47, 32, -3, 12, -24, 15, -30, 16, -29, -17, 20, 14, -3, 18, 17, 126, -115, -127, 122, 96, -109, 103, -85, 113, -114, 118, -119, 126, 113, -109, 110, 95, -79, 115, -126, 123, -120, -124, AbstractJsonLexerKt.TC_INVALID, 101, -106, 98, -82, 116, -117, 115, -116, 123, 116, -106, 107, 90, -76, 118, -117, -61, 48, 60, -57, -35, 38, 59, -36, 32, -64, -49, -32, 17, -50, Utf8.REPLACEMENT_BYTE, 97, -110, -98, 101, AbstractJsonLexerKt.TC_INVALID, -124, -103, 126, -109, 97, -110, -98, 101, AbstractJsonLexerKt.TC_INVALID, -68, 108, -99, 12, -1, -13, 8, 18, -23, -12, 19, -2, 12, -1, -13, 8, 18, -47, 1, -4, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f1920 = -8993914270937839447L;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1921 = -733435483;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1922 = 71;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1923 = 197925965;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1925;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private hi f1926;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1927;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1929;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final JSONObject f1928 = new JSONObject();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final List<String> f1924 = new ArrayList();

    /* renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m2243() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f1925;
            if (str != null && this.f1926 != null) {
                f1918 = (f1917 + 95) % 128;
                jSONObject.putOpt(ig.f2697, str);
                jSONObject.putOpt(ig.f2696, Integer.valueOf(this.f1926.m2582()));
            }
            jSONObject.putOpt(ig.f2693, this.f1929);
            jSONObject.putOpt(ig.f2691, this.f1927);
            if (this.f1924.size() > 0) {
                jSONObject.putOpt(ig.f2685, new JSONArray((Collection) this.f1924));
                f1917 = (f1918 + 27) % 128;
            }
            if (this.f1928.length() > 0) {
                int i10 = f1918 + 57;
                f1917 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.putOpt(ig.f2698, this.f1928.toString());
                    throw null;
                }
                jSONObject.putOpt(ig.f2698, this.f1928.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* renamed from: ﮉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m2244() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.di.f1917
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.di.f1918 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L62
            java.lang.String r0 = r3.f1925
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L54
            int r0 = com.ironsource.adqualitysdk.sdk.i.di.f1917
            int r0 = r0 + 97
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.di.f1918 = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L4e
            java.lang.String r0 = r3.f1929
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L54
            java.lang.String r0 = r3.f1927
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L54
            int r0 = com.ironsource.adqualitysdk.sdk.i.di.f1917
            int r0 = r0 + 37
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.di.f1918 = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L48
            java.util.List<java.lang.String> r0 = r3.f1924
            int r0 = r0.size()
            if (r0 <= 0) goto L46
            goto L54
        L46:
            r0 = 0
            goto L55
        L48:
            java.util.List<java.lang.String> r0 = r3.f1924
            r0.size()
            throw r1
        L4e:
            java.lang.String r0 = r3.f1929
            android.text.TextUtils.isEmpty(r0)
            throw r1
        L54:
            r0 = 1
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r1 = com.ironsource.adqualitysdk.sdk.i.di.f1917
            int r1 = r1 + 33
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.di.f1918 = r1
            return r0
        L62:
            java.lang.String r0 = r3.f1925
            android.text.TextUtils.isEmpty(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.di.m2244():java.lang.Object");
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m2245() {
        int i10 = f1918 + 29;
        f1917 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1928.optString(ig.f2697);
        }
        this.f1928.optString(ig.f2697);
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m2247(String str) throws JSONException {
        int i10 = f1917 + 77;
        f1918 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1928.put(ig.f2691, str);
            } else {
                this.f1928.put(ig.f2691, str);
                int i11 = 57 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m2248() {
        f1918 = (f1917 + 115) % 128;
        String strOptString = this.f1928.optString(ig.f2693);
        int i10 = f1918 + 3;
        f1917 = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m2251(String str) throws JSONException {
        int i10 = f1918 + 31;
        f1917 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1928.put(ig.f2693, str);
                int i11 = 45 / 0;
            } else {
                this.f1928.put(ig.f2693, str);
            }
            int i12 = f1918 + 3;
            f1917 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 94 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m2252() {
        f1918 = (f1917 + 15) % 128;
        String strOptString = this.f1928.optString(ig.f2685);
        f1917 = (f1918 + 37) % 128;
        return strOptString;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m2253() {
        String str;
        int i10 = f1917 + 15;
        int i11 = i10 % 128;
        f1918 = i11;
        if (i10 % 2 == 0) {
            str = this.f1929;
            int i12 = 64 / 0;
        } else {
            str = this.f1929;
        }
        int i13 = i11 + 11;
        f1917 = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m2256() {
        int i10 = f1918 + 19;
        int i11 = i10 % 128;
        f1917 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1924;
        int i12 = i11 + 13;
        f1918 = i12 % 128;
        if (i12 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m2258() {
        int i10 = f1917;
        int i11 = i10 + 89;
        f1918 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1925;
        f1918 = (i10 + 3) % 128;
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private hi m2262() {
        hi hiVar;
        int i10 = f1918 + 97;
        int i11 = i10 % 128;
        f1917 = i11;
        if (i10 % 2 != 0) {
            hiVar = this.f1926;
            int i12 = 54 / 0;
        } else {
            hiVar = this.f1926;
        }
        f1918 = (i11 + 65) % 128;
        return hiVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2266(String str) {
        int i10 = f1917;
        int i11 = i10 + 11;
        f1918 = i11 % 128;
        int i12 = i11 % 2;
        this.f1925 = str;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 51;
        f1918 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m2249(String str) throws JSONException {
        int i10 = f1918 + 37;
        f1917 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1928.put(ig.f2685, str);
                throw null;
            }
            this.f1928.put(ig.f2685, str);
            int i11 = f1917 + 5;
            f1918 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 95 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2254(String str) {
        int i10 = f1917;
        this.f1929 = str;
        f1918 = (i10 + 47) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2257(String str) {
        if (!TextUtils.isEmpty(str) && !this.f1924.contains(str)) {
            this.f1924.add(str);
            f1918 = (f1917 + 77) % 128;
        }
        f1917 = (f1918 + 37) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2259(hi hiVar) {
        int i10 = f1917 + 107;
        int i11 = i10 % 128;
        f1918 = i11;
        int i12 = i10 % 2;
        this.f1926 = hiVar;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 21;
        f1917 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 33 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2264(String str) {
        int i10 = f1917 + 105;
        f1918 = i10 % 128;
        int i11 = i10 % 2;
        this.f1927 = str;
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m2265() {
        String str;
        int i10 = f1917;
        int i11 = i10 + 95;
        f1918 = i11 % 128;
        if (i11 % 2 == 0) {
            str = this.f1927;
            int i12 = 2 / 0;
        } else {
            str = this.f1927;
        }
        f1918 = (i10 + 39) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2261(List<String> list) {
        f1917 = (f1918 + 21) % 128;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            int i10 = f1918 + 103;
            f1917 = i10 % 128;
            if (i10 % 2 != 0) {
                m2257(it.next());
                throw null;
            }
            m2257(it.next());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2263(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f1920, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1920));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0390  */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1170(java.lang.String r22, java.util.List<java.lang.Object> r23, com.ironsource.adqualitysdk.sdk.i.ch r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.di.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2255(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1922;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1919;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1921 + i11] + i13);
                    } else {
                        i14 = (short) (f1916[f1921 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f1921 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f1923);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f1919;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f1916;
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

    /* renamed from: ﱟ, reason: contains not printable characters */
    private JSONObject m2246() {
        int i10 = f1917;
        JSONObject jSONObject = this.f1928;
        f1918 = (i10 + 61) % 128;
        return jSONObject;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Object m2250() {
        int i10 = f1917 + 1;
        f1918 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1928.optString(ig.f2691);
        }
        int i11 = 79 / 0;
        return this.f1928.optString(ig.f2691);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2260(String str) throws JSONException {
        f1918 = (f1917 + 99) % 128;
        try {
            this.f1928.put(ig.f2697, str);
            int i10 = f1918 + 55;
            f1917 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 58 / 0;
            }
        } catch (JSONException unused) {
        }
    }
}
