package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.kc;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dp {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1996 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f1997 = {'9', 't', 'r', 'j', 'k', AbstractJsonLexerKt.COLON, 'k', 'b', 'i', GMTDateParser.SECONDS, GMTDateParser.SECONDS, 'j', 'a', '9', 'r', 'k', 'c', 'g', 'i', 'i', 'r', 220, 220, 225, 226, '9', GMTDateParser.SECONDS, 'q', 'i', GMTDateParser.MINUTES, GMTDateParser.MINUTES, '9', 'k', 'i', 'k', 'n', 'l', 'i'};

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1998;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Map<String, dl> f1999;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, dq> f2000;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<dm> f2001;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f2002;

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<String> f2003;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2004;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2005;

    public dp(final String str, String str2, JSONObject jSONObject) {
        this.f2002 = dy.m2458(str2);
        this.f2004 = dy.m2458(jSONObject.optString(m2353("\u0001\u0000\u0001\u0001\u0001", false, new int[]{0, 5, 0, 0}).intern()));
        this.f2005 = jSONObject.optBoolean(m2353("\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001", true, new int[]{5, 8, 0, 0}).intern());
        this.f2003 = m2355(kc.m3192(jSONObject.optJSONArray(m2353("\u0001\u0001\u0001\u0001\u0001\u0000\u0000", true, new int[]{13, 7, 0, 0}).intern()), new kc.c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
            /* renamed from: ｋ */
            public final /* synthetic */ String mo883(JSONArray jSONArray, int i10) {
                return dy.m2458(jSONArray.optString(i10));
            }
        }));
        this.f2001 = m2355(kc.m3192(jSONObject.optJSONArray(m2353("\u0000\u0001\u0000\u0001\u0001", true, new int[]{20, 5, 112, 3}).intern()), new kc.c<dm>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
            /* renamed from: ｋ */
            public final /* synthetic */ dm mo883(JSONArray jSONArray, int i10) {
                return new dm(jSONArray.optJSONObject(i10));
            }
        }));
        this.f1999 = m2354(kc.m3186(jSONObject.optJSONObject(m2353("\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{25, 6, 0, 0}).intern()), new kc.b<dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
            /* renamed from: ﻐ */
            public final /* synthetic */ dl mo879(JSONObject jSONObject2, String str3) {
                return new dl(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f2000 = m2354(kc.m3186(jSONObject.optJSONObject(m2353("\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, new int[]{31, 7, 0, 0}).intern()), new kc.b<dq>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
            /* renamed from: ﻐ */
            public final /* synthetic */ dq mo879(JSONObject jSONObject2, String str3) {
                return new dq(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r1 = r1 + 89;
        com.ironsource.adqualitysdk.sdk.i.dp.f1998 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <K, V> java.util.Map<K, V> m2354(java.util.Map<K, V> r2) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.dp.f1998
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dp.f1996 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            r0 = 39
            int r0 = r0 / 0
            if (r2 == 0) goto L22
            goto L15
        L13:
            if (r2 == 0) goto L22
        L15:
            int r1 = r1 + 89
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.dp.f1998 = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L20
            return r2
        L20:
            r2 = 0
            throw r2
        L22:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dp.m2354(java.util.Map):java.util.Map");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> List<T> m2355(List<T> list) {
        int i10;
        if (list != null) {
            int i11 = f1996 + 79;
            f1998 = i11 % 128;
            i10 = i11 % 2 != 0 ? 38 : 34;
            return list;
        }
        list = new ArrayList<>();
        int i12 = f1996 + 115;
        f1998 = i12 % 128;
        if (i12 % 2 == 0) {
            return list;
        }
        int i13 = i10 / 0;
        return list;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final List<dm> m2356() {
        int i10 = f1998 + 109;
        f1996 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2001;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Map<String, dl> m2357() {
        int i10 = f1998;
        int i11 = i10 + 105;
        f1996 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        Map<String, dl> map = this.f1999;
        f1996 = (i10 + 99) % 128;
        return map;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m2358() {
        int i10 = (f1996 + 53) % 128;
        f1998 = i10;
        String str = this.f2004;
        int i11 = i10 + 75;
        f1996 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 34 / 0;
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2361() {
        int i10 = f1998;
        boolean z10 = this.f2005;
        f1996 = (i10 + 41) % 128;
        return z10;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Map<String, dq> m2362() {
        int i10 = f1996 + 85;
        int i11 = i10 % 128;
        f1998 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        Map<String, dq> map = this.f2000;
        int i12 = i11 + 57;
        f1996 = i12 % 128;
        if (i12 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m2360() {
        int i10 = f1996;
        List<String> list = this.f2003;
        int i11 = i10 + 37;
        f1998 = i11 % 128;
        if (i11 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2359() {
        int i10 = (f1996 + 7) % 128;
        f1998 = i10;
        String str = this.f2002;
        int i11 = i10 + 89;
        f1996 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 48 / 0;
        }
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2353(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f1997, i10, cArr, 0, i11);
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
