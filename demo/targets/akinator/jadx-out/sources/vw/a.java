package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final yw.j f89664a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f89665b;

    public a(t0 t0Var, v4 v4Var) {
        this.f89665b = t0Var.isRequired();
        this.f89664a = v4Var.getFormat();
    }

    public static boolean b(Class cls) {
        if (Number.class.isAssignableFrom(cls) || cls == Boolean.class || cls == Character.class) {
            return true;
        }
        return cls.isPrimitive();
    }

    public final Annotation a(ClassLoader classLoader, Class cls, boolean z10) {
        return (Annotation) Proxy.newProxyInstance(classLoader, new Class[]{cls}, new b(cls, this.f89665b, z10));
    }

    public Annotation getInstance(Class cls, Class[] clsArr) throws Exception {
        boolean zB;
        ClassLoader classLoader = a.class.getClassLoader();
        boolean zIsAssignableFrom = Map.class.isAssignableFrom(cls);
        yw.u0 u0Var = yw.u0.f96764c;
        yw.j jVar = this.f89664a;
        if (zIsAssignableFrom) {
            if (clsArr == null || clsArr.length <= 0) {
                zB = false;
            } else {
                Class superclass = clsArr[0].getSuperclass();
                Class cls2 = clsArr[0];
                zB = (superclass == null || !(superclass.isEnum() || cls2.isEnum())) ? b(cls2) : true;
            }
            if (zB) {
                yw.u0 verbosity = jVar.getVerbosity();
                if (verbosity != null && verbosity == u0Var) {
                    return a(classLoader, uw.h.class, true);
                }
            }
            return a(classLoader, uw.h.class, false);
        }
        if (Collection.class.isAssignableFrom(cls)) {
            return a(classLoader, uw.f.class, false);
        }
        ClassLoader classLoader2 = a.class.getClassLoader();
        Class<?> componentType = cls.getComponentType();
        if (cls.isArray()) {
            return b(componentType) ? a(classLoader2, uw.d.class, false) : a(classLoader2, uw.e.class, false);
        }
        if (b(cls)) {
            yw.u0 verbosity2 = jVar.getVerbosity();
            if (verbosity2 != null && verbosity2 == u0Var) {
                return a(classLoader2, uw.a.class, false);
            }
        }
        return a(classLoader2, uw.d.class, false);
    }
}
