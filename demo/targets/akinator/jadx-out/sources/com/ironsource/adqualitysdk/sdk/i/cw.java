package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.ht;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cw extends da {
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static ht.e m2120() {
        return new ht.e();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List<Method> m2121(List<Object> list) {
        ht htVar = (ht) da.m2180(list, 1, ht.class);
        return list.get(0) instanceof Class ? hr.m2630((Class) da.m2180(list, 0, Class.class), htVar) : hr.m2630(da.m2180(list, 0, Object.class).getClass(), htVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m2122(List<Object> list) {
        ht htVar = (ht) da.m2180(list, 1, ht.class);
        return list.get(0) instanceof Class ? hr.m2631((Class) da.m2180(list, 0, Class.class), htVar) : hr.m2631(da.m2180(list, 0, Object.class).getClass(), htVar);
    }
}
