package retrofit2;

import j1.u;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class DefaultMethodSupport {
    private static Constructor<MethodHandles.Lookup> lookupConstructor;

    private DefaultMethodSupport() {
    }

    public static Object invoke(Method method, Class<?> cls, Object obj, Object[] objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> declaredConstructor = lookupConstructor;
        if (declaredConstructor == null) {
            declaredConstructor = u.j().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            lookupConstructor = declaredConstructor;
        }
        return u.g(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
