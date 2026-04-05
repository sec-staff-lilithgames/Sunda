package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.impl.sdk.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CollectionUtils {
    public static <T> boolean addObjectIfExists(T t10, List<T> list) {
        if (t10 != null) {
            return list.add(t10);
        }
        return false;
    }

    public static <T> boolean addUniqueObjectIfExists(T t10, List<T> list) {
        if (t10 == null || list.contains(t10)) {
            return false;
        }
        return list.add(t10);
    }

    public static <T> boolean atLeastOneValueMatch(Collection<T> collection, Collection<T> collection2) {
        Collection<T> collection3 = collection.size() <= collection2.size() ? collection : collection2;
        if (collection.size() <= collection2.size()) {
            collection = collection2;
        }
        HashSet hashSet = new HashSet(collection3);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> explode(String str) {
        return explode(str, ",\\s*");
    }

    public static boolean getBoolean(Map<String, Object> map, String str) {
        return getBoolean(map, str, false);
    }

    public static <T> Set<T> getDifferenceSet(Set<T> set, Set<T> set2) {
        if (set == null) {
            return null;
        }
        if (set2 == null) {
            return new HashSet(set);
        }
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public static int getSizeSafely(Collection<?> collection) {
        if (isEmpty(collection)) {
            return 0;
        }
        return collection.size();
    }

    public static HashMap<String, String> hashMap(String str, String str2) {
        return (HashMap) map(str, str2);
    }

    public static String implode(Collection<String> collection, int i10) {
        return implode(collection, ",", i10);
    }

    public static <K, V> boolean isEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <K, V> Map<K, V> map(Map<K, V> map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public static void putBooleanIfValid(String str, Boolean bool, Map map) {
        if (!StringUtils.isValidString(str) || bool == null) {
            return;
        }
        map.put(str, bool);
    }

    public static void putDoubleIfValid(String str, Double d10, Map map) {
        if (!StringUtils.isValidString(str) || d10 == null) {
            return;
        }
        map.put(str, d10);
    }

    public static void putFloatIfValid(String str, Float f10, Map map) {
        if (!StringUtils.isValidString(str) || f10 == null) {
            return;
        }
        map.put(str, f10);
    }

    public static void putIntegerIfValid(String str, Integer num, Map map) {
        if (!StringUtils.isValidString(str) || num == null) {
            return;
        }
        map.put(str, num);
    }

    public static void putJsonArrayIfValid(String str, JSONArray jSONArray, Map map) {
        if (!StringUtils.isValidString(str) || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        map.put(str, jSONArray);
    }

    public static void putLongIfValid(String str, Long l9, Map map) {
        if (!StringUtils.isValidString(str) || l9 == null) {
            return;
        }
        map.put(str, l9);
    }

    public static void putObjectToStringIfValid(String str, Object obj, Map map) {
        if (obj == null) {
            return;
        }
        putStringIfValid(str, obj.toString(), map);
    }

    public static void putStringIfValid(String str, String str2, Map map) {
        if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
            map.put(str, str2);
        }
    }

    public static List<String> removeTrimmedEmptyStrings(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strTrim = it.next().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                arrayList.add(strTrim);
            }
        }
        return arrayList;
    }

    public static <T> List<T> synchronizedList() {
        return synchronizedList(-1);
    }

    public static Bundle toBundle(Map<String, ?> map) {
        if (map == null || map.size() == 0) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                bundle.putBundle(str, toBundle((Map) obj));
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            }
        }
        return bundle;
    }

    public static JSONArray toJSONArray(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static JSONObject toJson(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static String toJsonString(Map<String, String> map, String str) {
        try {
            return toJson(map).toString();
        } catch (JSONException e10) {
            o.c("CollectionUtils", "Failed to convert map '" + map + "' to JSON string.", e10);
            return str;
        }
    }

    public static List<String> explode(String str, String str2) {
        return TextUtils.isEmpty(str) ? Collections.EMPTY_LIST : Arrays.asList(str.split(str2));
    }

    public static boolean getBoolean(Map<String, Object> map, String str, boolean z10) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue() >= 1;
            }
        }
        return z10;
    }

    public static String implode(Collection<String> collection, String str, int i10) {
        if (str == null) {
            throw new IllegalArgumentException("No glue specified");
        }
        if (collection == null || collection.size() < 1) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (String str2 : collection) {
            if (i11 >= i10) {
                break;
            }
            i11++;
            sb2.append(str2);
            sb2.append(str);
        }
        if (sb2.length() > str.length()) {
            sb2.setLength(sb2.length() - str.length());
        }
        return sb2.toString();
    }

    public static <E> boolean isEmpty(Collection<E> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> List<T> synchronizedList(int i10) {
        return i10 >= 0 ? Collections.synchronizedList(new ArrayList(i10)) : Collections.synchronizedList(new ArrayList());
    }

    public static <K, V> Map<K, V> map(K k10, V v10) {
        HashMap map = new HashMap(1);
        map.put(k10, v10);
        return map;
    }
}
