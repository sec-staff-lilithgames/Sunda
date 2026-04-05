package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Method f23010a;

    /* renamed from: b, reason: collision with root package name */
    public final h f23011b = new h(this);

    public <T> T mock(Class<T> cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f23011b));
    }
}
