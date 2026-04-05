package io.odeeo.internal.y1;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t<T> {
    public static <T> t<T> a(s sVar, Method method) {
        q qVarA = q.a(sVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (w.c(genericReturnType)) {
            throw w.a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return i.a(sVar, method, qVarA);
        }
        throw w.a(method, "Service methods cannot return void.", new Object[0]);
    }

    public abstract T a(Object[] objArr);
}
