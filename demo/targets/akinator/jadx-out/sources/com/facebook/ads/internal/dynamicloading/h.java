package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23009a;

    public h(i iVar) {
        this.f23009a = iVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if ("toString".equals(method.getName())) {
            return null;
        }
        this.f23009a.f23010a = method;
        return null;
    }
}
