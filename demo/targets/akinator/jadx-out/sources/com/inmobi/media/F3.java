package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class F3 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f31768a = new HashMap();

    public static Config a(String str, String type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        String strB = b(str, type);
        HashMap map = f31768a;
        Object objA = map.get(strB);
        if (objA == null) {
            Config.Companion.getClass();
            objA = I2.a(type, str);
            map.put(strB, objA);
        }
        return (Config) objA;
    }

    public static String b(String str, String type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        return str + '-' + type;
    }
}
