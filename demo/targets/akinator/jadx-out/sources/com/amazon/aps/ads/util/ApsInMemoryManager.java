package com.amazon.aps.ads.util;

import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsInMemoryManager {
    public static final Companion Companion = new Companion(null);
    public static final ApsInMemoryManager INSTANCE = new ApsInMemoryManager();
    private final HashMap<String, Object> map = new HashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    private ApsInMemoryManager() {
    }

    public final synchronized boolean contains(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.map.containsKey(key);
    }

    public final synchronized Object get(String key, Class<?> type) {
        Object obj;
        try {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(type, "type");
            if (!this.map.containsKey(key) || (obj = this.map.get(key)) == null) {
                return null;
            }
            if (!(obj instanceof Long) || !e0.areEqual(Long.TYPE, type)) {
                if ((!(obj instanceof Float) || !e0.areEqual(Float.TYPE, type)) && ((!(obj instanceof Boolean) || !e0.areEqual(Boolean.TYPE, type)) && ((!(obj instanceof Integer) || !e0.areEqual(Integer.TYPE, type)) && ((!(obj instanceof String) || !e0.areEqual(String.class, type)) && !e0.areEqual(obj.getClass(), type))))) {
                    throw new IllegalArgumentException("Default and storage type are not same");
                }
            }
            return obj;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final <T> Object getOrDefault(String key, Class<T> type, T t10) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(type, "type");
        Object obj = get(key, type);
        return obj == null ? t10 : obj;
    }

    public final synchronized <T> T getPrefWithDefault(String key, Class<T> clazz) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(clazz, "clazz");
        if (this.map.containsKey(key)) {
            return (T) get(key, clazz);
        }
        T t10 = (T) null;
        if (!clazz.isAssignableFrom(String.class) && !clazz.isAssignableFrom(Set.class) && !clazz.isAssignableFrom(g1.class) && !e0.areEqual(clazz, String.class)) {
            if (clazz.isAssignableFrom(Boolean.TYPE) || clazz.isAssignableFrom(m.class) || e0.areEqual(clazz, Boolean.class)) {
                t10 = (T) Boolean.FALSE;
            } else if (clazz.isAssignableFrom(Long.TYPE) || clazz.isAssignableFrom(g0.class) || e0.areEqual(clazz, Long.class)) {
                t10 = (T) 0L;
            } else if (clazz.isAssignableFrom(Integer.TYPE) || clazz.isAssignableFrom(c0.class) || e0.areEqual(clazz, Integer.class)) {
                t10 = (T) 0;
            } else if (clazz.isAssignableFrom(Float.TYPE) || clazz.isAssignableFrom(w.class) || e0.areEqual(clazz, Float.class)) {
                t10 = (T) Float.valueOf(0.0f);
            }
        }
        return t10;
    }

    public final synchronized void putPref(String key, Object obj) {
        e0.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.map.put(key, obj);
        }
    }

    public final synchronized void removePref(String key) {
        e0.checkNotNullParameter(key, "key");
        if (this.map.containsKey(key)) {
            this.map.remove(key);
        }
    }

    public final synchronized void reset() {
        this.map.clear();
    }
}
