package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dy {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, String> f2098 = new HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m2458(String str) {
        String str2 = f2098.get(str);
        if (str2 != null) {
            return str2;
        }
        f2098.put(str, str);
        return str;
    }
}
