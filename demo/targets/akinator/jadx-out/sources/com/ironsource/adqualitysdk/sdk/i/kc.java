package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class kc {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f3134 = {585137505, -1153935005, -1073851624, -246246857, 879469207, 862883917, 493837664, 125999003, -1596518699, 319916439, 1517759703, -479740947, 692807989, 726010753, 1744517460, 636271589, 637863345, 2081652814};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3135 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3136;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b<T> {
        /* renamed from: ﻐ */
        T mo879(JSONObject jSONObject, String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c<T> {
        /* renamed from: ｋ */
        T mo883(JSONArray jSONArray, int i10);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m3179(JSONObject jSONObject) {
        int i10 = f3135 + 91;
        f3136 = i10 % 128;
        JSONObject jSONObjectM3193 = m3193(jSONObject, i10 % 2 != 0);
        f3136 = (f3135 + 85) % 128;
        return jSONObjectM3193;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m3184(JSONArray jSONArray) {
        if (jSONArray == null) {
            int i10 = f3135 + 15;
            f3136 = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        List<String> listM3195 = m3195(jSONArray);
        int i11 = f3136 + 53;
        f3135 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 0 / 0;
        }
        return listM3195;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m3190(JSONObject jSONObject, int i10) {
        f3135 = (f3136 + 89) % 128;
        m3181(jSONObject, i10, (List<String>) null);
        f3136 = (f3135 + 35) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m3193(JSONObject jSONObject, boolean z10) {
        f3136 = (f3135 + 83) % 128;
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (z10) {
                    jSONObject2.remove(ig.f2701);
                    f3136 = (f3135 + 75) % 128;
                }
                return jSONObject2;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> List<T> m3195(JSONArray jSONArray) {
        List<T> listM3192 = m3192(jSONArray, new c<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.kc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
            /* renamed from: ｋ */
            public final T mo883(JSONArray jSONArray2, int i10) {
                return (T) jSONArray2.opt(i10);
            }
        });
        int i10 = f3136 + 49;
        f3135 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM3192;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3183(JSONObject jSONObject, JSONObject jSONObject2, boolean z10) throws JSONException {
        f3136 = (f3135 + 7) % 128;
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            f3135 = (f3136 + 113) % 128;
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z10) {
            jSONObject.remove(ig.f2701);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m3185(JSONObject jSONObject, String str, List<String> list) {
        int i10 = f3136 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3135 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObject.optJSONArray(str);
            throw null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return m3184(jSONArrayOptJSONArray);
        }
        f3136 = (f3135 + 53) % 128;
        return list;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m3189(JSONArray jSONArray, int i10) throws JSONException {
        f3135 = (f3136 + 91) % 128;
        int i11 = 0;
        while (i11 < jSONArray.length()) {
            m3180(jSONArray, i11, i10);
            i11++;
            f3136 = (f3135 + 27) % 128;
        }
        f3135 = (f3136 + 79) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Map<String, String> m3187(JSONObject jSONObject) {
        Map<String, String> mapM3186 = m3186(jSONObject, new b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.kc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
            /* renamed from: ﻐ */
            public final /* synthetic */ String mo879(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i10 = f3135 + 101;
        f3136 = i10 % 128;
        if (i10 % 2 == 0) {
            return mapM3186;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3194(JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f3135 + 21;
        f3136 = i10 % 128;
        m3183(jSONObject, jSONObject2, i10 % 2 != 0);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static JSONObject m3188(int i10, int i11, long j10, long j11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j10 > -1) {
                f3136 = (f3135 + 97) % 128;
                jSONObject.put(m3178(new int[]{-1541009894, -924313111}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern(), i10);
                jSONObject.put(m3178(new int[]{1152688240, 266234741}, AndroidCharacter.getMirror('0') - '/').intern(), i11);
                jSONObject.put(m3178(new int[]{-1384553687, 680286553}, 1 - Gravity.getAbsoluteGravity(0, 0)).intern(), j10);
                jSONObject.put(m3178(new int[]{-1056622296, 1788332105}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), j11);
            } else {
                jSONObject.put(m3178(new int[]{-1541009894, -924313111}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), -1);
                jSONObject.put(m3178(new int[]{1152688240, 266234741}, Color.green(0) + 1).intern(), -1);
                jSONObject.put(m3178(new int[]{-1384553687, 680286553}, -Process.getGidForName("")).intern(), -1);
                jSONObject.put(m3178(new int[]{-1056622296, 1788332105}, Color.green(0) + 1).intern(), -1);
            }
        } catch (JSONException e10) {
            k.m3145(m3178(new int[]{-1349732139, 783411595, -1008704245, 1979279449, -1829298634, -306661175}, 8 - ImageFormat.getBitsPerPixel(0)).intern(), m3178(new int[]{-1281885105, 1214876572, -490413162, 1461695234, 1240285503, 1538012776, -1415646418, -772324787, -1864371192, -819063629, 542209106, -536855876, -1789634290, 1612620357, -2105414827, 1090236688}, 29 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), (Throwable) e10);
        }
        int i12 = f3135 + 103;
        f3136 = i12 % 128;
        if (i12 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <T> List<T> m3192(JSONArray jSONArray, c<T> cVar) {
        f3135 = (f3136 + 65) % 128;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            T tMo883 = cVar.mo883(jSONArray, i10);
            if (tMo883 != null) {
                arrayList.add(tMo883);
            }
            i10++;
            f3135 = (f3136 + 3) % 128;
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static <T> Map<String, T> m3186(JSONObject jSONObject, b<T> bVar) {
        if (jSONObject == null) {
            f3135 = (f3136 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, bVar.mo879(jSONObject, next));
        }
        int i10 = f3135 + 17;
        f3136 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3181(JSONObject jSONObject, int i10, List<String> list) {
        try {
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                f3136 = (f3135 + 9) % 128;
                for (int i11 = 0; i11 < jSONArrayNames.length(); i11++) {
                    f3135 = (f3136 + 35) % 128;
                    String strOptString = jSONArrayNames.optString(i11);
                    if (list != null) {
                        f3136 = (f3135 + 61) % 128;
                        if (!list.contains(strOptString)) {
                            m3182(jSONObject, strOptString, i10);
                        }
                    } else {
                        m3182(jSONObject, strOptString, i10);
                    }
                }
            }
        } catch (JSONException e10) {
            k.m3145(m3178(new int[]{-1349732139, 783411595, -1008704245, 1979279449, -1829298634, -306661175}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10).intern(), m3178(new int[]{-1281885105, 1214876572, -1739218394, -69952560, -598892577, 1530458490, -624014220, -1520230438, -1789634290, 1612620357, -2105414827, 1090236688}, TextUtils.getTrimmedLength("") + 21).intern(), (Throwable) e10);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3191(Object obj, int i10) throws JSONException {
        int i11 = f3136;
        f3135 = (i11 + 115) % 128;
        if (obj instanceof JSONObject) {
            f3135 = (i11 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            m3190((JSONObject) obj, i10);
        } else if (obj instanceof JSONArray) {
            m3189((JSONArray) obj, i10);
        } else if (obj instanceof String) {
            int i12 = i11 + 65;
            f3135 = i12 % 128;
            if (i12 % 2 != 0) {
                String str = (String) obj;
                if (str.length() <= i10) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i10));
                String strI = com.google.android.gms.internal.play_billing.a.i(m3178(new int[]{-1071674465, 310275926, -1727224816, 1312209778, -1801294351, -1058775554, -64801234, 335709623}, 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), sb2);
                f3135 = (f3136 + 97) % 128;
                return strI;
            }
            ((String) obj).length();
            throw null;
        }
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m3182(JSONObject jSONObject, String str, int i10) throws JSONException {
        f3136 = (f3135 + 77) % 128;
        String strM3191 = m3191(jSONObject.opt(str), i10);
        if (strM3191 != null) {
            if (strM3191.equals("")) {
                int i11 = f3135 + 115;
                f3136 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 37 / 0;
                }
                strM3191 = null;
            }
            jSONObject.put(str, strM3191);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m3180(JSONArray jSONArray, int i10, int i11) throws JSONException {
        String strM3191 = m3191(jSONArray.opt(i10), i11);
        if (strM3191 != null) {
            int i12 = f3136 + 73;
            f3135 = i12 % 128;
            int i13 = i12 % 2;
            jSONArray.put(i10, strM3191);
            if (i13 == 0) {
                int i14 = 25 / 0;
            }
            f3136 = (f3135 + 17) % 128;
        }
        f3136 = (f3135 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m3178(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f3134.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
