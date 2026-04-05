package com.mbridge.msdk.preload;

import io.ktor.http.LinkHeader;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {
    public void a(Map<String, Object> map) {
    }

    public void a(Map<String, Object> map, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            com.mbridge.msdk.mbnative.service.a.class.getMethod(LinkHeader.Rel.PreLoad, Map.class, Integer.TYPE).invoke(com.mbridge.msdk.mbnative.service.a.class.newInstance(), map, Integer.valueOf(i10));
        } catch (Exception unused) {
        }
    }

    public void b(Map<String, Object> map) {
    }
}
