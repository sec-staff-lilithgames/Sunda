package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f6600c = new i();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6601a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6602b = new HashMap();

    public static void b(HashMap map, h hVar, i0 i0Var, Class cls) {
        i0 i0Var2 = (i0) map.get(hVar);
        if (i0Var2 == null || i0Var == i0Var2) {
            if (i0Var2 == null) {
                map.put(hVar, i0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + hVar.f6588b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + i0Var2 + ", new value " + i0Var);
    }

    public final g a(Class cls, Method[] methodArr) throws SecurityException {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f6601a;
        if (superclass != null) {
            g gVarA = (g) map2.get(superclass);
            if (gVarA == null) {
                gVarA = a(superclass, null);
            }
            map.putAll(gVarA.f6577b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            g gVarA2 = (g) map2.get(cls2);
            if (gVarA2 == null) {
                gVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : gVarA2.f6577b.entrySet()) {
                b(map, (h) entry.getKey(), (i0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            v1 v1Var = (v1) method.getAnnotation(v1.class);
            if (v1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!b1.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                i0 i0VarValue = v1Var.value();
                if (parameterTypes.length > 1) {
                    if (!i0.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (i0VarValue != i0.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new h(method, i10), i0VarValue, cls);
                z10 = true;
            }
        }
        g gVar = new g(map);
        map2.put(cls, gVar);
        this.f6602b.put(cls, Boolean.valueOf(z10));
        return gVar;
    }
}
