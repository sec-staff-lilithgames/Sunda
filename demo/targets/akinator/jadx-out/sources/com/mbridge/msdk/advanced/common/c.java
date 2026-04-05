package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f39432a = new HashMap();

    public static void a(String str, boolean z10) {
        f39432a.put(str, Boolean.valueOf(z10));
    }

    public static void b(String str) {
        f39432a.remove(str);
    }

    public static boolean a(String str) {
        if (f39432a.containsKey(str)) {
            return f39432a.get(str).booleanValue();
        }
        return false;
    }
}
