package com.inmobi.media;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I0 {
    public static final String a(String str, Map map) {
        if (map == null || str == null) {
            return str;
        }
        String strReplace$default = str;
        for (Object obj : map.keySet()) {
            strReplace$default = strReplace$default != null ? sv.k0.replace$default(strReplace$default, String.valueOf(obj), String.valueOf(map.get(obj)), false, 4, (Object) null) : null;
        }
        return strReplace$default;
    }
}
