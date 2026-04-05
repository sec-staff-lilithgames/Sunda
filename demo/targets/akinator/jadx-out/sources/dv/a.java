package dv;

import java.lang.reflect.Method;
import kotlin.jvm.internal.e0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f52902a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f52903b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        e0.checkNotNull(methods);
        int length = methods.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            method = null;
            if (i11 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i11];
            if (e0.areEqual(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                e0.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                if (e0.areEqual(k0.singleOrNull(parameterTypes), Throwable.class)) {
                    break;
                }
            }
            i11++;
        }
        f52902a = method2;
        int length2 = methods.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            Method method3 = methods[i10];
            if (e0.areEqual(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i10++;
        }
        f52903b = method;
    }
}
