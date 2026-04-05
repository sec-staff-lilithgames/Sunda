package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.applovin.impl.sdk.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class JsonUtils {
    public static final String EMPTY_JSON = "{}";

    private static List a(JSONArray jSONArray, List list) {
        if (jSONArray == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public static boolean containsCaseInsensitiveString(String str, JSONArray jSONArray) throws JSONException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object obj = jSONArray.get(i10);
                if ((obj instanceof String) && ((String) obj).equalsIgnoreCase(str)) {
                    return true;
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    public static boolean containsJSONObjectContainingInt(JSONArray jSONArray, int i10, String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt(str) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject deepCopy(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    jSONObject2.put(next, deepCopy((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONObject2.put(next, deepCopy((JSONArray) obj));
                } else {
                    jSONObject2.put(next, obj);
                }
            } catch (JSONException unused) {
                o.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject deep copy");
            }
        }
        return jSONObject2;
    }

    public static JSONObject deserialize(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable th2) {
            o.b("JsonUtils", "Failed to deserialize into JSON: " + str, th2);
            return null;
        }
    }

    public static Boolean getBoolean(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            return Boolean.valueOf(getInt(jSONObject, str, (bool == null || !bool.booleanValue()) ? 0 : 1) > 0);
        }
    }

    public static double getDouble(JSONObject jSONObject, String str, double d10) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getDouble(str);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve double property for key = " + str, e10);
            }
        }
        return d10;
    }

    public static float getFloat(JSONObject jSONObject, String str, float f10) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                double d10 = jSONObject.getDouble(str);
                if (-3.4028234663852886E38d < d10 && d10 < 3.4028234663852886E38d) {
                    return (float) d10;
                }
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve float property for key = " + str, e10);
            }
        }
        return f10;
    }

    public static int getInt(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve int property for key = " + str, e10);
            }
        }
        return i10;
    }

    public static Integer getInteger(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve int property for key = " + str, e10);
            }
        }
        return num;
    }

    public static List<Integer> getIntegerList(JSONObject jSONObject, String str, List<Integer> list) {
        JSONArray jSONArray = getJSONArray(jSONObject, str, null);
        return jSONArray != null ? toIntegerList(jSONArray) : list;
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getJSONArray(str);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve JSON array for key = " + str, e10);
            }
        }
        return jSONArray;
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str) {
        return getJSONObject(jSONObject, str, (JSONObject) null);
    }

    public static List getList(JSONObject jSONObject, String str, List list) {
        try {
            JSONArray jSONArray = getJSONArray(jSONObject, str, null);
            if (jSONArray != null) {
                return toList(jSONArray);
            }
        } catch (JSONException unused) {
        }
        return list;
    }

    public static long getLong(JSONObject jSONObject, String str, long j10) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve long property for key = " + str, e10);
            }
        }
        return j10;
    }

    public static Object getObjectAtIndex(JSONArray jSONArray, int i10, Object obj) {
        if (jSONArray != null && jSONArray.length() > i10) {
            try {
                return jSONArray.get(i10);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve object at index " + i10 + " for JSON array", e10);
            }
        }
        return obj;
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str)) {
                    return jSONObject.getString(str);
                }
            } catch (Exception e10) {
                o.b("JsonUtils", "Failed to retrieve string property for key = " + str, e10);
            }
        }
        return str2;
    }

    public static List<String> getStringList(JSONObject jSONObject, String str, List<String> list) {
        JSONArray jSONArray = getJSONArray(jSONObject, str, null);
        return jSONArray != null ? toStringList(jSONArray) : list;
    }

    public static boolean isValid(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static JSONObject jsonObjectFromJsonString(String str, JSONObject jSONObject) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            o.b("JsonUtils", "Failed to convert JSON string '" + str + "' to JSONObject", e10);
            return jSONObject;
        }
    }

    public static String maybeConvertToIndentedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString(4);
        } catch (JSONException unused) {
            return jSONObject.toString();
        }
    }

    public static <T> List<T> optList(JSONArray jSONArray, List<T> list) {
        try {
            return a(jSONArray, list);
        } catch (JSONException unused) {
            return list;
        }
    }

    public static void putAll(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object object = getObject(jSONObject2, next, null);
            if (object != null) {
                putObject(jSONObject, next, object);
            }
        }
    }

    public static void putBoolean(JSONObject jSONObject, String str, boolean z10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, z10);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put boolean property for key = " + str, e10);
            }
        }
    }

    public static void putBooleanIfValid(JSONObject jSONObject, String str, Boolean bool) {
        if (!StringUtils.isValidString(str) || bool == null) {
            return;
        }
        putBoolean(jSONObject, str, bool.booleanValue());
    }

    public static void putDouble(JSONObject jSONObject, String str, double d10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, d10);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put double property for key = " + str, e10);
            }
        }
    }

    public static void putInt(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i10);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put int property for key = " + str, e10);
            }
        }
    }

    public static void putJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONObject2);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put JSON property for key = " + str, e10);
            }
        }
    }

    public static void putJSONObjectIfValid(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 == null || jSONObject2.length() == 0) {
            return;
        }
        putJSONObject(jSONObject, str, jSONObject2);
    }

    public static void putJsonArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONArray);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put JSONArray property for key = " + str, e10);
            }
        }
    }

    public static void putJsonArrayIfValid(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        putJsonArray(jSONObject, str, jSONArray);
    }

    public static void putLong(JSONObject jSONObject, String str, long j10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, j10);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put long property for key = " + str, e10);
            }
        }
    }

    public static void putObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put Object property for key = " + str, e10);
            }
        }
    }

    public static void putString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to put String property for key = " + str, e10);
            }
        }
    }

    public static void putStringIfValid(JSONArray jSONArray, String str) {
        if (StringUtils.isValidString(str)) {
            jSONArray.put(str);
        }
    }

    public static void removeObjectsForKeys(JSONObject jSONObject, String[] strArr) {
        for (String str : strArr) {
            jSONObject.remove(str);
        }
    }

    public static JSONObject shallowCopy(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject2.put(next, jSONObject.get(next));
            } catch (JSONException unused) {
                o.l("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject copy");
            }
        }
        return jSONObject2;
    }

    public static Bundle toBundle(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if (obj instanceof String) {
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject = null;
        }
        return toBundle(jSONObject);
    }

    public static List<Integer> toIntegerList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add((Integer) jSONArray.get(i10));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static JSONArray toJsonArray(String str, JSONArray jSONArray) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return jSONArray;
        }
    }

    public static <T> List<T> toList(JSONArray jSONArray) throws JSONException {
        return a(jSONArray, new ArrayList());
    }

    public static List<String> toStringList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add((String) jSONArray.get(i10));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static Map<String, String> toStringMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)).toString());
        }
        return map;
    }

    public static Map<String, Object> toStringObjectMap(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }

    public static Map<String, String> tryToStringMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object objA = a(jSONObject.get(next));
                map.put(next, objA != null ? objA.toString() : null);
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static boolean valueExists(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getJSONObject(str);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve JSON property for key = " + str, e10);
            }
        }
        return jSONObject2;
    }

    public static Object getObject(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                Object obj2 = jSONObject.get(str);
                if (obj2 != null) {
                    return obj2;
                }
            } catch (JSONException e10) {
                o.b(OIPXcgrVyyxoLF.aCfcjcT, "Failed to retrieve Object for key = " + str, e10);
            }
        }
        return obj;
    }

    public static boolean valueExists(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && obj != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (obj.equals(getObjectAtIndex(jSONArray, i10, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String maybeConvertToIndentedString(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new JSONObject(str).toString(i10);
        } catch (JSONException unused) {
            return str;
        }
    }

    public static void putStringIfValid(JSONObject jSONObject, String str, String str2) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            putString(jSONObject, str, str2);
        }
    }

    private static Object a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return toStringObjectMap((JSONObject) obj);
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj;
    }

    public static Double getDouble(JSONObject jSONObject, String str, Double d10) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Double.valueOf(jSONObject.getDouble(str));
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve Double property for key = " + str, e10);
            }
        }
        return d10;
    }

    public static Float getFloat(JSONObject jSONObject, String str, Float f10) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                double d10 = jSONObject.getDouble(str);
                if (-3.4028234663852886E38d < d10 && d10 < 3.4028234663852886E38d) {
                    return Float.valueOf((float) d10);
                }
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve float property for key = " + str, e10);
            }
        }
        return f10;
    }

    public static JSONArray getJSONArray(Object obj) {
        if (obj == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    public static JSONObject getJSONObject(JSONArray jSONArray, int i10, JSONObject jSONObject) {
        if (jSONArray != null && i10 < jSONArray.length()) {
            try {
                return jSONArray.getJSONObject(i10);
            } catch (JSONException e10) {
                o.b("JsonUtils", "Failed to retrieve JSON object from array for index = " + i10, e10);
            }
        }
        return jSONObject;
    }

    public static void putAll(JSONObject jSONObject, Map<String, ?> map) {
        if (jSONObject == null || map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                putObject(jSONObject, key, value);
            }
        }
    }

    public static Map<String, Object> toStringObjectMap(String str) {
        try {
            return toStringObjectMap(new JSONObject(str));
        } catch (JSONException e10) {
            o.b("JsonUtils", "Failed to convert json string '" + str + "' to map", e10);
            return new HashMap();
        }
    }

    public static JSONArray shallowCopy(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONArray2.put(jSONArray.opt(i10));
        }
        return jSONArray2;
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject.isNull(next)) {
                    bundle.putString(next, null);
                } else {
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt instanceof JSONObject) {
                        bundle.putBundle(next, toBundle((JSONObject) objOpt));
                    } else if (objOpt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (jSONArray.length() == 0) {
                            bundle.putStringArrayList(next, new ArrayList<>(0));
                        } else if (getObjectAtIndex(jSONArray, 0, null) instanceof String) {
                            ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                arrayList.add((String) getObjectAtIndex(jSONArray, i10, null));
                            }
                            bundle.putStringArrayList(next, arrayList);
                        } else {
                            bundle.putParcelableArrayList(next, toBundle(jSONArray));
                        }
                    } else if (objOpt instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                    } else if (objOpt instanceof String) {
                        bundle.putString(next, (String) objOpt);
                    } else if (objOpt instanceof Integer) {
                        bundle.putInt(next, ((Integer) objOpt).intValue());
                    } else if (objOpt instanceof Long) {
                        bundle.putLong(next, ((Long) objOpt).longValue());
                    } else if (objOpt instanceof Double) {
                        bundle.putDouble(next, ((Double) objOpt).doubleValue());
                    }
                }
            }
            return bundle;
        }
        return new Bundle();
    }

    public static JSONArray deepCopy(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object obj = jSONArray.get(i10);
                if (obj instanceof JSONObject) {
                    jSONArray2.put(i10, deepCopy((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONArray2.put(i10, deepCopy((JSONArray) obj));
                } else {
                    jSONArray2.put(i10, obj);
                }
            } catch (JSONException unused) {
                o.l("JsonUtils", "Failed to copy over item at index " + i10 + " to JSONArray deep copy");
            }
        }
        return jSONArray2;
    }

    public static ArrayList<Bundle> toBundle(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList<Bundle> arrayList = new ArrayList<>(jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(toBundle(jSONArray.optJSONObject(i10)));
            }
            return arrayList;
        }
        return new ArrayList<>();
    }
}
