package com.facebook.ads.redexgen.core;

import java.lang.reflect.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.Qw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1500Qw {
    public static <T> T A00(T impl, Class<T> clazz) {
        ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(Proxy.newProxyInstance(classLoader, new Class[]{clazz}, new C1499Qv(impl, classLoader)));
    }
}
