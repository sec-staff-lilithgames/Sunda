package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.e5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2748e5 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", C2942pd.a());
            Boolean boolC = Se.f32278a.c();
            if (boolC != null) {
                map.put("u-id-adt", boolC.booleanValue() ? "1" : "0");
            }
            map.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C3009td.f33390a.getClass();
            HashMap map2 = new HashMap();
            if (C3009td.f33394e && (str = C3009td.f33393d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
            return map;
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("e5", "TAG");
            return map;
        }
    }
}
