package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class pdm {

    /* renamed from: jd, reason: collision with root package name */
    private static Map<String, Method> f19005jd = new HashMap();
    public static final Class<?>[] jpo;
    private static final HashMap<Class<?>, Class<?>> wqx;

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        wqx = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        jpo = new Class[0];
    }

    public static int jpo(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int jpo(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
