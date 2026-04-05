package io.ktor.util;

import jv.a;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackFramesJvmKt {
    public static final StackTraceElement createStackTraceElement(KClass<?> kClass, String methodName, String fileName, int i10) {
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(methodName, "methodName");
        e0.checkNotNullParameter(fileName, "fileName");
        return new StackTraceElement(a.getJavaClass((KClass) kClass).getName(), methodName, fileName, i10);
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }
}
