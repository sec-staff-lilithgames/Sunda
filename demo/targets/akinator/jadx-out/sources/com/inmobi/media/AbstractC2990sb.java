package com.inmobi.media;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.inmobi.commons.core.configs.SignalsConfig;
import hr.kNq.ikJMrW;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.sb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2990sb {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f33369a = uu.p1.mapOf(tu.e0.to("revenue", "getRevenue"), tu.e0.to("revenue_precision", "getRevenuePrecision"), tu.e0.to("network_name", "getNetworkName"), tu.e0.to("dsp_name", "getDspName"), tu.e0.to("max_ad_unit_id", gjnZrsdA.nIcJdgLI), tu.e0.to("network_placement", "getNetworkPlacement"));

    /* renamed from: b, reason: collision with root package name */
    public static final Map f33370b = uu.p1.mapOf(tu.e0.to(com.ironsource.mediationsdk.l.f37554a, "ban"), tu.e0.to("MREC", "ban"), tu.e0.to("LEADER", "ban"), tu.e0.to("INTER", "int"), tu.e0.to("REWARDED", "rew"), tu.e0.to(uQjDr.neXsXmVB, "rew"), tu.e0.to("NATIVE", "nat"));

    public static final JSONObject a(int i10, String str, JSONObject jSONObject) throws JSONException {
        int i11 = i10;
        String prefix = str;
        kotlin.jvm.internal.e0.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        if (i11 > 0) {
            String[] strArr = {"ban", "int", "rew", "nat"};
            int i12 = 0;
            while (i12 < 4) {
                String strL = j1.o2.l(prefix, strArr[i12]);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strL);
                if (jSONArrayOptJSONArray != null) {
                    kotlin.jvm.internal.e0.checkNotNull(jSONArrayOptJSONArray);
                    JSONArray jSONArray = new JSONArray();
                    String tsKey = b(prefix);
                    long jCurrentTimeMillis = System.currentTimeMillis() - (i11 * 1000);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
                        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(tsKey)) {
                            kotlin.jvm.internal.e0.checkNotNullParameter(jSONObjectOptJSONObject, "<this>");
                            kotlin.jvm.internal.e0.checkNotNullParameter(tsKey, "tsKey");
                            if (jSONObjectOptJSONObject.optLong(tsKey, 0L) >= jCurrentTimeMillis) {
                                jSONArray.put(jSONObjectOptJSONObject);
                            }
                        }
                    }
                    jSONObject.put(strL, jSONArray);
                }
                i12++;
                i11 = i10;
                prefix = str;
            }
        }
        return jSONObject;
    }

    public static final LinkedHashMap b(Map map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            SignalsConfig.PublisherConfig.KeyData keyData = (SignalsConfig.PublisherConfig.KeyData) ((Map.Entry) it.next()).getValue();
            linkedHashMap.put(keyData.getName(), keyData.getType());
        }
        return linkedHashMap;
    }

    public static final String b(String prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return kotlin.jvm.internal.e0.areEqual(prefix, "auto_") ? "auto_sts" : kotlin.jvm.internal.e0.areEqual(prefix, "obj_") ? "obj_ts" : "dir_ts";
    }

    public static final boolean a(Class cls) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cls, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter("com.applovin.mediation.MaxAd", "targetFqcn");
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls2 : interfaces) {
            if (kotlin.jvm.internal.e0.areEqual(cls2.getName(), "com.applovin.mediation.MaxAd")) {
                return true;
            }
            kotlin.jvm.internal.e0.checkNotNull(cls2);
            if (a(cls2)) {
                return true;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        return a(superclass);
    }

    public static final tu.d0 a(Map map, Map keys, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keys, "keys");
        JSONObject jSONObject = new JSONObject();
        Map mutableMap = uu.p1.toMutableMap(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : keys.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object obj = map.get(str);
            if (obj != null) {
                Object objA = a(obj, str2, i10, i11);
                if (objA != null) {
                    jSONObject.put(str, objA);
                    mutableMap.remove(str);
                } else {
                    jSONObject.put(str, a(str2));
                    arrayList.add(str);
                }
            }
        }
        return new tu.d0(jSONObject, uu.y0.toList(mutableMap.keySet()), arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(Object obj, String type, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                if (type.equals("stringf") && (obj instanceof String)) {
                    return (String) obj;
                }
                return null;
            case -1325958191:
                if (type.equals("double")) {
                    Number number = obj instanceof Number ? (Number) obj : null;
                    if (number != null) {
                        double dDoubleValue = number.doubleValue();
                        if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
                            int iCoerceIn = qv.v.coerceIn(i10, 0, 15);
                            if (iCoerceIn == 0) {
                                dDoubleValue = dDoubleValue > 0.0d ? Math.floor(dDoubleValue) : Math.ceil(dDoubleValue);
                            } else {
                                dDoubleValue = BigDecimal.valueOf(dDoubleValue).movePointRight(iCoerceIn).setScale(0, RoundingMode.DOWN).movePointLeft(iCoerceIn).doubleValue();
                            }
                        }
                        return Double.valueOf(dDoubleValue);
                    }
                }
                return null;
            case -891985903:
                if (type.equals("string")) {
                    String value = obj instanceof String ? (String) obj : null;
                    if (value != null) {
                        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                        if (value.length() <= i11) {
                            return value;
                        }
                        String strSubstring = value.substring(0, i11);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return strSubstring;
                    }
                }
                return null;
            case 104431:
                if (type.equals("int")) {
                    Number number2 = obj instanceof Number ? (Number) obj : null;
                    if (number2 != null) {
                        return Integer.valueOf(number2.intValue());
                    }
                }
                return null;
            case 3029738:
                if (type.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (type.equals("long")) {
                    Number number3 = obj instanceof Number ? (Number) obj : null;
                    if (number3 != null) {
                        return Long.valueOf(number3.longValue());
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static final JSONObject a(JSONObject jSONObject, String key, JSONObject newObj, int i10) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(newObj, "newObj");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(key);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        jSONArrayOptJSONArray.put(newObj);
        while (true) {
            kotlin.jvm.internal.e0.checkNotNullParameter(jSONArrayOptJSONArray, "<this>");
            if (jSONArrayOptJSONArray.length() > i10) {
                jSONArrayOptJSONArray.remove(0);
            } else {
                jSONObject.put(key, jSONArrayOptJSONArray);
                return jSONObject;
            }
        }
    }

    public static final void a(JSONObject jSONObject, JSONObject cachedJson, String formatKey, String prefix, Set allowedKeys) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(jSONObject, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(cachedJson, "cachedJson");
        kotlin.jvm.internal.e0.checkNotNullParameter(formatKey, "formatKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(allowedKeys, "allowedKeys");
        JSONArray jSONArrayOptJSONArray = cachedJson.optJSONArray(prefix + formatKey);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        Iterator it = allowedKeys.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            JSONArray jSONArray = new JSONArray();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    Object objOpt = jSONObjectOptJSONObject.opt(str);
                    if (objOpt == null) {
                        objOpt = com.ironsource.Y1.f35726f;
                    } else {
                        kotlin.jvm.internal.e0.checkNotNull(objOpt);
                    }
                    jSONArray.put(objOpt);
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            } else {
                kotlin.jvm.internal.e0.checkNotNull(jSONArrayOptJSONArray2);
            }
            jSONObject.put(str, jSONArrayOptJSONArray2.put(jSONArray));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[PHI: r18
      0x0115: PHI (r18v9 org.json.JSONArray) = (r18v7 org.json.JSONArray), (r18v10 org.json.JSONArray) binds: [B:37:0x0112, B:30:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a A[PHI: r18
      0x011a: PHI (r18v5 org.json.JSONArray) = 
      (r18v4 org.json.JSONArray)
      (r18v7 org.json.JSONArray)
      (r18v8 org.json.JSONArray)
      (r18v10 org.json.JSONArray)
      (r18v11 org.json.JSONArray)
      (r18v12 org.json.JSONArray)
     binds: [B:16:0x009c, B:37:0x0112, B:33:0x00fa, B:30:0x00ef, B:26:0x00d7, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map a(java.util.Map r17, org.json.JSONObject r18, java.lang.String r19, java.lang.String r20, java.util.Map r21) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2990sb.a(java.util.Map, org.json.JSONObject, java.lang.String, java.lang.String, java.util.Map):java.util.Map");
    }

    public static final Object a(Object obj, String type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                if (!type.equals("stringf")) {
                    return null;
                }
                break;
            case -1325958191:
                if (!type.equals("double")) {
                    return null;
                }
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Integer) {
                    return Double.valueOf(((Number) obj).intValue());
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Number) obj).floatValue());
                }
                return null;
            case -891985903:
                if (!type.equals("string")) {
                    return null;
                }
                break;
            case 104431:
                if (type.equals("int") && (obj instanceof Integer)) {
                    return (Integer) obj;
                }
                return null;
            case 3029738:
                if (type.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (type.equals("long") && (obj instanceof Long)) {
                    return (Long) obj;
                }
                return null;
            default:
                return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(String type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1881759115:
                type.equals("stringf");
                return com.ironsource.Y1.f35726f;
            case -1325958191:
                if (type.equals("double")) {
                    return Double.valueOf(Double.parseDouble(com.ironsource.Y1.f35726f));
                }
                return com.ironsource.Y1.f35726f;
            case -891985903:
                type.equals("string");
                return com.ironsource.Y1.f35726f;
            case 104431:
                if (type.equals("int")) {
                    return Integer.valueOf(Integer.parseInt(com.ironsource.Y1.f35726f));
                }
                return com.ironsource.Y1.f35726f;
            case 3029738:
                type.equals(ikJMrW.uuXNXkWD);
                return com.ironsource.Y1.f35726f;
            case 3327612:
                if (type.equals("long")) {
                    return Long.valueOf(Long.parseLong(com.ironsource.Y1.f35726f));
                }
                return com.ironsource.Y1.f35726f;
            default:
                return com.ironsource.Y1.f35726f;
        }
    }

    public static final JSONObject a(Map map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof String) {
                        jSONArray.put(obj);
                    } else if (obj instanceof Integer) {
                        jSONArray.put(((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        jSONArray.put(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        jSONArray.put(((Number) obj).doubleValue());
                    } else if (obj instanceof Map) {
                        kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        jSONArray.put(a((Map) obj));
                    }
                }
                jSONObject.put(str, jSONArray);
            }
        }
        return jSONObject;
    }

    public static final void a(ExecutorService executorService, kv.a action, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(executorService, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        executorService.execute(new zk.n(28, action, lVar));
    }

    public static final void a(kv.a action, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "$action");
        try {
            action.invoke();
        } catch (Error e10) {
            if (lVar != null) {
                lVar.invoke(e10);
            }
        } catch (Exception e11) {
            if (lVar != null) {
                lVar.invoke(e11);
            }
        }
    }
}
