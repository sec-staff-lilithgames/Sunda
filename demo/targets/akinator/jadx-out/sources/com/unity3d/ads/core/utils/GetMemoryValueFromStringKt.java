package com.unity3d.ads.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sv.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(String str) {
        Long longOrNull;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup == null || (longOrNull = j0.toLongOrNull(strGroup)) == null) {
            return -1L;
        }
        return longOrNull.longValue();
    }
}
