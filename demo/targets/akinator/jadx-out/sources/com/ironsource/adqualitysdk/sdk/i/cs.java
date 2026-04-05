package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cs extends da {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1718 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1719 = 6109973089952735663L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1720 = 1;

    /* renamed from: 爫, reason: contains not printable characters */
    private static ik m2072() {
        f1718 = (f1720 + 59) % 128;
        ik ikVarM3000 = jh.m2995().m3000();
        f1720 = (f1718 + 61) % 128;
        return ikVarM3000;
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static JSONObject m2073() {
        f1718 = (f1720 + 87) % 128;
        JSONObject jSONObjectM807 = aq.m814().mo825().m807();
        int i10 = f1720 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1718 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObjectM807;
        }
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static String m2074() {
        int i10 = f1720 + 51;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            aq.m814().mo825().m808();
            throw null;
        }
        String strM808 = aq.m814().mo825().m808();
        int i11 = f1720 + 113;
        f1718 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM808;
        }
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static double m2075() {
        double dMo834;
        int i10 = f1720 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            dMo834 = aq.m814().mo834();
            int i11 = 2 / 0;
        } else {
            dMo834 = aq.m814().mo834();
        }
        f1720 = (f1718 + 7) % 128;
        return dMo834;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static JSONObject m2076() {
        int i10 = f1720 + 9;
        f1718 = i10 % 128;
        if (i10 % 2 == 0) {
            return aq.m814().mo825().m849();
        }
        aq.m814().mo825().m849();
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static boolean m2077() {
        f1720 = (f1718 + 63) % 128;
        boolean zMo832 = aq.m814().mo832();
        f1720 = (f1718 + 23) % 128;
        return zMo832;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m2078() {
        int i10 = f1718 + 59;
        f1720 = i10 % 128;
        if (i10 % 2 == 0) {
            aq.m814().mo837();
            throw null;
        }
        boolean zMo837 = aq.m814().mo837();
        int i11 = f1720 + 53;
        f1718 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 18 / 0;
        }
        return zMo837;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static di m2079() {
        di diVar = new di();
        f1720 = (f1718 + 33) % 128;
        return diVar;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static JSONObject m2082() {
        JSONObject jSONObjectM3179;
        int i10 = f1720 + 19;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObjectM3179 = kc.m3179(aq.m814().m849());
            int i11 = 24 / 0;
        } else {
            jSONObjectM3179 = kc.m3179(aq.m814().m849());
        }
        f1720 = (f1718 + 27) % 128;
        return jSONObjectM3179;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static String m2083() {
        String sDKVersion;
        int i10 = f1720 + 115;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            sDKVersion = IronSourceAdQuality.getSDKVersion();
            int i11 = 44 / 0;
        } else {
            sDKVersion = IronSourceAdQuality.getSDKVersion();
        }
        int i12 = f1720 + 33;
        f1718 = i12 % 128;
        if (i12 % 2 == 0) {
            return sDKVersion;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static dj m2084() {
        dj djVar = new dj();
        f1720 = (f1718 + 27) % 128;
        return djVar;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static dg m2086() {
        dg dgVar = new dg();
        f1718 = (f1720 + 101) % 128;
        return dgVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m2091(cp cpVar, List<Object> list) {
        f1720 = (f1718 + 103) % 128;
        cpVar.m2010((String) da.m2180(list, 0, String.class), (JSONObject) da.m2180(list, 1, JSONObject.class));
        f1718 = (f1720 + 101) % 128;
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m2094(cp cpVar) {
        int i10 = f1720 + 113;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            cpVar.m2012();
            throw null;
        }
        Context contextM2012 = cpVar.m2012();
        f1720 = (f1718 + 53) % 128;
        return contextM2012;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static long m2096() {
        int i10 = f1718 + 39;
        f1720 = i10 % 128;
        if (i10 % 2 == 0) {
            m2072().m2834();
            throw null;
        }
        long jM2834 = m2072().m2834();
        int i11 = f1720 + 65;
        f1718 = i11 % 128;
        if (i11 % 2 == 0) {
            return jM2834;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m2100() {
        f1720 = (f1718 + 71) % 128;
        long jM3085 = jv.m3085();
        f1718 = (f1720 + 111) % 128;
        return jM3085;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m2102(final cp cpVar, List<Object> list, final ds dsVar) {
        final dq dqVar;
        int i10 = f1720 + 99;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            dqVar = (dq) da.m2180(list, 1, dq.class);
            if (dqVar == null) {
                return null;
            }
        } else {
            dqVar = (dq) da.m2180(list, 0, dq.class);
            if (dqVar == null) {
                return null;
            }
        }
        cpVar.m2015(new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cs.4
            @Override // com.ironsource.adqualitysdk.sdk.i.io
            /* renamed from: ﻛ */
            public final JSONObject mo1000(String str, JSONObject jSONObject) {
                return (JSONObject) dqVar.m2365(dsVar, cpVar, Arrays.asList(str, jSONObject)).m2437();
            }
        });
        f1718 = (f1720 + 41) % 128;
        return null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static String m2080(cp cpVar) {
        f1720 = (f1718 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        String strM2636 = cpVar.m2016().m2636();
        f1720 = (f1718 + 99) % 128;
        return strM2636;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static String m2081(cp cpVar) {
        int i10 = f1718 + 57;
        f1720 = i10 % 128;
        int i11 = i10 % 2;
        String strM1953 = cpVar.m2014().m1953();
        if (i11 == 0) {
            int i12 = 73 / 0;
        }
        f1720 = (f1718 + 51) % 128;
        return strM1953;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static String m2085(cp cpVar) {
        int i10 = f1720 + 103;
        f1718 = i10 % 128;
        int i11 = i10 % 2;
        String strM1950 = cpVar.m2014().m1950();
        if (i11 != 0) {
            int i12 = 60 / 0;
        }
        f1718 = (f1720 + 77) % 128;
        return strM1950;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static dk m2093() {
        dk dkVar = new dk();
        f1718 = (f1720 + 97) % 128;
        return dkVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m2101(cp cpVar) {
        int i10 = f1720 + 79;
        f1718 = i10 % 128;
        int i11 = i10 % 2;
        cn cnVarM2014 = cpVar.m2014();
        if (i11 != 0) {
            cnVarM2014.m1945();
            throw null;
        }
        String strM1945 = cnVarM2014.m1945();
        f1718 = (f1720 + 1) % 128;
        return strM1945;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m2095(List<Object> list) {
        f1720 = (f1718 + 63) % 128;
        String lowerCase = ISAdQualityAdType.fromInt(((Integer) da.m2180(list, 0, Integer.class)).intValue()).name().toLowerCase();
        int i10 = f1718 + 27;
        f1720 = i10 % 128;
        if (i10 % 2 != 0) {
            return lowerCase;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m2087(cp cpVar) {
        int i10 = f1718 + 43;
        f1720 = i10 % 128;
        if (i10 % 2 != 0) {
            return cpVar.m2014();
        }
        cpVar.m2014();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Activity m2090() {
        int i10 = f1720 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            jf.m2969().mo2972();
            throw null;
        }
        Activity activityMo2972 = jf.m2969().mo2972();
        int i11 = f1718 + 85;
        f1720 = i11 % 128;
        if (i11 % 2 != 0) {
            return activityMo2972;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m2099(cp cpVar) throws JSONException {
        int i10 = f1720 + 15;
        f1718 = i10 % 128;
        if (i10 % 2 == 0) {
            return cpVar.m2005();
        }
        cpVar.m2005();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m2089() throws JSONException {
        f1720 = (f1718 + 77) % 128;
        ik ikVarM2072 = m2072();
        JSONObject jSONObjectM3188 = kc.m3188(ikVarM2072.m2831(), ikVarM2072.m2832(), ikVarM2072.m2834(), ikVarM2072.m2833());
        f1718 = (f1720 + 35) % 128;
        return jSONObjectM3188;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m2092(cp cpVar) {
        int i10 = f1720 + 101;
        f1718 = i10 % 128;
        int i11 = i10 % 2;
        cn cnVarM2014 = cpVar.m2014();
        if (i11 != 0) {
            cnVarM2014.m1947();
            throw null;
        }
        String strM1947 = cnVarM2014.m1947();
        f1718 = (f1720 + 59) % 128;
        return strM1947;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m2097(List<Object> list) {
        String strM2098;
        int i10 = f1720 + 89;
        f1718 = i10 % 128;
        if (i10 % 2 != 0) {
            ViewConfiguration.getScrollBarFadeDuration();
            strM2098 = m2098("鄲\u1fc5䕂ﲚ酳㸎ٍ駢\u17ef럂輱ᜧ鰳ケᗐ蹔", 0);
        } else {
            strM2098 = m2098("鄲\u1fc5䕂ﲚ酳㸎ٍ駢\u17ef럂輱ᜧ鰳ケᗐ蹔", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1);
        }
        k.m3138(strM2098.intern(), (String) da.m2180(list, 0, String.class));
        int i11 = f1718 + 61;
        f1720 = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object m2103(List<Object> list) {
        String str = (String) da.m2180(list, 0, String.class);
        List<Object> listM2182 = da.m2182(list, 1);
        aw awVarM3313 = q.m3297().m3313();
        if (awVarM3313 != null) {
            int i10 = f1720 + 79;
            f1718 = i10 % 128;
            if (i10 % 2 != 0) {
                awVarM3313.m995(str, listM2182);
                int i11 = 20 / 0;
            } else {
                awVarM3313.m995(str, listM2182);
            }
        }
        int i12 = f1718 + 27;
        f1720 = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m2088(List<Object> list) {
        f1718 = (f1720 + 103) % 128;
        Object objM806 = aq.m814().mo825().m806((String) da.m2180(list, 0, String.class));
        f1718 = (f1720 + 105) % 128;
        return objM806;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2098(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f1719, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1719));
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
}
