package com.fyber.inneractive.sdk.util;

import com.amazon.aps.shared.util.APSSharedUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i1 {
    public static String a(String str, int i10) {
        if (i10 <= 0 || str.length() <= i10) {
            return str;
        }
        return str.substring(0, i10 - 3) + APSSharedUtil.TRUNCATE_SEPARATOR;
    }
}
