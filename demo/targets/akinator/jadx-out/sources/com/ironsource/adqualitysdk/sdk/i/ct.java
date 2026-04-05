package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hm;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ct extends da {
    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Field m2104(List<Object> list) {
        return hu.m2670().m2673().m2613((Class) da.m2180(list, 0, Class.class), (hm) da.m2180(list, 1, hm.class));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field m2105(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM2180 = da.m2180(list, 0, (Class<Object>) Object.class);
            return hu.m2670().m2673().m2614(objM2180.getClass(), (Class) da.m2180(list, 1, Class.class));
        }
        Class cls = (Class) da.m2180(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return hu.m2670().m2673().m2614(cls, (Class) da.m2180(list, 1, Class.class));
        }
        return hu.m2670().m2673().m2613(cls, (hm) da.m2180(list, 1, hm.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<Field> m2107(List<Object> list) throws SecurityException {
        if (!(list.get(0) instanceof Class)) {
            Object objM2180 = da.m2180(list, 0, (Class<Object>) Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) da.m2180(list, 1, Boolean.class)).booleanValue() : false;
            hu.m2670().m2673();
            Field[] fieldArrM2612 = hn.m2612(objM2180.getClass(), zBooleanValue, -1, null);
            if (fieldArrM2612 != null) {
                return Arrays.asList(fieldArrM2612);
            }
        } else if (list.size() > 1) {
            return hu.m2670().m2673().m2615((Class) da.m2180(list, 0, Class.class), (hm) da.m2180(list, 1, hm.class));
        }
        return new ArrayList();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m2108(List<Object> list) {
        return hu.m2670().m2673().m2616((Class) da.m2180(list, 0, Class.class), (String) da.m2180(list, 1, String.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static hm.e m2106() {
        hu.m2670().m2673();
        return hn.m2609();
    }
}
