package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class df extends da {
    /* renamed from: ﺙ, reason: contains not printable characters */
    public static String m2207(List<Object> list) {
        return ka.m3159((String) da.m2180(list, 0, String.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m2208(List<Object> list) {
        return hu.m2670().m2672().m2721(da.m2180(list, 0, Object.class), (List) da.m2180(list, 1, List.class), ((Integer) da.m2180(list, 2, Integer.class)).intValue());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static int m2209(List<Object> list) {
        return ka.m3158((String) da.m2180(list, 0, String.class), (String) da.m2180(list, 1, String.class));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m2210(List<Object> list) {
        String str = (String) da.m2180(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) da.m2180(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? ka.m3160(str, (String) da.m2180(list, 1, String.class), zBooleanValue) : ka.m3167(str, new JSONArray((Collection) da.m2180(list, 1, List.class)), zBooleanValue);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2211(List<Object> list) {
        return ka.m3168((String) da.m2180(list, 0, String.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List<String> m2212(List<Object> list) {
        String str = (String) da.m2180(list, 0, String.class);
        return list.get(1) instanceof String ? ka.m3163(str, (String) da.m2180(list, 1, String.class)) : ka.m3169(str, new JSONArray((Collection) da.m2180(list, 1, List.class)));
    }
}
