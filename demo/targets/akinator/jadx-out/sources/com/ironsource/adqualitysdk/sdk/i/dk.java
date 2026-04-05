package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class dk extends da implements ci {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f1948 = true;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1949 = 0;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1950 = 208;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1951 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1952 = true;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1953 = {311, 309, 324, 294, 313, 308, 319, 293, 322, 316, 323, 281, 307, 318, 277, 275, 305, 326, 292, 329, 320, 291, 325, 317, 312, 310};

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static long f1954 = 8354517608150215280L;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private ho f1955;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private ho f1957;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1962 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1959 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1961 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1958 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1960 = new ArrayList();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private JSONObject f1956 = new JSONObject();

    /* renamed from: 爫, reason: contains not printable characters */
    private JSONObject m2294() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ho hoVar = this.f1957;
            if (hoVar != null) {
                f1949 = (f1951 + 99) % 128;
                jSONObject.put(ig.f2689, hoVar.m2623());
                f1949 = (f1951 + 97) % 128;
            }
            ho hoVar2 = this.f1955;
            if (hoVar2 != null) {
                jSONObject.put(ig.f2684, hoVar2.m2623());
            }
            if (this.f1962.size() > 0) {
                jSONObject.put(ig.f2685, new JSONArray((Collection) this.f1962));
            }
            if (this.f1959.size() > 0) {
                jSONObject.put(ig.f2681, new JSONArray((Collection) this.f1959));
            }
            if (this.f1961.size() > 0) {
                jSONObject.put(ig.f2680, new JSONArray((Collection) this.f1961));
            }
            if (this.f1958.size() > 0) {
                jSONObject.put(ig.f2688, new JSONArray((Collection) this.f1958));
            }
            if (this.f1960.size() > 0) {
                jSONObject.put(ig.f2686, new JSONArray((Collection) this.f1960));
                f1951 = (f1949 + 1) % 128;
            }
            if (this.f1956.length() > 0) {
                jSONObject.putOpt(ig.f2687, this.f1956.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private String m2295() {
        String strOptString;
        int i10 = f1951 + 107;
        f1949 = i10 % 128;
        if (i10 % 2 != 0) {
            strOptString = this.f1956.optString(ig.f2680);
            int i11 = 20 / 0;
        } else {
            strOptString = this.f1956.optString(ig.f2680);
        }
        int i12 = f1951 + 93;
        f1949 = i12 % 128;
        if (i12 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private String m2296() {
        f1949 = (f1951 + 57) % 128;
        String strOptString = this.f1956.optString(ig.f2688);
        f1951 = (f1949 + 31) % 128;
        return strOptString;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private JSONObject m2298() {
        int i10 = (f1949 + 9) % 128;
        f1951 = i10;
        JSONObject jSONObject = this.f1956;
        f1949 = (i10 + 37) % 128;
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* renamed from: ﮉ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m2299() {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1951
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1949 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L35
            java.util.List<java.lang.String> r0 = r2.f1962
            int r0 = r0.size()
            if (r0 > 0) goto L2f
            java.util.List<java.lang.String> r0 = r2.f1959
            int r0 = r0.size()
            if (r0 > 0) goto L2f
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1951
            int r0 = r0 + 125
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1949 = r0
            java.util.List<java.lang.String> r0 = r2.f1960
            int r0 = r0.size()
            if (r0 <= 0) goto L2d
            goto L2f
        L2d:
            r0 = 0
            goto L30
        L2f:
            r0 = 1
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            java.util.List<java.lang.String> r0 = r2.f1962
            r0.size()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dk.m2299():java.lang.Object");
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private String m2300() {
        int i10 = f1951 + 31;
        f1949 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1956.optString(ig.f2678);
        }
        this.f1956.optString(ig.f2678);
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m2301() {
        int i10 = f1949 + 115;
        f1951 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1956.optString(ig.f2686);
        }
        int i11 = 83 / 0;
        return this.f1956.optString(ig.f2686);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m2303() {
        f1949 = (f1951 + 13) % 128;
        String strOptString = this.f1956.optString(ig.f2685);
        int i10 = f1951 + 1;
        f1949 = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private ho m2305() {
        int i10 = (f1949 + 91) % 128;
        f1951 = i10;
        ho hoVar = this.f1957;
        f1949 = (i10 + 19) % 128;
        return hoVar;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private void m2308(String str) throws JSONException {
        f1949 = (f1951 + 23) % 128;
        try {
            this.f1956.put(ig.f2686, str);
            int i10 = f1951 + 87;
            f1949 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 6 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private ho m2309() {
        int i10 = f1949;
        ho hoVar = this.f1955;
        int i11 = i10 + 15;
        f1951 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 85 / 0;
        }
        return hoVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m2311() {
        int i10 = f1949 + 63;
        f1951 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1959;
        }
        int i11 = 1 / 0;
        return this.f1959;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m2316() {
        int i10 = f1949;
        List<String> list = this.f1962;
        int i11 = i10 + 17;
        f1951 = i11 % 128;
        if (i11 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<String> m2321() {
        int i10 = f1949 + 15;
        f1951 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1961;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m2325() {
        int i10 = f1951;
        int i11 = i10 + 31;
        f1949 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1960;
        int i12 = i10 + 81;
        f1949 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 82 / 0;
        }
        return list;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m2329() {
        List<String> list;
        int i10 = f1949;
        int i11 = i10 + 107;
        f1951 = i11 % 128;
        if (i11 % 2 == 0) {
            list = this.f1958;
            int i12 = 72 / 0;
        } else {
            list = this.f1958;
        }
        f1951 = (i10 + 45) % 128;
        return list;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private void m2297(String str) throws JSONException {
        int i10 = f1951 + 71;
        f1949 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f1956.put(ig.f2678, str);
            } else {
                this.f1956.put(ig.f2678, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m2302(String str) throws JSONException {
        f1951 = (f1949 + 29) % 128;
        try {
            this.f1956.put(ig.f2688, str);
            int i10 = f1951 + 75;
            f1949 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private void m2304(String str) throws JSONException {
        int i10 = f1951 + 113;
        f1949 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1956.put(ig.f2685, str);
                int i11 = 64 / 0;
            } else {
                this.f1956.put(ig.f2685, str);
            }
            f1951 = (f1949 + 89) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m2306(String str) throws JSONException {
        f1951 = (f1949 + 57) % 128;
        try {
            this.f1956.put(ig.f2680, str);
            f1949 = (f1951 + 33) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m2310(String str) throws JSONException {
        f1951 = (f1949 + 81) % 128;
        try {
            this.f1956.put(ig.f2681, str);
            f1949 = (f1951 + 87) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2314(List<String> list) {
        f1951 = (f1949 + 5) % 128;
        m2315(list, this.f1958);
        f1949 = (f1951 + 113) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2318(List<String> list) {
        int i10 = f1949 + 83;
        f1951 = i10 % 128;
        if (i10 % 2 == 0) {
            m2315(list, this.f1962);
            throw null;
        }
        m2315(list, this.f1962);
        int i11 = f1951 + 57;
        f1949 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2323(String str) {
        f1949 = (f1951 + 11) % 128;
        m2331(str, this.f1962);
        int i10 = f1949 + 93;
        f1951 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 74 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2326(String str) {
        f1951 = (f1949 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        m2331(str, this.f1959);
        int i10 = f1951 + 99;
        f1949 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2330(String str) {
        int i10 = f1951 + 1;
        f1949 = i10 % 128;
        if (i10 % 2 != 0) {
            m2331(str, this.f1958);
            throw null;
        }
        m2331(str, this.f1958);
        f1951 = (f1949 + 47) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2313(String str) {
        int i10 = f1951 + 115;
        f1949 = i10 % 128;
        if (i10 % 2 != 0) {
            m2331(str, this.f1960);
            throw null;
        }
        m2331(str, this.f1960);
        f1949 = (f1951 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2317(String str) {
        f1949 = (f1951 + 9) % 128;
        m2331(str, this.f1961);
        f1949 = (f1951 + 5) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2324(List<String> list) {
        int i10 = f1951 + 103;
        f1949 = i10 % 128;
        if (i10 % 2 != 0) {
            m2315(list, this.f1959);
            int i11 = 56 / 0;
        } else {
            m2315(list, this.f1959);
        }
        int i12 = f1949 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1951 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2327(List<String> list) {
        int i10 = f1951 + 107;
        f1949 = i10 % 128;
        if (i10 % 2 == 0) {
            m2315(list, this.f1961);
        } else {
            m2315(list, this.f1961);
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2332(List<String> list) {
        f1949 = (f1951 + 105) % 128;
        m2315(list, this.f1960);
        int i10 = f1951 + 25;
        f1949 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m2307() {
        String strOptString;
        int i10 = f1949 + 71;
        f1951 = i10 % 128;
        if (i10 % 2 == 0) {
            strOptString = this.f1956.optString(ig.f2681);
            int i11 = 61 / 0;
        } else {
            strOptString = this.f1956.optString(ig.f2681);
        }
        int i12 = f1949 + 3;
        f1951 = i12 % 128;
        if (i12 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2312(ho hoVar) {
        int i10 = f1949;
        int i11 = i10 + 35;
        f1951 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (hoVar != null) {
            f1951 = (i10 + 1) % 128;
            this.f1955 = hoVar;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2319(JSONObject jSONObject) {
        int i10 = f1949 + 11;
        f1951 = i10 % 128;
        int i11 = i10 % 2;
        this.f1956 = kc.m3179(jSONObject);
        if (i11 == 0) {
            int i12 = 37 / 0;
        }
        f1951 = (f1949 + 73) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2322(ho hoVar) {
        int i10 = f1949;
        int i11 = i10 + 39;
        f1951 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (hoVar != null) {
            int i12 = i10 + 45;
            f1951 = i12 % 128;
            int i13 = i12 % 2;
            this.f1957 = hoVar;
            if (i13 == 0) {
                int i14 = 39 / 0;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m2331(String str, List<String> list) {
        int i10 = f1951 + 41;
        f1949 = i10 % 128;
        if (i10 % 2 == 0) {
            if (list == null || TextUtils.isEmpty(str)) {
                return;
            }
            int i11 = f1949 + 89;
            f1951 = i11 % 128;
            if (i11 % 2 == 0) {
                list.contains(str);
                throw null;
            }
            if (list.contains(str)) {
                return;
            }
            list.add(str);
            return;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m2315(List<String> list, List<String> list2) {
        Iterator<String> it;
        if (list != null) {
            int i10 = f1951 + 3;
            f1949 = i10 % 128;
            if (i10 % 2 != 0) {
                it = list.iterator();
                int i11 = 71 / 0;
            } else {
                it = list.iterator();
            }
            while (it.hasNext()) {
                f1951 = (f1949 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                m2331(it.next(), list2);
            }
        }
        f1949 = (f1951 + 101) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2320(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f1954, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1954));
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
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cb, code lost:
    
        if ((r11 % 2) == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0248, code lost:
    
        if (r11.equals(m2320("\ud7ae\uf40f譈곶\ud7c9\ude1a\udfdc폰縇⁛疍薉葻覍⍄繵⪁폊\ud91a퀅烋", android.text.TextUtils.getCapsMode("", 0, 0)).intern()) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b5, code lost:
    
        if (r11.equals(m2320("褌ꏬ딤\ud93d襫觹\ue1b0\ua62e₾瞹䯥\uf059\uc966aᴡஹ琵萬\ue761", android.view.ViewConfiguration.getTouchSlop() >> 8).intern()) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c3, code lost:
    
        return java.lang.Integer.valueOf(m2305().m2623());
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1170(java.lang.String r11, java.util.List<java.lang.Object> r12, com.ironsource.adqualitysdk.sdk.i.ch r13) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dk.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2328(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f1953;
                int i11 = f1950;
                if (f1952) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1948) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
