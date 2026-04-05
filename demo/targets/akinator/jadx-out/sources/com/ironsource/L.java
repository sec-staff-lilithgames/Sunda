package com.ironsource;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final L f34778a = new L();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, Long> f34779b = new HashMap<>();

    private L() {
    }

    public final HashMap<String, Long> a() {
        return f34779b;
    }

    public final long b(String instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        Long l9 = f34779b.get(instance);
        if (l9 != null) {
            return System.currentTimeMillis() - l9.longValue();
        }
        return -1L;
    }

    public final long c(String instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        Long l9 = f34779b.get(instance);
        if (l9 != null) {
            return l9.longValue();
        }
        return -1L;
    }

    public final boolean a(String instance, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap<String, Long> map = f34779b;
        if (map.containsKey(instance)) {
            return false;
        }
        map.put(instance, Long.valueOf(j10));
        return true;
    }

    public final boolean a(String instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        HashMap<String, Long> map = f34779b;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }
}
