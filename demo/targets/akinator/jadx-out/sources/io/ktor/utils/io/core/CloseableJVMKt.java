package io.ktor.utils.io.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CloseableJVMKt {
    private static final o AddSuppressedMethod$delegate = q.lazy(CloseableJVMKt$AddSuppressedMethod$2.INSTANCE);

    public static final void addSuppressedInternal(Throwable th2, Throwable other) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(th2, "<this>");
        e0.checkNotNullParameter(other, "other");
        Method addSuppressedMethod = getAddSuppressedMethod();
        if (addSuppressedMethod != null) {
            addSuppressedMethod.invoke(th2, other);
        }
    }

    private static final Method getAddSuppressedMethod() {
        return (Method) AddSuppressedMethod$delegate.getValue();
    }
}
